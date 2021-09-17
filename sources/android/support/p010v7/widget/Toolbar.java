package android.support.p010v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.GravityCompat;
import android.support.p007v4.view.MarginLayoutParamsCompat;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.support.p010v7.app.ActionBar;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.menu.C0286ac;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1555A;

    /* renamed from: B */
    private int f1556B;

    /* renamed from: C */
    private boolean f1557C;

    /* renamed from: D */
    private boolean f1558D;

    /* renamed from: E */
    private final ArrayList<View> f1559E;

    /* renamed from: F */
    private final ArrayList<View> f1560F;

    /* renamed from: G */
    private final int[] f1561G;

    /* renamed from: H */
    private final C0438r f1562H;

    /* renamed from: I */
    private C0414dj f1563I;

    /* renamed from: J */
    private ActionMenuPresenter f1564J;

    /* renamed from: K */
    private C0411dg f1565K;

    /* renamed from: L */
    private C0287ad f1566L;

    /* renamed from: M */
    private C0310o f1567M;

    /* renamed from: N */
    private boolean f1568N;

    /* renamed from: O */
    private final Runnable f1569O;

    /* renamed from: a */
    ImageButton f1570a;

    /* renamed from: b */
    View f1571b;

    /* renamed from: c */
    int f1572c;

    /* renamed from: d */
    C0412dh f1573d;

    /* renamed from: e */
    private ActionMenuView f1574e;

    /* renamed from: f */
    private TextView f1575f;

    /* renamed from: g */
    private TextView f1576g;

    /* renamed from: h */
    private ImageButton f1577h;

    /* renamed from: i */
    private ImageView f1578i;

    /* renamed from: j */
    private Drawable f1579j;

    /* renamed from: k */
    private CharSequence f1580k;

    /* renamed from: l */
    private Context f1581l;

    /* renamed from: m */
    private int f1582m;

    /* renamed from: n */
    private int f1583n;

    /* renamed from: o */
    private int f1584o;

    /* renamed from: p */
    private int f1585p;

    /* renamed from: q */
    private int f1586q;

    /* renamed from: r */
    private int f1587r;

    /* renamed from: s */
    private int f1588s;

    /* renamed from: t */
    private int f1589t;

    /* renamed from: u */
    private C0375by f1590u;

    /* renamed from: v */
    private int f1591v;

    /* renamed from: w */
    private int f1592w;

    /* renamed from: x */
    private int f1593x;

    /* renamed from: y */
    private CharSequence f1594y;

    /* renamed from: z */
    private CharSequence f1595z;

    /* renamed from: android.support.v7.widget.Toolbar$LayoutParams */
    public class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        int f1596b = 0;

        public LayoutParams() {
            this.f539a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1596b = layoutParams.f1596b;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0413di();

        /* renamed from: a */
        int f1597a;

        /* renamed from: b */
        boolean f1598b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1597a = parcel.readInt();
            this.f1598b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1597a);
            parcel.writeInt(this.f1598b ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1593x = 8388627;
        this.f1559E = new ArrayList<>();
        this.f1560F = new ArrayList<>();
        this.f1561G = new int[2];
        this.f1562H = new C0408dd(this);
        this.f1569O = new C0409de(this);
        C0407dc a = C0407dc.m1308a(getContext(), attributeSet, C0197k.f503do, i, 0);
        this.f1583n = a.mo4558g(C0197k.f478dP, 0);
        this.f1584o = a.mo4558g(C0197k.f469dG, 0);
        this.f1593x = a.mo4550c(C0197k.f504dp, this.f1593x);
        this.f1572c = a.mo4550c(C0197k.f505dq, 48);
        int d = a.mo4552d(C0197k.f472dJ, 0);
        d = a.mo4560h(C0197k.f477dO) ? a.mo4552d(C0197k.f477dO, d) : d;
        this.f1589t = d;
        this.f1588s = d;
        this.f1587r = d;
        this.f1586q = d;
        int d2 = a.mo4552d(C0197k.f475dM, -1);
        if (d2 >= 0) {
            this.f1586q = d2;
        }
        int d3 = a.mo4552d(C0197k.f474dL, -1);
        if (d3 >= 0) {
            this.f1587r = d3;
        }
        int d4 = a.mo4552d(C0197k.f476dN, -1);
        if (d4 >= 0) {
            this.f1588s = d4;
        }
        int d5 = a.mo4552d(C0197k.f473dK, -1);
        if (d5 >= 0) {
            this.f1589t = d5;
        }
        this.f1585p = a.mo4555e(C0197k.f464dB, -1);
        int d6 = a.mo4552d(C0197k.f512dx, ExploreByTouchHelper.INVALID_ID);
        int d7 = a.mo4552d(C0197k.f508dt, ExploreByTouchHelper.INVALID_ID);
        int e = a.mo4555e(C0197k.f510dv, 0);
        int e2 = a.mo4555e(C0197k.f511dw, 0);
        m1037z();
        this.f1590u.mo4483b(e, e2);
        if (!(d6 == Integer.MIN_VALUE && d7 == Integer.MIN_VALUE)) {
            this.f1590u.mo4480a(d6, d7);
        }
        this.f1591v = a.mo4552d(C0197k.f513dy, ExploreByTouchHelper.INVALID_ID);
        this.f1592w = a.mo4552d(C0197k.f509du, ExploreByTouchHelper.INVALID_ID);
        this.f1579j = a.mo4545a(C0197k.f507ds);
        this.f1580k = a.mo4551c(C0197k.f506dr);
        CharSequence c = a.mo4551c(C0197k.f471dI);
        if (!TextUtils.isEmpty(c)) {
            mo4216a(c);
        }
        CharSequence c2 = a.mo4551c(C0197k.f468dF);
        if (!TextUtils.isEmpty(c2)) {
            mo4222b(c2);
        }
        this.f1581l = getContext();
        mo4208a(a.mo4558g(C0197k.f467dE, 0));
        Drawable a2 = a.mo4545a(C0197k.f466dD);
        if (a2 != null) {
            mo4221b(a2);
        }
        CharSequence c3 = a.mo4551c(C0197k.f465dC);
        if (!TextUtils.isEmpty(c3)) {
            mo4224c(c3);
        }
        Drawable a3 = a.mo4545a(C0197k.f514dz);
        if (a3 != null) {
            mo4211a(a3);
        }
        CharSequence c4 = a.mo4551c(C0197k.f463dA);
        if (!TextUtils.isEmpty(c4)) {
            if (!TextUtils.isEmpty(c4)) {
                m1030s();
            }
            if (this.f1578i != null) {
                this.f1578i.setContentDescription(c4);
            }
        }
        if (a.mo4560h(C0197k.f479dQ)) {
            int b = a.mo4548b(C0197k.f479dQ, -1);
            this.f1555A = b;
            if (this.f1575f != null) {
                this.f1575f.setTextColor(b);
            }
        }
        if (a.mo4560h(C0197k.f470dH)) {
            int b2 = a.mo4548b(C0197k.f470dH, -1);
            this.f1556B = b2;
            if (this.f1576g != null) {
                this.f1576g.setTextColor(b2);
            }
        }
        a.mo4546a();
    }

    /* renamed from: a */
    private int m1015a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = m1025c(layoutParams.f539a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i3 < layoutParams.topMargin) {
            i3 = layoutParams.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            if (i4 < layoutParams.bottomMargin) {
                i3 = Math.max(0, i3 - (layoutParams.bottomMargin - i4));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private int m1016a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m1017a(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m1015a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: a */
    private static LayoutParams m1018a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m1019a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private void m1020a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParams2 = layoutParams == null ? new LayoutParams() : !checkLayoutParams(layoutParams) ? m1018a(layoutParams) : (LayoutParams) layoutParams;
        layoutParams2.f1596b = 1;
        if (!z || this.f1571b == null) {
            addView(view, layoutParams2);
            return;
        }
        view.setLayoutParams(layoutParams2);
        this.f1560F.add(view);
    }

    /* renamed from: a */
    private void m1021a(List<View> list, int i) {
        boolean z = ViewCompat.getLayoutDirection(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1596b == 0 && m1022a(childAt) && m1027d(layoutParams.f539a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1596b == 0 && m1022a(childAt2) && m1027d(layoutParams2.f539a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private boolean m1022a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private static int m1023b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return MarginLayoutParamsCompat.getMarginStart(marginLayoutParams) + MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
    }

    /* renamed from: b */
    private int m1024b(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m1015a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: c */
    private int m1025c(int i) {
        int i2 = i & C0197k.f315aL;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1593x & C0197k.f315aL;
    }

    /* renamed from: c */
    private static int m1026c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: d */
    private int m1027d(int i) {
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int absoluteGravity = GravityCompat.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    /* renamed from: d */
    private boolean m1028d(View view) {
        return view.getParent() == this || this.f1560F.contains(view);
    }

    /* renamed from: o */
    protected static LayoutParams m1029o() {
        return new LayoutParams();
    }

    /* renamed from: s */
    private void m1030s() {
        if (this.f1578i == null) {
            this.f1578i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: t */
    private void m1031t() {
        if (this.f1574e == null) {
            this.f1574e = new ActionMenuView(getContext());
            this.f1574e.mo3966a(this.f1582m);
            this.f1574e.f1319b = this.f1562H;
            this.f1574e.mo3967a(this.f1566L, this.f1567M);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f539a = 8388613 | (this.f1572c & C0197k.f315aL);
            this.f1574e.setLayoutParams(layoutParams);
            m1020a((View) this.f1574e, false);
        }
    }

    /* renamed from: u */
    private int m1032u() {
        if (this.f1590u != null) {
            return this.f1590u.mo4479a();
        }
        return 0;
    }

    /* renamed from: v */
    private int m1033v() {
        if (this.f1590u != null) {
            return this.f1590u.mo4482b();
        }
        return 0;
    }

    /* renamed from: w */
    private int m1034w() {
        return mo4238l() != null ? Math.max(m1032u(), Math.max(this.f1591v, 0)) : m1032u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r3.f1574e.mo3974d();
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1035x() {
        /*
            r3 = this;
            android.support.v7.widget.ActionMenuView r0 = r3.f1574e
            r1 = 0
            if (r0 == 0) goto L_0x0015
            android.support.v7.widget.ActionMenuView r0 = r3.f1574e
            android.support.v7.view.menu.MenuBuilder r0 = r0.mo3974d()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0027
            int r0 = r3.m1033v()
            int r2 = r3.f1592w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            return r0
        L_0x0027:
            int r0 = r3.m1033v()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.Toolbar.m1035x():int");
    }

    /* renamed from: y */
    private void m1036y() {
        if (this.f1577h == null) {
            this.f1577h = new AppCompatImageButton(getContext(), (AttributeSet) null, C0188b.toolbarNavigationButtonStyle);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f539a = 8388611 | (this.f1572c & C0197k.f315aL);
            this.f1577h.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: z */
    private void m1037z() {
        if (this.f1590u == null) {
            this.f1590u = new C0375by();
        }
    }

    /* renamed from: a */
    public final void mo4208a(int i) {
        if (this.f1582m != i) {
            this.f1582m = i;
            if (i == 0) {
                this.f1581l = getContext();
            } else {
                this.f1581l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* renamed from: a */
    public final void mo4209a(int i, int i2) {
        m1037z();
        this.f1590u.mo4480a(i, i2);
    }

    /* renamed from: a */
    public final void mo4210a(Context context, int i) {
        this.f1583n = i;
        if (this.f1575f != null) {
            this.f1575f.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public final void mo4211a(Drawable drawable) {
        if (drawable != null) {
            m1030s();
            if (!m1028d((View) this.f1578i)) {
                m1020a((View) this.f1578i, true);
            }
        } else if (this.f1578i != null && m1028d((View) this.f1578i)) {
            removeView(this.f1578i);
            this.f1560F.remove(this.f1578i);
        }
        if (this.f1578i != null) {
            this.f1578i.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo4212a(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder != null || this.f1574e != null) {
            m1031t();
            MenuBuilder d = this.f1574e.mo3974d();
            if (d != menuBuilder) {
                if (d != null) {
                    d.mo3595b((C0286ac) this.f1564J);
                    d.mo3595b((C0286ac) this.f1565K);
                }
                if (this.f1565K == null) {
                    this.f1565K = new C0411dg(this);
                }
                actionMenuPresenter.mo3957e();
                if (menuBuilder != null) {
                    menuBuilder.mo3575a((C0286ac) actionMenuPresenter, this.f1581l);
                    menuBuilder.mo3575a((C0286ac) this.f1565K, this.f1581l);
                } else {
                    actionMenuPresenter.mo3707a(this.f1581l, (MenuBuilder) null);
                    this.f1565K.mo3707a(this.f1581l, (MenuBuilder) null);
                    actionMenuPresenter.mo3710a(true);
                    this.f1565K.mo3710a(true);
                }
                this.f1574e.mo3966a(this.f1582m);
                this.f1574e.mo3968a(actionMenuPresenter);
                this.f1564J = actionMenuPresenter;
            }
        }
    }

    /* renamed from: a */
    public final void mo4213a(C0287ad adVar, C0310o oVar) {
        this.f1566L = adVar;
        this.f1567M = oVar;
        if (this.f1574e != null) {
            this.f1574e.mo3967a(adVar, oVar);
        }
    }

    /* renamed from: a */
    public final void mo4214a(C0412dh dhVar) {
        this.f1573d = dhVar;
    }

    /* renamed from: a */
    public final void mo4215a(View.OnClickListener onClickListener) {
        m1036y();
        this.f1577h.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo4216a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1575f == null) {
                Context context = getContext();
                this.f1575f = new AppCompatTextView(context);
                this.f1575f.setSingleLine();
                this.f1575f.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f1583n != 0) {
                    this.f1575f.setTextAppearance(context, this.f1583n);
                }
                if (this.f1555A != 0) {
                    this.f1575f.setTextColor(this.f1555A);
                }
            }
            if (!m1028d((View) this.f1575f)) {
                m1020a((View) this.f1575f, true);
            }
        } else if (this.f1575f != null && m1028d((View) this.f1575f)) {
            removeView(this.f1575f);
            this.f1560F.remove(this.f1575f);
        }
        if (this.f1575f != null) {
            this.f1575f.setText(charSequence);
        }
        this.f1594y = charSequence;
    }

    /* renamed from: a */
    public final void mo4217a(boolean z) {
        this.f1568N = z;
        requestLayout();
    }

    /* renamed from: a */
    public final boolean mo4218a() {
        return getVisibility() == 0 && this.f1574e != null && this.f1574e.mo3970a();
    }

    /* renamed from: b */
    public final void mo4219b(int i) {
        mo4224c(i != 0 ? getContext().getText(i) : null);
    }

    /* renamed from: b */
    public final void mo4220b(Context context, int i) {
        this.f1584o = i;
        if (this.f1576g != null) {
            this.f1576g.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public final void mo4221b(Drawable drawable) {
        if (drawable != null) {
            m1036y();
            if (!m1028d((View) this.f1577h)) {
                m1020a((View) this.f1577h, true);
            }
        } else if (this.f1577h != null && m1028d((View) this.f1577h)) {
            removeView(this.f1577h);
            this.f1560F.remove(this.f1577h);
        }
        if (this.f1577h != null) {
            this.f1577h.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public final void mo4222b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1576g == null) {
                Context context = getContext();
                this.f1576g = new AppCompatTextView(context);
                this.f1576g.setSingleLine();
                this.f1576g.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f1584o != 0) {
                    this.f1576g.setTextAppearance(context, this.f1584o);
                }
                if (this.f1556B != 0) {
                    this.f1576g.setTextColor(this.f1556B);
                }
            }
            if (!m1028d((View) this.f1576g)) {
                m1020a((View) this.f1576g, true);
            }
        } else if (this.f1576g != null && m1028d((View) this.f1576g)) {
            removeView(this.f1576g);
            this.f1560F.remove(this.f1576g);
        }
        if (this.f1576g != null) {
            this.f1576g.setText(charSequence);
        }
        this.f1595z = charSequence;
    }

    /* renamed from: b */
    public final boolean mo4223b() {
        return this.f1574e != null && this.f1574e.mo3978g();
    }

    /* renamed from: c */
    public final void mo4224c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1036y();
        }
        if (this.f1577h != null) {
            this.f1577h.setContentDescription(charSequence);
        }
    }

    /* renamed from: c */
    public final boolean mo4225c() {
        return this.f1574e != null && this.f1574e.mo3982h();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public final boolean mo4227d() {
        return this.f1574e != null && this.f1574e.mo3976e();
    }

    /* renamed from: e */
    public final boolean mo4228e() {
        return this.f1574e != null && this.f1574e.mo3977f();
    }

    /* renamed from: f */
    public final void mo4229f() {
        if (this.f1574e != null) {
            this.f1574e.mo3983i();
        }
    }

    /* renamed from: g */
    public final boolean mo4230g() {
        return (this.f1565K == null || this.f1565K.f1832b == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1018a(layoutParams);
    }

    /* renamed from: h */
    public final void mo4234h() {
        MenuItemImpl menuItemImpl = this.f1565K == null ? null : this.f1565K.f1832b;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    /* renamed from: i */
    public final CharSequence mo4235i() {
        return this.f1594y;
    }

    /* renamed from: j */
    public final CharSequence mo4236j() {
        return this.f1595z;
    }

    /* renamed from: k */
    public final CharSequence mo4237k() {
        if (this.f1577h != null) {
            return this.f1577h.getContentDescription();
        }
        return null;
    }

    /* renamed from: l */
    public final Drawable mo4238l() {
        if (this.f1577h != null) {
            return this.f1577h.getDrawable();
        }
        return null;
    }

    /* renamed from: m */
    public final Menu mo4239m() {
        m1031t();
        if (this.f1574e.mo3974d() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.f1574e.mo3972c();
            if (this.f1565K == null) {
                this.f1565K = new C0411dg(this);
            }
            this.f1574e.mo3984j();
            menuBuilder.mo3575a((C0286ac) this.f1565K, this.f1581l);
        }
        return this.f1574e.mo3972c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo4240n() {
        if (this.f1570a == null) {
            this.f1570a = new AppCompatImageButton(getContext(), (AttributeSet) null, C0188b.toolbarNavigationButtonStyle);
            this.f1570a.setImageDrawable(this.f1579j);
            this.f1570a.setContentDescription(this.f1580k);
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.f539a = 8388611 | (this.f1572c & C0197k.f315aL);
            layoutParams.f1596b = 2;
            this.f1570a.setLayoutParams(layoutParams);
            this.f1570a.setOnClickListener(new C0410df(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1569O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1558D = false;
        }
        if (!this.f1558D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1558D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1558D = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02be A[LOOP:0: B:110:0x02bc->B:111:0x02be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e0 A[LOOP:1: B:113:0x02de->B:114:0x02e0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0305 A[LOOP:2: B:116:0x0303->B:117:0x0305, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0356 A[LOOP:3: B:124:0x0354->B:125:0x0356, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x023d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r22)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r22.getWidth()
            int r5 = r22.getHeight()
            int r6 = r22.getPaddingLeft()
            int r7 = r22.getPaddingRight()
            int r8 = r22.getPaddingTop()
            int r9 = r22.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1561G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = android.support.p007v4.view.ViewCompat.getMinimumHeight(r22)
            if (r12 < 0) goto L_0x003a
            int r13 = r27 - r25
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1577h
            boolean r13 = r0.m1022a((android.view.View) r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004d
            android.widget.ImageButton r13 = r0.f1577h
            int r13 = r0.m1024b(r13, r10, r11, r12)
            r14 = r6
            goto L_0x0057
        L_0x004d:
            android.widget.ImageButton r13 = r0.f1577h
            int r13 = r0.m1017a(r13, r6, r11, r12)
            r14 = r13
            goto L_0x0056
        L_0x0055:
            r14 = r6
        L_0x0056:
            r13 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1570a
            boolean r15 = r0.m1022a((android.view.View) r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1570a
            int r13 = r0.m1024b(r15, r13, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1570a
            int r14 = r0.m1017a(r15, r14, r11, r12)
        L_0x006e:
            android.support.v7.widget.ActionMenuView r15 = r0.f1574e
            boolean r15 = r0.m1022a((android.view.View) r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            android.support.v7.widget.ActionMenuView r15 = r0.f1574e
            int r14 = r0.m1017a(r15, r14, r11, r12)
            goto L_0x0085
        L_0x007f:
            android.support.v7.widget.ActionMenuView r15 = r0.f1574e
            int r13 = r0.m1024b(r15, r13, r11, r12)
        L_0x0085:
            int r15 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r22)
            if (r15 != r2) goto L_0x0090
            int r15 = r22.m1035x()
            goto L_0x0094
        L_0x0090:
            int r15 = r22.m1034w()
        L_0x0094:
            int r3 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r22)
            if (r3 != r2) goto L_0x009f
            int r3 = r22.m1034w()
            goto L_0x00a3
        L_0x009f:
            int r3 = r22.m1035x()
        L_0x00a3:
            int r2 = r15 - r14
            r17 = r7
            r7 = 0
            int r2 = java.lang.Math.max(r7, r2)
            r11[r7] = r2
            int r2 = r10 - r13
            int r2 = r3 - r2
            int r2 = java.lang.Math.max(r7, r2)
            r7 = 1
            r11[r7] = r2
            int r2 = java.lang.Math.max(r14, r15)
            int r10 = r10 - r3
            int r3 = java.lang.Math.min(r13, r10)
            android.view.View r7 = r0.f1571b
            boolean r7 = r0.m1022a((android.view.View) r7)
            if (r7 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.view.View r7 = r0.f1571b
            int r3 = r0.m1024b(r7, r3, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.view.View r7 = r0.f1571b
            int r2 = r0.m1017a(r7, r2, r11, r12)
        L_0x00d9:
            android.widget.ImageView r7 = r0.f1578i
            boolean r7 = r0.m1022a((android.view.View) r7)
            if (r7 == 0) goto L_0x00f0
            if (r1 == 0) goto L_0x00ea
            android.widget.ImageView r7 = r0.f1578i
            int r3 = r0.m1024b(r7, r3, r11, r12)
            goto L_0x00f0
        L_0x00ea:
            android.widget.ImageView r7 = r0.f1578i
            int r2 = r0.m1017a(r7, r2, r11, r12)
        L_0x00f0:
            android.widget.TextView r7 = r0.f1575f
            boolean r7 = r0.m1022a((android.view.View) r7)
            android.widget.TextView r10 = r0.f1576g
            boolean r10 = r0.m1022a((android.view.View) r10)
            if (r7 == 0) goto L_0x0115
            android.widget.TextView r13 = r0.f1575f
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r13 = (android.support.p010v7.widget.Toolbar.LayoutParams) r13
            int r14 = r13.topMargin
            android.widget.TextView r15 = r0.f1575f
            int r15 = r15.getMeasuredHeight()
            int r14 = r14 + r15
            int r13 = r13.bottomMargin
            int r14 = r14 + r13
            r13 = 0
            int r14 = r14 + r13
            goto L_0x0116
        L_0x0115:
            r14 = 0
        L_0x0116:
            if (r10 == 0) goto L_0x0130
            android.widget.TextView r13 = r0.f1576g
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r13 = (android.support.p010v7.widget.Toolbar.LayoutParams) r13
            int r15 = r13.topMargin
            r18 = r4
            android.widget.TextView r4 = r0.f1576g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r13.bottomMargin
            int r15 = r15 + r4
            int r14 = r14 + r15
            goto L_0x0132
        L_0x0130:
            r18 = r4
        L_0x0132:
            if (r7 != 0) goto L_0x013d
            if (r10 == 0) goto L_0x0137
            goto L_0x013d
        L_0x0137:
            r19 = r6
            r20 = r12
            goto L_0x02ae
        L_0x013d:
            if (r7 == 0) goto L_0x0142
            android.widget.TextView r4 = r0.f1575f
            goto L_0x0144
        L_0x0142:
            android.widget.TextView r4 = r0.f1576g
        L_0x0144:
            if (r10 == 0) goto L_0x0149
            android.widget.TextView r13 = r0.f1576g
            goto L_0x014b
        L_0x0149:
            android.widget.TextView r13 = r0.f1575f
        L_0x014b:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r4 = (android.support.p010v7.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r13 = (android.support.p010v7.widget.Toolbar.LayoutParams) r13
            if (r7 == 0) goto L_0x0161
            android.widget.TextView r15 = r0.f1575f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x016b
        L_0x0161:
            if (r10 == 0) goto L_0x016f
            android.widget.TextView r15 = r0.f1576g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x016f
        L_0x016b:
            r19 = r6
            r15 = 1
            goto L_0x0172
        L_0x016f:
            r19 = r6
            r15 = 0
        L_0x0172:
            int r6 = r0.f1593x
            r6 = r6 & 112(0x70, float:1.57E-43)
            r20 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01bb
            r12 = 80
            if (r6 == r12) goto L_0x01af
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r14
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r21 = r2
            int r2 = r0.f1588s
            int r12 = r12 + r2
            if (r6 >= r12) goto L_0x0196
            int r2 = r4.topMargin
            int r4 = r0.f1588s
            int r6 = r2 + r4
            goto L_0x01ad
        L_0x0196:
            int r5 = r5 - r9
            int r5 = r5 - r14
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r4 = r0.f1589t
            int r2 = r2 + r4
            if (r5 >= r2) goto L_0x01ad
            int r2 = r13.bottomMargin
            int r4 = r0.f1589t
            int r2 = r2 + r4
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x01ad:
            int r8 = r8 + r6
            goto L_0x01c8
        L_0x01af:
            r21 = r2
            int r5 = r5 - r9
            int r2 = r13.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1589t
            int r5 = r5 - r2
            int r8 = r5 - r14
            goto L_0x01c8
        L_0x01bb:
            r21 = r2
            int r2 = r22.getPaddingTop()
            int r4 = r4.topMargin
            int r2 = r2 + r4
            int r4 = r0.f1588s
            int r8 = r2 + r4
        L_0x01c8:
            if (r1 == 0) goto L_0x023d
            if (r15 == 0) goto L_0x01d0
            int r1 = r0.f1586q
        L_0x01ce:
            r2 = 1
            goto L_0x01d2
        L_0x01d0:
            r1 = 0
            goto L_0x01ce
        L_0x01d2:
            r4 = r11[r2]
            int r1 = r1 - r4
            r4 = 0
            int r5 = java.lang.Math.max(r4, r1)
            int r3 = r3 - r5
            int r1 = -r1
            int r1 = java.lang.Math.max(r4, r1)
            r11[r2] = r1
            if (r7 == 0) goto L_0x0208
            android.widget.TextView r1 = r0.f1575f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p010v7.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1575f
            int r2 = r2.getMeasuredWidth()
            int r2 = r3 - r2
            android.widget.TextView r4 = r0.f1575f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1575f
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f1587r
            int r2 = r2 - r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0209
        L_0x0208:
            r2 = r3
        L_0x0209:
            if (r10 == 0) goto L_0x0231
            android.widget.TextView r1 = r0.f1576g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p010v7.widget.Toolbar.LayoutParams) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f1576g
            int r4 = r4.getMeasuredWidth()
            int r4 = r3 - r4
            android.widget.TextView r5 = r0.f1576g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1576g
            r6.layout(r4, r8, r3, r5)
            int r4 = r0.f1587r
            int r4 = r3 - r4
            int r1 = r1.bottomMargin
            goto L_0x0232
        L_0x0231:
            r4 = r3
        L_0x0232:
            if (r15 == 0) goto L_0x0239
            int r1 = java.lang.Math.min(r2, r4)
            r3 = r1
        L_0x0239:
            r2 = r21
            goto L_0x02ae
        L_0x023d:
            if (r15 == 0) goto L_0x0245
            int r1 = r0.f1586q
            r16 = r1
            r1 = 0
            goto L_0x0248
        L_0x0245:
            r1 = 0
            r16 = 0
        L_0x0248:
            r2 = r11[r1]
            int r2 = r16 - r2
            int r4 = java.lang.Math.max(r1, r2)
            int r4 = r21 + r4
            int r2 = -r2
            int r2 = java.lang.Math.max(r1, r2)
            r11[r1] = r2
            if (r7 == 0) goto L_0x027e
            android.widget.TextView r1 = r0.f1575f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p010v7.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1575f
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r4
            android.widget.TextView r5 = r0.f1575f
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1575f
            r6.layout(r4, r8, r2, r5)
            int r6 = r0.f1587r
            int r2 = r2 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x027f
        L_0x027e:
            r2 = r4
        L_0x027f:
            if (r10 == 0) goto L_0x02a5
            android.widget.TextView r1 = r0.f1576g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r1 = (android.support.p010v7.widget.Toolbar.LayoutParams) r1
            int r5 = r1.topMargin
            int r8 = r8 + r5
            android.widget.TextView r5 = r0.f1576g
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 + r4
            android.widget.TextView r6 = r0.f1576g
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r8
            android.widget.TextView r7 = r0.f1576g
            r7.layout(r4, r8, r5, r6)
            int r6 = r0.f1587r
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            goto L_0x02a6
        L_0x02a5:
            r5 = r4
        L_0x02a6:
            if (r15 == 0) goto L_0x02ad
            int r2 = java.lang.Math.max(r2, r5)
            goto L_0x02ae
        L_0x02ad:
            r2 = r4
        L_0x02ae:
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            r4 = 3
            r0.m1021a((java.util.List<android.view.View>) r1, (int) r4)
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            int r1 = r1.size()
            r4 = r2
            r2 = 0
        L_0x02bc:
            if (r2 >= r1) goto L_0x02cf
            java.util.ArrayList<android.view.View> r5 = r0.f1559E
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            r12 = r20
            int r4 = r0.m1017a(r5, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02bc
        L_0x02cf:
            r12 = r20
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            r2 = 5
            r0.m1021a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            int r1 = r1.size()
            r2 = 0
        L_0x02de:
            if (r2 >= r1) goto L_0x02ef
            java.util.ArrayList<android.view.View> r5 = r0.f1559E
            java.lang.Object r5 = r5.get(r2)
            android.view.View r5 = (android.view.View) r5
            int r3 = r0.m1024b(r5, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02de
        L_0x02ef:
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            r2 = 1
            r0.m1021a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            r5 = 0
            r6 = r11[r5]
            r2 = r11[r2]
            int r5 = r1.size()
            r7 = r2
            r2 = 0
            r8 = 0
        L_0x0303:
            if (r2 >= r5) goto L_0x0336
            java.lang.Object r9 = r1.get(r2)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            android.support.v7.widget.Toolbar$LayoutParams r10 = (android.support.p010v7.widget.Toolbar.LayoutParams) r10
            int r13 = r10.leftMargin
            int r13 = r13 - r6
            int r6 = r10.rightMargin
            int r6 = r6 - r7
            r7 = 0
            int r10 = java.lang.Math.max(r7, r13)
            int r14 = java.lang.Math.max(r7, r6)
            int r13 = -r13
            int r13 = java.lang.Math.max(r7, r13)
            int r6 = -r6
            int r6 = java.lang.Math.max(r7, r6)
            int r9 = r9.getMeasuredWidth()
            int r10 = r10 + r9
            int r10 = r10 + r14
            int r8 = r8 + r10
            int r2 = r2 + 1
            r7 = r6
            r6 = r13
            goto L_0x0303
        L_0x0336:
            r7 = 0
            int r1 = r18 - r19
            int r1 = r1 - r17
            int r1 = r1 / 2
            int r6 = r19 + r1
            int r1 = r8 / 2
            int r1 = r6 - r1
            int r8 = r8 + r1
            if (r1 >= r4) goto L_0x0347
            goto L_0x034e
        L_0x0347:
            if (r8 <= r3) goto L_0x034d
            int r8 = r8 - r3
            int r4 = r1 - r8
            goto L_0x034e
        L_0x034d:
            r4 = r1
        L_0x034e:
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            int r1 = r1.size()
        L_0x0354:
            if (r7 >= r1) goto L_0x0365
            java.util.ArrayList<android.view.View> r2 = r0.f1559E
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r4 = r0.m1017a(r2, r4, r11, r12)
            int r7 = r7 + 1
            goto L_0x0354
        L_0x0365:
            java.util.ArrayList<android.view.View> r1 = r0.f1559E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1561G;
        boolean z = true;
        if (C0423ds.m1382a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m1022a((View) this.f1577h)) {
            m1019a(this.f1577h, i, 0, i2, this.f1585p);
            i5 = this.f1577h.getMeasuredWidth() + m1023b((View) this.f1577h);
            i4 = Math.max(0, this.f1577h.getMeasuredHeight() + m1026c((View) this.f1577h));
            i3 = View.combineMeasuredStates(0, this.f1577h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1022a((View) this.f1570a)) {
            m1019a(this.f1570a, i, 0, i2, this.f1585p);
            i5 = this.f1570a.getMeasuredWidth() + m1023b((View) this.f1570a);
            i4 = Math.max(i4, this.f1570a.getMeasuredHeight() + m1026c((View) this.f1570a));
            i3 = View.combineMeasuredStates(i3, this.f1570a.getMeasuredState());
        }
        int w = m1034w();
        int max = Math.max(w, i5) + 0;
        iArr[c2] = Math.max(0, w - i5);
        if (m1022a((View) this.f1574e)) {
            m1019a(this.f1574e, i, max, i2, this.f1585p);
            i6 = this.f1574e.getMeasuredWidth() + m1023b((View) this.f1574e);
            i4 = Math.max(i4, this.f1574e.getMeasuredHeight() + m1026c((View) this.f1574e));
            i3 = View.combineMeasuredStates(i3, this.f1574e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int x = m1035x();
        int max2 = max + Math.max(x, i6);
        iArr[c] = Math.max(0, x - i6);
        if (m1022a(this.f1571b)) {
            max2 += m1016a(this.f1571b, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1571b.getMeasuredHeight() + m1026c(this.f1571b));
            i3 = View.combineMeasuredStates(i3, this.f1571b.getMeasuredState());
        }
        if (m1022a((View) this.f1578i)) {
            max2 += m1016a(this.f1578i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1578i.getMeasuredHeight() + m1026c((View) this.f1578i));
            i3 = View.combineMeasuredStates(i3, this.f1578i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f1596b == 0 && m1022a(childAt)) {
                View view = childAt;
                max2 += m1016a(childAt, i, max2, i2, 0, iArr);
                i10 = Math.max(i10, view.getMeasuredHeight() + m1026c(view));
                i3 = View.combineMeasuredStates(i3, view.getMeasuredState());
            }
        }
        int i12 = this.f1588s + this.f1589t;
        int i13 = this.f1586q + this.f1587r;
        if (m1022a((View) this.f1575f)) {
            m1016a(this.f1575f, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1575f.getMeasuredWidth() + m1023b((View) this.f1575f);
            i7 = this.f1575f.getMeasuredHeight() + m1026c((View) this.f1575f);
            i9 = View.combineMeasuredStates(i3, this.f1575f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1022a((View) this.f1576g)) {
            int i14 = i7 + i12;
            i8 = Math.max(i8, m1016a(this.f1576g, i, max2 + i13, i2, i14, iArr));
            i7 += this.f1576g.getMeasuredHeight() + m1026c((View) this.f1576g);
            i9 = View.combineMeasuredStates(i9, this.f1576g.getMeasuredState());
        } else {
            int i15 = i9;
        }
        int max3 = Math.max(i10, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f1568N) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (m1022a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
        }
        z = false;
        if (z) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        MenuBuilder d = this.f1574e != null ? this.f1574e.mo3974d() : null;
        if (!(savedState.f1597a == 0 || this.f1565K == null || d == null || (findItem = d.findItem(savedState.f1597a)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1598b) {
            removeCallbacks(this.f1569O);
            post(this.f1569O);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1037z();
        C0375by byVar = this.f1590u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        byVar.mo4481a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.f1565K == null || this.f1565K.f1832b == null)) {
            savedState.f1597a = this.f1565K.f1832b.getItemId();
        }
        savedState.f1598b = mo4223b();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1557C = false;
        }
        if (!this.f1557C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1557C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1557C = false;
        }
        return true;
    }

    /* renamed from: p */
    public final C0354bd mo4249p() {
        if (this.f1563I == null) {
            this.f1563I = new C0414dj(this, true);
        }
        return this.f1563I;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo4250q() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1596b == 2 || childAt == this.f1574e)) {
                removeViewAt(childCount);
                this.f1560F.add(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo4251r() {
        for (int size = this.f1560F.size() - 1; size >= 0; size--) {
            addView(this.f1560F.get(size));
        }
        this.f1560F.clear();
    }
}
