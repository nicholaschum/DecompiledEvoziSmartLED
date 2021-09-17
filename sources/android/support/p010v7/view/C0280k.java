package android.support.p010v7.view;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p007v4.view.ActionProvider;
import android.support.p007v4.view.MenuItemCompat;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.menu.C0314s;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.support.p010v7.widget.C0355be;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: android.support.v7.view.k */
final class C0280k {

    /* renamed from: A */
    private String f962A;

    /* renamed from: B */
    private String f963B;

    /* renamed from: C */
    private CharSequence f964C;

    /* renamed from: D */
    private CharSequence f965D;

    /* renamed from: E */
    private ColorStateList f966E = null;

    /* renamed from: F */
    private PorterDuff.Mode f967F = null;

    /* renamed from: a */
    ActionProvider f968a;

    /* renamed from: b */
    final /* synthetic */ C0278i f969b;

    /* renamed from: c */
    private Menu f970c;

    /* renamed from: d */
    private int f971d;

    /* renamed from: e */
    private int f972e;

    /* renamed from: f */
    private int f973f;

    /* renamed from: g */
    private int f974g;

    /* renamed from: h */
    private boolean f975h;

    /* renamed from: i */
    private boolean f976i;

    /* renamed from: j */
    private boolean f977j;

    /* renamed from: k */
    private int f978k;

    /* renamed from: l */
    private int f979l;

    /* renamed from: m */
    private CharSequence f980m;

    /* renamed from: n */
    private CharSequence f981n;

    /* renamed from: o */
    private int f982o;

    /* renamed from: p */
    private char f983p;

    /* renamed from: q */
    private int f984q;

    /* renamed from: r */
    private char f985r;

    /* renamed from: s */
    private int f986s;

    /* renamed from: t */
    private int f987t;

    /* renamed from: u */
    private boolean f988u;

    /* renamed from: v */
    private boolean f989v;

    /* renamed from: w */
    private boolean f990w;

    /* renamed from: x */
    private int f991x;

    /* renamed from: y */
    private int f992y;

    /* renamed from: z */
    private String f993z;

    public C0280k(C0278i iVar, Menu menu) {
        this.f969b = iVar;
        this.f970c = menu;
        mo3498a();
    }

    /* renamed from: a */
    private static char m545a(String str) {
        if (str == null) {
            return 0;
        }
        return str.charAt(0);
    }

    /* renamed from: a */
    private <T> T m546a(String str, Class<?>[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = this.f969b.f957e.getClassLoader().loadClass(str).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(String.valueOf(str)), e);
            return null;
        }
    }

    /* renamed from: a */
    private void m547a(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f988u).setVisible(this.f989v).setEnabled(this.f990w).setCheckable(this.f987t > 0).setTitleCondensed(this.f981n).setIcon(this.f982o);
        if (this.f991x >= 0) {
            menuItem.setShowAsAction(this.f991x);
        }
        if (this.f963B != null) {
            if (!this.f969b.f957e.isRestricted()) {
                menuItem.setOnMenuItemClickListener(new C0279j(this.f969b.mo3495a(), this.f963B));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f987t >= 2) {
            if (menuItem instanceof MenuItemImpl) {
                ((MenuItemImpl) menuItem).mo3634a(true);
            } else if (menuItem instanceof C0314s) {
                ((C0314s) menuItem).mo3809b();
            }
        }
        if (this.f993z != null) {
            menuItem.setActionView((View) m546a(this.f993z, C0278i.f953a, this.f969b.f955c));
            z = true;
        }
        if (this.f992y > 0) {
            if (!z) {
                menuItem.setActionView(this.f992y);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        if (this.f968a != null) {
            MenuItemCompat.setActionProvider(menuItem, this.f968a);
        }
        MenuItemCompat.setContentDescription(menuItem, this.f964C);
        MenuItemCompat.setTooltipText(menuItem, this.f965D);
        MenuItemCompat.setAlphabeticShortcut(menuItem, this.f983p, this.f984q);
        MenuItemCompat.setNumericShortcut(menuItem, this.f985r, this.f986s);
        if (this.f967F != null) {
            MenuItemCompat.setIconTintMode(menuItem, this.f967F);
        }
        if (this.f966E != null) {
            MenuItemCompat.setIconTintList(menuItem, this.f966E);
        }
    }

    /* renamed from: a */
    public final void mo3498a() {
        this.f971d = 0;
        this.f972e = 0;
        this.f973f = 0;
        this.f974g = 0;
        this.f975h = true;
        this.f976i = true;
    }

    /* renamed from: a */
    public final void mo3499a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f969b.f957e.obtainStyledAttributes(attributeSet, C0197k.f407by);
        this.f971d = obtainStyledAttributes.getResourceId(C0197k.f357bA, 0);
        this.f972e = obtainStyledAttributes.getInt(C0197k.f359bC, 0);
        this.f973f = obtainStyledAttributes.getInt(C0197k.f360bD, 0);
        this.f974g = obtainStyledAttributes.getInt(C0197k.f361bE, 0);
        this.f975h = obtainStyledAttributes.getBoolean(C0197k.f358bB, true);
        this.f976i = obtainStyledAttributes.getBoolean(C0197k.f408bz, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void mo3500b() {
        this.f977j = true;
        m547a(this.f970c.add(this.f971d, this.f978k, this.f979l, this.f980m));
    }

    /* renamed from: b */
    public final void mo3501b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f969b.f957e.obtainStyledAttributes(attributeSet, C0197k.f362bF);
        this.f978k = obtainStyledAttributes.getResourceId(C0197k.f365bI, 0);
        this.f979l = (obtainStyledAttributes.getInt(C0197k.f368bL, this.f972e) & SupportMenu.CATEGORY_MASK) | (obtainStyledAttributes.getInt(C0197k.f369bM, this.f973f) & SupportMenu.USER_MASK);
        this.f980m = obtainStyledAttributes.getText(C0197k.f370bN);
        this.f981n = obtainStyledAttributes.getText(C0197k.f371bO);
        this.f982o = obtainStyledAttributes.getResourceId(C0197k.f363bG, 0);
        this.f983p = m545a(obtainStyledAttributes.getString(C0197k.f372bP));
        this.f984q = obtainStyledAttributes.getInt(C0197k.f379bW, 4096);
        this.f985r = m545a(obtainStyledAttributes.getString(C0197k.f373bQ));
        this.f986s = obtainStyledAttributes.getInt(C0197k.f436ca, 4096);
        this.f987t = obtainStyledAttributes.hasValue(C0197k.f374bR) ? obtainStyledAttributes.getBoolean(C0197k.f374bR, false) : this.f974g;
        this.f988u = obtainStyledAttributes.getBoolean(C0197k.f366bJ, false);
        this.f989v = obtainStyledAttributes.getBoolean(C0197k.f367bK, this.f975h);
        this.f990w = obtainStyledAttributes.getBoolean(C0197k.f364bH, this.f976i);
        this.f991x = obtainStyledAttributes.getInt(C0197k.f437cb, -1);
        this.f963B = obtainStyledAttributes.getString(C0197k.f375bS);
        this.f992y = obtainStyledAttributes.getResourceId(C0197k.f376bT, 0);
        this.f993z = obtainStyledAttributes.getString(C0197k.f378bV);
        this.f962A = obtainStyledAttributes.getString(C0197k.f377bU);
        boolean z = this.f962A != null;
        if (z && this.f992y == 0 && this.f993z == null) {
            this.f968a = (ActionProvider) m546a(this.f962A, C0278i.f954b, this.f969b.f956d);
        } else {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f968a = null;
        }
        this.f964C = obtainStyledAttributes.getText(C0197k.f380bX);
        this.f965D = obtainStyledAttributes.getText(C0197k.f438cc);
        if (obtainStyledAttributes.hasValue(C0197k.f382bZ)) {
            this.f967F = C0355be.m1240a(obtainStyledAttributes.getInt(C0197k.f382bZ, -1), this.f967F);
        } else {
            this.f967F = null;
        }
        if (obtainStyledAttributes.hasValue(C0197k.f381bY)) {
            this.f966E = obtainStyledAttributes.getColorStateList(C0197k.f381bY);
        } else {
            this.f966E = null;
        }
        obtainStyledAttributes.recycle();
        this.f977j = false;
    }

    /* renamed from: c */
    public final SubMenu mo3502c() {
        this.f977j = true;
        SubMenu addSubMenu = this.f970c.addSubMenu(this.f971d, this.f978k, this.f979l, this.f980m);
        m547a(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: d */
    public final boolean mo3503d() {
        return this.f977j;
    }
}
