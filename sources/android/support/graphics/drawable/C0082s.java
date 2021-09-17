package android.support.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: android.support.graphics.drawable.s */
final class C0082s extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f267a;

    public C0082s(Drawable.ConstantState constantState) {
        this.f267a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f267a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f267a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.f208c = (VectorDrawable) this.f267a.newDrawable();
        return vectorDrawableCompat;
    }

    public final Drawable newDrawable(Resources resources) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.f208c = (VectorDrawable) this.f267a.newDrawable(resources);
        return vectorDrawableCompat;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.f208c = (VectorDrawable) this.f267a.newDrawable(resources, theme);
        return vectorDrawableCompat;
    }
}
