package p021wl.smartled.activity;

import android.content.Context;
import android.util.Log;
import java.util.TimerTask;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p027f.C0538a;

/* renamed from: wl.smartled.activity.l */
final class C0489l extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ MainActivity f2171a;

    C0489l(MainActivity mainActivity) {
        this.f2171a = mainActivity;
    }

    public final void run() {
        boolean z;
        C0538a a;
        MainActivity mainActivity;
        String address;
        Log.d("MainActivity", "scheduleAtFixedRate");
        synchronized (this.f2171a.f2088O) {
            z = false;
            for (int i = 0; i < this.f2171a.f2089P.size(); i++) {
                DeviceBean deviceBean = (DeviceBean) this.f2171a.f2089P.get(i);
                if (deviceBean.getState() == DeviceBean.f2304b) {
                    deviceBean.setTime(deviceBean.getTime() + 500);
                    if (deviceBean.getTime() >= 8000) {
                        Log.d("MainActivity", "scheduleAtFixedRate --> connecting timeout = " + deviceBean.getAddress());
                        deviceBean.setTime(0);
                        if (deviceBean.getDeviceType() == DeviceBean.f2310h) {
                            int tryConnectTimes = deviceBean.getTryConnectTimes();
                            if (tryConnectTimes >= 4) {
                                deviceBean.setState(DeviceBean.f2303a);
                                C0528a.m1795a().mo4931a(deviceBean.getAddress(), deviceBean.getState(), false);
                            } else {
                                deviceBean.setTryConnectTimes(tryConnectTimes + 1);
                            }
                        } else {
                            deviceBean.setState(DeviceBean.f2303a);
                            C0528a.m1795a().mo4931a(deviceBean.getAddress(), deviceBean.getState(), false);
                            C0538a.m1861a().mo4981a((Context) this.f2171a, deviceBean.getAddress());
                        }
                        z = true;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f2171a.f2090Q.size(); i2++) {
                DeviceBean deviceBean2 = (DeviceBean) this.f2171a.f2090Q.get(i2);
                deviceBean2.setTime(deviceBean2.getTime() + 500);
                if (deviceBean2.getState() != DeviceBean.f2307e) {
                    if (deviceBean2.getState() == DeviceBean.f2306d) {
                        if (deviceBean2.getTime() >= 5000) {
                            Log.d("MainActivity", "scheduleAtFixedRate --> connection timeout1 = " + deviceBean2.getAddress());
                            C0538a.m1861a().mo5006e(this.f2171a, deviceBean2.getAddress());
                            deviceBean2.setTime(0);
                            deviceBean2.setState(DeviceBean.f2307e);
                            C0528a.m1795a().mo4931a(deviceBean2.getAddress(), deviceBean2.getState(), false);
                        } else if (deviceBean2.getTime() >= 1000) {
                            Log.d("MainActivity", "scheduleAtFixedRate --> reading connection2 = " + deviceBean2.getAddress());
                            a = C0538a.m1861a();
                            mainActivity = this.f2171a;
                            address = deviceBean2.getAddress();
                        }
                    } else {
                        if (deviceBean2.getState() == DeviceBean.f2305c) {
                            if (!deviceBean2.isConfirmConnected()) {
                                if (deviceBean2.getTime() >= 1000) {
                                    Log.d("MainActivity", "scheduleAtFixedRate --> reading connection1 = " + deviceBean2.getAddress());
                                    deviceBean2.setTime(0);
                                    deviceBean2.setState(DeviceBean.f2306d);
                                    C0528a.m1795a().mo4931a(deviceBean2.getAddress(), deviceBean2.getState(), deviceBean2.isConfirmConnected());
                                    a = C0538a.m1861a();
                                    mainActivity = this.f2171a;
                                    address = deviceBean2.getAddress();
                                }
                            } else if (deviceBean2.getDeviceType() == DeviceBean.f2310h && deviceBean2.getTime() >= 8000) {
                                Log.d("MainActivity", "scheduleAtFixedRate --> checking broadcast = " + deviceBean2.getAddress());
                                deviceBean2.setTime(0);
                                deviceBean2.setState(DeviceBean.f2303a);
                                C0528a.m1795a().mo4931a(deviceBean2.getAddress(), deviceBean2.getState(), deviceBean2.isConfirmConnected());
                            }
                        }
                    }
                    a.mo4996b(mainActivity, address);
                } else if (deviceBean2.getTime() >= 8000) {
                    Log.d("MainActivity", "scheduleAtFixedRate --> connection timeout2 = " + deviceBean2.getAddress());
                    C0538a.m1861a().mo4981a((Context) this.f2171a, deviceBean2.getAddress());
                    deviceBean2.setState(DeviceBean.f2303a);
                    C0528a.m1795a().mo4931a(deviceBean2.getAddress(), deviceBean2.getState(), false);
                }
                z = true;
            }
        }
        if (z) {
            this.f2171a.f2098Z.sendEmptyMessage(104);
        }
    }
}
