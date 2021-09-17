package p021wl.smartled.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.service.g */
final class C0580g extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2655a;

    C0580g(BluetoothLEService bluetoothLEService) {
        this.f2655a = bluetoothLEService;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals("wl.action.ACTION_REQUEST_PERMISSION_RESULT")) {
            boolean unused = this.f2655a.f2578a = false;
            if (Arrays.equals(intent.getStringArrayExtra("wl.extra.permission"), C0517e.f2295i)) {
                C0549l.m1922a(intent, this.f2655a.f2574S);
            }
        } else if (action.equals("wl.action.ACTION_CHECK_PERMISSION") && !this.f2655a.f2578a) {
            C0549l.m1921a((Context) this.f2655a, C0517e.f2295i);
            boolean unused2 = this.f2655a.f2578a = true;
        }
    }
}
