package android.arch.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.b */
final class C0016b {

    /* renamed from: a */
    final Map<C0021g, List<C0017c>> f34a = new HashMap();

    /* renamed from: b */
    final Map<C0017c, C0021g> f35b;

    C0016b(Map<C0017c, C0021g> map) {
        this.f35b = map;
        for (Map.Entry next : map.entrySet()) {
            C0021g gVar = (C0021g) next.getValue();
            List list = this.f34a.get(gVar);
            if (list == null) {
                list = new ArrayList();
                this.f34a.put(gVar, list);
            }
            list.add(next.getKey());
        }
    }

    /* renamed from: a */
    private static void m54a(List<C0017c> list, C0024j jVar, C0021g gVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                list.get(size).mo61a(jVar, gVar, obj);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo60a(C0024j jVar, C0021g gVar, Object obj) {
        m54a(this.f34a.get(gVar), jVar, gVar, obj);
        m54a(this.f34a.get(C0021g.ON_ANY), jVar, gVar, obj);
    }
}
