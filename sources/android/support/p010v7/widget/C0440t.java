package android.support.p010v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

/* renamed from: android.support.v7.widget.t */
public final class C0440t implements Comparable<C0440t> {

    /* renamed from: a */
    public final ResolveInfo f1907a;

    /* renamed from: b */
    public float f1908b;

    public C0440t(ResolveInfo resolveInfo) {
        this.f1907a = resolveInfo;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Float.floatToIntBits(((C0440t) obj).f1908b) - Float.floatToIntBits(this.f1908b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Float.floatToIntBits(this.f1908b) == Float.floatToIntBits(((C0440t) obj).f1908b);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f1908b) + 31;
    }

    public final String toString() {
        return "[" + "resolveInfo:" + this.f1907a.toString() + "; weight:" + new BigDecimal((double) this.f1908b) + "]";
    }
}
