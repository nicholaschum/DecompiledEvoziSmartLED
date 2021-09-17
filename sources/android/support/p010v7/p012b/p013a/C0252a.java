package android.support.p010v7.p012b.p013a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.content.ContextCompat;
import android.support.p007v4.content.res.ColorStateListInflaterCompat;
import android.support.p010v7.widget.C0332ai;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.b.a.a */
public final class C0252a {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f844a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<Context, SparseArray<C0253b>> f845b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f846c = new Object();

    /* renamed from: a */
    public static ColorStateList m418a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m421d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m420c(context, i);
        if (c == null) {
            return ContextCompat.getColorStateList(context, i);
        }
        synchronized (f846c) {
            SparseArray sparseArray = f845b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f845b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0253b(c, context.getResources().getConfiguration()));
        }
        return c;
    }

    /* renamed from: b */
    public static Drawable m419b(Context context, int i) {
        return C0332ai.m1109a().mo4302a(context, i);
    }

    /* renamed from: c */
    private static ColorStateList m420c(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue typedValue = f844a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f844a.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            z = false;
        }
        if (z) {
            return null;
        }
        Resources resources2 = context.getResources();
        try {
            return ColorStateListInflaterCompat.createFromXml(resources2, resources2.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m421d(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = f846c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.b.a.b>> r1 = f845b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            android.support.v7.b.a.b r2 = (android.support.p010v7.p012b.p013a.C0253b) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f848b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.f847a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.p012b.p013a.C0252a.m421d(android.content.Context, int):android.content.res.ColorStateList");
    }
}
