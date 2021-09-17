package p021wl.smartled.fragment;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p024c.C0531d;
import p021wl.smartled.p027f.C0538a;

/* renamed from: wl.smartled.fragment.h */
final class C0562h extends Handler {

    /* renamed from: a */
    final /* synthetic */ TimingFragment f2528a;

    C0562h(TimingFragment timingFragment) {
        this.f2528a = timingFragment;
    }

    public final void handleMessage(Message message) {
        Message message2 = message;
        super.handleMessage(message);
        int i = 128;
        if (message2.what == 101) {
            C0538a a = C0538a.m1861a();
            Context context = this.f2528a.getContext();
            String a2 = this.f2528a.f2517m;
            int b = C0531d.m1823a().mo4952b();
            int c = C0531d.m1823a().mo4955c();
            int d = C0531d.m1823a().mo4957d() & 127;
            if (!C0531d.m1823a().mo4960e()) {
                i = 0;
            }
            a.mo4982a(context, a2, b, c, 0, d | i, 0, true);
        } else if (message2.what == 102) {
            C0538a a3 = C0538a.m1861a();
            Context context2 = this.f2528a.getContext();
            String a4 = this.f2528a.f2517m;
            int f = C0531d.m1823a().mo4961f();
            int g = C0531d.m1823a().mo4963g();
            int h = C0531d.m1823a().mo4965h() & 127;
            if (!C0531d.m1823a().mo4967i()) {
                i = 0;
            }
            a3.mo4982a(context2, a4, f, g, 0, h | i, 1, true);
        } else if (message2.what == 203 || message2.what == 204) {
            int unused = this.f2528a.f2516l = message2.what;
            C0538a.m1861a().mo5001c(this.f2528a.getContext(), this.f2528a.f2517m);
            this.f2528a.f2520p.sendEmptyMessageDelayed(200, 200);
        } else if (message2.what == 201) {
            int unused2 = this.f2528a.f2516l = 201;
            C0538a.m1861a().mo4982a(this.f2528a.getContext(), this.f2528a.f2517m, 255, 255, 255, 0, 0, false);
            this.f2528a.f2520p.sendEmptyMessageDelayed(203, 200);
        } else if (message2.what == 202) {
            int unused3 = this.f2528a.f2516l = 202;
            C0538a.m1861a().mo4982a(this.f2528a.getContext(), this.f2528a.f2517m, 255, 255, 255, 0, 1, false);
            this.f2528a.f2520p.sendEmptyMessageDelayed(204, 200);
        } else if (message2.what == 205) {
            int unused4 = this.f2528a.f2516l = 205;
            C0538a.m1861a().mo5008f(this.f2528a.getContext(), this.f2528a.f2517m);
            this.f2528a.f2520p.sendEmptyMessageDelayed(206, 200);
        } else if (message2.what == 206) {
            boolean unused5 = this.f2528a.f2519o = true;
            int unused6 = this.f2528a.f2516l = 206;
            this.f2528a.f2520p.sendEmptyMessageDelayed(200, 200);
        } else if (message2.what == 200) {
            int unused7 = this.f2528a.f2516l = 200;
            this.f2528a.f2520p.sendEmptyMessageDelayed(100, 1000);
        } else if (message2.what == 100) {
            DeviceBean b2 = C0528a.m1795a().mo4935b();
            String address = b2 != null ? b2.getAddress() : null;
            if (address != null && (!this.f2528a.f2519o || !address.equals(this.f2528a.f2517m))) {
                String unused8 = this.f2528a.f2517m = address;
                int unused9 = this.f2528a.f2518n = b2.getDeviceType();
                boolean unused10 = this.f2528a.f2519o = false;
                if (this.f2528a.f2518n == DeviceBean.f2309g) {
                    this.f2528a.f2520p.sendEmptyMessage(201);
                } else {
                    this.f2528a.f2520p.sendEmptyMessage(207);
                }
                int unused11 = this.f2528a.f2516l = 100;
            } else if (this.f2528a.f2516l == 200) {
                if (this.f2528a.f2517m != null && address == null) {
                    boolean unused12 = this.f2528a.f2519o = false;
                }
                this.f2528a.f2520p.sendEmptyMessageDelayed(100, 1000);
            }
        } else if (message2.what == 207) {
            int unused13 = this.f2528a.f2516l = 207;
            C0538a.m1861a().mo5001c(this.f2528a.getContext(), this.f2528a.f2517m);
            this.f2528a.f2520p.sendEmptyMessageDelayed(205, 200);
        }
    }
}
