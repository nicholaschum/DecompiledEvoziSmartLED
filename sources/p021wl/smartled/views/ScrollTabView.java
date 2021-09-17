package p021wl.smartled.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: wl.smartled.views.ScrollTabView */
public class ScrollTabView extends LinearLayout {

    /* renamed from: a */
    private ImageView f2776a;

    /* renamed from: b */
    private ImageView f2777b;

    /* renamed from: c */
    private boolean f2778c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public HorizontalScrollView f2779d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public LinearLayout f2780e;

    public ScrollTabView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrollTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2778c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5198a(boolean z, boolean z2) {
        LinearLayout linearLayout = this.f2780e;
        int i = 0;
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            if (linearLayout.getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        if (i <= 5) {
            this.f2776a.setVisibility(4);
            this.f2777b.setVisibility(4);
        } else if (z && !z2) {
            this.f2776a.setVisibility(4);
            this.f2777b.setVisibility(0);
        } else if (z || !z2) {
            this.f2776a.setVisibility(0);
            this.f2777b.setVisibility(0);
        } else {
            this.f2776a.setVisibility(0);
            this.f2777b.setVisibility(4);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2776a = (ImageView) getChildAt(0);
        this.f2777b = (ImageView) getChildAt(2);
        this.f2779d = (HorizontalScrollView) getChildAt(1);
        this.f2780e = (LinearLayout) this.f2779d.getChildAt(0);
        this.f2779d.getViewTreeObserver().addOnScrollChangedListener(new C0621l(this));
        mo5198a(true, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2778c) {
            int width = this.f2779d.getWidth() / 5;
            int childCount = this.f2780e.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                ViewGroup viewGroup = (ViewGroup) this.f2780e.getChildAt(i5);
                if (viewGroup.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    layoutParams.width = width;
                    viewGroup.setLayoutParams(layoutParams);
                }
            }
            this.f2778c = false;
        }
    }
}
