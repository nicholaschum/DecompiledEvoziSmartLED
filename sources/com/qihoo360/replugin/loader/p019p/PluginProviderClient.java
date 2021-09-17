package com.qihoo360.replugin.loader.p019p;

import android.annotation.TargetApi;
import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.qihoo360.replugin.C0454b;
import com.qihoo360.replugin.C0458e;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.qihoo360.replugin.loader.p.PluginProviderClient */
public class PluginProviderClient {

    /* renamed from: com.qihoo360.replugin.loader.p.PluginProviderClient$ProxyRePluginProviderClientVar */
    public class ProxyRePluginProviderClientVar {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C0454b f2022a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public static C0454b f2023b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static C0454b f2024c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public static C0454b f2025d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static C0454b f2026e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static C0454b f2027f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public static C0454b f2028g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public static C0454b f2029h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public static C0454b f2030i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public static C0454b f2031j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public static C0454b f2032k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public static C0454b f2033l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public static C0454b f2034m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static C0454b f2035n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public static C0454b f2036o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public static C0454b f2037p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public static C0454b f2038q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public static C0454b f2039r;

        public static void initLocked(ClassLoader classLoader) {
            f2022a = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "query", new Class[]{Context.class, Uri.class, String[].class, String.class, String[].class, String.class});
            if (Build.VERSION.SDK_INT >= 16) {
                f2023b = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "query", new Class[]{Context.class, Uri.class, String[].class, String.class, String[].class, String.class, CancellationSignal.class});
            }
            f2024c = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "insert", new Class[]{Context.class, Uri.class, ContentValues.class});
            f2025d = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "bulkInsert", new Class[]{Context.class, Uri.class, ContentValues[].class});
            f2026e = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "delete", new Class[]{Context.class, Uri.class, String.class, String[].class});
            f2027f = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "update", new Class[]{Context.class, Uri.class, ContentValues.class, String.class, String[].class});
            f2028g = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "getType", new Class[]{Context.class, Uri.class});
            f2029h = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "openInputStream", new Class[]{Context.class, Uri.class});
            f2030i = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "openOutputStream", new Class[]{Context.class, Uri.class});
            f2031j = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "openOutputStream", new Class[]{Context.class, Uri.class, String.class});
            f2032k = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "openFileDescriptor", new Class[]{Context.class, Uri.class, String.class});
            if (Build.VERSION.SDK_INT >= 16) {
                f2033l = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "openFileDescriptor", new Class[]{Context.class, Uri.class, String.class, CancellationSignal.class});
            }
            f2034m = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "registerContentObserver", new Class[]{Context.class, Uri.class, Boolean.class, ContentObserver.class});
            f2035n = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "acquireContentProviderClient", new Class[]{Context.class, String.class});
            f2036o = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "notifyChange", new Class[]{Context.class, Uri.class, ContentObserver.class});
            f2037p = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "notifyChange", new Class[]{Context.class, Uri.class, ContentObserver.class, Boolean.class});
            f2038q = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "toCalledUri", new Class[]{Context.class, Uri.class});
            f2039r = new C0454b(classLoader, "com.qihoo360.loader2.mgr.PluginProviderClient", "toCalledUri", new Class[]{Context.class, String.class, Uri.class, Integer.class});
        }
    }

    @TargetApi(5)
    public static ContentProviderClient acquireContentProviderClient(Context context, String str) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().acquireContentProviderClient(str);
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2035n.mo4633a((Object) null, context, str);
            if (a != null) {
                return (ContentProviderClient) a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int bulkInsert(Context context, Uri uri, ContentValues[] contentValuesArr) {
        if (context == null) {
            return 0;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().bulkInsert(uri, contentValuesArr);
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2025d.mo4633a((Object) null, context, uri, contentValuesArr);
            if (a != null) {
                return ((Integer) a).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int delete(Context context, Uri uri, String str, String[] strArr) {
        if (context == null) {
            return 0;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().delete(uri, str, strArr);
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2026e.mo4633a((Object) null, context, uri, str, strArr);
            if (a != null) {
                return ((Integer) a).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String getType(Context context, Uri uri) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().getType(uri);
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2028g.mo4633a((Object) null, context, uri);
            if (a != null) {
                return (String) a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Uri insert(Context context, Uri uri, ContentValues contentValues) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().insert(uri, contentValues);
        }
        try {
            return (Uri) ProxyRePluginProviderClientVar.f2024c.mo4633a((Object) null, context, uri, contentValues);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void notifyChange(Context context, Uri uri, ContentObserver contentObserver) {
        if (context != null) {
            if (!C0458e.f1989a) {
                context.getContentResolver().notifyChange(uri, contentObserver);
                return;
            }
            try {
                ProxyRePluginProviderClientVar.f2036o.mo4633a((Object) null, context, uri, contentObserver);
            } catch (Exception unused) {
            }
        }
    }

    public static void notifyChange(Context context, Uri uri, ContentObserver contentObserver, boolean z) {
        if (context != null) {
            if (!C0458e.f1989a) {
                context.getContentResolver().notifyChange(uri, contentObserver, z);
                return;
            }
            try {
                ProxyRePluginProviderClientVar.f2037p.mo4633a((Object) null, context, uri, contentObserver, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public static ParcelFileDescriptor openFileDescriptor(Context context, Uri uri, String str) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            try {
                return context.getContentResolver().openFileDescriptor(uri, str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                Object a = ProxyRePluginProviderClientVar.f2032k.mo4633a((Object) null, context, uri, str);
                if (a != null) {
                    return (ParcelFileDescriptor) a;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    @TargetApi(19)
    public static ParcelFileDescriptor openFileDescriptor(Context context, Uri uri, String str, CancellationSignal cancellationSignal) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            try {
                return context.getContentResolver().openFileDescriptor(uri, str, cancellationSignal);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                Object a = ProxyRePluginProviderClientVar.f2033l.mo4633a((Object) null, context, uri, str, cancellationSignal);
                if (a != null) {
                    return (ParcelFileDescriptor) a;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static InputStream openInputStream(Context context, Uri uri) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                Object a = ProxyRePluginProviderClientVar.f2029h.mo4633a((Object) null, context, uri);
                if (a != null) {
                    return (InputStream) a;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static OutputStream openOutputStream(Context context, Uri uri) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            try {
                return context.getContentResolver().openOutputStream(uri);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                Object a = ProxyRePluginProviderClientVar.f2030i.mo4633a((Object) null, context, uri);
                if (a != null) {
                    return (OutputStream) a;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    @TargetApi(3)
    public static OutputStream openOutputStream(Context context, Uri uri, String str) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            try {
                return context.getContentResolver().openOutputStream(uri, str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            try {
                Object a = ProxyRePluginProviderClientVar.f2031j.mo4633a((Object) null, context, uri, str);
                if (a != null) {
                    return (OutputStream) a;
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public static Cursor query(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().query(uri, strArr, str, strArr2, str2);
        }
        try {
            return (Cursor) ProxyRePluginProviderClientVar.f2022a.mo4633a((Object) null, context, uri, strArr, str, strArr2, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @TargetApi(16)
    public static Cursor query(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
        try {
            return (Cursor) ProxyRePluginProviderClientVar.f2023b.mo4633a((Object) null, context, uri, strArr, str, strArr2, str2, cancellationSignal);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void registerContentObserver(Context context, Uri uri, boolean z, ContentObserver contentObserver) {
        if (context != null) {
            if (!C0458e.f1989a) {
                context.getContentResolver().registerContentObserver(uri, z, contentObserver);
                return;
            }
            try {
                ProxyRePluginProviderClientVar.f2034m.mo4633a((Object) null, context, uri, Boolean.valueOf(z), contentObserver);
            } catch (Exception unused) {
            }
        }
    }

    public static Uri toCalledUri(Context context, Uri uri) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return uri;
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2038q.mo4633a((Object) null, context, uri);
            if (a != null) {
                return (Uri) a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static Uri toCalledUri(Context context, String str, Uri uri, int i) {
        if (context == null) {
            return null;
        }
        if (!C0458e.f1989a) {
            return uri;
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2039r.mo4633a((Object) null, context, str, uri, Integer.valueOf(i));
            if (a != null) {
                return (Uri) a;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int update(Context context, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (context == null) {
            return 0;
        }
        if (!C0458e.f1989a) {
            return context.getContentResolver().update(uri, contentValues, str, strArr);
        }
        try {
            Object a = ProxyRePluginProviderClientVar.f2027f.mo4633a((Object) null, context, uri, contentValues, str, strArr);
            if (a != null) {
                return ((Integer) a).intValue();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }
}
