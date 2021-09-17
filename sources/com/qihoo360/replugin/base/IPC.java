package com.qihoo360.replugin.base;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.qihoo360.replugin.C0454b;
import com.qihoo360.replugin.C0458e;

public class IPC {

    /* renamed from: com.qihoo360.replugin.base.IPC$a */
    public class C0455a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C0454b f1968a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static C0454b f1969b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static C0454b f1970c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static C0454b f1971d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static C0454b f1972e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static C0454b f1973f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static C0454b f1974g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static C0454b f1975h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static C0454b f1976i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static C0454b f1977j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static C0454b f1978k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static C0454b f1979l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public static C0454b f1980m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static C0454b f1981n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public static C0454b f1982o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public static C0454b f1983p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public static C0454b f1984q;

        /* renamed from: a */
        public static void m1505a(ClassLoader classLoader) {
            f1968a = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getCurrentProcessName", new Class[0]);
            f1969b = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getCurrentProcessId", new Class[0]);
            f1970c = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getPersistentProcessName", new Class[0]);
            f1971d = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getPluginHostProcessName", new Class[0]);
            f1972e = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "isPluginHostProcess", new Class[0]);
            f1973f = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "isUIProcess", new Class[0]);
            f1974g = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "isPersistentProcess", new Class[0]);
            f1975h = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "isPersistentEnable", new Class[0]);
            f1976i = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getPidByProcessName", new Class[]{String.class});
            f1977j = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getProcessNameByPid", new Class[]{Integer.TYPE});
            f1978k = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "getPackageName", new Class[0]);
            f1979l = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "sendLocalBroadcast2Plugin", new Class[]{Context.class, String.class, Intent.class});
            f1980m = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "sendLocalBroadcast2Process", new Class[]{Context.class, String.class, Intent.class});
            f1981n = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "sendLocalBroadcast2All", new Class[]{Context.class, Intent.class});
            f1982o = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "sendLocalBroadcast2PluginSync", new Class[]{Context.class, String.class, Intent.class});
            f1983p = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "sendLocalBroadcast2ProcessSync", new Class[]{Context.class, String.class, Intent.class});
            f1984q = new C0454b(classLoader, "com.qihoo360.replugin.base.IPC", "sendLocalBroadcast2AllSync", new Class[]{Context.class, Intent.class});
        }
    }

    public static int getCurrentProcessId() {
        if (!C0458e.m1528a()) {
            return -1;
        }
        try {
            Object a = C0455a.f1969b.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Integer) a).intValue();
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static String getCurrentProcessName() {
        if (!C0458e.m1528a()) {
            return null;
        }
        try {
            return (String) C0455a.f1968a.mo4633a((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPackageName() {
        if (!C0458e.m1528a()) {
            return null;
        }
        try {
            return (String) C0455a.f1978k.mo4633a((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getPersistentProcessName() {
        if (!C0458e.m1528a()) {
            return null;
        }
        try {
            return (String) C0455a.f1970c.mo4633a((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getPidByProcessName(String str) {
        if (!C0458e.m1528a()) {
            return -1;
        }
        try {
            Object a = C0455a.f1976i.mo4633a((Object) null, str);
            if (a != null) {
                return ((Integer) a).intValue();
            }
        } catch (Exception unused) {
        }
        return -1;
    }

    public static String getPluginHostProcessName() {
        if (!C0458e.m1528a()) {
            return null;
        }
        try {
            return (String) C0455a.f1971d.mo4633a((Object) null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getProcessNameByPid(int i) {
        if (!C0458e.m1528a()) {
            return null;
        }
        try {
            return (String) C0455a.f1977j.mo4633a((Object) null, Integer.valueOf(i));
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isPersistentEnable() {
        if (!C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1975h.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isPersistentProcess() {
        if (!C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1974g.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isPluginHostProcess() {
        if (!C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1972e.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isUIProcess() {
        if (!C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1973f.mo4633a((Object) null, new Object[0]);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean sendLocalBroadcast2All(Context context, Intent intent) {
        if (!C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1981n.mo4633a((Object) null, context, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean sendLocalBroadcast2AllSync(Context context, Intent intent) {
        if (!C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1984q.mo4633a((Object) null, context, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean sendLocalBroadcast2Plugin(Context context, String str, Intent intent) {
        if (TextUtils.isEmpty(str) || !C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1979l.mo4633a((Object) null, context, str, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean sendLocalBroadcast2PluginSync(Context context, String str, Intent intent) {
        if (TextUtils.isEmpty(str) || !C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1982o.mo4633a((Object) null, context, str, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean sendLocalBroadcast2Process(Context context, String str, Intent intent) {
        if (TextUtils.isEmpty(str) || !C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1980m.mo4633a((Object) null, context, str, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean sendLocalBroadcast2ProcessSync(Context context, String str, Intent intent) {
        if (TextUtils.isEmpty(str) || !C0458e.m1528a()) {
            return false;
        }
        try {
            Object a = C0455a.f1983p.mo4633a((Object) null, context, str, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
