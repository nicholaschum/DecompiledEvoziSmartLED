package android.support.p010v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.ak */
final class C0294ak implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0293aj f1151a;

    C0294ak(C0293aj ajVar) {
        this.f1151a = ajVar;
    }

    public final void onGlobalLayout() {
        if (this.f1151a.mo3741d() && !this.f1151a.f1131a.mo4147i()) {
            View view = this.f1151a.f1133c;
            if (view == null || !view.isShown()) {
                this.f1151a.mo3740c();
            } else {
                this.f1151a.f1131a.mo3739a();
            }
        }
    }
}
