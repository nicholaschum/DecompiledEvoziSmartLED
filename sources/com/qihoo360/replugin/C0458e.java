package com.qihoo360.replugin;

import android.util.Log;
import com.qihoo360.replugin.C0459f;
import com.qihoo360.replugin.RePlugin;
import com.qihoo360.replugin.base.IPC;
import com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager;
import com.qihoo360.replugin.loader.p019p.PluginProviderClient;
import com.qihoo360.replugin.loader.p020s.PluginServiceClient;

/* renamed from: com.qihoo360.replugin.e */
public class C0458e {

    /* renamed from: a */
    public static volatile boolean f1989a;

    /* renamed from: b */
    private static final byte[] f1990b = new byte[0];

    /* renamed from: c */
    private static volatile boolean f1991c;

    /* renamed from: a */
    public static boolean m1528a() {
        return f1989a;
    }

    /* renamed from: a */
    static boolean m1529a(ClassLoader classLoader) {
        boolean b;
        synchronized (f1990b) {
            b = m1530b(classLoader);
        }
        return b;
    }

    /* renamed from: b */
    private static boolean m1530b(ClassLoader classLoader) {
        if (f1991c) {
            return f1989a;
        }
        f1991c = true;
        try {
            C0459f.C0460a.m1543a(classLoader);
            RePlugin.C0452a.m1477a(classLoader);
            PluginLocalBroadcastManager.ProxyLocalBroadcastManagerVar.initLocked(classLoader);
            PluginProviderClient.ProxyRePluginProviderClientVar.initLocked(classLoader);
            PluginServiceClient.ProxyRePluginServiceClientVar.initLocked(classLoader);
            IPC.C0455a.m1505a(classLoader);
            f1989a = true;
        } catch (Throwable th) {
            Log.e("RePluginFramework", th.getMessage(), th);
        }
        return f1989a;
    }
}
