package android.arch.p000a.p002b;

import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.a.b.f */
final class C0010f implements C0012h<K, V>, Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    final /* synthetic */ C0006b f17a;

    /* renamed from: b */
    private C0009e<K, V> f18b;

    /* renamed from: c */
    private boolean f19c;

    private C0010f(C0006b bVar) {
        this.f17a = bVar;
        this.f19c = true;
    }

    /* synthetic */ C0010f(C0006b bVar, byte b) {
        this(bVar);
    }

    /* renamed from: a_ */
    public final void mo27a_(C0009e<K, V> eVar) {
        if (eVar == this.f18b) {
            this.f18b = this.f18b.f16d;
            this.f19c = this.f18b == null;
        }
    }

    public final boolean hasNext() {
        return this.f19c ? this.f17a.f9a != null : (this.f18b == null || this.f18b.f15c == null) ? false : true;
    }

    public final /* synthetic */ Object next() {
        C0009e<K, V> eVar;
        if (this.f19c) {
            this.f19c = false;
            eVar = this.f17a.f9a;
        } else {
            eVar = this.f18b != null ? this.f18b.f15c : null;
        }
        this.f18b = eVar;
        return this.f18b;
    }
}
