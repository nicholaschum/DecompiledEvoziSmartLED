package android.support.p010v7.widget;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.widget.aw */
final class C0346aw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0344au f1665a;

    C0346aw(C0344au auVar) {
        this.f1665a = auVar;
    }

    public final void onGlobalLayout() {
        if (!this.f1665a.mo4337a((View) this.f1665a.f1660b)) {
            this.f1665a.mo3740c();
            return;
        }
        this.f1665a.mo4339f();
        C0346aw.super.mo3739a();
    }
}
