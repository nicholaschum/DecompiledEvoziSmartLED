package android.support.p010v7.app;

import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.Window;

/* renamed from: android.support.v7.app.ab */
final class C0200ab implements C0287ad {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f667a;

    C0200ab(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f667a = appCompatDelegateImpl;
    }

    /* renamed from: a */
    public final void mo3232a(MenuBuilder menuBuilder, boolean z) {
        this.f667a.mo3196b(menuBuilder);
    }

    /* renamed from: a */
    public final boolean mo3233a(MenuBuilder menuBuilder) {
        Window.Callback callback = this.f667a.f617b.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuBuilder);
        return true;
    }
}
