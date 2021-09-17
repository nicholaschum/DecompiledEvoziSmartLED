package android.arch.p000a.p002b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: android.arch.a.b.b */
public class C0006b<K, V> implements Iterable<Map.Entry<K, V>> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0009e<K, V> f9a;

    /* renamed from: b */
    private C0009e<K, V> f10b;

    /* renamed from: c */
    private WeakHashMap<C0012h<K, V>, Boolean> f11c = new WeakHashMap<>();

    /* renamed from: d */
    private int f12d = 0;

    /* renamed from: a */
    public final int mo11a() {
        return this.f12d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0009e<K, V> mo6a(K k) {
        C0009e<K, V> eVar = this.f9a;
        while (eVar != null && !eVar.f13a.equals(k)) {
            eVar = eVar.f15c;
        }
        return eVar;
    }

    /* renamed from: a */
    public V mo7a(K k, V v) {
        C0009e a = mo6a(k);
        if (a != null) {
            return a.f14b;
        }
        mo12b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0009e<K, V> mo12b(K k, V v) {
        C0009e<K, V> eVar = new C0009e<>(k, v);
        this.f12d++;
        if (this.f10b == null) {
            this.f9a = eVar;
            this.f10b = this.f9a;
            return eVar;
        }
        this.f10b.f15c = eVar;
        eVar.f16d = this.f10b;
        this.f10b = eVar;
        return eVar;
    }

    /* renamed from: b */
    public V mo8b(K k) {
        C0009e a = mo6a(k);
        if (a == null) {
            return null;
        }
        this.f12d--;
        if (!this.f11c.isEmpty()) {
            for (C0012h<K, V> a_ : this.f11c.keySet()) {
                a_.mo27a_(a);
            }
        }
        if (a.f16d != null) {
            a.f16d.f15c = a.f15c;
        } else {
            this.f9a = a.f15c;
        }
        if (a.f15c != null) {
            a.f15c.f16d = a.f16d;
        } else {
            this.f10b = a.f16d;
        }
        a.f15c = null;
        a.f16d = null;
        return a.f14b;
    }

    /* renamed from: b */
    public final Iterator<Map.Entry<K, V>> mo13b() {
        C0008d dVar = new C0008d(this.f10b, this.f9a);
        this.f11c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* renamed from: c */
    public final C0006b<K, V>.C0010f mo14c() {
        C0010f fVar = new C0010f(this, (byte) 0);
        this.f11c.put(fVar, Boolean.FALSE);
        return fVar;
    }

    /* renamed from: d */
    public final Map.Entry<K, V> mo15d() {
        return this.f9a;
    }

    /* renamed from: e */
    public final Map.Entry<K, V> mo16e() {
        return this.f10b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0006b)) {
            return false;
        }
        C0006b bVar = (C0006b) obj;
        if (this.f12d != bVar.f12d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C0007c cVar = new C0007c(this.f9a, this.f10b);
        this.f11c.put(cVar, Boolean.FALSE);
        return cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
