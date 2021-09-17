package com.qihoo360.replugin.loader.p017a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.util.Log;
import com.qihoo360.replugin.C0459f;

/* renamed from: com.qihoo360.replugin.loader.a.PluginPreferenceActivity */
public class PluginPreferenceActivity extends PreferenceActivity {
    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(C0459f.m1532a((Activity) this, context));
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
            Log.e("PluginActivity", "o r i s: p=" + getPackageCodePath() + "; " + th.getMessage(), th);
        }
    }

    public void startActivity(Intent intent) {
        if (!C0459f.m1535a((Activity) this, intent)) {
            super.startActivity(intent);
        }
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!C0459f.m1536a(this, intent, i)) {
            super.startActivityForResult(intent, i);
        }
    }
}
