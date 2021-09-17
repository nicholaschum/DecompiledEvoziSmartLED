package p021wl.smartled.activity;

import android.support.p007v4.widget.DrawerLayout;
import android.view.View;

/* renamed from: wl.smartled.activity.q */
final class C0494q implements DrawerLayout.DrawerListener {

    /* renamed from: a */
    final /* synthetic */ MainActivity f2179a;

    private C0494q(MainActivity mainActivity) {
        this.f2179a = mainActivity;
    }

    /* synthetic */ C0494q(MainActivity mainActivity, byte b) {
        this(mainActivity);
    }

    public final void onDrawerClosed(View view) {
    }

    public final void onDrawerOpened(View view) {
    }

    public final void onDrawerSlide(View view, float f) {
        this.f2179a.f2118r.getLocationInWindow(this.f2179a.f2092S);
        this.f2179a.f2115o.getLocationInWindow(this.f2179a.f2093T);
        if (this.f2179a.f2092S[0] < this.f2179a.f2093T[0]) {
            this.f2179a.f2115o.setVisibility(0);
        } else {
            this.f2179a.f2115o.setVisibility(4);
        }
        this.f2179a.f2119s.getLocationInWindow(this.f2179a.f2092S);
        this.f2179a.f2117q.getLocationInWindow(this.f2179a.f2093T);
        if (this.f2179a.f2092S[0] < this.f2179a.f2093T[0]) {
            this.f2179a.f2117q.setVisibility(4);
        } else {
            this.f2179a.f2117q.setVisibility(0);
        }
    }

    public final void onDrawerStateChanged(int i) {
    }
}
