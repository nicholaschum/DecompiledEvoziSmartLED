package p021wl.smartled.activity;

import p021wl.smartled.views.C0600a;

/* renamed from: wl.smartled.activity.h */
final class C0485h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f2163a;

    /* renamed from: b */
    final /* synthetic */ MainActivity f2164b;

    C0485h(MainActivity mainActivity, boolean z) {
        this.f2164b = mainActivity;
        this.f2163a = z;
    }

    public final void run() {
        if (this.f2163a && this.f2164b.f2099a == null) {
            C0600a unused = this.f2164b.f2099a = new C0600a();
            this.f2164b.f2099a.mo5212a(this.f2164b);
        }
    }
}
