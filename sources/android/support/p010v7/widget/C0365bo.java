package android.support.p010v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: android.support.v7.widget.bo */
final class C0365bo implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ ListPopupWindow f1725a;

    C0365bo(ListPopupWindow listPopupWindow) {
        this.f1725a = listPopupWindow;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0356bf bfVar;
        if (i != -1 && (bfVar = this.f1725a.f1433c) != null) {
            bfVar.mo4399a(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
