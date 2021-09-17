package p021wl.smartled.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p021wl.smartled.service.AudioRecorderService;
import p021wl.smartled.service.C0577d;
import p021wl.smartled.service.C0578e;

/* renamed from: wl.smartled.activity.t */
final class C0497t implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ OnlineMusicActivity f2182a;

    C0497t(OnlineMusicActivity onlineMusicActivity) {
        this.f2182a = onlineMusicActivity;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AudioRecorderService unused = this.f2182a.f2133g = ((C0578e) iBinder).mo5134a();
        this.f2182a.f2133g.mo5071a((C0577d) this.f2182a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AudioRecorderService unused = this.f2182a.f2133g = null;
    }
}
