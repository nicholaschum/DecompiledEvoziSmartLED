package android.support.p010v7.widget;

import android.os.SystemClock;
import android.support.p010v7.view.menu.C0292ai;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.widget.bk */
public abstract class C0361bk implements View.OnAttachStateChangeListener, View.OnTouchListener {

    /* renamed from: a */
    private final float f1713a;

    /* renamed from: b */
    private final int f1714b;

    /* renamed from: c */
    final View f1715c;

    /* renamed from: d */
    private final int f1716d;

    /* renamed from: e */
    private Runnable f1717e;

    /* renamed from: f */
    private Runnable f1718f;

    /* renamed from: g */
    private boolean f1719g;

    /* renamed from: h */
    private int f1720h;

    /* renamed from: i */
    private final int[] f1721i = new int[2];

    public C0361bk(View view) {
        this.f1715c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1713a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1714b = ViewConfiguration.getTapTimeout();
        this.f1716d = (this.f1714b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: e */
    private void m1252e() {
        if (this.f1718f != null) {
            this.f1715c.removeCallbacks(this.f1718f);
        }
        if (this.f1717e != null) {
            this.f1715c.removeCallbacks(this.f1717e);
        }
    }

    /* renamed from: a */
    public abstract C0292ai mo3692a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo3693b() {
        C0292ai a = mo3692a();
        if (a == null || a.mo3741d()) {
            return true;
        }
        a.mo3739a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo4265c() {
        C0292ai a = mo3692a();
        if (a == null || !a.mo3741d()) {
            return true;
        }
        a.mo3740c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4413d() {
        m1252e();
        View view = this.f1715c;
        if (view.isEnabled() && !view.isLongClickable() && mo3693b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1719g = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r11 = r10.f1719g
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x0071
            android.view.View r2 = r10.f1715c
            android.support.v7.view.menu.ai r3 = r10.mo3692a()
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.mo3741d()
            if (r4 != 0) goto L_0x0015
            goto L_0x0061
        L_0x0015:
            android.widget.ListView r3 = r3.mo3742e()
            android.support.v7.widget.bf r3 = (android.support.p010v7.widget.C0356bf) r3
            if (r3 == 0) goto L_0x0061
            boolean r4 = r3.isShown()
            if (r4 != 0) goto L_0x0024
            goto L_0x0061
        L_0x0024:
            android.view.MotionEvent r4 = android.view.MotionEvent.obtainNoHistory(r12)
            int[] r5 = r10.f1721i
            r2.getLocationOnScreen(r5)
            r2 = r5[r1]
            float r2 = (float) r2
            r5 = r5[r0]
            float r5 = (float) r5
            r4.offsetLocation(r2, r5)
            int[] r2 = r10.f1721i
            r3.getLocationOnScreen(r2)
            r5 = r2[r1]
            int r5 = -r5
            float r5 = (float) r5
            r2 = r2[r0]
            int r2 = -r2
            float r2 = (float) r2
            r4.offsetLocation(r5, r2)
            int r2 = r10.f1720h
            boolean r2 = r3.mo4400a(r4, r2)
            r4.recycle()
            int r12 = r12.getActionMasked()
            if (r12 == r0) goto L_0x005a
            r3 = 3
            if (r12 == r3) goto L_0x005a
            r12 = 1
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            if (r2 == 0) goto L_0x0061
            if (r12 == 0) goto L_0x0061
            r12 = 1
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            if (r12 != 0) goto L_0x006e
            boolean r12 = r10.mo4265c()
            if (r12 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r12 = 0
            goto L_0x011f
        L_0x006e:
            r12 = 1
            goto L_0x011f
        L_0x0071:
            android.view.View r2 = r10.f1715c
            boolean r3 = r2.isEnabled()
            if (r3 == 0) goto L_0x00fc
            int r3 = r12.getActionMasked()
            switch(r3) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cc;
                case 2: goto L_0x0082;
                case 3: goto L_0x00cc;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x00fc
        L_0x0082:
            int r3 = r10.f1720h
            int r3 = r12.findPointerIndex(r3)
            if (r3 < 0) goto L_0x00fc
            float r4 = r12.getX(r3)
            float r12 = r12.getY(r3)
            float r3 = r10.f1713a
            float r5 = -r3
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto L_0x00bd
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x00bd
            int r5 = r2.getRight()
            int r6 = r2.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r3
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00bd
            int r4 = r2.getBottom()
            int r5 = r2.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r3
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x00bd
            r12 = 1
            goto L_0x00be
        L_0x00bd:
            r12 = 0
        L_0x00be:
            if (r12 != 0) goto L_0x00fc
            r10.m1252e()
            android.view.ViewParent r12 = r2.getParent()
            r12.requestDisallowInterceptTouchEvent(r0)
            r12 = 1
            goto L_0x00fd
        L_0x00cc:
            r10.m1252e()
            goto L_0x00fc
        L_0x00d0:
            int r12 = r12.getPointerId(r1)
            r10.f1720h = r12
            java.lang.Runnable r12 = r10.f1717e
            if (r12 != 0) goto L_0x00e1
            android.support.v7.widget.bl r12 = new android.support.v7.widget.bl
            r12.<init>(r10)
            r10.f1717e = r12
        L_0x00e1:
            java.lang.Runnable r12 = r10.f1717e
            int r3 = r10.f1714b
            long r3 = (long) r3
            r2.postDelayed(r12, r3)
            java.lang.Runnable r12 = r10.f1718f
            if (r12 != 0) goto L_0x00f4
            android.support.v7.widget.bm r12 = new android.support.v7.widget.bm
            r12.<init>(r10)
            r10.f1718f = r12
        L_0x00f4:
            java.lang.Runnable r12 = r10.f1718f
            int r3 = r10.f1716d
            long r3 = (long) r3
            r2.postDelayed(r12, r3)
        L_0x00fc:
            r12 = 0
        L_0x00fd:
            if (r12 == 0) goto L_0x0107
            boolean r12 = r10.mo3693b()
            if (r12 == 0) goto L_0x0107
            r12 = 1
            goto L_0x0108
        L_0x0107:
            r12 = 0
        L_0x0108:
            if (r12 == 0) goto L_0x011f
            long r4 = android.os.SystemClock.uptimeMillis()
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r3 = r10.f1715c
            r3.onTouchEvent(r2)
            r2.recycle()
        L_0x011f:
            r10.f1719g = r12
            if (r12 != 0) goto L_0x0127
            if (r11 == 0) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            return r1
        L_0x0127:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0361bk.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1719g = false;
        this.f1720h = -1;
        if (this.f1717e != null) {
            this.f1715c.removeCallbacks(this.f1717e);
        }
    }
}
