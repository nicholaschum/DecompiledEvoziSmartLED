package android.support.p010v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p010v7.view.menu.MenuBuilder;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.bv */
public final class C0372bv extends ListPopupWindow implements C0371bu {

    /* renamed from: a */
    private static Method f1731a;

    /* renamed from: b */
    private C0371bu f1732b;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f1731a = cls.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0372bv(Context context, int i, int i2) {
        super(context, (AttributeSet) null, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0356bf mo4134a(Context context, boolean z) {
        C0373bw bwVar = new C0373bw(context, z);
        bwVar.mo4433a(this);
        return bwVar;
    }

    /* renamed from: a */
    public final void mo3784a(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (this.f1732b != null) {
            this.f1732b.mo3784a(menuBuilder, menuItem);
        }
    }

    /* renamed from: a */
    public final void mo4429a(C0371bu buVar) {
        this.f1732b = buVar;
    }

    /* renamed from: b */
    public final void mo4430b() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1437g.setEnterTransition((Transition) null);
        }
    }

    /* renamed from: b */
    public final void mo3785b(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (this.f1732b != null) {
            this.f1732b.mo3785b(menuBuilder, menuItem);
        }
    }

    /* renamed from: f */
    public final void mo4431f() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1437g.setExitTransition((Transition) null);
        }
    }

    /* renamed from: s */
    public final void mo4432s() {
        if (f1731a != null) {
            try {
                f1731a.invoke(this.f1437g, new Object[]{Boolean.FALSE});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
