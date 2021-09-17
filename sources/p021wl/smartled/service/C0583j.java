package p021wl.smartled.service;

import android.content.Intent;

/* renamed from: wl.smartled.service.j */
final class C0583j implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Intent f2658a;

    /* renamed from: b */
    final /* synthetic */ BluetoothLEService f2659b;

    C0583j(BluetoothLEService bluetoothLEService, Intent intent) {
        this.f2659b = bluetoothLEService;
        this.f2658a = intent;
    }

    public final void run() {
        synchronized (BluetoothLEService.class) {
            String action = this.f2658a.getAction();
            if (action != null) {
                char c = 65535;
                switch (action.hashCode()) {
                    case -2059323285:
                        if (action.equals("wl.action.bluetooth.le.release.resource")) {
                            c = 16;
                            break;
                        }
                        break;
                    case -1946628652:
                        if (action.equals("wl.action.bluetooth.le.connect")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1815689267:
                        if (action.equals("wl.action.bluetooth.le.receive")) {
                            c = 13;
                            break;
                        }
                        break;
                    case -1772638653:
                        if (action.equals("wl.action.bluetooth.le.read.connection.state")) {
                            c = 17;
                            break;
                        }
                        break;
                    case -1758875155:
                        if (action.equals("wl.action.bluetooth.le.rgbw.on")) {
                            c = 14;
                            break;
                        }
                        break;
                    case -1513979446:
                        if (action.equals("wl.action.bluetooth.le.system.time.status")) {
                            c = 20;
                            break;
                        }
                        break;
                    case -1495052728:
                        if (action.equals("wl.action.bluetooth.le.streaming.external.mic.on.off")) {
                            c = 22;
                            break;
                        }
                        break;
                    case -1207314181:
                        if (action.equals("wl.action.bluetooth.le.change.color")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1151588955:
                        if (action.equals("wl.action.bluetooth.le.change.single.color")) {
                            c = 11;
                            break;
                        }
                        break;
                    case -973395503:
                        if (action.equals("wl.action.bluetooth.le.rgb.pin.sequence")) {
                            c = 15;
                            break;
                        }
                        break;
                    case -812272383:
                        if (action.equals("wl.action.bluetooth.le.change.color.temperature")) {
                            c = 10;
                            break;
                        }
                        break;
                    case -661765074:
                        if (action.equals("wl.action.bluetooth.le.streaming.external.mic.sensitive")) {
                            c = 21;
                            break;
                        }
                        break;
                    case -167529052:
                        if (action.equals("wl.action.bluetooth.le.change.mode.speed")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -59579534:
                        if (action.equals("wl.action.bluetooth.le.disconnect")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -13930038:
                        if (action.equals("wl.action.bluetooth.le.read.timing.information")) {
                            c = 19;
                            break;
                        }
                        break;
                    case 132235705:
                        if (action.equals("wl.action.bluetooth.le.change.brightness")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 604291901:
                        if (action.equals("wl.action.bluetooth.le.scan.stop")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 698740029:
                        if (action.equals("wl.action.bluetooth.le.streaming.external.mic.eq.mode")) {
                            c = 23;
                            break;
                        }
                        break;
                    case 1348840973:
                        if (action.equals("wl.action.bluetooth.le.light.on")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1443888000:
                        if (action.equals("wl.action.bluetooth.le.timing.status")) {
                            c = 18;
                            break;
                        }
                        break;
                    case 1485372683:
                        if (action.equals("wl.action.bluetooth.le.change.mode")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1496645348:
                        if (action.equals("wl.action.bluetooth.le.music.amplitude")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1667869139:
                        if (action.equals("wl.action.bluetooth.le.scan")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1667871454:
                        if (action.equals("wl.action.bluetooth.le.send")) {
                            c = 12;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        BluetoothLEService bluetoothLEService = this.f2659b;
                        this.f2658a.getBooleanExtra("wl.extra.bluetoothle.scan.clear", true);
                        BluetoothLEService.m2048j(bluetoothLEService);
                        break;
                    case 1:
                        this.f2659b.m2044i();
                        break;
                    case 2:
                        BluetoothLEService.m2017a(this.f2659b, this.f2658a);
                        break;
                    case 3:
                        BluetoothLEService.m2024b(this.f2659b, this.f2658a);
                        break;
                    case 4:
                        BluetoothLEService.m2027c(this.f2659b, this.f2658a);
                        break;
                    case 5:
                        BluetoothLEService.m2030d(this.f2659b, this.f2658a);
                        break;
                    case 6:
                        BluetoothLEService.m2033e(this.f2659b, this.f2658a);
                        break;
                    case 7:
                        BluetoothLEService.m2018a(this.f2659b, this.f2658a, true);
                        break;
                    case 8:
                        BluetoothLEService.m2018a(this.f2659b, this.f2658a, false);
                        break;
                    case 9:
                        BluetoothLEService.m2036f(this.f2659b, this.f2658a);
                        break;
                    case 10:
                        BluetoothLEService.m2038g(this.f2659b, this.f2658a);
                        break;
                    case 11:
                        BluetoothLEService.m2043h(this.f2659b, this.f2658a);
                        break;
                    case 12:
                    case 13:
                        break;
                    case 14:
                        BluetoothLEService.m2046i(this.f2659b, this.f2658a);
                        break;
                    case 15:
                        BluetoothLEService.m2049j(this.f2659b, this.f2658a);
                        break;
                    case 16:
                        BluetoothLEService.m2051k(this.f2659b, this.f2658a);
                        break;
                    case 17:
                        BluetoothLEService.m2052l(this.f2659b, this.f2658a);
                        break;
                    case 18:
                        BluetoothLEService.m2053m(this.f2659b, this.f2658a);
                        break;
                    case 19:
                        BluetoothLEService.m2054n(this.f2659b, this.f2658a);
                        break;
                    case 20:
                        BluetoothLEService.m2055o(this.f2659b, this.f2658a);
                        break;
                    case 21:
                        BluetoothLEService.m2056p(this.f2659b, this.f2658a);
                        break;
                    case 22:
                        BluetoothLEService.m2057q(this.f2659b, this.f2658a);
                        break;
                    case 23:
                        BluetoothLEService.m2058r(this.f2659b, this.f2658a);
                        break;
                }
            }
        }
    }
}
