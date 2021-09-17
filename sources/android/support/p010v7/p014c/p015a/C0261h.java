package android.support.p010v7.p014c.p015a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.support.p007v4.graphics.drawable.DrawableCompat;

/* renamed from: android.support.v7.c.a.h */
class C0261h extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private C0264k f864a;

    /* renamed from: b */
    private Rect f865b;

    /* renamed from: c */
    private Drawable f866c;

    /* renamed from: d */
    private Drawable f867d;

    /* renamed from: e */
    private int f868e = 255;

    /* renamed from: f */
    private boolean f869f;

    /* renamed from: g */
    private int f870g = -1;

    /* renamed from: h */
    private int f871h = -1;

    /* renamed from: i */
    private boolean f872i;

    /* renamed from: j */
    private Runnable f873j;

    /* renamed from: k */
    private long f874k;

    /* renamed from: l */
    private long f875l;

    /* renamed from: m */
    private C0263j f876m;

    C0261h() {
    }

    /* renamed from: a */
    static int m451a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    private void m452a(Drawable drawable) {
        if (this.f876m == null) {
            this.f876m = new C0263j();
        }
        drawable.setCallback(this.f876m.mo3394a(drawable.getCallback()));
        try {
            if (this.f864a.f881C <= 0 && this.f869f) {
                drawable.setAlpha(this.f868e);
            }
            if (this.f864a.f885G) {
                drawable.setColorFilter(this.f864a.f884F);
            } else {
                if (this.f864a.f888J) {
                    DrawableCompat.setTintList(drawable, this.f864a.f886H);
                }
                if (this.f864a.f889K) {
                    DrawableCompat.setTintMode(drawable, this.f864a.f887I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f864a.f913z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f864a.f883E);
            }
            Rect rect = this.f865b;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f876m.mo3393a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3385a(Resources resources) {
        this.f864a.mo3400a(resources);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3336a(C0264k kVar) {
        this.f864a = kVar;
        if (this.f870g >= 0) {
            this.f866c = kVar.mo3401b(this.f870g);
            if (this.f866c != null) {
                m452a(this.f866c);
            }
        }
        this.f871h = -1;
        this.f867d = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3386a(boolean r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f869f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r11.f866c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003e
            long r9 = r11.f874k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0040
            long r9 = r11.f874k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0024
            android.graphics.drawable.Drawable r3 = r11.f866c
            int r9 = r11.f868e
            r3.setAlpha(r9)
            goto L_0x003e
        L_0x0024:
            long r9 = r11.f874k
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            android.support.v7.c.a.k r9 = r11.f864a
            int r9 = r9.f881C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r11.f866c
            int r3 = 255 - r3
            int r10 = r11.f868e
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L_0x0041
        L_0x003e:
            r11.f874k = r7
        L_0x0040:
            r3 = 0
        L_0x0041:
            android.graphics.drawable.Drawable r9 = r11.f867d
            if (r9 == 0) goto L_0x0074
            long r9 = r11.f875l
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0076
            long r9 = r11.f875l
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 > 0) goto L_0x005d
            android.graphics.drawable.Drawable r0 = r11.f867d
            r0.setVisible(r6, r6)
            r0 = 0
            r11.f867d = r0
            r0 = -1
            r11.f871h = r0
            goto L_0x0074
        L_0x005d:
            long r6 = r11.f875l
            long r6 = r6 - r1
            long r6 = r6 * r4
            int r3 = (int) r6
            android.support.v7.c.a.k r4 = r11.f864a
            int r4 = r4.f882D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r11.f867d
            int r5 = r11.f868e
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x0077
        L_0x0074:
            r11.f875l = r7
        L_0x0076:
            r0 = r3
        L_0x0077:
            if (r12 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0083
            java.lang.Runnable r12 = r11.f873j
            r3 = 16
            long r1 = r1 + r3
            r11.scheduleSelf(r12, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.p014c.p015a.C0261h.mo3386a(boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3387a(int i) {
        if (i == this.f870g) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f864a.f882D > 0) {
            if (this.f867d != null) {
                this.f867d.setVisible(false, false);
            }
            if (this.f866c != null) {
                this.f867d = this.f866c;
                this.f871h = this.f870g;
                this.f875l = ((long) this.f864a.f882D) + uptimeMillis;
            } else {
                this.f867d = null;
                this.f871h = -1;
                this.f875l = 0;
            }
        } else if (this.f866c != null) {
            this.f866c.setVisible(false, false);
        }
        if (i < 0 || i >= this.f864a.f897j) {
            this.f866c = null;
            this.f870g = -1;
        } else {
            Drawable b = this.f864a.mo3401b(i);
            this.f866c = b;
            this.f870g = i;
            if (b != null) {
                if (this.f864a.f881C > 0) {
                    this.f874k = uptimeMillis + ((long) this.f864a.f881C);
                }
                m452a(b);
            }
        }
        if (!(this.f874k == 0 && this.f875l == 0)) {
            if (this.f873j == null) {
                this.f873j = new C0262i(this);
            } else {
                unscheduleSelf(this.f873j);
            }
            mo3386a(true);
        }
        invalidateSelf();
        return true;
    }

    public void applyTheme(Resources.Theme theme) {
        this.f864a.mo3399a(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0264k mo3338b() {
        return this.f864a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo3388c() {
        return this.f870g;
    }

    public boolean canApplyTheme() {
        return this.f864a.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        if (this.f866c != null) {
            this.f866c.draw(canvas);
        }
        if (this.f867d != null) {
            this.f867d.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f868e;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f864a.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f864a.mo3413j()) {
            return null;
        }
        this.f864a.f893f = getChangingConfigurations();
        return this.f864a;
    }

    public Drawable getCurrent() {
        return this.f866c;
    }

    public void getHotspotBounds(Rect rect) {
        if (this.f865b != null) {
            rect.set(this.f865b);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f864a.f901n) {
            return this.f864a.mo3407e();
        }
        if (this.f866c != null) {
            return this.f866c.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f864a.f901n) {
            return this.f864a.mo3405d();
        }
        if (this.f866c != null) {
            return this.f866c.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f864a.f901n) {
            return this.f864a.mo3409g();
        }
        if (this.f866c != null) {
            return this.f866c.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f864a.f901n) {
            return this.f864a.mo3408f();
        }
        if (this.f866c != null) {
            return this.f866c.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        if (this.f866c == null || !this.f866c.isVisible()) {
            return -2;
        }
        return this.f864a.mo3411h();
    }

    public void getOutline(Outline outline) {
        if (this.f866c != null) {
            this.f866c.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect c = this.f864a.mo3403c();
        boolean z2 = false;
        if (c != null) {
            rect.set(c);
            z = (c.right | ((c.left | c.top) | c.bottom)) != 0;
        } else {
            z = this.f866c != null ? this.f866c.getPadding(rect) : super.getPadding(rect);
        }
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            z2 = true;
        }
        if (z2) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f864a != null) {
            this.f864a.mo3402b();
        }
        if (drawable == this.f866c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f864a.f883E;
    }

    public boolean isStateful() {
        return this.f864a.mo3412i();
    }

    public void jumpToCurrentState() {
        boolean z;
        if (this.f867d != null) {
            this.f867d.jumpToCurrentState();
            this.f867d = null;
            this.f871h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f866c != null) {
            this.f866c.jumpToCurrentState();
            if (this.f869f) {
                this.f866c.setAlpha(this.f868e);
            }
        }
        if (this.f875l != 0) {
            this.f875l = 0;
            z = true;
        }
        if (this.f874k != 0) {
            this.f874k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f872i && super.mutate() == this) {
            C0264k b = mo3338b();
            b.mo3376a();
            mo3336a(b);
            this.f872i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f867d != null) {
            this.f867d.setBounds(rect);
        }
        if (this.f866c != null) {
            this.f866c.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        C0264k kVar = this.f864a;
        int i2 = this.f870g;
        int i3 = kVar.f897j;
        Drawable[] drawableArr = kVar.f896i;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        kVar.f880B = i;
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable;
        if (this.f867d != null) {
            drawable = this.f867d;
        } else if (this.f866c == null) {
            return false;
        } else {
            drawable = this.f866c;
        }
        return drawable.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable;
        if (this.f867d != null) {
            drawable = this.f867d;
        } else if (this.f866c == null) {
            return false;
        } else {
            drawable = this.f866c;
        }
        return drawable.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f866c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f869f || this.f868e != i) {
            this.f869f = true;
            this.f868e = i;
            if (this.f866c == null) {
                return;
            }
            if (this.f874k == 0) {
                this.f866c.setAlpha(i);
            } else {
                mo3386a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f864a.f883E != z) {
            this.f864a.f883E = z;
            if (this.f866c != null) {
                DrawableCompat.setAutoMirrored(this.f866c, this.f864a.f883E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f864a.f885G = true;
        if (this.f864a.f884F != colorFilter) {
            this.f864a.f884F = colorFilter;
            if (this.f866c != null) {
                this.f866c.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f864a.f913z != z) {
            this.f864a.f913z = z;
            if (this.f866c != null) {
                this.f866c.setDither(this.f864a.f913z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f866c != null) {
            DrawableCompat.setHotspot(this.f866c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f865b == null) {
            this.f865b = new Rect(i, i2, i3, i4);
        } else {
            this.f865b.set(i, i2, i3, i4);
        }
        if (this.f866c != null) {
            DrawableCompat.setHotspotBounds(this.f866c, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f864a.f888J = true;
        if (this.f864a.f886H != colorStateList) {
            this.f864a.f886H = colorStateList;
            DrawableCompat.setTintList(this.f866c, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f864a.f889K = true;
        if (this.f864a.f887I != mode) {
            this.f864a.f887I = mode;
            DrawableCompat.setTintMode(this.f866c, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f867d != null) {
            this.f867d.setVisible(z, z2);
        }
        if (this.f866c != null) {
            this.f866c.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f866c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
