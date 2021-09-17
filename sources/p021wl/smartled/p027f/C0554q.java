package p021wl.smartled.p027f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p021wl.smartled.service.C0572af;
import p021wl.smartled.service.C0574ah;
import p021wl.smartled.service.YyyService;

/* renamed from: wl.smartled.f.q */
final class C0554q implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0553p f2423a;

    C0554q(C0553p pVar) {
        this.f2423a = pVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        YyyService unused = this.f2423a.f2421c = ((C0574ah) iBinder).mo5131a();
        this.f2423a.f2421c.mo5117a((C0572af) C0553p.f2419a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        YyyService unused = this.f2423a.f2421c = null;
    }
}
