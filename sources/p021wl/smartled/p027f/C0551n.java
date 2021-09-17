package p021wl.smartled.p027f;

import android.content.Context;
import android.widget.Toast;

/* renamed from: wl.smartled.f.n */
public final class C0551n {

    /* renamed from: a */
    private static Toast f2418a;

    /* renamed from: a */
    public static void m1925a(Context context, int i) {
        String str = (String) context.getResources().getText(i);
        if (f2418a == null) {
            f2418a = Toast.makeText(context, str, 0);
        } else {
            f2418a.setText(str);
        }
        f2418a.show();
    }
}
