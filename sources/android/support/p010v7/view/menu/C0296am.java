package android.support.p010v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p007v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.am */
final class C0296am extends C0291ah implements SubMenu {
    C0296am(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
    }

    public final void clearHeader() {
        ((SupportSubMenu) this.f1166b).clearHeader();
    }

    public final MenuItem getItem() {
        return mo3773a(((SupportSubMenu) this.f1166b).getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        ((SupportSubMenu) this.f1166b).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((SupportSubMenu) this.f1166b).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        ((SupportSubMenu) this.f1166b).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((SupportSubMenu) this.f1166b).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((SupportSubMenu) this.f1166b).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        ((SupportSubMenu) this.f1166b).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((SupportSubMenu) this.f1166b).setIcon(drawable);
        return this;
    }
}
