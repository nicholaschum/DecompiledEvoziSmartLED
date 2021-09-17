package p021wl.smartled.service;

/* renamed from: wl.smartled.service.v */
final class C0595v implements Runnable {

    /* renamed from: a */
    final /* synthetic */ PlayService f2675a;

    C0595v(PlayService playService) {
        this.f2675a = playService;
    }

    public final void run() {
        if (this.f2675a.mo5095g() && this.f2675a.f2603f != null) {
            this.f2675a.f2603f.mo5034a(this.f2675a.f2612o.getCurrentPosition());
        }
        this.f2675a.f2601d.postDelayed(this, 100);
    }
}
