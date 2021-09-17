package android.support.p007v4.content.p008pm;

import android.content.pm.PackageInfo;
import android.os.Build;

/* renamed from: android.support.v4.content.pm.PackageInfoCompat */
public final class PackageInfoCompat {
    private PackageInfoCompat() {
    }

    public static long getLongVersionCode(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode;
    }
}
