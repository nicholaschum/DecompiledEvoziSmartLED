package android.arch.p000a.p001a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: android.arch.a.a.d */
public final class C0003d extends C0004e {

    /* renamed from: a */
    private final Object f5a = new Object();

    /* renamed from: b */
    private ExecutorService f6b = Executors.newFixedThreadPool(2);

    /* renamed from: c */
    private volatile Handler f7c;

    /* renamed from: a */
    public final void mo1a(Runnable runnable) {
        this.f6b.execute(runnable);
    }

    /* renamed from: b */
    public final void mo2b(Runnable runnable) {
        if (this.f7c == null) {
            synchronized (this.f5a) {
                if (this.f7c == null) {
                    this.f7c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f7c.post(runnable);
    }

    /* renamed from: b */
    public final boolean mo3b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
