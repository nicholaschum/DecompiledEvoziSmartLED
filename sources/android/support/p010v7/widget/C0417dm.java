package android.support.p010v7.widget;

import android.os.Build;
import android.view.View;

/* renamed from: android.support.v7.widget.dm */
public final class C0417dm {
    /* renamed from: a */
    public static void m1368a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0418dn.m1370a(view, charSequence);
        }
    }
}
