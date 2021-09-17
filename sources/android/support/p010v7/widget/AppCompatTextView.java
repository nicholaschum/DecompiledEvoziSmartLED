package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.text.PrecomputedTextCompat;
import android.support.p007v4.view.TintableBackgroundView;
import android.support.p007v4.widget.AutoSizeableTextView;
import android.support.p007v4.widget.TextViewCompat;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.AppCompatTextView */
public class AppCompatTextView extends TextView implements TintableBackgroundView, AutoSizeableTextView {

    /* renamed from: a */
    private final C0330ag f1387a;

    /* renamed from: b */
    private final C0348ay f1388b;

    /* renamed from: c */
    private Future<PrecomputedTextCompat> f1389c;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        this.f1387a = new C0330ag(this);
        this.f1387a.mo4291a(attributeSet, i);
        this.f1388b = new C0348ay(this);
        this.f1388b.mo4348a(attributeSet, i);
        this.f1388b.mo4343a();
    }

    /* renamed from: a */
    private void mo3545a() {
        if (this.f1389c != null) {
            try {
                Future<PrecomputedTextCompat> future = this.f1389c;
                this.f1389c = null;
                TextViewCompat.setPrecomputedText(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1387a != null) {
            this.f1387a.mo4294d();
        }
        if (this.f1388b != null) {
            this.f1388b.mo4343a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f1388b != null) {
            return this.f1388b.mo4357h();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f1388b != null) {
            return this.f1388b.mo4356g();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f1388b != null) {
            return this.f1388b.mo4355f();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return PLATFORM_SUPPORTS_AUTOSIZE ? super.getAutoSizeTextAvailableSizes() : this.f1388b != null ? this.f1388b.mo4358i() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f1388b != null) {
            return this.f1388b.mo4354e();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.getFirstBaselineToTopHeight(this);
    }

    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.getLastBaselineToBottomHeight(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1387a != null) {
            return this.f1387a.mo4292b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1387a != null) {
            return this.f1387a.mo4293c();
        }
        return null;
    }

    public CharSequence getText() {
        mo3545a();
        return super.getText();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0338ao.m1130a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1388b != null) {
            this.f1388b.mo4351b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo3545a();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1388b != null && !PLATFORM_SUPPORTS_AUTOSIZE && this.f1388b.mo4353d()) {
            this.f1388b.mo4352c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f1388b != null) {
            this.f1388b.mo4346a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f1388b != null) {
            this.f1388b.mo4350a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f1388b != null) {
            this.f1388b.mo4344a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1387a != null) {
            this.f1387a.mo4287a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1387a != null) {
            this.f1387a.mo4288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.setFirstBaselineToTopHeight(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.setLastBaselineToBottomHeight(this, i);
        }
    }

    public void setLineHeight(int i) {
        TextViewCompat.setLineHeight(this, i);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1387a != null) {
            this.f1387a.mo4289a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1387a != null) {
            this.f1387a.mo4290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1388b != null) {
            this.f1388b.mo4347a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i, f);
        } else if (this.f1388b != null) {
            this.f1388b.mo4345a(i, f);
        }
    }
}
