package android.support.p010v7.widget;

import android.content.Context;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.AlertDialogLayout */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.mo4129o()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r3 + r14
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.mo4126l()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = 0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00ac
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00a9
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00a9
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r6 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r6
            int r7 = r6.f1419h
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            int r8 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r9)
            int r7 = android.support.p007v4.view.GravityCompat.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008a
            r8 = 5
            if (r7 == r8) goto L_0x0087
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0095
        L_0x0087:
            int r7 = r11 - r4
            goto L_0x0092
        L_0x008a:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L_0x0092:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L_0x0095:
            boolean r8 = r9.mo4124b((int) r0)
            if (r8 == 0) goto L_0x009c
            int r12 = r12 + r14
        L_0x009c:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r12 = r12 + r5
        L_0x00a9:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int childCount = getChildCount();
        boolean z = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        int i8 = 0;
        while (true) {
            if (i8 < childCount) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == C0193g.topPanel) {
                        view = childAt;
                    } else if (id == C0193g.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == C0193g.contentPanel || id == C0193g.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i8++;
            } else {
                int mode = View.MeasureSpec.getMode(i2);
                int size = View.MeasureSpec.getSize(i2);
                int mode2 = View.MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i7, 0);
                    paddingTop += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i7, 0);
                    View view4 = view2;
                    while (true) {
                        i4 = ViewCompat.getMinimumHeight(view4);
                        if (i4 <= 0) {
                            if (!(view4 instanceof ViewGroup)) {
                                break;
                            }
                            ViewGroup viewGroup = (ViewGroup) view4;
                            if (viewGroup.getChildCount() != 1) {
                                break;
                            }
                            view4 = viewGroup.getChildAt(0);
                        } else {
                            break;
                        }
                    }
                    i4 = 0;
                    i5 = view2.getMeasuredHeight() - i4;
                    paddingTop += i4;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    view3.measure(i7, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
                    i6 = view3.getMeasuredHeight();
                    paddingTop += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i9 = size - paddingTop;
                if (view2 != null) {
                    int i10 = paddingTop - i4;
                    int min = Math.min(i9, i5);
                    if (min > 0) {
                        i9 -= min;
                        i4 += min;
                    }
                    view2.measure(i7, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
                    paddingTop = i10 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i9 > 0) {
                    view3.measure(i7, View.MeasureSpec.makeMeasureSpec(i6 + i9, mode));
                    paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i11 = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2.getVisibility() != 8) {
                        i11 = Math.max(i11, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i11 + getPaddingLeft() + getPaddingRight(), i7, i3), View.resolveSizeAndState(paddingTop, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt3 = getChildAt(i13);
                        if (childAt3.getVisibility() != 8) {
                            LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i14 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                layoutParams.height = i14;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        int i15 = i2;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
