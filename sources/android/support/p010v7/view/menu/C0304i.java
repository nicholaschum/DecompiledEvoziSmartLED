package android.support.p010v7.view.menu;

import android.os.SystemClock;
import android.support.p010v7.widget.C0371bu;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.i */
final class C0304i implements C0371bu {

    /* renamed from: a */
    final /* synthetic */ C0301f f1196a;

    C0304i(C0301f fVar) {
        this.f1196a = fVar;
    }

    /* renamed from: a */
    public final void mo3784a(MenuBuilder menuBuilder, MenuItem menuItem) {
        this.f1196a.f1169a.removeCallbacksAndMessages(menuBuilder);
    }

    /* renamed from: b */
    public final void mo3785b(MenuBuilder menuBuilder, MenuItem menuItem) {
        C0306k kVar = null;
        this.f1196a.f1169a.removeCallbacksAndMessages((Object) null);
        int size = this.f1196a.f1170b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == this.f1196a.f1170b.get(i).f1202b) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < this.f1196a.f1170b.size()) {
                kVar = this.f1196a.f1170b.get(i2);
            }
            this.f1196a.f1169a.postAtTime(new C0305j(this, kVar, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
        }
    }
}
