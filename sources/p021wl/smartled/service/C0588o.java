package p021wl.smartled.service;

import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import java.util.List;

/* renamed from: wl.smartled.service.o */
final class C0588o extends ScanCallback {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2667a;

    private C0588o(BluetoothLEService bluetoothLEService) {
        this.f2667a = bluetoothLEService;
    }

    /* synthetic */ C0588o(BluetoothLEService bluetoothLEService, byte b) {
        this(bluetoothLEService);
    }

    public final void onBatchScanResults(List<ScanResult> list) {
        super.onBatchScanResults(list);
    }

    public final void onScanFailed(int i) {
        super.onScanFailed(i);
    }

    public final void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        ScanRecord scanRecord = scanResult.getScanRecord();
        BluetoothLEService.m2019a(this.f2667a, scanResult.getDevice().getName(), scanResult.getDevice().getAddress(), scanRecord != null ? scanRecord.getBytes() : null);
    }
}
