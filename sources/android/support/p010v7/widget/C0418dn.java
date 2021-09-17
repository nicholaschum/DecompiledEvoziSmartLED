package android.support.p010v7.widget;

import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewConfigurationCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.dn */
final class C0418dn implements View.OnAttachStateChangeListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: j */
    private static C0418dn f1856j;

    /* renamed from: k */
    private static C0418dn f1857k;

    /* renamed from: a */
    private final View f1858a;

    /* renamed from: b */
    private final CharSequence f1859b;

    /* renamed from: c */
    private final int f1860c;

    /* renamed from: d */
    private final Runnable f1861d = new C0419do(this);

    /* renamed from: e */
    private final Runnable f1862e = new C0420dp(this);

    /* renamed from: f */
    private int f1863f;

    /* renamed from: g */
    private int f1864g;

    /* renamed from: h */
    private C0421dq f1865h;

    /* renamed from: i */
    private boolean f1866i;

    private C0418dn(View view, CharSequence charSequence) {
        this.f1858a = view;
        this.f1859b = charSequence;
        this.f1860c = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(this.f1858a.getContext()));
        m1373d();
        this.f1858a.setOnLongClickListener(this);
        this.f1858a.setOnHoverListener(this);
    }

    /* renamed from: a */
    private static void m1369a(C0418dn dnVar) {
        if (f1856j != null) {
            f1856j.m1372c();
        }
        f1856j = dnVar;
        if (dnVar != null) {
            f1856j.m1371b();
        }
    }

    /* renamed from: a */
    public static void m1370a(View view, CharSequence charSequence) {
        if (f1856j != null && f1856j.f1858a == view) {
            m1369a((C0418dn) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f1857k != null && f1857k.f1858a == view) {
                f1857k.mo4568a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new C0418dn(view, charSequence);
    }

    /* renamed from: b */
    private void m1371b() {
        this.f1858a.postDelayed(this.f1861d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: c */
    private void m1372c() {
        this.f1858a.removeCallbacks(this.f1861d);
    }

    /* renamed from: d */
    private void m1373d() {
        this.f1863f = Integer.MAX_VALUE;
        this.f1864g = Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4568a() {
        if (f1857k == this) {
            f1857k = null;
            if (this.f1865h != null) {
                this.f1865h.mo4576a();
                this.f1865h = null;
                m1373d();
                this.f1858a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1856j == this) {
            m1369a((C0418dn) null);
        }
        this.f1858a.removeCallbacks(this.f1862e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4569a(boolean z) {
        long j;
        if (ViewCompat.isAttachedToWindow(this.f1858a)) {
            m1369a((C0418dn) null);
            if (f1857k != null) {
                f1857k.mo4568a();
            }
            f1857k = this;
            this.f1866i = z;
            this.f1865h = new C0421dq(this.f1858a.getContext());
            this.f1865h.mo4577a(this.f1858a, this.f1863f, this.f1864g, this.f1866i, this.f1859b);
            this.f1858a.addOnAttachStateChangeListener(this);
            if (this.f1866i) {
                j = 2500;
            } else {
                j = ((ViewCompat.getWindowSystemUiVisibility(this.f1858a) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1858a.removeCallbacks(this.f1862e);
            this.f1858a.postDelayed(this.f1862e, j);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1865h != null && this.f1866i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1858a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m1373d();
                mo4568a();
            }
        } else if (this.f1858a.isEnabled() && this.f1865h == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1863f) > this.f1860c || Math.abs(y - this.f1864g) > this.f1860c) {
                this.f1863f = x;
                this.f1864g = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m1369a(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f1863f = view.getWidth() / 2;
        this.f1864g = view.getHeight() / 2;
        mo4569a(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        mo4568a();
    }
}
