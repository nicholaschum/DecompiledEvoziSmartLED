package android.support.p010v7.app;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.app.k */
final class C0236k implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AlertController f826a;

    /* renamed from: b */
    final /* synthetic */ C0233h f827b;

    C0236k(C0233h hVar, AlertController alertController) {
        this.f827b = hVar;
        this.f826a = alertController;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f827b.f816x.onClick(this.f826a.f565a, i);
        if (!this.f827b.f785H) {
            this.f826a.f565a.dismiss();
        }
    }
}
