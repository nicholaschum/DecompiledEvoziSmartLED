package android.arch.p000a.p002b;

import java.util.Map;

/* renamed from: android.arch.a.b.e */
final class C0009e<K, V> implements Map.Entry<K, V> {

    /* renamed from: a */
    final K f13a;

    /* renamed from: b */
    final V f14b;

    /* renamed from: c */
    C0009e<K, V> f15c;

    /* renamed from: d */
    C0009e<K, V> f16d;

    C0009e(K k, V v) {
        this.f13a = k;
        this.f14b = v;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0009e)) {
            return false;
        }
        C0009e eVar = (C0009e) obj;
        return this.f13a.equals(eVar.f13a) && this.f14b.equals(eVar.f14b);
    }

    public final K getKey() {
        return this.f13a;
    }

    public final V getValue() {
        return this.f14b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f13a + "=" + this.f14b;
    }
}
