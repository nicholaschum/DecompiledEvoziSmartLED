package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.db */
final class C0406db extends C0374bx {

    /* renamed from: a */
    private final WeakReference<Context> f1824a;

    public C0406db(Context context, Resources resources) {
        super(resources);
        this.f1824a = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1824a.get();
        if (!(drawable == null || context == null)) {
            C0332ai.m1109a();
            C0332ai.m1113a(context, i, drawable);
        }
        return drawable;
    }
}
