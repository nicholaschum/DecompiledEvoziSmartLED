package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.ActionProvider;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.view.C0270a;
import android.support.p010v7.view.menu.ActionMenuItemView;
import android.support.p010v7.view.menu.C0288ae;
import android.support.p010v7.view.menu.C0289af;
import android.support.p010v7.view.menu.C0297b;
import android.support.p010v7.view.menu.C0298c;
import android.support.p010v7.view.menu.C0311p;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.support.p010v7.view.menu.SubMenuBuilder;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ActionMenuPresenter */
final class ActionMenuPresenter extends C0298c implements ActionProvider.SubUiVisibilityListener {

    /* renamed from: A */
    private C0428h f1296A;

    /* renamed from: g */
    C0430j f1297g;

    /* renamed from: h */
    C0432l f1298h;

    /* renamed from: i */
    C0427g f1299i;

    /* renamed from: j */
    C0429i f1300j;

    /* renamed from: k */
    final C0433m f1301k = new C0433m(this);

    /* renamed from: l */
    int f1302l;

    /* renamed from: m */
    private Drawable f1303m;

    /* renamed from: n */
    private boolean f1304n;

    /* renamed from: o */
    private boolean f1305o;

    /* renamed from: p */
    private boolean f1306p;

    /* renamed from: q */
    private int f1307q;

    /* renamed from: r */
    private int f1308r;

    /* renamed from: s */
    private int f1309s;

    /* renamed from: t */
    private boolean f1310t;

    /* renamed from: u */
    private boolean f1311u;

    /* renamed from: v */
    private boolean f1312v;

    /* renamed from: w */
    private boolean f1313w;

    /* renamed from: x */
    private int f1314x;

    /* renamed from: y */
    private final SparseBooleanArray f1315y = new SparseBooleanArray();

    /* renamed from: z */
    private View f1316z;

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState */
    class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0434n();

        /* renamed from: a */
        public int f1317a;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f1317a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1317a);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0194h.abc_action_menu_layout, C0194h.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public final C0288ae mo3767a(ViewGroup viewGroup) {
        C0288ae aeVar = this.f1158f;
        C0288ae a = super.mo3767a(viewGroup);
        if (aeVar != a) {
            ((ActionMenuView) a).mo3968a(this);
        }
        return a;
    }

    /* renamed from: a */
    public final View mo3768a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.mo3665j()) {
            actionView = super.mo3768a(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m878a(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public final void mo3707a(Context context, MenuBuilder menuBuilder) {
        super.mo3707a(context, menuBuilder);
        Resources resources = context.getResources();
        C0270a a = C0270a.m488a(context);
        if (!this.f1306p) {
            this.f1305o = a.mo3459b();
        }
        if (!this.f1312v) {
            this.f1307q = a.mo3460c();
        }
        if (!this.f1310t) {
            this.f1309s = a.mo3458a();
        }
        int i = this.f1307q;
        if (this.f1305o) {
            if (this.f1297g == null) {
                this.f1297g = new C0430j(this, this.f1153a);
                if (this.f1304n) {
                    this.f1297g.setImageDrawable(this.f1303m);
                    this.f1303m = null;
                    this.f1304n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1297g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1297g.getMeasuredWidth();
        } else {
            this.f1297g = null;
        }
        this.f1308r = i;
        this.f1314x = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f1316z = null;
    }

    /* renamed from: a */
    public final void mo3708a(MenuBuilder menuBuilder, boolean z) {
        mo3960h();
        super.mo3708a(menuBuilder, z);
    }

    /* renamed from: a */
    public final void mo3770a(MenuItemImpl menuItemImpl, C0289af afVar) {
        afVar.mo3546a(menuItemImpl);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) afVar;
        actionMenuItemView.mo3548a((C0311p) (ActionMenuView) this.f1158f);
        if (this.f1296A == null) {
            this.f1296A = new C0428h(this);
        }
        actionMenuItemView.mo3547a((C0297b) this.f1296A);
    }

    /* renamed from: a */
    public final void mo3954a(ActionMenuView actionMenuView) {
        this.f1158f = actionMenuView;
        actionMenuView.mo3559a(this.f1155c);
    }

    /* renamed from: a */
    public final void mo3710a(boolean z) {
        super.mo3710a(z);
        ((View) this.f1158f).requestLayout();
        boolean z2 = false;
        if (this.f1155c != null) {
            ArrayList<MenuItemImpl> n = this.f1155c.mo3617n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                ActionProvider supportActionProvider = n.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        ArrayList<MenuItemImpl> o = this.f1155c != null ? this.f1155c.mo3618o() : null;
        if (this.f1305o && o != null) {
            int size2 = o.size();
            if (size2 == 1) {
                z2 = !o.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1297g == null) {
                this.f1297g = new C0430j(this, this.f1153a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1297g.getParent();
            if (viewGroup != this.f1158f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1297g);
                }
                ((ActionMenuView) this.f1158f).addView(this.f1297g, ActionMenuView.m879b());
            }
        } else if (this.f1297g != null && this.f1297g.getParent() == this.f1158f) {
            ((ViewGroup) this.f1158f).removeView(this.f1297g);
        }
        ((ActionMenuView) this.f1158f).mo3969a(this.f1305o);
    }

    /* renamed from: a */
    public final boolean mo3771a(MenuItemImpl menuItemImpl) {
        return menuItemImpl.mo3644f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3711a(android.support.p010v7.view.menu.SubMenuBuilder r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = r8
        L_0x0009:
            android.view.Menu r2 = r0.mo3684s()
            android.support.v7.view.menu.MenuBuilder r3 = r7.f1155c
            if (r2 == r3) goto L_0x0018
            android.view.Menu r0 = r0.mo3684s()
            android.support.v7.view.menu.SubMenuBuilder r0 = (android.support.p010v7.view.menu.SubMenuBuilder) r0
            goto L_0x0009
        L_0x0018:
            android.view.MenuItem r0 = r0.getItem()
            android.support.v7.view.menu.ae r2 = r7.f1158f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 == 0) goto L_0x003e
            int r3 = r2.getChildCount()
            r4 = 0
        L_0x0027:
            if (r4 >= r3) goto L_0x003e
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof android.support.p010v7.view.menu.C0289af
            if (r6 == 0) goto L_0x003b
            r6 = r5
            android.support.v7.view.menu.af r6 = (android.support.p010v7.view.menu.C0289af) r6
            android.support.v7.view.menu.MenuItemImpl r6 = r6.mo3545a()
            if (r6 != r0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x003e:
            r5 = 0
        L_0x003f:
            if (r5 != 0) goto L_0x0042
            return r1
        L_0x0042:
            android.view.MenuItem r0 = r8.getItem()
            int r0 = r0.getItemId()
            r7.f1302l = r0
            int r0 = r8.size()
            r2 = 0
        L_0x0051:
            r3 = 1
            if (r2 >= r0) goto L_0x0069
            android.view.MenuItem r4 = r8.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L_0x0066
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L_0x0066
            r1 = 1
            goto L_0x0069
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0069:
            android.support.v7.widget.g r0 = new android.support.v7.widget.g
            android.content.Context r2 = r7.f1154b
            r0.<init>(r7, r2, r8, r5)
            r7.f1299i = r0
            android.support.v7.widget.g r0 = r7.f1299i
            r0.mo3698a((boolean) r1)
            android.support.v7.widget.g r0 = r7.f1299i
            r0.mo3700b()
            super.mo3711a((android.support.p010v7.view.menu.SubMenuBuilder) r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.ActionMenuPresenter.mo3711a(android.support.v7.view.menu.SubMenuBuilder):boolean");
    }

    /* renamed from: a */
    public final boolean mo3772a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1297g) {
            return false;
        }
        return super.mo3772a(viewGroup, i);
    }

    /* renamed from: b */
    public final boolean mo3712b() {
        int i;
        ArrayList<MenuItemImpl> arrayList;
        int i2;
        int i3;
        int i4;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        int i5 = 0;
        if (actionMenuPresenter.f1155c != null) {
            arrayList = actionMenuPresenter.f1155c.mo3615l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f1309s;
        int i7 = actionMenuPresenter.f1308r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1158f;
        int i8 = i6;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            MenuItemImpl menuItemImpl = arrayList.get(i11);
            if (menuItemImpl.mo3658h()) {
                i9++;
            } else if (menuItemImpl.mo3645g()) {
                i10++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.f1313w && menuItemImpl.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f1305o && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1315y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1311u) {
            i3 = i7 / actionMenuPresenter.f1314x;
            i2 = ((i7 % actionMenuPresenter.f1314x) / i3) + actionMenuPresenter.f1314x;
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i13 = i7;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i14);
            if (menuItemImpl2.mo3658h()) {
                View a = actionMenuPresenter.mo3768a(menuItemImpl2, actionMenuPresenter.f1316z, viewGroup);
                if (actionMenuPresenter.f1316z == null) {
                    actionMenuPresenter.f1316z = a;
                }
                if (actionMenuPresenter.f1311u) {
                    i3 -= ActionMenuView.m877a(a, i2, i3, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i15 != 0) {
                    measuredWidth = i15;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                menuItemImpl2.mo3640d(z);
                i4 = i;
                i15 = measuredWidth;
            } else if (menuItemImpl2.mo3645g()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i13 > 0 && (!actionMenuPresenter.f1311u || i3 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a2 = actionMenuPresenter.mo3768a(menuItemImpl2, actionMenuPresenter.f1316z, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.f1316z == null) {
                        actionMenuPresenter.f1316z = a2;
                    }
                    if (actionMenuPresenter.f1311u) {
                        int a3 = ActionMenuView.m877a(a2, i2, i3, makeMeasureSpec, 0);
                        i3 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = z5 & (!actionMenuPresenter.f1311u ? i13 + i15 > 0 : i13 >= 0);
                } else {
                    boolean z6 = z4;
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    int i16 = 0;
                    while (i16 < i14) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i16);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.mo3644f()) {
                                i12++;
                            }
                            menuItemImpl3.mo3640d(false);
                        }
                        i16++;
                    }
                }
                if (z4) {
                    i12--;
                }
                menuItemImpl2.mo3640d(z4);
            } else {
                i4 = i;
                menuItemImpl2.mo3640d(false);
                i14++;
                i = i4;
                actionMenuPresenter = this;
                i5 = 0;
            }
            i14++;
            i = i4;
            actionMenuPresenter = this;
            i5 = 0;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo3955c() {
        if (!this.f1310t) {
            this.f1309s = C0270a.m488a(this.f1154b).mo3458a();
        }
        if (this.f1155c != null) {
            this.f1155c.mo3596b(true);
        }
    }

    /* renamed from: d */
    public final void mo3956d() {
        this.f1305o = true;
        this.f1306p = true;
    }

    /* renamed from: e */
    public final void mo3957e() {
        this.f1313w = true;
    }

    /* renamed from: f */
    public final boolean mo3958f() {
        if (!this.f1305o || mo3962j() || this.f1155c == null || this.f1158f == null || this.f1300j != null || this.f1155c.mo3618o().isEmpty()) {
            return false;
        }
        this.f1300j = new C0429i(this, new C0432l(this, this.f1154b, this.f1155c, this.f1297g));
        ((View) this.f1158f).post(this.f1300j);
        super.mo3711a((SubMenuBuilder) null);
        return true;
    }

    /* renamed from: g */
    public final boolean mo3959g() {
        if (this.f1300j == null || this.f1158f == null) {
            C0432l lVar = this.f1298h;
            if (lVar == null) {
                return false;
            }
            lVar.mo3703e();
            return true;
        }
        ((View) this.f1158f).removeCallbacks(this.f1300j);
        this.f1300j = null;
        return true;
    }

    /* renamed from: h */
    public final boolean mo3960h() {
        return mo3959g() | mo3961i();
    }

    /* renamed from: i */
    public final boolean mo3961i() {
        if (this.f1299i == null) {
            return false;
        }
        this.f1299i.mo3703e();
        return true;
    }

    /* renamed from: j */
    public final boolean mo3962j() {
        return this.f1298h != null && this.f1298h.mo3705g();
    }

    public final void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.mo3711a((SubMenuBuilder) null);
        } else if (this.f1155c != null) {
            this.f1155c.mo3578a(false);
        }
    }
}
