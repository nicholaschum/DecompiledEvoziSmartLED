package android.support.p010v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.w */
final class C0318w extends C0300e<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0314s f1231a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0318w(C0314s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        super(onMenuItemClickListener);
        this.f1231a = sVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return ((MenuItem.OnMenuItemClickListener) this.f1166b).onMenuItemClick(this.f1231a.mo3773a(menuItem));
    }
}
