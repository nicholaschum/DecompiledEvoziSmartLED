package android.support.p010v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.support.p007v4.view.GravityCompat;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0191e;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.widget.C0371bu;
import android.support.p010v7.widget.C0372bv;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.f */
final class C0301f extends C0321z implements C0286ac, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: g */
    private static final int f1167g = C0194h.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private PopupWindow.OnDismissListener f1168A;

    /* renamed from: a */
    final Handler f1169a;

    /* renamed from: b */
    final List<C0306k> f1170b = new ArrayList();

    /* renamed from: c */
    final ViewTreeObserver.OnGlobalLayoutListener f1171c = new C0302g(this);

    /* renamed from: d */
    View f1172d;

    /* renamed from: e */
    ViewTreeObserver f1173e;

    /* renamed from: f */
    boolean f1174f;

    /* renamed from: h */
    private final Context f1175h;

    /* renamed from: i */
    private final int f1176i;

    /* renamed from: j */
    private final int f1177j;

    /* renamed from: k */
    private final int f1178k;

    /* renamed from: l */
    private final boolean f1179l;

    /* renamed from: m */
    private final List<MenuBuilder> f1180m = new ArrayList();

    /* renamed from: n */
    private final View.OnAttachStateChangeListener f1181n = new C0303h(this);

    /* renamed from: o */
    private final C0371bu f1182o = new C0304i(this);

    /* renamed from: p */
    private int f1183p = 0;

    /* renamed from: q */
    private int f1184q = 0;

    /* renamed from: r */
    private View f1185r;

    /* renamed from: s */
    private int f1186s;

    /* renamed from: t */
    private boolean f1187t;

    /* renamed from: u */
    private boolean f1188u;

    /* renamed from: v */
    private int f1189v;

    /* renamed from: w */
    private int f1190w;

    /* renamed from: x */
    private boolean f1191x;

    /* renamed from: y */
    private boolean f1192y;

    /* renamed from: z */
    private C0287ad f1193z;

    public C0301f(Context context, View view, int i, int i2, boolean z) {
        this.f1175h = context;
        this.f1185r = view;
        this.f1177j = i;
        this.f1178k = i2;
        this.f1179l = z;
        this.f1191x = false;
        this.f1186s = m738i();
        Resources resources = context.getResources();
        this.f1176i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0191e.abc_config_prefDialogWidth));
        this.f1169a = new Handler();
    }

    /* renamed from: a */
    private static MenuItem m733a(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static View m734a(C0306k kVar, MenuBuilder menuBuilder) {
        int i;
        C0309n nVar;
        int firstVisiblePosition;
        MenuItem a = m733a(kVar.f1202b, menuBuilder);
        if (a == null) {
            return null;
        }
        ListView e = kVar.f1201a.mo3742e();
        ListAdapter adapter = e.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            nVar = (C0309n) headerViewListAdapter.getWrappedAdapter();
        } else {
            nVar = (C0309n) adapter;
            i = 0;
        }
        int count = nVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == nVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - e.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < e.getChildCount()) {
            return e.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: c */
    private void m735c(MenuBuilder menuBuilder) {
        View view;
        C0306k kVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1175h);
        C0309n nVar = new C0309n(menuBuilder, from, this.f1179l, f1167g);
        if (!mo3741d() && this.f1191x) {
            nVar.mo3798a(true);
        } else if (mo3741d()) {
            nVar.mo3798a(C0321z.m788b(menuBuilder));
        }
        int a = m786a(nVar, (ViewGroup) null, this.f1175h, this.f1176i);
        C0372bv h = m737h();
        h.mo4139a((ListAdapter) nVar);
        h.mo4144d(a);
        h.mo4143c(this.f1184q);
        if (this.f1170b.size() > 0) {
            kVar = this.f1170b.get(this.f1170b.size() - 1);
            view = m734a(kVar, menuBuilder);
        } else {
            kVar = null;
            view = null;
        }
        if (view != null) {
            h.mo4432s();
            h.mo4430b();
            int d = m736d(a);
            boolean z = d == 1;
            this.f1186s = d;
            if (Build.VERSION.SDK_INT >= 26) {
                h.mo4142b(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1185r.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1184q & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1185r.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1184q & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                h.mo4135a(i3);
                h.mo4156r();
                h.mo4141b(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                h.mo4135a(i3);
                h.mo4156r();
                h.mo4141b(i2);
            }
            i3 = i + a;
            h.mo4135a(i3);
            h.mo4156r();
            h.mo4141b(i2);
        } else {
            if (this.f1187t) {
                h.mo4135a(this.f1189v);
            }
            if (this.f1188u) {
                h.mo4141b(this.f1190w);
            }
            h.mo4136a(mo3869g());
        }
        this.f1170b.add(new C0306k(h, menuBuilder, this.f1186s));
        h.mo3739a();
        ListView e = h.mo3742e();
        e.setOnKeyListener(this);
        if (kVar == null && this.f1192y && menuBuilder.f1058a != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0194h.abc_popup_menu_header_item_layout, e, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(menuBuilder.f1058a);
            e.addHeaderView(frameLayout, (Object) null, false);
            h.mo3739a();
        }
    }

    /* renamed from: d */
    private int m736d(int i) {
        ListView e = this.f1170b.get(this.f1170b.size() - 1).f1201a.mo3742e();
        int[] iArr = new int[2];
        e.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1172d.getWindowVisibleDisplayFrame(rect);
        return this.f1186s == 1 ? (iArr[0] + e.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: h */
    private C0372bv m737h() {
        C0372bv bvVar = new C0372bv(this.f1175h, this.f1177j, this.f1178k);
        bvVar.mo4429a(this.f1182o);
        bvVar.mo4138a((AdapterView.OnItemClickListener) this);
        bvVar.mo4140a((PopupWindow.OnDismissListener) this);
        bvVar.mo4142b(this.f1185r);
        bvVar.mo4143c(this.f1184q);
        bvVar.mo4146h();
        bvVar.mo4153o();
        return bvVar;
    }

    /* renamed from: i */
    private int m738i() {
        return ViewCompat.getLayoutDirection(this.f1185r) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo3739a() {
        if (!mo3741d()) {
            for (MenuBuilder c : this.f1180m) {
                m735c(c);
            }
            this.f1180m.clear();
            this.f1172d = this.f1185r;
            if (this.f1172d != null) {
                boolean z = this.f1173e == null;
                this.f1173e = this.f1172d.getViewTreeObserver();
                if (z) {
                    this.f1173e.addOnGlobalLayoutListener(this.f1171c);
                }
                this.f1172d.addOnAttachStateChangeListener(this.f1181n);
            }
        }
    }

    /* renamed from: a */
    public final void mo3743a(int i) {
        if (this.f1183p != i) {
            this.f1183p = i;
            this.f1184q = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this.f1185r));
        }
    }

    /* renamed from: a */
    public final void mo3744a(MenuBuilder menuBuilder) {
        menuBuilder.mo3575a((C0286ac) this, this.f1175h);
        if (mo3741d()) {
            m735c(menuBuilder);
        } else {
            this.f1180m.add(menuBuilder);
        }
    }

    /* renamed from: a */
    public final void mo3708a(MenuBuilder menuBuilder, boolean z) {
        int size = this.f1170b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == this.f1170b.get(i).f1202b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < this.f1170b.size()) {
                this.f1170b.get(i2).f1202b.mo3578a(false);
            }
            C0306k remove = this.f1170b.remove(i);
            remove.f1202b.mo3595b((C0286ac) this);
            if (this.f1174f) {
                remove.f1201a.mo4431f();
                remove.f1201a.mo4148j();
            }
            remove.f1201a.mo3740c();
            int size2 = this.f1170b.size();
            this.f1186s = size2 > 0 ? this.f1170b.get(size2 - 1).f1203c : m738i();
            if (size2 == 0) {
                mo3740c();
                if (this.f1193z != null) {
                    this.f1193z.mo3232a(menuBuilder, true);
                }
                if (this.f1173e != null) {
                    if (this.f1173e.isAlive()) {
                        this.f1173e.removeGlobalOnLayoutListener(this.f1171c);
                    }
                    this.f1173e = null;
                }
                this.f1172d.removeOnAttachStateChangeListener(this.f1181n);
                this.f1168A.onDismiss();
            } else if (z) {
                this.f1170b.get(0).f1202b.mo3578a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo3709a(C0287ad adVar) {
        this.f1193z = adVar;
    }

    /* renamed from: a */
    public final void mo3745a(View view) {
        if (this.f1185r != view) {
            this.f1185r = view;
            this.f1184q = GravityCompat.getAbsoluteGravity(this.f1183p, ViewCompat.getLayoutDirection(this.f1185r));
        }
    }

    /* renamed from: a */
    public final void mo3746a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1168A = onDismissListener;
    }

    /* renamed from: a */
    public final void mo3710a(boolean z) {
        for (C0306k kVar : this.f1170b) {
            m787a(kVar.f1201a.mo3742e().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo3711a(SubMenuBuilder subMenuBuilder) {
        for (C0306k next : this.f1170b) {
            if (subMenuBuilder == next.f1202b) {
                next.f1201a.mo3742e().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        mo3744a((MenuBuilder) subMenuBuilder);
        if (this.f1193z != null) {
            this.f1193z.mo3233a(subMenuBuilder);
        }
        return true;
    }

    /* renamed from: b */
    public final void mo3747b(int i) {
        this.f1187t = true;
        this.f1189v = i;
    }

    /* renamed from: b */
    public final void mo3748b(boolean z) {
        this.f1191x = z;
    }

    /* renamed from: b */
    public final boolean mo3712b() {
        return false;
    }

    /* renamed from: c */
    public final void mo3740c() {
        int size = this.f1170b.size();
        if (size > 0) {
            C0306k[] kVarArr = (C0306k[]) this.f1170b.toArray(new C0306k[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0306k kVar = kVarArr[i];
                if (kVar.f1201a.mo3741d()) {
                    kVar.f1201a.mo3740c();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo3749c(int i) {
        this.f1188u = true;
        this.f1190w = i;
    }

    /* renamed from: c */
    public final void mo3750c(boolean z) {
        this.f1192y = z;
    }

    /* renamed from: d */
    public final boolean mo3741d() {
        return this.f1170b.size() > 0 && this.f1170b.get(0).f1201a.mo3741d();
    }

    /* renamed from: e */
    public final ListView mo3742e() {
        if (this.f1170b.isEmpty()) {
            return null;
        }
        return this.f1170b.get(this.f1170b.size() - 1).f1201a.mo3742e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo3778f() {
        return false;
    }

    public final void onDismiss() {
        C0306k kVar;
        int size = this.f1170b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.f1170b.get(i);
            if (!kVar.f1201a.mo3741d()) {
                break;
            }
            i++;
        }
        if (kVar != null) {
            kVar.f1202b.mo3578a(false);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo3740c();
        return true;
    }
}
