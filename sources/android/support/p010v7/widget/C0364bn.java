package android.support.p010v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.bn */
final class C0364bn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ListPopupWindow f1724a;

    C0364bn(ListPopupWindow listPopupWindow) {
        this.f1724a = listPopupWindow;
    }

    public final void run() {
        View k = this.f1724a.mo4149k();
        if (k != null && k.getWindowToken() != null) {
            this.f1724a.mo3739a();
        }
    }
}
