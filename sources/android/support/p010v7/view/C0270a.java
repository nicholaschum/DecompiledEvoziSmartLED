package android.support.p010v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0189c;
import android.support.p010v7.p011a.C0191e;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public final class C0270a {

    /* renamed from: a */
    private Context f932a;

    private C0270a(Context context) {
        this.f932a = context;
    }

    /* renamed from: a */
    public static C0270a m488a(Context context) {
        return new C0270a(context);
    }

    /* renamed from: a */
    public final int mo3458a() {
        Configuration configuration = this.f932a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* renamed from: b */
    public final boolean mo3459b() {
        return Build.VERSION.SDK_INT >= 19 || !ViewConfiguration.get(this.f932a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public final int mo3460c() {
        return this.f932a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public final boolean mo3461d() {
        return this.f932a.getResources().getBoolean(C0189c.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public final int mo3462e() {
        TypedArray obtainStyledAttributes = this.f932a.obtainStyledAttributes((AttributeSet) null, C0197k.f303a, C0188b.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0197k.f522j, 0);
        Resources resources = this.f932a.getResources();
        if (!mo3461d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0191e.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public final boolean mo3463f() {
        return this.f932a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public final int mo3464g() {
        return this.f932a.getResources().getDimensionPixelSize(C0191e.abc_action_bar_stacked_tab_max_width);
    }
}
