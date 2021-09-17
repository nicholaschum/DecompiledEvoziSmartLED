package android.support.p010v7.app;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: android.support.v7.app.af */
final class C0204af {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f672a;

    /* renamed from: b */
    private C0220av f673b;

    /* renamed from: c */
    private boolean f674c;

    /* renamed from: d */
    private BroadcastReceiver f675d;

    /* renamed from: e */
    private IntentFilter f676e;

    C0204af(AppCompatDelegateImpl appCompatDelegateImpl, C0220av avVar) {
        this.f672a = appCompatDelegateImpl;
        this.f673b = avVar;
        this.f674c = avVar.mo3278a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3248a() {
        this.f674c = this.f673b.mo3278a();
        return this.f674c ? 2 : 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3249b() {
        boolean a = this.f673b.mo3278a();
        if (a != this.f674c) {
            this.f674c = a;
            this.f672a.mo3212k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3250c() {
        mo3251d();
        if (this.f675d == null) {
            this.f675d = new C0205ag(this);
        }
        if (this.f676e == null) {
            this.f676e = new IntentFilter();
            this.f676e.addAction("android.intent.action.TIME_SET");
            this.f676e.addAction("android.intent.action.TIMEZONE_CHANGED");
            this.f676e.addAction("android.intent.action.TIME_TICK");
        }
        this.f672a.f616a.registerReceiver(this.f675d, this.f676e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3251d() {
        if (this.f675d != null) {
            this.f672a.f616a.unregisterReceiver(this.f675d);
            this.f675d = null;
        }
    }
}
