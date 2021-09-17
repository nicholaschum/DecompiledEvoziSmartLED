package android.support.p010v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.SubMenuBuilder */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* renamed from: d */
    private MenuBuilder f1114d;

    /* renamed from: e */
    private MenuItemImpl f1115e;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f1114d = menuBuilder;
        this.f1115e = menuItemImpl;
    }

    /* renamed from: a */
    public final void mo3576a(C0310o oVar) {
        this.f1114d.mo3576a(oVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3579a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.mo3579a(menuBuilder, menuItem) || this.f1114d.mo3579a(menuBuilder, menuItem);
    }

    /* renamed from: a */
    public final boolean mo3580a(MenuItemImpl menuItemImpl) {
        return this.f1114d.mo3580a(menuItemImpl);
    }

    /* renamed from: b */
    public final String mo3593b() {
        int itemId = this.f1115e != null ? this.f1115e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo3593b() + ":" + itemId;
    }

    /* renamed from: b */
    public final boolean mo3597b(MenuItemImpl menuItemImpl) {
        return this.f1114d.mo3597b(menuItemImpl);
    }

    /* renamed from: c */
    public final boolean mo3599c() {
        return this.f1114d.mo3599c();
    }

    /* renamed from: d */
    public final boolean mo3603d() {
        return this.f1114d.mo3603d();
    }

    /* renamed from: e */
    public final boolean mo3604e() {
        return this.f1114d.mo3604e();
    }

    public MenuItem getItem() {
        return this.f1115e;
    }

    /* renamed from: p */
    public final MenuBuilder mo3619p() {
        return this.f1114d.mo3619p();
    }

    /* renamed from: s */
    public final Menu mo3684s() {
        return this.f1114d;
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1114d.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo3592b(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo3570a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo3569a(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo3572a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo3571a(view);
    }

    public SubMenu setIcon(int i) {
        this.f1115e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1115e.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1114d.setQwertyMode(z);
    }
}
