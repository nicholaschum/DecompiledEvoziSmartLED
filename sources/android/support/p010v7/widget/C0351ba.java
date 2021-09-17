package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.support.p010v7.p011a.C0197k;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v7.widget.ba */
final class C0351ba {

    /* renamed from: a */
    private static final RectF f1683a = new RectF();

    /* renamed from: b */
    private static ConcurrentHashMap<String, Method> f1684b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private int f1685c = 0;

    /* renamed from: d */
    private boolean f1686d = false;

    /* renamed from: e */
    private float f1687e = -1.0f;

    /* renamed from: f */
    private float f1688f = -1.0f;

    /* renamed from: g */
    private float f1689g = -1.0f;

    /* renamed from: h */
    private int[] f1690h = new int[0];

    /* renamed from: i */
    private boolean f1691i = false;

    /* renamed from: j */
    private TextPaint f1692j;

    /* renamed from: k */
    private final TextView f1693k;

    /* renamed from: l */
    private final Context f1694l;

    C0351ba(TextView textView) {
        this.f1693k = textView;
        this.f1694l = this.f1693k.getContext();
    }

    /* renamed from: a */
    private int m1178a(RectF rectF) {
        int length = this.f1690h.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1185a(this.f1690h[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1690h[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private StaticLayout m1179a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        float floatValue;
        float floatValue2;
        boolean booleanValue;
        if (Build.VERSION.SDK_INT >= 16) {
            floatValue = this.f1693k.getLineSpacingMultiplier();
            floatValue2 = this.f1693k.getLineSpacingExtra();
            booleanValue = this.f1693k.getIncludeFontPadding();
        } else {
            floatValue = ((Float) m1181a((Object) this.f1693k, "getLineSpacingMultiplier", Float.valueOf(1.0f))).floatValue();
            floatValue2 = ((Float) m1181a((Object) this.f1693k, "getLineSpacingExtra", Float.valueOf(0.0f))).floatValue();
            booleanValue = ((Boolean) m1181a((Object) this.f1693k, "getIncludeFontPadding", Boolean.TRUE)).booleanValue();
        }
        return new StaticLayout(charSequence, this.f1692j, i, alignment, floatValue, floatValue2, booleanValue);
    }

    /* renamed from: a */
    private StaticLayout m1180a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m1181a((Object) this.f1693k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1692j, i).setAlignment(alignment).setLineSpacing(this.f1693k.getLineSpacingExtra(), this.f1693k.getLineSpacingMultiplier()).setIncludePad(this.f1693k.getIncludeFontPadding()).setBreakStrategy(this.f1693k.getBreakStrategy()).setHyphenationFrequency(this.f1693k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }

    /* renamed from: a */
    private static <T> T m1181a(Object obj, String str, T t) {
        try {
            return m1182a(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* renamed from: a */
    private static Method m1182a(String str) {
        try {
            Method method = f1684b.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1684b.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: a */
    private void m1183a(float f) {
        if (f != this.f1693k.getPaint().getTextSize()) {
            this.f1693k.getPaint().setTextSize(f);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.f1693k.isInLayout() : false;
            if (this.f1693k.getLayout() != null) {
                this.f1686d = false;
                try {
                    Method a = m1182a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f1693k, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f1693k.requestLayout();
                } else {
                    this.f1693k.forceLayout();
                }
                this.f1693k.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m1184a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1685c = 1;
            this.f1688f = f;
            this.f1689g = f2;
            this.f1687e = f3;
            this.f1691i = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private boolean m1185a(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1693k.getText();
        TransformationMethod transformationMethod = this.f1693k.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1693k)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.f1693k.getMaxLines() : -1;
        if (this.f1692j == null) {
            this.f1692j = new TextPaint();
        } else {
            this.f1692j.reset();
        }
        this.f1692j.set(this.f1693k.getPaint());
        this.f1692j.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) m1181a((Object) this.f1693k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        StaticLayout a = Build.VERSION.SDK_INT >= 23 ? m1180a(text, alignment, Math.round(rectF.right), maxLines) : m1179a(text, alignment, Math.round(rectF.right));
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: a */
    private static int[] m1186a(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: h */
    private boolean m1187h() {
        int length = this.f1690h.length;
        this.f1691i = length > 0;
        if (this.f1691i) {
            this.f1685c = 1;
            this.f1688f = (float) this.f1690h[0];
            this.f1689g = (float) this.f1690h[length - 1];
            this.f1687e = -1.0f;
        }
        return this.f1691i;
    }

    /* renamed from: i */
    private boolean m1188i() {
        if (!m1189j() || this.f1685c != 1) {
            this.f1686d = false;
        } else {
            if (!this.f1691i || this.f1690h.length == 0) {
                float round = (float) Math.round(this.f1688f);
                int i = 1;
                while (Math.round(this.f1687e + round) <= Math.round(this.f1689g)) {
                    i++;
                    round += this.f1687e;
                }
                int[] iArr = new int[i];
                float f = this.f1688f;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f1687e;
                }
                this.f1690h = m1186a(iArr);
            }
            this.f1686d = true;
        }
        return this.f1686d;
    }

    /* renamed from: j */
    private boolean m1189j() {
        return !(this.f1693k instanceof AppCompatEditText);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4360a() {
        return this.f1685c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4361a(int i) {
        if (m1189j()) {
            switch (i) {
                case 0:
                    this.f1685c = 0;
                    this.f1688f = -1.0f;
                    this.f1689g = -1.0f;
                    this.f1687e = -1.0f;
                    this.f1690h = new int[0];
                    this.f1686d = false;
                    return;
                case 1:
                    DisplayMetrics displayMetrics = this.f1694l.getResources().getDisplayMetrics();
                    m1184a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (m1188i()) {
                        mo4370f();
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4362a(int i, float f) {
        m1183a(TypedValue.applyDimension(i, f, (this.f1694l == null ? Resources.getSystem() : this.f1694l.getResources()).getDisplayMetrics()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4363a(int i, int i2, int i3, int i4) {
        if (m1189j()) {
            DisplayMetrics displayMetrics = this.f1694l.getResources().getDisplayMetrics();
            m1184a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1188i()) {
                mo4370f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4364a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1694l.obtainStyledAttributes(attributeSet, C0197k.f352aw, i, 0);
        if (obtainStyledAttributes.hasValue(C0197k.f305aB)) {
            this.f1685c = obtainStyledAttributes.getInt(C0197k.f305aB, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0197k.f304aA) ? obtainStyledAttributes.getDimension(C0197k.f304aA, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0197k.f354ay) ? obtainStyledAttributes.getDimension(C0197k.f354ay, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0197k.f353ax) ? obtainStyledAttributes.getDimension(C0197k.f353ax, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0197k.f355az) && (resourceId = obtainStyledAttributes.getResourceId(C0197k.f355az, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = obtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                this.f1690h = m1186a(iArr);
                m1187h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1189j()) {
            this.f1685c = 0;
        } else if (this.f1685c == 1) {
            if (!this.f1691i) {
                DisplayMetrics displayMetrics = this.f1694l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1184a(dimension2, dimension3, dimension);
            }
            m1188i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4365a(int[] iArr, int i) {
        if (m1189j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1694l.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                this.f1690h = m1186a(iArr2);
                if (!m1187h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1691i = false;
            }
            if (m1188i()) {
                mo4370f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo4366b() {
        return Math.round(this.f1687e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo4367c() {
        return Math.round(this.f1688f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo4368d() {
        return Math.round(this.f1689g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int[] mo4369e() {
        return this.f1690h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo4370f() {
        if (mo4371g()) {
            if (this.f1686d) {
                if (this.f1693k.getMeasuredHeight() > 0 && this.f1693k.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) m1181a((Object) this.f1693k, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f1693k.getMeasuredWidth() - this.f1693k.getTotalPaddingLeft()) - this.f1693k.getTotalPaddingRight();
                    int height = (this.f1693k.getHeight() - this.f1693k.getCompoundPaddingBottom()) - this.f1693k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (f1683a) {
                            f1683a.setEmpty();
                            f1683a.right = (float) measuredWidth;
                            f1683a.bottom = (float) height;
                            float a = (float) m1178a(f1683a);
                            if (a != this.f1693k.getTextSize()) {
                                mo4362a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1686d = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo4371g() {
        return m1189j() && this.f1685c != 0;
    }
}
