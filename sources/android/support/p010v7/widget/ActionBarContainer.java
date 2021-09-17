package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f1247a;

    /* renamed from: b */
    Drawable f1248b;

    /* renamed from: c */
    Drawable f1249c;

    /* renamed from: d */
    boolean f1250d;

    /* renamed from: e */
    boolean f1251e;

    /* renamed from: f */
    private boolean f1252f;

    /* renamed from: g */
    private View f1253g;

    /* renamed from: h */
    private View f1254h;

    /* renamed from: i */
    private View f1255i;

    /* renamed from: j */
    private int f1256j;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewCompat.setBackground(this, new C0323a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f303a);
        this.f1247a = obtainStyledAttributes.getDrawable(C0197k.f356b);
        this.f1248b = obtainStyledAttributes.getDrawable(C0197k.f462d);
        this.f1256j = obtainStyledAttributes.getDimensionPixelSize(C0197k.f522j, -1);
        if (getId() == C0193g.split_action_bar) {
            this.f1250d = true;
            this.f1249c = obtainStyledAttributes.getDrawable(C0197k.f409c);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f1250d ? this.f1247a == null && this.f1248b == null : this.f1249c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private static boolean m812a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private static int m813b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final View mo3893a() {
        return this.f1253g;
    }

    /* renamed from: a */
    public final void mo3894a(C0376bz bzVar) {
        if (this.f1253g != null) {
            removeView(this.f1253g);
        }
        this.f1253g = bzVar;
        if (bzVar != null) {
            addView(bzVar);
            ViewGroup.LayoutParams layoutParams = bzVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            bzVar.mo4485a(false);
        }
    }

    /* renamed from: a */
    public final void mo3895a(boolean z) {
        this.f1252f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1247a != null && this.f1247a.isStateful()) {
            this.f1247a.setState(getDrawableState());
        }
        if (this.f1248b != null && this.f1248b.isStateful()) {
            this.f1248b.setState(getDrawableState());
        }
        if (this.f1249c != null && this.f1249c.isStateful()) {
            this.f1249c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1247a != null) {
            this.f1247a.jumpToCurrentState();
        }
        if (this.f1248b != null) {
            this.f1248b.jumpToCurrentState();
        }
        if (this.f1249c != null) {
            this.f1249c.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1254h = findViewById(C0193g.action_bar);
        this.f1255i = findViewById(C0193g.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1252f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f1253g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f1250d) {
            if (this.f1247a != null) {
                if (this.f1254h.getVisibility() == 0) {
                    drawable = this.f1247a;
                    left = this.f1254h.getLeft();
                    top = this.f1254h.getTop();
                    right = this.f1254h.getRight();
                    view = this.f1254h;
                } else if (this.f1255i == null || this.f1255i.getVisibility() != 0) {
                    this.f1247a.setBounds(0, 0, 0, 0);
                    z3 = true;
                } else {
                    drawable = this.f1247a;
                    left = this.f1255i.getLeft();
                    top = this.f1255i.getTop();
                    right = this.f1255i.getRight();
                    view = this.f1255i;
                }
                drawable.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f1251e = z4;
            if (!z4 || this.f1248b == null) {
                z2 = z3;
            } else {
                this.f1248b.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        } else if (this.f1249c != null) {
            this.f1249c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z2 = false;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1254h
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001e
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001e
            int r0 = r3.f1256j
            if (r0 < 0) goto L_0x001e
            int r0 = r3.f1256j
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001e:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f1254h
            if (r4 != 0) goto L_0x0026
            return
        L_0x0026:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f1253g
            if (r0 == 0) goto L_0x0073
            android.view.View r0 = r3.f1253g
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0073
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x0073
            android.view.View r0 = r3.f1254h
            boolean r0 = m812a((android.view.View) r0)
            if (r0 != 0) goto L_0x004b
            android.view.View r0 = r3.f1254h
        L_0x0046:
            int r0 = m813b(r0)
            goto L_0x0057
        L_0x004b:
            android.view.View r0 = r3.f1255i
            boolean r0 = m812a((android.view.View) r0)
            if (r0 != 0) goto L_0x0056
            android.view.View r0 = r3.f1255i
            goto L_0x0046
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r4 != r1) goto L_0x005e
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x0061
        L_0x005e:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0061:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f1253g
            int r1 = m813b(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f1247a != null) {
            this.f1247a.setVisible(z, false);
        }
        if (this.f1248b != null) {
            this.f1248b.setVisible(z, false);
        }
        if (this.f1249c != null) {
            this.f1249c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f1247a && !this.f1250d) {
            return true;
        }
        if (drawable != this.f1248b || !this.f1251e) {
            return (drawable == this.f1249c && this.f1250d) || super.verifyDrawable(drawable);
        }
        return true;
    }
}
