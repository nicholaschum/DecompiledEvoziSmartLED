package p021wl.smartled.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.IBinder;
import android.support.p007v4.content.LocalBroadcastManager;
import android.util.Log;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.service.AudioRecorderService */
public class AudioRecorderService extends Service {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final int f2534a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final short[] f2535b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AudioRecord f2536c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f2537d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Object f2538e;

    /* renamed from: f */
    private Thread f2539f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C0577d f2540g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f2541h = new C0566a(this);

    /* renamed from: i */
    private BroadcastReceiver f2542i = new C0575b(this);

    static {
        int minBufferSize = AudioRecord.getMinBufferSize(8000, 1, 2);
        f2534a = minBufferSize;
        f2535b = new short[minBufferSize];
    }

    /* renamed from: a */
    static /* synthetic */ void m2004a(AudioRecorderService audioRecorderService) {
        if (audioRecorderService.f2537d) {
            Log.e("AudioRecorderService", "还在录着呢");
            return;
        }
        audioRecorderService.f2538e = new Object();
        audioRecorderService.f2536c = new AudioRecord(1, 8000, 1, 2, f2534a);
        if (audioRecorderService.f2536c == null) {
            Log.e("sound", "mAudioRecord初始化失败");
        }
        audioRecorderService.f2537d = true;
        audioRecorderService.f2539f = new Thread(new C0576c(audioRecorderService));
        audioRecorderService.f2539f.start();
    }

    /* renamed from: a */
    public final void mo5071a(C0577d dVar) {
        this.f2540g = dVar;
    }

    public IBinder onBind(Intent intent) {
        return new C0578e(this);
    }

    public void onCreate() {
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f2542i, new IntentFilter("wl.action.ACTION_REQUEST_PERMISSION_RESULT"));
        C0549l.m1921a((Context) this, C0517e.f2296j);
        Log.d("AudioRecorderService", "onCreate");
        super.onCreate();
    }

    public void onDestroy() {
        this.f2537d = false;
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f2542i);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, 2, i2);
    }
}
