package android.support.p010v7.p014c.p015a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: android.support.v7.c.a.n */
class C0267n extends C0261h {

    /* renamed from: a */
    private C0268o f928a;

    /* renamed from: b */
    private boolean f929b;

    C0267n() {
        this((C0268o) null, (Resources) null);
    }

    C0267n(byte b) {
    }

    C0267n(C0268o oVar, Resources resources) {
        mo3336a(new C0268o(oVar, this, resources));
        onStateChange(getState());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0268o mo3338b() {
        return new C0268o(this.f928a, this, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3336a(C0264k kVar) {
        super.mo3336a(kVar);
        if (kVar instanceof C0268o) {
            this.f928a = (C0268o) kVar;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f929b && super.mutate() == this) {
            this.f928a.mo3376a();
            this.f929b = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f928a.mo3455b(iArr);
        if (b < 0) {
            b = this.f928a.mo3455b(StateSet.WILD_CARD);
        }
        return mo3387a(b) || onStateChange;
    }
}
