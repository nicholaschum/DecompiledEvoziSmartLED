package android.support.p010v7.widget;

import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.MenuItem;

/* renamed from: android.support.v7.widget.q */
final class C0437q implements C0310o {

    /* renamed from: a */
    final /* synthetic */ ActionMenuView f1890a;

    C0437q(ActionMenuView actionMenuView) {
        this.f1890a = actionMenuView;
    }

    /* renamed from: a */
    public final void mo3185a(MenuBuilder menuBuilder) {
        if (this.f1890a.f1318a != null) {
            this.f1890a.f1318a.mo3185a(menuBuilder);
        }
    }

    /* renamed from: a */
    public final boolean mo3191a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f1890a.f1319b != null && this.f1890a.f1319b.mo4561a(menuItem);
    }
}
