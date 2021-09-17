package android.support.p010v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.v */
final class C0317v extends C0300e<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ C0314s f1230a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0317v(C0314s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        super(onActionExpandListener);
        this.f1230a = sVar;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.f1166b).onMenuItemActionCollapse(this.f1230a.mo3773a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return ((MenuItem.OnActionExpandListener) this.f1166b).onMenuItemActionExpand(this.f1230a.mo3773a(menuItem));
    }
}
