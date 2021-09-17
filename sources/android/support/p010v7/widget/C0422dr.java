package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.dr */
public final class C0422dr extends Resources {

    /* renamed from: a */
    private static boolean f1876a = false;

    /* renamed from: b */
    private final WeakReference<Context> f1877b;

    public C0422dr(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1877b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1379a() {
        return f1876a && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo4578a(int i) {
        return super.getDrawable(i);
    }

    public final Drawable getDrawable(int i) {
        Context context = (Context) this.f1877b.get();
        return context != null ? C0332ai.m1109a().mo4304a(context, this, i) : super.getDrawable(i);
    }
}
