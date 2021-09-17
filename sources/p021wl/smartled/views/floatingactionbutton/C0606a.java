package p021wl.smartled.views.floatingactionbutton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;

/* renamed from: wl.smartled.views.floatingactionbutton.a */
final class C0606a extends Shape {

    /* renamed from: a */
    final /* synthetic */ float f2862a;

    /* renamed from: b */
    final /* synthetic */ float f2863b;

    /* renamed from: c */
    final /* synthetic */ float f2864c;

    /* renamed from: d */
    final /* synthetic */ float f2865d;

    /* renamed from: e */
    final /* synthetic */ AddFloatingActionButton f2866e;

    C0606a(AddFloatingActionButton addFloatingActionButton, float f, float f2, float f3, float f4) {
        this.f2866e = addFloatingActionButton;
        this.f2862a = f;
        this.f2863b = f2;
        this.f2864c = f3;
        this.f2865d = f4;
    }

    public final void draw(Canvas canvas, Paint paint) {
        if (this.f2866e.f2830f != 0) {
            canvas.drawBitmap(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f2866e.getResources(), this.f2866e.f2830f), (int) this.f2862a, (int) this.f2862a, false), 0.0f, 0.0f, (Paint) null);
            return;
        }
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        canvas2.drawRect(this.f2863b, this.f2864c - this.f2865d, this.f2862a - this.f2863b, this.f2864c + this.f2865d, paint2);
        canvas2.drawRect(this.f2864c - this.f2865d, this.f2863b, this.f2864c + this.f2865d, this.f2862a - this.f2863b, paint2);
    }
}
