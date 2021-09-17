package p021wl.smartled.p026e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.p007v4.app.ActivityCompat;
import android.support.p007v4.app.Fragment;
import android.support.p007v4.content.ContextCompat;
import android.support.p007v4.content.PermissionChecker;
import android.support.p010v7.app.AppCompatActivity;
import android.support.p010v7.app.C0241p;
import android.util.SparseArray;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.SmartLedApplication;
import p021wl.smartled.p023b.C0517e;

/* renamed from: wl.smartled.e.a */
public final class C0534a {

    /* renamed from: a */
    private static int f2391a;

    /* renamed from: b */
    private static SparseArray<C0537d> f2392b = new SparseArray<>();

    /* renamed from: d */
    private static String[] f2393d;

    /* renamed from: e */
    private static C0537d f2394e;

    /* renamed from: f */
    private static int f2395f;

    /* renamed from: c */
    private Object f2396c;

    static {
        f2395f = 23;
        try {
            Context a = SmartLedApplication.m1588a();
            f2395f = a.getPackageManager().getPackageInfo(a.getPackageName(), 0).applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private C0534a(Object obj) {
        this.f2396c = obj;
    }

    /* renamed from: a */
    private static Activity m1849a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Activity) {
            return (Activity) obj;
        }
        if (obj instanceof Fragment) {
            return ((Fragment) obj).getActivity();
        }
        return null;
    }

    /* renamed from: a */
    private static List<String> m1850a(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (f2395f >= 23) {
                if (ContextCompat.checkSelfPermission(context, str) == 0) {
                }
            } else if (PermissionChecker.checkSelfPermission(context, str) == 0) {
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C0534a m1851a(Activity activity) {
        return new C0534a(activity);
    }

    /* renamed from: a */
    private static void m1852a(Activity activity, String str, DialogInterface.OnClickListener onClickListener) {
        new C0241p(activity).mo3326b((CharSequence) str).mo3317a(onClickListener).mo3324b().mo3328c().show();
    }

    /* renamed from: a */
    private static void m1853a(Activity activity, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < strArr.length) {
            sb.append(" ");
            int i2 = i + 1;
            sb.append(i2);
            sb.append('.');
            sb.append(activity.getString(C0517e.f2297k.get(strArr[i]).intValue()));
            sb.append(10);
            i = i2;
        }
        m1852a(activity, activity.getString(C0462R.string.string_permission_request_message, new Object[]{sb.toString()}), (DialogInterface.OnClickListener) new C0535b(activity));
    }

    /* renamed from: a */
    public static void m1854a(Context context, int i, String[] strArr) {
        int i2;
        C0537d dVar = f2392b.get(i);
        if (dVar != null) {
            f2392b.remove(i);
            if (strArr.length > 0) {
                int[] iArr = new int[strArr.length];
                int i3 = 0;
                for (String str : strArr) {
                    if (f2395f >= 23) {
                        i2 = i3 + 1;
                        iArr[i3] = ContextCompat.checkSelfPermission(context, str);
                    } else {
                        i2 = i3 + 1;
                        iArr[i3] = PermissionChecker.checkSelfPermission(context, str);
                    }
                    i3 = i2;
                }
                for (int i4 : iArr) {
                    if (i4 != 0) {
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(m1849a((Object) context), strArr[0])) {
                            m1853a(m1849a((Object) context), strArr);
                        }
                        dVar.mo4777b();
                        return;
                    }
                }
                dVar.mo4776a();
                return;
            }
            m1853a(m1849a((Object) context), f2393d);
            dVar.mo4777b();
        }
    }

    /* renamed from: b */
    public static void m1855b(Activity activity) {
        m1852a(activity, activity.getString(C0462R.string.string_permission_location_request_message), (DialogInterface.OnClickListener) new C0536c(activity));
    }

    /* renamed from: a */
    public final C0534a mo4975a(C0537d dVar) {
        f2394e = dVar;
        return this;
    }

    /* renamed from: a */
    public final C0534a mo4976a(String... strArr) {
        f2393d = strArr;
        return this;
    }

    /* renamed from: a */
    public final void mo4977a() {
        if (Build.VERSION.SDK_INT >= 23) {
            Activity a = m1849a(this.f2396c);
            if (a != null) {
                List<String> a2 = m1850a((Context) a, f2393d);
                if (!a2.isEmpty()) {
                    int i = f2391a + 1;
                    f2391a = i;
                    String[] strArr = (String[]) a2.toArray(new String[a2.size()]);
                    Object obj = this.f2396c;
                    if (obj instanceof AppCompatActivity) {
                        ActivityCompat.requestPermissions((Activity) obj, strArr, i);
                    } else if (obj instanceof Activity) {
                        ((Activity) obj).requestPermissions(strArr, i);
                    } else if (obj instanceof Fragment) {
                        ((Fragment) obj).requestPermissions(strArr, i);
                    }
                    f2392b.put(i, f2394e);
                } else if (f2394e != null) {
                    f2394e.mo4776a();
                }
            } else {
                throw new IllegalArgumentException(this.f2396c.getClass().getName() + " is not supported");
            }
        } else if (f2394e != null) {
            f2394e.mo4776a();
        }
    }
}
