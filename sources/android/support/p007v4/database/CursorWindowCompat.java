package android.support.p007v4.database;

import android.database.CursorWindow;
import android.os.Build;

/* renamed from: android.support.v4.database.CursorWindowCompat */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        return Build.VERSION.SDK_INT >= 28 ? new CursorWindow(str, j) : Build.VERSION.SDK_INT >= 15 ? new CursorWindow(str) : new CursorWindow(false);
    }
}
