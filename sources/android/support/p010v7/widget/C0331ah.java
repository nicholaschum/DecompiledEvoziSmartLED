package android.support.p010v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.widget.CompoundButtonCompat;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.ah */
final class C0331ah {

    /* renamed from: a */
    private final CompoundButton f1621a;

    /* renamed from: b */
    private ColorStateList f1622b = null;

    /* renamed from: c */
    private PorterDuff.Mode f1623c = null;

    /* renamed from: d */
    private boolean f1624d = false;

    /* renamed from: e */
    private boolean f1625e = false;

    /* renamed from: f */
    private boolean f1626f;

    C0331ah(CompoundButton compoundButton) {
        this.f1621a = compoundButton;
    }

    /* renamed from: d */
    private void m1096d() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.f1621a);
        if (buttonDrawable == null) {
            return;
        }
        if (this.f1624d || this.f1625e) {
            Drawable mutate = DrawableCompat.wrap(buttonDrawable).mutate();
            if (this.f1624d) {
                DrawableCompat.setTintList(mutate, this.f1622b);
            }
            if (this.f1625e) {
                DrawableCompat.setTintMode(mutate, this.f1623c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1621a.getDrawableState());
            }
            this.f1621a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = android.support.p007v4.widget.CompoundButtonCompat.getButtonDrawable(r2.f1621a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo4295a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f1621a
            android.graphics.drawable.Drawable r0 = android.support.p007v4.widget.CompoundButtonCompat.getButtonDrawable(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0331ah.mo4295a(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ColorStateList mo4296a() {
        return this.f1622b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4297a(ColorStateList colorStateList) {
        this.f1622b = colorStateList;
        this.f1624d = true;
        m1096d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4298a(PorterDuff.Mode mode) {
        this.f1623c = mode;
        this.f1625e = true;
        m1096d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4299a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1621a.getContext().obtainStyledAttributes(attributeSet, C0197k.f327aX, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0197k.f328aY) && (resourceId = obtainStyledAttributes.getResourceId(C0197k.f328aY, 0)) != 0) {
                this.f1621a.setButtonDrawable(C0252a.m419b(this.f1621a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0197k.f329aZ)) {
                CompoundButtonCompat.setButtonTintList(this.f1621a, obtainStyledAttributes.getColorStateList(C0197k.f329aZ));
            }
            if (obtainStyledAttributes.hasValue(C0197k.f383ba)) {
                CompoundButtonCompat.setButtonTintMode(this.f1621a, C0355be.m1240a(obtainStyledAttributes.getInt(C0197k.f383ba, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final PorterDuff.Mode mo4300b() {
        return this.f1623c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4301c() {
        if (this.f1626f) {
            this.f1626f = false;
            return;
        }
        this.f1626f = true;
        m1096d();
    }
}
