package android.support.p010v7.widget;

import android.support.p010v7.view.menu.ActionMenuItem;
import android.view.View;

/* renamed from: android.support.v7.widget.dk */
final class C0415dk implements View.OnClickListener {

    /* renamed from: a */
    final ActionMenuItem f1851a = new ActionMenuItem(this.f1852b.f1834a.getContext(), this.f1852b.f1835b);

    /* renamed from: b */
    final /* synthetic */ C0414dj f1852b;

    C0415dk(C0414dj djVar) {
        this.f1852b = djVar;
    }

    public final void onClick(View view) {
        if (this.f1852b.f1836c != null && this.f1852b.f1837d) {
            this.f1852b.f1836c.onMenuItemSelected(0, this.f1851a);
        }
    }
}
