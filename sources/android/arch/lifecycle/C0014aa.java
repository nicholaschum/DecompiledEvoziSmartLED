package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.aa */
public final class C0014aa {

    /* renamed from: a */
    private final HashMap<String, C0038x> f33a = new HashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0038x mo56a(String str) {
        return this.f33a.get(str);
    }

    /* renamed from: a */
    public final void mo57a() {
        for (C0038x onCleared : this.f33a.values()) {
            onCleared.onCleared();
        }
        this.f33a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58a(String str, C0038x xVar) {
        C0038x put = this.f33a.put(str, xVar);
        if (put != null) {
            put.onCleared();
        }
    }
}
