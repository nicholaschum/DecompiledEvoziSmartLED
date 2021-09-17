package com.qihoo360.replugin.loader.p017a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.p007v4.app.Fragment;
import android.support.p007v4.app.FragmentActivity;
import android.support.p007v4.internal.view.SupportMenu;
import android.util.Log;
import com.qihoo360.replugin.C0459f;
import java.lang.reflect.Field;

/* renamed from: com.qihoo360.replugin.loader.a.PluginFragmentActivity */
public abstract class PluginFragmentActivity extends FragmentActivity {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C0459f.m1532a((Activity) this, context));
    }

    public Context getBaseContext() {
        return super.getBaseContext();
    }

    public String getPackageCodePath() {
        return super.getPackageCodePath();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0459f.m1534a((Activity) this, bundle);
        super.onCreate(bundle);
        C0459f.m1539b((Activity) this, bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C0459f.m1533a(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        C0459f.m1541c(this, bundle);
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Throwable th) {
            Log.e("PluginFragmentActivity", "o r i s: p=" + getPackageCodePath() + "; " + th.getMessage(), th);
        }
    }

    public void startActivity(Intent intent) {
        if (!C0459f.m1535a((Activity) this, intent)) {
            super.startActivity(intent);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!C0459f.m1537a((Activity) this, intent, i, bundle)) {
            if (Build.VERSION.SDK_INT >= 16) {
                super.startActivityForResult(intent, i, bundle);
            } else {
                super.startActivityForResult(intent, i);
            }
        }
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        int i2 = -1;
        if (i == -1) {
            startActivityForResult(intent, -1);
        } else if ((-65536 & i) == 0) {
            try {
                Field declaredField = Fragment.class.getDeclaredField("mIndex");
                boolean isAccessible = declaredField.isAccessible();
                if (!isAccessible) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(fragment);
                if (!isAccessible) {
                    declaredField.setAccessible(isAccessible);
                }
                i2 = ((((Integer) obj).intValue() + 1) << 16) + (i & SupportMenu.USER_MASK);
            } catch (Throwable unused) {
            }
            startActivityForResult(intent, i2);
        } else {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }
}
