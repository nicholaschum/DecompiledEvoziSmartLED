package p021wl.smartled.views;

import android.view.ViewTreeObserver;

/* renamed from: wl.smartled.views.e */
final class C0604e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver f2820a;

    /* renamed from: b */
    final /* synthetic */ int f2821b;

    /* renamed from: c */
    final /* synthetic */ DragGridView f2822c;

    C0604e(DragGridView dragGridView, ViewTreeObserver viewTreeObserver, int i) {
        this.f2822c = dragGridView;
        this.f2820a = viewTreeObserver;
        this.f2821b = i;
    }

    public final boolean onPreDraw() {
        this.f2820a.removeOnPreDrawListener(this);
        DragGridView.m2156a(this.f2822c, this.f2822c.f2711h, this.f2821b);
        int unused = this.f2822c.f2711h = this.f2821b;
        return true;
    }
}
