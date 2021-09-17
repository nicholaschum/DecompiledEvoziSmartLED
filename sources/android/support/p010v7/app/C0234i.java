package android.support.p010v7.app;

import android.content.Context;
import android.support.p010v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* renamed from: android.support.v7.app.i */
final class C0234i extends ArrayAdapter<CharSequence> {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f819a;

    /* renamed from: b */
    final /* synthetic */ C0233h f820b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0234i(C0233h hVar, Context context, int i, CharSequence[] charSequenceArr, AlertController.RecycleListView recycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.f820b = hVar;
        this.f819a = recycleListView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f820b.f783F != null && this.f820b.f783F[i]) {
            this.f819a.setItemChecked(i, true);
        }
        return view2;
    }
}
