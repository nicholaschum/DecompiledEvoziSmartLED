package android.support.p010v7.widget;

import android.view.ViewParent;

/* renamed from: android.support.v7.widget.bl */
final class C0362bl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0361bk f1722a;

    C0362bl(C0361bk bkVar) {
        this.f1722a = bkVar;
    }

    public final void run() {
        ViewParent parent = this.f1722a.f1715c.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
