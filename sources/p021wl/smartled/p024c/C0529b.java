package p021wl.smartled.p024c;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p021wl.smartled.beans.C0525f;

/* renamed from: wl.smartled.c.b */
public class C0529b {

    /* renamed from: a */
    private static C0529b f2372a;

    /* renamed from: b */
    private List<C0525f> f2373b = new CopyOnWriteArrayList();

    private C0529b() {
    }

    /* renamed from: a */
    public static C0529b m1814a() {
        if (f2372a == null) {
            synchronized (C0529b.class) {
                if (f2372a == null) {
                    f2372a = new C0529b();
                }
            }
        }
        return f2372a;
    }

    /* renamed from: b */
    public final List<C0525f> mo4943b() {
        return this.f2373b;
    }
}
