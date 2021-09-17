package android.support.p010v7.widget;

import android.support.p010v7.app.C0198a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: android.support.v7.widget.cb */
final class C0379cb extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C0376bz f1758a;

    C0379cb(C0376bz bzVar) {
        this.f1758a = bzVar;
    }

    public final int getCount() {
        return this.f1758a.f1748b.getChildCount();
    }

    public final Object getItem(int i) {
        return ((C0380cc) this.f1758a.f1748b.getChildAt(i)).mo4499a();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            return this.f1758a.mo4484a((C0198a) getItem(i));
        }
        ((C0380cc) view).mo4500a((C0198a) getItem(i));
        return view;
    }
}
