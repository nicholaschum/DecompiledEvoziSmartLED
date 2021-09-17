package android.support.p010v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p007v4.widget.ListViewAutoScrollHelper;
import android.support.p010v7.p011a.C0188b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.bf */
class C0356bf extends ListView {

    /* renamed from: a */
    C0358bh f1697a;

    /* renamed from: b */
    private final Rect f1698b = new Rect();

    /* renamed from: c */
    private int f1699c = 0;

    /* renamed from: d */
    private int f1700d = 0;

    /* renamed from: e */
    private int f1701e = 0;

    /* renamed from: f */
    private int f1702f = 0;

    /* renamed from: g */
    private int f1703g;

    /* renamed from: h */
    private Field f1704h;

    /* renamed from: i */
    private C0357bg f1705i;

    /* renamed from: j */
    private boolean f1706j;

    /* renamed from: k */
    private boolean f1707k;

    /* renamed from: l */
    private boolean f1708l;

    /* renamed from: m */
    private ViewPropertyAnimatorCompat f1709m;

    /* renamed from: n */
    private ListViewAutoScrollHelper f1710n;

    C0356bf(Context context, boolean z) {
        super(context, (AttributeSet) null, C0188b.dropDownListViewStyle);
        this.f1707k = z;
        setCacheColorHint(0);
        try {
            this.f1704h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1704h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1244a() {
        Drawable selector = getSelector();
        if (selector != null && this.f1708l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: b */
    private void m1245b(boolean z) {
        if (this.f1705i != null) {
            this.f1705i.mo4411a(z);
        }
    }

    /* renamed from: a */
    public int mo4398a(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i7 = i6;
        View view = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < count) {
            int itemViewType = adapter.getItemViewType(i8);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i8, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            view.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i8 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i4) {
                return (i5 < 0 || i8 <= i5 || i10 <= 0 || i7 == i4) ? i4 : i10;
            }
            if (i5 >= 0 && i8 >= i5) {
                i10 = i7;
            }
            i8++;
        }
        return i7;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4399a(boolean z) {
        this.f1706j = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4400a(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            switch(r3) {
                case 1: goto L_0x0016;
                case 2: goto L_0x0014;
                case 3: goto L_0x0011;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0 = 0
            r5 = 1
            goto L_0x012e
        L_0x0011:
            r0 = 0
            goto L_0x012e
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0033
            r5 = r0
            r0 = 1
            goto L_0x012e
        L_0x0033:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f1708l = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r11 = 21
            if (r0 < r11) goto L_0x004a
            r1.drawableHotspotChanged(r7, r6)
        L_0x004a:
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0053
            r1.setPressed(r4)
        L_0x0053:
            r16.layoutChildren()
            int r0 = r1.f1703g
            if (r0 == r9) goto L_0x0072
            int r0 = r1.f1703g
            int r12 = r16.getFirstVisiblePosition()
            int r0 = r0 - r12
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x0072
            if (r0 == r10) goto L_0x0072
            boolean r12 = r0.isPressed()
            if (r12 == 0) goto L_0x0072
            r0.setPressed(r5)
        L_0x0072:
            r1.f1703g = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r11) goto L_0x0089
            r10.drawableHotspotChanged(r0, r12)
        L_0x0089:
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0092
            r10.setPressed(r4)
        L_0x0092:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x009c
            if (r8 == r9) goto L_0x009c
            r12 = 1
            goto L_0x009d
        L_0x009c:
            r12 = 0
        L_0x009d:
            if (r12 == 0) goto L_0x00a2
            r11.setVisible(r5, r5)
        L_0x00a2:
            android.graphics.Rect r0 = r1.f1698b
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f1699c
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f1700d
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f1701e
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f1702f
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f1704h     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ef }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r5 == r0) goto L_0x00f3
            java.lang.reflect.Field r5 = r1.f1704h     // Catch:{ IllegalAccessException -> 0x00ef }
            r0 = r0 ^ r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ef }
            if (r8 == r9) goto L_0x00f3
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ef }
            goto L_0x00f3
        L_0x00ef:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00f3:
            if (r12 == 0) goto L_0x0111
            android.graphics.Rect r0 = r1.f1698b
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0108
            r12 = 1
        L_0x0106:
            r13 = 0
            goto L_0x010a
        L_0x0108:
            r12 = 0
            goto L_0x0106
        L_0x010a:
            r11.setVisible(r12, r13)
            android.support.p007v4.graphics.drawable.DrawableCompat.setHotspot(r11, r5, r0)
            goto L_0x0112
        L_0x0111:
            r13 = 0
        L_0x0112:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x011d
            if (r8 == r9) goto L_0x011d
            android.support.p007v4.graphics.drawable.DrawableCompat.setHotspot(r0, r7, r6)
        L_0x011d:
            r1.m1245b(r13)
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x000d
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
            goto L_0x000d
        L_0x012e:
            if (r5 == 0) goto L_0x0132
            if (r0 == 0) goto L_0x0157
        L_0x0132:
            r3 = 0
            r1.f1708l = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r0 = r1.f1703g
            int r6 = r16.getFirstVisiblePosition()
            int r0 = r0 - r6
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x014b
            r0.setPressed(r3)
        L_0x014b:
            android.support.v4.view.ViewPropertyAnimatorCompat r0 = r1.f1709m
            if (r0 == 0) goto L_0x0157
            android.support.v4.view.ViewPropertyAnimatorCompat r0 = r1.f1709m
            r0.cancel()
            r0 = 0
            r1.f1709m = r0
        L_0x0157:
            if (r5 == 0) goto L_0x016f
            android.support.v4.widget.ListViewAutoScrollHelper r0 = r1.f1710n
            if (r0 != 0) goto L_0x0164
            android.support.v4.widget.ListViewAutoScrollHelper r0 = new android.support.v4.widget.ListViewAutoScrollHelper
            r0.<init>(r1)
            r1.f1710n = r0
        L_0x0164:
            android.support.v4.widget.ListViewAutoScrollHelper r0 = r1.f1710n
            r0.setEnabled(r4)
            android.support.v4.widget.ListViewAutoScrollHelper r0 = r1.f1710n
            r0.onTouch(r1, r2)
            goto L_0x0179
        L_0x016f:
            android.support.v4.widget.ListViewAutoScrollHelper r0 = r1.f1710n
            if (r0 == 0) goto L_0x0179
            android.support.v4.widget.ListViewAutoScrollHelper r0 = r1.f1710n
            r2 = 0
            r0.setEnabled(r2)
        L_0x0179:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0356bf.mo4400a(android.view.MotionEvent, int):boolean");
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1698b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1698b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1697a == null) {
            super.drawableStateChanged();
            m1245b(true);
            m1244a();
        }
    }

    public boolean hasFocus() {
        return this.f1707k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1707k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1707k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1707k && this.f1706j) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1697a = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1697a == null) {
            this.f1697a = new C0358bh(this);
            C0358bh bhVar = this.f1697a;
            bhVar.f1712a.post(bhVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m1244a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1703g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f1697a != null) {
            C0358bh bhVar = this.f1697a;
            bhVar.f1712a.f1697a = null;
            bhVar.f1712a.removeCallbacks(bhVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        this.f1705i = drawable != null ? new C0357bg(drawable) : null;
        super.setSelector(this.f1705i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1699c = rect.left;
        this.f1700d = rect.top;
        this.f1701e = rect.right;
        this.f1702f = rect.bottom;
    }
}
