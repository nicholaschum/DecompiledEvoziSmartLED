package p021wl.smartled.views.floatingactionbutton;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: wl.smartled.views.floatingactionbutton.f */
final class C0611f extends ViewGroup.LayoutParams {

    /* renamed from: a */
    final /* synthetic */ FloatingActionsMenu f2876a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ObjectAnimator f2877b = new ObjectAnimator();

    /* renamed from: c */
    private ObjectAnimator f2878c = new ObjectAnimator();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ObjectAnimator f2879d = new ObjectAnimator();

    /* renamed from: e */
    private ObjectAnimator f2880e = new ObjectAnimator();

    /* renamed from: f */
    private boolean f2881f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0611f(FloatingActionsMenu floatingActionsMenu, ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2876a = floatingActionsMenu;
        this.f2877b.setInterpolator(FloatingActionsMenu.f2837v);
        this.f2878c.setInterpolator(FloatingActionsMenu.f2839x);
        this.f2879d.setInterpolator(FloatingActionsMenu.f2838w);
        this.f2880e.setInterpolator(FloatingActionsMenu.f2838w);
        this.f2880e.setProperty(View.ALPHA);
        this.f2880e.setFloatValues(new float[]{1.0f, 0.0f});
        this.f2878c.setProperty(View.ALPHA);
        this.f2878c.setFloatValues(new float[]{0.0f, 1.0f});
        switch (floatingActionsMenu.f2845f) {
            case 0:
            case 1:
                this.f2879d.setProperty(View.TRANSLATION_Y);
                this.f2877b.setProperty(View.TRANSLATION_Y);
                return;
            case 2:
            case 3:
                this.f2879d.setProperty(View.TRANSLATION_X);
                this.f2877b.setProperty(View.TRANSLATION_X);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private void m2250a(Animator animator, View view) {
        animator.addListener(new C0612g(this, view));
    }

    /* renamed from: a */
    public final void mo5243a(View view) {
        this.f2880e.setTarget(view);
        this.f2879d.setTarget(view);
        this.f2878c.setTarget(view);
        this.f2877b.setTarget(view);
        if (!this.f2881f) {
            m2250a(this.f2877b, view);
            m2250a(this.f2879d, view);
            this.f2876a.f2851l.play(this.f2880e);
            this.f2876a.f2851l.play(this.f2879d);
            this.f2876a.f2850k.play(this.f2878c);
            this.f2876a.f2850k.play(this.f2877b);
            this.f2881f = true;
        }
    }
}
