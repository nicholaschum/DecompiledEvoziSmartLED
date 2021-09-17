package android.support.p010v7.view;

import android.content.Context;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p007v4.internal.view.SupportMenuItem;
import android.support.p007v4.util.SimpleArrayMap;
import android.support.p010v7.view.menu.C0290ag;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.h */
public final class C0277h implements C0272c {

    /* renamed from: a */
    final ActionMode.Callback f949a;

    /* renamed from: b */
    final Context f950b;

    /* renamed from: c */
    final ArrayList<C0276g> f951c = new ArrayList<>();

    /* renamed from: d */
    final SimpleArrayMap<Menu, Menu> f952d = new SimpleArrayMap<>();

    public C0277h(Context context, ActionMode.Callback callback) {
        this.f950b = context;
        this.f949a = callback;
    }

    /* renamed from: a */
    private Menu m537a(Menu menu) {
        Menu menu2 = this.f952d.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        Menu a = C0290ag.m689a(this.f950b, (SupportMenu) menu);
        this.f952d.put(menu, a);
        return a;
    }

    /* renamed from: a */
    public final void mo3234a(C0271b bVar) {
        this.f949a.onDestroyActionMode(mo3494b(bVar));
    }

    /* renamed from: a */
    public final boolean mo3235a(C0271b bVar, Menu menu) {
        return this.f949a.onCreateActionMode(mo3494b(bVar), m537a(menu));
    }

    /* renamed from: a */
    public final boolean mo3236a(C0271b bVar, MenuItem menuItem) {
        return this.f949a.onActionItemClicked(mo3494b(bVar), C0290ag.m690a(this.f950b, (SupportMenuItem) menuItem));
    }

    /* renamed from: b */
    public final ActionMode mo3494b(C0271b bVar) {
        int size = this.f951c.size();
        for (int i = 0; i < size; i++) {
            C0276g gVar = this.f951c.get(i);
            if (gVar != null && gVar.f948b == bVar) {
                return gVar;
            }
        }
        C0276g gVar2 = new C0276g(this.f950b, bVar);
        this.f951c.add(gVar2);
        return gVar2;
    }

    /* renamed from: b */
    public final boolean mo3237b(C0271b bVar, Menu menu) {
        return this.f949a.onPrepareActionMode(mo3494b(bVar), m537a(menu));
    }
}
