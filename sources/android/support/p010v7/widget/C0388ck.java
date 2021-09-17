package android.support.p010v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ck */
final class C0388ck implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1772a;

    C0388ck(SearchView searchView) {
        this.f1772a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f1772a.mo4165d();
        return true;
    }
}
