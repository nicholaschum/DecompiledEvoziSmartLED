package android.support.p010v7.app;

import android.support.p010v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.l */
final class C0237l implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f828a;

    /* renamed from: b */
    final /* synthetic */ AlertController f829b;

    /* renamed from: c */
    final /* synthetic */ C0233h f830c;

    C0237l(C0233h hVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f830c = hVar;
        this.f828a = recycleListView;
        this.f829b = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f830c.f783F != null) {
            this.f830c.f783F[i] = this.f828a.isItemChecked(i);
        }
        this.f830c.f787J.onClick(this.f829b.f565a, i, this.f828a.isItemChecked(i));
    }
}
