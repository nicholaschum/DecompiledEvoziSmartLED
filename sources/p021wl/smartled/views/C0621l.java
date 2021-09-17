package p021wl.smartled.views;

import android.view.ViewTreeObserver;

/* renamed from: wl.smartled.views.l */
final class C0621l implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    final /* synthetic */ ScrollTabView f2892a;

    C0621l(ScrollTabView scrollTabView) {
        this.f2892a = scrollTabView;
    }

    public final void onScrollChanged() {
        if (this.f2892a.f2780e.getMeasuredWidth() <= this.f2892a.f2779d.getScrollX() + this.f2892a.f2779d.getWidth() + 10) {
            this.f2892a.mo5198a(false, true);
        } else if (this.f2892a.f2779d.getScrollX() <= 10) {
            this.f2892a.mo5198a(true, false);
        } else {
            this.f2892a.mo5198a(false, false);
        }
    }
}
