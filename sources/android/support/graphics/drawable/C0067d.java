package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.p007v4.util.ArrayMap;
import java.util.ArrayList;

/* renamed from: android.support.graphics.drawable.d */
final class C0067d extends Drawable.ConstantState {

    /* renamed from: a */
    int f198a;

    /* renamed from: b */
    VectorDrawableCompat f199b;

    /* renamed from: c */
    AnimatorSet f200c;

    /* renamed from: d */
    ArrayList<Animator> f201d;

    /* renamed from: e */
    ArrayMap<Animator, String> f202e;

    public final int getChangingConfigurations() {
        return this.f198a;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
