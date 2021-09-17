package android.support.p010v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f1599a;

    /* renamed from: b */
    private int f1600b;

    /* renamed from: c */
    private WeakReference<View> f1601c;

    /* renamed from: d */
    private LayoutInflater f1602d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1599a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f487dY, i, 0);
        this.f1600b = obtainStyledAttributes.getResourceId(C0197k.f517eb, -1);
        this.f1599a = obtainStyledAttributes.getResourceId(C0197k.f516ea, 0);
        setId(obtainStyledAttributes.getResourceId(C0197k.f488dZ, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public final View mo4252a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1599a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f1602d != null ? this.f1602d : LayoutInflater.from(getContext())).inflate(this.f1599a, viewGroup, false);
            if (this.f1600b != -1) {
                inflate.setId(this.f1600b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1601c = new WeakReference<>(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* renamed from: a */
    public final void mo4253a(LayoutInflater layoutInflater) {
        this.f1602d = layoutInflater;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i) {
        if (this.f1601c != null) {
            View view = (View) this.f1601c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo4252a();
        }
    }
}
