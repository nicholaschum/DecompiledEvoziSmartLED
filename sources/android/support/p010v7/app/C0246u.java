package android.support.p010v7.app;

import android.support.p007v4.view.OnApplyWindowInsetsListener;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.WindowInsetsCompat;
import android.view.View;

/* renamed from: android.support.v7.app.u */
final class C0246u implements OnApplyWindowInsetsListener {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f838a;

    C0246u(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f838a = appCompatDelegateImpl;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        int h = this.f838a.mo3208h(systemWindowInsetTop);
        if (systemWindowInsetTop != h) {
            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), h, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
        }
        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
    }
}
