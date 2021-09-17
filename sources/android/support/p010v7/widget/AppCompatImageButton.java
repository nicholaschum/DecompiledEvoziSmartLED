package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p007v4.view.TintableBackgroundView;
import android.support.p007v4.widget.TintableImageSourceView;
import android.support.p010v7.p011a.C0188b;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: android.support.v7.widget.AppCompatImageButton */
public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {

    /* renamed from: a */
    private final C0330ag f1365a;

    /* renamed from: b */
    private final C0339ap f1366b;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        this.f1365a = new C0330ag(this);
        this.f1365a.mo4291a(attributeSet, i);
        this.f1366b = new C0339ap(this);
        this.f1366b.mo4313a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1365a != null) {
            this.f1365a.mo4294d();
        }
        if (this.f1366b != null) {
            this.f1366b.mo4317d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1365a != null) {
            return this.f1365a.mo4292b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1365a != null) {
            return this.f1365a.mo4293c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f1366b != null) {
            return this.f1366b.mo4315b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        if (this.f1366b != null) {
            return this.f1366b.mo4316c();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f1366b.mo4314a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1365a != null) {
            this.f1365a.mo4287a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1365a != null) {
            this.f1365a.mo4288a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f1366b != null) {
            this.f1366b.mo4317d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f1366b != null) {
            this.f1366b.mo4317d();
        }
    }

    public void setImageResource(int i) {
        this.f1366b.mo4310a(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f1366b != null) {
            this.f1366b.mo4317d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1365a != null) {
            this.f1365a.mo4289a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1365a != null) {
            this.f1365a.mo4290a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1366b != null) {
            this.f1366b.mo4311a(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1366b != null) {
            this.f1366b.mo4312a(mode);
        }
    }
}
