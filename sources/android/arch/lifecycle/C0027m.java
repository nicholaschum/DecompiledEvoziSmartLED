package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.m */
final class C0027m {

    /* renamed from: a */
    C0022h f54a;

    /* renamed from: b */
    GenericLifecycleObserver f55b;

    C0027m(C0023i iVar, C0022h hVar) {
        this.f55b = C0029o.m79a((Object) iVar);
        this.f54a = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71a(C0024j jVar, C0021g gVar) {
        C0022h b = C0025k.m63b(gVar);
        this.f54a = C0025k.m61a(this.f54a, b);
        this.f55b.mo32a(jVar, gVar);
        this.f54a = b;
    }
}
