package com.qihoo360.replugin;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.qihoo360.replugin.model.PluginInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import library.C0471d;
import library.C0473f;

public class RePlugin {
    public static final String PROCESS_AUTO = "-2147483648";
    public static final String PROCESS_PERSIST = "-2";
    public static final String PROCESS_UI = "-1";

    /* renamed from: com.qihoo360.replugin.RePlugin$a */
    class C0452a {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public static C0454b f1923A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public static C0454b f1924B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public static C0454b f1925C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public static C0454b f1926D;
        /* access modifiers changed from: private */

        /* renamed from: E */
        public static C0454b f1927E;
        /* access modifiers changed from: private */

        /* renamed from: F */
        public static C0454b f1928F;
        /* access modifiers changed from: private */

        /* renamed from: G */
        public static C0454b f1929G;
        /* access modifiers changed from: private */

        /* renamed from: H */
        public static C0454b f1930H;
        /* access modifiers changed from: private */

        /* renamed from: I */
        public static C0454b f1931I;
        /* access modifiers changed from: private */

        /* renamed from: J */
        public static C0454b f1932J;
        /* access modifiers changed from: private */

        /* renamed from: K */
        public static C0454b f1933K;
        /* access modifiers changed from: private */

        /* renamed from: L */
        public static C0454b f1934L;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C0454b f1935a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static C0454b f1936b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static C0454b f1937c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static C0454b f1938d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static C0454b f1939e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static C0454b f1940f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static C0454b f1941g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static C0454b f1942h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static C0454b f1943i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static C0454b f1944j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static C0454b f1945k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static C0454b f1946l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public static C0454b f1947m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static C0454b f1948n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public static C0454b f1949o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public static C0454b f1950p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public static C0454b f1951q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public static C0454b f1952r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public static C0454b f1953s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public static C0454b f1954t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public static C0454b f1955u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public static C0454b f1956v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public static C0454b f1957w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public static C0454b f1958x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public static C0454b f1959y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public static C0454b f1960z;

        /* renamed from: a */
        static void m1477a(ClassLoader classLoader) {
            f1935a = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "install", new Class[]{String.class});
            f1936b = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "preload", new Class[]{String.class});
            try {
                classLoader.loadClass("com.qihoo360.replugin.model.PluginInfo");
                f1937c = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "preload", new Class[]{PluginInfo.class});
            } catch (ClassNotFoundException unused) {
            }
            f1938d = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "startActivity", new Class[]{Context.class, Intent.class});
            f1939e = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "startActivity", new Class[]{Context.class, Intent.class, String.class, String.class});
            f1940f = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "startActivityForResult", new Class[]{Activity.class, Intent.class, Integer.TYPE});
            f1941g = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "startActivityForResult", new Class[]{Context.class, Intent.class, Integer.TYPE, Bundle.class});
            f1942h = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "createIntent", new Class[]{String.class, String.class});
            f1943i = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "createComponentName", new Class[]{String.class, String.class});
            f1944j = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isForDev", new Class[0]);
            f1945k = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getVersion", new Class[0]);
            f1946l = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchPackageInfo", new Class[]{String.class});
            f1947m = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchResources", new Class[]{String.class});
            f1948n = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchClassLoader", new Class[]{String.class});
            f1949o = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchContext", new Class[]{String.class});
            f1950p = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchBinder", new Class[]{String.class, String.class});
            f1951q = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchBinder", new Class[]{String.class, String.class, String.class});
            f1952r = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "fetchPluginNameByClassLoader", new Class[]{ClassLoader.class});
            f1953s = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getPluginInfoList", new Class[0]);
            f1954t = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getPluginInfo", new Class[]{String.class});
            f1955u = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getPluginVersion", new Class[]{String.class});
            f1956v = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isPluginInstalled", new Class[]{String.class});
            f1957w = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isPluginUsed", new Class[]{String.class});
            f1958x = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isPluginDexExtracted", new Class[]{String.class});
            f1959y = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isPluginRunning", new Class[]{String.class});
            f1960z = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isPluginRunningInProcess", new Class[]{String.class, String.class});
            f1923A = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getRunningPlugins", new Class[0]);
            f1924B = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getRunningProcessesByPlugin", new Class[]{String.class});
            f1925C = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isCurrentPersistentProcess", new Class[0]);
            f1926D = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "registerInstalledReceiver", new Class[]{Context.class, BroadcastReceiver.class});
            f1927E = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "registerGlobalBinder", new Class[]{String.class, IBinder.class});
            Class<?> cls = null;
            try {
                cls = classLoader.loadClass("com.qihoo360.replugin.IBinderGetter");
            } catch (Exception unused2) {
            }
            f1928F = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "registerGlobalBinderDelayed", new Class[]{String.class, cls});
            f1929G = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "unregisterGlobalBinder", new Class[]{String.class});
            f1930H = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "getGlobalBinder", new Class[]{String.class});
            f1931I = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "registerHookingClass", new Class[]{String.class, ComponentName.class, Class.class});
            f1932J = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "isHookingClass", new Class[]{ComponentName.class});
            f1933K = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "unregisterHookingClass", new Class[]{String.class});
            f1934L = new C0454b(classLoader, "com.qihoo360.replugin.RePlugin", "dump", new Class[]{FileDescriptor.class, PrintWriter.class, new String[0].getClass()});
        }
    }

    public static ComponentName createComponentName(String str, String str2) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (ComponentName) C0452a.f1943i.mo4633a((Object) null, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Intent createIntent(String str, String str2) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (Intent) C0452a.f1942h.mo4633a((Object) null, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (C0458e.f1989a) {
            try {
                C0452a.f1934L.mo4633a((Object) null, fileDescriptor, printWriter, strArr);
            } catch (Exception unused) {
            }
        }
    }

    public static IBinder fetchBinder(String str, String str2) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (IBinder) C0452a.f1950p.mo4633a((Object) null, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static IBinder fetchBinder(String str, String str2, String str3) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (IBinder) C0452a.f1951q.mo4633a((Object) null, str, str2, str3);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ClassLoader fetchClassLoader(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (ClassLoader) C0452a.f1948n.mo4633a((Object) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Context fetchContext(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (Context) C0452a.f1949o.mo4633a((Object) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static PackageInfo fetchPackageInfo(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (PackageInfo) C0452a.f1946l.mo4633a((Object) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String fetchPluginNameByClassLoader(ClassLoader classLoader) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (String) C0452a.f1952r.mo4633a((Object) null, classLoader);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int fetchResourceIdByName(String str, String str2) {
        if (!C0458e.f1989a) {
            return 0;
        }
        return C0456c.m1522a(str, str2);
    }

    public static Resources fetchResources(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (Resources) C0452a.f1947m.mo4633a((Object) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T extends View> T fetchViewByLayoutName(String str, String str2, ViewGroup viewGroup) {
        if (!C0458e.f1989a) {
            return null;
        }
        return C0456c.m1523a(str, str2, viewGroup);
    }

    public static IBinder getGlobalBinder(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (IBinder) C0452a.f1930H.mo4633a((Object) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ClassLoader getHostClassLoader() {
        return C0457d.m1526b();
    }

    public static Context getHostContext() {
        return C0457d.m1524a();
    }

    public static Context getPluginContext() {
        return C0457d.m1527c();
    }

    public static PluginInfo getPluginInfo(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            Object a = C0452a.f1954t.mo4633a((Object) null, str);
            if (a != null) {
                return PluginInfo.CREATOR.createFromParcel(C0473f.m1586a((Parcelable) a));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static List<PluginInfo> getPluginInfoList() {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            List<Parcelable> list = (List) C0452a.f1953s.mo4633a((Object) null, new Object[0]);
            if (list != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable a : list) {
                    arrayList.add(PluginInfo.CREATOR.createFromParcel(C0473f.m1586a(a)));
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int getPluginVersion(String str) {
        if (!C0458e.f1989a) {
            return -1;
        }
        try {
            Object a = C0452a.f1955u.mo4633a((Object) null, str);
            if (a != null) {
                return ((Integer) a).intValue();
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static C0471d getRunningPlugins() {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            Object a = C0452a.f1923A.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                C0471d.CREATOR.createFromParcel(C0473f.m1586a((Parcelable) a));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String[] getRunningProcessesByPlugin(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (String[]) C0452a.f1924B.mo4633a((Object) null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getSDKVersion() {
        return getVersion();
    }

    public static String getVersion() {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (String) C0452a.f1945k.mo4633a((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static PluginInfo install(String str) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            Object a = C0452a.f1935a.mo4633a((Object) null, str);
            if (a != null) {
                return PluginInfo.CREATOR.createFromParcel(C0473f.m1586a((Parcelable) a));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean isCurrentPersistentProcess() {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1925C.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isForDev() {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1944j.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isHookingClass(ComponentName componentName) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1932J.mo4633a((Object) null, componentName);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isHostInitialized() {
        return C0458e.m1528a();
    }

    public static boolean isPluginDexExtracted(String str) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1958x.mo4633a((Object) null, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isPluginInstalled(String str) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1956v.mo4633a((Object) null, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isPluginRunning(String str) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1959y.mo4633a((Object) null, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isPluginRunningInProcess(String str, String str2) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1960z.mo4633a((Object) null, str, str2);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isPluginUsed(String str) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1957w.mo4633a((Object) null, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean preload(PluginInfo pluginInfo) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0473f.m1587a(pluginInfo, C0457d.m1526b(), "com.qihoo360.replugin.model.PluginInfo");
            Object a2 = C0452a.f1937c.mo4633a((Object) null, a);
            if (a2 != null) {
                return ((Boolean) a2).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean preload(String str) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1936b.mo4633a((Object) null, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean registerGlobalBinder(String str, IBinder iBinder) {
        Object a;
        if (C0458e.f1989a && (a = C0452a.f1927E.mo4633a((Object) null, str, iBinder)) != null) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }

    public static boolean registerGlobalBinderDelayed(String str, C0453a aVar) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1928F.mo4633a((Object) null, str, aVar);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void registerHookingClass(String str, ComponentName componentName, Class cls) {
        if (C0458e.f1989a) {
            C0452a.f1931I.mo4633a((Object) null, str, componentName, cls);
        }
    }

    public static void registerInstalledReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        if (C0458e.f1989a) {
            C0452a.f1926D.mo4633a((Object) null, context, broadcastReceiver);
        }
    }

    public static void registerPluginBinder(String str, IBinder iBinder) {
        C0461g.m1551a().mo4635a(str, iBinder);
    }

    public static boolean startActivity(Context context, Intent intent) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1938d.mo4633a((Object) null, context, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean startActivity(Context context, Intent intent, String str, String str2) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1939e.mo4633a((Object) null, context, intent, str, str2);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean startActivityForResult(Activity activity, Intent intent, int i) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1940f.mo4633a((Object) null, activity, intent, Integer.valueOf(i));
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1941g.mo4633a((Object) null, activity, intent, Integer.valueOf(i), bundle);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean unregisterGlobalBinder(String str) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0452a.f1929G.mo4633a((Object) null, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void unregisterHookingClass(String str) {
        if (C0458e.f1989a) {
            C0452a.f1933K.mo4633a((Object) null, str);
        }
    }
}
