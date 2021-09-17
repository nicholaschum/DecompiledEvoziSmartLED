package android.support.p010v7.widget;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.widget.ct */
final class C0397ct extends TouchDelegate {

    /* renamed from: a */
    private final View f1779a;

    /* renamed from: b */
    private final Rect f1780b = new Rect();

    /* renamed from: c */
    private final Rect f1781c = new Rect();

    /* renamed from: d */
    private final Rect f1782d = new Rect();

    /* renamed from: e */
    private final int f1783e;

    /* renamed from: f */
    private boolean f1784f;

    public C0397ct(Rect rect, Rect rect2, View view) {
        super(rect, view);
        this.f1783e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        mo4529a(rect, rect2);
        this.f1779a = view;
    }

    /* renamed from: a */
    public final void mo4529a(Rect rect, Rect rect2) {
        this.f1780b.set(rect);
        this.f1782d.set(rect);
        this.f1782d.inset(-this.f1783e, -this.f1783e);
        this.f1781c.set(rect2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r7.getAction()
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0033
        L_0x0014:
            boolean r2 = r6.f1784f
            r6.f1784f = r4
            goto L_0x0034
        L_0x0019:
            boolean r2 = r6.f1784f
            if (r2 == 0) goto L_0x0034
            android.graphics.Rect r5 = r6.f1782d
            boolean r5 = r5.contains(r0, r1)
            if (r5 != 0) goto L_0x0034
            r3 = 0
            goto L_0x0034
        L_0x0027:
            android.graphics.Rect r2 = r6.f1780b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L_0x0033
            r6.f1784f = r3
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0067
            if (r3 == 0) goto L_0x0052
            android.graphics.Rect r2 = r6.f1781c
            boolean r2 = r2.contains(r0, r1)
            if (r2 != 0) goto L_0x0052
            android.view.View r0 = r6.f1779a
            int r0 = r0.getWidth()
            int r0 = r0 / 2
            float r0 = (float) r0
            android.view.View r1 = r6.f1779a
            int r1 = r1.getHeight()
            int r1 = r1 / 2
            goto L_0x005d
        L_0x0052:
            android.graphics.Rect r2 = r6.f1781c
            int r2 = r2.left
            int r0 = r0 - r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r6.f1781c
            int r2 = r2.top
            int r1 = r1 - r2
        L_0x005d:
            float r1 = (float) r1
            r7.setLocation(r0, r1)
            android.view.View r0 = r6.f1779a
            boolean r4 = r0.dispatchTouchEvent(r7)
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0397ct.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
