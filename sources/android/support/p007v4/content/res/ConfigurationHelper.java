package android.support.p007v4.content.res;

import android.content.res.Resources;
import android.os.Build;

/* renamed from: android.support.v4.content.res.ConfigurationHelper */
public final class ConfigurationHelper {
    private ConfigurationHelper() {
    }

    public static int getDensityDpi(Resources resources) {
        return Build.VERSION.SDK_INT >= 17 ? resources.getConfiguration().densityDpi : resources.getDisplayMetrics().densityDpi;
    }
}
