package p021wl.smartled.views;

/* renamed from: wl.smartled.views.c */
final class C0602c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DragGridView f2818a;

    C0602c(DragGridView dragGridView) {
        this.f2818a = dragGridView;
    }

    public final void run() {
        boolean unused = this.f2818a.f2706c = true;
        if (this.f2818a.f2701I) {
            this.f2818a.f2715l.vibrate(50);
        }
        this.f2818a.f2712i.setVisibility(4);
        DragGridView.m2157a(this.f2818a, this.f2818a.f2718o, this.f2818a.f2707d, this.f2818a.f2708e);
    }
}
