package android.support.p010v7.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.cj */
final class C0387cj implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f1771a;

    C0387cj(SearchView searchView) {
        this.f1771a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f1771a.f1488h == null) {
            return false;
        }
        if (this.f1771a.f1480a.isPopupShowing() && this.f1771a.f1480a.getListSelection() != -1) {
            return this.f1771a.mo4160a(i, keyEvent);
        }
        if ((TextUtils.getTrimmedLength(this.f1771a.f1480a.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        this.f1771a.mo4158a(this.f1771a.f1480a.getText().toString());
        return true;
    }
}
