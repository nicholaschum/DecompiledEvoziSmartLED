package android.support.p010v7.app;

/* renamed from: android.support.v7.app.t */
final class C0245t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f837a;

    C0245t(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f837a = appCompatDelegateImpl;
    }

    public final void run() {
        if ((this.f837a.f635t & 1) != 0) {
            this.f837a.mo3207g(0);
        }
        if ((this.f837a.f635t & 4096) != 0) {
            this.f837a.mo3207g(108);
        }
        this.f837a.f634s = false;
        this.f837a.f635t = 0;
    }
}
