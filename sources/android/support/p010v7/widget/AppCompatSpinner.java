package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.TintableBackgroundView;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* renamed from: android.support.v7.widget.AppCompatSpinner */
public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* renamed from: d */
    private static final int[] f1378d = {16843505};

    /* renamed from: a */
    C0344au f1379a;

    /* renamed from: b */
    int f1380b;

    /* renamed from: c */
    final Rect f1381c;

    /* renamed from: e */
    private final C0330ag f1382e;

    /* renamed from: f */
    private final Context f1383f;

    /* renamed from: g */
    private C0361bk f1384g;

    /* renamed from: h */
    private SpinnerAdapter f1385h;

    /* renamed from: i */
    private final boolean f1386i;

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (byte) 0);
    }

    private AppCompatSpinner(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r12 != 1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r12 = new android.support.p010v7.widget.C0344au(r8, r8.f1383f, r10, r11);
        r1 = android.support.p010v7.widget.C0407dc.m1308a(r8.f1383f, r10, android.support.p010v7.p011a.C0197k.f417cH, r11, 0);
        r8.f1380b = r1.mo4556f(android.support.p010v7.p011a.C0197k.f421cL, -2);
        r12.mo4137a(r1.mo4545a(android.support.p010v7.p011a.C0197k.f419cJ));
        r12.mo4336a((java.lang.CharSequence) r0.mo4553d(android.support.p010v7.p011a.C0197k.f420cK));
        r1.mo4546a();
        r8.f1379a = r12;
        r8.f1384g = new android.support.p010v7.widget.C0342as(r8, r8, r12);
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1381c = r0
            int[] r0 = android.support.p010v7.p011a.C0197k.f417cH
            r1 = 0
            android.support.v7.widget.dc r0 = android.support.p010v7.widget.C0407dc.m1308a(r9, r10, r0, r11, r1)
            android.support.v7.widget.ag r2 = new android.support.v7.widget.ag
            r2.<init>(r8)
            r8.f1382e = r2
            int r2 = android.support.p010v7.p011a.C0197k.f422cM
            int r2 = r0.mo4558g(r2, r1)
            r3 = 0
            if (r2 == 0) goto L_0x0027
            android.support.v7.view.e r4 = new android.support.v7.view.e
            r4.<init>(r9, r2)
            goto L_0x0030
        L_0x0027:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r2 >= r4) goto L_0x002f
            r4 = r9
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            r8.f1383f = r4
            android.content.Context r2 = r8.f1383f
            r4 = 1
            if (r2 == 0) goto L_0x009f
            int[] r2 = f1378d     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r2, r11, r1)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            boolean r5 = r2.hasValue(r1)     // Catch:{ Exception -> 0x004e }
            if (r5 == 0) goto L_0x0048
            int r5 = r2.getInt(r1, r1)     // Catch:{ Exception -> 0x004e }
            r12 = r5
        L_0x0048:
            if (r2 == 0) goto L_0x005f
        L_0x004a:
            r2.recycle()
            goto L_0x005f
        L_0x004e:
            r5 = move-exception
            goto L_0x0055
        L_0x0050:
            r9 = move-exception
            r2 = r3
            goto L_0x0099
        L_0x0053:
            r5 = move-exception
            r2 = r3
        L_0x0055:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x005f
            goto L_0x004a
        L_0x005f:
            if (r12 != r4) goto L_0x009f
            android.support.v7.widget.au r12 = new android.support.v7.widget.au
            android.content.Context r2 = r8.f1383f
            r12.<init>(r8, r2, r10, r11)
            android.content.Context r2 = r8.f1383f
            int[] r5 = android.support.p010v7.p011a.C0197k.f417cH
            android.support.v7.widget.dc r1 = android.support.p010v7.widget.C0407dc.m1308a(r2, r10, r5, r11, r1)
            int r2 = android.support.p010v7.p011a.C0197k.f421cL
            r5 = -2
            int r2 = r1.mo4556f(r2, r5)
            r8.f1380b = r2
            int r2 = android.support.p010v7.p011a.C0197k.f419cJ
            android.graphics.drawable.Drawable r2 = r1.mo4545a(r2)
            r12.mo4137a((android.graphics.drawable.Drawable) r2)
            int r2 = android.support.p010v7.p011a.C0197k.f420cK
            java.lang.String r2 = r0.mo4553d(r2)
            r12.mo4336a((java.lang.CharSequence) r2)
            r1.mo4546a()
            r8.f1379a = r12
            android.support.v7.widget.as r1 = new android.support.v7.widget.as
            r1.<init>(r8, r8, r12)
            r8.f1384g = r1
            goto L_0x009f
        L_0x0098:
            r9 = move-exception
        L_0x0099:
            if (r2 == 0) goto L_0x009e
            r2.recycle()
        L_0x009e:
            throw r9
        L_0x009f:
            int r12 = android.support.p010v7.p011a.C0197k.f418cI
            java.lang.CharSequence[] r12 = r0.mo4559g(r12)
            if (r12 == 0) goto L_0x00b7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r9, r2, r12)
            int r9 = android.support.p010v7.p011a.C0194h.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00b7:
            r0.mo4546a()
            r8.f1386i = r4
            android.widget.SpinnerAdapter r9 = r8.f1385h
            if (r9 == 0) goto L_0x00c7
            android.widget.SpinnerAdapter r9 = r8.f1385h
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.f1385h = r3
        L_0x00c7:
            android.support.v7.widget.ag r9 = r8.f1382e
            r9.mo4291a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo4068a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1381c);
        return i2 + this.f1381c.left + this.f1381c.right;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1382e != null) {
            this.f1382e.mo4294d();
        }
    }

    public int getDropDownHorizontalOffset() {
        if (this.f1379a != null) {
            return this.f1379a.mo4150l();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        if (this.f1379a != null) {
            return this.f1379a.mo4151m();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1379a != null) {
            return this.f1380b;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        if (this.f1379a != null) {
            return this.f1379a.f1437g.getBackground();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        if (this.f1379a != null) {
            return this.f1383f;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getPopupContext();
        }
        return null;
    }

    public CharSequence getPrompt() {
        return this.f1379a != null ? this.f1379a.mo4338b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1382e != null) {
            return this.f1382e.mo4292b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1382e != null) {
            return this.f1382e.mo4293c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1379a != null && this.f1379a.mo3741d()) {
            this.f1379a.mo3740c();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1379a != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo4068a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1384g == null || !this.f1384g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        if (this.f1379a == null) {
            return super.performClick();
        }
        if (this.f1379a.mo3741d()) {
            return true;
        }
        this.f1379a.mo3739a();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1386i) {
            this.f1385h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1379a != null) {
            this.f1379a.mo4139a((ListAdapter) new C0343at(spinnerAdapter, (this.f1383f == null ? getContext() : this.f1383f).getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1382e != null) {
            this.f1382e.mo4287a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1382e != null) {
            this.f1382e.mo4288a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        if (this.f1379a != null) {
            this.f1379a.mo4135a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        if (this.f1379a != null) {
            this.f1379a.mo4141b(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1379a != null) {
            this.f1380b = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f1379a != null) {
            this.f1379a.mo4137a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0252a.m419b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        if (this.f1379a != null) {
            this.f1379a.mo4336a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1382e != null) {
            this.f1382e.mo4289a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1382e != null) {
            this.f1382e.mo4290a(mode);
        }
    }
}
