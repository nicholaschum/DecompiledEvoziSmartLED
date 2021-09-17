package android.support.p010v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.internal.view.SupportMenuItem;
import android.support.p007v4.view.ActionProvider;
import android.support.p010v7.p011a.C0195i;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.view.menu.MenuItemImpl */
public final class MenuItemImpl implements SupportMenuItem {

    /* renamed from: A */
    private View f1083A;

    /* renamed from: B */
    private ActionProvider f1084B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1085C;

    /* renamed from: D */
    private boolean f1086D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1087E;

    /* renamed from: a */
    MenuBuilder f1088a;

    /* renamed from: b */
    private final int f1089b;

    /* renamed from: c */
    private final int f1090c;

    /* renamed from: d */
    private final int f1091d;

    /* renamed from: e */
    private final int f1092e;

    /* renamed from: f */
    private CharSequence f1093f;

    /* renamed from: g */
    private CharSequence f1094g;

    /* renamed from: h */
    private Intent f1095h;

    /* renamed from: i */
    private char f1096i;

    /* renamed from: j */
    private int f1097j = 4096;

    /* renamed from: k */
    private char f1098k;

    /* renamed from: l */
    private int f1099l = 4096;

    /* renamed from: m */
    private Drawable f1100m;

    /* renamed from: n */
    private int f1101n = 0;

    /* renamed from: o */
    private SubMenuBuilder f1102o;

    /* renamed from: p */
    private Runnable f1103p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1104q;

    /* renamed from: r */
    private CharSequence f1105r;

    /* renamed from: s */
    private CharSequence f1106s;

    /* renamed from: t */
    private ColorStateList f1107t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1108u = null;

    /* renamed from: v */
    private boolean f1109v = false;

    /* renamed from: w */
    private boolean f1110w = false;

    /* renamed from: x */
    private boolean f1111x = false;

    /* renamed from: y */
    private int f1112y = 16;

    /* renamed from: z */
    private int f1113z = 0;

    MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1088a = menuBuilder;
        this.f1089b = i2;
        this.f1090c = i;
        this.f1091d = i3;
        this.f1092e = i4;
        this.f1093f = charSequence;
        this.f1113z = i5;
    }

    /* renamed from: a */
    private Drawable m628a(Drawable drawable) {
        if (drawable != null && this.f1111x && (this.f1109v || this.f1110w)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.f1109v) {
                DrawableCompat.setTintList(drawable, this.f1107t);
            }
            if (this.f1110w) {
                DrawableCompat.setTintMode(drawable, this.f1108u);
            }
            this.f1111x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public SupportMenuItem setActionView(View view) {
        this.f1083A = view;
        this.f1084B = null;
        if (view != null && view.getId() == -1 && this.f1089b > 0) {
            view.setId(this.f1089b);
        }
        this.f1088a.mo3614k();
        return this;
    }

    /* renamed from: a */
    private static void m630a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: k */
    private char m631k() {
        return this.f1088a.mo3603d() ? this.f1098k : this.f1096i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final CharSequence mo3631a(C0289af afVar) {
        return afVar.mo3549b() ? getTitleCondensed() : getTitle();
    }

    /* renamed from: a */
    public final void mo3632a(SubMenuBuilder subMenuBuilder) {
        this.f1102o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3633a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1087E = contextMenuInfo;
    }

    /* renamed from: a */
    public final void mo3634a(boolean z) {
        this.f1112y = (z ? 4 : 0) | (this.f1112y & -5);
    }

    /* renamed from: a */
    public final boolean mo3635a() {
        if ((this.f1104q != null && this.f1104q.onMenuItemClick(this)) || this.f1088a.mo3579a(this.f1088a, (MenuItem) this)) {
            return true;
        }
        if (this.f1103p != null) {
            this.f1103p.run();
            return true;
        }
        if (this.f1095h != null) {
            try {
                this.f1088a.mo3605f().startActivity(this.f1095h);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f1084B != null && this.f1084B.onPerformDefaultAction();
    }

    /* renamed from: b */
    public final int mo3636b() {
        return this.f1092e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3637b(boolean z) {
        int i = this.f1112y;
        this.f1112y = (z ? 2 : 0) | (this.f1112y & -3);
        if (i != this.f1112y) {
            this.f1088a.mo3596b(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo3638c() {
        int i;
        char k = m631k();
        if (k == 0) {
            return "";
        }
        Resources resources = this.f1088a.mo3605f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1088a.mo3605f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0195i.abc_prepend_shortcut_label));
        }
        int i2 = this.f1088a.mo3603d() ? this.f1099l : this.f1097j;
        m630a(sb, i2, 65536, resources.getString(C0195i.abc_menu_meta_shortcut_label));
        m630a(sb, i2, 4096, resources.getString(C0195i.abc_menu_ctrl_shortcut_label));
        m630a(sb, i2, 2, resources.getString(C0195i.abc_menu_alt_shortcut_label));
        m630a(sb, i2, 1, resources.getString(C0195i.abc_menu_shift_shortcut_label));
        m630a(sb, i2, 4, resources.getString(C0195i.abc_menu_sym_shortcut_label));
        m630a(sb, i2, 8, resources.getString(C0195i.abc_menu_function_shortcut_label));
        if (k == 8) {
            i = C0195i.abc_menu_delete_shortcut_label;
        } else if (k == 10) {
            i = C0195i.abc_menu_enter_shortcut_label;
        } else if (k != ' ') {
            sb.append(k);
            return sb.toString();
        } else {
            i = C0195i.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo3639c(boolean z) {
        int i = this.f1112y;
        this.f1112y = (z ? 0 : 8) | (this.f1112y & -9);
        return i != this.f1112y;
    }

    public final boolean collapseActionView() {
        if ((this.f1113z & 8) == 0) {
            return false;
        }
        if (this.f1083A == null) {
            return true;
        }
        if (this.f1085C == null || this.f1085C.onMenuItemActionCollapse(this)) {
            return this.f1088a.mo3597b(this);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo3640d(boolean z) {
        this.f1112y = z ? this.f1112y | 32 : this.f1112y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo3641d() {
        return this.f1088a.mo3604e() && m631k() != 0;
    }

    /* renamed from: e */
    public final void mo3642e(boolean z) {
        this.f1086D = z;
        this.f1088a.mo3596b(false);
    }

    /* renamed from: e */
    public final boolean mo3643e() {
        return (this.f1112y & 4) != 0;
    }

    public final boolean expandActionView() {
        if (!mo3665j()) {
            return false;
        }
        if (this.f1085C == null || this.f1085C.onMenuItemActionExpand(this)) {
            return this.f1088a.mo3580a(this);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo3644f() {
        return (this.f1112y & 32) == 32;
    }

    /* renamed from: g */
    public final boolean mo3645g() {
        return (this.f1113z & 1) == 1;
    }

    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        if (this.f1083A != null) {
            return this.f1083A;
        }
        if (this.f1084B == null) {
            return null;
        }
        this.f1083A = this.f1084B.onCreateActionView(this);
        return this.f1083A;
    }

    public final int getAlphabeticModifiers() {
        return this.f1099l;
    }

    public final char getAlphabeticShortcut() {
        return this.f1098k;
    }

    public final CharSequence getContentDescription() {
        return this.f1105r;
    }

    public final int getGroupId() {
        return this.f1090c;
    }

    public final Drawable getIcon() {
        Drawable b;
        if (this.f1100m != null) {
            b = this.f1100m;
        } else if (this.f1101n == 0) {
            return null;
        } else {
            b = C0252a.m419b(this.f1088a.mo3605f(), this.f1101n);
            this.f1101n = 0;
            this.f1100m = b;
        }
        return m628a(b);
    }

    public final ColorStateList getIconTintList() {
        return this.f1107t;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f1108u;
    }

    public final Intent getIntent() {
        return this.f1095h;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f1089b;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1087E;
    }

    public final int getNumericModifiers() {
        return this.f1097j;
    }

    public final char getNumericShortcut() {
        return this.f1096i;
    }

    public final int getOrder() {
        return this.f1091d;
    }

    public final SubMenu getSubMenu() {
        return this.f1102o;
    }

    public final ActionProvider getSupportActionProvider() {
        return this.f1084B;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f1093f;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1094g != null ? this.f1094g : this.f1093f;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public final CharSequence getTooltipText() {
        return this.f1106s;
    }

    /* renamed from: h */
    public final boolean mo3658h() {
        return (this.f1113z & 2) == 2;
    }

    public final boolean hasSubMenu() {
        return this.f1102o != null;
    }

    /* renamed from: i */
    public final boolean mo3660i() {
        return (this.f1113z & 4) == 4;
    }

    public final boolean isActionViewExpanded() {
        return this.f1086D;
    }

    public final boolean isCheckable() {
        return (this.f1112y & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f1112y & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f1112y & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.f1084B == null || !this.f1084B.overridesItemVisibility()) ? (this.f1112y & 8) == 0 : (this.f1112y & 8) == 0 && this.f1084B.isVisible();
    }

    /* renamed from: j */
    public final boolean mo3665j() {
        if ((this.f1113z & 8) != 0) {
            if (this.f1083A == null && this.f1084B != null) {
                this.f1083A = this.f1084B.onCreateActionView(this);
            }
            if (this.f1083A != null) {
                return true;
            }
        }
        return false;
    }

    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* synthetic */ MenuItem setActionView(int i) {
        Context f = this.f1088a.mo3605f();
        setActionView(LayoutInflater.from(f).inflate(i, new LinearLayout(f), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f1098k == c) {
            return this;
        }
        this.f1098k = Character.toLowerCase(c);
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1098k == c && this.f1099l == i) {
            return this;
        }
        this.f1098k = Character.toLowerCase(c);
        this.f1099l = KeyEvent.normalizeMetaState(i);
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f1112y;
        this.f1112y = z | (this.f1112y & true) ? 1 : 0;
        if (i != this.f1112y) {
            this.f1088a.mo3596b(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f1112y & 4) != 0) {
            this.f1088a.mo3577a((MenuItem) this);
        } else {
            mo3637b(z);
        }
        return this;
    }

    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f1105r = charSequence;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f1112y = z ? this.f1112y | 16 : this.f1112y & -17;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f1100m = null;
        this.f1101n = i;
        this.f1111x = true;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f1101n = 0;
        this.f1100m = drawable;
        this.f1111x = true;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1107t = colorStateList;
        this.f1109v = true;
        this.f1111x = true;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1108u = mode;
        this.f1110w = true;
        this.f1111x = true;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1095h = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f1096i == c) {
            return this;
        }
        this.f1096i = c;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f1096i == c && this.f1097j == i) {
            return this;
        }
        this.f1096i = c;
        this.f1097j = KeyEvent.normalizeMetaState(i);
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1085C = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1104q = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f1096i = c;
        this.f1098k = Character.toLowerCase(c2);
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1096i = c;
        this.f1097j = KeyEvent.normalizeMetaState(i);
        this.f1098k = Character.toLowerCase(c2);
        this.f1099l = KeyEvent.normalizeMetaState(i2);
        this.f1088a.mo3596b(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f1113z = i;
                this.f1088a.mo3614k();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        if (this.f1084B != null) {
            this.f1084B.reset();
        }
        this.f1083A = null;
        this.f1084B = actionProvider;
        this.f1088a.mo3596b(true);
        if (this.f1084B != null) {
            this.f1084B.setVisibilityListener(new C0313r(this));
        }
        return this;
    }

    public final MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1088a.mo3605f().getString(i));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1093f = charSequence;
        this.f1088a.mo3596b(false);
        if (this.f1102o != null) {
            this.f1102o.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1094g = charSequence;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f1106s = charSequence;
        this.f1088a.mo3596b(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo3639c(z)) {
            this.f1088a.mo3613j();
        }
        return this;
    }

    public final String toString() {
        if (this.f1093f != null) {
            return this.f1093f.toString();
        }
        return null;
    }
}
