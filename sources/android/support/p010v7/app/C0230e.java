package android.support.p010v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.e */
final class C0230e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f769a;

    /* renamed from: b */
    final /* synthetic */ View f770b;

    /* renamed from: c */
    final /* synthetic */ AlertController f771c;

    C0230e(AlertController alertController, View view, View view2) {
        this.f771c = alertController;
        this.f769a = view;
        this.f770b = view2;
    }

    public final void run() {
        AlertController.m189a(this.f771c.f573i, this.f769a, this.f770b);
    }
}
