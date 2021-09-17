package android.support.p010v7.view.menu;

import android.view.View;

/* renamed from: android.support.v7.view.menu.h */
final class C0303h implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C0301f f1195a;

    C0303h(C0301f fVar) {
        this.f1195a = fVar;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        if (this.f1195a.f1173e != null) {
            if (!this.f1195a.f1173e.isAlive()) {
                this.f1195a.f1173e = view.getViewTreeObserver();
            }
            this.f1195a.f1173e.removeGlobalOnLayoutListener(this.f1195a.f1171c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
