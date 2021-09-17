package android.support.p010v7.widget;

import android.view.ViewTreeObserver;

/* renamed from: android.support.v7.widget.aa */
final class C0324aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1604a;

    C0324aa(ActivityChooserView activityChooserView) {
        this.f1604a = activityChooserView;
    }

    public final void onGlobalLayout() {
        if (!this.f1604a.mo3997c()) {
            return;
        }
        if (!this.f1604a.isShown()) {
            this.f1604a.mo3998d().mo3740c();
            return;
        }
        this.f1604a.mo3998d().mo3739a();
        if (this.f1604a.f1339d != null) {
            this.f1604a.f1339d.subUiVisibilityChanged(true);
        }
    }
}
