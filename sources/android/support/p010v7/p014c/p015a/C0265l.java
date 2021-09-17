package android.support.p010v7.p014c.p015a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p007v4.graphics.drawable.DrawableCompat;

/* renamed from: android.support.v7.c.a.l */
public class C0265l extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f914a;

    public C0265l(Drawable drawable) {
        if (this.f914a != null) {
            this.f914a.setCallback((Drawable.Callback) null);
        }
        this.f914a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* renamed from: a */
    public final Drawable mo3414a() {
        return this.f914a;
    }

    public void draw(Canvas canvas) {
        this.f914a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f914a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f914a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f914a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f914a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f914a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f914a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f914a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f914a.getPadding(rect);
    }

    public int[] getState() {
        return this.f914a.getState();
    }

    public Region getTransparentRegion() {
        return this.f914a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return DrawableCompat.isAutoMirrored(this.f914a);
    }

    public boolean isStateful() {
        return this.f914a.isStateful();
    }

    public void jumpToCurrentState() {
        DrawableCompat.jumpToCurrentState(this.f914a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f914a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f914a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f914a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        DrawableCompat.setAutoMirrored(this.f914a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f914a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f914a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f914a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f914a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        DrawableCompat.setHotspot(this.f914a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        DrawableCompat.setHotspotBounds(this.f914a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f914a.setState(iArr);
    }

    public void setTint(int i) {
        DrawableCompat.setTint(this.f914a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        DrawableCompat.setTintList(this.f914a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        DrawableCompat.setTintMode(this.f914a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f914a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
