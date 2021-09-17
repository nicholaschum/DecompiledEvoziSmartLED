package android.support.p010v7.p014c.p015a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: android.support.v7.c.a.o */
class C0268o extends C0264k {

    /* renamed from: L */
    int[][] f930L;

    C0268o(C0268o oVar, C0267n nVar, Resources resources) {
        super(oVar, nVar, resources);
        this.f930L = oVar != null ? oVar.f930L : new int[this.f896i.length][];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3376a() {
        int[][] iArr = new int[this.f930L.length][];
        for (int length = this.f930L.length - 1; length >= 0; length--) {
            iArr[length] = this.f930L[length] != null ? (int[]) this.f930L[length].clone() : null;
        }
        this.f930L = iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo3455b(int[] iArr) {
        int[][] iArr2 = this.f930L;
        int i = this.f897j;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final void mo3406d(int i, int i2) {
        super.mo3406d(i, i2);
        int[][] iArr = new int[i2][];
        System.arraycopy(this.f930L, 0, iArr, 0, i);
        this.f930L = iArr;
    }

    public Drawable newDrawable() {
        return new C0267n(this, (Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new C0267n(this, resources);
    }
}
