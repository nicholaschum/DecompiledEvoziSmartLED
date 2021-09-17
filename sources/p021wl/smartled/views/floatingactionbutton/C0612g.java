package p021wl.smartled.views.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: wl.smartled.views.floatingactionbutton.g */
final class C0612g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f2882a;

    /* renamed from: b */
    final /* synthetic */ C0611f f2883b;

    C0612g(C0611f fVar, View view) {
        this.f2883b = fVar;
        this.f2882a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2882a.setLayerType(0, (Paint) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f2882a.setLayerType(2, (Paint) null);
    }
}
