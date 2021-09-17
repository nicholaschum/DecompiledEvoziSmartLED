package android.support.graphics.drawable;

import android.graphics.drawable.Drawable;

/* renamed from: android.support.graphics.drawable.c */
final class C0066c implements Drawable.Callback {

    /* renamed from: a */
    final /* synthetic */ AnimatedVectorDrawableCompat f197a;

    C0066c(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
        this.f197a = animatedVectorDrawableCompat;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.f197a.invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f197a.scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f197a.unscheduleSelf(runnable);
    }
}
