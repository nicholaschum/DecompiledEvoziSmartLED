package android.support.p010v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.ag */
final class C0330ag {

    /* renamed from: a */
    private final View f1615a;

    /* renamed from: b */
    private final C0332ai f1616b;

    /* renamed from: c */
    private int f1617c = -1;

    /* renamed from: d */
    private C0405da f1618d;

    /* renamed from: e */
    private C0405da f1619e;

    /* renamed from: f */
    private C0405da f1620f;

    C0330ag(View view) {
        this.f1615a = view;
        this.f1616b = C0332ai.m1109a();
    }

    /* renamed from: a */
    private boolean m1085a(Drawable drawable) {
        if (this.f1620f == null) {
            this.f1620f = new C0405da();
        }
        C0405da daVar = this.f1620f;
        daVar.mo4542a();
        ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(this.f1615a);
        if (backgroundTintList != null) {
            daVar.f1823d = true;
            daVar.f1820a = backgroundTintList;
        }
        PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(this.f1615a);
        if (backgroundTintMode != null) {
            daVar.f1822c = true;
            daVar.f1821b = backgroundTintMode;
        }
        if (!daVar.f1823d && !daVar.f1822c) {
            return false;
        }
        C0332ai.m1111a(drawable, daVar, this.f1615a.getDrawableState());
        return true;
    }

    /* renamed from: b */
    private void m1086b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1618d == null) {
                this.f1618d = new C0405da();
            }
            this.f1618d.f1820a = colorStateList;
            this.f1618d.f1823d = true;
        } else {
            this.f1618d = null;
        }
        mo4294d();
    }

    /* renamed from: e */
    private boolean m1087e() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1618d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4287a() {
        this.f1617c = -1;
        m1086b((ColorStateList) null);
        mo4294d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4288a(int i) {
        this.f1617c = i;
        m1086b(this.f1616b != null ? this.f1616b.mo4306b(this.f1615a.getContext(), i) : null);
        mo4294d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4289a(ColorStateList colorStateList) {
        if (this.f1619e == null) {
            this.f1619e = new C0405da();
        }
        this.f1619e.f1820a = colorStateList;
        this.f1619e.f1823d = true;
        mo4294d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4290a(PorterDuff.Mode mode) {
        if (this.f1619e == null) {
            this.f1619e = new C0405da();
        }
        this.f1619e.f1821b = mode;
        this.f1619e.f1822c = true;
        mo4294d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4291a(AttributeSet attributeSet, int i) {
        C0407dc a = C0407dc.m1308a(this.f1615a.getContext(), attributeSet, C0197k.f483dU, i, 0);
        try {
            if (a.mo4560h(C0197k.f484dV)) {
                this.f1617c = a.mo4558g(C0197k.f484dV, -1);
                ColorStateList b = this.f1616b.mo4306b(this.f1615a.getContext(), this.f1617c);
                if (b != null) {
                    m1086b(b);
                }
            }
            if (a.mo4560h(C0197k.f485dW)) {
                ViewCompat.setBackgroundTintList(this.f1615a, a.mo4557f(C0197k.f485dW));
            }
            if (a.mo4560h(C0197k.f486dX)) {
                ViewCompat.setBackgroundTintMode(this.f1615a, C0355be.m1240a(a.mo4543a(C0197k.f486dX, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo4546a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ColorStateList mo4292b() {
        if (this.f1619e != null) {
            return this.f1619e.f1820a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final PorterDuff.Mode mo4293c() {
        if (this.f1619e != null) {
            return this.f1619e.f1821b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4294d() {
        Drawable background = this.f1615a.getBackground();
        if (background == null) {
            return;
        }
        if (m1087e() && m1085a(background)) {
            return;
        }
        if (this.f1619e != null) {
            C0332ai.m1111a(background, this.f1619e, this.f1615a.getDrawableState());
        } else if (this.f1618d != null) {
            C0332ai.m1111a(background, this.f1618d, this.f1615a.getDrawableState());
        }
    }
}
