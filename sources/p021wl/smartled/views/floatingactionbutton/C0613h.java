package p021wl.smartled.views.floatingactionbutton;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: wl.smartled.views.floatingactionbutton.h */
final class C0613h extends LayerDrawable {

    /* renamed from: a */
    private float f2884a;

    public C0613h(Drawable drawable) {
        super(new Drawable[]{drawable});
    }

    /* renamed from: a */
    public final void mo5246a(float f) {
        this.f2884a = f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.f2884a, (float) getBounds().centerX(), (float) getBounds().centerY());
        super.draw(canvas);
        canvas.restore();
    }
}
