package android.support.p010v7.view.menu;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.m */
final class C0308m extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ C0307l f1213a;

    /* renamed from: b */
    private int f1214b = -1;

    public C0308m(C0307l lVar) {
        this.f1213a = lVar;
        m769a();
    }

    /* renamed from: a */
    private void m769a() {
        MenuItemImpl r = this.f1213a.f1206c.mo3623r();
        if (r != null) {
            ArrayList<MenuItemImpl> o = this.f1213a.f1206c.mo3618o();
            int size = o.size();
            for (int i = 0; i < size; i++) {
                if (o.get(i) == r) {
                    this.f1214b = i;
                    return;
                }
            }
        }
        this.f1214b = -1;
    }

    /* renamed from: a */
    public final MenuItemImpl getItem(int i) {
        ArrayList<MenuItemImpl> o = this.f1213a.f1206c.mo3618o();
        int i2 = i + this.f1213a.f1208e;
        if (this.f1214b >= 0 && i2 >= this.f1214b) {
            i2++;
        }
        return o.get(i2);
    }

    public final int getCount() {
        int size = this.f1213a.f1206c.mo3618o().size() - this.f1213a.f1208e;
        return this.f1214b < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1213a.f1205b.inflate(this.f1213a.f1210g, viewGroup, false);
        }
        ((C0289af) view).mo3546a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        m769a();
        super.notifyDataSetChanged();
    }
}
