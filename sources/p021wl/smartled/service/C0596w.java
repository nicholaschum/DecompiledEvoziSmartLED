package p021wl.smartled.service;

/* renamed from: wl.smartled.service.w */
final class C0596w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PlayService f2676a;

    C0596w(PlayService playService) {
        this.f2676a = playService;
    }

    public final void run() {
        long unused = this.f2676a.f2610m = this.f2676a.f2610m - 1000;
        if (this.f2676a.f2610m > 0) {
            if (this.f2676a.f2603f != null) {
                C0599z unused2 = this.f2676a.f2603f;
                long unused3 = this.f2676a.f2610m;
            }
            this.f2676a.f2601d.postDelayed(this, 1000);
            return;
        }
        this.f2676a.mo5100l();
    }
}
