package android.support.p010v7.app;

import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.app.az */
final class C0224az extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0222ax f758a;

    C0224az(C0222ax axVar) {
        this.f758a = axVar;
    }

    public final void onAnimationEnd(View view) {
        this.f758a.f747n = null;
        this.f758a.f736c.requestLayout();
    }
}
