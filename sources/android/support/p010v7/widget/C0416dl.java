package android.support.p010v7.widget;

import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.widget.dl */
final class C0416dl extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f1853a;

    /* renamed from: b */
    final /* synthetic */ C0414dj f1854b;

    /* renamed from: c */
    private boolean f1855c = false;

    C0416dl(C0414dj djVar, int i) {
        this.f1854b = djVar;
        this.f1853a = i;
    }

    public final void onAnimationCancel(View view) {
        this.f1855c = true;
    }

    public final void onAnimationEnd(View view) {
        if (!this.f1855c) {
            this.f1854b.f1834a.setVisibility(this.f1853a);
        }
    }

    public final void onAnimationStart(View view) {
        this.f1854b.f1834a.setVisibility(0);
    }
}
