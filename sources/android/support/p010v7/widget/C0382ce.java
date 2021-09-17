package android.support.p010v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: android.support.v7.widget.ce */
final class C0382ce implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f1766a;

    C0382ce(SearchView searchView) {
        this.f1766a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1766a.mo4161b(charSequence);
    }
}
