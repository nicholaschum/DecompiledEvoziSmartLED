package p021wl.smartled.activity;

import android.content.Intent;

/* renamed from: wl.smartled.activity.d */
final class C0481d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0480c f2156a;

    C0481d(C0480c cVar) {
        this.f2156a = cVar;
    }

    public final void run() {
        this.f2156a.f2155a.startActivity(new Intent(this.f2156a.f2155a, MainActivity.class));
        this.f2156a.f2155a.finish();
    }
}
