package p021wl.smartled.p027f;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.text.format.Time;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.p022a.C0475a;
import p021wl.smartled.p022a.C0476b;
import p021wl.smartled.p022a.C0477c;
import p021wl.smartled.service.BluetoothLEService;

/* renamed from: wl.smartled.f.a */
public class C0538a implements C0475a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C0538a f2400a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public BluetoothLEService f2401b;

    /* renamed from: c */
    private boolean f2402c;

    /* renamed from: d */
    private C0477c f2403d;

    /* renamed from: e */
    private C0476b f2404e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0475a f2405f;

    /* renamed from: g */
    private ServiceConnection f2406g = new C0539b(this);

    private C0538a() {
    }

    /* renamed from: a */
    public static C0538a m1861a() {
        if (f2400a == null) {
            synchronized (C0538a.class) {
                if (f2400a == null) {
                    f2400a = new C0538a();
                }
            }
        }
        return f2400a;
    }

    /* renamed from: a */
    private void m1864a(Context context, String str, Intent intent, boolean z, boolean z2) {
        if (z && this.f2404e != null && this.f2404e.mo4749b() > 0) {
            this.f2404e.mo4750b(z2);
        } else if (this.f2401b != null && this.f2401b.mo5080c() && this.f2401b.mo5078a()) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(context, BluetoothLEService.class);
            intent.setAction(str);
            this.f2401b.mo5076a(intent);
        }
    }

    /* renamed from: a */
    public final void mo4980a(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, BluetoothLEService.class);
        this.f2402c = context.bindService(intent, this.f2406g, 1);
    }

    /* renamed from: a */
    public final void mo4981a(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            m1864a(context, "wl.action.bluetooth.le.release.resource", intent, false, false);
        }
    }

    /* renamed from: a */
    public final void mo4982a(Context context, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            intent.putExtra("wl.extra.bluetoothle.timing.hour.minute.second", (i << 16) | (i2 << 8) | i3);
            intent.putExtra("wl.extra.bluetoothle.timing.weeks", i4);
            intent.putExtra("wl.extra.bluetoothle.timing.mode", i5);
            m1864a(context, "wl.action.bluetooth.le.timing.status", intent, true, z);
        }
    }

    /* renamed from: a */
    public final void mo4983a(Context context, String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            intent.putExtra("wl.extra.bluetoothle.light.on", z);
            m1864a(context, "wl.action.bluetooth.le.light.on", intent, true, true);
        }
    }

    /* renamed from: a */
    public final void mo4984a(Context context, List<String> list, int i) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.color", i);
            m1864a(context, "wl.action.bluetooth.le.change.color", intent, true, true);
        }
    }

    /* renamed from: a */
    public final void mo4985a(Context context, List<String> list, int i, int i2) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.color.warm", i);
            intent.putExtra("wl.extra.bluetoothle.color.cold", i2);
            m1864a(context, "wl.action.bluetooth.le.change.color.temperature", intent, true, true);
        }
    }

    /* renamed from: a */
    public final void mo4986a(Context context, List<String> list, int i, int i2, int i3) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.rgb.pin.sequence", (i << 16) | (i2 << 8) | i3);
            m1864a(context, "wl.action.bluetooth.le.rgb.pin.sequence", intent, true, true);
        }
    }

    /* renamed from: a */
    public final void mo4987a(Context context, List<String> list, int i, boolean z) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.brightness", i);
            m1864a(context, "wl.action.bluetooth.le.change.brightness", intent, true, z);
        }
    }

    /* renamed from: a */
    public final void mo4988a(Context context, List<String> list, boolean z) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.light.on", z);
            m1864a(context, "wl.action.bluetooth.le.light.on", intent, true, true);
        }
    }

    /* renamed from: a */
    public final void mo4989a(Context context, List<String> list, boolean z, boolean z2) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.streaming.external.mic.on.off", z);
            m1864a(context, "wl.action.bluetooth.le.streaming.external.mic.on.off", intent, true, z2);
        }
    }

    /* renamed from: a */
    public final void mo4990a(Context context, List<String> list, boolean z, boolean z2, boolean z3, int i) {
        if (list != null && list.size() > 0) {
            int i2 = 0;
            if (z) {
                i2 = 65536;
            }
            if (z2) {
                i2 |= 1;
            }
            if (z3) {
                i2 |= 256;
            }
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.rgbw.on", i2);
            intent.putExtra("wl.extra.bluetoothle.light.mode", i);
            m1864a(context, "wl.action.bluetooth.le.rgbw.on", intent, true, true);
        }
    }

    /* renamed from: a */
    public final void mo4991a(Context context, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("wl.extra.bluetoothle.scan.clear", z);
        m1864a(context, "wl.action.bluetooth.le.scan", intent, false, false);
    }

    /* renamed from: a */
    public final void mo4744a(String str, String str2) {
        if (this.f2405f != null) {
            this.f2405f.mo4744a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo4745a(String str, String str2, int i) {
        if (this.f2405f != null) {
            this.f2405f.mo4745a(str, str2, i);
        }
    }

    /* renamed from: a */
    public final void mo4746a(String str, byte[] bArr) {
        if (this.f2405f != null) {
            this.f2405f.mo4746a(str, bArr);
        }
        if (this.f2403d != null) {
            this.f2403d.mo4751a(str, bArr);
        }
    }

    /* renamed from: a */
    public final void mo4747a(List<String> list) {
        if (this.f2405f != null) {
            this.f2405f.mo4747a(list);
        }
    }

    /* renamed from: a */
    public final void mo4992a(C0475a aVar) {
        this.f2405f = aVar;
    }

    /* renamed from: a */
    public final void mo4993a(C0476b bVar) {
        this.f2404e = bVar;
    }

    /* renamed from: a */
    public final void mo4994a(C0477c cVar) {
        this.f2403d = cVar;
    }

    /* renamed from: a */
    public final void mo4748a(boolean z) {
        if (this.f2405f == null) {
            return;
        }
        if (this.f2401b == null || !this.f2401b.mo5080c() || !this.f2401b.mo5078a()) {
            this.f2405f.mo4748a(false);
        } else {
            this.f2405f.mo4748a(true);
        }
    }

    /* renamed from: b */
    public final void mo4995b(Context context) {
        if (this.f2402c) {
            context.unbindService(this.f2406g);
            this.f2402c = false;
        }
        this.f2401b = null;
    }

    /* renamed from: b */
    public final void mo4996b(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            m1864a(context, "wl.action.bluetooth.le.read.connection.state", intent, false, false);
        }
    }

    /* renamed from: b */
    public final void mo4997b(Context context, List<String> list, int i) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.single.color", i);
            m1864a(context, "wl.action.bluetooth.le.change.single.color", intent, true, true);
        }
    }

    /* renamed from: b */
    public final void mo4998b(Context context, List<String> list, int i, int i2) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.brightness", i);
            intent.putExtra("wl.extra.bluetoothle.light.mode", i2);
            m1864a(context, "wl.action.bluetooth.le.change.brightness", intent, true, true);
        }
    }

    /* renamed from: b */
    public final void mo4999b(Context context, List<String> list, int i, boolean z) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.streaming.external.mic.eq.mode", i);
            m1864a(context, "wl.action.bluetooth.le.streaming.external.mic.eq.mode", intent, true, z);
        }
    }

    /* renamed from: c */
    public final void mo5000c(Context context) {
        m1864a(context, "wl.action.bluetooth.le.scan.stop", (Intent) null, false, false);
    }

    /* renamed from: c */
    public final void mo5001c(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            m1864a(context, "wl.action.bluetooth.le.read.timing.information", intent, true, false);
        }
    }

    /* renamed from: c */
    public final void mo5002c(Context context, List<String> list, int i) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.mode", i);
            m1864a(context, "wl.action.bluetooth.le.change.mode", intent, true, true);
        }
    }

    /* renamed from: c */
    public final void mo5003c(Context context, List<String> list, int i, int i2) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.color", i);
            intent.putExtra("wl.extra.bluetoothle.brightness", i2);
            m1864a(context, "wl.action.bluetooth.le.music.amplitude", intent, true, true);
        }
    }

    /* renamed from: d */
    public final void mo5004d(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            m1864a(context, "wl.action.bluetooth.le.connect", intent, false, false);
        }
    }

    /* renamed from: d */
    public final void mo5005d(Context context, List<String> list, int i) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.mode.change.speed", i);
            m1864a(context, "wl.action.bluetooth.le.change.mode.speed", intent, true, true);
        }
    }

    /* renamed from: e */
    public final void mo5006e(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            m1864a(context, "wl.action.bluetooth.le.disconnect", intent, false, false);
        }
    }

    /* renamed from: e */
    public final void mo5007e(Context context, List<String> list, int i) {
        if (list != null && list.size() > 0) {
            Intent intent = new Intent();
            intent.putStringArrayListExtra("wl.extra.bluetoothle.address.list", (ArrayList) list);
            intent.putExtra("wl.extra.bluetoothle.streaming.external.mic.sensitive", i);
            m1864a(context, "wl.action.bluetooth.le.streaming.external.mic.sensitive", intent, true, true);
        }
    }

    /* renamed from: f */
    public final void mo5008f(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            Time time = new Time();
            time.setToNow();
            Intent intent = new Intent();
            intent.putExtra("wl.extra.bluetoothle.address", str);
            intent.putExtra("wl.extra.bluetoothle.timing.hour.minute.second", (time.hour << 16) | (time.minute << 8) | time.second);
            intent.putExtra("wl.extra.bluetoothle.timing.weeks", time.weekDay);
            m1864a(context, "wl.action.bluetooth.le.system.time.status", intent, true, false);
        }
    }
}
