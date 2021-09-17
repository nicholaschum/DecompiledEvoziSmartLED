package android.support.p010v7.app;

import android.os.Build;
import android.support.p010v7.app.AppCompatDelegateImpl;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.support.p010v7.view.C0277h;
import android.support.p010v7.view.C0322n;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: android.support.v7.app.ae */
final class C0203ae extends C0322n {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f671a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0203ae(AppCompatDelegateImpl appCompatDelegateImpl, Window.Callback callback) {
        super(callback);
        this.f671a = appCompatDelegateImpl;
    }

    /* renamed from: a */
    private ActionMode m287a(ActionMode.Callback callback) {
        C0277h hVar = new C0277h(this.f671a.f616a, callback);
        C0271b a = this.f671a.mo3179a((C0272c) hVar);
        if (a != null) {
            return hVar.mo3494b(a);
        }
        return null;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f671a.mo3192a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f671a.mo3190a(keyEvent.getKeyCode(), keyEvent);
    }

    public final void onContentChanged() {
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuBuilder)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f671a.mo3203e(i);
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        this.f671a.mo3201d(i);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
        if (i == 0 && menuBuilder == null) {
            return false;
        }
        if (menuBuilder != null) {
            menuBuilder.mo3598c(true);
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (menuBuilder != null) {
            menuBuilder.mo3598c(false);
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        AppCompatDelegateImpl.PanelFeatureState f = this.f671a.mo3204f(0);
        if (f == null || f.f648j == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        } else {
            super.onProvideKeyboardShortcuts(list, f.f648j, i);
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        return this.f671a.mo3214n() ? m287a(callback) : super.onWindowStartingActionMode(callback);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return (!this.f671a.mo3214n() || i != 0) ? super.onWindowStartingActionMode(callback, i) : m287a(callback);
    }
}
