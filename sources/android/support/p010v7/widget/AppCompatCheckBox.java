package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.widget.TintableCompoundButton;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: android.support.v7.widget.AppCompatCheckBox */
public class AppCompatCheckBox extends CheckBox implements TintableCompoundButton {

    /* renamed from: a */
    private final C0331ah f1360a;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        this.f1360a = new C0331ah(this);
        this.f1360a.mo4299a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f1360a != null ? this.f1360a.mo4295a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f1360a != null) {
            return this.f1360a.mo4296a();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f1360a != null) {
            return this.f1360a.mo4300b();
        }
        return null;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0252a.m419b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f1360a != null) {
            this.f1360a.mo4301c();
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f1360a != null) {
            this.f1360a.mo4297a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        if (this.f1360a != null) {
            this.f1360a.mo4298a(mode);
        }
    }
}
