package p021wl.smartled.service;

import android.os.Handler;
import android.os.Message;

/* renamed from: wl.smartled.service.h */
final class C0581h extends Handler {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2656a;

    C0581h(BluetoothLEService bluetoothLEService) {
        this.f2656a = bluetoothLEService;
    }

    public final void handleMessage(Message message) {
        if (message.what == 101 && message.arg1 == 1) {
            this.f2656a.mo5079b();
        }
    }
}
