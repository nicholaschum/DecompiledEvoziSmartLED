package p021wl.smartled.p027f;

import android.content.Context;

/* renamed from: wl.smartled.f.i */
public final class C0546i {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static long f2411d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f2412a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0547j f2413b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C0548k f2414c;

    public C0546i(Context context, C0548k kVar) {
        this.f2413b = new C0547j(this, context, (byte) 0);
        this.f2414c = kVar;
    }

    /* renamed from: e */
    static /* synthetic */ long m1914e() {
        long j = f2411d;
        f2411d = 1 + j;
        return j;
    }

    /* renamed from: a */
    public final void mo5011a() {
        if (this.f2413b != null) {
            this.f2412a = true;
            this.f2413b.start();
        }
    }

    /* renamed from: b */
    public final void mo5012b() {
        if (this.f2412a) {
            this.f2412a = false;
        }
    }

    /* renamed from: c */
    public final boolean mo5013c() {
        return this.f2412a;
    }
}
