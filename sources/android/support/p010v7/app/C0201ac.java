package android.support.p010v7.app;

import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: android.support.v7.app.ac */
final class C0201ac implements C0272c {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f668a;

    /* renamed from: b */
    private C0272c f669b;

    public C0201ac(AppCompatDelegateImpl appCompatDelegateImpl, C0272c cVar) {
        this.f668a = appCompatDelegateImpl;
        this.f669b = cVar;
    }

    /* renamed from: a */
    public final void mo3234a(C0271b bVar) {
        this.f669b.mo3234a(bVar);
        if (this.f668a.f625j != null) {
            this.f668a.f617b.getDecorView().removeCallbacks(this.f668a.f626k);
        }
        if (this.f668a.f624i != null) {
            this.f668a.mo3215o();
            this.f668a.f627l = ViewCompat.animate(this.f668a.f624i).alpha(0.0f);
            this.f668a.f627l.setListener(new C0202ad(this));
        }
        if (this.f668a.f620e != null) {
            this.f668a.f620e.onSupportActionModeFinished(this.f668a.f623h);
        }
        this.f668a.f623h = null;
    }

    /* renamed from: a */
    public final boolean mo3235a(C0271b bVar, Menu menu) {
        return this.f669b.mo3235a(bVar, menu);
    }

    /* renamed from: a */
    public final boolean mo3236a(C0271b bVar, MenuItem menuItem) {
        return this.f669b.mo3236a(bVar, menuItem);
    }

    /* renamed from: b */
    public final boolean mo3237b(C0271b bVar, Menu menu) {
        return this.f669b.mo3237b(bVar, menu);
    }
}
