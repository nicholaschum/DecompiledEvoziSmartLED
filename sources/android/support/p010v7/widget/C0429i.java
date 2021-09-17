package android.support.p010v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.i */
final class C0429i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1882a;

    /* renamed from: b */
    private C0432l f1883b;

    public C0429i(ActionMenuPresenter actionMenuPresenter, C0432l lVar) {
        this.f1882a = actionMenuPresenter;
        this.f1883b = lVar;
    }

    public final void run() {
        if (this.f1882a.f1155c != null) {
            this.f1882a.f1155c.mo3607g();
        }
        View view = (View) this.f1882a.f1158f;
        if (!(view == null || view.getWindowToken() == null || !this.f1883b.mo3702d())) {
            this.f1882a.f1298h = this.f1883b;
        }
        this.f1882a.f1300j = null;
    }
}
