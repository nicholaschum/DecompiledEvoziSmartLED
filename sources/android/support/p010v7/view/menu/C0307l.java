package android.support.p010v7.view.menu;

import android.content.Context;
import android.support.p010v7.p011a.C0194h;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.view.menu.l */
public final class C0307l implements C0286ac, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1204a;

    /* renamed from: b */
    LayoutInflater f1205b;

    /* renamed from: c */
    MenuBuilder f1206c;

    /* renamed from: d */
    ExpandedMenuView f1207d;

    /* renamed from: e */
    int f1208e;

    /* renamed from: f */
    int f1209f;

    /* renamed from: g */
    int f1210g;

    /* renamed from: h */
    C0308m f1211h;

    /* renamed from: i */
    private C0287ad f1212i;

    private C0307l(int i) {
        this.f1210g = i;
        this.f1209f = 0;
    }

    public C0307l(Context context, int i) {
        this(i);
        this.f1204a = context;
        this.f1205b = LayoutInflater.from(this.f1204a);
    }

    /* renamed from: a */
    public final C0288ae mo3787a(ViewGroup viewGroup) {
        if (this.f1207d == null) {
            this.f1207d = (ExpandedMenuView) this.f1205b.inflate(C0194h.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1211h == null) {
                this.f1211h = new C0308m(this);
            }
            this.f1207d.setAdapter(this.f1211h);
            this.f1207d.setOnItemClickListener(this);
        }
        return this.f1207d;
    }

    /* renamed from: a */
    public final ListAdapter mo3788a() {
        if (this.f1211h == null) {
            this.f1211h = new C0308m(this);
        }
        return this.f1211h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r2.f1205b == null) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3707a(android.content.Context r3, android.support.p010v7.view.menu.MenuBuilder r4) {
        /*
            r2 = this;
            int r0 = r2.f1209f
            if (r0 == 0) goto L_0x0016
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f1209f
            r0.<init>(r3, r1)
            r2.f1204a = r0
        L_0x000d:
            android.content.Context r3 = r2.f1204a
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r2.f1205b = r3
            goto L_0x0021
        L_0x0016:
            android.content.Context r0 = r2.f1204a
            if (r0 == 0) goto L_0x0021
            r2.f1204a = r3
            android.view.LayoutInflater r3 = r2.f1205b
            if (r3 != 0) goto L_0x0021
            goto L_0x000d
        L_0x0021:
            r2.f1206c = r4
            android.support.v7.view.menu.m r3 = r2.f1211h
            if (r3 == 0) goto L_0x002c
            android.support.v7.view.menu.m r3 = r2.f1211h
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.view.menu.C0307l.mo3707a(android.content.Context, android.support.v7.view.menu.MenuBuilder):void");
    }

    /* renamed from: a */
    public final void mo3708a(MenuBuilder menuBuilder, boolean z) {
        if (this.f1212i != null) {
            this.f1212i.mo3232a(menuBuilder, z);
        }
    }

    /* renamed from: a */
    public final void mo3709a(C0287ad adVar) {
        this.f1212i = adVar;
    }

    /* renamed from: a */
    public final void mo3710a(boolean z) {
        if (this.f1211h != null) {
            this.f1211h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo3711a(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new C0312q(subMenuBuilder).mo3804a();
        if (this.f1212i == null) {
            return true;
        }
        this.f1212i.mo3233a(subMenuBuilder);
        return true;
    }

    /* renamed from: b */
    public final boolean mo3712b() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo3713b(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: c */
    public final boolean mo3714c(MenuItemImpl menuItemImpl) {
        return false;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1206c.mo3582a((MenuItem) this.f1211h.getItem(i), (C0286ac) this, 0);
    }
}
