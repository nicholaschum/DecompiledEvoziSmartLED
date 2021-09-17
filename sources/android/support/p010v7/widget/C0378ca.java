package android.support.p010v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ca */
final class C0378ca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f1756a;

    /* renamed from: b */
    final /* synthetic */ C0376bz f1757b;

    C0378ca(C0376bz bzVar, View view) {
        this.f1757b = bzVar;
        this.f1756a = view;
    }

    public final void run() {
        this.f1757b.smoothScrollTo(this.f1756a.getLeft() - ((this.f1757b.getWidth() - this.f1756a.getWidth()) / 2), 0);
        this.f1757b.f1747a = null;
    }
}
