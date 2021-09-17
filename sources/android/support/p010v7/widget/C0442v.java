package android.support.p010v7.widget;

import android.content.ComponentName;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v7.widget.v */
final class C0442v implements C0441u {

    /* renamed from: a */
    private final Map<ComponentName, C0440t> f1909a = new HashMap();

    C0442v() {
    }

    /* renamed from: a */
    public final void mo4598a(List<C0440t> list, List<C0443w> list2) {
        Map<ComponentName, C0440t> map = this.f1909a;
        map.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C0440t tVar = list.get(i);
            tVar.f1908b = 0.0f;
            map.put(new ComponentName(tVar.f1907a.activityInfo.packageName, tVar.f1907a.activityInfo.name), tVar);
        }
        float f = 1.0f;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C0443w wVar = list2.get(size2);
            C0440t tVar2 = map.get(wVar.f1910a);
            if (tVar2 != null) {
                tVar2.f1908b += wVar.f1912c * f;
                f *= 0.95f;
            }
        }
        Collections.sort(list);
    }
}
