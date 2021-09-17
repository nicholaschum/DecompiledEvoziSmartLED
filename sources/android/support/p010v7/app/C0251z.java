package android.support.p010v7.app;

import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorListener;
import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.app.z */
final class C0251z extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f843a;

    C0251z(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f843a = appCompatDelegateImpl;
    }

    public final void onAnimationEnd(View view) {
        this.f843a.f624i.setAlpha(1.0f);
        this.f843a.f627l.setListener((ViewPropertyAnimatorListener) null);
        this.f843a.f627l = null;
    }

    public final void onAnimationStart(View view) {
        this.f843a.f624i.setVisibility(0);
        this.f843a.f624i.sendAccessibilityEvent(32);
        if (this.f843a.f624i.getParent() instanceof View) {
            ViewCompat.requestApplyInsets((View) this.f843a.f624i.getParent());
        }
    }
}
