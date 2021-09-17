package p021wl.smartled.p024c;

/* renamed from: wl.smartled.c.c */
public class C0530c {

    /* renamed from: d */
    private static C0530c f2374d;

    /* renamed from: a */
    private boolean f2375a = true;

    /* renamed from: b */
    private boolean f2376b = true;

    /* renamed from: c */
    private boolean f2377c = true;

    private C0530c() {
    }

    /* renamed from: a */
    public static C0530c m1816a() {
        if (f2374d == null) {
            synchronized (C0530c.class) {
                if (f2374d == null) {
                    f2374d = new C0530c();
                }
            }
        }
        return f2374d;
    }

    /* renamed from: a */
    public final void mo4944a(boolean z) {
        this.f2375a = z;
    }

    /* renamed from: b */
    public final void mo4945b(boolean z) {
        this.f2376b = z;
    }

    /* renamed from: b */
    public final boolean mo4946b() {
        return this.f2375a;
    }

    /* renamed from: c */
    public final void mo4947c(boolean z) {
        this.f2377c = z;
    }

    /* renamed from: c */
    public final boolean mo4948c() {
        return this.f2376b;
    }

    /* renamed from: d */
    public final boolean mo4949d() {
        return this.f2377c;
    }
}
