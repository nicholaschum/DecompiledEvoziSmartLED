package android.support.p010v7.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.c */
public abstract class C0298c implements C0286ac {

    /* renamed from: a */
    protected Context f1153a;

    /* renamed from: b */
    protected Context f1154b;

    /* renamed from: c */
    protected MenuBuilder f1155c;

    /* renamed from: d */
    protected LayoutInflater f1156d;

    /* renamed from: e */
    protected LayoutInflater f1157e;

    /* renamed from: f */
    protected C0288ae f1158f;

    /* renamed from: g */
    private C0287ad f1159g;

    /* renamed from: h */
    private int f1160h;

    /* renamed from: i */
    private int f1161i;

    /* renamed from: j */
    private int f1162j;

    public C0298c(Context context, int i, int i2) {
        this.f1153a = context;
        this.f1156d = LayoutInflater.from(context);
        this.f1160h = i;
        this.f1161i = i2;
    }

    /* renamed from: a */
    public final C0287ad mo3766a() {
        return this.f1159g;
    }

    /* renamed from: a */
    public C0288ae mo3767a(ViewGroup viewGroup) {
        if (this.f1158f == null) {
            this.f1158f = (C0288ae) this.f1156d.inflate(this.f1160h, viewGroup, false);
            this.f1158f.mo3559a(this.f1155c);
            mo3710a(true);
        }
        return this.f1158f;
    }

    /* renamed from: a */
    public View mo3768a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        if (!(view instanceof C0289af)) {
            view = this.f1156d.inflate(this.f1161i, viewGroup, false);
        }
        C0289af afVar = (C0289af) view;
        mo3770a(menuItemImpl, afVar);
        return (View) afVar;
    }

    /* renamed from: a */
    public final void mo3769a(int i) {
        this.f1162j = i;
    }

    /* renamed from: a */
    public void mo3707a(Context context, MenuBuilder menuBuilder) {
        this.f1154b = context;
        this.f1157e = LayoutInflater.from(this.f1154b);
        this.f1155c = menuBuilder;
    }

    /* renamed from: a */
    public void mo3708a(MenuBuilder menuBuilder, boolean z) {
        if (this.f1159g != null) {
            this.f1159g.mo3232a(menuBuilder, z);
        }
    }

    /* renamed from: a */
    public abstract void mo3770a(MenuItemImpl menuItemImpl, C0289af afVar);

    /* renamed from: a */
    public final void mo3709a(C0287ad adVar) {
        this.f1159g = adVar;
    }

    /* renamed from: a */
    public void mo3710a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1158f;
        if (viewGroup != null) {
            int i = 0;
            if (this.f1155c != null) {
                this.f1155c.mo3616m();
                ArrayList<MenuItemImpl> l = this.f1155c.mo3615l();
                int size = l.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl = l.get(i3);
                    if (mo3771a(menuItemImpl)) {
                        View childAt = viewGroup.getChildAt(i2);
                        MenuItemImpl a = childAt instanceof C0289af ? ((C0289af) childAt).mo3545a() : null;
                        View a2 = mo3768a(menuItemImpl, childAt, viewGroup);
                        if (menuItemImpl != a) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f1158f).addView(a2, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo3772a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo3771a(MenuItemImpl menuItemImpl) {
        return true;
    }

    /* renamed from: a */
    public boolean mo3711a(SubMenuBuilder subMenuBuilder) {
        if (this.f1159g != null) {
            return this.f1159g.mo3233a(subMenuBuilder);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3772a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public boolean mo3712b() {
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
}
