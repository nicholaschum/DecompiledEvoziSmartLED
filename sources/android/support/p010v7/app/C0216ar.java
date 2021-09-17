package android.support.p010v7.app;

import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuBuilder;

/* renamed from: android.support.v7.app.ar */
final class C0216ar implements C0287ad {

    /* renamed from: a */
    final /* synthetic */ C0213ao f705a;

    /* renamed from: b */
    private boolean f706b;

    C0216ar(C0213ao aoVar) {
        this.f705a = aoVar;
    }

    /* renamed from: a */
    public final void mo3232a(MenuBuilder menuBuilder, boolean z) {
        if (!this.f706b) {
            this.f706b = true;
            this.f705a.f695a.mo4394m();
            if (this.f705a.f697c != null) {
                this.f705a.f697c.onPanelClosed(108, menuBuilder);
            }
            this.f706b = false;
        }
    }

    /* renamed from: a */
    public final boolean mo3233a(MenuBuilder menuBuilder) {
        if (this.f705a.f697c == null) {
            return false;
        }
        this.f705a.f697c.onMenuOpened(108, menuBuilder);
        return true;
    }
}
