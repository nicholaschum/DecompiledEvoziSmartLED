package android.support.p010v7.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.p010v7.app.C0198a;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.view.C0270a;
import android.support.p010v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;

/* renamed from: android.support.v7.widget.bz */
public final class C0376bz extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: i */
    private static final Interpolator f1746i = new DecelerateInterpolator();

    /* renamed from: a */
    Runnable f1747a;

    /* renamed from: b */
    LinearLayoutCompat f1748b;

    /* renamed from: c */
    int f1749c;

    /* renamed from: d */
    int f1750d;

    /* renamed from: e */
    private Spinner f1751e;

    /* renamed from: f */
    private boolean f1752f;

    /* renamed from: g */
    private int f1753g;

    /* renamed from: h */
    private int f1754h;

    /* renamed from: a */
    private void m1274a(int i) {
        this.f1754h = i;
        int childCount = this.f1748b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1748b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.f1748b.getChildAt(i);
                if (this.f1747a != null) {
                    removeCallbacks(this.f1747a);
                }
                this.f1747a = new C0378ca(this, childAt2);
                post(this.f1747a);
            }
            i2++;
        }
        if (this.f1751e != null && i >= 0) {
            this.f1751e.setSelection(i);
        }
    }

    /* renamed from: a */
    private boolean m1275a() {
        return this.f1751e != null && this.f1751e.getParent() == this;
    }

    /* renamed from: b */
    private boolean m1276b() {
        if (!m1275a()) {
            return false;
        }
        removeView(this.f1751e);
        addView(this.f1748b, new ViewGroup.LayoutParams(-2, -1));
        m1274a(this.f1751e.getSelectedItemPosition());
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0380cc mo4484a(C0198a aVar) {
        C0380cc ccVar = new C0380cc(this, getContext(), aVar);
        ccVar.setBackgroundDrawable((Drawable) null);
        ccVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1753g));
        return ccVar;
    }

    /* renamed from: a */
    public final void mo4485a(boolean z) {
        this.f1752f = z;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1747a != null) {
            post(this.f1747a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0270a a = C0270a.m488a(getContext());
        this.f1753g = a.mo3462e();
        requestLayout();
        this.f1750d = a.mo3464g();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1747a != null) {
            removeCallbacks(this.f1747a);
        }
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1748b.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1749c = -1;
        } else {
            if (childCount > 2) {
                this.f1749c = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1749c = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1749c = Math.min(this.f1749c, this.f1750d);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1753g, 1073741824);
        if (z2 || !this.f1752f) {
            z = false;
        }
        if (z) {
            this.f1748b.measure(0, makeMeasureSpec);
            if (this.f1748b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                if (!m1275a()) {
                    if (this.f1751e == null) {
                        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C0188b.actionDropDownStyle);
                        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner.setOnItemSelectedListener(this);
                        this.f1751e = appCompatSpinner;
                    }
                    removeView(this.f1748b);
                    addView(this.f1751e, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f1751e.getAdapter() == null) {
                        this.f1751e.setAdapter(new C0379cb(this));
                    }
                    if (this.f1747a != null) {
                        removeCallbacks(this.f1747a);
                        this.f1747a = null;
                    }
                    this.f1751e.setSelection(this.f1754h);
                }
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 && measuredWidth != measuredWidth2) {
                    m1274a(this.f1754h);
                    return;
                }
            }
        }
        m1276b();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
