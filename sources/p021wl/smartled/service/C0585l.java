package p021wl.smartled.service;

/* renamed from: wl.smartled.service.l */
final class C0585l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2661a;

    /* renamed from: b */
    final /* synthetic */ String f2662b;

    /* renamed from: c */
    final /* synthetic */ byte[] f2663c;

    /* renamed from: d */
    final /* synthetic */ BluetoothLEService f2664d;

    C0585l(BluetoothLEService bluetoothLEService, String str, String str2, byte[] bArr) {
        this.f2664d = bluetoothLEService;
        this.f2661a = str;
        this.f2662b = str2;
        this.f2663c = bArr;
    }

    public final void run() {
        BluetoothLEService.m2025b(this.f2664d, this.f2661a, this.f2662b, this.f2663c);
    }
}
