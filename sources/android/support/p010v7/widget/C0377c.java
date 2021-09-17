package android.support.p010v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.c */
final class C0377c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f1755a;

    C0377c(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1755a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1755a.f1273c = null;
        this.f1755a.f1272b = false;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1755a.f1273c = null;
        this.f1755a.f1272b = false;
    }
}
