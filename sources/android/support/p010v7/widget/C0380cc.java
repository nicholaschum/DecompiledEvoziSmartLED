package android.support.p010v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p010v7.app.C0198a;
import android.support.p010v7.p011a.C0188b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.cc */
final class C0380cc extends LinearLayout {

    /* renamed from: a */
    final /* synthetic */ C0376bz f1759a;

    /* renamed from: b */
    private final int[] f1760b = {16842964};

    /* renamed from: c */
    private C0198a f1761c;

    /* renamed from: d */
    private TextView f1762d;

    /* renamed from: e */
    private ImageView f1763e;

    /* renamed from: f */
    private View f1764f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0380cc(C0376bz bzVar, Context context, C0198a aVar) {
        super(context, (AttributeSet) null, C0188b.actionBarTabStyle);
        this.f1759a = bzVar;
        this.f1761c = aVar;
        C0407dc a = C0407dc.m1308a(context, (AttributeSet) null, this.f1760b, C0188b.actionBarTabStyle, 0);
        if (a.mo4560h(0)) {
            setBackgroundDrawable(a.mo4545a(0));
        }
        a.mo4546a();
        setGravity(8388627);
        m1279b();
    }

    /* renamed from: b */
    private void m1279b() {
        C0198a aVar = this.f1761c;
        View c = aVar.mo3229c();
        CharSequence charSequence = null;
        if (c != null) {
            ViewParent parent = c.getParent();
            if (parent != this) {
                if (parent != null) {
                    ((ViewGroup) parent).removeView(c);
                }
                addView(c);
            }
            this.f1764f = c;
            if (this.f1762d != null) {
                this.f1762d.setVisibility(8);
            }
            if (this.f1763e != null) {
                this.f1763e.setVisibility(8);
                this.f1763e.setImageDrawable((Drawable) null);
                return;
            }
            return;
        }
        if (this.f1764f != null) {
            removeView(this.f1764f);
            this.f1764f = null;
        }
        Drawable a = aVar.mo3227a();
        CharSequence b = aVar.mo3228b();
        if (a != null) {
            if (this.f1763e == null) {
                AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                appCompatImageView.setLayoutParams(layoutParams);
                addView(appCompatImageView, 0);
                this.f1763e = appCompatImageView;
            }
            this.f1763e.setImageDrawable(a);
            this.f1763e.setVisibility(0);
        } else if (this.f1763e != null) {
            this.f1763e.setVisibility(8);
            this.f1763e.setImageDrawable((Drawable) null);
        }
        boolean z = !TextUtils.isEmpty(b);
        if (z) {
            if (this.f1762d == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C0188b.actionBarTabTextStyle);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 16;
                appCompatTextView.setLayoutParams(layoutParams2);
                addView(appCompatTextView);
                this.f1762d = appCompatTextView;
            }
            this.f1762d.setText(b);
            this.f1762d.setVisibility(0);
        } else if (this.f1762d != null) {
            this.f1762d.setVisibility(8);
            this.f1762d.setText((CharSequence) null);
        }
        if (this.f1763e != null) {
            this.f1763e.setContentDescription(aVar.mo3230d());
        }
        if (!z) {
            charSequence = aVar.mo3230d();
        }
        C0417dm.m1368a(this, charSequence);
    }

    /* renamed from: a */
    public final C0198a mo4499a() {
        return this.f1761c;
    }

    /* renamed from: a */
    public final void mo4500a(C0198a aVar) {
        this.f1761c = aVar;
        m1279b();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0198a.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0198a.class.getName());
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1759a.f1749c > 0 && getMeasuredWidth() > this.f1759a.f1749c) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f1759a.f1749c, 1073741824), i2);
        }
    }

    public final void setSelected(boolean z) {
        boolean z2 = isSelected() != z;
        super.setSelected(z);
        if (z2 && z) {
            sendAccessibilityEvent(4);
        }
    }
}
