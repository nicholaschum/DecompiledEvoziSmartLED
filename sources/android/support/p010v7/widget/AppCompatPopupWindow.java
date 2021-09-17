package android.support.p010v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p007v4.widget.PopupWindowCompat;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.AppCompatPopupWindow */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: a */
    private static final boolean f1372a = (Build.VERSION.SDK_INT < 21);

    /* renamed from: b */
    private boolean f1373b;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m911a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m911a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m911a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0407dc a = C0407dc.m1308a(context, attributeSet, C0197k.f444ci, i, i2);
        if (a.mo4560h(C0197k.f446ck)) {
            m912a(a.mo4547a(C0197k.f446ck, false));
        }
        setBackgroundDrawable(a.mo4545a(C0197k.f445cj));
        a.mo4546a();
    }

    /* renamed from: a */
    private void m912a(boolean z) {
        if (f1372a) {
            this.f1373b = z;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f1372a && this.f1373b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1372a && this.f1373b) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1372a && this.f1373b) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
