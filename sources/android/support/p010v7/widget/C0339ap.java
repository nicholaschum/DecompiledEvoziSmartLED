package android.support.p010v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p007v4.widget.ImageViewCompat;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.ap */
public final class C0339ap {

    /* renamed from: a */
    private final ImageView f1642a;

    /* renamed from: b */
    private C0405da f1643b;

    /* renamed from: c */
    private C0405da f1644c;

    /* renamed from: d */
    private C0405da f1645d;

    public C0339ap(ImageView imageView) {
        this.f1642a = imageView;
    }

    /* renamed from: a */
    private boolean m1131a(Drawable drawable) {
        if (this.f1645d == null) {
            this.f1645d = new C0405da();
        }
        C0405da daVar = this.f1645d;
        daVar.mo4542a();
        ColorStateList imageTintList = ImageViewCompat.getImageTintList(this.f1642a);
        if (imageTintList != null) {
            daVar.f1823d = true;
            daVar.f1820a = imageTintList;
        }
        PorterDuff.Mode imageTintMode = ImageViewCompat.getImageTintMode(this.f1642a);
        if (imageTintMode != null) {
            daVar.f1822c = true;
            daVar.f1821b = imageTintMode;
        }
        if (!daVar.f1823d && !daVar.f1822c) {
            return false;
        }
        C0332ai.m1111a(drawable, daVar, this.f1642a.getDrawableState());
        return true;
    }

    /* renamed from: e */
    private boolean m1132e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1643b != null : i == 21;
    }

    /* renamed from: a */
    public final void mo4310a(int i) {
        if (i != 0) {
            Drawable b = C0252a.m419b(this.f1642a.getContext(), i);
            if (b != null) {
                C0355be.m1242b(b);
            }
            this.f1642a.setImageDrawable(b);
        } else {
            this.f1642a.setImageDrawable((Drawable) null);
        }
        mo4317d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4311a(ColorStateList colorStateList) {
        if (this.f1644c == null) {
            this.f1644c = new C0405da();
        }
        this.f1644c.f1820a = colorStateList;
        this.f1644c.f1823d = true;
        mo4317d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4312a(PorterDuff.Mode mode) {
        if (this.f1644c == null) {
            this.f1644c = new C0405da();
        }
        this.f1644c.f1821b = mode;
        this.f1644c.f1822c = true;
        mo4317d();
    }

    /* renamed from: a */
    public final void mo4313a(AttributeSet attributeSet, int i) {
        int g;
        C0407dc a = C0407dc.m1308a(this.f1642a.getContext(), attributeSet, C0197k.f335af, i, 0);
        try {
            Drawable drawable = this.f1642a.getDrawable();
            if (!(drawable != null || (g = a.mo4558g(C0197k.f336ag, -1)) == -1 || (drawable = C0252a.m419b(this.f1642a.getContext(), g)) == null)) {
                this.f1642a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0355be.m1242b(drawable);
            }
            if (a.mo4560h(C0197k.f337ah)) {
                ImageViewCompat.setImageTintList(this.f1642a, a.mo4557f(C0197k.f337ah));
            }
            if (a.mo4560h(C0197k.f338ai)) {
                ImageViewCompat.setImageTintMode(this.f1642a, C0355be.m1240a(a.mo4543a(C0197k.f338ai, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4546a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4314a() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1642a.getBackground() instanceof RippleDrawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ColorStateList mo4315b() {
        if (this.f1644c != null) {
            return this.f1644c.f1820a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PorterDuff.Mode mo4316c() {
        if (this.f1644c != null) {
            return this.f1644c.f1821b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4317d() {
        Drawable drawable = this.f1642a.getDrawable();
        if (drawable != null) {
            C0355be.m1242b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (m1132e() && m1131a(drawable)) {
            return;
        }
        if (this.f1644c != null) {
            C0332ai.m1111a(drawable, this.f1644c, this.f1642a.getDrawableState());
        } else if (this.f1643b != null) {
            C0332ai.m1111a(drawable, this.f1643b, this.f1642a.getDrawableState());
        }
    }
}
