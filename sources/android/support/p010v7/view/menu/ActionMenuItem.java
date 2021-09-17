package android.support.p010v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.content.ContextCompat;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItem */
public class ActionMenuItem implements SupportMenuItem {

    /* renamed from: a */
    private final int f1003a;

    /* renamed from: b */
    private final int f1004b;

    /* renamed from: c */
    private final int f1005c;

    /* renamed from: d */
    private final int f1006d;

    /* renamed from: e */
    private CharSequence f1007e;

    /* renamed from: f */
    private CharSequence f1008f;

    /* renamed from: g */
    private Intent f1009g;

    /* renamed from: h */
    private char f1010h;

    /* renamed from: i */
    private int f1011i = 4096;

    /* renamed from: j */
    private char f1012j;

    /* renamed from: k */
    private int f1013k = 4096;

    /* renamed from: l */
    private Drawable f1014l;

    /* renamed from: m */
    private int f1015m = 0;

    /* renamed from: n */
    private Context f1016n;

    /* renamed from: o */
    private MenuItem.OnMenuItemClickListener f1017o;

    /* renamed from: p */
    private CharSequence f1018p;

    /* renamed from: q */
    private CharSequence f1019q;

    /* renamed from: r */
    private ColorStateList f1020r = null;

    /* renamed from: s */
    private PorterDuff.Mode f1021s = null;

    /* renamed from: t */
    private boolean f1022t = false;

    /* renamed from: u */
    private boolean f1023u = false;

    /* renamed from: v */
    private int f1024v = 16;

    public ActionMenuItem(Context context, CharSequence charSequence) {
        this.f1016n = context;
        this.f1003a = 16908332;
        this.f1004b = 0;
        this.f1005c = 0;
        this.f1006d = 0;
        this.f1007e = charSequence;
    }

    /* renamed from: a */
    private void m562a() {
        if (this.f1014l == null) {
            return;
        }
        if (this.f1022t || this.f1023u) {
            this.f1014l = DrawableCompat.wrap(this.f1014l);
            this.f1014l = this.f1014l.mutate();
            if (this.f1022t) {
                DrawableCompat.setTintList(this.f1014l, this.f1020r);
            }
            if (this.f1023u) {
                DrawableCompat.setTintMode(this.f1014l, this.f1021s);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1013k;
    }

    public char getAlphabeticShortcut() {
        return this.f1012j;
    }

    public CharSequence getContentDescription() {
        return this.f1018p;
    }

    public int getGroupId() {
        return this.f1004b;
    }

    public Drawable getIcon() {
        return this.f1014l;
    }

    public ColorStateList getIconTintList() {
        return this.f1020r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1021s;
    }

    public Intent getIntent() {
        return this.f1009g;
    }

    public int getItemId() {
        return this.f1003a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1011i;
    }

    public char getNumericShortcut() {
        return this.f1010h;
    }

    public int getOrder() {
        return this.f1006d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public android.support.p007v4.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1007e;
    }

    public CharSequence getTitleCondensed() {
        return this.f1008f != null ? this.f1008f : this.f1007e;
    }

    public CharSequence getTooltipText() {
        return this.f1019q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1024v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1024v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1024v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1024v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1012j = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1012j = Character.toLowerCase(c);
        this.f1013k = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1024v = z | (this.f1024v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1024v = (z ? 2 : 0) | (this.f1024v & -3);
        return this;
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f1018p = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1024v = (z ? 16 : 0) | (this.f1024v & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1015m = i;
        this.f1014l = ContextCompat.getDrawable(this.f1016n, i);
        m562a();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1014l = drawable;
        this.f1015m = 0;
        m562a();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1020r = colorStateList;
        this.f1022t = true;
        m562a();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1021s = mode;
        this.f1023u = true;
        m562a();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1009g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1010h = c;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1010h = c;
        this.f1011i = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1017o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1010h = c;
        this.f1012j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1010h = c;
        this.f1011i = KeyEvent.normalizeMetaState(i);
        this.f1012j = Character.toLowerCase(c2);
        this.f1013k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public SupportMenuItem setSupportActionProvider(android.support.p007v4.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setTitle(int i) {
        this.f1007e = this.f1016n.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1007e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1008f = charSequence;
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f1019q = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1024v & 8;
        if (z) {
            i = 0;
        }
        this.f1024v = i2 | i;
        return this;
    }
}
