package com.qihoo360.replugin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.widget.ExploreByTouchHelper;
import android.text.TextUtils;

/* renamed from: com.qihoo360.replugin.f */
public class C0459f {

    /* renamed from: com.qihoo360.replugin.f$a */
    class C0460a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C0454b f1992a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static C0454b f1993b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static C0454b f1994c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static C0454b f1995d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static C0454b f1996e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static C0454b f1997f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static C0454b f1998g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static C0454b f1999h;

        /* renamed from: a */
        static void m1543a(ClassLoader classLoader) {
            f1992a = new C0454b(classLoader, "com.qihoo360.i.Factory2", "createActivityContext", new Class[]{Activity.class, Context.class});
            f1993b = new C0454b(classLoader, "com.qihoo360.i.Factory2", "handleActivityCreateBefore", new Class[]{Activity.class, Bundle.class});
            f1994c = new C0454b(classLoader, "com.qihoo360.i.Factory2", "handleActivityCreate", new Class[]{Activity.class, Bundle.class});
            f1995d = new C0454b(classLoader, "com.qihoo360.i.Factory2", "handleActivityDestroy", new Class[]{Activity.class});
            f1996e = new C0454b(classLoader, "com.qihoo360.i.Factory2", "handleRestoreInstanceState", new Class[]{Activity.class, Bundle.class});
            f1997f = new C0454b(classLoader, "com.qihoo360.i.Factory2", "startActivity", new Class[]{Activity.class, Intent.class});
            f1998g = new C0454b(classLoader, "com.qihoo360.i.Factory2", "startActivityForResult", new Class[]{Activity.class, Intent.class, Integer.TYPE, Bundle.class});
            f1999h = new C0454b(classLoader, "com.qihoo360.i.Factory", "loadPluginActivity", new Class[]{Intent.class, String.class, String.class, Integer.TYPE});
        }
    }

    /* renamed from: a */
    public static ComponentName m1531a(Intent intent, String str, String str2, int i) {
        if (!C0458e.f1989a) {
            return null;
        }
        try {
            return (ComponentName) C0460a.f1999h.mo4633a((Object) null, intent, str, str2, Integer.valueOf(i));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Context m1532a(Activity activity, Context context) {
        if (!C0458e.f1989a) {
            return context;
        }
        try {
            return (Context) C0460a.f1992a.mo4633a((Object) null, activity, context);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m1533a(Activity activity) {
        if (C0458e.f1989a) {
            C0460a.f1995d.mo4633a((Object) null, activity);
        }
    }

    /* renamed from: a */
    public static void m1534a(Activity activity, Bundle bundle) {
        if (C0458e.f1989a) {
            C0460a.f1993b.mo4633a((Object) null, activity, bundle);
        }
    }

    /* renamed from: a */
    public static boolean m1535a(Activity activity, Intent intent) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0460a.f1997f.mo4633a((Object) null, activity, intent);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m1536a(Activity activity, Intent intent, int i) {
        return m1537a(activity, intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public static boolean m1537a(Activity activity, Intent intent, int i, Bundle bundle) {
        if (!C0458e.f1989a) {
            return false;
        }
        try {
            Object a = C0460a.f1998g.mo4633a((Object) null, activity, intent, Integer.valueOf(i), bundle);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
        } catch (Exception unused) {
        }
        return m1540b(activity, intent, i, bundle);
    }

    /* renamed from: b */
    private static String m1538b(Activity activity, Intent intent) {
        String str = "";
        if (intent.getComponent() != null) {
            str = intent.getComponent().getPackageName();
        }
        return (TextUtils.isEmpty(str) || str.contains(".")) ? RePlugin.fetchPluginNameByClassLoader(activity.getClassLoader()) : str;
    }

    /* renamed from: b */
    public static void m1539b(Activity activity, Bundle bundle) {
        if (C0458e.f1989a) {
            C0460a.f1994c.mo4633a((Object) null, activity, bundle);
        }
    }

    /* renamed from: b */
    private static boolean m1540b(Activity activity, Intent intent, int i, Bundle bundle) {
        ComponentName component;
        ComponentName a;
        String b = m1538b(activity, intent);
        if (TextUtils.isEmpty(b) || (component = intent.getComponent()) == null || (a = m1531a(intent, b, component.getClassName(), (int) ExploreByTouchHelper.INVALID_ID)) == null) {
            return false;
        }
        intent.setComponent(a);
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
            return true;
        }
        activity.startActivityForResult(intent, i);
        return true;
    }

    /* renamed from: c */
    public static void m1541c(Activity activity, Bundle bundle) {
        if (C0458e.f1989a) {
            C0460a.f1996e.mo4633a((Object) null, activity, bundle);
        }
    }
}
