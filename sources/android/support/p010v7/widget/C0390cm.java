package android.support.p010v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.cm */
final class C0390cm implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1774a;

    C0390cm(SearchView searchView) {
        this.f1774a = searchView;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1774a.mo4163c(i);
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
