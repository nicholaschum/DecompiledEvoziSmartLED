package android.support.p010v7.p014c.p015a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p007v4.util.LongSparseArray;
import android.support.p007v4.util.SparseArrayCompat;
import android.util.StateSet;

/* renamed from: android.support.v7.c.a.c */
final class C0256c extends C0268o {

    /* renamed from: a */
    LongSparseArray<Long> f856a;

    /* renamed from: b */
    SparseArrayCompat<Integer> f857b;

    C0256c(C0256c cVar, C0254a aVar, Resources resources) {
        super(cVar, aVar, resources);
        SparseArrayCompat<Integer> sparseArrayCompat;
        if (cVar != null) {
            this.f856a = cVar.f856a;
            sparseArrayCompat = cVar.f857b;
        } else {
            this.f856a = new LongSparseArray<>();
            sparseArrayCompat = new SparseArrayCompat<>();
        }
        this.f857b = sparseArrayCompat;
    }

    /* renamed from: e */
    private static long m431e(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3372a(int i) {
        if (i < 0) {
            return 0;
        }
        return this.f857b.get(i, 0).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3373a(int i, int i2) {
        return (int) this.f856a.get(m431e(i, i2), -1L).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3374a(int i, int i2, Drawable drawable, boolean z) {
        int a = super.mo3398a(drawable);
        long e = m431e(i, i2);
        long j = z ? 8589934592L : 0;
        long j2 = (long) a;
        this.f856a.append(e, Long.valueOf(j2 | j));
        if (z) {
            this.f856a.append(m431e(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3375a(int[] iArr) {
        int b = super.mo3455b(iArr);
        return b >= 0 ? b : super.mo3455b(StateSet.WILD_CARD);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3376a() {
        this.f856a = this.f856a.clone();
        this.f857b = this.f857b.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo3377b(int i, int i2) {
        return (this.f856a.get(m431e(i, i2), -1L).longValue() & 4294967296L) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo3378c(int i, int i2) {
        return (this.f856a.get(m431e(i, i2), -1L).longValue() & 8589934592L) != 0;
    }

    public final Drawable newDrawable() {
        return new C0254a(this, (Resources) null);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C0254a(this, resources);
    }
}
