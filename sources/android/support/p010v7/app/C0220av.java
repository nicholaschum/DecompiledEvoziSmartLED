package android.support.p010v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.p007v4.content.PermissionChecker;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.av */
final class C0220av {

    /* renamed from: a */
    private static C0220av f713a;

    /* renamed from: b */
    private final Context f714b;

    /* renamed from: c */
    private final LocationManager f715c;

    /* renamed from: d */
    private final C0221aw f716d = new C0221aw();

    private C0220av(Context context, LocationManager locationManager) {
        this.f714b = context;
        this.f715c = locationManager;
    }

    /* renamed from: a */
    private Location m324a(String str) {
        try {
            if (this.f715c.isProviderEnabled(str)) {
                return this.f715c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    static C0220av m325a(Context context) {
        if (f713a == null) {
            Context applicationContext = context.getApplicationContext();
            f713a = new C0220av(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f713a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3278a() {
        long j;
        C0221aw awVar = this.f716d;
        boolean z = false;
        if (this.f716d.f722f > System.currentTimeMillis()) {
            return awVar.f717a;
        }
        Location location = null;
        Location a = PermissionChecker.checkSelfPermission(this.f714b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m324a("network") : null;
        if (PermissionChecker.checkSelfPermission(this.f714b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m324a("gps");
        }
        if (location == null || a == null ? location != null : location.getTime() > a.getTime()) {
            a = location;
        }
        if (a != null) {
            C0221aw awVar2 = this.f716d;
            long currentTimeMillis = System.currentTimeMillis();
            C0219au a2 = C0219au.m322a();
            C0219au auVar = a2;
            auVar.mo3277a(currentTimeMillis - 86400000, a.getLatitude(), a.getLongitude());
            long j2 = a2.f710a;
            auVar.mo3277a(currentTimeMillis, a.getLatitude(), a.getLongitude());
            if (a2.f712c == 1) {
                z = true;
            }
            long j3 = a2.f711b;
            long j4 = a2.f710a;
            double latitude = a.getLatitude();
            double longitude = a.getLongitude();
            C0221aw awVar3 = awVar;
            long j5 = j4;
            C0221aw awVar4 = awVar2;
            long j6 = j3;
            a2.mo3277a(currentTimeMillis + 86400000, latitude, longitude);
            long j7 = a2.f711b;
            if (j6 == -1 || j5 == -1) {
                j = 43200000 + currentTimeMillis;
            } else {
                j = (currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6) + 60000;
            }
            C0221aw awVar5 = awVar4;
            awVar5.f717a = z;
            awVar5.f718b = j2;
            awVar5.f719c = j6;
            awVar5.f720d = j5;
            awVar5.f721e = j7;
            awVar5.f722f = j;
            return awVar3.f717a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
