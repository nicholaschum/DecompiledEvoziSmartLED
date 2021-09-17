package android.support.p010v7.app;

import android.support.p007v4.view.ViewCompat;

/* renamed from: android.support.v7.app.x */
final class C0249x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f841a;

    C0249x(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f841a = appCompatDelegateImpl;
    }

    public final void run() {
        this.f841a.f625j.showAtLocation(this.f841a.f624i, 55, 0, 0);
        this.f841a.mo3215o();
        if (this.f841a.mo3213m()) {
            this.f841a.f624i.setAlpha(0.0f);
            this.f841a.f627l = ViewCompat.animate(this.f841a.f624i).alpha(1.0f);
            this.f841a.f627l.setListener(new C0250y(this));
            return;
        }
        this.f841a.f624i.setAlpha(1.0f);
        this.f841a.f624i.setVisibility(0);
    }
}
