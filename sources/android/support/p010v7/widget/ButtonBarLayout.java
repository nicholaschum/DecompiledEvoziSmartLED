package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f1390a;

    /* renamed from: b */
    private int f1391b = -1;

    /* renamed from: c */
    private int f1392c = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f324aU);
        this.f1390a = obtainStyledAttributes.getBoolean(C0197k.f325aV, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m915a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    private void m916a(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0193g.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    private boolean m917a() {
        return getOrientation() == 1;
    }

    public int getMinimumHeight() {
        return Math.max(this.f1392c, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1390a) {
            if (size > this.f1391b && m917a()) {
                m916a(false);
            }
            this.f1391b = size;
        }
        if (m917a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, ExploreByTouchHelper.INVALID_ID);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1390a && !m917a()) {
            if ((getMeasuredWidthAndState() & ViewCompat.MEASURED_STATE_MASK) == 16777216) {
                m916a(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m915a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m917a()) {
                int a2 = m915a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.getMinimumHeight(this) != i4) {
            setMinimumHeight(i4);
        }
    }
}
