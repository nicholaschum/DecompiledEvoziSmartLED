package p021wl.smartled.service;

import java.util.TimerTask;

/* renamed from: wl.smartled.service.i */
final class C0582i extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2657a;

    C0582i(BluetoothLEService bluetoothLEService) {
        this.f2657a = bluetoothLEService;
    }

    public final void run() {
        synchronized (BluetoothLEService.class) {
            this.f2657a.m2041h();
            BluetoothLEService.m2045i(this.f2657a);
        }
    }
}
