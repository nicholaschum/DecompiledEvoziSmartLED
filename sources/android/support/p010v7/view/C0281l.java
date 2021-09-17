package android.support.p010v7.view;

import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p007v4.view.ViewPropertyAnimatorListener;
import android.support.p007v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.l */
public final class C0281l {

    /* renamed from: a */
    final ArrayList<ViewPropertyAnimatorCompat> f994a = new ArrayList<>();

    /* renamed from: b */
    ViewPropertyAnimatorListener f995b;

    /* renamed from: c */
    private long f996c = -1;

    /* renamed from: d */
    private Interpolator f997d;

    /* renamed from: e */
    private boolean f998e;

    /* renamed from: f */
    private final ViewPropertyAnimatorListenerAdapter f999f = new C0282m(this);

    /* renamed from: a */
    public final C0281l mo3504a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.f998e) {
            this.f994a.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    /* renamed from: a */
    public final C0281l mo3505a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.f994a.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.f994a.add(viewPropertyAnimatorCompat2);
        return this;
    }

    /* renamed from: a */
    public final C0281l mo3506a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f998e) {
            this.f995b = viewPropertyAnimatorListener;
        }
        return this;
    }

    /* renamed from: a */
    public final C0281l mo3507a(Interpolator interpolator) {
        if (!this.f998e) {
            this.f997d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final void mo3508a() {
        if (!this.f998e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f994a.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat next = it.next();
                if (this.f996c >= 0) {
                    next.setDuration(this.f996c);
                }
                if (this.f997d != null) {
                    next.setInterpolator(this.f997d);
                }
                if (this.f995b != null) {
                    next.setListener(this.f999f);
                }
                next.start();
            }
            this.f998e = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3509b() {
        this.f998e = false;
    }

    /* renamed from: c */
    public final void mo3510c() {
        if (this.f998e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f994a.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f998e = false;
        }
    }

    /* renamed from: d */
    public final C0281l mo3511d() {
        if (!this.f998e) {
            this.f996c = 250;
        }
        return this;
    }
}
