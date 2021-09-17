package p021wl.smartled.views.floatingactionbutton;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: wl.smartled.views.floatingactionbutton.b */
final class C0607b extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final /* synthetic */ int f2867a;

    /* renamed from: b */
    final /* synthetic */ int f2868b;

    /* renamed from: c */
    final /* synthetic */ int f2869c;

    /* renamed from: d */
    final /* synthetic */ int f2870d;

    /* renamed from: e */
    final /* synthetic */ int f2871e;

    /* renamed from: f */
    final /* synthetic */ FloatingActionButton f2872f;

    C0607b(FloatingActionButton floatingActionButton, int i, int i2, int i3, int i4, int i5) {
        this.f2872f = floatingActionButton;
        this.f2867a = i;
        this.f2868b = i2;
        this.f2869c = i3;
        this.f2870d = i4;
        this.f2871e = i5;
    }

    public final Shader resize(int i, int i2) {
        float f = (float) (i / 2);
        return new LinearGradient(f, 0.0f, f, (float) i2, new int[]{this.f2867a, this.f2868b, this.f2869c, this.f2870d, this.f2871e}, new float[]{0.0f, 0.2f, 0.5f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
    }
}
