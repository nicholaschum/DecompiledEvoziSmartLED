package p021wl.smartled.fragment;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p021wl.smartled.service.AudioRecorderService;
import p021wl.smartled.service.C0577d;
import p021wl.smartled.service.C0578e;

/* renamed from: wl.smartled.fragment.f */
final class C0560f implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ StreamingFragment f2526a;

    C0560f(StreamingFragment streamingFragment) {
        this.f2526a = streamingFragment;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AudioRecorderService unused = this.f2526a.f2485b = ((C0578e) iBinder).mo5134a();
        this.f2526a.f2485b.mo5071a((C0577d) this.f2526a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        AudioRecorderService unused = this.f2526a.f2485b = null;
    }
}
