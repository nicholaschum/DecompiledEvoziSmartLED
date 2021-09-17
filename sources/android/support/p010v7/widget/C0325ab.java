package android.support.p010v7.widget;

import android.support.p007v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: android.support.v7.widget.ab */
final class C0325ab extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1605a;

    C0325ab(ActivityChooserView activityChooserView) {
        this.f1605a = activityChooserView;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
    }
}
