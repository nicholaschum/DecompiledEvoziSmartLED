package android.support.p010v7.view.menu;

import android.view.View;

/* renamed from: android.support.v7.view.menu.al */
final class C0295al implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0293aj f1152a;

    C0295al(C0293aj ajVar) {
        this.f1152a = ajVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.f1152a.f1134d != null) {
            if (!this.f1152a.f1134d.isAlive()) {
                this.f1152a.f1134d = view.getViewTreeObserver();
            }
            this.f1152a.f1134d.removeGlobalOnLayoutListener(this.f1152a.f1132b);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
