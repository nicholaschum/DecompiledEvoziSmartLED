package p021wl.smartled.views.floatingactionbutton;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.C0512b;

/* renamed from: wl.smartled.views.floatingactionbutton.FloatingActionsMenu */
public class FloatingActionsMenu extends ViewGroup {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static Interpolator f2837v = new OvershootInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static Interpolator f2838w = new DecelerateInterpolator(3.0f);
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static Interpolator f2839x = new DecelerateInterpolator();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f2840a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f2841b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f2842c;

    /* renamed from: d */
    private int f2843d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f2844e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f2845f;

    /* renamed from: g */
    private int f2846g;

    /* renamed from: h */
    private int f2847h;

    /* renamed from: i */
    private int f2848i;

    /* renamed from: j */
    private boolean f2849j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public AnimatorSet f2850k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public AnimatorSet f2851l;

    /* renamed from: m */
    private AddFloatingActionButton f2852m;

    /* renamed from: n */
    private int f2853n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C0613h f2854o;

    /* renamed from: p */
    private int f2855p;

    /* renamed from: q */
    private int f2856q;

    /* renamed from: r */
    private int f2857r;

    /* renamed from: s */
    private int f2858s;

    /* renamed from: t */
    private int f2859t;

    /* renamed from: u */
    private C0615j f2860u;

    /* renamed from: wl.smartled.views.floatingactionbutton.FloatingActionsMenu$SavedState */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0614i();

        /* renamed from: a */
        public boolean f2861a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f2861a = parcel.readInt() != 1 ? false : true;
        }

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2861a ? 1 : 0);
        }
    }

    public FloatingActionsMenu(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionsMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2850k = new AnimatorSet().setDuration(300);
        this.f2851l = new AnimatorSet().setDuration(300);
        m2235a(context, attributeSet);
    }

    public FloatingActionsMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2850k = new AnimatorSet().setDuration(300);
        this.f2851l = new AnimatorSet().setDuration(300);
        m2235a(context, attributeSet);
    }

    /* renamed from: a */
    private int m2231a(int i) {
        return getResources().getColor(i);
    }

    /* renamed from: a */
    private void m2234a(Context context) {
        this.f2852m = new C0609d(this, context);
        if (this.f2853n != 0) {
            this.f2852m.mo5222b(this.f2853n);
        }
        this.f2852m.setId(C0462R.C0464id.fab_expand_menu_button);
        this.f2852m.mo5220a(this.f2843d);
        this.f2852m.setOnClickListener(new C0610e(this));
        addView(this.f2852m, super.generateDefaultLayoutParams());
        this.f2859t++;
    }

    /* renamed from: a */
    private void m2235a(Context context, AttributeSet attributeSet) {
        this.f2846g = (int) ((getResources().getDimension(C0462R.dimen.fab_actions_spacing) - getResources().getDimension(C0462R.dimen.fab_shadow_radius)) - getResources().getDimension(C0462R.dimen.fab_shadow_offset));
        this.f2847h = getResources().getDimensionPixelSize(C0462R.dimen.fab_labels_margin);
        this.f2848i = getResources().getDimensionPixelSize(C0462R.dimen.fab_shadow_offset);
        this.f2860u = new C0615j(this);
        setTouchDelegate(this.f2860u);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0512b.f2282y, 0, 0);
        this.f2840a = obtainStyledAttributes.getColor(2, m2231a(17170443));
        this.f2841b = obtainStyledAttributes.getColor(0, m2231a(17170451));
        this.f2842c = obtainStyledAttributes.getColor(1, m2231a(17170450));
        this.f2843d = obtainStyledAttributes.getInt(3, 0);
        this.f2844e = obtainStyledAttributes.getBoolean(4, true);
        this.f2845f = obtainStyledAttributes.getInt(5, 0);
        this.f2857r = obtainStyledAttributes.getResourceId(7, 0);
        this.f2858s = obtainStyledAttributes.getInt(8, 0);
        this.f2853n = obtainStyledAttributes.getResourceId(6, 0);
        obtainStyledAttributes.recycle();
        if (this.f2857r == 0 || !m2243e()) {
            m2234a(context);
            return;
        }
        throw new IllegalStateException("Action labels in horizontal expand orientation is not supported.");
    }

    /* renamed from: e */
    private boolean m2243e() {
        return this.f2845f == 2 || this.f2845f == 3;
    }

    /* renamed from: a */
    public final void mo5227a() {
        if (this.f2849j) {
            if (this.f2849j) {
                this.f2849j = false;
                this.f2860u.mo5252a(false);
                this.f2851l.setDuration(300);
                this.f2851l.start();
                this.f2850k.cancel();
            }
        } else if (!this.f2849j) {
            this.f2849j = true;
            this.f2860u.mo5252a(true);
            this.f2851l.cancel();
            this.f2850k.start();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0611f(this, super.generateDefaultLayoutParams());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0611f(this, super.generateLayoutParams(attributeSet));
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0611f(this, super.generateLayoutParams(layoutParams));
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        bringChildToFront(this.f2852m);
        this.f2859t = getChildCount();
        if (this.f2857r != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f2857r);
            for (int i = 0; i < this.f2859t; i++) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) getChildAt(i);
                String str = floatingActionButton.f2829e;
                if (!(floatingActionButton == this.f2852m || str == null || floatingActionButton.getTag(C0462R.C0464id.fab_label) != null)) {
                    TextView textView = new TextView(contextThemeWrapper);
                    textView.setTextAppearance(getContext(), this.f2857r);
                    textView.setText(floatingActionButton.f2829e);
                    addView(textView);
                    floatingActionButton.setTag(C0462R.C0464id.fab_label, textView);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = 8;
        char c = 1;
        char c2 = 0;
        float f = 0.0f;
        switch (this.f2845f) {
            case 0:
            case 1:
                boolean z2 = this.f2845f == 0;
                if (z) {
                    this.f2860u.mo5250a();
                }
                int measuredHeight = z2 ? (i4 - i2) - this.f2852m.getMeasuredHeight() : 0;
                int i7 = this.f2858s == 0 ? (i3 - i) - (this.f2855p / 2) : this.f2855p / 2;
                int measuredWidth = i7 - (this.f2852m.getMeasuredWidth() / 2);
                this.f2852m.layout(measuredWidth, measuredHeight, this.f2852m.getMeasuredWidth() + measuredWidth, this.f2852m.getMeasuredHeight() + measuredHeight);
                int i8 = (this.f2855p / 2) + this.f2847h;
                int i9 = this.f2858s == 0 ? i7 - i8 : i8 + i7;
                int measuredHeight2 = z2 ? measuredHeight - this.f2846g : this.f2852m.getMeasuredHeight() + measuredHeight + this.f2846g;
                int i10 = this.f2859t - 1;
                while (i10 >= 0) {
                    View childAt = getChildAt(i10);
                    if (childAt == this.f2852m || childAt.getVisibility() == i6) {
                        i5 = i7;
                    } else {
                        int measuredWidth2 = i7 - (childAt.getMeasuredWidth() / 2);
                        if (z2) {
                            measuredHeight2 -= childAt.getMeasuredHeight();
                        }
                        childAt.layout(measuredWidth2, measuredHeight2, childAt.getMeasuredWidth() + measuredWidth2, childAt.getMeasuredHeight() + measuredHeight2);
                        float f2 = (float) (measuredHeight - measuredHeight2);
                        childAt.setTranslationY(this.f2849j ? 0.0f : f2);
                        childAt.setAlpha(this.f2849j ? 1.0f : 0.0f);
                        C0611f fVar = (C0611f) childAt.getLayoutParams();
                        ObjectAnimator a = fVar.f2879d;
                        i5 = i7;
                        float[] fArr = new float[2];
                        fArr[c2] = f;
                        fArr[c] = f2;
                        a.setFloatValues(fArr);
                        ObjectAnimator b = fVar.f2877b;
                        float[] fArr2 = new float[2];
                        fArr2[c2] = f2;
                        fArr2[c] = f;
                        b.setFloatValues(fArr2);
                        fVar.mo5243a(childAt);
                        View view = (View) childAt.getTag(C0462R.C0464id.fab_label);
                        if (view != null) {
                            int measuredWidth3 = this.f2858s == 0 ? i9 - view.getMeasuredWidth() : view.getMeasuredWidth() + i9;
                            int i11 = this.f2858s == 0 ? measuredWidth3 : i9;
                            if (this.f2858s == 0) {
                                measuredWidth3 = i9;
                            }
                            int measuredHeight3 = (measuredHeight2 - this.f2848i) + ((childAt.getMeasuredHeight() - view.getMeasuredHeight()) / 2);
                            view.layout(i11, measuredHeight3, measuredWidth3, measuredHeight3 + view.getMeasuredHeight());
                            this.f2860u.mo5251a(new TouchDelegate(new Rect(Math.min(measuredWidth2, i11), measuredHeight2 - (this.f2846g / 2), Math.max(measuredWidth2 + childAt.getMeasuredWidth(), measuredWidth3), childAt.getMeasuredHeight() + measuredHeight2 + (this.f2846g / 2)), childAt));
                            view.setTranslationY(this.f2849j ? 0.0f : f2);
                            view.setAlpha(this.f2849j ? 1.0f : 0.0f);
                            C0611f fVar2 = (C0611f) view.getLayoutParams();
                            f = 0.0f;
                            fVar2.f2879d.setFloatValues(new float[]{0.0f, f2});
                            fVar2.f2877b.setFloatValues(new float[]{f2, 0.0f});
                            fVar2.mo5243a(view);
                        }
                        measuredHeight2 = z2 ? measuredHeight2 - this.f2846g : measuredHeight2 + childAt.getMeasuredHeight() + this.f2846g;
                    }
                    i10--;
                    i7 = i5;
                    i6 = 8;
                    c = 1;
                    c2 = 0;
                }
                return;
            case 2:
            case 3:
                boolean z3 = this.f2845f == 2;
                int measuredWidth4 = z3 ? (i3 - i) - this.f2852m.getMeasuredWidth() : 0;
                int measuredHeight4 = ((i4 - i2) - this.f2856q) + ((this.f2856q - this.f2852m.getMeasuredHeight()) / 2);
                this.f2852m.layout(measuredWidth4, measuredHeight4, this.f2852m.getMeasuredWidth() + measuredWidth4, this.f2852m.getMeasuredHeight() + measuredHeight4);
                int measuredWidth5 = z3 ? measuredWidth4 - this.f2846g : this.f2852m.getMeasuredWidth() + 0 + this.f2846g;
                for (int i12 = this.f2859t - 1; i12 >= 0; i12--) {
                    View childAt2 = getChildAt(i12);
                    if (!(childAt2 == this.f2852m || childAt2.getVisibility() == 8)) {
                        if (z3) {
                            measuredWidth5 -= childAt2.getMeasuredWidth();
                        }
                        int measuredHeight5 = ((this.f2852m.getMeasuredHeight() - childAt2.getMeasuredHeight()) / 2) + measuredHeight4;
                        childAt2.layout(measuredWidth5, measuredHeight5, childAt2.getMeasuredWidth() + measuredWidth5, childAt2.getMeasuredHeight() + measuredHeight5);
                        float f3 = (float) (measuredWidth4 - measuredWidth5);
                        childAt2.setTranslationX(this.f2849j ? 0.0f : f3);
                        childAt2.setAlpha(this.f2849j ? 1.0f : 0.0f);
                        C0611f fVar3 = (C0611f) childAt2.getLayoutParams();
                        fVar3.f2879d.setFloatValues(new float[]{0.0f, f3});
                        fVar3.f2877b.setFloatValues(new float[]{f3, 0.0f});
                        fVar3.mo5243a(childAt2);
                        measuredWidth5 = z3 ? measuredWidth5 - this.f2846g : measuredWidth5 + childAt2.getMeasuredWidth() + this.f2846g;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextView textView;
        measureChildren(i, i2);
        int i3 = 0;
        this.f2855p = 0;
        this.f2856q = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f2859t; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                switch (this.f2845f) {
                    case 0:
                    case 1:
                        this.f2855p = Math.max(this.f2855p, childAt.getMeasuredWidth());
                        i5 += childAt.getMeasuredHeight();
                        break;
                    case 2:
                    case 3:
                        i6 += childAt.getMeasuredWidth();
                        this.f2856q = Math.max(this.f2856q, childAt.getMeasuredHeight());
                        break;
                }
                if (!m2243e() && (textView = (TextView) childAt.getTag(C0462R.C0464id.fab_label)) != null) {
                    i4 = Math.max(i4, textView.getMeasuredWidth());
                }
            }
        }
        if (!m2243e()) {
            int i8 = this.f2855p;
            if (i4 > 0) {
                i3 = this.f2847h + i4;
            }
            i6 = i8 + i3;
        } else {
            i5 = this.f2856q;
        }
        switch (this.f2845f) {
            case 0:
            case 1:
                i5 = ((i5 + (this.f2846g * (this.f2859t - 1))) * 12) / 10;
                break;
            case 2:
            case 3:
                i6 = ((i6 + (this.f2846g * (this.f2859t - 1))) * 12) / 10;
                break;
        }
        setMeasuredDimension(i6, i5);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f2849j = savedState.f2861a;
            this.f2860u.mo5252a(this.f2849j);
            if (this.f2854o != null) {
                this.f2854o.mo5246a(this.f2849j ? 135.0f : 0.0f);
            }
            super.onRestoreInstanceState(savedState.getSuperState());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2861a = this.f2849j;
        return savedState;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f2852m.setEnabled(z);
    }
}
