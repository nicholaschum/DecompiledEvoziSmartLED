package p021wl.smartled.fragment;

import android.os.Handler;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p024c.C0531d;

/* renamed from: wl.smartled.fragment.k */
final class C0565k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2531a;

    /* renamed from: b */
    final /* synthetic */ byte[] f2532b;

    /* renamed from: c */
    final /* synthetic */ TimingFragment f2533c;

    C0565k(TimingFragment timingFragment, String str, byte[] bArr) {
        this.f2533c = timingFragment;
        this.f2531a = str;
        this.f2532b = bArr;
    }

    public final void run() {
        Handler b;
        int i;
        boolean z = false;
        if (this.f2533c.f2518n == DeviceBean.f2309g) {
            if (this.f2533c.f2516l == 203) {
                if (this.f2531a != null && this.f2531a.equals(this.f2533c.f2517m) && this.f2532b != null && this.f2532b.length >= 9 && this.f2532b[0] == 126 && this.f2532b[1] == 8 && this.f2532b[2] == -126 && this.f2532b[8] == -17 && this.f2532b[6] == 0) {
                    C0531d.m1823a().mo4950a((int) this.f2532b[3]);
                    C0531d.m1823a().mo4953b((int) this.f2532b[4]);
                    C0531d.m1823a().mo4964g(this.f2532b[5]);
                    C0531d.m1823a().mo4956c(this.f2532b[7]);
                    C0531d a = C0531d.m1823a();
                    if (((this.f2532b[7] >> 7) & 1) == 1) {
                        z = true;
                    }
                    a.mo4951a(z);
                    if (C0531d.m1823a().mo4960e()) {
                        this.f2533c.f2513i.mo5203b();
                    } else {
                        this.f2533c.f2513i.mo5201a();
                    }
                    this.f2533c.f2505a.mo5207a(C0531d.m1823a().mo4957d());
                    this.f2533c.m1985a();
                    this.f2533c.f2520p.removeMessages(200);
                    b = this.f2533c.f2520p;
                    i = 202;
                } else {
                    return;
                }
            } else if (this.f2533c.f2516l == 204) {
                if (this.f2531a != null && this.f2531a.equals(this.f2533c.f2517m) && this.f2532b != null && this.f2532b.length >= 9 && this.f2532b[0] == 126 && this.f2532b[1] == 8 && this.f2532b[2] == -126 && this.f2532b[8] == -17 && this.f2532b[6] == 1) {
                    C0531d.m1823a().mo4958d(this.f2532b[3]);
                    C0531d.m1823a().mo4959e(this.f2532b[4]);
                    C0531d.m1823a().mo4966h(this.f2532b[5]);
                    C0531d.m1823a().mo4962f(this.f2532b[7]);
                    C0531d a2 = C0531d.m1823a();
                    if (((this.f2532b[7] >> 7) & 1) == 1) {
                        z = true;
                    }
                    a2.mo4954b(z);
                    if (C0531d.m1823a().mo4967i()) {
                        this.f2533c.f2514j.mo5203b();
                    } else {
                        this.f2533c.f2514j.mo5201a();
                    }
                    this.f2533c.f2506b.mo5207a(C0531d.m1823a().mo4965h());
                    this.f2533c.m1985a();
                    this.f2533c.f2520p.removeMessages(200);
                    b = this.f2533c.f2520p;
                    i = 205;
                } else {
                    return;
                }
            } else if (this.f2533c.f2516l == 206 && this.f2531a != null && this.f2531a.equals(this.f2533c.f2517m) && this.f2532b != null && this.f2532b.length >= 9 && this.f2532b[0] == 126 && this.f2532b[1] == 7 && this.f2532b[2] == -125 && this.f2532b[7] == -1 && this.f2532b[8] != -17) {
                return;
            } else {
                return;
            }
            b.sendEmptyMessageDelayed(i, 200);
        } else if (this.f2533c.f2516l == 207 && this.f2531a != null && this.f2531a.equals(this.f2533c.f2517m) && this.f2532b != null && this.f2532b.length >= 9 && this.f2532b[0] == 126 && this.f2532b[1] == 9 && this.f2532b[2] == -123) {
            C0531d.m1823a().mo4950a((int) this.f2532b[3]);
            C0531d.m1823a().mo4953b((int) this.f2532b[4]);
            C0531d.m1823a().mo4964g(0);
            C0531d.m1823a().mo4956c(this.f2532b[5]);
            C0531d.m1823a().mo4951a(((this.f2532b[5] >> 7) & 1) == 1);
            if (C0531d.m1823a().mo4960e()) {
                this.f2533c.f2513i.mo5203b();
            } else {
                this.f2533c.f2513i.mo5201a();
            }
            this.f2533c.f2505a.mo5207a(C0531d.m1823a().mo4957d());
            this.f2533c.m1985a();
            C0531d.m1823a().mo4958d(this.f2532b[6]);
            C0531d.m1823a().mo4959e(this.f2532b[7]);
            C0531d.m1823a().mo4966h(0);
            C0531d.m1823a().mo4962f(this.f2532b[8]);
            C0531d a3 = C0531d.m1823a();
            if (((this.f2532b[8] >> 7) & 1) == 1) {
                z = true;
            }
            a3.mo4954b(z);
            if (C0531d.m1823a().mo4967i()) {
                this.f2533c.f2514j.mo5203b();
            } else {
                this.f2533c.f2514j.mo5201a();
            }
            this.f2533c.f2506b.mo5207a(C0531d.m1823a().mo4965h());
            this.f2533c.m1985a();
        }
    }
}
