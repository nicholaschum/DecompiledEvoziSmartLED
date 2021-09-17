package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p007v4.view.ViewPropertyAnimatorListener;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.AbsActionBarView */
abstract class AbsActionBarView extends ViewGroup {

    /* renamed from: a */
    protected final VisibilityAnimListener f1236a;

    /* renamed from: b */
    protected final Context f1237b;

    /* renamed from: c */
    protected ActionMenuView f1238c;

    /* renamed from: d */
    protected ActionMenuPresenter f1239d;

    /* renamed from: e */
    protected int f1240e;

    /* renamed from: f */
    protected ViewPropertyAnimatorCompat f1241f;

    /* renamed from: g */
    private boolean f1242g;

    /* renamed from: h */
    private boolean f1243h;

    /* renamed from: android.support.v7.widget.AbsActionBarView$VisibilityAnimListener */
    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* renamed from: a */
        int f1244a;

        /* renamed from: c */
        private boolean f1246c = false;

        protected VisibilityAnimListener() {
        }

        /* renamed from: a */
        public final VisibilityAnimListener mo3892a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            AbsActionBarView.this.f1241f = viewPropertyAnimatorCompat;
            this.f1244a = i;
            return this;
        }

        public void onAnimationCancel(View view) {
            this.f1246c = true;
        }

        public void onAnimationEnd(View view) {
            if (!this.f1246c) {
                AbsActionBarView.this.f1241f = null;
                AbsActionBarView.super.setVisibility(this.f1244a);
            }
        }

        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f1246c = false;
        }
    }

    AbsActionBarView(Context context) {
        this(context, (AttributeSet) null);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1236a = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0188b.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1237b = context;
        } else {
            this.f1237b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m803a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: a */
    protected static int m804a(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, ExploreByTouchHelper.INVALID_ID), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: a */
    protected static int m805a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public ViewPropertyAnimatorCompat mo3885a(int i, long j) {
        ViewPropertyAnimatorCompat alpha;
        if (this.f1241f != null) {
            this.f1241f.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            alpha = ViewCompat.animate(this).alpha(1.0f);
        } else {
            alpha = ViewCompat.animate(this).alpha(0.0f);
        }
        alpha.setDuration(j);
        alpha.setListener(this.f1236a.mo3892a(alpha, i));
        return alpha;
    }

    /* renamed from: a */
    public void mo3886a(int i) {
        this.f1240e = i;
        requestLayout();
    }

    /* renamed from: a */
    public boolean mo3887a() {
        if (this.f1239d != null) {
            return this.f1239d.mo3958f();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0197k.f303a, C0188b.actionBarStyle, 0);
        mo3886a(obtainStyledAttributes.getLayoutDimension(C0197k.f522j, 0));
        obtainStyledAttributes.recycle();
        if (this.f1239d != null) {
            this.f1239d.mo3955c();
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1243h = false;
        }
        if (!this.f1243h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1243h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1243h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1242g = false;
        }
        if (!this.f1242g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1242g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1242g = false;
        }
        return true;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f1241f != null) {
                this.f1241f.cancel();
            }
            super.setVisibility(i);
        }
    }
}
