package android.support.p010v7.app;

import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorListener;
import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.app.ad */
final class C0202ad extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0201ac f670a;

    C0202ad(C0201ac acVar) {
        this.f670a = acVar;
    }

    public final void onAnimationEnd(View view) {
        this.f670a.f668a.f624i.setVisibility(8);
        if (this.f670a.f668a.f625j != null) {
            this.f670a.f668a.f625j.dismiss();
        } else if (this.f670a.f668a.f624i.getParent() instanceof View) {
            ViewCompat.requestApplyInsets((View) this.f670a.f668a.f624i.getParent());
        }
        this.f670a.f668a.f624i.removeAllViews();
        this.f670a.f668a.f627l.setListener((ViewPropertyAnimatorListener) null);
        this.f670a.f668a.f627l = null;
    }
}
