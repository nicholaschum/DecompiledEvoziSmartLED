package android.support.p010v7.app;

import android.support.p010v7.app.AppCompatDelegateImpl;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.Window;

/* renamed from: android.support.v7.app.aj */
final class C0208aj implements C0287ad {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f679a;

    C0208aj(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f679a = appCompatDelegateImpl;
    }

    /* renamed from: a */
    public final void mo3232a(MenuBuilder menuBuilder, boolean z) {
        MenuBuilder p = menuBuilder.mo3619p();
        boolean z2 = p != menuBuilder;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f679a;
        if (z2) {
            menuBuilder = p;
        }
        AppCompatDelegateImpl.PanelFeatureState a = appCompatDelegateImpl.mo3178a((Menu) menuBuilder);
        if (a == null) {
            return;
        }
        if (z2) {
            this.f679a.mo3181a(a.f639a, a, (Menu) p);
            this.f679a.mo3184a(a, true);
            return;
        }
        this.f679a.mo3184a(a, z);
    }

    /* renamed from: a */
    public final boolean mo3233a(MenuBuilder menuBuilder) {
        Window.Callback callback;
        if (menuBuilder != null || !this.f679a.f628m || (callback = this.f679a.f617b.getCallback()) == null || this.f679a.f633r) {
            return true;
        }
        callback.onMenuOpened(108, menuBuilder);
        return true;
    }
}
