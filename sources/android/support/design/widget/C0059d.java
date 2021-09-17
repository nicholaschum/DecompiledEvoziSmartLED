package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.design.widget.d */
final class C0059d implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f149a;

    C0059d(CoordinatorLayout coordinatorLayout) {
        this.f149a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        if (this.f149a.f129e != null) {
            this.f149a.f129e.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f149a.mo85a(2);
        if (this.f149a.f129e != null) {
            this.f149a.f129e.onChildViewRemoved(view, view2);
        }
    }
}
