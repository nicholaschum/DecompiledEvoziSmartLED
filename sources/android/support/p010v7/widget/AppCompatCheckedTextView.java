package android.support.p010v7.widget;

import android.content.Context;
import android.support.p007v4.widget.TextViewCompat;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* renamed from: android.support.v7.widget.AppCompatCheckedTextView */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f1361a = {16843016};

    /* renamed from: b */
    private final C0348ay f1362b;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0403cz.m1304a(context), attributeSet, i);
        this.f1362b = new C0348ay(this);
        this.f1362b.mo4348a(attributeSet, i);
        this.f1362b.mo4343a();
        C0407dc a = C0407dc.m1308a(getContext(), attributeSet, f1361a, i, 0);
        setCheckMarkDrawable(a.mo4545a(0));
        a.mo4546a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1362b != null) {
            this.f1362b.mo4343a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0338ao.m1130a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0252a.m419b(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1362b != null) {
            this.f1362b.mo4347a(context, i);
        }
    }
}
