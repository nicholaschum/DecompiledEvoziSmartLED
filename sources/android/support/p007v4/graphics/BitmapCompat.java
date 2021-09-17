package android.support.p007v4.graphics;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: android.support.v4.graphics.BitmapCompat */
public final class BitmapCompat {
    private BitmapCompat() {
    }

    public static int getAllocationByteCount(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
    }

    public static boolean hasMipMap(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bitmap.hasMipMap();
        }
        return false;
    }

    public static void setHasMipMap(Bitmap bitmap, boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(z);
        }
    }
}
