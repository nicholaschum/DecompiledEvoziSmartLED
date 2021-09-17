package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.GravityCompat;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.LinearLayoutCompat */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    private boolean f1403a;

    /* renamed from: b */
    private int f1404b;

    /* renamed from: c */
    private int f1405c;

    /* renamed from: d */
    private int f1406d;

    /* renamed from: e */
    private int f1407e;

    /* renamed from: f */
    private int f1408f;

    /* renamed from: g */
    private float f1409g;

    /* renamed from: h */
    private boolean f1410h;

    /* renamed from: i */
    private int[] f1411i;

    /* renamed from: j */
    private int[] f1412j;

    /* renamed from: k */
    private Drawable f1413k;

    /* renamed from: l */
    private int f1414l;

    /* renamed from: m */
    private int f1415m;

    /* renamed from: n */
    private int f1416n;

    /* renamed from: o */
    private int f1417o;

    /* renamed from: android.support.v7.widget.LinearLayoutCompat$LayoutParams */
    public class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f1418g;

        /* renamed from: h */
        public int f1419h;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1419h = -1;
            this.f1418g = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1419h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f401bs);
            this.f1418g = obtainStyledAttributes.getFloat(C0197k.f403bu, 0.0f);
            this.f1419h = obtainStyledAttributes.getInt(C0197k.f402bt, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1419h = -1;
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        this.f1403a = true;
        this.f1404b = -1;
        this.f1405c = 0;
        this.f1407e = 8388659;
        C0407dc a = C0407dc.m1308a(context, attributeSet, C0197k.f391bi, i, 0);
        int a2 = a.mo4543a(C0197k.f393bk, -1);
        if (a2 >= 0 && this.f1406d != a2) {
            this.f1406d = a2;
            requestLayout();
        }
        int a3 = a.mo4543a(C0197k.f392bj, -1);
        if (a3 >= 0 && this.f1407e != a3) {
            a3 = (8388615 & a3) == 0 ? a3 | GravityCompat.START : a3;
            this.f1407e = (a3 & C0197k.f315aL) == 0 ? a3 | 48 : a3;
            requestLayout();
        }
        boolean a4 = a.mo4547a(C0197k.f394bl, true);
        if (!a4) {
            this.f1403a = a4;
        }
        this.f1409g = a.mo4554e(C0197k.f396bn);
        this.f1404b = a.mo4543a(C0197k.f395bm, -1);
        this.f1410h = a.mo4547a(C0197k.f399bq, false);
        Drawable a5 = a.mo4545a(C0197k.f397bo);
        if (a5 != this.f1413k) {
            this.f1413k = a5;
            if (a5 != null) {
                this.f1414l = a5.getIntrinsicWidth();
                this.f1415m = a5.getIntrinsicHeight();
            } else {
                this.f1414l = 0;
                this.f1415m = 0;
            }
            setWillNotDraw(a5 != null ? false : z);
            requestLayout();
        }
        this.f1416n = a.mo4543a(C0197k.f400br, 0);
        this.f1417o = a.mo4555e(C0197k.f398bp, 0);
        a.mo4546a();
    }

    /* renamed from: a */
    private void m929a(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* renamed from: a */
    private void m930a(Canvas canvas, int i) {
        this.f1413k.setBounds(getPaddingLeft() + this.f1417o, i, (getWidth() - getPaddingRight()) - this.f1417o, this.f1415m + i);
        this.f1413k.draw(canvas);
    }

    /* renamed from: a */
    private void m931a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0396, code lost:
        if (r7 < 0) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0223, code lost:
        if (r13[3] != -1) goto L_0x0227;
     */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m932b(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r40
            r8 = 0
            r6.f1408f = r8
            int r9 = r38.getChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.f1411i
            r12 = 4
            if (r0 == 0) goto L_0x001c
            int[] r0 = r6.f1412j
            if (r0 != 0) goto L_0x0024
        L_0x001c:
            int[] r0 = new int[r12]
            r6.f1411i = r0
            int[] r0 = new int[r12]
            r6.f1412j = r0
        L_0x0024:
            int[] r13 = r6.f1411i
            int[] r14 = r6.f1412j
            r15 = 3
            r5 = -1
            r13[r15] = r5
            r16 = 2
            r13[r16] = r5
            r17 = 1
            r13[r17] = r5
            r13[r8] = r5
            r14[r15] = r5
            r14[r16] = r5
            r14[r17] = r5
            r14[r8] = r5
            boolean r4 = r6.f1403a
            boolean r3 = r6.f1410h
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 != r2) goto L_0x0049
            r18 = 1
            goto L_0x004b
        L_0x0049:
            r18 = 0
        L_0x004b:
            r19 = 0
            r0 = 0
            r1 = 0
            r12 = 0
            r15 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x005d:
            r5 = 8
            if (r1 >= r9) goto L_0x01f3
            android.view.View r2 = r6.getChildAt(r1)
            if (r2 != 0) goto L_0x0077
            int r2 = r6.f1408f
            int r2 = r2 + r8
            r6.f1408f = r2
            r29 = r0
            r0 = r1
            r33 = r3
            r27 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x01e2
        L_0x0077:
            int r8 = r2.getVisibility()
            if (r8 == r5) goto L_0x01ce
            boolean r5 = r6.mo4124b((int) r1)
            if (r5 == 0) goto L_0x008a
            int r5 = r6.f1408f
            int r8 = r6.f1414l
            int r5 = r5 + r8
            r6.f1408f = r5
        L_0x008a:
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            r8 = r5
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r8 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r8
            float r5 = r8.f1418g
            float r29 = r0 + r5
            r5 = 1073741824(0x40000000, float:2.0)
            if (r10 != r5) goto L_0x00e3
            int r0 = r8.width
            if (r0 != 0) goto L_0x00e3
            float r0 = r8.f1418g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e3
            if (r18 == 0) goto L_0x00b2
            int r0 = r6.f1408f
            int r5 = r8.leftMargin
            r31 = r1
            int r1 = r8.rightMargin
            int r5 = r5 + r1
            int r0 = r0 + r5
        L_0x00af:
            r6.f1408f = r0
            goto L_0x00c1
        L_0x00b2:
            r31 = r1
            int r0 = r6.f1408f
            int r1 = r8.leftMargin
            int r1 = r1 + r0
            int r5 = r8.rightMargin
            int r1 = r1 + r5
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x00af
        L_0x00c1:
            if (r4 == 0) goto L_0x00d5
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r2.measure(r1, r1)
            r30 = r2
            r33 = r3
            r27 = r4
            r26 = -2
            goto L_0x0150
        L_0x00d5:
            r30 = r2
            r33 = r3
            r27 = r4
            r1 = 1073741824(0x40000000, float:2.0)
            r20 = 1
            r26 = -2
            goto L_0x0152
        L_0x00e3:
            r31 = r1
            int r0 = r8.width
            if (r0 != 0) goto L_0x00f4
            float r0 = r8.f1418g
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            r5 = -2
            r8.width = r5
            r1 = 0
            goto L_0x00f7
        L_0x00f4:
            r5 = -2
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00f7:
            int r0 = (r29 > r19 ? 1 : (r29 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x0100
            int r0 = r6.f1408f
            r27 = r0
            goto L_0x0102
        L_0x0100:
            r27 = 0
        L_0x0102:
            r28 = 0
            r0 = r38
            r32 = r1
            r1 = r2
            r30 = r2
            r2 = r39
            r33 = r3
            r3 = r27
            r27 = r4
            r4 = r40
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = -2
            r5 = r28
            r0.m931a(r1, r2, r3, r4, r5)
            r0 = r32
            if (r0 == r7) goto L_0x0124
            r8.width = r0
        L_0x0124:
            int r0 = r30.getMeasuredWidth()
            if (r18 == 0) goto L_0x0138
            int r1 = r6.f1408f
            int r2 = r8.leftMargin
            int r2 = r2 + r0
            int r3 = r8.rightMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = r1 + r2
        L_0x0135:
            r6.f1408f = r1
            goto L_0x0149
        L_0x0138:
            r3 = 0
            int r1 = r6.f1408f
            int r2 = r1 + r0
            int r4 = r8.leftMargin
            int r2 = r2 + r4
            int r4 = r8.rightMargin
            int r2 = r2 + r4
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            goto L_0x0135
        L_0x0149:
            if (r33 == 0) goto L_0x0150
            int r0 = java.lang.Math.max(r0, r12)
            r12 = r0
        L_0x0150:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0152:
            if (r11 == r1) goto L_0x015d
            int r0 = r8.height
            r2 = -1
            if (r0 != r2) goto L_0x015d
            r0 = 1
            r25 = 1
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            int r2 = r8.topMargin
            int r3 = r8.bottomMargin
            int r2 = r2 + r3
            int r3 = r30.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r30.getMeasuredState()
            r5 = r23
            int r23 = android.view.View.combineMeasuredStates(r5, r4)
            if (r27 == 0) goto L_0x019e
            int r4 = r30.getBaseline()
            r5 = -1
            if (r4 == r5) goto L_0x019e
            int r5 = r8.f1419h
            if (r5 >= 0) goto L_0x0182
            int r5 = r6.f1407e
            goto L_0x0184
        L_0x0182:
            int r5 = r8.f1419h
        L_0x0184:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r7 = 4
            int r5 = r5 >> r7
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r4)
            r13[r5] = r7
            r7 = r14[r5]
            int r4 = r3 - r4
            int r4 = java.lang.Math.max(r7, r4)
            r14[r5] = r4
        L_0x019e:
            int r15 = java.lang.Math.max(r15, r3)
            if (r24 == 0) goto L_0x01ac
            int r4 = r8.height
            r5 = -1
            if (r4 != r5) goto L_0x01ac
            r24 = 1
            goto L_0x01ae
        L_0x01ac:
            r24 = 0
        L_0x01ae:
            float r4 = r8.f1418g
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x01c2
            if (r0 == 0) goto L_0x01b9
        L_0x01b6:
            r8 = r22
            goto L_0x01bb
        L_0x01b9:
            r2 = r3
            goto L_0x01b6
        L_0x01bb:
            int r22 = java.lang.Math.max(r8, r2)
            r8 = r22
            goto L_0x01de
        L_0x01c2:
            r8 = r22
            if (r0 == 0) goto L_0x01c7
            r3 = r2
        L_0x01c7:
            r2 = r21
            int r21 = java.lang.Math.max(r2, r3)
            goto L_0x01de
        L_0x01ce:
            r31 = r1
            r33 = r3
            r27 = r4
            r2 = r21
            r8 = r22
            r5 = r23
            r1 = 1073741824(0x40000000, float:2.0)
            r29 = r0
        L_0x01de:
            int r0 = r31 + 0
            r22 = r8
        L_0x01e2:
            int r0 = r0 + 1
            r1 = r0
            r4 = r27
            r0 = r29
            r3 = r33
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r7 = r40
            r8 = 0
            goto L_0x005d
        L_0x01f3:
            r33 = r3
            r27 = r4
            r2 = r21
            r8 = r22
            r1 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = -2
            int r3 = r6.f1408f
            if (r3 <= 0) goto L_0x0212
            boolean r3 = r6.mo4124b((int) r9)
            if (r3 == 0) goto L_0x0212
            int r3 = r6.f1408f
            int r4 = r6.f1414l
            int r3 = r3 + r4
            r6.f1408f = r3
        L_0x0212:
            r3 = r13[r17]
            r4 = -1
            if (r3 != r4) goto L_0x0226
            r3 = 0
            r1 = r13[r3]
            if (r1 != r4) goto L_0x0226
            r1 = r13[r16]
            if (r1 != r4) goto L_0x0226
            r1 = 3
            r3 = r13[r1]
            if (r3 == r4) goto L_0x0256
            goto L_0x0227
        L_0x0226:
            r1 = 3
        L_0x0227:
            r3 = r13[r1]
            r4 = 0
            r5 = r13[r4]
            r7 = r13[r17]
            r4 = r13[r16]
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r14[r1]
            r1 = 0
            r5 = r14[r1]
            r1 = r14[r17]
            r7 = r14[r16]
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = java.lang.Math.max(r5, r1)
            int r1 = java.lang.Math.max(r4, r1)
            int r3 = r3 + r1
            int r15 = java.lang.Math.max(r15, r3)
        L_0x0256:
            if (r33 == 0) goto L_0x02a6
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r1) goto L_0x025e
            if (r10 != 0) goto L_0x02a6
        L_0x025e:
            r1 = 0
            r6.f1408f = r1
            r3 = 0
        L_0x0262:
            if (r3 >= r9) goto L_0x02a6
            android.view.View r4 = r6.getChildAt(r3)
            if (r4 != 0) goto L_0x0270
            int r4 = r6.f1408f
            int r4 = r4 + r1
        L_0x026d:
            r6.f1408f = r4
            goto L_0x02a2
        L_0x0270:
            int r1 = r4.getVisibility()
            r5 = 8
            if (r1 != r5) goto L_0x027b
            int r3 = r3 + 0
            goto L_0x02a2
        L_0x027b:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r1 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r1
            if (r18 == 0) goto L_0x028f
            int r4 = r6.f1408f
            int r5 = r1.leftMargin
            int r5 = r5 + r12
            int r1 = r1.rightMargin
            int r5 = r5 + r1
            r7 = 0
            int r5 = r5 + r7
            int r4 = r4 + r5
            goto L_0x026d
        L_0x028f:
            r7 = 0
            int r4 = r6.f1408f
            int r5 = r4 + r12
            int r7 = r1.leftMargin
            int r5 = r5 + r7
            int r1 = r1.rightMargin
            int r5 = r5 + r1
            r1 = 0
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r4, r5)
            r6.f1408f = r1
        L_0x02a2:
            int r3 = r3 + 1
            r1 = 0
            goto L_0x0262
        L_0x02a6:
            int r1 = r6.f1408f
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r6.f1408f = r1
            int r1 = r6.f1408f
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r7 = r39
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r7, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r6.f1408f
            int r3 = r3 - r4
            if (r20 != 0) goto L_0x031b
            if (r3 == 0) goto L_0x02d5
            int r5 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x02d5
            goto L_0x031b
        L_0x02d5:
            int r0 = java.lang.Math.max(r2, r8)
            if (r33 == 0) goto L_0x0310
            r2 = 1073741824(0x40000000, float:2.0)
            if (r10 == r2) goto L_0x0310
            r2 = 0
        L_0x02e0:
            if (r2 >= r9) goto L_0x0310
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x030d
            int r5 = r3.getVisibility()
            r8 = 8
            if (r5 == r8) goto L_0x030d
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.f1418g
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x030d
            r5 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            int r10 = r3.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            r3.measure(r8, r10)
        L_0x030d:
            int r2 = r2 + 1
            goto L_0x02e0
        L_0x0310:
            r37 = r1
            r34 = r9
            r8 = r23
            r2 = 0
            r3 = r40
            goto L_0x04ba
        L_0x031b:
            float r5 = r6.f1409g
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 <= 0) goto L_0x0323
            float r0 = r6.f1409g
        L_0x0323:
            r5 = -1
            r8 = 3
            r13[r8] = r5
            r13[r16] = r5
            r13[r17] = r5
            r12 = 0
            r13[r12] = r5
            r14[r8] = r5
            r14[r16] = r5
            r14[r17] = r5
            r14[r12] = r5
            r6.f1408f = r12
            r12 = r2
            r8 = r23
            r15 = -1
            r2 = r0
            r0 = 0
        L_0x033e:
            if (r0 >= r9) goto L_0x045f
            android.view.View r5 = r6.getChildAt(r0)
            if (r5 == 0) goto L_0x0447
            int r4 = r5.getVisibility()
            r7 = 8
            if (r4 == r7) goto L_0x0447
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r4 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r4
            float r7 = r4.f1418g
            int r20 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r20 <= 0) goto L_0x03ae
            r34 = r9
            float r9 = (float) r3
            float r9 = r9 * r7
            float r9 = r9 / r2
            int r9 = (int) r9
            float r2 = r2 - r7
            int r3 = r3 - r9
            int r7 = r38.getPaddingTop()
            int r20 = r38.getPaddingBottom()
            int r7 = r7 + r20
            r35 = r2
            int r2 = r4.topMargin
            int r7 = r7 + r2
            int r2 = r4.bottomMargin
            int r7 = r7 + r2
            int r2 = r4.height
            r37 = r1
            r36 = r3
            r1 = -1
            r3 = r40
            int r2 = getChildMeasureSpec(r3, r7, r2)
            int r7 = r4.width
            if (r7 != 0) goto L_0x0391
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x038b
            goto L_0x0391
        L_0x038b:
            if (r9 <= 0) goto L_0x038f
            r7 = r9
            goto L_0x0399
        L_0x038f:
            r7 = 0
            goto L_0x0399
        L_0x0391:
            int r7 = r5.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x0399
            goto L_0x038f
        L_0x0399:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r5.measure(r7, r2)
            int r2 = r5.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r7
            int r8 = android.view.View.combineMeasuredStates(r8, r2)
            goto L_0x03ba
        L_0x03ae:
            r37 = r1
            r7 = r3
            r34 = r9
            r1 = -1
            r3 = r40
            r35 = r2
            r36 = r7
        L_0x03ba:
            if (r18 == 0) goto L_0x03d0
            int r2 = r6.f1408f
            int r7 = r5.getMeasuredWidth()
            int r9 = r4.leftMargin
            int r7 = r7 + r9
            int r9 = r4.rightMargin
            int r7 = r7 + r9
            r9 = 0
            int r7 = r7 + r9
            int r2 = r2 + r7
            r6.f1408f = r2
        L_0x03cd:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x03e6
        L_0x03d0:
            r9 = 0
            int r2 = r6.f1408f
            int r7 = r5.getMeasuredWidth()
            int r7 = r7 + r2
            int r1 = r4.leftMargin
            int r7 = r7 + r1
            int r1 = r4.rightMargin
            int r7 = r7 + r1
            int r7 = r7 + r9
            int r1 = java.lang.Math.max(r2, r7)
            r6.f1408f = r1
            goto L_0x03cd
        L_0x03e6:
            if (r11 == r1) goto L_0x03ef
            int r1 = r4.height
            r2 = -1
            if (r1 != r2) goto L_0x03ef
            r1 = 1
            goto L_0x03f0
        L_0x03ef:
            r1 = 0
        L_0x03f0:
            int r2 = r4.topMargin
            int r7 = r4.bottomMargin
            int r2 = r2 + r7
            int r7 = r5.getMeasuredHeight()
            int r7 = r7 + r2
            int r9 = java.lang.Math.max(r15, r7)
            if (r1 == 0) goto L_0x0401
            goto L_0x0402
        L_0x0401:
            r2 = r7
        L_0x0402:
            int r1 = java.lang.Math.max(r12, r2)
            if (r24 == 0) goto L_0x040f
            int r2 = r4.height
            r12 = -1
            if (r2 != r12) goto L_0x0410
            r2 = 1
            goto L_0x0411
        L_0x040f:
            r12 = -1
        L_0x0410:
            r2 = 0
        L_0x0411:
            if (r27 == 0) goto L_0x043e
            int r5 = r5.getBaseline()
            if (r5 == r12) goto L_0x043e
            int r12 = r4.f1419h
            if (r12 >= 0) goto L_0x0420
            int r4 = r6.f1407e
            goto L_0x0422
        L_0x0420:
            int r4 = r4.f1419h
        L_0x0422:
            r4 = r4 & 112(0x70, float:1.57E-43)
            r20 = 4
            int r4 = r4 >> 4
            r4 = r4 & -2
            int r4 = r4 >> 1
            r12 = r13[r4]
            int r12 = java.lang.Math.max(r12, r5)
            r13[r4] = r12
            r12 = r14[r4]
            int r7 = r7 - r5
            int r5 = java.lang.Math.max(r12, r7)
            r14[r4] = r5
            goto L_0x0440
        L_0x043e:
            r20 = 4
        L_0x0440:
            r12 = r1
            r24 = r2
            r15 = r9
            r2 = r35
            goto L_0x0452
        L_0x0447:
            r37 = r1
            r7 = r3
            r34 = r9
            r3 = r40
            r20 = 4
            r36 = r7
        L_0x0452:
            int r0 = r0 + 1
            r9 = r34
            r3 = r36
            r1 = r37
            r5 = -1
            r7 = r39
            goto L_0x033e
        L_0x045f:
            r37 = r1
            r34 = r9
            r3 = r40
            int r0 = r6.f1408f
            int r1 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r1 = r1 + r2
            int r0 = r0 + r1
            r6.f1408f = r0
            r0 = r13[r17]
            r1 = -1
            if (r0 != r1) goto L_0x0489
            r0 = 0
            r2 = r13[r0]
            if (r2 != r1) goto L_0x0489
            r0 = r13[r16]
            if (r0 != r1) goto L_0x0489
            r0 = 3
            r2 = r13[r0]
            if (r2 == r1) goto L_0x0487
            goto L_0x048a
        L_0x0487:
            r2 = 0
            goto L_0x04b9
        L_0x0489:
            r0 = 3
        L_0x048a:
            r1 = r13[r0]
            r2 = 0
            r4 = r13[r2]
            r5 = r13[r17]
            r7 = r13[r16]
            int r5 = java.lang.Math.max(r5, r7)
            int r4 = java.lang.Math.max(r4, r5)
            int r1 = java.lang.Math.max(r1, r4)
            r0 = r14[r0]
            r4 = r14[r2]
            r5 = r14[r17]
            r7 = r14[r16]
            int r5 = java.lang.Math.max(r5, r7)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r15, r1)
            r15 = r0
        L_0x04b9:
            r0 = r12
        L_0x04ba:
            if (r24 != 0) goto L_0x04c1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x04c1
            r15 = r0
        L_0x04c1:
            int r0 = r38.getPaddingTop()
            int r1 = r38.getPaddingBottom()
            int r0 = r0 + r1
            int r15 = r15 + r0
            int r0 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r15, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r8
            r1 = r37 | r1
            int r4 = r8 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r4)
            r6.setMeasuredDimension(r1, r0)
            if (r25 == 0) goto L_0x0529
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r8 = r34
            r9 = 0
        L_0x04f0:
            if (r9 >= r8) goto L_0x0529
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0523
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r10
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0523
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r12 = 0
            r0 = r38
            r13 = -1
            r2 = r39
            r4 = r7
            r14 = 8
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
            goto L_0x0526
        L_0x0523:
            r13 = -1
            r14 = 8
        L_0x0526:
            int r9 = r9 + 1
            goto L_0x04f0
        L_0x0529:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.LinearLayoutCompat.m932b(int, int):void");
    }

    /* renamed from: b */
    private void m933b(Canvas canvas, int i) {
        this.f1413k.setBounds(i, getPaddingTop() + this.f1417o, this.f1414l + i, (getHeight() - getPaddingBottom()) - this.f1417o);
        this.f1413k.draw(canvas);
    }

    /* renamed from: b */
    private static void m934b(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo4124b(int i) {
        if (i == 0) {
            return (this.f1416n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1416n & 4) != 0;
        }
        if ((this.f1416n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public int getBaseline() {
        int i;
        if (this.f1404b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() > this.f1404b) {
            View childAt = getChildAt(this.f1404b);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f1405c;
                if (this.f1406d == 1 && (i = this.f1407e & C0197k.f315aL) != 48) {
                    if (i == 16) {
                        i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1408f) / 2;
                    } else if (i == 80) {
                        i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1408f;
                    }
                }
                return i2 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1404b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public LayoutParams generateDefaultLayoutParams() {
        if (this.f1406d == 0) {
            return new LayoutParams(-2, -2);
        }
        if (this.f1406d == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: l */
    public final Drawable mo4126l() {
        return this.f1413k;
    }

    /* renamed from: m */
    public final int mo4127m() {
        return this.f1414l;
    }

    /* renamed from: n */
    public final void mo4128n() {
        this.f1403a = false;
    }

    /* renamed from: o */
    public final int mo4129o() {
        return this.f1407e;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int left;
        int i2;
        if (this.f1413k != null) {
            int i3 = 0;
            if (this.f1406d == 1) {
                int childCount = getChildCount();
                while (i3 < childCount) {
                    View childAt = getChildAt(i3);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo4124b(i3))) {
                        m930a(canvas, (childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin) - this.f1415m);
                    }
                    i3++;
                }
                if (mo4124b(childCount)) {
                    View childAt2 = getChildAt(childCount - 1);
                    m930a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1415m : childAt2.getBottom() + ((LayoutParams) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean a = C0423ds.m1382a(this);
            while (i3 < childCount2) {
                View childAt3 = getChildAt(i3);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo4124b(i3))) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    m933b(canvas, a ? childAt3.getRight() + layoutParams.rightMargin : (childAt3.getLeft() - layoutParams.leftMargin) - this.f1414l);
                }
                i3++;
            }
            if (mo4124b(childCount2)) {
                View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (a) {
                        left = childAt4.getLeft();
                        i2 = layoutParams2.leftMargin;
                    } else {
                        i = childAt4.getRight() + layoutParams2.rightMargin;
                        m933b(canvas, i);
                    }
                } else if (a) {
                    i = getPaddingLeft();
                    m933b(canvas, i);
                } else {
                    left = getWidth();
                    i2 = getPaddingRight();
                }
                i = (left - i2) - this.f1414l;
                m933b(canvas, i);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r5 = r0.f1406d
            r6 = 8
            r7 = 5
            r8 = 80
            r9 = 16
            r10 = 8388615(0x800007, float:1.1754953E-38)
            r11 = 2
            r12 = 1
            if (r5 != r12) goto L_0x00b5
            int r5 = r23.getPaddingLeft()
            int r1 = r27 - r25
            int r3 = r23.getPaddingRight()
            int r3 = r1 - r3
            int r1 = r1 - r5
            int r14 = r23.getPaddingRight()
            int r1 = r1 - r14
            int r14 = r23.getChildCount()
            int r15 = r0.f1407e
            r15 = r15 & 112(0x70, float:1.57E-43)
            int r13 = r0.f1407e
            r10 = r10 & r13
            if (r15 == r9) goto L_0x0045
            if (r15 == r8) goto L_0x0038
            int r2 = r23.getPaddingTop()
            goto L_0x0050
        L_0x0038:
            int r8 = r23.getPaddingTop()
            int r8 = r8 + r28
            int r8 = r8 - r26
            int r2 = r0.f1408f
            int r2 = r8 - r2
            goto L_0x0050
        L_0x0045:
            int r8 = r23.getPaddingTop()
            int r2 = r28 - r26
            int r4 = r0.f1408f
            int r2 = r2 - r4
            int r2 = r2 / r11
            int r2 = r2 + r8
        L_0x0050:
            r4 = r2
            r2 = 0
        L_0x0052:
            if (r2 >= r14) goto L_0x00b4
            android.view.View r8 = r0.getChildAt(r2)
            if (r8 != 0) goto L_0x005d
            int r4 = r4 + 0
            goto L_0x00af
        L_0x005d:
            int r9 = r8.getVisibility()
            if (r9 == r6) goto L_0x00af
            int r9 = r8.getMeasuredWidth()
            int r13 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r8.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r15 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r15
            int r6 = r15.f1419h
            if (r6 >= 0) goto L_0x0076
            r6 = r10
        L_0x0076:
            int r11 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r23)
            int r6 = android.support.p007v4.view.GravityCompat.getAbsoluteGravity(r6, r11)
            r6 = r6 & 7
            if (r6 == r12) goto L_0x008b
            if (r6 == r7) goto L_0x0088
            int r6 = r15.leftMargin
            int r6 = r6 + r5
            goto L_0x0096
        L_0x0088:
            int r6 = r3 - r9
            goto L_0x0093
        L_0x008b:
            int r6 = r1 - r9
            r11 = 2
            int r6 = r6 / r11
            int r6 = r6 + r5
            int r11 = r15.leftMargin
            int r6 = r6 + r11
        L_0x0093:
            int r11 = r15.rightMargin
            int r6 = r6 - r11
        L_0x0096:
            boolean r11 = r0.mo4124b((int) r2)
            if (r11 == 0) goto L_0x009f
            int r11 = r0.f1415m
            int r4 = r4 + r11
        L_0x009f:
            int r11 = r15.topMargin
            int r4 = r4 + r11
            int r11 = r4 + 0
            m934b(r8, r6, r11, r9, r13)
            int r6 = r15.bottomMargin
            int r13 = r13 + r6
            r6 = 0
            int r13 = r13 + r6
            int r4 = r4 + r13
            int r2 = r2 + 0
        L_0x00af:
            int r2 = r2 + r12
            r6 = 8
            r11 = 2
            goto L_0x0052
        L_0x00b4:
            return
        L_0x00b5:
            boolean r5 = android.support.p010v7.widget.C0423ds.m1382a(r23)
            int r6 = r23.getPaddingTop()
            int r2 = r28 - r26
            int r4 = r23.getPaddingBottom()
            int r4 = r2 - r4
            int r2 = r2 - r6
            int r11 = r23.getPaddingBottom()
            int r2 = r2 - r11
            int r11 = r23.getChildCount()
            int r13 = r0.f1407e
            r10 = r10 & r13
            int r13 = r0.f1407e
            r13 = r13 & 112(0x70, float:1.57E-43)
            boolean r14 = r0.f1403a
            int[] r15 = r0.f1411i
            int[] r8 = r0.f1412j
            int r9 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r23)
            int r9 = android.support.p007v4.view.GravityCompat.getAbsoluteGravity(r10, r9)
            if (r9 == r12) goto L_0x00fa
            if (r9 == r7) goto L_0x00ed
            int r1 = r23.getPaddingLeft()
            goto L_0x0106
        L_0x00ed:
            int r7 = r23.getPaddingLeft()
            int r7 = r7 + r27
            int r7 = r7 - r25
            int r1 = r0.f1408f
            int r1 = r7 - r1
            goto L_0x0106
        L_0x00fa:
            int r7 = r23.getPaddingLeft()
            int r1 = r27 - r25
            int r3 = r0.f1408f
            int r1 = r1 - r3
            r3 = 2
            int r1 = r1 / r3
            int r1 = r1 + r7
        L_0x0106:
            if (r5 == 0) goto L_0x010c
            int r5 = r11 + -1
            r7 = -1
            goto L_0x010e
        L_0x010c:
            r5 = 0
            r7 = 1
        L_0x010e:
            r9 = r1
            r1 = 0
        L_0x0110:
            if (r1 >= r11) goto L_0x01dc
            int r10 = r7 * r1
            int r10 = r10 + r5
            android.view.View r12 = r0.getChildAt(r10)
            if (r12 != 0) goto L_0x012c
            int r9 = r9 + 0
            r18 = r5
            r19 = r7
            r20 = r11
            r21 = r13
            r22 = r14
            r3 = 1
            r5 = 0
            r14 = -1
            goto L_0x01ce
        L_0x012c:
            int r3 = r12.getVisibility()
            r18 = r5
            r5 = 8
            if (r3 == r5) goto L_0x01c3
            int r3 = r12.getMeasuredWidth()
            int r5 = r12.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r12.getLayoutParams()
            r19 = r7
            r7 = r16
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r7 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r7
            if (r14 == 0) goto L_0x0158
            r20 = r11
            int r11 = r7.height
            r21 = r13
            r13 = -1
            if (r11 == r13) goto L_0x015c
            int r11 = r12.getBaseline()
            goto L_0x015d
        L_0x0158:
            r20 = r11
            r21 = r13
        L_0x015c:
            r11 = -1
        L_0x015d:
            int r13 = r7.f1419h
            if (r13 >= 0) goto L_0x0163
            r13 = r21
        L_0x0163:
            r13 = r13 & 112(0x70, float:1.57E-43)
            r22 = r14
            r14 = 16
            if (r13 == r14) goto L_0x019d
            r14 = 48
            if (r13 == r14) goto L_0x018c
            r14 = 80
            if (r13 == r14) goto L_0x0176
            r11 = r6
            r14 = -1
            goto L_0x01a9
        L_0x0176:
            int r13 = r4 - r5
            int r14 = r7.bottomMargin
            int r13 = r13 - r14
            r14 = -1
            if (r11 == r14) goto L_0x019b
            int r16 = r12.getMeasuredHeight()
            int r16 = r16 - r11
            r11 = 2
            r17 = r8[r11]
            int r17 = r17 - r16
            int r11 = r13 - r17
            goto L_0x01a9
        L_0x018c:
            r14 = -1
            int r13 = r7.topMargin
            int r13 = r13 + r6
            if (r11 == r14) goto L_0x019b
            r16 = 1
            r17 = r15[r16]
            int r17 = r17 - r11
            int r11 = r13 + r17
            goto L_0x01a9
        L_0x019b:
            r11 = r13
            goto L_0x01a9
        L_0x019d:
            r14 = -1
            int r11 = r2 - r5
            r13 = 2
            int r11 = r11 / r13
            int r11 = r11 + r6
            int r13 = r7.topMargin
            int r11 = r11 + r13
            int r13 = r7.bottomMargin
            int r11 = r11 - r13
        L_0x01a9:
            boolean r10 = r0.mo4124b((int) r10)
            if (r10 == 0) goto L_0x01b2
            int r10 = r0.f1414l
            int r9 = r9 + r10
        L_0x01b2:
            int r10 = r7.leftMargin
            int r9 = r9 + r10
            int r10 = r9 + 0
            m934b(r12, r10, r11, r3, r5)
            int r5 = r7.rightMargin
            int r3 = r3 + r5
            r5 = 0
            int r3 = r3 + r5
            int r9 = r9 + r3
            int r1 = r1 + 0
            goto L_0x01cd
        L_0x01c3:
            r19 = r7
            r20 = r11
            r21 = r13
            r22 = r14
            r5 = 0
            r14 = -1
        L_0x01cd:
            r3 = 1
        L_0x01ce:
            int r1 = r1 + r3
            r5 = r18
            r7 = r19
            r11 = r20
            r13 = r21
            r14 = r22
            r12 = 1
            goto L_0x0110
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0155  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r37, int r38) {
        /*
            r36 = this;
            r6 = r36
            r7 = r37
            r8 = r38
            int r0 = r6.f1406d
            r9 = 1
            if (r0 != r9) goto L_0x0372
            r10 = 0
            r6.f1408f = r10
            int r11 = r36.getChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r37)
            int r13 = android.view.View.MeasureSpec.getMode(r38)
            int r14 = r6.f1404b
            boolean r15 = r6.f1410h
            r16 = 0
            r0 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
        L_0x002e:
            if (r5 >= r11) goto L_0x0189
            android.view.View r22 = r6.getChildAt(r5)
            if (r22 != 0) goto L_0x0042
            int r3 = r6.f1408f
            int r3 = r3 + r10
            r6.f1408f = r3
            r28 = r11
            r27 = r13
        L_0x003f:
            r3 = 1
            goto L_0x017d
        L_0x0042:
            int r10 = r22.getVisibility()
            r3 = 8
            if (r10 == r3) goto L_0x0163
            boolean r3 = r6.mo4124b((int) r5)
            if (r3 == 0) goto L_0x0057
            int r3 = r6.f1408f
            int r10 = r6.f1415m
            int r3 = r3 + r10
            r6.f1408f = r3
        L_0x0057:
            android.view.ViewGroup$LayoutParams r3 = r22.getLayoutParams()
            r10 = r3
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r10 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r10
            float r3 = r10.f1418g
            float r21 = r0 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r13 != r3) goto L_0x0090
            int r0 = r10.height
            if (r0 != 0) goto L_0x0090
            float r0 = r10.f1418g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
            int r0 = r6.f1408f
            int r3 = r10.topMargin
            int r3 = r3 + r0
            r24 = r1
            int r1 = r10.bottomMargin
            int r3 = r3 + r1
            int r0 = java.lang.Math.max(r0, r3)
            r6.f1408f = r0
            r29 = r4
            r30 = r5
            r28 = r11
            r27 = r13
            r8 = r20
            r26 = r24
            r17 = 1
            goto L_0x00f2
        L_0x0090:
            r24 = r1
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a1
            float r0 = r10.f1418g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
            r0 = -2
            r10.height = r0
            r3 = 0
            goto L_0x00a3
        L_0x00a1:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a3:
            r23 = 0
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00ae
            int r0 = r6.f1408f
            r25 = r0
            goto L_0x00b0
        L_0x00ae:
            r25 = 0
        L_0x00b0:
            r0 = r36
            r26 = r24
            r1 = r22
            r7 = r2
            r2 = r37
            r28 = r11
            r27 = r13
            r8 = r20
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r3
            r3 = r23
            r29 = r4
            r4 = r38
            r30 = r5
            r5 = r25
            r0.m931a(r1, r2, r3, r4, r5)
            if (r13 == r11) goto L_0x00d3
            r10.height = r13
        L_0x00d3:
            int r0 = r22.getMeasuredHeight()
            int r1 = r6.f1408f
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f1408f = r1
            if (r15 == 0) goto L_0x00f1
            int r0 = java.lang.Math.max(r0, r7)
            r2 = r0
            goto L_0x00f2
        L_0x00f1:
            r2 = r7
        L_0x00f2:
            if (r14 < 0) goto L_0x00ff
            r1 = r30
            int r5 = r1 + 1
            if (r14 != r5) goto L_0x0101
            int r0 = r6.f1408f
            r6.f1405c = r0
            goto L_0x0101
        L_0x00ff:
            r1 = r30
        L_0x0101:
            if (r1 >= r14) goto L_0x0112
            float r0 = r10.f1418g
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x010a
            goto L_0x0112
        L_0x010a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0112:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r12 == r0) goto L_0x011f
            int r0 = r10.width
            r3 = -1
            if (r0 != r3) goto L_0x0120
            r0 = 1
            r19 = 1
            goto L_0x0121
        L_0x011f:
            r3 = -1
        L_0x0120:
            r0 = 0
        L_0x0121:
            int r4 = r10.leftMargin
            int r5 = r10.rightMargin
            int r4 = r4 + r5
            int r5 = r22.getMeasuredWidth()
            int r5 = r5 + r4
            r13 = r26
            int r7 = java.lang.Math.max(r13, r5)
            int r11 = r22.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r9, r11)
            if (r18 == 0) goto L_0x0142
            int r11 = r10.width
            if (r11 != r3) goto L_0x0142
            r18 = 1
            goto L_0x0144
        L_0x0142:
            r18 = 0
        L_0x0144:
            float r3 = r10.f1418g
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0155
            if (r0 == 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r4 = r5
        L_0x014e:
            int r20 = java.lang.Math.max(r8, r4)
            r8 = r20
            goto L_0x0172
        L_0x0155:
            if (r0 == 0) goto L_0x015a
        L_0x0157:
            r10 = r29
            goto L_0x015c
        L_0x015a:
            r4 = r5
            goto L_0x0157
        L_0x015c:
            int r4 = java.lang.Math.max(r10, r4)
            r29 = r4
            goto L_0x0172
        L_0x0163:
            r7 = r2
            r10 = r4
            r28 = r11
            r27 = r13
            r8 = r20
            r13 = r1
            r1 = r5
            r21 = r0
            r29 = r10
            r7 = r13
        L_0x0172:
            int r5 = r1 + 0
            r1 = r7
            r20 = r8
            r0 = r21
            r4 = r29
            goto L_0x003f
        L_0x017d:
            int r5 = r5 + r3
            r13 = r27
            r11 = r28
            r7 = r37
            r8 = r38
            r10 = 0
            goto L_0x002e
        L_0x0189:
            r7 = r2
            r10 = r4
            r28 = r11
            r27 = r13
            r8 = r20
            r3 = -1
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r1
            int r1 = r6.f1408f
            if (r1 <= 0) goto L_0x01a9
            r1 = r28
            boolean r2 = r6.mo4124b((int) r1)
            if (r2 == 0) goto L_0x01ab
            int r2 = r6.f1408f
            int r4 = r6.f1415m
            int r2 = r2 + r4
            r6.f1408f = r2
            goto L_0x01ab
        L_0x01a9:
            r1 = r28
        L_0x01ab:
            if (r15 == 0) goto L_0x01ed
            r2 = r27
            if (r2 == r11) goto L_0x01b3
            if (r2 != 0) goto L_0x01ef
        L_0x01b3:
            r4 = 0
            r6.f1408f = r4
            r5 = 0
        L_0x01b7:
            if (r5 >= r1) goto L_0x01ef
            android.view.View r11 = r6.getChildAt(r5)
            if (r11 != 0) goto L_0x01c5
            int r11 = r6.f1408f
            int r11 = r11 + r4
            r6.f1408f = r11
            goto L_0x01e8
        L_0x01c5:
            int r4 = r11.getVisibility()
            r14 = 8
            if (r4 != r14) goto L_0x01d0
            int r5 = r5 + 0
            goto L_0x01e8
        L_0x01d0:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r4 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r4
            int r11 = r6.f1408f
            int r14 = r11 + r7
            int r3 = r4.topMargin
            int r14 = r14 + r3
            int r3 = r4.bottomMargin
            int r14 = r14 + r3
            r3 = 0
            int r14 = r14 + r3
            int r3 = java.lang.Math.max(r11, r14)
            r6.f1408f = r3
        L_0x01e8:
            r3 = 1
            int r5 = r5 + r3
            r3 = -1
            r4 = 0
            goto L_0x01b7
        L_0x01ed:
            r2 = r27
        L_0x01ef:
            r3 = 1
            int r4 = r6.f1408f
            int r5 = r36.getPaddingTop()
            int r11 = r36.getPaddingBottom()
            int r5 = r5 + r11
            int r4 = r4 + r5
            r6.f1408f = r4
            int r4 = r6.f1408f
            int r5 = r36.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r5)
            r5 = r38
            r11 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r5, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r4
            int r14 = r6.f1408f
            int r11 = r11 - r14
            if (r17 != 0) goto L_0x025e
            if (r11 == 0) goto L_0x021f
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x021f
            goto L_0x025e
        L_0x021f:
            int r0 = java.lang.Math.max(r10, r8)
            if (r15 == 0) goto L_0x025a
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == r3) goto L_0x025a
            r2 = 0
        L_0x022a:
            if (r2 >= r1) goto L_0x025a
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 == 0) goto L_0x0257
            int r8 = r3.getVisibility()
            r10 = 8
            if (r8 == r10) goto L_0x0257
            android.view.ViewGroup$LayoutParams r8 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r8 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r8
            float r8 = r8.f1418g
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto L_0x0257
            int r8 = r3.getMeasuredWidth()
            r10 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            r3.measure(r8, r11)
        L_0x0257:
            int r2 = r2 + 1
            goto L_0x022a
        L_0x025a:
            r11 = r37
            goto L_0x034c
        L_0x025e:
            float r7 = r6.f1409g
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0266
            float r0 = r6.f1409g
        L_0x0266:
            r7 = 0
            r6.f1408f = r7
            r7 = r0
            r0 = 0
        L_0x026b:
            if (r0 >= r1) goto L_0x033b
            android.view.View r8 = r6.getChildAt(r0)
            int r14 = r8.getVisibility()
            r15 = 8
            if (r14 == r15) goto L_0x032a
            android.view.ViewGroup$LayoutParams r14 = r8.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r14 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r14
            float r3 = r14.f1418g
            int r17 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r17 <= 0) goto L_0x02d9
            float r15 = (float) r11
            float r15 = r15 * r3
            float r15 = r15 / r7
            int r15 = (int) r15
            float r7 = r7 - r3
            int r11 = r11 - r15
            int r3 = r36.getPaddingLeft()
            int r17 = r36.getPaddingRight()
            int r3 = r3 + r17
            r31 = r7
            int r7 = r14.leftMargin
            int r3 = r3 + r7
            int r7 = r14.rightMargin
            int r3 = r3 + r7
            int r7 = r14.width
            r32 = r11
            r11 = r37
            int r3 = getChildMeasureSpec(r11, r3, r7)
            int r7 = r14.height
            if (r7 != 0) goto L_0x02b8
            r7 = 1073741824(0x40000000, float:2.0)
            if (r2 == r7) goto L_0x02b1
            goto L_0x02b8
        L_0x02b1:
            if (r15 <= 0) goto L_0x02b4
            goto L_0x02c1
        L_0x02b4:
            r7 = 1073741824(0x40000000, float:2.0)
            r15 = 0
            goto L_0x02c3
        L_0x02b8:
            int r7 = r8.getMeasuredHeight()
            int r7 = r7 + r15
            if (r7 >= 0) goto L_0x02c0
            r7 = 0
        L_0x02c0:
            r15 = r7
        L_0x02c1:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x02c3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r7)
            r8.measure(r3, r15)
            int r3 = r8.getMeasuredState()
            r3 = r3 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r3)
            r7 = r31
            r3 = r32
            goto L_0x02dc
        L_0x02d9:
            r3 = r11
            r11 = r37
        L_0x02dc:
            int r15 = r14.leftMargin
            r33 = r2
            int r2 = r14.rightMargin
            int r15 = r15 + r2
            int r2 = r8.getMeasuredWidth()
            int r2 = r2 + r15
            int r13 = java.lang.Math.max(r13, r2)
            r34 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x02fb
            int r2 = r14.width
            r35 = r3
            r3 = -1
            if (r2 != r3) goto L_0x02fe
            r2 = 1
            goto L_0x02ff
        L_0x02fb:
            r35 = r3
            r3 = -1
        L_0x02fe:
            r2 = 0
        L_0x02ff:
            if (r2 == 0) goto L_0x0302
            goto L_0x0304
        L_0x0302:
            r15 = r34
        L_0x0304:
            int r2 = java.lang.Math.max(r10, r15)
            if (r18 == 0) goto L_0x0310
            int r10 = r14.width
            if (r10 != r3) goto L_0x0310
            r10 = 1
            goto L_0x0311
        L_0x0310:
            r10 = 0
        L_0x0311:
            int r15 = r6.f1408f
            int r8 = r8.getMeasuredHeight()
            int r8 = r8 + r15
            int r3 = r14.topMargin
            int r8 = r8 + r3
            int r3 = r14.bottomMargin
            int r8 = r8 + r3
            r3 = 0
            int r8 = r8 + r3
            int r8 = java.lang.Math.max(r15, r8)
            r6.f1408f = r8
            r18 = r10
            r10 = r2
            goto L_0x0332
        L_0x032a:
            r33 = r2
            r2 = r11
            r3 = 0
            r11 = r37
            r35 = r2
        L_0x0332:
            int r0 = r0 + 1
            r2 = r33
            r11 = r35
            r3 = 1
            goto L_0x026b
        L_0x033b:
            r11 = r37
            int r0 = r6.f1408f
            int r2 = r36.getPaddingTop()
            int r3 = r36.getPaddingBottom()
            int r2 = r2 + r3
            int r0 = r0 + r2
            r6.f1408f = r0
            r0 = r10
        L_0x034c:
            if (r18 != 0) goto L_0x0353
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0353
            r13 = r0
        L_0x0353:
            int r0 = r36.getPaddingLeft()
            int r2 = r36.getPaddingRight()
            int r0 = r0 + r2
            int r13 = r13 + r0
            int r0 = r36.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r9)
            r6.setMeasuredDimension(r0, r4)
            if (r19 == 0) goto L_0x0371
            r6.m929a((int) r1, (int) r5)
        L_0x0371:
            return
        L_0x0372:
            r11 = r7
            r5 = r8
            r36.m932b((int) r37, (int) r38)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
