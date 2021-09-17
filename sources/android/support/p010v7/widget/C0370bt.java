package android.support.p010v7.widget;

import android.support.p007v4.view.ViewCompat;

/* renamed from: android.support.v7.widget.bt */
final class C0370bt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ListPopupWindow f1730a;

    C0370bt(ListPopupWindow listPopupWindow) {
        this.f1730a = listPopupWindow;
    }

    public final void run() {
        if (this.f1730a.f1433c != null && ViewCompat.isAttachedToWindow(this.f1730a.f1433c) && this.f1730a.f1433c.getCount() > this.f1730a.f1433c.getChildCount() && this.f1730a.f1433c.getChildCount() <= this.f1730a.f1434d) {
            this.f1730a.f1437g.setInputMethodMode(2);
            this.f1730a.mo3739a();
        }
    }
}
