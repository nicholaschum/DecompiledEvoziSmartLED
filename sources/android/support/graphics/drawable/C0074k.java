package android.support.graphics.drawable;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.graphics.drawable.TintAwareDrawable;

/* renamed from: android.support.graphics.drawable.k */
abstract class C0074k extends Drawable implements TintAwareDrawable {

    /* renamed from: c */
    Drawable f208c;

    C0074k() {
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f208c != null) {
            DrawableCompat.applyTheme(this.f208c, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f208c != null) {
            this.f208c.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f208c != null) {
            return DrawableCompat.getColorFilter(this.f208c);
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f208c != null ? this.f208c.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f208c != null ? this.f208c.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f208c != null ? this.f208c.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f208c != null ? this.f208c.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f208c != null ? this.f208c.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f208c != null ? this.f208c.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f208c != null) {
            DrawableCompat.jumpToCurrentState(this.f208c);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f208c != null) {
            this.f208c.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f208c != null ? this.f208c.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f208c != null) {
            this.f208c.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f208c != null) {
            this.f208c.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f208c != null) {
            this.f208c.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f208c != null) {
            DrawableCompat.setHotspot(this.f208c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f208c != null) {
            DrawableCompat.setHotspotBounds(this.f208c, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f208c != null ? this.f208c.setState(iArr) : super.setState(iArr);
    }
}
