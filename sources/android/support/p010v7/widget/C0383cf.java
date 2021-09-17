package android.support.p010v7.widget;

import android.database.Cursor;

/* renamed from: android.support.v7.widget.cf */
final class C0383cf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView f1767a;

    C0383cf(SearchView searchView) {
        this.f1767a = searchView;
    }

    public final void run() {
        if (this.f1767a.f1487g != null && (this.f1767a.f1487g instanceof C0399cv)) {
            this.f1767a.f1487g.changeCursor((Cursor) null);
        }
    }
}
