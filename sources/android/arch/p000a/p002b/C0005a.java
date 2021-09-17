package android.arch.p000a.p002b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: android.arch.a.b.a */
public final class C0005a<K, V> extends C0006b<K, V> {

    /* renamed from: a */
    private HashMap<K, C0009e<K, V>> f8a = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0009e<K, V> mo6a(K k) {
        return this.f8a.get(k);
    }

    /* renamed from: a */
    public final V mo7a(K k, V v) {
        C0009e a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        this.f8a.put(k, mo12b(k, v));
        return null;
    }

    /* renamed from: b */
    public final V mo8b(K k) {
        V b = super.mo8b(k);
        this.f8a.remove(k);
        return b;
    }

    /* renamed from: c */
    public final boolean mo9c(K k) {
        return this.f8a.containsKey(k);
    }

    /* renamed from: d */
    public final Map.Entry<K, V> mo10d(K k) {
        if (mo9c(k)) {
            return this.f8a.get(k).f16d;
        }
        return null;
    }
}
