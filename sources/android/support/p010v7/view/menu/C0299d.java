package android.support.p010v7.view.menu;

import android.content.Context;
import android.support.p007v4.internal.view.SupportMenuItem;
import android.support.p007v4.internal.view.SupportSubMenu;
import android.support.p007v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.d */
abstract class C0299d<T> extends C0300e<T> {

    /* renamed from: a */
    final Context f1163a;

    /* renamed from: c */
    private Map<SupportMenuItem, MenuItem> f1164c;

    /* renamed from: d */
    private Map<SupportSubMenu, SubMenu> f1165d;

    C0299d(Context context, T t) {
        super(t);
        this.f1163a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo3773a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f1164c == null) {
            this.f1164c = new ArrayMap();
        }
        MenuItem menuItem2 = this.f1164c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C0290ag.m690a(this.f1163a, supportMenuItem);
        this.f1164c.put(supportMenuItem, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo3774a(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f1165d == null) {
            this.f1165d = new ArrayMap();
        }
        SubMenu subMenu2 = this.f1165d.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0296am amVar = new C0296am(this.f1163a, supportSubMenu);
        this.f1165d.put(supportSubMenu, amVar);
        return amVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3775a() {
        if (this.f1164c != null) {
            this.f1164c.clear();
        }
        if (this.f1165d != null) {
            this.f1165d.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3776a(int i) {
        if (this.f1164c != null) {
            Iterator<SupportMenuItem> it = this.f1164c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3777b(int i) {
        if (this.f1164c != null) {
            Iterator<SupportMenuItem> it = this.f1164c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
