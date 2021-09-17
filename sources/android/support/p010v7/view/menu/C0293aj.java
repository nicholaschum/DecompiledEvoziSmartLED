package android.support.p010v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0191e;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.widget.C0372bv;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.aj */
final class C0293aj extends C0321z implements C0286ac, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: e */
    private static final int f1130e = C0194h.abc_popup_menu_item_layout;

    /* renamed from: a */
    final C0372bv f1131a;

    /* renamed from: b */
    final ViewTreeObserver.OnGlobalLayoutListener f1132b = new C0294ak(this);

    /* renamed from: c */
    View f1133c;

    /* renamed from: d */
    ViewTreeObserver f1134d;

    /* renamed from: f */
    private final Context f1135f;

    /* renamed from: g */
    private final MenuBuilder f1136g;

    /* renamed from: h */
    private final C0309n f1137h;

    /* renamed from: i */
    private final boolean f1138i;

    /* renamed from: j */
    private final int f1139j;

    /* renamed from: k */
    private final int f1140k;

    /* renamed from: l */
    private final int f1141l;

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f1142m = new C0295al(this);

    /* renamed from: n */
    private PopupWindow.OnDismissListener f1143n;

    /* renamed from: o */
    private View f1144o;

    /* renamed from: p */
    private C0287ad f1145p;

    /* renamed from: q */
    private boolean f1146q;

    /* renamed from: r */
    private boolean f1147r;

    /* renamed from: s */
    private int f1148s;

    /* renamed from: t */
    private int f1149t = 0;

    /* renamed from: u */
    private boolean f1150u;

    public C0293aj(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f1135f = context;
        this.f1136g = menuBuilder;
        this.f1138i = z;
        this.f1137h = new C0309n(menuBuilder, LayoutInflater.from(context), this.f1138i, f1130e);
        this.f1140k = i;
        this.f1141l = i2;
        Resources resources = context.getResources();
        this.f1139j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0191e.abc_config_prefDialogWidth));
        this.f1144o = view;
        this.f1131a = new C0372bv(this.f1135f, this.f1140k, this.f1141l);
        menuBuilder.mo3575a((C0286ac) this, context);
    }

    /* renamed from: a */
    public final void mo3739a() {
        boolean z = true;
        if (!mo3741d()) {
            if (this.f1146q || this.f1144o == null) {
                z = false;
            } else {
                this.f1133c = this.f1144o;
                this.f1131a.mo4140a((PopupWindow.OnDismissListener) this);
                this.f1131a.mo4138a((AdapterView.OnItemClickListener) this);
                this.f1131a.mo4146h();
                View view = this.f1133c;
                boolean z2 = this.f1134d == null;
                this.f1134d = view.getViewTreeObserver();
                if (z2) {
                    this.f1134d.addOnGlobalLayoutListener(this.f1132b);
                }
                view.addOnAttachStateChangeListener(this.f1142m);
                this.f1131a.mo4142b(view);
                this.f1131a.mo4143c(this.f1149t);
                if (!this.f1147r) {
                    this.f1148s = m786a(this.f1137h, (ViewGroup) null, this.f1135f, this.f1139j);
                    this.f1147r = true;
                }
                this.f1131a.mo4144d(this.f1148s);
                this.f1131a.mo4153o();
                this.f1131a.mo4136a(mo3869g());
                this.f1131a.mo3739a();
                ListView e = this.f1131a.mo3742e();
                e.setOnKeyListener(this);
                if (this.f1150u && this.f1136g.f1058a != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1135f).inflate(C0194h.abc_popup_menu_header_item_layout, e, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f1136g.f1058a);
                    }
                    frameLayout.setEnabled(false);
                    e.addHeaderView(frameLayout, (Object) null, false);
                }
                this.f1131a.mo4139a((ListAdapter) this.f1137h);
                this.f1131a.mo3739a();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public final void mo3743a(int i) {
        this.f1149t = i;
    }

    /* renamed from: a */
    public final void mo3744a(MenuBuilder menuBuilder) {
    }

    /* renamed from: a */
    public final void mo3708a(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder == this.f1136g) {
            mo3740c();
            if (this.f1145p != null) {
                this.f1145p.mo3232a(menuBuilder, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo3709a(C0287ad adVar) {
        this.f1145p = adVar;
    }

    /* renamed from: a */
    public final void mo3745a(View view) {
        this.f1144o = view;
    }

    /* renamed from: a */
    public final void mo3746a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1143n = onDismissListener;
    }

    /* renamed from: a */
    public final void mo3710a(boolean z) {
        this.f1147r = false;
        if (this.f1137h != null) {
            this.f1137h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo3711a(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            C0284aa aaVar = new C0284aa(this.f1135f, subMenuBuilder, this.f1133c, this.f1138i, this.f1140k, this.f1141l);
            aaVar.mo3695a(this.f1145p);
            aaVar.mo3698a(C0321z.m788b((MenuBuilder) subMenuBuilder));
            aaVar.mo3697a(this.f1143n);
            this.f1143n = null;
            this.f1136g.mo3578a(false);
            int l = this.f1131a.mo4150l();
            int m = this.f1131a.mo4151m();
            if ((Gravity.getAbsoluteGravity(this.f1149t, ViewCompat.getLayoutDirection(this.f1144o)) & 7) == 5) {
                l += this.f1144o.getWidth();
            }
            if (aaVar.mo3699a(l, m)) {
                if (this.f1145p == null) {
                    return true;
                }
                this.f1145p.mo3233a(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo3747b(int i) {
        this.f1131a.mo4135a(i);
    }

    /* renamed from: b */
    public final void mo3748b(boolean z) {
        this.f1137h.mo3798a(z);
    }

    /* renamed from: b */
    public final boolean mo3712b() {
        return false;
    }

    /* renamed from: c */
    public final void mo3740c() {
        if (mo3741d()) {
            this.f1131a.mo3740c();
        }
    }

    /* renamed from: c */
    public final void mo3749c(int i) {
        this.f1131a.mo4141b(i);
    }

    /* renamed from: c */
    public final void mo3750c(boolean z) {
        this.f1150u = z;
    }

    /* renamed from: d */
    public final boolean mo3741d() {
        return !this.f1146q && this.f1131a.mo3741d();
    }

    /* renamed from: e */
    public final ListView mo3742e() {
        return this.f1131a.mo3742e();
    }

    public final void onDismiss() {
        this.f1146q = true;
        this.f1136g.close();
        if (this.f1134d != null) {
            if (!this.f1134d.isAlive()) {
                this.f1134d = this.f1133c.getViewTreeObserver();
            }
            this.f1134d.removeGlobalOnLayoutListener(this.f1132b);
            this.f1134d = null;
        }
        this.f1133c.removeOnAttachStateChangeListener(this.f1142m);
        if (this.f1143n != null) {
            this.f1143n.onDismiss();
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
