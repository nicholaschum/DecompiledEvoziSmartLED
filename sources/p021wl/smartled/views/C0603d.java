package p021wl.smartled.views;

/* renamed from: wl.smartled.views.d */
final class C0603d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DragGridView f2819a;

    C0603d(DragGridView dragGridView) {
        this.f2819a = dragGridView;
    }

    public final void run() {
        int i;
        if (this.f2819a.getFirstVisiblePosition() == 0 || this.f2819a.getLastVisiblePosition() == this.f2819a.getCount() - 1) {
            this.f2819a.f2702J.removeCallbacks(this.f2819a.f2704L);
        }
        if (this.f2819a.f2710g > this.f2819a.f2725v) {
            i = 20;
        } else if (this.f2819a.f2710g < this.f2819a.f2724u) {
            i = -20;
        } else {
            i = 0;
            this.f2819a.f2702J.removeCallbacks(this.f2819a.f2704L);
            this.f2819a.smoothScrollBy(i, 10);
        }
        this.f2819a.f2702J.postDelayed(this.f2819a.f2704L, 25);
        this.f2819a.smoothScrollBy(i, 10);
    }
}
