package android.support.p010v7.widget;

import android.content.Context;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.view.menu.C0284aa;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.View;

/* renamed from: android.support.v7.widget.l */
final class C0432l extends C0284aa {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1888a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0432l(ActionMenuPresenter actionMenuPresenter, Context context, MenuBuilder menuBuilder, View view) {
        super(context, menuBuilder, view, true, C0188b.actionOverflowMenuStyle);
        this.f1888a = actionMenuPresenter;
        mo3694a();
        mo3695a((C0287ad) actionMenuPresenter.f1301k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo3704f() {
        if (this.f1888a.f1155c != null) {
            this.f1888a.f1155c.close();
        }
        this.f1888a.f1298h = null;
        super.mo3704f();
    }
}
