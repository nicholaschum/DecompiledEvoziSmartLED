package p021wl.smartled.service;

import java.util.List;
import p021wl.smartled.beans.C0525f;

/* renamed from: wl.smartled.service.t */
final class C0593t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f2672a;

    /* renamed from: b */
    final /* synthetic */ PlayService f2673b;

    C0593t(PlayService playService, List list) {
        this.f2673b = playService;
        this.f2672a = list;
    }

    public final void run() {
        if (this.f2672a != null && !this.f2672a.isEmpty()) {
            this.f2673b.f2598a.addAll(this.f2672a);
            this.f2673b.mo5099k();
            if (this.f2673b.f2606i == null) {
                C0525f unused = this.f2673b.f2606i = (C0525f) this.f2672a.get(this.f2673b.f2607j);
            }
            this.f2673b.f2593A.sendEmptyMessageDelayed(500, 200);
        }
        if (this.f2673b.f2603f != null) {
            this.f2673b.f2603f.mo5035a((List<C0525f>) this.f2672a);
        }
    }
}
