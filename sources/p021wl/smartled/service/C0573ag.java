package p021wl.smartled.service;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import android.util.Log;

/* renamed from: wl.smartled.service.ag */
public final class C0573ag implements SensorEventListener {

    /* renamed from: a */
    final /* synthetic */ YyyService f2640a;

    /* renamed from: b */
    private SensorManager f2641b;

    /* renamed from: c */
    private Sensor f2642c;

    /* renamed from: d */
    private Context f2643d;

    /* renamed from: e */
    private float f2644e;

    /* renamed from: f */
    private float f2645f;

    /* renamed from: g */
    private float f2646g;

    /* renamed from: h */
    private long f2647h;

    /* renamed from: i */
    private int f2648i = 0;

    /* renamed from: j */
    private float f2649j = 0.0f;

    public C0573ag(YyyService yyyService, Context context) {
        this.f2640a = yyyService;
        this.f2643d = context;
    }

    /* renamed from: a */
    public final void mo5127a() {
        this.f2641b = (SensorManager) this.f2643d.getSystemService("sensor");
        if (this.f2641b != null) {
            this.f2642c = this.f2641b.getDefaultSensor(1);
        }
        if (this.f2642c != null) {
            this.f2641b.registerListener(this, this.f2642c, 2);
        }
    }

    /* renamed from: b */
    public final void mo5128b() {
        this.f2643d = null;
        this.f2641b.unregisterListener(this);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.f2647h;
        if (j >= 100) {
            this.f2647h = currentTimeMillis;
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            float f4 = f - this.f2644e;
            float f5 = f2 - this.f2645f;
            float f6 = f3 - this.f2646g;
            this.f2644e = f;
            this.f2645f = f2;
            this.f2646g = f3;
            double sqrt = (Math.sqrt((double) (((f4 * f4) + (f5 * f5)) + (f6 * f6))) / ((double) j)) * 10000.0d;
            this.f2649j = (float) (((double) this.f2649j) + sqrt);
            int i = this.f2648i + 1;
            this.f2648i = i;
            if (i >= 5) {
                Log.v("YyyService", "time=" + j + ", speed=" + sqrt + ", avg=" + (this.f2649j / 5.0f));
                if (this.f2649j / 5.0f >= 1800.0f) {
                    ((Vibrator) this.f2643d.getSystemService("vibrator")).vibrate(100);
                    if (this.f2640a.f2633b != null) {
                        this.f2640a.f2633b.mo5016a();
                    }
                }
                this.f2649j = 0.0f;
                this.f2648i = 0;
            }
        }
    }
}
