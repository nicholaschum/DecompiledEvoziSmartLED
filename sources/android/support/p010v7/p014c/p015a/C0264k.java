package android.support.p010v7.p014c.p015a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: android.support.v7.c.a.k */
abstract class C0264k extends Drawable.ConstantState {

    /* renamed from: A */
    boolean f879A;

    /* renamed from: B */
    int f880B;

    /* renamed from: C */
    int f881C;

    /* renamed from: D */
    int f882D;

    /* renamed from: E */
    boolean f883E;

    /* renamed from: F */
    ColorFilter f884F;

    /* renamed from: G */
    boolean f885G;

    /* renamed from: H */
    ColorStateList f886H;

    /* renamed from: I */
    PorterDuff.Mode f887I;

    /* renamed from: J */
    boolean f888J;

    /* renamed from: K */
    boolean f889K;

    /* renamed from: c */
    final C0261h f890c;

    /* renamed from: d */
    Resources f891d;

    /* renamed from: e */
    int f892e = 160;

    /* renamed from: f */
    int f893f;

    /* renamed from: g */
    int f894g;

    /* renamed from: h */
    SparseArray<Drawable.ConstantState> f895h;

    /* renamed from: i */
    Drawable[] f896i;

    /* renamed from: j */
    int f897j;

    /* renamed from: k */
    boolean f898k;

    /* renamed from: l */
    boolean f899l;

    /* renamed from: m */
    Rect f900m;

    /* renamed from: n */
    boolean f901n;

    /* renamed from: o */
    boolean f902o;

    /* renamed from: p */
    int f903p;

    /* renamed from: q */
    int f904q;

    /* renamed from: r */
    int f905r;

    /* renamed from: s */
    int f906s;

    /* renamed from: t */
    boolean f907t;

    /* renamed from: u */
    int f908u;

    /* renamed from: v */
    boolean f909v;

    /* renamed from: w */
    boolean f910w;

    /* renamed from: x */
    boolean f911x;

    /* renamed from: y */
    boolean f912y;

    /* renamed from: z */
    boolean f913z;

    C0264k(C0264k kVar, C0261h hVar, Resources resources) {
        this.f898k = false;
        this.f901n = false;
        this.f913z = true;
        this.f881C = 0;
        this.f882D = 0;
        this.f890c = hVar;
        this.f891d = resources != null ? resources : kVar != null ? kVar.f891d : null;
        this.f892e = C0261h.m451a(resources, kVar != null ? kVar.f892e : 0);
        if (kVar != null) {
            this.f893f = kVar.f893f;
            this.f894g = kVar.f894g;
            this.f911x = true;
            this.f912y = true;
            this.f898k = kVar.f898k;
            this.f901n = kVar.f901n;
            this.f913z = kVar.f913z;
            this.f879A = kVar.f879A;
            this.f880B = kVar.f880B;
            this.f881C = kVar.f881C;
            this.f882D = kVar.f882D;
            this.f883E = kVar.f883E;
            this.f884F = kVar.f884F;
            this.f885G = kVar.f885G;
            this.f886H = kVar.f886H;
            this.f887I = kVar.f887I;
            this.f888J = kVar.f888J;
            this.f889K = kVar.f889K;
            if (kVar.f892e == this.f892e) {
                if (kVar.f899l) {
                    this.f900m = new Rect(kVar.f900m);
                    this.f899l = true;
                }
                if (kVar.f902o) {
                    this.f903p = kVar.f903p;
                    this.f904q = kVar.f904q;
                    this.f905r = kVar.f905r;
                    this.f906s = kVar.f906s;
                    this.f902o = true;
                }
            }
            if (kVar.f907t) {
                this.f908u = kVar.f908u;
                this.f907t = true;
            }
            if (kVar.f909v) {
                this.f910w = kVar.f910w;
                this.f909v = true;
            }
            Drawable[] drawableArr = kVar.f896i;
            this.f896i = new Drawable[drawableArr.length];
            this.f897j = kVar.f897j;
            SparseArray<Drawable.ConstantState> sparseArray = kVar.f895h;
            this.f895h = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f897j);
            int i = this.f897j;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f895h.put(i2, constantState);
                    } else {
                        this.f896i[i2] = drawableArr[i2];
                    }
                }
            }
            return;
        }
        this.f896i = new Drawable[10];
        this.f897j = 0;
    }

    /* renamed from: b */
    private Drawable m461b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.setLayoutDirection(this.f880B);
        }
        Drawable mutate = drawable.mutate();
        mutate.setCallback(this.f890c);
        return mutate;
    }

    /* renamed from: k */
    private void m462k() {
        if (this.f895h != null) {
            int size = this.f895h.size();
            for (int i = 0; i < size; i++) {
                this.f896i[this.f895h.keyAt(i)] = m461b(this.f895h.valueAt(i).newDrawable(this.f891d));
            }
            this.f895h = null;
        }
    }

    /* renamed from: l */
    private void m463l() {
        this.f902o = true;
        m462k();
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        this.f904q = -1;
        this.f903p = -1;
        this.f906s = 0;
        this.f905r = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f903p) {
                this.f903p = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f904q) {
                this.f904q = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f905r) {
                this.f905r = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f906s) {
                this.f906s = minimumHeight;
            }
        }
    }

    /* renamed from: a */
    public final int mo3398a(Drawable drawable) {
        int i = this.f897j;
        if (i >= this.f896i.length) {
            mo3406d(i, i + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f890c);
        this.f896i[i] = drawable;
        this.f897j++;
        this.f894g = drawable.getChangingConfigurations() | this.f894g;
        mo3402b();
        this.f900m = null;
        this.f899l = false;
        this.f902o = false;
        this.f911x = false;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3376a() {
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2] != null) {
                drawableArr[i2].mutate();
            }
        }
        this.f879A = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3399a(Resources.Theme theme) {
        if (theme != null) {
            m462k();
            int i = this.f897j;
            Drawable[] drawableArr = this.f896i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    this.f894g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            mo3400a(theme.getResources());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3400a(Resources resources) {
        if (resources != null) {
            this.f891d = resources;
            int a = C0261h.m451a(resources, this.f892e);
            int i = this.f892e;
            this.f892e = a;
            if (i != a) {
                this.f902o = false;
                this.f899l = false;
            }
        }
    }

    /* renamed from: b */
    public final Drawable mo3401b(int i) {
        int indexOfKey;
        Drawable drawable = this.f896i[i];
        if (drawable != null) {
            return drawable;
        }
        if (this.f895h == null || (indexOfKey = this.f895h.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable b = m461b(this.f895h.valueAt(indexOfKey).newDrawable(this.f891d));
        this.f896i[i] = b;
        this.f895h.removeAt(indexOfKey);
        if (this.f895h.size() == 0) {
            this.f895h = null;
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3402b() {
        this.f907t = false;
        this.f909v = false;
    }

    /* renamed from: c */
    public final Rect mo3403c() {
        if (this.f898k) {
            return null;
        }
        if (this.f900m != null || this.f899l) {
            return this.f900m;
        }
        m462k();
        Rect rect = new Rect();
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        Rect rect2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getPadding(rect)) {
                if (rect2 == null) {
                    rect2 = new Rect(0, 0, 0, 0);
                }
                if (rect.left > rect2.left) {
                    rect2.left = rect.left;
                }
                if (rect.top > rect2.top) {
                    rect2.top = rect.top;
                }
                if (rect.right > rect2.right) {
                    rect2.right = rect.right;
                }
                if (rect.bottom > rect2.bottom) {
                    rect2.bottom = rect.bottom;
                }
            }
        }
        this.f899l = true;
        this.f900m = rect2;
        return rect2;
    }

    public boolean canApplyTheme() {
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = this.f895h.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final int mo3405d() {
        if (!this.f902o) {
            m463l();
        }
        return this.f903p;
    }

    /* renamed from: d */
    public void mo3406d(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        System.arraycopy(this.f896i, 0, drawableArr, 0, i);
        this.f896i = drawableArr;
    }

    /* renamed from: e */
    public final int mo3407e() {
        if (!this.f902o) {
            m463l();
        }
        return this.f904q;
    }

    /* renamed from: f */
    public final int mo3408f() {
        if (!this.f902o) {
            m463l();
        }
        return this.f905r;
    }

    /* renamed from: g */
    public final int mo3409g() {
        if (!this.f902o) {
            m463l();
        }
        return this.f906s;
    }

    public int getChangingConfigurations() {
        return this.f893f | this.f894g;
    }

    /* renamed from: h */
    public final int mo3411h() {
        if (this.f907t) {
            return this.f908u;
        }
        m462k();
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        this.f908u = opacity;
        this.f907t = true;
        return opacity;
    }

    /* renamed from: i */
    public final boolean mo3412i() {
        if (this.f909v) {
            return this.f910w;
        }
        m462k();
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        this.f910w = z;
        this.f909v = true;
        return z;
    }

    /* renamed from: j */
    public final synchronized boolean mo3413j() {
        if (this.f911x) {
            return this.f912y;
        }
        m462k();
        this.f911x = true;
        int i = this.f897j;
        Drawable[] drawableArr = this.f896i;
        for (int i2 = 0; i2 < i; i2++) {
            if (drawableArr[i2].getConstantState() == null) {
                this.f912y = false;
                return false;
            }
        }
        this.f912y = true;
        return true;
    }
}
