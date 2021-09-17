package android.support.p010v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

/* renamed from: android.support.v7.widget.w */
public final class C0443w {

    /* renamed from: a */
    public final ComponentName f1910a;

    /* renamed from: b */
    public final long f1911b;

    /* renamed from: c */
    public final float f1912c;

    public C0443w(ComponentName componentName, long j, float f) {
        this.f1910a = componentName;
        this.f1911b = j;
        this.f1912c = f;
    }

    public C0443w(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0443w wVar = (C0443w) obj;
        if (this.f1910a == null) {
            if (wVar.f1910a != null) {
                return false;
            }
        } else if (!this.f1910a.equals(wVar.f1910a)) {
            return false;
        }
        return this.f1911b == wVar.f1911b && Float.floatToIntBits(this.f1912c) == Float.floatToIntBits(wVar.f1912c);
    }

    public final int hashCode() {
        return (((((this.f1910a == null ? 0 : this.f1910a.hashCode()) + 31) * 31) + ((int) (this.f1911b ^ (this.f1911b >>> 32)))) * 31) + Float.floatToIntBits(this.f1912c);
    }

    public final String toString() {
        return "[" + "; activity:" + this.f1910a + "; time:" + this.f1911b + "; weight:" + new BigDecimal((double) this.f1912c) + "]";
    }
}
