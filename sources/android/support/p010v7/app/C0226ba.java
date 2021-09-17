package android.support.p010v7.app;

import android.support.p007v4.view.ViewPropertyAnimatorUpdateListener;
import android.view.View;

/* renamed from: android.support.v7.app.ba */
final class C0226ba implements ViewPropertyAnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0222ax f759a;

    C0226ba(C0222ax axVar) {
        this.f759a = axVar;
    }

    public final void onAnimationUpdate(View view) {
        ((View) this.f759a.f736c.getParent()).invalidate();
    }
}
