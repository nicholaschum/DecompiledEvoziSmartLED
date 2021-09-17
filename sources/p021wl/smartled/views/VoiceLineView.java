package p021wl.smartled.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.p007v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p021wl.smartled.C0512b;

/* renamed from: wl.smartled.views.VoiceLineView */
public class VoiceLineView extends View {

    /* renamed from: a */
    List<Path> f2787a = null;

    /* renamed from: b */
    private final int f2788b = 0;

    /* renamed from: c */
    private final int f2789c = 1;

    /* renamed from: d */
    private int f2790d = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: e */
    private int f2791e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: f */
    private float f2792f = 4.0f;

    /* renamed from: g */
    private Paint f2793g;

    /* renamed from: h */
    private Paint f2794h;

    /* renamed from: i */
    private int f2795i;

    /* renamed from: j */
    private int f2796j = 4;

    /* renamed from: k */
    private float f2797k = 100.0f;

    /* renamed from: l */
    private float f2798l = 0.0f;

    /* renamed from: m */
    private boolean f2799m = false;

    /* renamed from: n */
    private float f2800n = 1.0f;

    /* renamed from: o */
    private float f2801o = 10.0f;

    /* renamed from: p */
    private int f2802p = 1;

    /* renamed from: q */
    private float f2803q = 1.0f;

    /* renamed from: r */
    private long f2804r = 50;

    /* renamed from: s */
    private float f2805s = 25.0f;

    /* renamed from: t */
    private float f2806t = 5.0f;

    /* renamed from: u */
    private float f2807u = 4.0f;

    /* renamed from: v */
    private List<Rect> f2808v;

    /* renamed from: w */
    private long f2809w = 0;

    /* renamed from: x */
    private int f2810x = 90;

    public VoiceLineView(Context context) {
        super(context);
    }

    public VoiceLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2205a(context, attributeSet);
    }

    public VoiceLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2205a(context, attributeSet);
    }

    /* renamed from: a */
    private void m2205a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0512b.f2257Z);
        this.f2795i = obtainStyledAttributes.getInt(9, 0);
        this.f2791e = obtainStyledAttributes.getColor(10, ViewCompat.MEASURED_STATE_MASK);
        this.f2797k = obtainStyledAttributes.getFloat(2, 100.0f);
        this.f2796j = obtainStyledAttributes.getInt(8, 4);
        if (this.f2795i == 1) {
            this.f2805s = obtainStyledAttributes.getDimension(7, 25.0f);
            this.f2806t = obtainStyledAttributes.getDimension(6, 5.0f);
            this.f2807u = obtainStyledAttributes.getDimension(5, 4.0f);
        } else {
            this.f2790d = obtainStyledAttributes.getColor(3, ViewCompat.MEASURED_STATE_MASK);
            this.f2792f = obtainStyledAttributes.getDimension(4, 4.0f);
            this.f2810x = obtainStyledAttributes.getInt(1, 90);
            this.f2802p = obtainStyledAttributes.getInt(0, 1);
            this.f2787a = new ArrayList(20);
            for (int i = 0; i < 20; i++) {
                this.f2787a.add(new Path());
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m2206a(Canvas canvas) {
        Paint paint;
        int size;
        float f;
        int height;
        float f2;
        if (this.f2809w == 0 || System.currentTimeMillis() - this.f2809w > ((long) this.f2810x)) {
            this.f2809w = System.currentTimeMillis();
            this.f2798l = (float) (((double) this.f2798l) + 1.5d);
            if (this.f2801o >= this.f2803q || !this.f2799m) {
                this.f2799m = false;
                if (this.f2801o <= 10.0f) {
                    this.f2801o = 10.0f;
                } else {
                    if (this.f2801o < ((float) (getHeight() / 30))) {
                        f = this.f2801o;
                        height = getHeight() / 60;
                    } else {
                        f = this.f2801o;
                        height = getHeight() / 30;
                    }
                    f2 = f - ((float) height);
                }
            } else {
                f2 = this.f2801o + ((float) (getHeight() / 30));
            }
            this.f2801o = f2;
        }
        if (this.f2794h == null) {
            this.f2794h = new Paint();
            this.f2794h.setColor(this.f2791e);
            this.f2794h.setAntiAlias(true);
            this.f2794h.setStyle(Paint.Style.STROKE);
            this.f2794h.setStrokeWidth(2.0f);
        }
        canvas.save();
        int height2 = getHeight() / 2;
        for (int i = 0; i < this.f2787a.size(); i++) {
            this.f2787a.get(i).reset();
            this.f2787a.get(i).moveTo((float) getWidth(), (float) (getHeight() / 2));
        }
        float width = (float) (getWidth() - 1);
        while (width >= 0.0f) {
            this.f2800n = (((this.f2801o * 4.0f) * width) / ((float) getWidth())) - (((((this.f2801o * 4.0f) * width) * width) / ((float) getWidth())) / ((float) getWidth()));
            for (int i2 = 1; i2 <= this.f2787a.size(); i2++) {
                float sin = this.f2800n * ((float) Math.sin((((((double) width) - Math.pow(1.22d, (double) i2)) * 3.141592653589793d) / 180.0d) - ((double) this.f2798l)));
                this.f2787a.get(i2 - 1).lineTo(width, (((((float) (i2 * 2)) * sin) / ((float) this.f2787a.size())) - ((sin * 15.0f) / ((float) this.f2787a.size()))) + ((float) height2));
            }
            width -= (float) this.f2802p;
        }
        for (int i3 = 0; i3 < this.f2787a.size(); i3++) {
            if (i3 == this.f2787a.size() - 1) {
                paint = this.f2794h;
                size = 255;
            } else {
                paint = this.f2794h;
                size = (i3 * 130) / this.f2787a.size();
            }
            paint.setAlpha(size);
            if (this.f2794h.getAlpha() > 0) {
                canvas.drawPath(this.f2787a.get(i3), this.f2794h);
            }
        }
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo5205a(int i) {
        if (((float) i) > (this.f2797k * ((float) this.f2796j)) / 25.0f) {
            this.f2799m = true;
            this.f2803q = ((float) ((getHeight() * i) / 2)) / this.f2797k;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int height;
        float f2;
        Canvas canvas2 = canvas;
        if (this.f2795i == 1) {
            if (this.f2794h == null) {
                this.f2794h = new Paint();
                this.f2794h.setColor(this.f2791e);
                this.f2794h.setAntiAlias(true);
                this.f2794h.setStyle(Paint.Style.STROKE);
                this.f2794h.setStrokeWidth(2.0f);
            }
            if (this.f2808v == null) {
                this.f2808v = new LinkedList();
            }
            long j = (long) ((int) (this.f2806t + this.f2805s));
            if (this.f2804r % j < 6) {
                Rect rect = new Rect((int) ((((-this.f2805s) - 10.0f) - ((float) this.f2804r)) + ((float) (this.f2804r % j))), (int) ((((float) (getHeight() / 2)) - (this.f2807u / 2.0f)) - (this.f2801o == 10.0f ? 0.0f : this.f2801o / 2.0f)), (int) ((-10 - this.f2804r) + (this.f2804r % j)), (int) (((float) (getHeight() / 2)) + (this.f2807u / 2.0f) + (this.f2801o == 10.0f ? 0.0f : this.f2801o / 2.0f)));
                if (((float) this.f2808v.size()) > (((float) getWidth()) / (this.f2806t + this.f2805s)) + 2.0f) {
                    this.f2808v.remove(0);
                }
                this.f2808v.add(rect);
            }
            canvas2.translate((float) this.f2804r, 0.0f);
            for (int size = this.f2808v.size() - 1; size >= 0; size--) {
                canvas2.drawRect(this.f2808v.get(size), this.f2794h);
            }
            this.f2804r += 6;
            if (this.f2801o >= this.f2803q || !this.f2799m) {
                this.f2799m = false;
                if (this.f2801o <= 10.0f) {
                    this.f2801o = 10.0f;
                } else {
                    if (this.f2801o < ((float) (getHeight() / 30))) {
                        f = this.f2801o;
                        height = getHeight() / 60;
                    } else {
                        f = this.f2801o;
                        height = getHeight() / 30;
                    }
                    f2 = f - ((float) height);
                }
            } else {
                f2 = this.f2801o + ((float) (getHeight() / 30));
            }
            this.f2801o = f2;
        } else {
            if (this.f2793g == null) {
                this.f2793g = new Paint();
                this.f2793g.setColor(this.f2790d);
                this.f2793g.setAntiAlias(true);
            }
            canvas.save();
            canvas.drawRect(0.0f, ((float) (getHeight() / 2)) - (this.f2792f / 2.0f), (float) getWidth(), (this.f2792f / 2.0f) + ((float) (getHeight() / 2)), this.f2793g);
            canvas.restore();
            m2206a(canvas);
        }
        if (this.f2795i == 1) {
            postInvalidateDelayed(30);
        } else {
            invalidate();
        }
    }
}
