package android.support.p010v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.menu.s */
public class C0314s extends C0299d<SupportMenuItem> implements MenuItem {

    /* renamed from: c */
    private Method f1226c;

    C0314s(Context context, SupportMenuItem supportMenuItem) {
        super(context, supportMenuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0315t mo3808a(ActionProvider actionProvider) {
        return new C0315t(this, this.f1163a, actionProvider);
    }

    /* renamed from: b */
    public final void mo3809b() {
        try {
            if (this.f1226c == null) {
                this.f1226c = ((SupportMenuItem) this.f1166b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1226c.invoke(this.f1166b, new Object[]{Boolean.TRUE});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((SupportMenuItem) this.f1166b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((SupportMenuItem) this.f1166b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        android.support.p007v4.view.ActionProvider supportActionProvider = ((SupportMenuItem) this.f1166b).getSupportActionProvider();
        if (supportActionProvider instanceof C0315t) {
            return ((C0315t) supportActionProvider).f1227a;
        }
        return null;
    }

    public View getActionView() {
        View actionView = ((SupportMenuItem) this.f1166b).getActionView();
        return actionView instanceof C0316u ? (View) ((C0316u) actionView).f1229a : actionView;
    }

    public int getAlphabeticModifiers() {
        return ((SupportMenuItem) this.f1166b).getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return ((SupportMenuItem) this.f1166b).getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return ((SupportMenuItem) this.f1166b).getContentDescription();
    }

    public int getGroupId() {
        return ((SupportMenuItem) this.f1166b).getGroupId();
    }

    public Drawable getIcon() {
        return ((SupportMenuItem) this.f1166b).getIcon();
    }

    public ColorStateList getIconTintList() {
        return ((SupportMenuItem) this.f1166b).getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return ((SupportMenuItem) this.f1166b).getIconTintMode();
    }

    public Intent getIntent() {
        return ((SupportMenuItem) this.f1166b).getIntent();
    }

    public int getItemId() {
        return ((SupportMenuItem) this.f1166b).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((SupportMenuItem) this.f1166b).getMenuInfo();
    }

    public int getNumericModifiers() {
        return ((SupportMenuItem) this.f1166b).getNumericModifiers();
    }

    public char getNumericShortcut() {
        return ((SupportMenuItem) this.f1166b).getNumericShortcut();
    }

    public int getOrder() {
        return ((SupportMenuItem) this.f1166b).getOrder();
    }

    public SubMenu getSubMenu() {
        return mo3774a(((SupportMenuItem) this.f1166b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((SupportMenuItem) this.f1166b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((SupportMenuItem) this.f1166b).getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return ((SupportMenuItem) this.f1166b).getTooltipText();
    }

    public boolean hasSubMenu() {
        return ((SupportMenuItem) this.f1166b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((SupportMenuItem) this.f1166b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((SupportMenuItem) this.f1166b).isCheckable();
    }

    public boolean isChecked() {
        return ((SupportMenuItem) this.f1166b).isChecked();
    }

    public boolean isEnabled() {
        return ((SupportMenuItem) this.f1166b).isEnabled();
    }

    public boolean isVisible() {
        return ((SupportMenuItem) this.f1166b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((SupportMenuItem) this.f1166b).setSupportActionProvider(actionProvider != null ? mo3808a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((SupportMenuItem) this.f1166b).setActionView(i);
        View actionView = ((SupportMenuItem) this.f1166b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((SupportMenuItem) this.f1166b).setActionView((View) new C0316u(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0316u(view);
        }
        ((SupportMenuItem) this.f1166b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((SupportMenuItem) this.f1166b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((SupportMenuItem) this.f1166b).setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((SupportMenuItem) this.f1166b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((SupportMenuItem) this.f1166b).setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((SupportMenuItem) this.f1166b).setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((SupportMenuItem) this.f1166b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((SupportMenuItem) this.f1166b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((SupportMenuItem) this.f1166b).setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((SupportMenuItem) this.f1166b).setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((SupportMenuItem) this.f1166b).setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((SupportMenuItem) this.f1166b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((SupportMenuItem) this.f1166b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((SupportMenuItem) this.f1166b).setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((SupportMenuItem) this.f1166b).setOnActionExpandListener(onActionExpandListener != null ? new C0317v(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((SupportMenuItem) this.f1166b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0318w(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((SupportMenuItem) this.f1166b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((SupportMenuItem) this.f1166b).setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((SupportMenuItem) this.f1166b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((SupportMenuItem) this.f1166b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((SupportMenuItem) this.f1166b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((SupportMenuItem) this.f1166b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((SupportMenuItem) this.f1166b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((SupportMenuItem) this.f1166b).setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((SupportMenuItem) this.f1166b).setVisible(z);
    }
}
