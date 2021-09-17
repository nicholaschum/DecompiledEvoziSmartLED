package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.view.ViewCompat;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VectorDrawableCompat extends C0074k {

    /* renamed from: a */
    static final PorterDuff.Mode f175a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private C0081r f176b;

    /* renamed from: d */
    private PorterDuffColorFilter f177d;

    /* renamed from: e */
    private ColorFilter f178e;

    /* renamed from: f */
    private boolean f179f;

    /* renamed from: g */
    private boolean f180g;

    /* renamed from: h */
    private Drawable.ConstantState f181h;

    /* renamed from: i */
    private final float[] f182i;

    /* renamed from: j */
    private final Matrix f183j;

    /* renamed from: k */
    private final Rect f184k;

    VectorDrawableCompat() {
        this.f180g = true;
        this.f182i = new float[9];
        this.f183j = new Matrix();
        this.f184k = new Rect();
        this.f176b = new C0081r();
    }

    VectorDrawableCompat(C0081r rVar) {
        this.f180g = true;
        this.f182i = new float[9];
        this.f183j = new Matrix();
        this.f184k = new Rect();
        this.f176b = rVar;
        this.f177d = m125a(rVar.f257c, rVar.f258d);
    }

    /* renamed from: a */
    static int m124a(int i, float f) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m125a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[Catch:{ IOException | XmlPullParserException -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0040 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.graphics.drawable.VectorDrawableCompat m126a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            android.support.graphics.drawable.VectorDrawableCompat r0 = new android.support.graphics.drawable.VectorDrawableCompat
            r0.<init>()
            android.graphics.drawable.Drawable r4 = android.support.p007v4.content.res.ResourcesCompat.getDrawable(r4, r5, r6)
            r0.f208c = r4
            android.support.graphics.drawable.s r4 = new android.support.graphics.drawable.s
            android.graphics.drawable.Drawable r5 = r0.f208c
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.f181h = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            r2 = 2
            if (r1 == r2) goto L_0x0031
            r3 = 1
            if (r1 != r3) goto L_0x0027
        L_0x0031:
            if (r1 != r2) goto L_0x0038
            android.support.graphics.drawable.VectorDrawableCompat r4 = m127a(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            return r4
        L_0x0038:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0040 }
        L_0x0040:
            r4 = move-exception
            java.lang.String r5 = "VectorDrawableCompat"
            java.lang.String r6 = "parser error"
            android.util.Log.e(r5, r6, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.VectorDrawableCompat.m126a(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.graphics.drawable.VectorDrawableCompat");
    }

    /* renamed from: a */
    public static VectorDrawableCompat m127a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    /* renamed from: b */
    private void m128b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C0081r rVar = this.f176b;
        C0080q qVar = rVar.f256b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(qVar.f241c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0077n nVar = (C0077n) arrayDeque.peek();
                if ("path".equals(name)) {
                    C0076m mVar = new C0076m();
                    mVar.mo221a(resources, attributeSet, theme, xmlPullParser);
                    nVar.f223b.add(mVar);
                    if (mVar.getPathName() != null) {
                        qVar.f249k.put(mVar.getPathName(), mVar);
                    }
                    z = false;
                    i = rVar.f255a;
                    i2 = mVar.f237o;
                } else if ("clip-path".equals(name)) {
                    C0075l lVar = new C0075l();
                    lVar.mo219a(resources, attributeSet, theme, xmlPullParser);
                    nVar.f223b.add(lVar);
                    if (lVar.getPathName() != null) {
                        qVar.f249k.put(lVar.getPathName(), lVar);
                    }
                    i = rVar.f255a;
                    i2 = lVar.f237o;
                } else if ("group".equals(name)) {
                    C0077n nVar2 = new C0077n();
                    nVar2.mo240a(resources, attributeSet, theme, xmlPullParser);
                    nVar.f223b.add(nVar2);
                    arrayDeque.push(nVar2);
                    if (nVar2.getGroupName() != null) {
                        qVar.f249k.put(nVar2.getGroupName(), nVar2);
                    }
                    i = rVar.f255a;
                    i2 = nVar2.f226e;
                }
                rVar.f255a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo182a(String str) {
        return this.f176b.f256b.f249k.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo183a() {
        this.f180g = false;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.f208c == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(this.f208c);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        if ((r1 == r6.f260f.getWidth() && r3 == r6.f260f.getHeight()) == false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f208c
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.Drawable r0 = r10.f208c
            r0.draw(r11)
            return
        L_0x000a:
            android.graphics.Rect r0 = r10.f184k
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f184k
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x017c
            android.graphics.Rect r0 = r10.f184k
            int r0 = r0.height()
            if (r0 > 0) goto L_0x0021
            goto L_0x017c
        L_0x0021:
            android.graphics.ColorFilter r0 = r10.f178e
            if (r0 != 0) goto L_0x0028
            android.graphics.PorterDuffColorFilter r0 = r10.f177d
            goto L_0x002a
        L_0x0028:
            android.graphics.ColorFilter r0 = r10.f178e
        L_0x002a:
            android.graphics.Matrix r1 = r10.f183j
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f183j
            float[] r2 = r10.f182i
            r1.getValues(r2)
            float[] r1 = r10.f182i
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f182i
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f182i
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f182i
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0065
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
        L_0x0065:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0069:
            android.graphics.Rect r4 = r10.f184k
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f184k
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x017c
            if (r3 > 0) goto L_0x008d
            goto L_0x017c
        L_0x008d:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f184k
            int r6 = r6.left
            float r6 = (float) r6
            android.graphics.Rect r9 = r10.f184k
            int r9 = r9.top
            float r9 = (float) r9
            r11.translate(r6, r9)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 17
            if (r6 < r9) goto L_0x00b2
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00b2
            int r6 = android.support.p007v4.graphics.drawable.DrawableCompat.getLayoutDirection(r10)
            if (r6 != r5) goto L_0x00b2
            r6 = 1
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            if (r6 == 0) goto L_0x00c4
            android.graphics.Rect r6 = r10.f184k
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00c4:
            android.graphics.Rect r6 = r10.f184k
            r6.offsetTo(r2, r2)
            android.support.graphics.drawable.r r6 = r10.f176b
            android.graphics.Bitmap r7 = r6.f260f
            if (r7 == 0) goto L_0x00e4
            android.graphics.Bitmap r7 = r6.f260f
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00e1
            android.graphics.Bitmap r7 = r6.f260f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00e1
            r7 = 1
            goto L_0x00e2
        L_0x00e1:
            r7 = 0
        L_0x00e2:
            if (r7 != 0) goto L_0x00ee
        L_0x00e4:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f260f = r7
            r6.f265k = r5
        L_0x00ee:
            boolean r6 = r10.f180g
            if (r6 != 0) goto L_0x00f8
            android.support.graphics.drawable.r r6 = r10.f176b
            r6.mo267a(r1, r3)
            goto L_0x013c
        L_0x00f8:
            android.support.graphics.drawable.r r6 = r10.f176b
            boolean r7 = r6.f265k
            if (r7 != 0) goto L_0x011c
            android.content.res.ColorStateList r7 = r6.f261g
            android.content.res.ColorStateList r8 = r6.f257c
            if (r7 != r8) goto L_0x011c
            android.graphics.PorterDuff$Mode r7 = r6.f262h
            android.graphics.PorterDuff$Mode r8 = r6.f258d
            if (r7 != r8) goto L_0x011c
            boolean r7 = r6.f264j
            boolean r8 = r6.f259e
            if (r7 != r8) goto L_0x011c
            int r7 = r6.f263i
            android.support.graphics.drawable.q r6 = r6.f256b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x011c
            r6 = 1
            goto L_0x011d
        L_0x011c:
            r6 = 0
        L_0x011d:
            if (r6 != 0) goto L_0x013c
            android.support.graphics.drawable.r r6 = r10.f176b
            r6.mo267a(r1, r3)
            android.support.graphics.drawable.r r1 = r10.f176b
            android.content.res.ColorStateList r3 = r1.f257c
            r1.f261g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f258d
            r1.f262h = r3
            android.support.graphics.drawable.q r3 = r1.f256b
            int r3 = r3.getRootAlpha()
            r1.f263i = r3
            boolean r3 = r1.f259e
            r1.f264j = r3
            r1.f265k = r2
        L_0x013c:
            android.support.graphics.drawable.r r1 = r10.f176b
            android.graphics.Rect r3 = r10.f184k
            android.support.graphics.drawable.q r6 = r1.f256b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x014b
            r2 = 1
        L_0x014b:
            r6 = 0
            if (r2 != 0) goto L_0x0152
            if (r0 != 0) goto L_0x0152
            r0 = r6
            goto L_0x0174
        L_0x0152:
            android.graphics.Paint r2 = r1.f266l
            if (r2 != 0) goto L_0x0162
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f266l = r2
            android.graphics.Paint r2 = r1.f266l
            r2.setFilterBitmap(r5)
        L_0x0162:
            android.graphics.Paint r2 = r1.f266l
            android.support.graphics.drawable.q r5 = r1.f256b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f266l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f266l
        L_0x0174:
            android.graphics.Bitmap r1 = r1.f260f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.VectorDrawableCompat.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        return this.f208c != null ? DrawableCompat.getAlpha(this.f208c) : this.f176b.f256b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        return this.f208c != null ? this.f208c.getChangingConfigurations() : super.getChangingConfigurations() | this.f176b.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f208c != null && Build.VERSION.SDK_INT >= 24) {
            return new C0082s(this.f208c.getConstantState());
        }
        this.f176b.f255a = getChangingConfigurations();
        return this.f176b;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f208c != null ? this.f208c.getIntrinsicHeight() : (int) this.f176b.f256b.f243e;
    }

    public int getIntrinsicWidth() {
        return this.f208c != null ? this.f208c.getIntrinsicWidth() : (int) this.f176b.f256b.f242d;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        if (this.f208c != null) {
            return this.f208c.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.f208c != null) {
            this.f208c.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        if (this.f208c != null) {
            DrawableCompat.inflate(this.f208c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0081r rVar = this.f176b;
        rVar.f256b = new C0080q();
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f185a);
        C0081r rVar2 = this.f176b;
        C0080q qVar = rVar2.f256b;
        int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (namedInt == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (namedInt == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (namedInt != 9) {
            switch (namedInt) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        rVar2.f258d = mode;
        ColorStateList colorStateList = obtainAttributes.getColorStateList(1);
        if (colorStateList != null) {
            rVar2.f257c = colorStateList;
        }
        rVar2.f259e = TypedArrayUtils.getNamedBoolean(obtainAttributes, xmlPullParser, "autoMirrored", 5, rVar2.f259e);
        qVar.f244f = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "viewportWidth", 7, qVar.f244f);
        qVar.f245g = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "viewportHeight", 8, qVar.f245g);
        if (qVar.f244f <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (qVar.f245g > 0.0f) {
            qVar.f242d = obtainAttributes.getDimension(3, qVar.f242d);
            qVar.f243e = obtainAttributes.getDimension(2, qVar.f243e);
            if (qVar.f242d <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (qVar.f243e > 0.0f) {
                qVar.setAlpha(TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "alpha", 4, qVar.getAlpha()));
                String string = obtainAttributes.getString(0);
                if (string != null) {
                    qVar.f247i = string;
                    qVar.f249k.put(string, qVar);
                }
                obtainAttributes.recycle();
                rVar.f255a = getChangingConfigurations();
                rVar.f265k = true;
                m128b(resources, xmlPullParser, attributeSet, theme);
                this.f177d = m125a(rVar.f257c, rVar.f258d);
            } else {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public void invalidateSelf() {
        if (this.f208c != null) {
            this.f208c.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        return this.f208c != null ? DrawableCompat.isAutoMirrored(this.f208c) : this.f176b.f259e;
    }

    public boolean isStateful() {
        if (this.f208c != null) {
            return this.f208c.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        if (this.f176b == null) {
            return false;
        }
        if (!this.f176b.f256b.mo262a()) {
            return this.f176b.f257c != null && this.f176b.f257c.isStateful();
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f208c != null) {
            this.f208c.mutate();
            return this;
        }
        if (!this.f179f && super.mutate() == this) {
            this.f176b = new C0081r(this.f176b);
            this.f179f = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f208c != null) {
            this.f208c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f208c != null) {
            return this.f208c.setState(iArr);
        }
        boolean z = false;
        C0081r rVar = this.f176b;
        if (!(rVar.f257c == null || rVar.f258d == null)) {
            this.f177d = m125a(rVar.f257c, rVar.f258d);
            invalidateSelf();
            z = true;
        }
        if (!rVar.f256b.mo262a()) {
            return z;
        }
        boolean a = rVar.f256b.f241c.mo222a(iArr);
        rVar.f265k |= a;
        if (!a) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.f208c != null) {
            this.f208c.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f208c != null) {
            this.f208c.setAlpha(i);
        } else if (this.f176b.f256b.getRootAlpha() != i) {
            this.f176b.f256b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f208c != null) {
            DrawableCompat.setAutoMirrored(this.f208c, z);
        } else {
            this.f176b.f259e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f208c != null) {
            this.f208c.setColorFilter(colorFilter);
            return;
        }
        this.f178e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f208c != null) {
            DrawableCompat.setTint(this.f208c, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f208c != null) {
            DrawableCompat.setTintList(this.f208c, colorStateList);
            return;
        }
        C0081r rVar = this.f176b;
        if (rVar.f257c != colorStateList) {
            rVar.f257c = colorStateList;
            this.f177d = m125a(colorStateList, rVar.f258d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f208c != null) {
            DrawableCompat.setTintMode(this.f208c, mode);
            return;
        }
        C0081r rVar = this.f176b;
        if (rVar.f258d != mode) {
            rVar.f258d = mode;
            this.f177d = m125a(rVar.f257c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f208c != null ? this.f208c.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.f208c != null) {
            this.f208c.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
