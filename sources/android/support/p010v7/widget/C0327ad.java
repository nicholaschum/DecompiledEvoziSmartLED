package android.support.p010v7.widget;

import android.database.DataSetObserver;

/* renamed from: android.support.v7.widget.ad */
final class C0327ad extends DataSetObserver {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1607a;

    C0327ad(ActivityChooserView activityChooserView) {
        this.f1607a = activityChooserView;
    }

    public final void onChanged() {
        super.onChanged();
        this.f1607a.mo3999e();
    }
}
