package android.support.p010v7.view.menu;

import android.support.p010v7.view.C0273d;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.view.menu.u */
final class C0316u extends FrameLayout implements C0273d {

    /* renamed from: a */
    final CollapsibleActionView f1229a;

    C0316u(View view) {
        super(view.getContext());
        this.f1229a = (CollapsibleActionView) view;
        addView(view);
    }

    /* renamed from: a */
    public final void mo3468a() {
        this.f1229a.onActionViewExpanded();
    }

    /* renamed from: b */
    public final void mo3469b() {
        this.f1229a.onActionViewCollapsed();
    }
}
