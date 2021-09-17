package android.support.p010v7.widget;

import android.content.Context;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.view.menu.C0284aa;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.support.p010v7.view.menu.SubMenuBuilder;
import android.view.View;

/* renamed from: android.support.v7.widget.g */
final class C0427g extends C0284aa {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1880a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0427g(ActionMenuPresenter actionMenuPresenter, Context context, SubMenuBuilder subMenuBuilder, View view) {
        super(context, subMenuBuilder, view, false, C0188b.actionOverflowMenuStyle);
        this.f1880a = actionMenuPresenter;
        if (!((MenuItemImpl) subMenuBuilder.getItem()).mo3644f()) {
            mo3696a(actionMenuPresenter.f1297g == null ? (View) actionMenuPresenter.f1158f : actionMenuPresenter.f1297g);
        }
        mo3695a((C0287ad) actionMenuPresenter.f1301k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo3704f() {
        this.f1880a.f1299i = null;
        this.f1880a.f1302l = 0;
        super.mo3704f();
    }
}
