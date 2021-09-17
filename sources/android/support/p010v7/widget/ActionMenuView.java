package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.support.p010v7.view.menu.ActionMenuItemView;
import android.support.p010v7.view.menu.C0286ac;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.C0288ae;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.C0311p;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.support.p010v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v7.widget.ActionMenuView */
public class ActionMenuView extends LinearLayoutCompat implements C0288ae, C0311p {

    /* renamed from: a */
    C0310o f1318a;

    /* renamed from: b */
    C0438r f1319b;

    /* renamed from: c */
    private MenuBuilder f1320c;

    /* renamed from: d */
    private Context f1321d;

    /* renamed from: e */
    private int f1322e;

    /* renamed from: f */
    private boolean f1323f;

    /* renamed from: g */
    private ActionMenuPresenter f1324g;

    /* renamed from: h */
    private C0287ad f1325h;

    /* renamed from: i */
    private boolean f1326i;

    /* renamed from: j */
    private int f1327j;

    /* renamed from: k */
    private int f1328k;

    /* renamed from: l */
    private int f1329l;

    /* renamed from: android.support.v7.widget.ActionMenuView$LayoutParams */
    public class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1330a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1331b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1332c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1333d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1334e;

        /* renamed from: f */
        boolean f1335f;

        public LayoutParams() {
            super(-2, -2);
            this.f1330a = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1330a = layoutParams.f1330a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4128n();
        float f = context.getResources().getDisplayMetrics().density;
        this.f1328k = (int) (56.0f * f);
        this.f1329l = (int) (f * 4.0f);
        this.f1321d = context;
        this.f1322e = 0;
    }

    /* renamed from: a */
    static int m877a(View view, int i, int i2, int i3, int i4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo3550c();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, ExploreByTouchHelper.INVALID_ID), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f1330a || !z2) {
            z = false;
        }
        layoutParams.f1333d = z;
        layoutParams.f1331b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    protected static LayoutParams m878a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m882p();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (layoutParams2.f1419h <= 0) {
            layoutParams2.f1419h = 16;
        }
        return layoutParams2;
    }

    /* renamed from: b */
    public static LayoutParams m879b() {
        LayoutParams p = m882p();
        p.f1330a = true;
        return p;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    private boolean m881c(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0435o)) {
            z = false | ((C0435o) childAt).mo3552e();
        }
        return (i <= 0 || !(childAt2 instanceof C0435o)) ? z : z | ((C0435o) childAt2).mo3551d();
    }

    /* renamed from: p */
    private static LayoutParams m882p() {
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.f1419h = 16;
        return layoutParams;
    }

    /* renamed from: a */
    public final void mo3966a(int i) {
        if (this.f1322e != i) {
            this.f1322e = i;
            if (i == 0) {
                this.f1321d = getContext();
            } else {
                this.f1321d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: a */
    public final void mo3559a(MenuBuilder menuBuilder) {
        this.f1320c = menuBuilder;
    }

    /* renamed from: a */
    public final void mo3967a(C0287ad adVar, C0310o oVar) {
        this.f1325h = adVar;
        this.f1318a = oVar;
    }

    /* renamed from: a */
    public final void mo3968a(ActionMenuPresenter actionMenuPresenter) {
        this.f1324g = actionMenuPresenter;
        this.f1324g.mo3954a(this);
    }

    /* renamed from: a */
    public final void mo3969a(boolean z) {
        this.f1323f = z;
    }

    /* renamed from: a */
    public final boolean mo3970a() {
        return this.f1323f;
    }

    /* renamed from: a */
    public final boolean mo3560a(MenuItemImpl menuItemImpl) {
        return this.f1320c.mo3581a((MenuItem) menuItemImpl, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ LinearLayoutCompat.LayoutParams mo3971b(ViewGroup.LayoutParams layoutParams) {
        return m878a(layoutParams);
    }

    /* renamed from: c */
    public final Menu mo3972c() {
        if (this.f1320c == null) {
            Context context = getContext();
            this.f1320c = new MenuBuilder(context);
            this.f1320c.mo3576a((C0310o) new C0437q(this));
            this.f1324g = new ActionMenuPresenter(context);
            this.f1324g.mo3956d();
            this.f1324g.mo3709a(this.f1325h != null ? this.f1325h : new C0436p());
            this.f1320c.mo3575a((C0286ac) this.f1324g, this.f1321d);
            this.f1324g.mo3954a(this);
        }
        return this.f1320c;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public final MenuBuilder mo3974d() {
        return this.f1320c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public final boolean mo3976e() {
        return this.f1324g != null && this.f1324g.mo3958f();
    }

    /* renamed from: f */
    public final boolean mo3977f() {
        return this.f1324g != null && this.f1324g.mo3959g();
    }

    /* renamed from: g */
    public final boolean mo3978g() {
        return this.f1324g != null && this.f1324g.mo3962j();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m882p();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m878a(layoutParams);
    }

    /* renamed from: h */
    public final boolean mo3982h() {
        if (this.f1324g != null) {
            ActionMenuPresenter actionMenuPresenter = this.f1324g;
            if (actionMenuPresenter.f1300j != null || actionMenuPresenter.mo3962j()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo3983i() {
        if (this.f1324g != null) {
            this.f1324g.mo3960h();
        }
    }

    /* renamed from: j */
    public final void mo3984j() {
        this.f1324g.mo3957e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final /* synthetic */ LinearLayoutCompat.LayoutParams mo3985k() {
        return m882p();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1324g != null) {
            this.f1324g.mo3710a(false);
            if (this.f1324g.mo3962j()) {
                this.f1324g.mo3959g();
                this.f1324g.mo3958f();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3983i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f1326i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int m = mo4127m();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0423ds.m1382a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1330a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m881c(i14)) {
                        measuredWidth += m;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + layoutParams.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    m881c(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1330a) {
                    int i19 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
                i6++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i6 < childCount) {
            View childAt4 = getChildAt(i6);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1330a) {
                int i21 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i9 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
            i6++;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r34, int r35) {
        /*
            r33 = this;
            r0 = r33
            boolean r1 = r0.f1326i
            int r2 = android.view.View.MeasureSpec.getMode(r34)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            r0.f1326i = r2
            boolean r2 = r0.f1326i
            if (r1 == r2) goto L_0x0019
            r0.f1327j = r4
        L_0x0019:
            int r1 = android.view.View.MeasureSpec.getSize(r34)
            boolean r2 = r0.f1326i
            if (r2 == 0) goto L_0x0030
            android.support.v7.view.menu.MenuBuilder r2 = r0.f1320c
            if (r2 == 0) goto L_0x0030
            int r2 = r0.f1327j
            if (r1 == r2) goto L_0x0030
            r0.f1327j = r1
            android.support.v7.view.menu.MenuBuilder r1 = r0.f1320c
            r1.mo3596b((boolean) r5)
        L_0x0030:
            int r1 = r33.getChildCount()
            boolean r2 = r0.f1326i
            if (r2 == 0) goto L_0x02b4
            if (r1 <= 0) goto L_0x02b4
            int r1 = android.view.View.MeasureSpec.getMode(r35)
            int r2 = android.view.View.MeasureSpec.getSize(r34)
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            int r7 = r33.getPaddingLeft()
            int r8 = r33.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r8 = r8 + r9
            r9 = -2
            r10 = r35
            int r9 = getChildMeasureSpec(r10, r8, r9)
            int r2 = r2 - r7
            int r7 = r0.f1328k
            int r7 = r2 / r7
            int r10 = r0.f1328k
            int r10 = r2 % r10
            if (r7 != 0) goto L_0x006e
            r0.setMeasuredDimension(r2, r4)
            return
        L_0x006e:
            int r11 = r0.f1328k
            int r10 = r10 / r7
            int r11 = r11 + r10
            int r10 = r33.getChildCount()
            r16 = r7
            r3 = 0
            r7 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r20 = 0
        L_0x0081:
            if (r7 >= r10) goto L_0x010a
            android.view.View r13 = r0.getChildAt(r7)
            int r5 = r13.getVisibility()
            r4 = 8
            if (r5 == r4) goto L_0x0100
            boolean r4 = r13 instanceof android.support.p010v7.view.menu.ActionMenuItemView
            int r15 = r15 + 1
            if (r4 == 0) goto L_0x00a2
            int r5 = r0.f1329l
            r22 = r6
            int r6 = r0.f1329l
            r23 = r15
            r15 = 0
            r13.setPadding(r5, r15, r6, r15)
            goto L_0x00a7
        L_0x00a2:
            r22 = r6
            r23 = r15
            r15 = 0
        L_0x00a7:
            android.view.ViewGroup$LayoutParams r5 = r13.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r5 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r5
            r5.f1335f = r15
            r5.f1332c = r15
            r5.f1331b = r15
            r5.f1333d = r15
            r5.leftMargin = r15
            r5.rightMargin = r15
            if (r4 == 0) goto L_0x00c6
            r4 = r13
            android.support.v7.view.menu.ActionMenuItemView r4 = (android.support.p010v7.view.menu.ActionMenuItemView) r4
            boolean r4 = r4.mo3550c()
            if (r4 == 0) goto L_0x00c6
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            r5.f1334e = r4
            boolean r4 = r5.f1330a
            if (r4 == 0) goto L_0x00cf
            r4 = 1
            goto L_0x00d1
        L_0x00cf:
            r4 = r16
        L_0x00d1:
            int r4 = m877a(r13, r11, r4, r9, r8)
            int r3 = java.lang.Math.max(r3, r4)
            boolean r6 = r5.f1333d
            if (r6 == 0) goto L_0x00df
            int r17 = r17 + 1
        L_0x00df:
            boolean r5 = r5.f1330a
            if (r5 == 0) goto L_0x00e4
            r14 = 1
        L_0x00e4:
            int r16 = r16 - r4
            int r5 = r13.getMeasuredHeight()
            int r5 = java.lang.Math.max(r12, r5)
            r6 = 1
            if (r4 != r6) goto L_0x00fc
            int r4 = r6 << r7
            long r12 = (long) r4
            long r12 = r20 | r12
            r20 = r12
            r15 = r23
            r12 = r5
            goto L_0x0102
        L_0x00fc:
            r12 = r5
            r15 = r23
            goto L_0x0102
        L_0x0100:
            r22 = r6
        L_0x0102:
            int r7 = r7 + 1
            r6 = r22
            r4 = 0
            r5 = 1
            goto L_0x0081
        L_0x010a:
            r22 = r6
            r4 = 2
            if (r14 == 0) goto L_0x0113
            if (r15 != r4) goto L_0x0113
            r5 = 1
            goto L_0x0114
        L_0x0113:
            r5 = 0
        L_0x0114:
            r6 = r16
            r7 = 0
        L_0x0117:
            r23 = 1
            if (r17 <= 0) goto L_0x01b8
            if (r6 <= 0) goto L_0x01b8
            r8 = 2147483647(0x7fffffff, float:NaN)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
            r13 = 0
            r25 = 0
        L_0x0127:
            if (r8 >= r10) goto L_0x015a
            android.view.View r16 = r0.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r16 = r16.getLayoutParams()
            r27 = r7
            r7 = r16
            android.support.v7.widget.ActionMenuView$LayoutParams r7 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r7
            r28 = r12
            boolean r12 = r7.f1333d
            if (r12 == 0) goto L_0x0153
            int r12 = r7.f1331b
            if (r12 >= r4) goto L_0x0149
            int r4 = r7.f1331b
            long r12 = r23 << r8
            r25 = r12
            r13 = 1
            goto L_0x0153
        L_0x0149:
            int r7 = r7.f1331b
            if (r7 != r4) goto L_0x0153
            long r29 = r23 << r8
            long r25 = r25 | r29
            int r13 = r13 + 1
        L_0x0153:
            int r8 = r8 + 1
            r7 = r27
            r12 = r28
            goto L_0x0127
        L_0x015a:
            r27 = r7
            r28 = r12
            long r20 = r20 | r25
            if (r13 > r6) goto L_0x01b3
            int r4 = r4 + 1
            r7 = r6
            r6 = 0
        L_0x0166:
            if (r6 >= r10) goto L_0x01ac
            android.view.View r8 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r12 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r12
            r31 = r2
            r13 = 1
            int r2 = r13 << r6
            r32 = r1
            long r1 = (long) r2
            long r23 = r25 & r1
            r18 = 0
            int r13 = (r23 > r18 ? 1 : (r23 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x0189
            int r8 = r12.f1331b
            if (r8 != r4) goto L_0x01a5
            long r20 = r20 | r1
            goto L_0x01a5
        L_0x0189:
            if (r5 == 0) goto L_0x019b
            boolean r1 = r12.f1334e
            if (r1 == 0) goto L_0x019b
            r1 = 1
            if (r7 != r1) goto L_0x019b
            int r2 = r0.f1329l
            int r2 = r2 + r11
            int r13 = r0.f1329l
            r1 = 0
            r8.setPadding(r2, r1, r13, r1)
        L_0x019b:
            int r1 = r12.f1331b
            r2 = 1
            int r1 = r1 + r2
            r12.f1331b = r1
            r12.f1335f = r2
            int r7 = r7 + -1
        L_0x01a5:
            int r6 = r6 + 1
            r2 = r31
            r1 = r32
            goto L_0x0166
        L_0x01ac:
            r6 = r7
            r12 = r28
            r4 = 2
            r7 = 1
            goto L_0x0117
        L_0x01b3:
            r32 = r1
            r31 = r2
            goto L_0x01c0
        L_0x01b8:
            r32 = r1
            r31 = r2
            r27 = r7
            r28 = r12
        L_0x01c0:
            if (r14 != 0) goto L_0x01c7
            r1 = 1
            if (r15 != r1) goto L_0x01c8
            r2 = 1
            goto L_0x01c9
        L_0x01c7:
            r1 = 1
        L_0x01c8:
            r2 = 0
        L_0x01c9:
            if (r6 <= 0) goto L_0x027a
            r4 = 0
            int r7 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x027a
            int r15 = r15 - r1
            if (r6 < r15) goto L_0x01d8
            if (r2 != 0) goto L_0x01d8
            if (r3 <= r1) goto L_0x027a
        L_0x01d8:
            int r1 = java.lang.Long.bitCount(r20)
            float r1 = (float) r1
            if (r2 != 0) goto L_0x0216
            long r2 = r20 & r23
            r4 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x01f9
            r2 = 0
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r2 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r2
            boolean r2 = r2.f1334e
            if (r2 != 0) goto L_0x01f9
            float r1 = r1 - r4
        L_0x01f9:
            int r2 = r10 + -1
            r3 = 1
            int r5 = r3 << r2
            long r7 = (long) r5
            long r7 = r20 & r7
            r12 = 0
            int r3 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0216
            android.view.View r2 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r2 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r2
            boolean r2 = r2.f1334e
            if (r2 != 0) goto L_0x0216
            float r1 = r1 - r4
        L_0x0216:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0221
            int r6 = r6 * r11
            float r2 = (float) r6
            float r2 = r2 / r1
            int r4 = (int) r2
            goto L_0x0222
        L_0x0221:
            r4 = 0
        L_0x0222:
            r5 = r27
            r1 = 0
        L_0x0225:
            if (r1 >= r10) goto L_0x0278
            r2 = 1
            int r3 = r2 << r1
            long r6 = (long) r3
            long r6 = r20 & r6
            r12 = 0
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0274
            android.view.View r3 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r6 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r6
            boolean r3 = r3 instanceof android.support.p010v7.view.menu.ActionMenuItemView
            if (r3 == 0) goto L_0x0255
            r6.f1332c = r4
            r6.f1335f = r2
            if (r1 != 0) goto L_0x0251
            boolean r2 = r6.f1334e
            if (r2 != 0) goto L_0x0251
            int r2 = -r4
            r3 = 2
            int r2 = r2 / r3
            r6.leftMargin = r2
            goto L_0x0252
        L_0x0251:
            r3 = 2
        L_0x0252:
            r2 = 1
        L_0x0253:
            r5 = 1
            goto L_0x0275
        L_0x0255:
            r3 = 2
            boolean r2 = r6.f1330a
            if (r2 == 0) goto L_0x0264
            r6.f1332c = r4
            r2 = 1
            r6.f1335f = r2
            int r5 = -r4
            int r5 = r5 / r3
            r6.rightMargin = r5
            goto L_0x0253
        L_0x0264:
            r2 = 1
            if (r1 == 0) goto L_0x026b
            int r7 = r4 / 2
            r6.leftMargin = r7
        L_0x026b:
            int r7 = r10 + -1
            if (r1 == r7) goto L_0x0275
            int r7 = r4 / 2
            r6.rightMargin = r7
            goto L_0x0275
        L_0x0274:
            r3 = 2
        L_0x0275:
            int r1 = r1 + 1
            goto L_0x0225
        L_0x0278:
            r27 = r5
        L_0x027a:
            if (r27 == 0) goto L_0x02a3
            r1 = 0
        L_0x027d:
            if (r1 >= r10) goto L_0x02a3
            android.view.View r2 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r3 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r3
            boolean r4 = r3.f1335f
            if (r4 == 0) goto L_0x029e
            int r4 = r3.f1331b
            int r4 = r4 * r11
            int r3 = r3.f1332c
            int r4 = r4 + r3
            r3 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r2.measure(r4, r9)
            goto L_0x02a0
        L_0x029e:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x02a0:
            int r1 = r1 + 1
            goto L_0x027d
        L_0x02a3:
            r3 = 1073741824(0x40000000, float:2.0)
            r1 = r32
            if (r1 == r3) goto L_0x02ac
            r1 = r28
            goto L_0x02ae
        L_0x02ac:
            r1 = r22
        L_0x02ae:
            r2 = r31
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x02b4:
            r10 = r35
            r2 = 0
        L_0x02b7:
            if (r2 >= r1) goto L_0x02cb
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionMenuView$LayoutParams r3 = (android.support.p010v7.widget.ActionMenuView.LayoutParams) r3
            r4 = 0
            r3.rightMargin = r4
            r3.leftMargin = r4
            int r2 = r2 + 1
            goto L_0x02b7
        L_0x02cb:
            super.onMeasure(r34, r35)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.ActionMenuView.onMeasure(int, int):void");
    }
}
