package p021wl.smartled.p027f;

import android.os.Build;
import p021wl.smartled.SmartLedApplication;

/* renamed from: wl.smartled.f.f */
public final class C0543f {

    /* renamed from: a */
    public static int f2408a = 1;

    /* renamed from: b */
    public static int f2409b = 2;

    /* renamed from: c */
    public static int f2410c = 3;

    /* renamed from: a */
    public static boolean m1905a() {
        return (Build.VERSION.SDK_INT >= 24 ? SmartLedApplication.m1588a().getResources().getConfiguration().getLocales().get(0) : SmartLedApplication.m1588a().getResources().getConfiguration().locale).getLanguage().toLowerCase().startsWith("zh");
    }

    /* renamed from: b */
    public static int m1906b() {
        int i = f2408a;
        String language = (Build.VERSION.SDK_INT >= 24 ? SmartLedApplication.m1588a().getResources().getConfiguration().getLocales().get(0) : SmartLedApplication.m1588a().getResources().getConfiguration().locale).getLanguage();
        return language.toLowerCase().startsWith("zh") ? f2409b : language.toLowerCase().startsWith("ja") ? f2410c : i;
    }
}
