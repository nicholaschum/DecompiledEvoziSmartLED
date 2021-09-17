package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.TintableBackgroundView;
import android.support.p007v4.widget.AutoSizeableTextView;
import android.support.p007v4.widget.TextViewCompat;
import android.support.p010v7.p011a.C0188b;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: android.support.v7.widget.AppCompatButton */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView {

    /* renamed from: a */
    private final C0330ag f1358a;

    /* renamed from: b */
    private final C0348ay f1359b;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        this.f1358a = new C0330ag(this);
        this.f1358a.mo4291a(attributeSet, i);
        this.f1359b = new C0348ay(this);
        this.f1359b.mo4348a(attributeSet, i);
        this.f1359b.mo4343a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1358a != null) {
            this.f1358a.mo4294d();
        }
        if (this.f1359b != null) {
            this.f1359b.mo4343a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f1359b != null) {
            return this.f1359b.mo4357h();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f1359b != null) {
            return this.f1359b.mo4356g();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f1359b != null) {
            return this.f1359b.mo4355f();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return PLATFORM_SUPPORTS_AUTOSIZE ? super.getAutoSizeTextAvailableSizes() : this.f1359b != null ? this.f1359b.mo4358i() : new int[0];
    }

    public int getAutoSizeTextType() {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        if (this.f1359b != null) {
            return this.f1359b.mo4354e();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1358a != null) {
            return this.f1358a.mo4292b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1358a != null) {
            return this.f1358a.mo4293c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1359b != null) {
            this.f1359b.mo4351b();
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1359b != null && !PLATFORM_SUPPORTS_AUTOSIZE && this.f1359b.mo4353d()) {
            this.f1359b.mo4352c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.f1359b != null) {
            this.f1359b.mo4346a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.f1359b != null) {
            this.f1359b.mo4350a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.f1359b != null) {
            this.f1359b.mo4344a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1358a != null) {
            this.f1358a.mo4287a();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1358a != null) {
            this.f1358a.mo4288a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1358a != null) {
            this.f1358a.mo4289a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1358a != null) {
            this.f1358a.mo4290a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1359b != null) {
            this.f1359b.mo4347a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(i, f);
        } else if (this.f1359b != null) {
            this.f1359b.mo4345a(i, f);
        }
    }
}
