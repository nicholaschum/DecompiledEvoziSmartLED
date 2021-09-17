package android.support.p010v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.NestedScrollingParent;
import android.support.p007v4.view.NestedScrollingParentHelper;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.view.menu.C0287ad;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements NestedScrollingParent, C0353bc {

    /* renamed from: e */
    static final int[] f1268e = {C0188b.actionBarSize, 16842841};

    /* renamed from: A */
    private final Runnable f1269A;

    /* renamed from: B */
    private final NestedScrollingParentHelper f1270B;

    /* renamed from: a */
    ActionBarContainer f1271a;

    /* renamed from: b */
    boolean f1272b;

    /* renamed from: c */
    ViewPropertyAnimator f1273c;

    /* renamed from: d */
    final AnimatorListenerAdapter f1274d;

    /* renamed from: f */
    private int f1275f;

    /* renamed from: g */
    private int f1276g;

    /* renamed from: h */
    private ContentFrameLayout f1277h;

    /* renamed from: i */
    private C0354bd f1278i;

    /* renamed from: j */
    private Drawable f1279j;

    /* renamed from: k */
    private boolean f1280k;

    /* renamed from: l */
    private boolean f1281l;

    /* renamed from: m */
    private boolean f1282m;

    /* renamed from: n */
    private boolean f1283n;

    /* renamed from: o */
    private int f1284o;

    /* renamed from: p */
    private int f1285p;

    /* renamed from: q */
    private final Rect f1286q;

    /* renamed from: r */
    private final Rect f1287r;

    /* renamed from: s */
    private final Rect f1288s;

    /* renamed from: t */
    private final Rect f1289t;

    /* renamed from: u */
    private final Rect f1290u;

    /* renamed from: v */
    private final Rect f1291v;

    /* renamed from: w */
    private final Rect f1292w;

    /* renamed from: x */
    private C0426f f1293x;

    /* renamed from: y */
    private OverScroller f1294y;

    /* renamed from: z */
    private final Runnable f1295z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$LayoutParams */
    public class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1276g = 0;
        this.f1286q = new Rect();
        this.f1287r = new Rect();
        this.f1288s = new Rect();
        this.f1289t = new Rect();
        this.f1290u = new Rect();
        this.f1291v = new Rect();
        this.f1292w = new Rect();
        this.f1274d = new C0377c(this);
        this.f1295z = new C0404d(this);
        this.f1269A = new C0425e(this);
        m832a(context);
        this.f1270B = new NestedScrollingParentHelper(this);
    }

    /* renamed from: a */
    private static C0354bd m831a(View view) {
        if (view instanceof C0354bd) {
            return (C0354bd) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).mo4249p();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m832a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1268e);
        boolean z = false;
        this.f1275f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1279j = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1279j == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1280k = z;
        this.f1294y = new OverScroller(context);
    }

    /* renamed from: a */
    private static boolean m833a(View view, Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.leftMargin != rect.left) {
            layoutParams.leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z2 = true;
        }
        if (layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z2 = true;
        }
        if (!z || layoutParams.bottomMargin == rect.bottom) {
            return z2;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: b */
    private void m834b(int i) {
        mo3932b();
        this.f1271a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1271a.getHeight()))));
    }

    /* renamed from: j */
    private void m835j() {
        if (this.f1277h == null) {
            this.f1277h = (ContentFrameLayout) findViewById(C0193g.action_bar_activity_content);
            this.f1271a = (ActionBarContainer) findViewById(C0193g.action_bar_container);
            this.f1278i = m831a(findViewById(C0193g.action_bar));
        }
    }

    /* renamed from: a */
    public final void mo3925a(int i) {
        m835j();
        if (i == 2) {
            this.f1278i.mo4386e();
        } else if (i == 5) {
            this.f1278i.mo4387f();
        } else if (i == 109) {
            boolean z = true;
            this.f1281l = true;
            if (getContext().getApplicationInfo().targetSdkVersion >= 19) {
                z = false;
            }
            this.f1280k = z;
        }
    }

    /* renamed from: a */
    public final void mo3926a(C0426f fVar) {
        this.f1293x = fVar;
        if (getWindowToken() != null) {
            this.f1293x.mo3279b(this.f1276g);
            if (this.f1285p != 0) {
                onWindowSystemUiVisibilityChanged(this.f1285p);
                ViewCompat.requestApplyInsets(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo3927a(Menu menu, C0287ad adVar) {
        m835j();
        this.f1278i.mo4377a(menu, adVar);
    }

    /* renamed from: a */
    public final void mo3928a(Window.Callback callback) {
        m835j();
        this.f1278i.mo4378a(callback);
    }

    /* renamed from: a */
    public final void mo3929a(CharSequence charSequence) {
        m835j();
        this.f1278i.mo4379a(charSequence);
    }

    /* renamed from: a */
    public final void mo3930a(boolean z) {
        this.f1282m = z;
    }

    /* renamed from: a */
    public final boolean mo3931a() {
        return this.f1281l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3932b() {
        removeCallbacks(this.f1295z);
        removeCallbacks(this.f1269A);
        if (this.f1273c != null) {
            this.f1273c.cancel();
        }
    }

    /* renamed from: b */
    public final void mo3933b(boolean z) {
        if (z != this.f1283n) {
            this.f1283n = z;
            if (!z) {
                mo3932b();
                m834b(0);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo3934c() {
        m835j();
        return this.f1278i.mo4388g();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final boolean mo3936d() {
        m835j();
        return this.f1278i.mo4389h();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1279j != null && !this.f1280k) {
            int bottom = this.f1271a.getVisibility() == 0 ? (int) (((float) this.f1271a.getBottom()) + this.f1271a.getTranslationY() + 0.5f) : 0;
            this.f1279j.setBounds(0, bottom, getWidth(), this.f1279j.getIntrinsicHeight() + bottom);
            this.f1279j.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean mo3938e() {
        m835j();
        return this.f1278i.mo4390i();
    }

    /* renamed from: f */
    public final boolean mo3939f() {
        m835j();
        return this.f1278i.mo4391j();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        m835j();
        ViewCompat.getWindowSystemUiVisibility(this);
        boolean a = m833a(this.f1271a, rect, false);
        this.f1289t.set(rect);
        C0423ds.m1381a(this, this.f1289t, this.f1286q);
        if (!this.f1290u.equals(this.f1289t)) {
            this.f1290u.set(this.f1289t);
            a = true;
        }
        if (!this.f1287r.equals(this.f1286q)) {
            this.f1287r.set(this.f1286q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo3941g() {
        m835j();
        return this.f1278i.mo4392k();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getNestedScrollAxes() {
        return this.f1270B.getNestedScrollAxes();
    }

    /* renamed from: h */
    public final void mo3945h() {
        m835j();
        this.f1278i.mo4393l();
    }

    /* renamed from: i */
    public final void mo3946i() {
        m835j();
        this.f1278i.mo4394m();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m832a(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3932b();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        Rect rect;
        m835j();
        measureChildWithMargins(this.f1271a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1271a.getLayoutParams();
        int max = Math.max(0, this.f1271a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f1271a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1271a.getMeasuredState());
        boolean z = (ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0;
        if (z) {
            i3 = this.f1275f;
            if (this.f1282m && this.f1271a.mo3893a() != null) {
                i3 += this.f1275f;
            }
        } else {
            i3 = this.f1271a.getVisibility() != 8 ? this.f1271a.getMeasuredHeight() : 0;
        }
        this.f1288s.set(this.f1286q);
        this.f1291v.set(this.f1289t);
        if (this.f1281l || z) {
            this.f1291v.top += i3;
            rect = this.f1291v;
        } else {
            this.f1288s.top += i3;
            rect = this.f1288s;
        }
        rect.bottom += 0;
        m833a(this.f1277h, this.f1288s, true);
        if (!this.f1292w.equals(this.f1291v)) {
            this.f1292w.set(this.f1291v);
            this.f1277h.mo4109a(this.f1291v);
        }
        measureChildWithMargins(this.f1277h, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1277h.getLayoutParams();
        int max3 = Math.max(max, this.f1277h.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f1277h.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1277h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        boolean z2 = false;
        if (!this.f1283n || !z) {
            return false;
        }
        this.f1294y.fling(0, 0, 0, (int) f2, 0, 0, ExploreByTouchHelper.INVALID_ID, Integer.MAX_VALUE);
        if (this.f1294y.getFinalY() > this.f1271a.getHeight()) {
            z2 = true;
        }
        if (z2) {
            mo3932b();
            runnable = this.f1269A;
        } else {
            mo3932b();
            runnable = this.f1295z;
        }
        runnable.run();
        this.f1272b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1284o += i2;
        m834b(this.f1284o);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1270B.onNestedScrollAccepted(view, view2, i);
        this.f1284o = this.f1271a != null ? -((int) this.f1271a.getTranslationY()) : 0;
        mo3932b();
        if (this.f1293x != null) {
            this.f1293x.mo3284k();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1271a.getVisibility() != 0) {
            return false;
        }
        return this.f1283n;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1283n && !this.f1272b) {
            if (this.f1284o <= this.f1271a.getHeight()) {
                mo3932b();
                postDelayed(this.f1295z, 600);
                return;
            }
            mo3932b();
            postDelayed(this.f1269A, 600);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m835j();
        int i2 = this.f1285p ^ i;
        this.f1285p = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        if (this.f1293x != null) {
            this.f1293x.mo3280d(!z);
            if (z2 || !z) {
                this.f1293x.mo3282i();
            } else {
                this.f1293x.mo3283j();
            }
        }
        if ((i2 & 256) != 0 && this.f1293x != null) {
            ViewCompat.requestApplyInsets(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1276g = i;
        if (this.f1293x != null) {
            this.f1293x.mo3279b(i);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
