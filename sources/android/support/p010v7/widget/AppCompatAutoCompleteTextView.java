package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.TintableBackgroundView;
import android.support.p007v4.widget.TextViewCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* renamed from: android.support.v7.widget.AppCompatAutoCompleteTextView */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements TintableBackgroundView {

    /* renamed from: a */
    private static final int[] f1355a = {16843126};

    /* renamed from: b */
    private final C0330ag f1356b;

    /* renamed from: c */
    private final C0348ay f1357c;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        C0407dc a = C0407dc.m1308a(getContext(), attributeSet, f1355a, i, 0);
        if (a.mo4560h(0)) {
            setDropDownBackgroundDrawable(a.mo4545a(0));
        }
        a.mo4546a();
        this.f1356b = new C0330ag(this);
        this.f1356b.mo4291a(attributeSet, i);
        this.f1357c = new C0348ay(this);
        this.f1357c.mo4348a(attributeSet, i);
        this.f1357c.mo4343a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1356b != null) {
            this.f1356b.mo4294d();
        }
        if (this.f1357c != null) {
            this.f1357c.mo4343a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1356b != null) {
            return this.f1356b.mo4292b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1356b != null) {
            return this.f1356b.mo4293c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0338ao.m1130a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1356b != null) {
            this.f1356b.mo4287a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1356b != null) {
            this.f1356b.mo4288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0252a.m419b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1356b != null) {
            this.f1356b.mo4289a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1356b != null) {
            this.f1356b.mo4290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1357c != null) {
            this.f1357c.mo4347a(context, i);
        }
    }
}
