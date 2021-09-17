package android.support.p010v7.widget;

import android.database.DataSetObserver;

/* renamed from: android.support.v7.widget.z */
final class C0446z extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1914a;

    C0446z(ActivityChooserView activityChooserView) {
        this.f1914a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.f1914a.f1336a.notifyDataSetChanged();
    }

    public final void onInvalidated() {
        super.onInvalidated();
        this.f1914a.f1336a.notifyDataSetInvalidated();
    }
}
