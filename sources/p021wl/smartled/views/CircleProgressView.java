package p021wl.smartled.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: wl.smartled.views.CircleProgressView */
public class CircleProgressView extends View {

    /* renamed from: a */
    private int f2679a = 100;

    /* renamed from: b */
    private int f2680b = 0;

    /* renamed from: c */
    private int f2681c = 0;

    /* renamed from: d */
    private final int f2682d = 2;

    /* renamed from: e */
    private final RectF f2683e;

    /* renamed from: f */
    private final Paint f2684f;

    /* renamed from: g */
    private final Context f2685g;

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2685g = context;
        this.f2683e = new RectF();
        this.f2684f = new Paint();
        this.f2681c = (int) (this.f2685g != null ? (this.f2685g.getResources().getDisplayMetrics().density * 8.0f) + 0.5f : 0.0f);
    }

    /* renamed from: a */
    public final void mo5163a(int i) {
        this.f2680b = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (width != height) {
            width = Math.min(width, height);
            height = width;
        }
        this.f2684f.setAntiAlias(true);
        this.f2684f.setDither(true);
        this.f2684f.setColor(Color.rgb(0, 255, 255));
        canvas.drawColor(0);
        this.f2684f.setStrokeWidth((float) this.f2681c);
        this.f2684f.setStyle(Paint.Style.STROKE);
        this.f2684f.setPathEffect(new DashPathEffect(new float[]{6.5f, 6.5f}, 0.0f));
        this.f2683e.left = (float) (this.f2681c / 2);
        this.f2683e.top = (float) (this.f2681c / 2);
        this.f2683e.right = (float) (width - (this.f2681c / 2));
        this.f2683e.bottom = (float) (height - (this.f2681c / 2));
        canvas.drawArc(this.f2683e, -90.0f, 359.999f, false, this.f2684f);
        this.f2684f.setColor(Color.rgb(248, 96, 48));
        canvas.drawArc(this.f2683e, -90.0f, (((float) this.f2680b) / ((float) this.f2679a)) * 359.999f, false, this.f2684f);
        this.f2684f.setStrokeWidth(2.0f);
        String str = this.f2680b + "%";
        int i = height / 10;
        this.f2684f.setTextSize((float) i);
        this.f2684f.setColor(Color.rgb(0, 255, 255));
        this.f2684f.setStyle(Paint.Style.FILL);
        canvas.drawText(str, (float) ((width / 2) - (((int) this.f2684f.measureText(str, 0, str.length())) / 2)), (float) ((height / 6) + (i / 2)), this.f2684f);
    }
}
