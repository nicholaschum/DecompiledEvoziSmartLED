package android.support.p010v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0195i;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: android.support.v7.widget.dj */
public final class C0414dj implements C0354bd {

    /* renamed from: a */
    Toolbar f1834a;

    /* renamed from: b */
    CharSequence f1835b;

    /* renamed from: c */
    Window.Callback f1836c;

    /* renamed from: d */
    boolean f1837d;

    /* renamed from: e */
    private int f1838e;

    /* renamed from: f */
    private View f1839f;

    /* renamed from: g */
    private View f1840g;

    /* renamed from: h */
    private Drawable f1841h;

    /* renamed from: i */
    private Drawable f1842i;

    /* renamed from: j */
    private Drawable f1843j;

    /* renamed from: k */
    private boolean f1844k;

    /* renamed from: l */
    private CharSequence f1845l;

    /* renamed from: m */
    private CharSequence f1846m;

    /* renamed from: n */
    private ActionMenuPresenter f1847n;

    /* renamed from: o */
    private int f1848o;

    /* renamed from: p */
    private int f1849p;

    /* renamed from: q */
    private Drawable f1850q;

    public C0414dj(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0195i.abc_action_bar_up_description);
    }

    private C0414dj(Toolbar toolbar, boolean z, int i) {
        this.f1848o = 0;
        this.f1849p = 0;
        this.f1834a = toolbar;
        this.f1835b = toolbar.mo4235i();
        this.f1845l = toolbar.mo4236j();
        this.f1844k = this.f1835b != null;
        this.f1843j = toolbar.mo4238l();
        C0407dc a = C0407dc.m1308a(toolbar.getContext(), (AttributeSet) null, C0197k.f303a, C0188b.actionBarStyle, 0);
        this.f1850q = a.mo4545a(C0197k.f524l);
        if (z) {
            CharSequence c = a.mo4551c(C0197k.f530r);
            if (!TextUtils.isEmpty(c)) {
                this.f1844k = true;
                m1337b(c);
            }
            CharSequence c2 = a.mo4551c(C0197k.f528p);
            if (!TextUtils.isEmpty(c2)) {
                this.f1845l = c2;
                if ((this.f1838e & 8) != 0) {
                    this.f1834a.mo4222b(c2);
                }
            }
            Drawable a2 = a.mo4545a(C0197k.f526n);
            if (a2 != null) {
                this.f1842i = a2;
                m1339q();
            }
            Drawable a3 = a.mo4545a(C0197k.f525m);
            if (a3 != null) {
                this.f1841h = a3;
                m1339q();
            }
            if (this.f1843j == null && this.f1850q != null) {
                this.f1843j = this.f1850q;
                m1340r();
            }
            mo4374a(a.mo4543a(C0197k.f520h, 0));
            int g = a.mo4558g(C0197k.f519g, 0);
            if (g != 0) {
                View inflate = LayoutInflater.from(this.f1834a.getContext()).inflate(g, this.f1834a, false);
                if (!(this.f1840g == null || (this.f1838e & 16) == 0)) {
                    this.f1834a.removeView(this.f1840g);
                }
                this.f1840g = inflate;
                if (!(inflate == null || (this.f1838e & 16) == 0)) {
                    this.f1834a.addView(this.f1840g);
                }
                mo4374a(this.f1838e | 16);
            }
            int f = a.mo4556f(C0197k.f522j, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1834a.getLayoutParams();
                layoutParams.height = f;
                this.f1834a.setLayoutParams(layoutParams);
            }
            int d = a.mo4552d(C0197k.f518f, -1);
            int d2 = a.mo4552d(C0197k.f515e, -1);
            if (d >= 0 || d2 >= 0) {
                this.f1834a.mo4209a(Math.max(d, 0), Math.max(d2, 0));
            }
            int g2 = a.mo4558g(C0197k.f531s, 0);
            if (g2 != 0) {
                this.f1834a.mo4210a(this.f1834a.getContext(), g2);
            }
            int g3 = a.mo4558g(C0197k.f529q, 0);
            if (g3 != 0) {
                this.f1834a.mo4220b(this.f1834a.getContext(), g3);
            }
            int g4 = a.mo4558g(C0197k.f527o, 0);
            if (g4 != 0) {
                this.f1834a.mo4208a(g4);
            }
        } else {
            int i2 = 11;
            if (this.f1834a.mo4238l() != null) {
                i2 = 15;
                this.f1850q = this.f1834a.mo4238l();
            }
            this.f1838e = i2;
        }
        a.mo4546a();
        if (i != this.f1849p) {
            this.f1849p = i;
            if (TextUtils.isEmpty(this.f1834a.mo4237k())) {
                mo4382b(this.f1849p);
            }
        }
        this.f1846m = this.f1834a.mo4237k();
        this.f1834a.mo4215a((View.OnClickListener) new C0415dk(this));
    }

    /* renamed from: b */
    private void m1337b(CharSequence charSequence) {
        this.f1835b = charSequence;
        if ((this.f1838e & 8) != 0) {
            this.f1834a.mo4216a(charSequence);
        }
    }

    /* renamed from: c */
    private void m1338c(CharSequence charSequence) {
        this.f1846m = charSequence;
        m1341s();
    }

    /* renamed from: q */
    private void m1339q() {
        this.f1834a.mo4211a((this.f1838e & 2) != 0 ? ((this.f1838e & 1) == 0 || this.f1842i == null) ? this.f1841h : this.f1842i : null);
    }

    /* renamed from: r */
    private void m1340r() {
        if ((this.f1838e & 4) != 0) {
            this.f1834a.mo4221b(this.f1843j != null ? this.f1843j : this.f1850q);
        } else {
            this.f1834a.mo4221b((Drawable) null);
        }
    }

    /* renamed from: s */
    private void m1341s() {
        if ((this.f1838e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1846m)) {
            this.f1834a.mo4219b(this.f1849p);
        } else {
            this.f1834a.mo4224c(this.f1846m);
        }
    }

    /* renamed from: a */
    public final ViewPropertyAnimatorCompat mo4372a(int i, long j) {
        return ViewCompat.animate(this.f1834a).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new C0416dl(this, i));
    }

    /* renamed from: a */
    public final ViewGroup mo4373a() {
        return this.f1834a;
    }

    /* renamed from: a */
    public final void mo4374a(int i) {
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1838e ^ i;
        this.f1838e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1341s();
                }
                m1340r();
            }
            if ((i2 & 3) != 0) {
                m1339q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1834a.mo4216a(this.f1835b);
                    toolbar = this.f1834a;
                    charSequence = this.f1845l;
                } else {
                    charSequence = null;
                    this.f1834a.mo4216a((CharSequence) null);
                    toolbar = this.f1834a;
                }
                toolbar.mo4222b(charSequence);
            }
            if ((i2 & 16) != 0 && this.f1840g != null) {
                if ((i & 16) != 0) {
                    this.f1834a.addView(this.f1840g);
                } else {
                    this.f1834a.removeView(this.f1840g);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4375a(C0287ad adVar, C0310o oVar) {
        this.f1834a.mo4213a(adVar, oVar);
    }

    /* renamed from: a */
    public final void mo4376a(C0376bz bzVar) {
        if (this.f1839f != null && this.f1839f.getParent() == this.f1834a) {
            this.f1834a.removeView(this.f1839f);
        }
        this.f1839f = bzVar;
        if (bzVar != null && this.f1848o == 2) {
            this.f1834a.addView(this.f1839f, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f1839f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f539a = 8388691;
            bzVar.mo4485a(true);
        }
    }

    /* renamed from: a */
    public final void mo4377a(Menu menu, C0287ad adVar) {
        if (this.f1847n == null) {
            this.f1847n = new ActionMenuPresenter(this.f1834a.getContext());
            this.f1847n.mo3769a(C0193g.action_menu_presenter);
        }
        this.f1847n.mo3709a(adVar);
        this.f1834a.mo4212a((MenuBuilder) menu, this.f1847n);
    }

    /* renamed from: a */
    public final void mo4378a(Window.Callback callback) {
        this.f1836c = callback;
    }

    /* renamed from: a */
    public final void mo4379a(CharSequence charSequence) {
        if (!this.f1844k) {
            m1337b(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo4380a(boolean z) {
        this.f1834a.mo4217a(z);
    }

    /* renamed from: b */
    public final Context mo4381b() {
        return this.f1834a.getContext();
    }

    /* renamed from: b */
    public final void mo4382b(int i) {
        m1338c((CharSequence) i == 0 ? null : this.f1834a.getContext().getString(i));
    }

    /* renamed from: c */
    public final void mo4383c(int i) {
        this.f1834a.setVisibility(i);
    }

    /* renamed from: c */
    public final boolean mo4384c() {
        return this.f1834a.mo4230g();
    }

    /* renamed from: d */
    public final void mo4385d() {
        this.f1834a.mo4234h();
    }

    /* renamed from: e */
    public final void mo4386e() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: f */
    public final void mo4387f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public final boolean mo4388g() {
        return this.f1834a.mo4218a();
    }

    /* renamed from: h */
    public final boolean mo4389h() {
        return this.f1834a.mo4223b();
    }

    /* renamed from: i */
    public final boolean mo4390i() {
        return this.f1834a.mo4225c();
    }

    /* renamed from: j */
    public final boolean mo4391j() {
        return this.f1834a.mo4227d();
    }

    /* renamed from: k */
    public final boolean mo4392k() {
        return this.f1834a.mo4228e();
    }

    /* renamed from: l */
    public final void mo4393l() {
        this.f1837d = true;
    }

    /* renamed from: m */
    public final void mo4394m() {
        this.f1834a.mo4229f();
    }

    /* renamed from: n */
    public final int mo4395n() {
        return this.f1838e;
    }

    /* renamed from: o */
    public final int mo4396o() {
        return this.f1848o;
    }

    /* renamed from: p */
    public final Menu mo4397p() {
        return this.f1834a.mo4239m();
    }
}
