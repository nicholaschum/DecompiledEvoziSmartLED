package android.support.p010v7.widget;

import android.database.DataSetObserver;

/* renamed from: android.support.v7.widget.bq */
final class C0367bq extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ListPopupWindow f1727a;

    C0367bq(ListPopupWindow listPopupWindow) {
        this.f1727a = listPopupWindow;
    }

    public final void onChanged() {
        if (this.f1727a.mo3741d()) {
            this.f1727a.mo3739a();
        }
    }

    public final void onInvalidated() {
        this.f1727a.mo3740c();
    }
}
