package p021wl.smartled.views.floatingactionbutton;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;

/* renamed from: wl.smartled.views.floatingactionbutton.d */
final class C0609d extends AddFloatingActionButton {

    /* renamed from: i */
    final /* synthetic */ FloatingActionsMenu f2874i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0609d(FloatingActionsMenu floatingActionsMenu, Context context) {
        super(context);
        this.f2874i = floatingActionsMenu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo5218a() {
        C0613h hVar = new C0613h(super.mo5218a());
        C0613h unused = this.f2874i.f2854o = hVar;
        OvershootInterpolator overshootInterpolator = new OvershootInterpolator();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hVar, "rotation", new float[]{135.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hVar, "rotation", new float[]{0.0f, 135.0f});
        ofFloat.setInterpolator(overshootInterpolator);
        ofFloat2.setInterpolator(overshootInterpolator);
        this.f2874i.f2850k.play(ofFloat2);
        this.f2874i.f2851l.play(ofFloat);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5221b() {
        this.f2824a = this.f2874i.f2840a;
        this.f2826b = this.f2874i.f2841b;
        this.f2827c = this.f2874i.f2842c;
        this.f2832h = this.f2874i.f2844e;
        super.mo5221b();
    }
}
