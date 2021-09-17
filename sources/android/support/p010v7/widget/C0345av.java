package android.support.p010v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.av */
final class C0345av implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ AppCompatSpinner f1663a;

    /* renamed from: b */
    final /* synthetic */ C0344au f1664b;

    C0345av(C0344au auVar, AppCompatSpinner appCompatSpinner) {
        this.f1664b = auVar;
        this.f1663a = appCompatSpinner;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1664b.f1660b.setSelection(i);
        if (this.f1664b.f1660b.getOnItemClickListener() != null) {
            this.f1664b.f1660b.performItemClick(view, i, this.f1664b.f1659a.getItemId(i));
        }
        this.f1664b.mo3740c();
    }
}
