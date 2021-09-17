package android.support.p010v7.app;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.app.an */
final class C0212an {

    /* renamed from: a */
    private static Field f687a;

    /* renamed from: b */
    private static boolean f688b;

    /* renamed from: c */
    private static Class f689c;

    /* renamed from: d */
    private static boolean f690d;

    /* renamed from: e */
    private static Field f691e;

    /* renamed from: f */
    private static boolean f692f;

    /* renamed from: g */
    private static Field f693g;

    /* renamed from: h */
    private static boolean f694h;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m297a(android.content.res.Resources r5) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0007
            return
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L_0x0079
            boolean r0 = f694h
            if (r0 != 0) goto L_0x002b
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r1 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x0021 }
            f693g = r0     // Catch:{ NoSuchFieldException -> 0x0021 }
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r0 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r1, r4, r0)
        L_0x0029:
            f694h = r3
        L_0x002b:
            java.lang.reflect.Field r0 = f693g
            if (r0 == 0) goto L_0x0078
            java.lang.reflect.Field r0 = f693g     // Catch:{ IllegalAccessException -> 0x0036 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IllegalAccessException -> 0x0036 }
            goto L_0x003f
        L_0x0036:
            r5 = move-exception
            java.lang.String r0 = "ResourcesFlusher"
            java.lang.String r1 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r0, r1, r5)
            r5 = r2
        L_0x003f:
            if (r5 == 0) goto L_0x0078
            boolean r0 = f688b
            if (r0 != 0) goto L_0x005f
            java.lang.Class r0 = r5.getClass()     // Catch:{ NoSuchFieldException -> 0x0055 }
            java.lang.String r1 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x0055 }
            f687a = r0     // Catch:{ NoSuchFieldException -> 0x0055 }
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0055 }
            goto L_0x005d
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r1, r4, r0)
        L_0x005d:
            f688b = r3
        L_0x005f:
            java.lang.reflect.Field r0 = f687a
            if (r0 == 0) goto L_0x0072
            java.lang.reflect.Field r0 = f687a     // Catch:{ IllegalAccessException -> 0x006a }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IllegalAccessException -> 0x006a }
            goto L_0x0073
        L_0x006a:
            r5 = move-exception
            java.lang.String r0 = "ResourcesFlusher"
            java.lang.String r1 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r0, r1, r5)
        L_0x0072:
            r5 = r2
        L_0x0073:
            if (r5 == 0) goto L_0x0078
            m298a((java.lang.Object) r5)
        L_0x0078:
            return
        L_0x0079:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L_0x00b5
            boolean r0 = f688b
            if (r0 != 0) goto L_0x009b
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r1 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x0091 }
            f687a = r0     // Catch:{ NoSuchFieldException -> 0x0091 }
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0091 }
            goto L_0x0099
        L_0x0091:
            r0 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r4, r0)
        L_0x0099:
            f688b = r3
        L_0x009b:
            java.lang.reflect.Field r0 = f687a
            if (r0 == 0) goto L_0x00ae
            java.lang.reflect.Field r0 = f687a     // Catch:{ IllegalAccessException -> 0x00a6 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IllegalAccessException -> 0x00a6 }
            goto L_0x00af
        L_0x00a6:
            r5 = move-exception
            java.lang.String r0 = "ResourcesFlusher"
            java.lang.String r1 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r0, r1, r5)
        L_0x00ae:
            r5 = r2
        L_0x00af:
            if (r5 == 0) goto L_0x00b4
            m298a((java.lang.Object) r5)
        L_0x00b4:
            return
        L_0x00b5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x00f2
            boolean r0 = f688b
            if (r0 != 0) goto L_0x00d7
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r1 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x00cd }
            f687a = r0     // Catch:{ NoSuchFieldException -> 0x00cd }
            r0.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00cd }
            goto L_0x00d5
        L_0x00cd:
            r0 = move-exception
            java.lang.String r1 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r4, r0)
        L_0x00d5:
            f688b = r3
        L_0x00d7:
            java.lang.reflect.Field r0 = f687a
            if (r0 == 0) goto L_0x00f2
            java.lang.reflect.Field r0 = f687a     // Catch:{ IllegalAccessException -> 0x00e4 }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ IllegalAccessException -> 0x00e4 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ IllegalAccessException -> 0x00e4 }
            goto L_0x00ed
        L_0x00e4:
            r5 = move-exception
            java.lang.String r0 = "ResourcesFlusher"
            java.lang.String r1 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r0, r1, r5)
            r5 = r2
        L_0x00ed:
            if (r5 == 0) goto L_0x00f2
            r5.clear()
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.C0212an.m297a(android.content.res.Resources):void");
    }

    /* renamed from: a */
    private static void m298a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f690d) {
            try {
                f689c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f690d = true;
        }
        if (f689c != null) {
            if (!f692f) {
                try {
                    Field declaredField = f689c.getDeclaredField("mUnthemedEntries");
                    f691e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f692f = true;
            }
            if (f691e != null) {
                try {
                    longSparseArray = (LongSparseArray) f691e.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
