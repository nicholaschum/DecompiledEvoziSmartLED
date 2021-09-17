package android.support.p010v7.view;

import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;

/* renamed from: android.support.v7.view.m */
final class C0282m extends ViewPropertyAnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0281l f1000a;

    /* renamed from: b */
    private boolean f1001b = false;

    /* renamed from: c */
    private int f1002c = 0;

    C0282m(C0281l lVar) {
        this.f1000a = lVar;
    }

    public final void onAnimationEnd(View view) {
        int i = this.f1002c + 1;
        this.f1002c = i;
        if (i == this.f1000a.f994a.size()) {
            if (this.f1000a.f995b != null) {
                this.f1000a.f995b.onAnimationEnd((View) null);
            }
            this.f1002c = 0;
            this.f1001b = false;
            this.f1000a.mo3509b();
        }
    }

    public final void onAnimationStart(View view) {
        if (!this.f1001b) {
            this.f1001b = true;
            if (this.f1000a.f995b != null) {
                this.f1000a.f995b.onAnimationStart((View) null);
            }
        }
    }
}
