package android.support.p010v7.widget;

import android.content.Context;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0197k;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: g */
    private CharSequence f1257g;

    /* renamed from: h */
    private CharSequence f1258h;

    /* renamed from: i */
    private View f1259i;

    /* renamed from: j */
    private View f1260j;

    /* renamed from: k */
    private LinearLayout f1261k;

    /* renamed from: l */
    private TextView f1262l;

    /* renamed from: m */
    private TextView f1263m;

    /* renamed from: n */
    private int f1264n;

    /* renamed from: o */
    private int f1265o;

    /* renamed from: p */
    private boolean f1266p;

    /* renamed from: q */
    private int f1267q;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0407dc a = C0407dc.m1308a(context, attributeSet, C0197k.f537y, i, 0);
        ViewCompat.setBackground(this, a.mo4545a(C0197k.f538z));
        this.f1264n = a.mo4558g(C0197k.f280D, 0);
        this.f1265o = a.mo4558g(C0197k.f279C, 0);
        this.f1240e = a.mo4556f(C0197k.f278B, 0);
        this.f1267q = a.mo4558g(C0197k.f277A, C0194h.abc_action_mode_close_item_material);
        a.mo4546a();
    }

    /* renamed from: g */
    private void m817g() {
        if (this.f1261k == null) {
            LayoutInflater.from(getContext()).inflate(C0194h.abc_action_bar_title_item, this);
            this.f1261k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1262l = (TextView) this.f1261k.findViewById(C0193g.action_bar_title);
            this.f1263m = (TextView) this.f1261k.findViewById(C0193g.action_bar_subtitle);
            if (this.f1264n != 0) {
                this.f1262l.setTextAppearance(getContext(), this.f1264n);
            }
            if (this.f1265o != 0) {
                this.f1263m.setTextAppearance(getContext(), this.f1265o);
            }
        }
        this.f1262l.setText(this.f1257g);
        this.f1263m.setText(this.f1258h);
        boolean z = !TextUtils.isEmpty(this.f1257g);
        boolean z2 = !TextUtils.isEmpty(this.f1258h);
        int i = 8;
        this.f1263m.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1261k;
        if (z || z2) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f1261k.getParent() == null) {
            addView(this.f1261k);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat mo3885a(int i, long j) {
        return super.mo3885a(i, j);
    }

    /* renamed from: a */
    public final void mo3886a(int i) {
        this.f1240e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r3.f1259i.getParent() == null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3908a(android.support.p010v7.view.C0271b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f1259i
            if (r0 != 0) goto L_0x001b
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f1267q
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f1259i = r0
        L_0x0015:
            android.view.View r0 = r3.f1259i
            r3.addView(r0)
            goto L_0x0024
        L_0x001b:
            android.view.View r0 = r3.f1259i
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0024
            goto L_0x0015
        L_0x0024:
            android.view.View r0 = r3.f1259i
            int r1 = android.support.p010v7.p011a.C0193g.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            android.support.v7.widget.b r1 = new android.support.v7.widget.b
            r1.<init>(r3, r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo3290b()
            android.support.v7.view.menu.MenuBuilder r4 = (android.support.p010v7.view.menu.MenuBuilder) r4
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f1239d
            if (r0 == 0) goto L_0x0043
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f1239d
            r0.mo3960h()
        L_0x0043:
            android.support.v7.widget.ActionMenuPresenter r0 = new android.support.v7.widget.ActionMenuPresenter
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f1239d = r0
            android.support.v7.widget.ActionMenuPresenter r0 = r3.f1239d
            r0.mo3956d()
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            android.support.v7.widget.ActionMenuPresenter r1 = r3.f1239d
            android.content.Context r2 = r3.f1237b
            r4.mo3575a((android.support.p010v7.view.menu.C0286ac) r1, (android.content.Context) r2)
            android.support.v7.widget.ActionMenuPresenter r4 = r3.f1239d
            android.support.v7.view.menu.ae r4 = r4.mo3767a((android.view.ViewGroup) r3)
            android.support.v7.widget.ActionMenuView r4 = (android.support.p010v7.widget.ActionMenuView) r4
            r3.f1238c = r4
            android.support.v7.widget.ActionMenuView r4 = r3.f1238c
            r1 = 0
            android.support.p007v4.view.ViewCompat.setBackground(r4, r1)
            android.support.v7.widget.ActionMenuView r4 = r3.f1238c
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.ActionBarContextView.mo3908a(android.support.v7.view.b):void");
    }

    /* renamed from: a */
    public final void mo3909a(View view) {
        if (this.f1260j != null) {
            removeView(this.f1260j);
        }
        this.f1260j = view;
        if (!(view == null || this.f1261k == null)) {
            removeView(this.f1261k);
            this.f1261k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    /* renamed from: a */
    public final void mo3910a(CharSequence charSequence) {
        this.f1257g = charSequence;
        m817g();
    }

    /* renamed from: a */
    public final void mo3911a(boolean z) {
        if (z != this.f1266p) {
            requestLayout();
        }
        this.f1266p = z;
    }

    /* renamed from: a */
    public final boolean mo3887a() {
        if (this.f1239d != null) {
            return this.f1239d.mo3958f();
        }
        return false;
    }

    /* renamed from: b */
    public final CharSequence mo3912b() {
        return this.f1257g;
    }

    /* renamed from: b */
    public final void mo3913b(CharSequence charSequence) {
        this.f1258h = charSequence;
        m817g();
    }

    /* renamed from: c */
    public final CharSequence mo3914c() {
        return this.f1258h;
    }

    /* renamed from: d */
    public final void mo3915d() {
        if (this.f1259i == null) {
            mo3916e();
        }
    }

    /* renamed from: e */
    public final void mo3916e() {
        removeAllViews();
        this.f1260j = null;
        this.f1238c = null;
    }

    /* renamed from: f */
    public final boolean mo3917f() {
        return this.f1266p;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1239d != null) {
            this.f1239d.mo3959g();
            this.f1239d.mo3961i();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1257g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = C0423ds.m1382a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.f1259i == null || this.f1259i.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1259i.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m803a(paddingRight, i5, a);
            paddingRight = m803a(a2 + m805a(this.f1259i, a2, paddingTop, paddingTop2, a), i6, a);
        }
        if (!(this.f1261k == null || this.f1260j != null || this.f1261k.getVisibility() == 8)) {
            paddingRight += m805a(this.f1261k, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.f1260j != null) {
            m805a(this.f1260j, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f1238c != null) {
            m805a(this.f1238c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.f1240e > 0 ? this.f1240e : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, ExploreByTouchHelper.INVALID_ID);
            if (this.f1259i != null) {
                int a = m804a(this.f1259i, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1259i.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.f1238c != null && this.f1238c.getParent() == this) {
                paddingLeft = m804a((View) this.f1238c, paddingLeft, makeMeasureSpec);
            }
            if (this.f1261k != null && this.f1260j == null) {
                if (this.f1266p) {
                    this.f1261k.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1261k.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1261k.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = m804a((View) this.f1261k, paddingLeft, makeMeasureSpec);
                }
            }
            if (this.f1260j != null) {
                ViewGroup.LayoutParams layoutParams = this.f1260j.getLayoutParams();
                int i5 = layoutParams.width != -2 ? 1073741824 : ExploreByTouchHelper.INVALID_ID;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = ExploreByTouchHelper.INVALID_ID;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.f1260j.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.f1240e <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
