package android.support.p010v7.widget;

import android.widget.AbsListView;

/* renamed from: android.support.v7.widget.br */
final class C0368br implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ ListPopupWindow f1728a;

    C0368br(ListPopupWindow listPopupWindow) {
        this.f1728a = listPopupWindow;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f1728a.mo4155q() && this.f1728a.f1437g.getContentView() != null) {
            this.f1728a.f1436f.removeCallbacks(this.f1728a.f1435e);
            this.f1728a.f1435e.run();
        }
    }
}
