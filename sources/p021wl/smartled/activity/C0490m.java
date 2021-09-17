package p021wl.smartled.activity;

import p021wl.smartled.p027f.C0538a;

/* renamed from: wl.smartled.activity.m */
final class C0490m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2172a;

    /* renamed from: b */
    final /* synthetic */ MainActivity f2173b;

    C0490m(MainActivity mainActivity, String str) {
        this.f2173b = mainActivity;
        this.f2172a = str;
    }

    public final void run() {
        C0538a.m1861a().mo5004d(this.f2173b, this.f2172a);
    }
}
