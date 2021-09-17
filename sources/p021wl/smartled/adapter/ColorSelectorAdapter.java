package p021wl.smartled.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p007v4.view.InputDeviceCompat;
import android.util.AttributeSet;
import p021wl.smartled.C0512b;
import p021wl.smartled.beans.C0523d;
import p021wl.smartled.views.ColorSelector;

/* renamed from: wl.smartled.adapter.ColorSelectorAdapter */
public class ColorSelectorAdapter extends ColorSelector {

    /* renamed from: a */
    private static final int[] f2186a = {InputDeviceCompat.SOURCE_ANY, -1, -16711681, SupportMenu.CATEGORY_MASK, -16711936, -16776961};

    /* renamed from: b */
    private static int f2187b = 2;

    /* renamed from: c */
    private static ColorSelectorAdapter f2188c;

    /* renamed from: d */
    private int f2189d = 1;

    /* renamed from: e */
    private Context f2190e;

    public ColorSelectorAdapter(Context context) {
        super(context);
        this.f2190e = context;
    }

    public ColorSelectorAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2190e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0512b.f2255X);
        this.f2189d = obtainStyledAttributes.getInteger(0, 1);
        obtainStyledAttributes.recycle();
        if (this.f2189d == 2) {
            f2188c = this;
            f2187b = 2;
            mo5174g();
            mo5167a(4, "CCT", 17170457);
            mo5167a(5, "W", 17170443);
        }
    }

    /* renamed from: b */
    public static double m1656b(int i) {
        C0523d.m1761a();
        return C0523d.m1767c(i);
    }

    /* renamed from: b */
    public static int m1657b() {
        C0523d.m1761a();
        return C0523d.m1760a(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4806a() {
        if (this.f2189d != f2187b) {
            f2188c.mo5173f();
            f2188c = this;
            f2187b = this.f2189d;
        }
    }

    /* renamed from: a */
    public final void mo4807a(int i) {
        int e = mo5172e();
        C0523d.m1761a();
        double c = C0523d.m1767c(e);
        C0523d.m1761a();
        mo4809a(e, i, c, C0523d.m1765b(e));
    }

    /* renamed from: a */
    public final void mo4808a(int i, double d, Point point) {
        mo4809a(mo5172e(), i, d, point);
    }

    /* renamed from: a */
    public final void mo4809a(int i, int i2, double d, Point point) {
        if (this.f2189d == 2) {
            super.mo5166a(i, i2);
            C0523d.m1761a();
            C0523d.m1762a(i, d);
            C0523d.m1761a();
            C0523d.m1764a(i, point);
            C0523d.m1761a();
            C0523d.m1763a(i, i2);
            C0523d.m1761a();
            C0523d.m1766b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo4810a(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (this.f2189d == 1) {
                iArr[i] = f2186a[i];
            } else if (this.f2189d == 2) {
                C0523d.m1761a();
                iArr[i] = C0523d.m1760a(i);
            }
        }
        return true;
    }

    /* renamed from: c */
    public final int mo4811c() {
        return this.f2189d;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f2188c = null;
    }
}
