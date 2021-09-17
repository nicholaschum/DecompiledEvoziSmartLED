package android.support.p010v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.cz */
public final class C0403cz extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1815a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0403cz>> f1816b;

    /* renamed from: c */
    private final Resources f1817c;

    /* renamed from: d */
    private final Resources.Theme f1818d;

    private C0403cz(Context context) {
        super(context);
        if (C0422dr.m1379a()) {
            this.f1817c = new C0422dr(this, context.getResources());
            this.f1818d = this.f1817c.newTheme();
            this.f1818d.setTo(context.getTheme());
            return;
        }
        this.f1817c = new C0406db(this, context.getResources());
        this.f1818d = null;
    }

    /* renamed from: a */
    public static Context m1304a(Context context) {
        boolean z = false;
        if (!(context instanceof C0403cz) && !(context.getResources() instanceof C0406db) && !(context.getResources() instanceof C0422dr) && (Build.VERSION.SDK_INT < 21 || C0422dr.m1379a())) {
            z = true;
        }
        if (!z) {
            return context;
        }
        synchronized (f1815a) {
            if (f1816b == null) {
                f1816b = new ArrayList<>();
            } else {
                for (int size = f1816b.size() - 1; size >= 0; size--) {
                    WeakReference weakReference = f1816b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1816b.remove(size);
                    }
                }
                for (int size2 = f1816b.size() - 1; size2 >= 0; size2--) {
                    WeakReference weakReference2 = f1816b.get(size2);
                    C0403cz czVar = weakReference2 != null ? (C0403cz) weakReference2.get() : null;
                    if (czVar != null && czVar.getBaseContext() == context) {
                        return czVar;
                    }
                }
            }
            C0403cz czVar2 = new C0403cz(context);
            f1816b.add(new WeakReference(czVar2));
            return czVar2;
        }
    }

    public final AssetManager getAssets() {
        return this.f1817c.getAssets();
    }

    public final Resources getResources() {
        return this.f1817c;
    }

    public final Resources.Theme getTheme() {
        return this.f1818d == null ? super.getTheme() : this.f1818d;
    }

    public final void setTheme(int i) {
        if (this.f1818d == null) {
            super.setTheme(i);
        } else {
            this.f1818d.applyStyle(i, true);
        }
    }
}
