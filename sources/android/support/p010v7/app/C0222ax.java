package android.support.p010v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p007v4.view.ViewPropertyAnimatorListener;
import android.support.p007v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.C0270a;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.support.p010v7.view.C0281l;
import android.support.p010v7.widget.ActionBarContainer;
import android.support.p010v7.widget.ActionBarContextView;
import android.support.p010v7.widget.ActionBarOverlayLayout;
import android.support.p010v7.widget.C0354bd;
import android.support.p010v7.widget.C0376bz;
import android.support.p010v7.widget.C0426f;
import android.support.p010v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.ax */
public class C0222ax extends ActionBar implements C0426f {

    /* renamed from: s */
    static final /* synthetic */ boolean f723s = (!C0222ax.class.desiredAssertionStatus());

    /* renamed from: t */
    private static final Interpolator f724t = new AccelerateInterpolator();

    /* renamed from: u */
    private static final Interpolator f725u = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f726A;

    /* renamed from: B */
    private boolean f727B;

    /* renamed from: C */
    private ArrayList<Object> f728C = new ArrayList<>();

    /* renamed from: D */
    private boolean f729D;

    /* renamed from: E */
    private int f730E = 0;

    /* renamed from: F */
    private boolean f731F;

    /* renamed from: G */
    private boolean f732G = true;

    /* renamed from: H */
    private boolean f733H;

    /* renamed from: a */
    Context f734a;

    /* renamed from: b */
    ActionBarOverlayLayout f735b;

    /* renamed from: c */
    ActionBarContainer f736c;

    /* renamed from: d */
    C0354bd f737d;

    /* renamed from: e */
    ActionBarContextView f738e;

    /* renamed from: f */
    View f739f;

    /* renamed from: g */
    C0376bz f740g;

    /* renamed from: h */
    C0227bb f741h;

    /* renamed from: i */
    C0271b f742i;

    /* renamed from: j */
    C0272c f743j;

    /* renamed from: k */
    boolean f744k = true;

    /* renamed from: l */
    boolean f745l;

    /* renamed from: m */
    boolean f746m;

    /* renamed from: n */
    C0281l f747n;

    /* renamed from: o */
    boolean f748o;

    /* renamed from: p */
    final ViewPropertyAnimatorListener f749p = new C0223ay(this);

    /* renamed from: q */
    final ViewPropertyAnimatorListener f750q = new C0224az(this);

    /* renamed from: r */
    final ViewPropertyAnimatorUpdateListener f751r = new C0226ba(this);

    /* renamed from: v */
    private Context f752v;

    /* renamed from: w */
    private Activity f753w;

    /* renamed from: x */
    private Dialog f754x;

    /* renamed from: y */
    private ArrayList<Object> f755y = new ArrayList<>();

    /* renamed from: z */
    private int f756z = -1;

    public C0222ax(Activity activity, boolean z) {
        this.f753w = activity;
        View decorView = activity.getWindow().getDecorView();
        m327a(decorView);
        if (!z) {
            this.f739f = decorView.findViewById(16908290);
        }
    }

    public C0222ax(Dialog dialog) {
        this.f754x = dialog;
        m327a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m327a(View view) {
        this.f735b = (ActionBarOverlayLayout) view.findViewById(C0193g.decor_content_parent);
        if (this.f735b != null) {
            this.f735b.mo3926a((C0426f) this);
        }
        this.f737d = m329b(view.findViewById(C0193g.action_bar));
        this.f738e = (ActionBarContextView) view.findViewById(C0193g.action_context_bar);
        this.f736c = (ActionBarContainer) view.findViewById(C0193g.action_bar_container);
        if (this.f737d == null || this.f738e == null || this.f736c == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f734a = this.f737d.mo4381b();
        if ((this.f737d.mo4395n() & 4) != 0) {
            this.f726A = true;
        }
        C0270a a = C0270a.m488a(this.f734a);
        a.mo3463f();
        m330f(a.mo3461d());
        TypedArray obtainStyledAttributes = this.f734a.obtainStyledAttributes((AttributeSet) null, C0197k.f303a, C0188b.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0197k.f523k, false)) {
            mo3123c();
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0197k.f521i, 0);
        if (dimensionPixelSize != 0) {
            mo3114a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    static boolean m328a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private static C0354bd m329b(View view) {
        if (view instanceof C0354bd) {
            return (C0354bd) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).mo4249p();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    private void m330f(boolean z) {
        this.f729D = z;
        if (!this.f729D) {
            this.f737d.mo4376a((C0376bz) null);
            this.f736c.mo3894a(this.f740g);
        } else {
            this.f736c.mo3894a((C0376bz) null);
            this.f737d.mo4376a(this.f740g);
        }
        boolean z2 = true;
        boolean z3 = m334l() == 2;
        if (this.f740g != null) {
            if (z3) {
                this.f740g.setVisibility(0);
                if (this.f735b != null) {
                    ViewCompat.requestApplyInsets(this.f735b);
                }
            } else {
                this.f740g.setVisibility(8);
            }
        }
        this.f737d.mo4380a(!this.f729D && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f735b;
        if (this.f729D || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.mo3930a(z2);
    }

    /* renamed from: g */
    private void m331g(boolean z) {
        if (m328a(this.f745l, this.f746m, this.f731F)) {
            if (!this.f732G) {
                this.f732G = true;
                m332h(z);
            }
        } else if (this.f732G) {
            this.f732G = false;
            m333i(z);
        }
    }

    /* renamed from: h */
    private void m332h(boolean z) {
        if (this.f747n != null) {
            this.f747n.mo3510c();
        }
        this.f736c.setVisibility(0);
        if (this.f730E != 0 || (!this.f733H && !z)) {
            this.f736c.setAlpha(1.0f);
            this.f736c.setTranslationY(0.0f);
            if (this.f744k && this.f739f != null) {
                this.f739f.setTranslationY(0.0f);
            }
            this.f750q.onAnimationEnd((View) null);
        } else {
            this.f736c.setTranslationY(0.0f);
            float f = (float) (-this.f736c.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f736c.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f736c.setTranslationY(f);
            C0281l lVar = new C0281l();
            ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.f736c).translationY(0.0f);
            translationY.setUpdateListener(this.f751r);
            lVar.mo3504a(translationY);
            if (this.f744k && this.f739f != null) {
                this.f739f.setTranslationY(f);
                lVar.mo3504a(ViewCompat.animate(this.f739f).translationY(0.0f));
            }
            lVar.mo3507a(f725u);
            lVar.mo3511d();
            lVar.mo3506a(this.f750q);
            this.f747n = lVar;
            lVar.mo3508a();
        }
        if (this.f735b != null) {
            ViewCompat.requestApplyInsets(this.f735b);
        }
    }

    /* renamed from: i */
    private void m333i(boolean z) {
        if (this.f747n != null) {
            this.f747n.mo3510c();
        }
        if (this.f730E != 0 || (!this.f733H && !z)) {
            this.f749p.onAnimationEnd((View) null);
            return;
        }
        this.f736c.setAlpha(1.0f);
        this.f736c.mo3895a(true);
        C0281l lVar = new C0281l();
        float f = (float) (-this.f736c.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f736c.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.f736c).translationY(f);
        translationY.setUpdateListener(this.f751r);
        lVar.mo3504a(translationY);
        if (this.f744k && this.f739f != null) {
            lVar.mo3504a(ViewCompat.animate(this.f739f).translationY(f));
        }
        lVar.mo3507a(f724t);
        lVar.mo3511d();
        lVar.mo3506a(this.f749p);
        this.f747n = lVar;
        lVar.mo3508a();
    }

    /* renamed from: l */
    private int m334l() {
        return this.f737d.mo4396o();
    }

    /* renamed from: m */
    private void m335m() {
        if (!this.f731F) {
            this.f731F = true;
            m331g(false);
        }
    }

    /* renamed from: n */
    private void m336n() {
        if (this.f731F) {
            this.f731F = false;
            m331g(false);
        }
    }

    /* renamed from: a */
    public final int mo3112a() {
        return this.f737d.mo4395n();
    }

    /* renamed from: a */
    public final C0271b mo3113a(C0272c cVar) {
        if (this.f741h != null) {
            this.f741h.mo3293c();
        }
        this.f735b.mo3933b(false);
        this.f738e.mo3916e();
        C0227bb bbVar = new C0227bb(this, this.f738e.getContext(), cVar);
        if (!bbVar.mo3295e()) {
            return null;
        }
        this.f741h = bbVar;
        bbVar.mo3294d();
        this.f738e.mo3908a((C0271b) bbVar);
        mo3281e(true);
        this.f738e.sendAccessibilityEvent(32);
        return bbVar;
    }

    /* renamed from: a */
    public final void mo3114a(float f) {
        ViewCompat.setElevation(this.f736c, f);
    }

    /* renamed from: a */
    public final void mo3115a(int i) {
        this.f737d.mo4382b(i);
    }

    /* renamed from: a */
    public final void mo3116a(Configuration configuration) {
        m330f(C0270a.m488a(this.f734a).mo3461d());
    }

    /* renamed from: a */
    public final void mo3117a(CharSequence charSequence) {
        this.f737d.mo4379a(charSequence);
    }

    /* renamed from: a */
    public final void mo3118a(boolean z) {
        if (!this.f726A) {
            int i = z ? 4 : 0;
            int n = this.f737d.mo4395n();
            this.f726A = true;
            this.f737d.mo4374a((i & 4) | (n & -5));
        }
    }

    /* renamed from: a */
    public final boolean mo3119a(int i, KeyEvent keyEvent) {
        Menu b;
        if (this.f741h == null || (b = this.f741h.mo3290b()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: b */
    public final Context mo3121b() {
        if (this.f752v == null) {
            TypedValue typedValue = new TypedValue();
            this.f734a.getTheme().resolveAttribute(C0188b.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f752v = new ContextThemeWrapper(this.f734a, i);
            } else {
                this.f752v = this.f734a;
            }
        }
        return this.f752v;
    }

    /* renamed from: b */
    public final void mo3279b(int i) {
        this.f730E = i;
    }

    /* renamed from: b */
    public final void mo3122b(boolean z) {
        this.f733H = z;
        if (!z && this.f747n != null) {
            this.f747n.mo3510c();
        }
    }

    /* renamed from: c */
    public final void mo3123c() {
        if (this.f735b.mo3931a()) {
            this.f748o = true;
            this.f735b.mo3933b(true);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: c */
    public final void mo3124c(boolean z) {
        if (z != this.f727B) {
            this.f727B = z;
            int size = this.f728C.size();
            for (int i = 0; i < size; i++) {
                this.f728C.get(i);
            }
        }
    }

    /* renamed from: d */
    public final void mo3280d(boolean z) {
        this.f744k = z;
    }

    /* renamed from: e */
    public final void mo3281e(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2;
        if (z) {
            m335m();
        } else {
            m336n();
        }
        if (ViewCompat.isLaidOut(this.f736c)) {
            if (z) {
                viewPropertyAnimatorCompat = this.f737d.mo4372a(4, 100);
                viewPropertyAnimatorCompat2 = this.f738e.mo3885a(0, 200);
            } else {
                viewPropertyAnimatorCompat2 = this.f737d.mo4372a(0, 200);
                viewPropertyAnimatorCompat = this.f738e.mo3885a(8, 100);
            }
            C0281l lVar = new C0281l();
            lVar.mo3505a(viewPropertyAnimatorCompat, viewPropertyAnimatorCompat2);
            lVar.mo3508a();
        } else if (z) {
            this.f737d.mo4383c(4);
            this.f738e.setVisibility(0);
        } else {
            this.f737d.mo4383c(0);
            this.f738e.setVisibility(8);
        }
    }

    /* renamed from: g */
    public final boolean mo3128g() {
        if (this.f737d == null || !this.f737d.mo4384c()) {
            return false;
        }
        this.f737d.mo4385d();
        return true;
    }

    /* renamed from: i */
    public final void mo3282i() {
        if (this.f746m) {
            this.f746m = false;
            m331g(true);
        }
    }

    /* renamed from: j */
    public final void mo3283j() {
        if (!this.f746m) {
            this.f746m = true;
            m331g(true);
        }
    }

    /* renamed from: k */
    public final void mo3284k() {
        if (this.f747n != null) {
            this.f747n.mo3510c();
            this.f747n = null;
        }
    }
}
