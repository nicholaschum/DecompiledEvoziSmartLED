package android.support.p010v7.widget;

/* renamed from: android.support.v7.widget.e */
final class C0425e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f1879a;

    C0425e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1879a = actionBarOverlayLayout;
    }

    public final void run() {
        this.f1879a.mo3932b();
        this.f1879a.f1273c = this.f1879a.f1271a.animate().translationY((float) (-this.f1879a.f1271a.getHeight())).setListener(this.f1879a.f1274d);
    }
}
