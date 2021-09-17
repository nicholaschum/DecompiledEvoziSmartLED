package android.support.p010v7.view.menu;

import android.content.DialogInterface;
import android.support.p007v4.view.PointerIconCompat;
import android.support.p010v7.app.C0240o;
import android.support.p010v7.app.C0241p;
import android.support.p010v7.p011a.C0194h;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: android.support.v7.view.menu.q */
final class C0312q implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, C0287ad {

    /* renamed from: a */
    C0307l f1221a;

    /* renamed from: b */
    private MenuBuilder f1222b;

    /* renamed from: c */
    private C0240o f1223c;

    /* renamed from: d */
    private C0287ad f1224d;

    public C0312q(MenuBuilder menuBuilder) {
        this.f1222b = menuBuilder;
    }

    /* renamed from: a */
    public final void mo3804a() {
        MenuBuilder menuBuilder = this.f1222b;
        C0241p pVar = new C0241p(menuBuilder.mo3605f());
        this.f1221a = new C0307l(pVar.mo3315a(), C0194h.abc_list_menu_item_layout);
        this.f1221a.mo3709a((C0287ad) this);
        this.f1222b.mo3574a((C0286ac) this.f1221a);
        pVar.mo3321a(this.f1221a.mo3788a(), (DialogInterface.OnClickListener) this);
        View view = menuBuilder.f1060c;
        if (view != null) {
            pVar.mo3320a(view);
        } else {
            pVar.mo3319a(menuBuilder.f1059b).mo3322a(menuBuilder.f1058a);
        }
        pVar.mo3318a((DialogInterface.OnKeyListener) this);
        this.f1223c = pVar.mo3328c();
        this.f1223c.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1223c.getWindow().getAttributes();
        attributes.type = PointerIconCompat.TYPE_HELP;
        attributes.flags |= 131072;
        this.f1223c.show();
    }

    /* renamed from: a */
    public final void mo3232a(MenuBuilder menuBuilder, boolean z) {
        if ((z || menuBuilder == this.f1222b) && this.f1223c != null) {
            this.f1223c.dismiss();
        }
        if (this.f1224d != null) {
            this.f1224d.mo3232a(menuBuilder, z);
        }
    }

    /* renamed from: a */
    public final boolean mo3233a(MenuBuilder menuBuilder) {
        if (this.f1224d != null) {
            return this.f1224d.mo3233a(menuBuilder);
        }
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f1222b.mo3581a((MenuItem) (MenuItemImpl) this.f1221a.mo3788a().getItem(i), 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f1221a.mo3708a(this.f1222b, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1223c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1223c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1222b.mo3578a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1222b.performShortcut(i, keyEvent, 0);
    }
}
