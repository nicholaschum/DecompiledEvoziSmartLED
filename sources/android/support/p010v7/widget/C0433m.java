package android.support.p010v7.widget;

import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.view.menu.SubMenuBuilder;

/* renamed from: android.support.v7.widget.m */
final class C0433m implements C0287ad {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1889a;

    C0433m(ActionMenuPresenter actionMenuPresenter) {
        this.f1889a = actionMenuPresenter;
    }

    /* renamed from: a */
    public final void mo3232a(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder instanceof SubMenuBuilder) {
            menuBuilder.mo3619p().mo3578a(false);
        }
        C0287ad a = this.f1889a.mo3766a();
        if (a != null) {
            a.mo3232a(menuBuilder, z);
        }
    }

    /* renamed from: a */
    public final boolean mo3233a(MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            return false;
        }
        this.f1889a.f1302l = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
        C0287ad a = this.f1889a.mo3766a();
        if (a != null) {
            return a.mo3233a(menuBuilder);
        }
        return false;
    }
}
