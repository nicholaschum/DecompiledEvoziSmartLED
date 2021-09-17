package com.qihoo360.replugin.loader.p020s;

import android.app.Service;
import com.qihoo360.replugin.C0454b;
import com.qihoo360.replugin.C0458e;

/* renamed from: com.qihoo360.replugin.loader.s.PluginServiceClient */
public class PluginServiceClient {

    /* renamed from: com.qihoo360.replugin.loader.s.PluginServiceClient$ProxyRePluginServiceClientVar */
    public class ProxyRePluginServiceClientVar {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C0454b f2040a;

        public static void initLocked(ClassLoader classLoader) {
            f2040a = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginServiceClient", "stopSelf", new Class[]{Service.class});
        }
    }

    public static void stopSelf(Service service) {
        if (!C0458e.f1989a) {
            service.stopSelf();
            return;
        }
        try {
            ProxyRePluginServiceClientVar.f2040a.mo4633a((Object) null, service);
        } catch (Exception unused) {
        }
    }
}
