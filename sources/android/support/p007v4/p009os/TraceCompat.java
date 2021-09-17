package android.support.p007v4.p009os;

import android.os.Build;
import android.os.Trace;

/* renamed from: android.support.v4.os.TraceCompat */
public final class TraceCompat {
    private TraceCompat() {
    }

    public static void beginSection(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
