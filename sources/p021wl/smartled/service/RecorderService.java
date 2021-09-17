package p021wl.smartled.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.IBinder;
import android.support.p007v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.service.RecorderService */
public class RecorderService extends Service {

    /* renamed from: a */
    private MediaRecorder f2622a;

    /* renamed from: b */
    private String f2623b = "/dev/null";

    /* renamed from: c */
    private long f2624c;

    /* renamed from: d */
    private long f2625d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f2626e = new C0568ab(this);

    /* renamed from: f */
    private BroadcastReceiver f2627f = new C0569ac(this);

    /* renamed from: g */
    private final Handler f2628g = new Handler();

    /* renamed from: h */
    private Runnable f2629h = new C0570ad(this);

    /* renamed from: i */
    private int f2630i = 1;

    /* renamed from: j */
    private int f2631j = 200;

    /* renamed from: b */
    private long m2118b() {
        if (this.f2622a == null) {
            return 0;
        }
        this.f2625d = System.currentTimeMillis();
        Log.i("RecorderService", "endTime" + this.f2625d);
        try {
            this.f2622a.setOnErrorListener((MediaRecorder.OnErrorListener) null);
            this.f2622a.setOnInfoListener((MediaRecorder.OnInfoListener) null);
            this.f2622a.setPreviewDisplay((Surface) null);
            this.f2622a.reset();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            this.f2622a.release();
            this.f2622a = null;
            throw th;
        }
        this.f2622a.release();
        this.f2622a = null;
        Log.i("ACTION_LENGTH", "Time" + (this.f2625d - this.f2624c));
        return this.f2625d - this.f2624c;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m2120c() {
        if (this.f2622a != null) {
            double maxAmplitude = ((double) this.f2622a.getMaxAmplitude()) / ((double) this.f2630i);
            if (maxAmplitude > 1.0d) {
                Math.log10(maxAmplitude);
            }
            this.f2628g.postDelayed(this.f2629h, (long) this.f2631j);
        }
    }

    /* renamed from: a */
    public final void mo5112a() {
        String str;
        StringBuilder sb;
        String message;
        if (this.f2622a == null) {
            this.f2622a = new MediaRecorder();
        }
        try {
            Log.i("RecorderService", "startRecord: set audio source");
            this.f2622a.setAudioSource(1);
            this.f2622a.setOutputFormat(0);
            this.f2622a.setAudioEncoder(1);
            Log.i("RecorderService", "startRecord: setoutput");
            this.f2622a.setOutputFile(this.f2623b);
            this.f2622a.setMaxDuration(600000);
            Log.i("RecorderService", "startRecord: prepare");
            this.f2622a.prepare();
            Log.i("RecorderService", "startRecord: start");
            this.f2622a.start();
            this.f2624c = System.currentTimeMillis();
            m2120c();
            Log.i("RecorderService", "startTime" + this.f2624c);
        } catch (IllegalStateException e) {
            str = "RecorderService";
            sb = new StringBuilder("call startAmr1(File mRecAudioFile) failed!");
            message = e.getMessage();
            sb.append(message);
            Log.i(str, sb.toString());
        } catch (IOException e2) {
            str = "RecorderService";
            sb = new StringBuilder("call startAmr2(File mRecAudioFile) failed!");
            message = e2.getMessage();
            sb.append(message);
            Log.i(str, sb.toString());
        }
    }

    public IBinder onBind(Intent intent) {
        return new C0571ae(this);
    }

    public void onCreate() {
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f2627f, new IntentFilter("wl.action.ACTION_REQUEST_PERMISSION_RESULT"));
        C0549l.m1921a((Context) this, C0517e.f2296j);
        super.onCreate();
    }

    public void onDestroy() {
        this.f2628g.removeCallbacksAndMessages((Object) null);
        m2118b();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f2627f);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, 2, i2);
    }
}
