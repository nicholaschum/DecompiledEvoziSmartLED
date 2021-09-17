package android.support.p010v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.cg */
final class C0384cg implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1768a;

    C0384cg(SearchView searchView) {
        this.f1768a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (this.f1768a.f1486f != null) {
            this.f1768a.f1486f.onFocusChange(this.f1768a, z);
        }
    }
}
