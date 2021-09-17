package p021wl.smartled.fragment;

/* renamed from: wl.smartled.fragment.b */
final class C0556b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f2522a;

    /* renamed from: b */
    final /* synthetic */ MusicFragment f2523b;

    C0556b(MusicFragment musicFragment, boolean z) {
        this.f2523b = musicFragment;
        this.f2522a = z;
    }

    public final void run() {
        if (!this.f2522a) {
            this.f2523b.f2443b.setVisibility(8);
            this.f2523b.f2444c.setVisibility(0);
        } else if (this.f2523b.f2442a != null && this.f2523b.f2442a.mo5090b()) {
            this.f2523b.f2444c.setVisibility(8);
            this.f2523b.f2443b.setVisibility(0);
        }
    }
}
