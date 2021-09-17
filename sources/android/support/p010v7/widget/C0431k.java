package android.support.p010v7.widget;

import android.support.p010v7.view.menu.C0292ai;
import android.view.View;

/* renamed from: android.support.v7.widget.k */
final class C0431k extends C0361bk {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1886a;

    /* renamed from: b */
    final /* synthetic */ C0430j f1887b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0431k(C0430j jVar, View view, ActionMenuPresenter actionMenuPresenter) {
        super(view);
        this.f1887b = jVar;
        this.f1886a = actionMenuPresenter;
    }

    /* renamed from: a */
    public final C0292ai mo3692a() {
        if (this.f1887b.f1884a.f1298h == null) {
            return null;
        }
        return this.f1887b.f1884a.f1298h.mo3701c();
    }

    /* renamed from: b */
    public final boolean mo3693b() {
        this.f1887b.f1884a.mo3958f();
        return true;
    }

    /* renamed from: c */
    public final boolean mo4265c() {
        if (this.f1887b.f1884a.f1300j != null) {
            return false;
        }
        this.f1887b.f1884a.mo3959g();
        return true;
    }
}
