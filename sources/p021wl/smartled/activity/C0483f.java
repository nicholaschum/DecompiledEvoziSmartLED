package p021wl.smartled.activity;

import android.util.Log;
import java.util.List;
import p021wl.smartled.p026e.C0537d;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.activity.f */
final class C0483f implements C0537d {

    /* renamed from: a */
    final /* synthetic */ List f2158a;

    /* renamed from: b */
    final /* synthetic */ String[] f2159b;

    /* renamed from: c */
    final /* synthetic */ C0482e f2160c;

    C0483f(C0482e eVar, List list, String[] strArr) {
        this.f2160c = eVar;
        this.f2158a = list;
        this.f2159b = strArr;
    }

    /* renamed from: a */
    public final void mo4776a() {
        Log.d("MainActivity", "handleMessage ---> onGranted: " + this.f2158a);
        C0549l.m1920a(this.f2160c.f2157a, true, this.f2159b);
    }

    /* renamed from: b */
    public final void mo4777b() {
        Log.d("MainActivity", "handleMessage ---> onDenied: " + this.f2158a);
        C0549l.m1920a(this.f2160c.f2157a, false, this.f2159b);
    }
}
