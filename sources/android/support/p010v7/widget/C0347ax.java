package android.support.p010v7.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.ax */
final class C0347ax implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1666a;

    /* renamed from: b */
    final /* synthetic */ C0344au f1667b;

    C0347ax(C0344au auVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f1667b = auVar;
        this.f1666a = onGlobalLayoutListener;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f1667b.f1660b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1666a);
        }
    }
}
