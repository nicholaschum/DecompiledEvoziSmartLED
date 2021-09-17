package android.support.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.graphics.drawable.e */
final class C0068e extends Drawable.ConstantState {

    /* renamed from: a */
    private final Drawable.ConstantState f203a;

    public C0068e(Drawable.ConstantState constantState) {
        this.f203a = constantState;
    }

    public final boolean canApplyTheme() {
        return this.f203a.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.f203a.getChangingConfigurations();
    }

    public final Drawable newDrawable() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
        animatedVectorDrawableCompat.f208c = this.f203a.newDrawable();
        animatedVectorDrawableCompat.f208c.setCallback(animatedVectorDrawableCompat.f170b);
        return animatedVectorDrawableCompat;
    }

    public final Drawable newDrawable(Resources resources) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
        animatedVectorDrawableCompat.f208c = this.f203a.newDrawable(resources);
        animatedVectorDrawableCompat.f208c.setCallback(animatedVectorDrawableCompat.f170b);
        return animatedVectorDrawableCompat;
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
        animatedVectorDrawableCompat.f208c = this.f203a.newDrawable(resources, theme);
        animatedVectorDrawableCompat.f208c.setCallback(animatedVectorDrawableCompat.f170b);
        return animatedVectorDrawableCompat;
    }
}
