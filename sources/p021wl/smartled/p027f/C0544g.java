package p021wl.smartled.p027f;

import java.util.List;
import p021wl.smartled.beans.DeviceBean;

/* renamed from: wl.smartled.f.g */
public final class C0544g {
    /* renamed from: a */
    public static int m1907a(List<DeviceBean> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            String address = list.get(i).getAddress();
            if (address != null && address.equals(str)) {
                return i;
            }
        }
        return -1;
    }
}
