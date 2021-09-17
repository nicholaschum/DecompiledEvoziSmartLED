package android.support.p010v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p007v4.view.PointerIconCompat;
import android.support.p010v7.p011a.C0191e;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0196j;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.dq */
final class C0421dq {

    /* renamed from: a */
    private final Context f1869a;

    /* renamed from: b */
    private final View f1870b;

    /* renamed from: c */
    private final TextView f1871c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1872d = new WindowManager.LayoutParams();

    /* renamed from: e */
    private final Rect f1873e = new Rect();

    /* renamed from: f */
    private final int[] f1874f = new int[2];

    /* renamed from: g */
    private final int[] f1875g = new int[2];

    C0421dq(Context context) {
        this.f1869a = context;
        this.f1870b = LayoutInflater.from(this.f1869a).inflate(C0194h.abc_tooltip, (ViewGroup) null);
        this.f1871c = (TextView) this.f1870b.findViewById(C0193g.message);
        this.f1872d.setTitle(getClass().getSimpleName());
        this.f1872d.packageName = this.f1869a.getPackageName();
        this.f1872d.type = PointerIconCompat.TYPE_HAND;
        this.f1872d.width = -2;
        this.f1872d.height = -2;
        this.f1872d.format = -3;
        this.f1872d.windowAnimations = C0196j.Animation_AppCompat_Tooltip;
        this.f1872d.flags = 24;
    }

    /* renamed from: b */
    private boolean m1376b() {
        return this.f1870b.getParent() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4576a() {
        if (m1376b()) {
            ((WindowManager) this.f1869a.getSystemService("window")).removeView(this.f1870b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4577a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        int i3;
        int i4;
        if (m1376b()) {
            mo4576a();
        }
        this.f1871c.setText(charSequence);
        WindowManager.LayoutParams layoutParams = this.f1872d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1869a.getResources().getDimensionPixelOffset(C0191e.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1869a.getResources().getDimensionPixelOffset(C0191e.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1869a.getResources().getDimensionPixelOffset(z ? C0191e.tooltip_y_offset_touch : C0191e.tooltip_y_offset_non_touch);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(this.f1873e);
            if (this.f1873e.left < 0 && this.f1873e.top < 0) {
                Resources resources = this.f1869a.getResources();
                int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                this.f1873e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen(this.f1875g);
            view.getLocationOnScreen(this.f1874f);
            int[] iArr = this.f1874f;
            iArr[0] = iArr[0] - this.f1875g[0];
            int[] iArr2 = this.f1874f;
            iArr2[1] = iArr2[1] - this.f1875g[1];
            layoutParams.x = (this.f1874f[0] + i) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.f1870b.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = this.f1870b.getMeasuredHeight();
            int i5 = ((this.f1874f[1] + i3) - dimensionPixelOffset3) - measuredHeight;
            int i6 = this.f1874f[1] + i4 + dimensionPixelOffset3;
            if (!z ? measuredHeight + i6 > this.f1873e.height() : i5 >= 0) {
                layoutParams.y = i5;
            } else {
                layoutParams.y = i6;
            }
        }
        ((WindowManager) this.f1869a.getSystemService("window")).addView(this.f1870b, this.f1872d);
    }
}
