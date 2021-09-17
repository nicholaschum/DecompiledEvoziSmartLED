package p021wl.smartled.service;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import android.util.Log;

/* renamed from: wl.smartled.service.n */
final class C0587n extends AdvertiseCallback {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2666a;

    C0587n(BluetoothLEService bluetoothLEService) {
        this.f2666a = bluetoothLEService;
    }

    public final void onStartFailure(int i) {
        String str;
        String str2;
        super.onStartFailure(i);
        Log.e("BluetoothLEService", "onStartFailure errorCode".concat(String.valueOf(i)));
        if (i == 1) {
            str = "BluetoothLEService";
            str2 = "广播开启错误,数据大于31个字节";
        } else if (i == 2) {
            str = "BluetoothLEService";
            str2 = "未能开始广播，没有广播实例";
        } else if (i == 3) {
            str = "BluetoothLEService";
            str2 = "正在连接的，无法再次连接";
        } else if (i == 4) {
            str = "BluetoothLEService";
            str2 = "由于内部错误操作失败";
        } else if (i == 5) {
            Log.e("BluetoothLEService", "在这个平台上不支持此功能");
            return;
        } else {
            return;
        }
        Log.e(str, str2);
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        super.onStartSuccess(advertiseSettings);
        Log.v("BluetoothLEService", "Advertise start succeeds: " + advertiseSettings.toString());
    }
}
