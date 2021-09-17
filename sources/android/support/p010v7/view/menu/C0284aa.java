package android.support.p010v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.p007v4.view.GravityCompat;
import android.support.p007v4.view.ViewCompat;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.aa */
public class C0284aa {

    /* renamed from: a */
    private final Context f1117a;

    /* renamed from: b */
    private final MenuBuilder f1118b;

    /* renamed from: c */
    private final boolean f1119c;

    /* renamed from: d */
    private final int f1120d;

    /* renamed from: e */
    private final int f1121e;

    /* renamed from: f */
    private View f1122f;

    /* renamed from: g */
    private int f1123g;

    /* renamed from: h */
    private boolean f1124h;

    /* renamed from: i */
    private C0287ad f1125i;

    /* renamed from: j */
    private C0321z f1126j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1127k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1128l;

    public C0284aa(Context context, MenuBuilder menuBuilder, View view, boolean z, int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    public C0284aa(Context context, MenuBuilder menuBuilder, View view, boolean z, int i, int i2) {
        this.f1123g = GravityCompat.START;
        this.f1128l = new C0285ab(this);
        this.f1117a = context;
        this.f1118b = menuBuilder;
        this.f1122f = view;
        this.f1119c = z;
        this.f1120d = i;
        this.f1121e = i2;
    }

    /* renamed from: a */
    private void m662a(int i, int i2, boolean z, boolean z2) {
        C0321z c = mo3701c();
        c.mo3750c(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.f1123g, ViewCompat.getLayoutDirection(this.f1122f)) & 7) == 5) {
                i -= this.f1122f.getWidth();
            }
            c.mo3747b(i);
            c.mo3749c(i2);
            int i3 = (int) ((this.f1117a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.mo3868a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.mo3739a();
    }

    /* renamed from: a */
    public final void mo3694a() {
        this.f1123g = GravityCompat.END;
    }

    /* renamed from: a */
    public final void mo3695a(C0287ad adVar) {
        this.f1125i = adVar;
        if (this.f1126j != null) {
            this.f1126j.mo3709a(adVar);
        }
    }

    /* renamed from: a */
    public final void mo3696a(View view) {
        this.f1122f = view;
    }

    /* renamed from: a */
    public final void mo3697a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1127k = onDismissListener;
    }

    /* renamed from: a */
    public final void mo3698a(boolean z) {
        this.f1124h = z;
        if (this.f1126j != null) {
            this.f1126j.mo3748b(z);
        }
    }

    /* renamed from: a */
    public final boolean mo3699a(int i, int i2) {
        if (mo3705g()) {
            return true;
        }
        if (this.f1122f == null) {
            return false;
        }
        m662a(i, i2, true, true);
        return true;
    }

    /* renamed from: b */
    public final void mo3700b() {
        if (!mo3702d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [android.support.v7.view.menu.z] */
    /* JADX WARNING: type inference failed for: r7v1, types: [android.support.v7.view.menu.aj] */
    /* JADX WARNING: type inference failed for: r1v13, types: [android.support.v7.view.menu.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p010v7.view.menu.C0321z mo3701c() {
        /*
            r14 = this;
            android.support.v7.view.menu.z r0 = r14.f1126j
            if (r0 != 0) goto L_0x0082
            android.content.Context r0 = r14.f1117a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x0021
            r0.getRealSize(r1)
            goto L_0x0024
        L_0x0021:
            r0.getSize(r1)
        L_0x0024:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f1117a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = android.support.p010v7.p011a.C0191e.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003c
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0050
            android.support.v7.view.menu.f r0 = new android.support.v7.view.menu.f
            android.content.Context r2 = r14.f1117a
            android.view.View r3 = r14.f1122f
            int r4 = r14.f1120d
            int r5 = r14.f1121e
            boolean r6 = r14.f1119c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0062
        L_0x0050:
            android.support.v7.view.menu.aj r0 = new android.support.v7.view.menu.aj
            android.content.Context r8 = r14.f1117a
            android.support.v7.view.menu.MenuBuilder r9 = r14.f1118b
            android.view.View r10 = r14.f1122f
            int r11 = r14.f1120d
            int r12 = r14.f1121e
            boolean r13 = r14.f1119c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0062:
            android.support.v7.view.menu.MenuBuilder r1 = r14.f1118b
            r0.mo3744a((android.support.p010v7.view.menu.MenuBuilder) r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f1128l
            r0.mo3746a((android.widget.PopupWindow.OnDismissListener) r1)
            android.view.View r1 = r14.f1122f
            r0.mo3745a((android.view.View) r1)
            android.support.v7.view.menu.ad r1 = r14.f1125i
            r0.mo3709a((android.support.p010v7.view.menu.C0287ad) r1)
            boolean r1 = r14.f1124h
            r0.mo3748b((boolean) r1)
            int r1 = r14.f1123g
            r0.mo3743a((int) r1)
            r14.f1126j = r0
        L_0x0082:
            android.support.v7.view.menu.z r0 = r14.f1126j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.view.menu.C0284aa.mo3701c():android.support.v7.view.menu.z");
    }

    /* renamed from: d */
    public final boolean mo3702d() {
        if (mo3705g()) {
            return true;
        }
        if (this.f1122f == null) {
            return false;
        }
        m662a(0, 0, false, false);
        return true;
    }

    /* renamed from: e */
    public final void mo3703e() {
        if (mo3705g()) {
            this.f1126j.mo3740c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo3704f() {
        this.f1126j = null;
        if (this.f1127k != null) {
            this.f1127k.onDismiss();
        }
    }

    /* renamed from: g */
    public final boolean mo3705g() {
        return this.f1126j != null && this.f1126j.mo3741d();
    }
}
