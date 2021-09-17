package p021wl.smartled.service;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Map;
import p021wl.smartled.beans.DeviceBean;

/* renamed from: wl.smartled.service.f */
final class C0579f extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2654a;

    C0579f(BluetoothLEService bluetoothLEService) {
        this.f2654a = bluetoothLEService;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
            boolean unused = this.f2654a.f2581d = this.f2654a.f2580c.isEnabled();
            if (this.f2654a.f2582e != null) {
                this.f2654a.f2582e.mo4748a(this.f2654a.f2581d);
                if (!this.f2654a.f2581d) {
                    boolean unused2 = BluetoothLEService.f2559h = false;
                    boolean unused3 = BluetoothLEService.f2560i = false;
                    boolean unused4 = BluetoothLEService.f2565t = false;
                    boolean unused5 = BluetoothLEService.f2566u = false;
                    this.f2654a.m2047j();
                    if (this.f2654a.f2583m.size() > 0) {
                        for (Map.Entry value : this.f2654a.f2583m.entrySet()) {
                            BluetoothDevice device = ((BluetoothGatt) value.getValue()).getDevice();
                            if (this.f2654a.f2582e != null) {
                                this.f2654a.f2582e.mo4745a(device.getName(), device.getAddress(), BluetoothLEService.m2022b(DeviceBean.f2308f));
                            }
                        }
                        this.f2654a.f2583m.clear();
                    }
                }
            }
        }
    }
}
