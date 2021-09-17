package android.support.p010v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.p007v4.view.ActionProvider;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0195i;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.TypedValue;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.widget.ShareActionProvider */
public class ShareActionProvider extends ActionProvider {

    /* renamed from: a */
    final Context f1511a;

    /* renamed from: b */
    String f1512b;

    /* renamed from: c */
    private int f1513c;

    /* renamed from: d */
    private final C0398cu f1514d;

    /* renamed from: a */
    static void m1008a(Intent intent) {
        intent.addFlags(Build.VERSION.SDK_INT >= 21 ? 134742016 : 524288);
    }

    public boolean hasSubMenu() {
        return true;
    }

    public View onCreateActionView() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f1511a);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.mo3992a(C0439s.m1407a(this.f1511a, this.f1512b));
        }
        TypedValue typedValue = new TypedValue();
        this.f1511a.getTheme().resolveAttribute(C0188b.actionModeShareDrawable, typedValue, true);
        activityChooserView.mo3991a(C0252a.m419b(this.f1511a, typedValue.resourceId));
        activityChooserView.f1339d = this;
        activityChooserView.mo3996c(C0195i.abc_shareactionprovider_share_with_application);
        activityChooserView.mo3990a(C0195i.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
        subMenu.clear();
        C0439s a = C0439s.m1407a(this.f1511a, this.f1512b);
        PackageManager packageManager = this.f1511a.getPackageManager();
        int a2 = a.mo4587a();
        int min = Math.min(a2, this.f1513c);
        for (int i = 0; i < min; i++) {
            ResolveInfo a3 = a.mo4589a(i);
            subMenu.add(0, i, i, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1514d);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f1511a.getString(C0195i.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < a2; i2++) {
                ResolveInfo a4 = a.mo4589a(i2);
                addSubMenu.add(0, i2, i2, a4.loadLabel(packageManager)).setIcon(a4.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1514d);
            }
        }
    }
}
