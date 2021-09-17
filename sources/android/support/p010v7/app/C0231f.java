package android.support.p010v7.app;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: android.support.v7.app.f */
final class C0231f implements AbsListView.OnScrollListener {

    /* renamed from: a */
    final /* synthetic */ View f772a;

    /* renamed from: b */
    final /* synthetic */ View f773b;

    /* renamed from: c */
    final /* synthetic */ AlertController f774c;

    C0231f(AlertController alertController, View view, View view2) {
        this.f774c = alertController;
        this.f772a = view;
        this.f773b = view2;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m189a(absListView, this.f772a, this.f773b);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
