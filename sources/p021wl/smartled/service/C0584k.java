package p021wl.smartled.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

/* renamed from: wl.smartled.service.k */
final class C0584k implements BluetoothAdapter.LeScanCallback {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2660a;

    C0584k(BluetoothLEService bluetoothLEService) {
        this.f2660a = bluetoothLEService;
    }

    public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        BluetoothLEService.m2019a(this.f2660a, bluetoothDevice.getName(), bluetoothDevice.getAddress(), bArr);
    }
}
