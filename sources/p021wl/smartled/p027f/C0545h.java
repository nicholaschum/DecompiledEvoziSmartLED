package p021wl.smartled.p027f;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* renamed from: wl.smartled.f.h */
public final class C0545h {
    /* renamed from: a */
    public static boolean m1908a(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
