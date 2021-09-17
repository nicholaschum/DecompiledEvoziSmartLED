package p021wl.smartled.p024c;

import android.support.p007v4.internal.view.SupportMenu;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p021wl.smartled.SmartLedApplication;
import p021wl.smartled.beans.C0521b;
import p021wl.smartled.beans.C0524e;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p027f.C0552o;

/* renamed from: wl.smartled.c.a */
public class C0528a {

    /* renamed from: e */
    private static C0528a f2367e;

    /* renamed from: a */
    private List<C0524e> f2368a;

    /* renamed from: b */
    private List<C0521b> f2369b;

    /* renamed from: c */
    private String f2370c;

    /* renamed from: d */
    private int f2371d = 1;

    private C0528a() {
        m1796g();
    }

    /* renamed from: a */
    public static C0528a m1795a() {
        if (f2367e == null) {
            synchronized (C0528a.class) {
                if (f2367e == null) {
                    f2367e = new C0528a();
                }
            }
        }
        return f2367e;
    }

    /* renamed from: g */
    private void m1796g() {
        C0524e eVar;
        this.f2368a = new ArrayList();
        this.f2369b = SmartLedApplication.m1589b().mo4972c();
        if (this.f2369b == null) {
            m1797h();
            return;
        }
        try {
            for (C0521b next : this.f2369b) {
                int p = next.mo4898p();
                if (p < 0) {
                    if (p == -1) {
                        eVar = new C0524e(SmartLedApplication.m1588a().getString(C0462R.string.string_nearby_devices), (next.mo4898p() * -1) - 1);
                    } else if (p == -2) {
                        eVar = new C0524e(SmartLedApplication.m1588a().getString(C0462R.string.string_recent_devices), (next.mo4898p() * -1) - 1);
                        eVar.mo4902a(true);
                    } else {
                        eVar = new C0524e(next.mo4879e(), (next.mo4898p() * -1) - 1);
                    }
                    this.f2368a.add(0, eVar);
                } else {
                    this.f2368a.get((p >> 16) & SupportMenu.USER_MASK).mo4905c().add(new DeviceBean(next.mo4871b(), next.mo4874c(), DeviceBean.f2303a));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            SmartLedApplication.m1589b().mo4970b();
            m1797h();
        }
    }

    /* renamed from: h */
    private void m1797h() {
        this.f2369b = new ArrayList();
        this.f2368a.add(new C0524e(SmartLedApplication.m1588a().getString(C0462R.string.string_nearby_devices), 0));
        this.f2368a.add(new C0524e(SmartLedApplication.m1588a().getString(C0462R.string.string_recent_devices), 1));
        this.f2368a.get(1).mo4902a(true);
        C0521b bVar = new C0521b((String) null, (String) null, 0, this.f2368a.get(0).mo4903b(), -1);
        C0521b bVar2 = new C0521b((String) null, (String) null, 1, this.f2368a.get(1).mo4903b(), -2);
        this.f2369b.add(bVar2);
        this.f2369b.add(bVar);
        bVar.mo4869a(SmartLedApplication.m1589b().mo4968a(bVar));
        bVar2.mo4869a(SmartLedApplication.m1589b().mo4968a(bVar2));
    }

    /* renamed from: a */
    public final int mo4927a(String str) {
        C0524e eVar = new C0524e(str, this.f2368a.size());
        this.f2368a.add(eVar);
        C0521b bVar = new C0521b((String) null, (String) null, eVar.mo4899a(), str, (eVar.mo4899a() + 1) * -1);
        this.f2369b.add(0, bVar);
        bVar.mo4869a(SmartLedApplication.m1589b().mo4968a(bVar));
        return eVar.mo4899a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031 A[LOOP:0: B:8:0x0027->B:10:0x0031, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c8 A[LOOP:2: B:17:0x00c0->B:19:0x00c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00df A[LOOP:3: B:21:0x00dd->B:22:0x00df, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0143 A[LOOP:4: B:23:0x0131->B:25:0x0143, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x018a A[LOOP:5: B:26:0x0182->B:28:0x018a, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4928a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2371d
            r1 = 1
            if (r10 != r0) goto L_0x0015
            r9.f2371d = r1
            java.util.List<wl.smartled.beans.e> r0 = r9.f2368a
            int r2 = r9.f2371d
            java.lang.Object r0 = r0.get(r2)
        L_0x000f:
            wl.smartled.beans.e r0 = (p021wl.smartled.beans.C0524e) r0
            r0.mo4902a((boolean) r1)
            goto L_0x0025
        L_0x0015:
            int r0 = r9.f2371d
            if (r10 >= r0) goto L_0x0025
            int r0 = r9.f2371d
            int r0 = r0 - r1
            r9.f2371d = r0
            java.util.List<wl.smartled.beans.e> r0 = r9.f2368a
            java.lang.Object r0 = r0.get(r10)
            goto L_0x000f
        L_0x0025:
            r0 = 0
            r2 = 0
        L_0x0027:
            java.util.List<wl.smartled.beans.e> r3 = r9.f2368a
            int r3 = r3.size()
            int r3 = r3 - r10
            int r3 = r3 - r1
            if (r2 >= r3) goto L_0x0073
            java.util.List<wl.smartled.beans.b> r3 = r9.f2369b
            java.lang.Object r3 = r3.get(r2)
            wl.smartled.beans.b r3 = (p021wl.smartled.beans.C0521b) r3
            java.util.List<wl.smartled.beans.b> r4 = r9.f2369b
            java.lang.Object r4 = r4.get(r2)
            wl.smartled.beans.b r4 = (p021wl.smartled.beans.C0521b) r4
            int r4 = r4.mo4877d()
            int r4 = r4 - r1
            r3.mo4872b((int) r4)
            java.util.List<wl.smartled.beans.b> r3 = r9.f2369b
            java.lang.Object r3 = r3.get(r2)
            wl.smartled.beans.b r3 = (p021wl.smartled.beans.C0521b) r3
            java.util.List<wl.smartled.beans.b> r4 = r9.f2369b
            java.lang.Object r4 = r4.get(r2)
            wl.smartled.beans.b r4 = (p021wl.smartled.beans.C0521b) r4
            int r4 = r4.mo4898p()
            int r4 = r4 + r1
            r3.mo4894l(r4)
            wl.smartled.d.a r3 = p021wl.smartled.SmartLedApplication.m1589b()
            java.util.List<wl.smartled.beans.b> r4 = r9.f2369b
            java.lang.Object r4 = r4.get(r2)
            wl.smartled.beans.b r4 = (p021wl.smartled.beans.C0521b) r4
            r3.mo4971b(r4)
            int r2 = r2 + 1
            goto L_0x0027
        L_0x0073:
            wl.smartled.d.a r2 = p021wl.smartled.SmartLedApplication.m1589b()
            java.util.List<wl.smartled.beans.b> r3 = r9.f2369b
            java.util.List<wl.smartled.beans.e> r4 = r9.f2368a
            int r4 = r4.size()
            int r4 = r4 - r10
            int r4 = r4 - r1
            java.lang.Object r3 = r3.get(r4)
            wl.smartled.beans.b r3 = (p021wl.smartled.beans.C0521b) r3
            int r3 = r3.mo4868a()
            r2.mo4969a((int) r3)
            java.util.List<wl.smartled.beans.b> r2 = r9.f2369b
            java.util.List<wl.smartled.beans.e> r3 = r9.f2368a
            int r3 = r3.size()
            int r3 = r3 - r10
            int r3 = r3 - r1
            r2.remove(r3)
            java.util.List<wl.smartled.beans.e> r2 = r9.f2368a
            int r2 = r2.size()
            int r2 = r2 - r1
            r3 = r2
            r2 = 0
        L_0x00a4:
            if (r2 > r10) goto L_0x00bc
            if (r2 == 0) goto L_0x00b9
            java.util.List<wl.smartled.beans.e> r4 = r9.f2368a
            java.lang.Object r4 = r4.get(r2)
            wl.smartled.beans.e r4 = (p021wl.smartled.beans.C0524e) r4
            java.util.List r4 = r4.mo4905c()
            int r4 = r4.size()
            int r3 = r3 + r4
        L_0x00b9:
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00bc:
            int r2 = r10 + 1
            r4 = r2
            r5 = r3
        L_0x00c0:
            java.util.List<wl.smartled.beans.e> r6 = r9.f2368a
            int r6 = r6.size()
            if (r4 >= r6) goto L_0x00dc
            java.util.List<wl.smartled.beans.e> r6 = r9.f2368a
            java.lang.Object r6 = r6.get(r4)
            wl.smartled.beans.e r6 = (p021wl.smartled.beans.C0524e) r6
            java.util.List r6 = r6.mo4905c()
            int r6 = r6.size()
            int r5 = r5 + r6
            int r4 = r4 + 1
            goto L_0x00c0
        L_0x00dc:
            r4 = r3
        L_0x00dd:
            if (r4 >= r5) goto L_0x0131
            java.util.List<wl.smartled.beans.b> r6 = r9.f2369b
            java.lang.Object r6 = r6.get(r4)
            wl.smartled.beans.b r6 = (p021wl.smartled.beans.C0521b) r6
            java.util.List<wl.smartled.beans.b> r7 = r9.f2369b
            java.lang.Object r7 = r7.get(r4)
            wl.smartled.beans.b r7 = (p021wl.smartled.beans.C0521b) r7
            int r7 = r7.mo4877d()
            int r7 = r7 - r1
            r6.mo4872b((int) r7)
            java.util.List<wl.smartled.beans.b> r6 = r9.f2369b
            java.lang.Object r6 = r6.get(r4)
            wl.smartled.beans.b r6 = (p021wl.smartled.beans.C0521b) r6
            java.util.List<wl.smartled.beans.b> r7 = r9.f2369b
            java.lang.Object r7 = r7.get(r4)
            wl.smartled.beans.b r7 = (p021wl.smartled.beans.C0521b) r7
            int r7 = r7.mo4898p()
            r7 = r7 & 255(0xff, float:3.57E-43)
            java.util.List<wl.smartled.beans.b> r8 = r9.f2369b
            java.lang.Object r8 = r8.get(r4)
            wl.smartled.beans.b r8 = (p021wl.smartled.beans.C0521b) r8
            int r8 = r8.mo4877d()
            int r8 = r8 << 16
            r7 = r7 | r8
            r6.mo4894l(r7)
            wl.smartled.d.a r6 = p021wl.smartled.SmartLedApplication.m1589b()
            java.util.List<wl.smartled.beans.b> r7 = r9.f2369b
            java.lang.Object r7 = r7.get(r4)
            wl.smartled.beans.b r7 = (p021wl.smartled.beans.C0521b) r7
            r6.mo4971b(r7)
            int r4 = r4 + 1
            goto L_0x00dd
        L_0x0131:
            java.util.List<wl.smartled.beans.e> r4 = r9.f2368a
            java.lang.Object r4 = r4.get(r10)
            wl.smartled.beans.e r4 = (p021wl.smartled.beans.C0524e) r4
            java.util.List r4 = r4.mo4905c()
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x0182
            wl.smartled.d.a r4 = p021wl.smartled.SmartLedApplication.m1589b()
            java.util.List<wl.smartled.beans.b> r5 = r9.f2369b
            java.util.List<wl.smartled.beans.e> r6 = r9.f2368a
            java.lang.Object r6 = r6.get(r10)
            wl.smartled.beans.e r6 = (p021wl.smartled.beans.C0524e) r6
            java.util.List r6 = r6.mo4905c()
            int r6 = r6.size()
            int r6 = r3 - r6
            java.lang.Object r5 = r5.get(r6)
            wl.smartled.beans.b r5 = (p021wl.smartled.beans.C0521b) r5
            int r5 = r5.mo4868a()
            r4.mo4969a((int) r5)
            java.util.List<wl.smartled.beans.b> r4 = r9.f2369b
            java.util.List<wl.smartled.beans.e> r5 = r9.f2368a
            java.lang.Object r5 = r5.get(r10)
            wl.smartled.beans.e r5 = (p021wl.smartled.beans.C0524e) r5
            java.util.List r5 = r5.mo4905c()
            int r5 = r5.size()
            int r5 = r3 - r5
            r4.remove(r5)
            int r0 = r0 + 1
            goto L_0x0131
        L_0x0182:
            java.util.List<wl.smartled.beans.e> r0 = r9.f2368a
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x01a5
            java.util.List<wl.smartled.beans.e> r0 = r9.f2368a
            java.lang.Object r0 = r0.get(r2)
            wl.smartled.beans.e r0 = (p021wl.smartled.beans.C0524e) r0
            java.util.List<wl.smartled.beans.e> r3 = r9.f2368a
            java.lang.Object r3 = r3.get(r2)
            wl.smartled.beans.e r3 = (p021wl.smartled.beans.C0524e) r3
            int r3 = r3.mo4899a()
            int r3 = r3 - r1
            r0.mo4900a((int) r3)
            int r2 = r2 + 1
            goto L_0x0182
        L_0x01a5:
            java.util.List<wl.smartled.beans.e> r0 = r9.f2368a
            r0.remove(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.p024c.C0528a.mo4928a(int):void");
    }

    /* renamed from: a */
    public final void mo4929a(int i, int i2) {
        this.f2368a.get(i).mo4905c().remove(i2);
        int size = this.f2368a.size();
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 != 0) {
                size += this.f2368a.get(i3).mo4905c().size();
            }
        }
        int i4 = size + i2;
        SmartLedApplication.m1589b().mo4969a(this.f2369b.get(i4).mo4868a());
        this.f2369b.remove(i4);
        for (int i5 = i4; i5 < (i4 - i2) + this.f2368a.get(i).mo4905c().size(); i5++) {
            this.f2369b.get(i5).mo4894l(this.f2369b.get(i5).mo4898p() - 1);
            SmartLedApplication.m1589b().mo4971b(this.f2369b.get(i5));
        }
    }

    /* renamed from: a */
    public final void mo4930a(int i, String str) {
        C0524e eVar = this.f2368a.get(i);
        eVar.mo4901a(str);
        int a = eVar.mo4899a();
        for (C0521b next : this.f2369b) {
            if (next.mo4877d() == a) {
                next.mo4876c(str);
                SmartLedApplication.m1589b().mo4971b(next);
            }
        }
    }

    /* renamed from: a */
    public final void mo4931a(String str, int i, boolean z) {
        for (C0524e c : this.f2368a) {
            for (DeviceBean next : c.mo4905c()) {
                if (str != null && str.equals(next.getAddress())) {
                    next.setState(i);
                    next.setTime(0);
                    next.setConfirmConnected(z);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4932a(List<DeviceBean> list, int i) {
        for (DeviceBean a : list) {
            mo4933a(a, i, false, false);
        }
    }

    /* renamed from: a */
    public final void mo4933a(DeviceBean deviceBean, int i, boolean z, boolean z2) {
        if (z) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2368a.get(i).mo4905c().size()) {
                    break;
                } else if (this.f2368a.get(i).mo4905c().get(i2).getAddress().equals(deviceBean.getAddress())) {
                    mo4929a(i, i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (z || C0552o.m1927a(this.f2368a.get(i).mo4905c(), deviceBean.getAddress()) == null) {
            int size = this.f2368a.size();
            DeviceBean deviceBean2 = new DeviceBean(deviceBean);
            if (z2) {
                C0521b bVar = new C0521b(deviceBean.getAddress(), deviceBean.getDeviceName(), this.f2368a.get(i).mo4899a(), this.f2368a.get(i).mo4903b(), this.f2368a.get(i).mo4899a() << 16);
                for (int i3 = 0; i3 < i; i3++) {
                    if (i3 != 0) {
                        size += this.f2368a.get(i3).mo4905c().size();
                    }
                }
                for (int i4 = size; i4 < this.f2368a.get(i).mo4905c().size() + size; i4++) {
                    this.f2369b.get(i4).mo4894l(this.f2369b.get(i4).mo4898p() + 1);
                    SmartLedApplication.m1589b().mo4971b(this.f2369b.get(i4));
                }
                this.f2368a.get(i).mo4905c().add(0, deviceBean2);
                this.f2369b.add(size, bVar);
                bVar.mo4869a(SmartLedApplication.m1589b().mo4968a(bVar));
                return;
            }
            C0521b bVar2 = new C0521b(deviceBean.getAddress(), deviceBean.getDeviceName(), this.f2368a.get(i).mo4899a(), this.f2368a.get(i).mo4903b(), (this.f2368a.get(i).mo4899a() << 16) | this.f2368a.get(i).mo4905c().size());
            for (int i5 = 0; i5 <= i; i5++) {
                if (i5 != 0) {
                    size += this.f2368a.get(i5).mo4905c().size();
                }
            }
            this.f2368a.get(i).mo4905c().add(deviceBean2);
            this.f2369b.add(size, bVar2);
            bVar2.mo4869a(SmartLedApplication.m1589b().mo4968a(bVar2));
        }
    }

    /* renamed from: b */
    public final List<String> mo4934b(int i) {
        ArrayList arrayList = null;
        for (DeviceBean next : this.f2368a.get(i).mo4905c()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (next.getState() == DeviceBean.f2305c && next.isConfirmConnected()) {
                arrayList.add(next.getAddress());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final DeviceBean mo4935b() {
        for (DeviceBean next : this.f2368a.get(1).mo4905c()) {
            if (next.getState() == DeviceBean.f2305c && next.isConfirmConnected()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo4936b(String str) {
        this.f2370c = str;
        for (C0524e c : this.f2368a) {
            for (DeviceBean next : c.mo4905c()) {
                next.setSelected(next.getAddress().equals(str));
            }
        }
    }

    /* renamed from: c */
    public final List<String> mo4937c() {
        ArrayList arrayList = null;
        for (DeviceBean next : this.f2368a.get(1).mo4905c()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (next.getState() == DeviceBean.f2305c && next.isConfirmConnected()) {
                arrayList.add(next.getDeviceName());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo4938c(int i) {
        for (C0524e a : this.f2368a) {
            a.mo4902a(false);
        }
        this.f2368a.get(i).mo4902a(true);
        this.f2371d = i;
    }

    /* renamed from: c */
    public final boolean mo4939c(String str) {
        for (DeviceBean next : this.f2368a.get(1).mo4905c()) {
            if (next.getAddress().equals(str) && next.getState() == DeviceBean.f2305c && next.isConfirmConnected()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final List<C0524e> mo4940d() {
        return this.f2368a;
    }

    /* renamed from: e */
    public final List<String> mo4941e() {
        ArrayList arrayList = null;
        for (DeviceBean next : this.f2368a.get(this.f2371d).mo4905c()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (next.getState() == DeviceBean.f2305c && next.isConfirmConnected()) {
                arrayList.add(next.getAddress());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final int mo4942f() {
        HashSet hashSet = new HashSet();
        for (DeviceBean next : this.f2368a.get(0).mo4905c()) {
            if (next.getDeviceType() == DeviceBean.f2310h && next.getState() == DeviceBean.f2304b) {
                hashSet.add(next.getAddress());
            }
        }
        for (DeviceBean next2 : this.f2368a.get(1).mo4905c()) {
            if (next2.getDeviceType() == DeviceBean.f2310h && next2.getState() == DeviceBean.f2305c) {
                hashSet.add(next2.getAddress());
            }
        }
        return hashSet.size();
    }
}
