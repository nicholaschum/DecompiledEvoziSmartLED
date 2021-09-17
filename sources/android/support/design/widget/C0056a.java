package android.support.design.widget;

import android.support.p007v4.view.OnApplyWindowInsetsListener;
import android.support.p007v4.view.WindowInsetsCompat;
import android.view.View;

/* renamed from: android.support.design.widget.a */
final class C0056a implements OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f148a;

    C0056a(CoordinatorLayout coordinatorLayout) {
        this.f148a = coordinatorLayout;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return this.f148a.mo84a(windowInsetsCompat);
    }
}
