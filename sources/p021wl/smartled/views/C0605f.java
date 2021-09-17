package p021wl.smartled.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: wl.smartled.views.f */
final class C0605f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ DragGridView f2823a;

    C0605f(DragGridView dragGridView) {
        this.f2823a = dragGridView;
    }

    public final void onAnimationEnd(Animator animator) {
        boolean unused = this.f2823a.f2726w = true;
    }

    public final void onAnimationStart(Animator animator) {
        boolean unused = this.f2823a.f2726w = false;
    }
}
