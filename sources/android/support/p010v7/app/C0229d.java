package android.support.p010v7.app;

import android.support.p007v4.widget.NestedScrollView;
import android.view.View;

/* renamed from: android.support.v7.app.d */
final class C0229d implements NestedScrollView.OnScrollChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f766a;

    /* renamed from: b */
    final /* synthetic */ View f767b;

    /* renamed from: c */
    final /* synthetic */ AlertController f768c;

    C0229d(AlertController alertController, View view, View view2) {
        this.f768c = alertController;
        this.f766a = view;
        this.f767b = view2;
    }

    public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        AlertController.m189a(nestedScrollView, this.f766a, this.f767b);
    }
}
