package android.support.p010v7.app;

import android.support.p007v4.view.ViewPropertyAnimatorListener;
import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.app.y */
final class C0250y extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0249x f842a;

    C0250y(C0249x xVar) {
        this.f842a = xVar;
    }

    public final void onAnimationEnd(View view) {
        this.f842a.f841a.f624i.setAlpha(1.0f);
        this.f842a.f841a.f627l.setListener((ViewPropertyAnimatorListener) null);
        this.f842a.f841a.f627l = null;
    }

    public final void onAnimationStart(View view) {
        this.f842a.f841a.f624i.setVisibility(0);
    }
}
