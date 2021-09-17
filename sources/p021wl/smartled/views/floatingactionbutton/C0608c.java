package p021wl.smartled.views.floatingactionbutton;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: wl.smartled.views.floatingactionbutton.c */
final class C0608c extends LayerDrawable {

    /* renamed from: a */
    private final int f2873a;

    public C0608c(int i, Drawable... drawableArr) {
        super(drawableArr);
        this.f2873a = i;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f2873a, 31);
        super.draw(canvas);
        canvas.restore();
    }
}
