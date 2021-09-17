package android.arch.p000a.p001a;

import java.util.concurrent.Executor;

/* renamed from: android.arch.a.a.a */
public class C0000a extends C0004e {

    /* renamed from: a */
    private static volatile C0000a f0a;

    /* renamed from: d */
    private static final Executor f1d = new C0001b();

    /* renamed from: e */
    private static final Executor f2e = new C0002c();

    /* renamed from: b */
    private C0004e f3b = this.f4c;

    /* renamed from: c */
    private C0004e f4c = new C0003d();

    private C0000a() {
    }

    /* renamed from: a */
    public static C0000a m0a() {
        if (f0a != null) {
            return f0a;
        }
        synchronized (C0000a.class) {
            if (f0a == null) {
                f0a = new C0000a();
            }
        }
        return f0a;
    }

    /* renamed from: a */
    public final void mo1a(Runnable runnable) {
        this.f3b.mo1a(runnable);
    }

    /* renamed from: b */
    public final void mo2b(Runnable runnable) {
        this.f3b.mo2b(runnable);
    }

    /* renamed from: b */
    public final boolean mo3b() {
        return this.f3b.mo3b();
    }
}
