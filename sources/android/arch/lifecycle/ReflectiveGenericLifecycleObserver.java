package android.arch.lifecycle;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {

    /* renamed from: a */
    private final Object f26a;

    /* renamed from: b */
    private final C0016b f27b = C0013a.f30a.mo55b(this.f26a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f26a = obj;
    }

    /* renamed from: a */
    public final void mo32a(C0024j jVar, C0021g gVar) {
        this.f27b.mo60a(jVar, gVar, this.f26a);
    }
}
