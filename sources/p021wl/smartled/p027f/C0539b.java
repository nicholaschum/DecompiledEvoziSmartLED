package p021wl.smartled.p027f;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p021wl.smartled.p022a.C0475a;
import p021wl.smartled.service.BluetoothLEService;
import p021wl.smartled.service.C0589p;

/* renamed from: wl.smartled.f.b */
final class C0539b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C0538a f2407a;

    C0539b(C0538a aVar) {
        this.f2407a = aVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        BluetoothLEService unused = this.f2407a.f2401b = ((C0589p) iBinder).mo5153a();
        this.f2407a.f2401b.mo5077a((C0475a) C0538a.f2400a);
        if (this.f2407a.f2405f == null) {
            return;
        }
        if (!this.f2407a.f2401b.mo5078a() || !this.f2407a.f2401b.mo5080c()) {
            this.f2407a.f2405f.mo4748a(false);
        } else {
            this.f2407a.f2405f.mo4748a(true);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        BluetoothLEService unused = this.f2407a.f2401b = null;
    }
}
