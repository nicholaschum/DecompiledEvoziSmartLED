package p021wl.smartled.beans;

/* renamed from: wl.smartled.beans.DeviceBean */
public class DeviceBean {

    /* renamed from: a */
    public static int f2303a = 0;

    /* renamed from: b */
    public static int f2304b = 1;

    /* renamed from: c */
    public static int f2305c = 2;

    /* renamed from: d */
    public static int f2306d = 3;

    /* renamed from: e */
    public static int f2307e = 4;

    /* renamed from: f */
    public static int f2308f = 5;

    /* renamed from: g */
    public static int f2309g = 0;

    /* renamed from: h */
    public static int f2310h = 1;

    /* renamed from: i */
    private String f2311i;

    /* renamed from: j */
    private String f2312j;

    /* renamed from: k */
    private int f2313k;

    /* renamed from: l */
    private int f2314l;

    /* renamed from: m */
    private boolean f2315m;

    /* renamed from: n */
    private boolean f2316n;

    /* renamed from: o */
    private boolean f2317o;

    /* renamed from: p */
    private int f2318p;

    /* renamed from: q */
    private int f2319q;

    public DeviceBean(String str, String str2, int i) {
        this.f2311i = str;
        this.f2312j = str2;
        this.f2313k = i;
        this.f2314l = 0;
        this.f2315m = false;
        this.f2319q = (str2 == null || !str2.startsWith("ELK_")) ? f2309g : f2310h;
    }

    public DeviceBean(DeviceBean deviceBean) {
        this.f2311i = deviceBean.f2311i;
        this.f2312j = deviceBean.f2312j;
        this.f2313k = deviceBean.f2313k;
        this.f2314l = deviceBean.f2314l;
        this.f2315m = deviceBean.f2315m;
        this.f2319q = deviceBean.f2319q;
    }

    public String getAddress() {
        return this.f2311i;
    }

    public String getDeviceName() {
        return this.f2312j;
    }

    public int getDeviceType() {
        return this.f2319q;
    }

    public int getState() {
        return this.f2313k;
    }

    public int getTime() {
        return this.f2314l;
    }

    public int getTryConnectTimes() {
        return this.f2318p;
    }

    public boolean isConfirmConnected() {
        return this.f2315m;
    }

    public boolean isOn() {
        return this.f2317o;
    }

    public boolean isSelected() {
        return this.f2316n;
    }

    public void setAddress(String str) {
        this.f2311i = str;
    }

    public void setConfirmConnected(boolean z) {
        this.f2315m = z;
    }

    public void setDeviceName(String str) {
        this.f2312j = str;
    }

    public void setDeviceType(int i) {
        this.f2319q = i;
    }

    public void setOn(boolean z) {
        this.f2317o = z;
    }

    public void setSelected(boolean z) {
        this.f2316n = z;
    }

    public void setState(int i) {
        this.f2313k = i;
    }

    public void setTime(int i) {
        this.f2314l = i;
    }

    public void setTryConnectTimes(int i) {
        this.f2318p = i;
    }
}
