package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.view.TintableBackgroundView;
import android.support.p007v4.widget.TextViewCompat;
import android.support.p010v7.p011a.C0188b;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: android.support.v7.widget.AppCompatEditText */
public class AppCompatEditText extends EditText implements TintableBackgroundView {

    /* renamed from: a */
    private final C0330ag f1363a;

    /* renamed from: b */
    private final C0348ay f1364b;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        this.f1363a = new C0330ag(this);
        this.f1363a.mo4291a(attributeSet, i);
        this.f1364b = new C0348ay(this);
        this.f1364b.mo4348a(attributeSet, i);
        this.f1364b.mo4343a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1363a != null) {
            this.f1363a.mo4294d();
        }
        if (this.f1364b != null) {
            this.f1364b.mo4343a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1363a != null) {
            return this.f1363a.mo4292b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1363a != null) {
            return this.f1363a.mo4293c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0338ao.m1130a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1363a != null) {
            this.f1363a.mo4287a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1363a != null) {
            this.f1363a.mo4288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1363a != null) {
            this.f1363a.mo4289a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1363a != null) {
            this.f1363a.mo4290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1364b != null) {
            this.f1364b.mo4347a(context, i);
        }
    }
}
