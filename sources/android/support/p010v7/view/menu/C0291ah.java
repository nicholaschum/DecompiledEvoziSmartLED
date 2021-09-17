package android.support.p010v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p007v4.internal.view.SupportMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.ah */
class C0291ah extends C0299d<SupportMenu> implements Menu {
    C0291ah(Context context, SupportMenu supportMenu) {
        super(context, supportMenu);
    }

    public MenuItem add(int i) {
        return mo3773a(((SupportMenu) this.f1166b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3773a(((SupportMenu) this.f1166b).add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3773a(((SupportMenu) this.f1166b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3773a(((SupportMenu) this.f1166b).add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = ((SupportMenu) this.f1166b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo3773a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return mo3774a(((SupportMenu) this.f1166b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo3774a(((SupportMenu) this.f1166b).addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo3774a(((SupportMenu) this.f1166b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo3774a(((SupportMenu) this.f1166b).addSubMenu(charSequence));
    }

    public void clear() {
        mo3775a();
        ((SupportMenu) this.f1166b).clear();
    }

    public void close() {
        ((SupportMenu) this.f1166b).close();
    }

    public MenuItem findItem(int i) {
        return mo3773a(((SupportMenu) this.f1166b).findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo3773a(((SupportMenu) this.f1166b).getItem(i));
    }

    public boolean hasVisibleItems() {
        return ((SupportMenu) this.f1166b).hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((SupportMenu) this.f1166b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((SupportMenu) this.f1166b).performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((SupportMenu) this.f1166b).performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo3776a(i);
        ((SupportMenu) this.f1166b).removeGroup(i);
    }

    public void removeItem(int i) {
        mo3777b(i);
        ((SupportMenu) this.f1166b).removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((SupportMenu) this.f1166b).setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((SupportMenu) this.f1166b).setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        ((SupportMenu) this.f1166b).setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        ((SupportMenu) this.f1166b).setQwertyMode(z);
    }

    public int size() {
        return ((SupportMenu) this.f1166b).size();
    }
}
