package android.support.p010v7.app;

import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.app.ay */
final class C0223ay extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0222ax f757a;

    C0223ay(C0222ax axVar) {
        this.f757a = axVar;
    }

    public final void onAnimationEnd(View view) {
        if (this.f757a.f744k && this.f757a.f739f != null) {
            this.f757a.f739f.setTranslationY(0.0f);
            this.f757a.f736c.setTranslationY(0.0f);
        }
        this.f757a.f736c.setVisibility(8);
        this.f757a.f736c.mo3895a(false);
        this.f757a.f747n = null;
        C0222ax axVar = this.f757a;
        if (axVar.f743j != null) {
            axVar.f743j.mo3234a(axVar.f742i);
            axVar.f742i = null;
            axVar.f743j = null;
        }
        if (this.f757a.f735b != null) {
            ViewCompat.requestApplyInsets(this.f757a.f735b);
        }
    }
}
