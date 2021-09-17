package p021wl.smartled.p027f;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Random;
import p021wl.smartled.SmartLedApplication;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.service.C0572af;
import p021wl.smartled.service.YyyService;

/* renamed from: wl.smartled.f.p */
public class C0553p implements C0572af {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C0553p f2419a;

    /* renamed from: b */
    private Context f2420b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public YyyService f2421c;

    /* renamed from: d */
    private ServiceConnection f2422d = new C0554q(this);

    private C0553p() {
    }

    /* renamed from: a */
    private void m1930a(boolean z) {
        if (z) {
            Intent intent = new Intent();
            intent.setPackage(this.f2420b.getPackageName());
            intent.setAction("wl.action.service.YyyService");
            this.f2420b.bindService(intent, this.f2422d, 1);
            return;
        }
        this.f2420b.unbindService(this.f2422d);
        this.f2421c.mo5117a((C0572af) null);
        this.f2421c = null;
    }

    /* renamed from: b */
    public static C0553p m1931b() {
        if (f2419a == null) {
            synchronized (C0553p.class) {
                if (f2419a == null) {
                    f2419a = new C0553p();
                }
            }
        }
        return f2419a;
    }

    /* renamed from: a */
    public final void mo5016a() {
        C0538a.m1861a().mo4984a(this.f2420b, C0528a.m1795a().mo4941e(), new Random().nextInt());
    }

    /* renamed from: c */
    public final void mo5017c() {
        this.f2420b = SmartLedApplication.m1588a();
        m1930a(true);
    }

    /* renamed from: d */
    public final void mo5018d() {
        m1930a(false);
        this.f2420b = null;
    }
}
