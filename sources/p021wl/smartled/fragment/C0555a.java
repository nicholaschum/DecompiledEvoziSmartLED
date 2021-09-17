package p021wl.smartled.fragment;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p021wl.smartled.service.C0567aa;
import p021wl.smartled.service.C0599z;
import p021wl.smartled.service.PlayService;

/* renamed from: wl.smartled.fragment.a */
final class C0555a implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ MusicFragment f2521a;

    C0555a(MusicFragment musicFragment) {
        this.f2521a = musicFragment;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PlayService unused = this.f2521a.f2442a = ((C0567aa) iBinder).mo5123a();
        this.f2521a.f2442a.mo5088a((C0599z) this.f2521a);
        this.f2521a.m1951b(this.f2521a.f2442a.mo5101m());
        this.f2521a.m1950a(true);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
