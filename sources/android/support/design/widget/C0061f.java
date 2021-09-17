package android.support.design.widget;

import android.view.ViewTreeObserver;

/* renamed from: android.support.design.widget.f */
final class C0061f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f168a;

    C0061f(CoordinatorLayout coordinatorLayout) {
        this.f168a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.f168a.mo85a(0);
        return true;
    }
}
