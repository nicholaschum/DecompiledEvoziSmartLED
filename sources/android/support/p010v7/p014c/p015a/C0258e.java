package android.support.p010v7.p014c.p015a;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;

/* renamed from: android.support.v7.c.a.e */
final class C0258e extends C0260g {

    /* renamed from: a */
    private final ObjectAnimator f859a;

    /* renamed from: b */
    private final boolean f860b;

    C0258e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super((byte) 0);
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C0259f fVar = new C0259f(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        if (Build.VERSION.SDK_INT >= 18) {
            ofInt.setAutoCancel(true);
        }
        ofInt.setDuration((long) fVar.mo3383a());
        ofInt.setInterpolator(fVar);
        this.f860b = z2;
        this.f859a = ofInt;
    }

    /* renamed from: a */
    public final void mo3370a() {
        this.f859a.start();
    }

    /* renamed from: b */
    public final void mo3371b() {
        this.f859a.cancel();
    }

    /* renamed from: c */
    public final boolean mo3381c() {
        return this.f860b;
    }

    /* renamed from: d */
    public final void mo3382d() {
        this.f859a.reverse();
    }
}
