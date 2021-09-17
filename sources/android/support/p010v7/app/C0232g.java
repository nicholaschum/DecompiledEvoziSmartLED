package android.support.p010v7.app;

import android.view.View;

/* renamed from: android.support.v7.app.g */
final class C0232g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f775a;

    /* renamed from: b */
    final /* synthetic */ View f776b;

    /* renamed from: c */
    final /* synthetic */ AlertController f777c;

    C0232g(AlertController alertController, View view, View view2) {
        this.f777c = alertController;
        this.f775a = view;
        this.f776b = view2;
    }

    public final void run() {
        AlertController.m189a(this.f777c.f566b, this.f775a, this.f776b);
    }
}
