package p021wl.smartled.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: wl.smartled.service.YyyService */
public class YyyService extends Service {

    /* renamed from: a */
    private C0573ag f2632a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C0572af f2633b;

    /* renamed from: a */
    public final void mo5117a(C0572af afVar) {
        this.f2633b = afVar;
    }

    public IBinder onBind(Intent intent) {
        return new C0574ah(this);
    }

    public void onCreate() {
        super.onCreate();
        this.f2632a = new C0573ag(this, this);
        this.f2632a.mo5127a();
    }

    public void onDestroy() {
        this.f2632a.mo5128b();
        this.f2632a = null;
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, 2, i2);
    }
}
