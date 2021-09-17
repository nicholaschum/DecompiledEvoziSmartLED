package android.support.p010v7.p014c.p015a;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: android.support.v7.c.a.f */
final class C0259f implements TimeInterpolator {

    /* renamed from: a */
    private int[] f861a;

    /* renamed from: b */
    private int f862b;

    /* renamed from: c */
    private int f863c;

    C0259f(AnimationDrawable animationDrawable, boolean z) {
        m445a(animationDrawable, z);
    }

    /* renamed from: a */
    private int m445a(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f862b = numberOfFrames;
        if (this.f861a == null || this.f861a.length < numberOfFrames) {
            this.f861a = new int[numberOfFrames];
        }
        int[] iArr = this.f861a;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr[i2] = duration;
            i += duration;
        }
        this.f863c = i;
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo3383a() {
        return this.f863c;
    }

    public final float getInterpolation(float f) {
        int i = (int) ((f * ((float) this.f863c)) + 0.5f);
        int i2 = this.f862b;
        int[] iArr = this.f861a;
        int i3 = 0;
        while (i3 < i2 && i >= iArr[i3]) {
            i -= iArr[i3];
            i3++;
        }
        return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f863c) : 0.0f);
    }
}
