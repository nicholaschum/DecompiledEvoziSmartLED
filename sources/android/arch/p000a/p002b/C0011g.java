package android.arch.p000a.p002b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.a.b.g */
abstract class C0011g<K, V> implements C0012h<K, V>, Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    C0009e<K, V> f20a;

    /* renamed from: b */
    C0009e<K, V> f21b;

    C0011g(C0009e<K, V> eVar, C0009e<K, V> eVar2) {
        this.f20a = eVar2;
        this.f21b = eVar;
    }

    /* renamed from: a */
    private C0009e<K, V> m30a() {
        if (this.f21b == this.f20a || this.f20a == null) {
            return null;
        }
        return mo20a(this.f21b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C0009e<K, V> mo20a(C0009e<K, V> eVar);

    /* renamed from: a_ */
    public final void mo27a_(C0009e<K, V> eVar) {
        if (this.f20a == eVar && eVar == this.f21b) {
            this.f21b = null;
            this.f20a = null;
        }
        if (this.f20a == eVar) {
            this.f20a = mo21b(this.f20a);
        }
        if (this.f21b == eVar) {
            this.f21b = m30a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract C0009e<K, V> mo21b(C0009e<K, V> eVar);

    public boolean hasNext() {
        return this.f21b != null;
    }

    public /* synthetic */ Object next() {
        C0009e<K, V> eVar = this.f21b;
        this.f21b = m30a();
        return eVar;
    }
}
