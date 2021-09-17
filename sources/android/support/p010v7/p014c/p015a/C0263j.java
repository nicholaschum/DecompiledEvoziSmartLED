package android.support.p010v7.p014c.p015a;

import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.c.a.j */
final class C0263j implements Drawable.Callback {

    /* renamed from: a */
    private Drawable.Callback f878a;

    C0263j() {
    }

    /* renamed from: a */
    public final Drawable.Callback mo3393a() {
        Drawable.Callback callback = this.f878a;
        this.f878a = null;
        return callback;
    }

    /* renamed from: a */
    public final C0263j mo3394a(Drawable.Callback callback) {
        this.f878a = callback;
        return this;
    }

    public final void invalidateDrawable(Drawable drawable) {
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.f878a != null) {
            this.f878a.scheduleDrawable(drawable, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.f878a != null) {
            this.f878a.unscheduleDrawable(drawable, runnable);
        }
    }
}
