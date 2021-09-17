package android.support.p010v7.view.menu;

import android.content.Context;
import android.support.p007v4.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.t */
class C0315t extends ActionProvider {

    /* renamed from: a */
    final android.view.ActionProvider f1227a;

    /* renamed from: b */
    final /* synthetic */ C0314s f1228b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0315t(C0314s sVar, Context context, android.view.ActionProvider actionProvider) {
        super(context);
        this.f1228b = sVar;
        this.f1227a = actionProvider;
    }

    public boolean hasSubMenu() {
        return this.f1227a.hasSubMenu();
    }

    public View onCreateActionView() {
        return this.f1227a.onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return this.f1227a.onPerformDefaultAction();
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
        this.f1227a.onPrepareSubMenu(this.f1228b.mo3774a(subMenu));
    }
}
