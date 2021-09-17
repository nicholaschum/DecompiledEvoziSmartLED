package android.support.p010v7.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.n */
public final class C0309n extends BaseAdapter {

    /* renamed from: a */
    MenuBuilder f1215a;

    /* renamed from: b */
    private int f1216b = -1;

    /* renamed from: c */
    private boolean f1217c;

    /* renamed from: d */
    private final boolean f1218d;

    /* renamed from: e */
    private final LayoutInflater f1219e;

    /* renamed from: f */
    private final int f1220f;

    public C0309n(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1218d = z;
        this.f1219e = layoutInflater;
        this.f1215a = menuBuilder;
        this.f1220f = i;
        m771b();
    }

    /* renamed from: b */
    private void m771b() {
        MenuItemImpl r = this.f1215a.mo3623r();
        if (r != null) {
            ArrayList<MenuItemImpl> o = this.f1215a.mo3618o();
            int size = o.size();
            for (int i = 0; i < size; i++) {
                if (o.get(i) == r) {
                    this.f1216b = i;
                    return;
                }
            }
        }
        this.f1216b = -1;
    }

    /* renamed from: a */
    public final MenuBuilder mo3796a() {
        return this.f1215a;
    }

    /* renamed from: a */
    public final MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> o = this.f1218d ? this.f1215a.mo3618o() : this.f1215a.mo3615l();
        if (this.f1216b >= 0 && i >= this.f1216b) {
            i++;
        }
        return o.get(i);
    }

    /* renamed from: a */
    public final void mo3798a(boolean z) {
        this.f1217c = z;
    }

    public final int getCount() {
        ArrayList<MenuItemImpl> o = this.f1218d ? this.f1215a.mo3618o() : this.f1215a.mo3615l();
        return this.f1216b < 0 ? o.size() : o.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.f1219e.inflate(this.f1220f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1215a.mo3599c() && groupId != groupId2) {
            z = true;
        }
        listMenuItemView.mo3563a(z);
        C0289af afVar = (C0289af) view;
        if (this.f1217c) {
            listMenuItemView.mo3565c();
        }
        afVar.mo3546a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        m771b();
        super.notifyDataSetChanged();
    }
}
