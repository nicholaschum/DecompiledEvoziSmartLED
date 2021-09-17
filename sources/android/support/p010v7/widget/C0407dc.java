package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p007v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.dc */
public final class C0407dc {

    /* renamed from: a */
    private final Context f1825a;

    /* renamed from: b */
    private final TypedArray f1826b;

    /* renamed from: c */
    private TypedValue f1827c;

    private C0407dc(Context context, TypedArray typedArray) {
        this.f1825a = context;
        this.f1826b = typedArray;
    }

    /* renamed from: a */
    public static C0407dc m1306a(Context context, int i, int[] iArr) {
        return new C0407dc(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0407dc m1307a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0407dc(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public static C0407dc m1308a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0407dc(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public final int mo4543a(int i, int i2) {
        return this.f1826b.getInt(i, i2);
    }

    /* renamed from: a */
    public final Typeface mo4544a(int i, int i2, ResourcesCompat.FontCallback fontCallback) {
        int resourceId = this.f1826b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1827c == null) {
            this.f1827c = new TypedValue();
        }
        return ResourcesCompat.getFont(this.f1825a, resourceId, this.f1827c, i2, fontCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f1826b.getResourceId(r3, 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo4545a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1826b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f1826b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f1825a
            android.graphics.drawable.Drawable r3 = android.support.p010v7.p012b.p013a.C0252a.m419b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f1826b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0407dc.mo4545a(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public final void mo4546a() {
        this.f1826b.recycle();
    }

    /* renamed from: a */
    public final boolean mo4547a(int i, boolean z) {
        return this.f1826b.getBoolean(i, z);
    }

    /* renamed from: b */
    public final int mo4548b(int i, int i2) {
        return this.f1826b.getColor(i, i2);
    }

    /* renamed from: b */
    public final Drawable mo4549b(int i) {
        int resourceId;
        if (!this.f1826b.hasValue(i) || (resourceId = this.f1826b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0332ai.m1109a().mo4303a(this.f1825a, resourceId, true);
    }

    /* renamed from: c */
    public final int mo4550c(int i, int i2) {
        return this.f1826b.getInteger(i, i2);
    }

    /* renamed from: c */
    public final CharSequence mo4551c(int i) {
        return this.f1826b.getText(i);
    }

    /* renamed from: d */
    public final int mo4552d(int i, int i2) {
        return this.f1826b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final String mo4553d(int i) {
        return this.f1826b.getString(i);
    }

    /* renamed from: e */
    public final float mo4554e(int i) {
        return this.f1826b.getFloat(i, -1.0f);
    }

    /* renamed from: e */
    public final int mo4555e(int i, int i2) {
        return this.f1826b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public final int mo4556f(int i, int i2) {
        return this.f1826b.getLayoutDimension(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = android.support.p010v7.p012b.p013a.C0252a.m418a(r2.f1825a, (r0 = r2.f1826b.getResourceId(r3, 0)));
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList mo4557f(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f1826b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f1826b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f1825a
            android.content.res.ColorStateList r0 = android.support.p010v7.p012b.p013a.C0252a.m418a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f1826b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0407dc.mo4557f(int):android.content.res.ColorStateList");
    }

    /* renamed from: g */
    public final int mo4558g(int i, int i2) {
        return this.f1826b.getResourceId(i, i2);
    }

    /* renamed from: g */
    public final CharSequence[] mo4559g(int i) {
        return this.f1826b.getTextArray(i);
    }

    /* renamed from: h */
    public final boolean mo4560h(int i) {
        return this.f1826b.hasValue(i);
    }
}
