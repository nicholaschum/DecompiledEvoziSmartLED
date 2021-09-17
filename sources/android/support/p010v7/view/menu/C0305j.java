package android.support.p010v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.j */
final class C0305j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0306k f1197a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f1198b;

    /* renamed from: c */
    final /* synthetic */ MenuBuilder f1199c;

    /* renamed from: d */
    final /* synthetic */ C0304i f1200d;

    C0305j(C0304i iVar, C0306k kVar, MenuItem menuItem, MenuBuilder menuBuilder) {
        this.f1200d = iVar;
        this.f1197a = kVar;
        this.f1198b = menuItem;
        this.f1199c = menuBuilder;
    }

    public final void run() {
        if (this.f1197a != null) {
            this.f1200d.f1196a.f1174f = true;
            this.f1197a.f1202b.mo3578a(false);
            this.f1200d.f1196a.f1174f = false;
        }
        if (this.f1198b.isEnabled() && this.f1198b.hasSubMenu()) {
            this.f1199c.mo3581a(this.f1198b, 4);
        }
    }
}
