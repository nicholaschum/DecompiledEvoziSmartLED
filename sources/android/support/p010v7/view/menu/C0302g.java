package android.support.p010v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.view.menu.g */
final class C0302g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C0301f f1194a;

    C0302g(C0301f fVar) {
        this.f1194a = fVar;
    }

    public final void onGlobalLayout() {
        if (this.f1194a.mo3741d() && this.f1194a.f1170b.size() > 0 && !this.f1194a.f1170b.get(0).f1201a.mo4147i()) {
            View view = this.f1194a.f1172d;
            if (view == null || !view.isShown()) {
                this.f1194a.mo3740c();
                return;
            }
            for (C0306k kVar : this.f1194a.f1170b) {
                kVar.f1201a.mo3739a();
            }
        }
    }
}
