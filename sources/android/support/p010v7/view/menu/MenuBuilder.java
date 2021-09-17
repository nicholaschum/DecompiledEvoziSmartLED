package android.support.p010v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p007v4.content.ContextCompat;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p007v4.view.ViewConfigurationCompat;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.MenuBuilder */
public class MenuBuilder implements SupportMenu {

    /* renamed from: d */
    private static final int[] f1056d = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f1057A;

    /* renamed from: a */
    CharSequence f1058a;

    /* renamed from: b */
    Drawable f1059b;

    /* renamed from: c */
    View f1060c;

    /* renamed from: e */
    private final Context f1061e;

    /* renamed from: f */
    private final Resources f1062f;

    /* renamed from: g */
    private boolean f1063g;

    /* renamed from: h */
    private boolean f1064h;

    /* renamed from: i */
    private C0310o f1065i;

    /* renamed from: j */
    private ArrayList<MenuItemImpl> f1066j;

    /* renamed from: k */
    private ArrayList<MenuItemImpl> f1067k;

    /* renamed from: l */
    private boolean f1068l;

    /* renamed from: m */
    private ArrayList<MenuItemImpl> f1069m;

    /* renamed from: n */
    private ArrayList<MenuItemImpl> f1070n;

    /* renamed from: o */
    private boolean f1071o;

    /* renamed from: p */
    private int f1072p = 0;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f1073q;

    /* renamed from: r */
    private boolean f1074r = false;

    /* renamed from: s */
    private boolean f1075s = false;

    /* renamed from: t */
    private boolean f1076t = false;

    /* renamed from: u */
    private boolean f1077u = false;

    /* renamed from: v */
    private boolean f1078v = false;

    /* renamed from: w */
    private ArrayList<MenuItemImpl> f1079w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0286ac>> f1080x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private MenuItemImpl f1081y;

    /* renamed from: z */
    private boolean f1082z = false;

    public MenuBuilder(Context context) {
        this.f1061e = context;
        this.f1062f = context.getResources();
        this.f1066j = new ArrayList<>();
        this.f1067k = new ArrayList<>();
        boolean z = true;
        this.f1068l = true;
        this.f1069m = new ArrayList<>();
        this.f1070n = new ArrayList<>();
        this.f1071o = true;
        this.f1064h = (this.f1062f.getConfiguration().keyboard == 1 || !ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(this.f1061e), this.f1061e)) ? false : z;
    }

    /* renamed from: a */
    private static int m582a(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo3636b() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private MenuItemImpl m583a(int i, KeyEvent keyEvent) {
        ArrayList<MenuItemImpl> arrayList = this.f1079w;
        arrayList.clear();
        m587a((List<MenuItemImpl>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean d = mo3603d();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = arrayList.get(i2);
            char alphabeticShortcut = d ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (d && alphabeticShortcut == 8 && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    /* renamed from: a */
    private MenuItem m584a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = (-65536 & i3) >> 16;
        if (i4 < 0 || i4 >= f1056d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (f1056d[i4] << 16) | (65535 & i3);
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i5, charSequence, this.f1072p);
        if (this.f1073q != null) {
            menuItemImpl.mo3633a(this.f1073q);
        }
        this.f1066j.add(m582a(this.f1066j, i5), menuItemImpl);
        mo3596b(true);
        return menuItemImpl;
    }

    /* renamed from: a */
    private void m585a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f1062f;
        if (view != null) {
            this.f1060c = view;
            this.f1058a = null;
            this.f1059b = null;
        } else {
            if (i > 0) {
                this.f1058a = resources.getText(i);
            } else if (charSequence != null) {
                this.f1058a = charSequence;
            }
            if (i2 > 0) {
                this.f1059b = ContextCompat.getDrawable(this.f1061e, i2);
            } else if (drawable != null) {
                this.f1059b = drawable;
            }
            this.f1060c = null;
        }
        mo3596b(false);
    }

    /* renamed from: a */
    private void m586a(int i, boolean z) {
        if (i >= 0 && i < this.f1066j.size()) {
            this.f1066j.remove(i);
            if (z) {
                mo3596b(true);
            }
        }
    }

    /* renamed from: a */
    private void m587a(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean d = mo3603d();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1066j.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = this.f1066j.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).m587a(list, i, keyEvent);
                }
                char alphabeticShortcut = d ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
                if (((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == ((d ? menuItemImpl.getAlphabeticModifiers() : menuItemImpl.getNumericModifiers()) & SupportMenu.SUPPORTED_MODIFIERS_MASK)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (d && alphabeticShortcut == 8 && i == 67)) && menuItemImpl.isEnabled())) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m588a(SubMenuBuilder subMenuBuilder, C0286ac acVar) {
        boolean z = false;
        if (this.f1080x.isEmpty()) {
            return false;
        }
        if (acVar != null) {
            z = acVar.mo3711a(subMenuBuilder);
        }
        Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0286ac acVar2 = (C0286ac) next.get();
            if (acVar2 == null) {
                this.f1080x.remove(next);
            } else if (!z) {
                z = acVar2.mo3711a(subMenuBuilder);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m589d(boolean z) {
        if (!this.f1080x.isEmpty()) {
            mo3609h();
            Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0286ac acVar = (C0286ac) next.get();
                if (acVar == null) {
                    this.f1080x.remove(next);
                } else {
                    acVar.mo3710a(z);
                }
            }
            mo3611i();
        }
    }

    /* renamed from: a */
    public final MenuBuilder mo3568a() {
        this.f1072p = 1;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo3569a(int i) {
        m585a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo3570a(Drawable drawable) {
        m585a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo3571a(View view) {
        m585a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo3572a(CharSequence charSequence) {
        m585a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: a */
    public final void mo3573a(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).mo3573a(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3593b(), sparseArray);
        }
    }

    /* renamed from: a */
    public final void mo3574a(C0286ac acVar) {
        mo3575a(acVar, this.f1061e);
    }

    /* renamed from: a */
    public final void mo3575a(C0286ac acVar, Context context) {
        this.f1080x.add(new WeakReference(acVar));
        acVar.mo3707a(context, this);
        this.f1071o = true;
    }

    /* renamed from: a */
    public void mo3576a(C0310o oVar) {
        this.f1065i = oVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3577a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1066j.size();
        mo3609h();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.f1066j.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.mo3643e() && menuItemImpl.isCheckable()) {
                menuItemImpl.mo3637b(menuItemImpl == menuItem);
            }
        }
        mo3611i();
    }

    /* renamed from: a */
    public final void mo3578a(boolean z) {
        if (!this.f1078v) {
            this.f1078v = true;
            Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0286ac acVar = (C0286ac) next.get();
                if (acVar == null) {
                    this.f1080x.remove(next);
                } else {
                    acVar.mo3708a(this, z);
                }
            }
            this.f1078v = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3579a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f1065i != null && this.f1065i.mo3191a(menuBuilder, menuItem);
    }

    /* renamed from: a */
    public boolean mo3580a(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.f1080x.isEmpty()) {
            return false;
        }
        mo3609h();
        Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0286ac acVar = (C0286ac) next.get();
            if (acVar == null) {
                this.f1080x.remove(next);
            } else {
                z = acVar.mo3713b(menuItemImpl);
                if (z) {
                    break;
                }
            }
        }
        mo3611i();
        if (z) {
            this.f1081y = menuItemImpl;
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo3581a(MenuItem menuItem, int i) {
        return mo3582a(menuItem, (C0286ac) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3582a(android.view.MenuItem r7, android.support.p010v7.view.menu.C0286ac r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.MenuItemImpl r7 = (android.support.p010v7.view.menu.MenuItemImpl) r7
            r0 = 0
            if (r7 == 0) goto L_0x006a
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006a
        L_0x000c:
            boolean r1 = r7.mo3635a()
            android.support.v4.view.ActionProvider r2 = r7.getSupportActionProvider()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.hasSubMenu()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo3665j()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x0069
        L_0x002d:
            r6.mo3578a((boolean) r3)
            goto L_0x0069
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x0069
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo3578a((boolean) r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0056
            android.support.v7.view.menu.SubMenuBuilder r9 = new android.support.v7.view.menu.SubMenuBuilder
            android.content.Context r0 = r6.f1061e
            r9.<init>(r0, r6, r7)
            r7.mo3632a((android.support.p010v7.view.menu.SubMenuBuilder) r9)
        L_0x0056:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.SubMenuBuilder r7 = (android.support.p010v7.view.menu.SubMenuBuilder) r7
            if (r4 == 0) goto L_0x0061
            r2.onPrepareSubMenu(r7)
        L_0x0061:
            boolean r7 = r6.m588a((android.support.p010v7.view.menu.SubMenuBuilder) r7, (android.support.p010v7.view.menu.C0286ac) r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x0069
            goto L_0x002d
        L_0x0069:
            return r1
        L_0x006a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.view.menu.MenuBuilder.mo3582a(android.view.MenuItem, android.support.v7.view.menu.ac, int):boolean");
    }

    public MenuItem add(int i) {
        return m584a(0, 0, 0, this.f1062f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m584a(i, i2, i3, this.f1062f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m584a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return m584a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1061e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1062f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1062f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) m584a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f1061e, this, menuItemImpl);
        menuItemImpl.mo3632a(subMenuBuilder);
        return subMenuBuilder;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final MenuBuilder mo3592b(int i) {
        m585a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo3593b() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: b */
    public final void mo3594b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3593b());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuBuilder) item.getSubMenu()).mo3594b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: b */
    public final void mo3595b(C0286ac acVar) {
        Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0286ac acVar2 = (C0286ac) next.get();
            if (acVar2 == null || acVar2 == acVar) {
                this.f1080x.remove(next);
            }
        }
    }

    /* renamed from: b */
    public final void mo3596b(boolean z) {
        if (!this.f1074r) {
            if (z) {
                this.f1068l = true;
                this.f1071o = true;
            }
            m589d(z);
            return;
        }
        this.f1075s = true;
        if (z) {
            this.f1076t = true;
        }
    }

    /* renamed from: b */
    public boolean mo3597b(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (!this.f1080x.isEmpty() && this.f1081y == menuItemImpl) {
            mo3609h();
            Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0286ac acVar = (C0286ac) next.get();
                if (acVar == null) {
                    this.f1080x.remove(next);
                } else {
                    z = acVar.mo3714c(menuItemImpl);
                    if (z) {
                        break;
                    }
                }
            }
            mo3611i();
            if (z) {
                this.f1081y = null;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void mo3598c(boolean z) {
        this.f1057A = z;
    }

    /* renamed from: c */
    public boolean mo3599c() {
        return this.f1082z;
    }

    public void clear() {
        if (this.f1081y != null) {
            mo3597b(this.f1081y);
        }
        this.f1066j.clear();
        mo3596b(true);
    }

    public void clearHeader() {
        this.f1059b = null;
        this.f1058a = null;
        this.f1060c = null;
        mo3596b(false);
    }

    public void close() {
        mo3578a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo3603d() {
        return this.f1063g;
    }

    /* renamed from: e */
    public boolean mo3604e() {
        return this.f1064h;
    }

    /* renamed from: f */
    public final Context mo3605f() {
        return this.f1061e;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f1066j.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (findItem = menuItemImpl.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void mo3607g() {
        if (this.f1065i != null) {
            this.f1065i.mo3185a(this);
        }
    }

    public MenuItem getItem(int i) {
        return this.f1066j.get(i);
    }

    /* renamed from: h */
    public final void mo3609h() {
        if (!this.f1074r) {
            this.f1074r = true;
            this.f1075s = false;
            this.f1076t = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f1057A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1066j.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo3611i() {
        this.f1074r = false;
        if (this.f1075s) {
            this.f1075s = false;
            mo3596b(this.f1076t);
        }
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m583a(i, keyEvent) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo3613j() {
        this.f1068l = true;
        mo3596b(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo3614k() {
        this.f1071o = true;
        mo3596b(true);
    }

    /* renamed from: l */
    public final ArrayList<MenuItemImpl> mo3615l() {
        if (!this.f1068l) {
            return this.f1067k;
        }
        this.f1067k.clear();
        int size = this.f1066j.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.f1066j.get(i);
            if (menuItemImpl.isVisible()) {
                this.f1067k.add(menuItemImpl);
            }
        }
        this.f1068l = false;
        this.f1071o = true;
        return this.f1067k;
    }

    /* renamed from: m */
    public final void mo3616m() {
        ArrayList<MenuItemImpl> l = mo3615l();
        if (this.f1071o) {
            Iterator<WeakReference<C0286ac>> it = this.f1080x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0286ac acVar = (C0286ac) next.get();
                if (acVar == null) {
                    this.f1080x.remove(next);
                } else {
                    z |= acVar.mo3712b();
                }
            }
            if (z) {
                this.f1069m.clear();
                this.f1070n.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = l.get(i);
                    (menuItemImpl.mo3644f() ? this.f1069m : this.f1070n).add(menuItemImpl);
                }
            } else {
                this.f1069m.clear();
                this.f1070n.clear();
                this.f1070n.addAll(mo3615l());
            }
            this.f1071o = false;
        }
    }

    /* renamed from: n */
    public final ArrayList<MenuItemImpl> mo3617n() {
        mo3616m();
        return this.f1069m;
    }

    /* renamed from: o */
    public final ArrayList<MenuItemImpl> mo3618o() {
        mo3616m();
        return this.f1070n;
    }

    /* renamed from: p */
    public MenuBuilder mo3619p() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo3582a(findItem(i), (C0286ac) null, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl a = m583a(i, keyEvent);
        boolean a2 = a != null ? mo3582a((MenuItem) a, (C0286ac) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo3578a(true);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final boolean mo3622q() {
        return this.f1077u;
    }

    /* renamed from: r */
    public final MenuItemImpl mo3623r() {
        return this.f1081y;
    }

    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f1066j.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f1066j.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f1066j.get(i2).getGroupId() != i) {
                    mo3596b(true);
                } else {
                    m586a(i2, false);
                    i3 = i4;
                }
            }
            mo3596b(true);
        }
    }

    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f1066j.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        m586a(i2, true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1066j.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f1066j.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.mo3634a(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1082z = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1066j.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f1066j.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1066j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f1066j.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.mo3639c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo3596b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1063g = z;
        mo3596b(false);
    }

    public int size() {
        return this.f1066j.size();
    }
}
