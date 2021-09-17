package android.support.p010v7.widget;

import android.content.Context;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.C0273d;
import android.support.p010v7.view.menu.C0286ac;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.support.p010v7.view.menu.SubMenuBuilder;
import android.support.p010v7.widget.Toolbar;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.dg */
final class C0411dg implements C0286ac {

    /* renamed from: a */
    MenuBuilder f1831a;

    /* renamed from: b */
    MenuItemImpl f1832b;

    /* renamed from: c */
    final /* synthetic */ Toolbar f1833c;

    C0411dg(Toolbar toolbar) {
        this.f1833c = toolbar;
    }

    /* renamed from: a */
    public final void mo3707a(Context context, MenuBuilder menuBuilder) {
        if (!(this.f1831a == null || this.f1832b == null)) {
            this.f1831a.mo3597b(this.f1832b);
        }
        this.f1831a = menuBuilder;
    }

    /* renamed from: a */
    public final void mo3708a(MenuBuilder menuBuilder, boolean z) {
    }

    /* renamed from: a */
    public final void mo3709a(C0287ad adVar) {
    }

    /* renamed from: a */
    public final void mo3710a(boolean z) {
        if (this.f1832b != null) {
            boolean z2 = false;
            if (this.f1831a != null) {
                int size = this.f1831a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.f1831a.getItem(i) == this.f1832b) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (!z2) {
                mo3714c(this.f1832b);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo3711a(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo3712b() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo3713b(MenuItemImpl menuItemImpl) {
        this.f1833c.mo4240n();
        ViewParent parent = this.f1833c.f1570a.getParent();
        if (parent != this.f1833c) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1833c.f1570a);
            }
            this.f1833c.addView(this.f1833c.f1570a);
        }
        this.f1833c.f1571b = menuItemImpl.getActionView();
        this.f1832b = menuItemImpl;
        ViewParent parent2 = this.f1833c.f1571b.getParent();
        if (parent2 != this.f1833c) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.f1833c.f1571b);
            }
            Toolbar.LayoutParams o = Toolbar.m1029o();
            o.f539a = 8388611 | (this.f1833c.f1572c & C0197k.f315aL);
            o.f1596b = 2;
            this.f1833c.f1571b.setLayoutParams(o);
            this.f1833c.addView(this.f1833c.f1571b);
        }
        this.f1833c.mo4250q();
        this.f1833c.requestLayout();
        menuItemImpl.mo3642e(true);
        if (this.f1833c.f1571b instanceof C0273d) {
            ((C0273d) this.f1833c.f1571b).mo3468a();
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo3714c(MenuItemImpl menuItemImpl) {
        if (this.f1833c.f1571b instanceof C0273d) {
            ((C0273d) this.f1833c.f1571b).mo3469b();
        }
        this.f1833c.removeView(this.f1833c.f1571b);
        this.f1833c.removeView(this.f1833c.f1570a);
        this.f1833c.f1571b = null;
        this.f1833c.mo4251r();
        this.f1832b = null;
        this.f1833c.requestLayout();
        menuItemImpl.mo3642e(false);
        return true;
    }
}
