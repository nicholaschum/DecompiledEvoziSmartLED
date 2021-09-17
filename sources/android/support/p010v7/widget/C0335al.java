package android.support.p010v7.widget;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.p007v4.util.LruCache;

/* renamed from: android.support.v7.widget.al */
final class C0335al extends LruCache<Integer, PorterDuffColorFilter> {
    public C0335al() {
        super(6);
    }

    /* renamed from: b */
    private static int m1125b(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PorterDuffColorFilter mo4308a(int i, PorterDuff.Mode mode) {
        return (PorterDuffColorFilter) get(Integer.valueOf(m1125b(i, mode)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PorterDuffColorFilter mo4309a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
        return (PorterDuffColorFilter) put(Integer.valueOf(m1125b(i, mode)), porterDuffColorFilter);
    }
}
