package p021wl.smartled;

import android.app.Application;
import android.content.Context;
import p021wl.smartled.p025d.C0532a;

/* renamed from: wl.smartled.SmartLedApplication */
public class SmartLedApplication extends Application {

    /* renamed from: a */
    private static Context f2053a;

    /* renamed from: b */
    private static C0532a f2054b;

    /* renamed from: a */
    public static Context m1588a() {
        return f2053a;
    }

    /* renamed from: b */
    public static C0532a m1589b() {
        return f2054b;
    }

    public void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        f2053a = applicationContext;
        f2054b = C0532a.m1842a(applicationContext);
    }

    public void onTerminate() {
        C0532a.m1843a();
        f2054b = null;
        super.onTerminate();
    }
}
