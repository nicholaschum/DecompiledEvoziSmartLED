package android.support.p010v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.support.p010v7.p011a.C0196j;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.e */
public final class C0274e extends ContextWrapper {

    /* renamed from: a */
    private int f935a;

    /* renamed from: b */
    private Resources.Theme f936b;

    /* renamed from: c */
    private LayoutInflater f937c;

    /* renamed from: d */
    private Configuration f938d;

    /* renamed from: e */
    private Resources f939e;

    public C0274e() {
        super((Context) null);
    }

    public C0274e(Context context, int i) {
        super(context);
        this.f935a = i;
    }

    /* renamed from: b */
    private void m519b() {
        if (this.f936b == null) {
            this.f936b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f936b.setTo(theme);
            }
        }
        this.f936b.applyStyle(this.f935a, true);
    }

    /* renamed from: a */
    public final int mo3470a() {
        return this.f935a;
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        Resources resources;
        if (this.f939e == null) {
            if (this.f938d == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(this.f938d).getResources();
            }
            this.f939e = resources;
        }
        return this.f939e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f937c == null) {
            this.f937c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f937c;
    }

    public final Resources.Theme getTheme() {
        if (this.f936b != null) {
            return this.f936b;
        }
        if (this.f935a == 0) {
            this.f935a = C0196j.Theme_AppCompat_Light;
        }
        m519b();
        return this.f936b;
    }

    public final void setTheme(int i) {
        if (this.f935a != i) {
            this.f935a = i;
            m519b();
        }
    }
}
