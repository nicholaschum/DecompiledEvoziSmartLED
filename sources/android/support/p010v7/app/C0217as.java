package android.support.p010v7.app;

import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.app.as */
final class C0217as implements C0310o {

    /* renamed from: a */
    final /* synthetic */ C0213ao f707a;

    C0217as(C0213ao aoVar) {
        this.f707a = aoVar;
    }

    /* renamed from: a */
    public final void mo3185a(MenuBuilder menuBuilder) {
        if (this.f707a.f697c == null) {
            return;
        }
        if (this.f707a.f695a.mo4389h()) {
            this.f707a.f697c.onPanelClosed(108, menuBuilder);
        } else if (this.f707a.f697c.onPreparePanel(0, (View) null, menuBuilder)) {
            this.f707a.f697c.onMenuOpened(108, menuBuilder);
        }
    }

    /* renamed from: a */
    public final boolean mo3191a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return false;
    }
}
