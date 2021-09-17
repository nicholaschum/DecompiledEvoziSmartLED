package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.y */
public final class C0039y {

    /* renamed from: a */
    private final C0040z f65a;

    /* renamed from: b */
    private final C0014aa f66b;

    public C0039y(C0014aa aaVar, C0040z zVar) {
        this.f65a = zVar;
        this.f66b = aaVar;
    }

    /* renamed from: a */
    public final <T extends C0038x> T mo82a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String concat = "android.arch.lifecycle.ViewModelProvider.DefaultKey:".concat(String.valueOf(canonicalName));
            T a = this.f66b.mo56a(concat);
            if (cls.isInstance(a)) {
                return a;
            }
            T create = this.f65a.create(cls);
            this.f66b.mo58a(concat, create);
            return create;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
