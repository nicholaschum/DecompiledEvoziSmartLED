package android.support.p010v7.widget;

import android.support.p007v4.widget.ExploreByTouchHelper;

/* renamed from: android.support.v7.widget.by */
final class C0375by {

    /* renamed from: a */
    private int f1738a = 0;

    /* renamed from: b */
    private int f1739b = 0;

    /* renamed from: c */
    private int f1740c = ExploreByTouchHelper.INVALID_ID;

    /* renamed from: d */
    private int f1741d = ExploreByTouchHelper.INVALID_ID;

    /* renamed from: e */
    private int f1742e = 0;

    /* renamed from: f */
    private int f1743f = 0;

    /* renamed from: g */
    private boolean f1744g = false;

    /* renamed from: h */
    private boolean f1745h = false;

    C0375by() {
    }

    /* renamed from: a */
    public final int mo4479a() {
        return this.f1744g ? this.f1739b : this.f1738a;
    }

    /* renamed from: a */
    public final void mo4480a(int i, int i2) {
        this.f1740c = i;
        this.f1741d = i2;
        this.f1745h = true;
        if (this.f1744g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1738a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1739b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1738a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1739b = i2;
        }
    }

    /* renamed from: a */
    public final void mo4481a(boolean z) {
        if (z != this.f1744g) {
            this.f1744g = z;
            if (!this.f1745h) {
                this.f1738a = this.f1742e;
                this.f1739b = this.f1743f;
            } else if (z) {
                this.f1738a = this.f1741d != Integer.MIN_VALUE ? this.f1741d : this.f1742e;
                this.f1739b = this.f1740c != Integer.MIN_VALUE ? this.f1740c : this.f1743f;
            } else {
                this.f1738a = this.f1740c != Integer.MIN_VALUE ? this.f1740c : this.f1742e;
                this.f1739b = this.f1741d != Integer.MIN_VALUE ? this.f1741d : this.f1743f;
            }
        }
    }

    /* renamed from: b */
    public final int mo4482b() {
        return this.f1744g ? this.f1738a : this.f1739b;
    }

    /* renamed from: b */
    public final void mo4483b(int i, int i2) {
        this.f1745h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1742e = i;
            this.f1738a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1743f = i2;
            this.f1739b = i2;
        }
    }
}
