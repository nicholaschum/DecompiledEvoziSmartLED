package p021wl.smartled.service;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.support.p007v4.content.LocalBroadcastManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p021wl.smartled.beans.C0520a;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p022a.C0475a;
import p021wl.smartled.p027f.C0540c;
import p021wl.smartled.p027f.C0541d;
import p021wl.smartled.p027f.C0542e;

/* renamed from: wl.smartled.service.BluetoothLEService */
public class BluetoothLEService extends Service {

    /* renamed from: A */
    private static Set<String> f2543A = new HashSet();

    /* renamed from: B */
    private static Set<String> f2544B = new HashSet();

    /* renamed from: C */
    private static byte[] f2545C = new byte[25];

    /* renamed from: D */
    private static byte[] f2546D = new byte[25];

    /* renamed from: E */
    private static byte[] f2547E = new byte[9];

    /* renamed from: F */
    private static byte[] f2548F = new byte[16];

    /* renamed from: G */
    private static byte[] f2549G = new byte[12];

    /* renamed from: H */
    private static int f2550H;

    /* renamed from: I */
    private static int f2551I;

    /* renamed from: J */
    private static int f2552J;

    /* renamed from: K */
    private static final byte f2553K = ((byte) new Random().nextInt(256));

    /* renamed from: L */
    private static final byte f2554L = ((byte) new Random().nextInt(256));

    /* renamed from: M */
    private static final String f2555M = C0542e.m1903a(new byte[]{f2553K, f2554L});

    /* renamed from: N */
    private static List<String> f2556N = new ArrayList();

    /* renamed from: f */
    private static byte[] f2557f = new byte[9];

    /* renamed from: g */
    private static byte[] f2558g = new byte[9];
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static boolean f2559h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static boolean f2560i;

    /* renamed from: j */
    private static Set<String> f2561j = new HashSet();

    /* renamed from: k */
    private static Set<String> f2562k = new HashSet();

    /* renamed from: l */
    private static Set<String> f2563l = new HashSet();

    /* renamed from: s */
    private static boolean f2564s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static boolean f2565t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static boolean f2566u;

    /* renamed from: x */
    private static AdvertiseData f2567x;

    /* renamed from: y */
    private static AdvertiseData f2568y;

    /* renamed from: z */
    private static Map<String, C0520a> f2569z = new ConcurrentHashMap();

    /* renamed from: O */
    private ScheduledExecutorService f2570O = Executors.newScheduledThreadPool(1);

    /* renamed from: P */
    private ExecutorService f2571P = Executors.newFixedThreadPool(6);

    /* renamed from: Q */
    private BroadcastReceiver f2572Q = new C0579f(this);

    /* renamed from: R */
    private BroadcastReceiver f2573R = new C0580g(this);
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Handler f2574S = new C0581h(this);

    /* renamed from: T */
    private BluetoothAdapter.LeScanCallback f2575T = new C0584k(this);

    /* renamed from: U */
    private BluetoothGattCallback f2576U = new C0586m(this);

    /* renamed from: V */
    private AdvertiseCallback f2577V = new C0587n(this);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f2578a = false;

    /* renamed from: b */
    private boolean f2579b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public BluetoothAdapter f2580c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f2581d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C0475a f2582e;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map<String, BluetoothGatt> f2583m = new ConcurrentHashMap();

    /* renamed from: n */
    private final List<String> f2584n = new CopyOnWriteArrayList();

    /* renamed from: o */
    private boolean f2585o;

    /* renamed from: p */
    private BluetoothLeScanner f2586p;

    /* renamed from: q */
    private ScanCallback f2587q;

    /* renamed from: r */
    private ScanSettings f2588r;

    /* renamed from: v */
    private AdvertiseSettings f2589v;

    /* renamed from: w */
    private BluetoothLeAdvertiser f2590w;

    /* renamed from: a */
    private void m2016a(Intent intent, boolean z) {
        Set<String> set;
        Set<String> set2;
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("wl.extra.bluetoothle.address.list");
        f2544B.clear();
        f2543A.clear();
        f2562k.clear();
        f2561j.clear();
        if (stringArrayListExtra != null) {
            for (String next : stringArrayListExtra) {
                if (next != null && !next.isEmpty()) {
                    if (f2569z.get(next) != null) {
                        set2 = z ? f2544B : f2543A;
                    } else if (this.f2583m.get(next) != null) {
                        set2 = z ? f2562k : f2561j;
                    }
                    set2.add(next);
                }
            }
        }
        String stringExtra = intent.getStringExtra("wl.extra.bluetoothle.address");
        if (stringExtra != null && !stringExtra.isEmpty()) {
            if (f2569z.get(stringExtra) != null) {
                set = z ? f2544B : f2543A;
            } else if (this.f2583m.get(stringExtra) == null) {
                return;
            } else {
                if (z) {
                    set = f2562k;
                } else {
                    f2561j.add(stringExtra);
                    return;
                }
            }
            set.add(stringExtra);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m2017a(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            int intExtra = intent.getIntExtra("wl.extra.bluetoothle.color", 0);
            f2558g[0] = 126;
            f2558g[1] = 7;
            f2558g[2] = 5;
            f2558g[3] = 3;
            f2558g[4] = (byte) ((intExtra >> 16) & 255);
            f2558g[5] = (byte) ((intExtra >> 8) & 255);
            f2558g[6] = (byte) (intExtra & 255);
            f2558g[7] = 16;
            f2558g[8] = -17;
            f2560i = true;
            bluetoothLEService.m2016a(intent, false);
            bluetoothLEService.m2020a(f2558g, false);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m2018a(BluetoothLEService bluetoothLEService, Intent intent, boolean z) {
        String stringExtra = intent.getStringExtra("wl.extra.bluetoothle.address");
        BluetoothGatt bluetoothGatt = bluetoothLEService.f2583m.get(stringExtra);
        if (!f2563l.contains(stringExtra)) {
            return;
        }
        if (z) {
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
                bluetoothLEService.f2583m.remove(stringExtra);
                if (bluetoothLEService.f2582e != null) {
                    bluetoothLEService.f2582e.mo4745a(bluetoothGatt.getDevice().getName(), stringExtra, m2022b(DeviceBean.f2308f));
                }
                bluetoothGatt = null;
            }
            if (bluetoothGatt == null) {
                bluetoothLEService.f2583m.put(stringExtra, bluetoothLEService.f2580c.getRemoteDevice(stringExtra).connectGatt(bluetoothLEService, false, bluetoothLEService.f2576U));
                return;
            }
            bluetoothGatt.connect();
        } else if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            bluetoothGatt.close();
            bluetoothLEService.f2583m.remove(stringExtra);
            if (bluetoothLEService.f2582e != null) {
                bluetoothLEService.f2582e.mo4745a(bluetoothGatt.getDevice().getName(), stringExtra, m2022b(DeviceBean.f2308f));
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m2019a(BluetoothLEService bluetoothLEService, String str, String str2, byte[] bArr) {
        if (str == null) {
            return;
        }
        if (str.startsWith("ELK-")) {
            f2563l.add(str2);
            if (bluetoothLEService.f2582e != null) {
                bluetoothLEService.f2582e.mo4744a(str, str2);
            }
        } else if (str.startsWith("ELK_")) {
            bluetoothLEService.f2571P.execute(new C0585l(bluetoothLEService, str, str2, bArr));
        }
    }

    /* renamed from: a */
    private void m2020a(byte[] bArr, boolean z) {
        int i;
        Set<String> set;
        if (Build.VERSION.SDK_INT >= 21 && this.f2590w != null) {
            if (f2543A.size() > 0 || f2544B.size() > 0) {
                f2545C[0] = (byte) f2550H;
                f2545C[1] = -80;
                f2545C[2] = f2553K;
                f2545C[3] = f2554L;
                for (int i2 = 0; i2 < 9; i2++) {
                    byte[] bArr2 = f2547E;
                    byte b = bArr[i2];
                    f2545C[i2 + 4] = b;
                    bArr2[i2] = b;
                }
                if (z) {
                    i = 0;
                    for (String str : f2544B) {
                        C0520a aVar = f2569z.get(str);
                        if (!(aVar == null || aVar.f2323d == null)) {
                            byte[] a = C0542e.m1904a(aVar.f2323d);
                            if (a.length == 2 && i < 16) {
                                int i3 = i + 1;
                                f2548F[i] = a[0];
                                f2548F[i3] = a[1];
                                i = i3 + 1;
                            }
                        }
                    }
                    set = f2544B;
                } else {
                    i = 0;
                    for (String str2 : f2543A) {
                        C0520a aVar2 = f2569z.get(str2);
                        if (!(aVar2 == null || aVar2.f2323d == null)) {
                            byte[] a2 = C0542e.m1904a(aVar2.f2323d);
                            if (a2.length == 2 && i < 16) {
                                int i4 = i + 1;
                                f2548F[i] = a2[0];
                                f2548F[i4] = a2[1];
                                i = i4 + 1;
                            }
                        }
                    }
                    set = f2543A;
                }
                set.clear();
                while (i < 16) {
                    f2548F[i] = 0;
                    i++;
                }
                C0540c.m1901a(f2548F, f2549G);
                for (int i5 = 0; i5 < 12; i5++) {
                    f2545C[i5 + 13] = f2549G[i5];
                }
                C0541d.m1902a(f2545C, 1, 24, f2550H);
                int i6 = f2550H;
                f2550H = i6 + 1;
                if (i6 > 255) {
                    f2550H = 0;
                }
                if (z) {
                    f2568y = new AdvertiseData.Builder().addManufacturerData(48872, f2545C).setIncludeDeviceName(false).setIncludeTxPowerLevel(false).build();
                    f2566u = true;
                    return;
                }
                f2567x = new AdvertiseData.Builder().addManufacturerData(48872, f2545C).setIncludeDeviceName(false).setIncludeTxPowerLevel(false).build();
                f2565t = true;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m2022b(int i) {
        int i2 = DeviceBean.f2303a;
        switch (i) {
            case 0:
                return DeviceBean.f2308f;
            case 1:
                return DeviceBean.f2304b;
            case 2:
                return DeviceBean.f2305c;
            case 3:
                return DeviceBean.f2307e;
            default:
                return i2;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m2024b(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            int intExtra = (int) (((float) (intent.getIntExtra("wl.extra.bluetoothle.color", 0) * intent.getIntExtra("wl.extra.bluetoothle.brightness", 0))) / 100.0f);
            f2558g[0] = 126;
            f2558g[1] = 7;
            f2558g[2] = 5;
            f2558g[3] = 3;
            f2558g[4] = (byte) ((intExtra >> 16) & 255);
            f2558g[5] = (byte) ((intExtra >> 8) & 255);
            f2558g[6] = (byte) (intExtra & 255);
            f2558g[7] = 32;
            f2558g[8] = -17;
            f2560i = true;
            bluetoothLEService.m2016a(intent, false);
            bluetoothLEService.m2020a(f2558g, false);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m2025b(BluetoothLEService bluetoothLEService, String str, String str2, byte[] bArr) {
        int i;
        C0520a aVar = f2569z.get(str2);
        if (aVar != null) {
            aVar.mo4867a(str, str2, bArr);
        } else {
            aVar = new C0520a(str, str2, bArr);
            f2569z.put(str2, aVar);
        }
        boolean z = false;
        boolean z2 = true;
        if (aVar.f2322c == null) {
            i = DeviceBean.f2303a;
            z2 = false;
        } else if (aVar.f2322c.equals(f2555M)) {
            i = DeviceBean.f2305c;
            z = true;
        } else {
            i = DeviceBean.f2308f;
        }
        if (bluetoothLEService.f2582e != null) {
            bluetoothLEService.f2582e.mo4744a(str, str2);
            if (z2) {
                bluetoothLEService.f2582e.mo4745a(str, str2, i);
                if (z) {
                    bluetoothLEService.f2582e.mo4746a(str2, (byte[]) null);
                }
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m2027c(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2558g[0] = 126;
            f2558g[1] = 4;
            f2558g[2] = 1;
            f2558g[3] = (byte) intent.getIntExtra("wl.extra.bluetoothle.brightness", 0);
            f2558g[4] = (byte) intent.getIntExtra("wl.extra.bluetoothle.light.mode", 255);
            f2558g[5] = -1;
            f2558g[6] = -1;
            f2558g[7] = 0;
            f2558g[8] = -17;
            f2560i = true;
            bluetoothLEService.m2016a(intent, false);
            bluetoothLEService.m2020a(f2558g, false);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m2030d(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2557f[0] = 126;
            f2557f[1] = 5;
            f2557f[2] = 3;
            f2557f[3] = (byte) (intent.getIntExtra("wl.extra.bluetoothle.mode", 0) + 128);
            f2557f[4] = 3;
            f2557f[5] = -1;
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m2033e(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2558g[0] = 126;
            f2558g[1] = 4;
            f2558g[2] = 2;
            f2558g[3] = (byte) intent.getIntExtra("wl.extra.bluetoothle.mode.change.speed", 0);
            f2558g[4] = -1;
            f2558g[5] = -1;
            f2558g[6] = -1;
            f2558g[7] = 0;
            f2558g[8] = -17;
            f2560i = true;
            bluetoothLEService.m2016a(intent, false);
            bluetoothLEService.m2020a(f2558g, false);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m2036f(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2557f[0] = 126;
            f2557f[1] = 4;
            f2557f[2] = 4;
            f2557f[3] = intent.getBooleanExtra("wl.extra.bluetoothle.light.on", false) ? (byte) 1 : 0;
            f2557f[4] = 0;
            f2557f[5] = intent.getBooleanExtra("wl.extra.bluetoothle.light.on", false) ? (byte) 1 : 0;
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m2038g(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2558g[0] = 126;
            f2558g[1] = 6;
            f2558g[2] = 5;
            f2558g[3] = 2;
            f2558g[4] = (byte) intent.getIntExtra("wl.extra.bluetoothle.color.warm", 0);
            f2558g[5] = (byte) intent.getIntExtra("wl.extra.bluetoothle.color.cold", 0);
            f2558g[6] = -1;
            f2558g[7] = 16;
            f2558g[8] = -17;
            f2560i = true;
            bluetoothLEService.m2016a(intent, false);
            bluetoothLEService.m2020a(f2558g, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m2041h() {
        if (this.f2581d) {
            for (String str : f2562k) {
                BluetoothGatt bluetoothGatt = this.f2583m.get(str);
                if (bluetoothGatt != null) {
                    Iterator<BluetoothGattService> it = bluetoothGatt.getServices().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BluetoothGattService next = it.next();
                        UUID uuid = next.getUuid();
                        if (uuid != null && "0000fff0-0000-1000-8000-00805f9b34fb".equals(uuid.toString())) {
                            Iterator<BluetoothGattCharacteristic> it2 = next.getCharacteristics().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                BluetoothGattCharacteristic next2 = it2.next();
                                UUID uuid2 = next2.getUuid();
                                if (uuid2 != null && "0000fff3-0000-1000-8000-00805f9b34fb".equals(uuid2.toString())) {
                                    if (f2559h) {
                                        try {
                                            Thread.sleep(5);
                                        } catch (InterruptedException e) {
                                            e.printStackTrace();
                                        }
                                        next2.setValue(f2557f);
                                        bluetoothGatt.writeCharacteristic(next2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            f2559h = false;
            f2562k.clear();
            for (String str2 : f2561j) {
                BluetoothGatt bluetoothGatt2 = this.f2583m.get(str2);
                if (bluetoothGatt2 != null) {
                    Iterator<BluetoothGattService> it3 = bluetoothGatt2.getServices().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        BluetoothGattService next3 = it3.next();
                        UUID uuid3 = next3.getUuid();
                        if (uuid3 != null && "0000fff0-0000-1000-8000-00805f9b34fb".equals(uuid3.toString())) {
                            Iterator<BluetoothGattCharacteristic> it4 = next3.getCharacteristics().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                BluetoothGattCharacteristic next4 = it4.next();
                                UUID uuid4 = next4.getUuid();
                                if (uuid4 != null && "0000fff3-0000-1000-8000-00805f9b34fb".equals(uuid4.toString())) {
                                    if (f2560i) {
                                        try {
                                            Thread.sleep(5);
                                        } catch (InterruptedException e2) {
                                            e2.printStackTrace();
                                        }
                                        next4.setValue(f2558g);
                                        bluetoothGatt2.writeCharacteristic(next4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            f2560i = false;
            f2561j.clear();
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m2043h(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2558g[0] = 126;
            f2558g[1] = 5;
            f2558g[2] = 5;
            f2558g[3] = 1;
            f2558g[4] = (byte) intent.getIntExtra("wl.extra.bluetoothle.single.color", 0);
            f2558g[5] = -1;
            f2558g[6] = -1;
            f2558g[7] = 16;
            f2558g[8] = -17;
            f2560i = true;
            bluetoothLEService.m2016a(intent, false);
            bluetoothLEService.m2020a(f2558g, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m2044i() {
        if (this.f2580c != null && this.f2581d && this.f2585o) {
            if (Build.VERSION.SDK_INT < 21) {
                try {
                    this.f2580c.stopLeScan(this.f2575T);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (this.f2586p != null) {
                this.f2586p.stopScan(this.f2587q);
                this.f2586p = null;
            }
            this.f2585o = false;
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m2045i(BluetoothLEService bluetoothLEService) {
        String str;
        String str2;
        AdvertiseData advertiseData;
        int i;
        if (bluetoothLEService.f2581d && Build.VERSION.SDK_INT >= 21 && bluetoothLEService.f2590w != null) {
            int i2 = f2551I + 1;
            f2551I = i2;
            if (i2 >= 12) {
                f2551I = 0;
                bluetoothLEService.m2047j();
                BluetoothLeAdvertiser bluetoothLeAdvertiser = bluetoothLEService.f2590w;
                AdvertiseSettings advertiseSettings = bluetoothLEService.f2589v;
                if (Build.VERSION.SDK_INT < 21 || bluetoothLEService.f2590w == null) {
                    advertiseData = null;
                } else {
                    f2546D[0] = (byte) f2550H;
                    f2546D[1] = -80;
                    f2546D[2] = f2553K;
                    f2546D[3] = f2554L;
                    for (int i3 = 0; i3 < 9; i3++) {
                        f2546D[i3 + 4] = 0;
                    }
                    if (bluetoothLEService.f2582e != null) {
                        f2556N.clear();
                        bluetoothLEService.f2582e.mo4747a(f2556N);
                        i = 0;
                        for (String str3 : f2556N) {
                            C0520a aVar = f2569z.get(str3);
                            if (!(aVar == null || aVar.f2323d == null)) {
                                byte[] a = C0542e.m1904a(aVar.f2323d);
                                if (a.length == 2 && i < 16) {
                                    int i4 = i + 1;
                                    f2548F[i] = a[0];
                                    f2548F[i4] = a[1];
                                    i = i4 + 1;
                                }
                            }
                        }
                    } else {
                        i = 0;
                    }
                    while (i < 16) {
                        f2548F[i] = 0;
                        i++;
                    }
                    C0540c.m1901a(f2548F, f2549G);
                    for (int i5 = 0; i5 < 12; i5++) {
                        f2546D[i5 + 13] = f2549G[i5];
                    }
                    C0541d.m1902a(f2546D, 1, 24, f2550H);
                    int i6 = f2550H;
                    f2550H = i6 + 1;
                    if (i6 > 255) {
                        f2550H = 0;
                    }
                    advertiseData = new AdvertiseData.Builder().addManufacturerData(48872, f2546D).setIncludeDeviceName(false).setIncludeTxPowerLevel(false).build();
                }
                bluetoothLeAdvertiser.startAdvertising(advertiseSettings, advertiseData, bluetoothLEService.f2577V);
                f2564s = true;
                Log.v("BluetoothLEService", "Start HeartBeat Advertise");
                return;
            }
            if (f2552J % 2 == 0 || !f2565t) {
                if (f2566u) {
                    bluetoothLEService.m2047j();
                    bluetoothLEService.f2590w.startAdvertising(bluetoothLEService.f2589v, f2568y, bluetoothLEService.f2577V);
                    f2564s = true;
                    f2566u = false;
                    str = "BluetoothLEService";
                    str2 = "Start Adv Command Advertise";
                }
                f2552J++;
            }
            bluetoothLEService.m2047j();
            bluetoothLEService.f2590w.startAdvertising(bluetoothLEService.f2589v, f2567x, bluetoothLEService.f2577V);
            f2564s = true;
            f2565t = false;
            str = "BluetoothLEService";
            str2 = "Start Adv Data Advertise";
            Log.v(str, str2);
            f2552J++;
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m2046i(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            int intExtra = intent.getIntExtra("wl.extra.bluetoothle.rgbw.on", 255);
            int i = ((intExtra >> 16) & 1) == 1 ? 1 : 0;
            int i2 = (intExtra & 1) == 1 ? 1 : 0;
            int i3 = ((intExtra >> 8) & 1) == 1 ? 1 : 0;
            int i4 = i != 0 ? 224 : 0;
            if (i2 != 0) {
                i4 |= 16;
            }
            int intExtra2 = intent.getIntExtra("wl.extra.bluetoothle.light.mode", 0);
            switch (intExtra2) {
                case 0:
                case 1:
                    i3 = i;
                    break;
                case 2:
                    i3 = i2;
                    break;
                case 3:
                    break;
                default:
                    i3 = 0;
                    break;
            }
            f2557f[0] = 126;
            f2557f[1] = 4;
            f2557f[2] = 4;
            f2557f[3] = (byte) i4;
            f2557f[4] = (byte) intExtra2;
            f2557f[5] = (byte) i3;
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m2047j() {
        if (Build.VERSION.SDK_INT >= 21 && this.f2590w != null && f2564s) {
            this.f2590w.stopAdvertising(this.f2577V);
            f2564s = false;
            Log.v("BluetoothLEService", "Stop Advertise");
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m2048j(BluetoothLEService bluetoothLEService) {
        if (bluetoothLEService.f2580c != null && bluetoothLEService.f2581d && !bluetoothLEService.f2585o) {
            if (Build.VERSION.SDK_INT < 21) {
                try {
                    bluetoothLEService.f2580c.startLeScan(bluetoothLEService.f2575T);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                if (bluetoothLEService.f2586p == null) {
                    bluetoothLEService.f2586p = bluetoothLEService.f2580c.getBluetoothLeScanner();
                }
                if (bluetoothLEService.f2587q == null) {
                    bluetoothLEService.f2587q = new C0588o(bluetoothLEService, (byte) 0);
                }
                if (bluetoothLEService.f2588r == null) {
                    bluetoothLEService.f2588r = new ScanSettings.Builder().setScanMode(2).setReportDelay(0).build();
                }
                bluetoothLEService.f2586p.startScan((List) null, bluetoothLEService.f2588r, bluetoothLEService.f2587q);
            }
            bluetoothLEService.f2585o = true;
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m2049j(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            int intExtra = intent.getIntExtra("wl.extra.bluetoothle.rgb.pin.sequence", 66051);
            f2557f[0] = 126;
            f2557f[1] = 6;
            f2557f[2] = -127;
            f2557f[3] = (byte) ((intExtra >> 16) & 255);
            f2557f[4] = (byte) ((intExtra >> 8) & 255);
            f2557f[5] = (byte) (intExtra & 255);
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: k */
    static /* synthetic */ void m2051k(BluetoothLEService bluetoothLEService, Intent intent) {
        String stringExtra = intent.getStringExtra("wl.extra.bluetoothle.address");
        BluetoothGatt bluetoothGatt = bluetoothLEService.f2583m.get(stringExtra);
        if (f2563l.contains(stringExtra) && bluetoothGatt != null) {
            bluetoothGatt.close();
            bluetoothLEService.f2583m.remove(stringExtra);
            if (bluetoothLEService.f2582e != null) {
                bluetoothLEService.f2582e.mo4745a(bluetoothGatt.getDevice().getName(), stringExtra, m2022b(DeviceBean.f2308f));
            }
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m2052l(BluetoothLEService bluetoothLEService, Intent intent) {
        String stringExtra = intent.getStringExtra("wl.extra.bluetoothle.address");
        BluetoothGatt bluetoothGatt = bluetoothLEService.f2583m.get(stringExtra);
        if (f2563l.contains(stringExtra) && bluetoothGatt != null) {
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                UUID uuid = next.getUuid();
                if (uuid != null && "0000fff0-0000-1000-8000-00805f9b34fb".equals(uuid.toString())) {
                    for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                        UUID uuid2 = next2.getUuid();
                        if (uuid2 != null && "0000fff3-0000-1000-8000-00805f9b34fb".equals(uuid2.toString())) {
                            bluetoothGatt.readCharacteristic(next2);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    static /* synthetic */ void m2053m(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            int intExtra = intent.getIntExtra("wl.extra.bluetoothle.timing.hour.minute.second", 0);
            f2557f[0] = 126;
            f2557f[1] = 8;
            f2557f[2] = -126;
            f2557f[3] = (byte) ((intExtra >> 16) & 255);
            f2557f[4] = (byte) ((intExtra >> 8) & 255);
            f2557f[5] = (byte) (intExtra & 255);
            f2557f[6] = (byte) intent.getIntExtra("wl.extra.bluetoothle.timing.mode", 0);
            f2557f[7] = (byte) intent.getIntExtra("wl.extra.bluetoothle.timing.weeks", 0);
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m2054n(BluetoothLEService bluetoothLEService, Intent intent) {
        String stringExtra = intent.getStringExtra("wl.extra.bluetoothle.address");
        BluetoothGatt bluetoothGatt = bluetoothLEService.f2583m.get(stringExtra);
        C0520a aVar = f2569z.get(stringExtra);
        if (aVar != null && aVar.f2325f != null) {
            byte[] bArr = aVar.f2325f.get(-123);
            if (bArr != null && bArr.length >= 6 && bluetoothLEService.f2582e != null) {
                bluetoothLEService.f2582e.mo4746a(stringExtra, new byte[]{126, 9, -123, bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5]});
            }
        } else if (bluetoothGatt != null) {
            for (BluetoothGattService next : bluetoothGatt.getServices()) {
                UUID uuid = next.getUuid();
                if (uuid != null && "0000fff0-0000-1000-8000-00805f9b34fb".equals(uuid.toString())) {
                    for (BluetoothGattCharacteristic next2 : next.getCharacteristics()) {
                        UUID uuid2 = next2.getUuid();
                        if (uuid2 != null && "0000fff3-0000-1000-8000-00805f9b34fb".equals(uuid2.toString())) {
                            bluetoothGatt.readCharacteristic(next2);
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: o */
    static /* synthetic */ void m2055o(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            int intExtra = intent.getIntExtra("wl.extra.bluetoothle.timing.hour.minute.second", 0);
            f2557f[0] = 126;
            f2557f[1] = 7;
            f2557f[2] = -125;
            f2557f[3] = (byte) ((intExtra >> 16) & 255);
            f2557f[4] = (byte) ((intExtra >> 8) & 255);
            f2557f[5] = (byte) (intExtra & 255);
            f2557f[6] = (byte) intent.getIntExtra("wl.extra.bluetoothle.timing.weeks", 0);
            f2557f[7] = -1;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: p */
    static /* synthetic */ void m2056p(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2557f[0] = 126;
            f2557f[1] = 4;
            f2557f[2] = 6;
            f2557f[3] = (byte) intent.getIntExtra("wl.extra.bluetoothle.streaming.external.mic.sensitive", 0);
            f2557f[4] = -1;
            f2557f[5] = -1;
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m2057q(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2557f[0] = 126;
            f2557f[1] = 4;
            f2557f[2] = 7;
            f2557f[3] = intent.getBooleanExtra("wl.extra.bluetoothle.streaming.external.mic.on.off", false) ? (byte) 1 : 0;
            f2557f[4] = -1;
            f2557f[5] = -1;
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            f2560i = false;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: r */
    static /* synthetic */ void m2058r(BluetoothLEService bluetoothLEService, Intent intent) {
        if (bluetoothLEService.f2580c != null) {
            f2557f[0] = 126;
            f2557f[1] = 5;
            f2557f[2] = 3;
            f2557f[3] = (byte) (intent.getIntExtra("wl.extra.bluetoothle.streaming.external.mic.eq.mode", 0) + 128);
            f2557f[4] = 4;
            f2557f[5] = -1;
            f2557f[6] = -1;
            f2557f[7] = 0;
            f2557f[8] = -17;
            f2559h = true;
            bluetoothLEService.m2016a(intent, true);
            bluetoothLEService.m2020a(f2557f, true);
            bluetoothLEService.m2041h();
        }
    }

    /* renamed from: a */
    public final void mo5076a(Intent intent) {
        this.f2574S.post(new C0583j(this, intent));
    }

    /* renamed from: a */
    public final void mo5077a(C0475a aVar) {
        this.f2582e = aVar;
    }

    /* renamed from: a */
    public final boolean mo5078a() {
        return this.f2581d;
    }

    /* renamed from: b */
    public final void mo5079b() {
        if (this.f2579b && !this.f2581d && this.f2580c != null) {
            if (!this.f2580c.isEnabled()) {
                LocalBroadcastManager.getInstance(this).sendBroadcast(new Intent("wl.action.ACTION_REQUEST_ENABLE_BLUETOOTH"));
                return;
            }
            this.f2581d = true;
            if (this.f2582e != null) {
                this.f2582e.mo4748a(this.f2581d);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo5080c() {
        return this.f2579b;
    }

    public IBinder onBind(Intent intent) {
        return new C0589p(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r8 = this;
            super.onCreate()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "android.hardware.bluetooth_le"
            boolean r0 = r0.hasSystemFeature(r1)
            r1 = 0
            if (r0 != 0) goto L_0x001b
            r0 = 2131492910(0x7f0c002e, float:1.8609285E38)
        L_0x0013:
            p021wl.smartled.p027f.C0551n.m1925a(r8, r0)
            r8.stopSelf()
            r0 = 0
            goto L_0x0032
        L_0x001b:
            java.lang.String r0 = "bluetooth"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            r8.f2580c = r0
            android.bluetooth.BluetoothAdapter r0 = r8.f2580c
            if (r0 != 0) goto L_0x0031
            r0 = 2131492911(0x7f0c002f, float:1.8609287E38)
            goto L_0x0013
        L_0x0031:
            r0 = 1
        L_0x0032:
            if (r0 == 0) goto L_0x00a2
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r2 = "wl.action.ACTION_CHECK_PERMISSION"
            r0.addAction(r2)
            java.lang.String r2 = "wl.action.ACTION_REQUEST_PERMISSION_RESULT"
            r0.addAction(r2)
            android.support.v4.content.LocalBroadcastManager r2 = android.support.p007v4.content.LocalBroadcastManager.getInstance(r8)
            android.content.BroadcastReceiver r3 = r8.f2573R
            r2.registerReceiver(r3, r0)
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r2 = "android.bluetooth.adapter.action.STATE_CHANGED"
            r0.addAction(r2)
            android.content.BroadcastReceiver r2 = r8.f2572Q
            r8.registerReceiver(r2, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x0088
            android.bluetooth.BluetoothAdapter r0 = r8.f2580c
            android.bluetooth.le.BluetoothLeAdvertiser r0 = r0.getBluetoothLeAdvertiser()
            r8.f2590w = r0
            android.bluetooth.le.AdvertiseSettings$Builder r0 = new android.bluetooth.le.AdvertiseSettings$Builder
            r0.<init>()
            r2 = 2
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setAdvertiseMode(r2)
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setConnectable(r1)
            r1 = 1000(0x3e8, float:1.401E-42)
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setTimeout(r1)
            r1 = 3
            android.bluetooth.le.AdvertiseSettings$Builder r0 = r0.setTxPowerLevel(r1)
            android.bluetooth.le.AdvertiseSettings r0 = r0.build()
            r8.f2589v = r0
        L_0x0088:
            p021wl.smartled.p027f.C0549l.m1919a(r8)
            java.util.concurrent.ScheduledExecutorService r1 = r8.f2570O
            wl.smartled.service.i r2 = new wl.smartled.service.i
            r2.<init>(r8)
            r3 = 0
            r5 = 80
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1.scheduleAtFixedRate(r2, r3, r5, r7)
            java.lang.String r0 = "BluetoothLEService"
            java.lang.String r1 = "onCreate"
            android.util.Log.d(r0, r1)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.service.BluetoothLEService.onCreate():void");
    }

    public void onDestroy() {
        this.f2579b = false;
        this.f2574S.removeCallbacksAndMessages((Object) null);
        m2044i();
        if (this.f2572Q != null) {
            unregisterReceiver(this.f2572Q);
            this.f2572Q = null;
        }
        if (this.f2573R != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f2573R);
            this.f2573R = null;
        }
        this.f2570O.shutdownNow();
        m2047j();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f2579b = true;
        return super.onStartCommand(intent, 2, i2);
    }
}
