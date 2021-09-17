package com.qihoo360.replugin;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.IBinder;

/* renamed from: com.qihoo360.replugin.d */
public class C0457d {

    /* renamed from: a */
    private static Context f1985a;

    /* renamed from: b */
    private static Context f1986b;

    /* renamed from: c */
    private static ClassLoader f1987c;

    /* renamed from: d */
    private static IBinder f1988d;

    /* renamed from: a */
    public static Context m1524a() {
        return f1986b;
    }

    /* renamed from: a */
    static void m1525a(Context context, ClassLoader classLoader, IBinder iBinder) {
        f1985a = context;
        f1986b = ((ContextWrapper) context).getBaseContext();
        f1987c = classLoader;
        f1988d = iBinder;
    }

    /* renamed from: b */
    public static ClassLoader m1526b() {
        return f1987c;
    }

    /* renamed from: c */
    public static Context m1527c() {
        return f1985a;
    }
}
