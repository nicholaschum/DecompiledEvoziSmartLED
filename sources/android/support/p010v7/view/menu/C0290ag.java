package android.support.p010v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p007v4.internal.view.SupportMenuItem;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.ag */
public final class C0290ag {
    /* renamed from: a */
    public static Menu m689a(Context context, SupportMenu supportMenu) {
        return new C0291ah(context, supportMenu);
    }

    /* renamed from: a */
    public static MenuItem m690a(Context context, SupportMenuItem supportMenuItem) {
        return Build.VERSION.SDK_INT >= 16 ? new C0319x(context, supportMenuItem) : new C0314s(context, supportMenuItem);
    }
}
