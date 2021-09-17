package p021wl.smartled.beans;

import android.content.SharedPreferences;
import android.graphics.Point;
import p021wl.smartled.SmartLedApplication;

/* renamed from: wl.smartled.beans.d */
public class C0523d {

    /* renamed from: a */
    private static C0523d f2343a;

    /* renamed from: b */
    private static final int[] f2344b = {-10305169, -1179403, -11228943, -8894211, -644, -3289651};

    /* renamed from: c */
    private static final Point[] f2345c = new Point[6];

    /* renamed from: d */
    private static final double[] f2346d = {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 6.283185307179586d};

    private C0523d() {
        SharedPreferences sharedPreferences = SmartLedApplication.m1588a().getSharedPreferences("SmartLedApp", 0);
        String string = sharedPreferences.getString("CustomizedColorkey", "");
        String string2 = sharedPreferences.getString("CustomizedPointkey", "");
        String string3 = sharedPreferences.getString("CustomizedDegreekey", "");
        if (!string.isEmpty()) {
            String[] split = string.split(",");
            for (int i = 0; i < 6; i++) {
                if (i < split.length) {
                    f2344b[i] = Integer.valueOf(split[i]).intValue();
                }
            }
        }
        if (string2.isEmpty()) {
            for (int i2 = 0; i2 < 6; i2++) {
                f2345c[i2] = new Point();
            }
        } else {
            String[] split2 = string2.split(",");
            for (int i3 = 0; i3 < 6; i3++) {
                Point point = new Point();
                if (i3 < split2.length) {
                    String[] split3 = split2[i3].split("_");
                    if (split3.length >= 2) {
                        point.x = Integer.valueOf(split3[0]).intValue();
                        point.y = Integer.valueOf(split3[1]).intValue();
                    }
                }
                f2345c[i3] = point;
            }
        }
        if (!string3.isEmpty()) {
            String[] split4 = string3.split(",");
            for (int i4 = 0; i4 < 6; i4++) {
                if (i4 < split4.length) {
                    f2346d[i4] = Double.valueOf(split4[i4]).doubleValue();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m1760a(int i) {
        if (i < f2344b.length) {
            return f2344b[i];
        }
        return 0;
    }

    /* renamed from: a */
    public static C0523d m1761a() {
        if (f2343a == null) {
            synchronized (C0523d.class) {
                if (f2343a == null) {
                    f2343a = new C0523d();
                }
            }
        }
        return f2343a;
    }

    /* renamed from: a */
    public static void m1762a(int i, double d) {
        if (i < f2346d.length) {
            f2346d[i] = d;
        }
    }

    /* renamed from: a */
    public static void m1763a(int i, int i2) {
        if (i < f2344b.length) {
            f2344b[i] = i2;
        }
    }

    /* renamed from: a */
    public static void m1764a(int i, Point point) {
        if (i < f2345c.length) {
            f2345c[i] = point;
        }
    }

    /* renamed from: b */
    public static Point m1765b(int i) {
        return i < f2345c.length ? f2345c[i] : new Point();
    }

    /* renamed from: b */
    public static void m1766b() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(f2344b[i]);
            sb.append(",");
            Point point = f2345c[i];
            sb2.append(point.x);
            sb2.append("_");
            sb2.append(point.y);
            sb2.append(",");
            sb3.append(f2346d[i]);
            sb3.append(",");
        }
        SharedPreferences.Editor edit = SmartLedApplication.m1588a().getSharedPreferences("SmartLedApp", 0).edit();
        edit.putString("CustomizedColorkey", sb.toString());
        edit.putString("CustomizedPointkey", sb2.toString());
        edit.putString("CustomizedDegreekey", sb3.toString());
        edit.apply();
    }

    /* renamed from: c */
    public static double m1767c(int i) {
        if (i < f2346d.length) {
            return f2346d[i];
        }
        return 0.0d;
    }
}
