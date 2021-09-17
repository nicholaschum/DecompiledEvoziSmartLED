package android.support.p010v7.widget;

/* renamed from: android.support.v7.widget.d */
final class C0404d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f1819a;

    C0404d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1819a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f1819a.mo3932b();
        this.f1819a.f1273c = this.f1819a.f1271a.animate().translationY(0.0f).setListener(this.f1819a.f1274d);
    }
}
