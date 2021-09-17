package p021wl.smartled.beans;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: wl.smartled.beans.c */
public final class C0522c {

    /* renamed from: a */
    private static int f2342a;

    /* renamed from: a */
    public static int m1758a(Context context) {
        int i = context.getSharedPreferences("SmartLedApp", 0).getInt("CurrentModekey", f2342a);
        f2342a = i;
        return i;
    }

    /* renamed from: a */
    public static void m1759a(Context context, int i) {
        if (f2342a != i) {
            SharedPreferences.Editor edit = context.getSharedPreferences("SmartLedApp", 0).edit();
            edit.putInt("CurrentModekey", i);
            edit.apply();
            f2342a = i;
        }
    }
}
