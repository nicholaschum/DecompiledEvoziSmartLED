package p021wl.smartled.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p007v4.view.InputDeviceCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.C0512b;
import p021wl.smartled.p027f.C0552o;

/* renamed from: wl.smartled.views.RainbowPalette */
public class RainbowPalette extends View {

    /* renamed from: a */
    public static boolean f2747a = false;

    /* renamed from: b */
    public static int f2748b = 0;

    /* renamed from: c */
    public static int f2749c = 1;

    /* renamed from: d */
    public static int f2750d = 2;

    /* renamed from: e */
    public static int f2751e = 3;

    /* renamed from: A */
    private int f2752A = f2748b;

    /* renamed from: B */
    private Paint f2753B;

    /* renamed from: C */
    private double f2754C;

    /* renamed from: f */
    private Context f2755f;

    /* renamed from: g */
    private int f2756g;

    /* renamed from: h */
    private int f2757h;

    /* renamed from: i */
    private int f2758i;

    /* renamed from: j */
    private Point f2759j;

    /* renamed from: k */
    private Paint f2760k;

    /* renamed from: l */
    private float f2761l;

    /* renamed from: m */
    private Paint f2762m;

    /* renamed from: n */
    private final int[] f2763n = {-16711936, -16711681, -16776961, -65281, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -16711936};

    /* renamed from: o */
    private float f2764o;

    /* renamed from: p */
    private float f2765p;

    /* renamed from: q */
    private Paint f2766q;

    /* renamed from: r */
    private float f2767r;

    /* renamed from: s */
    private Paint f2768s;

    /* renamed from: t */
    private int f2769t;

    /* renamed from: u */
    private int f2770u;

    /* renamed from: v */
    private Bitmap f2771v;

    /* renamed from: w */
    private float f2772w;

    /* renamed from: x */
    private float f2773x;

    /* renamed from: y */
    private Point f2774y;

    /* renamed from: z */
    private C0620k f2775z;

    public RainbowPalette(Context context) {
        super(context);
    }

    public RainbowPalette(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2755f = context;
        m2188a(attributeSet);
    }

    public RainbowPalette(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2755f = context;
        m2188a(attributeSet);
    }

    /* renamed from: a */
    private float m2186a(float f) {
        if (this.f2755f != null) {
            return (f * this.f2755f.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    /* renamed from: a */
    private static int m2187a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }

    /* renamed from: a */
    private void m2188a(AttributeSet attributeSet) {
        m2190b();
        m2191b(attributeSet);
        m2193c(attributeSet);
        m2192c();
        m2194d();
    }

    /* renamed from: a */
    private static boolean m2189a(float f, float f2, float f3) {
        double d = (double) ((f * f) + (f2 * f2));
        return d < ((double) (f3 * f3)) && d > 0.0d;
    }

    /* renamed from: b */
    private void m2190b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f2755f.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int min = (int) (((float) Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels)) * 0.75f);
        this.f2757h = min;
        this.f2756g = min;
    }

    /* renamed from: b */
    private void m2191b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f2755f.obtainStyledAttributes(attributeSet, C0512b.f2256Y);
        try {
            this.f2758i = obtainStyledAttributes.getColor(0, -16711936);
            this.f2769t = obtainStyledAttributes.getColor(4, -16711936);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    private void m2192c() {
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, this.f2763n, (float[]) null);
        this.f2766q = new Paint(1);
        this.f2766q.setAntiAlias(true);
        this.f2766q.setDither(true);
        this.f2766q.setShader(sweepGradient);
        this.f2766q.setStyle(Paint.Style.STROKE);
        this.f2766q.setStrokeWidth(m2186a(2.0f));
        this.f2762m = new Paint(1);
        this.f2762m.setAntiAlias(true);
        this.f2762m.setDither(true);
        this.f2762m.setShader(sweepGradient);
        this.f2762m.setStrokeWidth(this.f2765p);
        this.f2760k = new Paint(1);
        this.f2760k.setAntiAlias(true);
        this.f2760k.setColor(this.f2758i);
        this.f2768s = new Paint(1);
        this.f2768s.setAntiAlias(true);
        this.f2768s.setColor(this.f2769t);
        this.f2753B = new Paint(1);
        this.f2753B.setStrokeWidth(m2186a(3.0f));
        this.f2753B.setStyle(Paint.Style.STROKE);
        this.f2753B.setColor(-7829368);
        this.f2753B.setAntiAlias(true);
        f2747a = true;
    }

    /* renamed from: c */
    private void m2193c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f2755f.obtainStyledAttributes(attributeSet, C0512b.f2256Y);
        try {
            float f = (float) (this.f2756g / 2);
            this.f2765p = 0.4f * f;
            this.f2764o = (f * 0.5f) + (this.f2765p * 0.5f);
            this.f2761l = 0.3f * f;
            this.f2772w = ((float) this.f2756g) * 0.9f;
            this.f2767r = f * 0.96f;
            this.f2770u = obtainStyledAttributes.getResourceId(3, 0);
            this.f2773x = (float) (((double) this.f2761l) * 0.14d);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    private void m2194d() {
        this.f2759j = new Point();
        this.f2759j.set(this.f2756g / 2, this.f2757h / 2);
        this.f2774y = new Point();
        this.f2774y.set((int) (this.f2764o + (this.f2762m.getStrokeWidth() / 2.0f)), 0);
    }

    /* renamed from: a */
    public final int mo5192a() {
        return this.f2752A;
    }

    /* renamed from: a */
    public final void mo5193a(int i) {
        int i2;
        this.f2752A = i;
        if (i == f2748b) {
            this.f2754C = 0.0d;
            i2 = -16711936;
            this.f2758i = -16711936;
        } else if (i == f2749c) {
            this.f2771v = C0552o.m1926a(BitmapFactory.decodeResource(getResources(), C0462R.C0463drawable.ic_big_solorwheel), (int) this.f2772w, (int) this.f2772w);
            this.f2754C = 0.0d;
            i2 = -63225;
        } else if (i == f2750d) {
            this.f2771v = C0552o.m1926a(BitmapFactory.decodeResource(getResources(), C0462R.C0463drawable.temprature_l), (int) this.f2772w, (int) this.f2772w);
            this.f2754C = 0.0d;
            i2 = -65798;
        } else {
            this.f2771v = C0552o.m1926a(BitmapFactory.decodeResource(getResources(), C0462R.C0463drawable.black_l), (int) this.f2772w, (int) this.f2772w);
            this.f2754C = 0.0d;
            i2 = -1;
        }
        this.f2769t = i2;
        this.f2774y.set((int) (this.f2764o + (this.f2762m.getStrokeWidth() / 2.0f)), 0);
        invalidate();
    }

    /* renamed from: a */
    public final void mo5194a(C0620k kVar) {
        this.f2775z = kVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.f2752A == f2748b) {
            canvas.translate((float) this.f2759j.x, (float) this.f2759j.y);
            this.f2760k.setColor(this.f2758i);
            this.f2760k.setStyle(Paint.Style.FILL);
            this.f2760k.setAlpha(255);
            this.f2760k.setStrokeWidth(m2186a(1.0f));
            canvas.drawCircle(0.0f, 0.0f, (this.f2761l / 3.0f) * 2.0f, this.f2760k);
            this.f2760k.setStyle(Paint.Style.STROKE);
            for (int i = 0; i < 160; i++) {
                this.f2760k.setStrokeWidth((this.f2761l / 3.0f) / 160.0f);
                float f = (float) i;
                this.f2760k.setAlpha(255 - ((int) (1.59375f * f)));
                canvas.drawCircle(0.0f, 0.0f, ((this.f2761l / 3.0f) * 2.0f) + (((this.f2761l / 3.0f) / 160.0f) * f) + (((this.f2761l / 3.0f) / 160.0f) / 2.0f), this.f2760k);
            }
            this.f2762m.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(0.0f, 0.0f, this.f2764o, this.f2762m);
            if (f2747a) {
                double atan2 = Math.atan2((double) this.f2774y.y, (double) this.f2774y.x);
                this.f2768s.setColor(this.f2769t);
                this.f2768s.setStyle(Paint.Style.FILL);
                this.f2768s.setStrokeWidth(m2186a(1.0f));
                canvas.drawCircle((float) (((double) this.f2767r) * Math.cos(atan2)), (float) (((double) this.f2767r) * Math.sin(atan2)), this.f2773x, this.f2768s);
                float f2 = (float) ((atan2 * 180.0d) / 3.141592653589793d);
                this.f2766q.setAlpha(255);
                for (int i2 = 0; i2 < 160; i2++) {
                    canvas.drawArc(new RectF(-this.f2767r, -this.f2767r, this.f2767r, this.f2767r), f2, -1.0f, false, this.f2766q);
                    this.f2766q.setAlpha(238 - ((int) (((float) i2) * 1.4875f)));
                    f2 -= 1.0f;
                }
            }
        } else if (this.f2752A == f2749c || this.f2752A == f2750d || this.f2752A == f2751e) {
            canvas.translate(((float) this.f2759j.x) - (this.f2772w / 2.0f), ((float) this.f2759j.y) - (this.f2772w / 2.0f));
            this.f2762m.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawBitmap(this.f2771v, 0.0f, 0.0f, (Paint) null);
            canvas.translate(this.f2772w / 2.0f, this.f2772w / 2.0f);
            this.f2768s.setStyle(Paint.Style.STROKE);
            this.f2768s.setStrokeWidth(m2186a(8.0f));
            this.f2768s.setColor(this.f2769t);
            canvas.drawCircle(0.0f, 0.0f, (((float) this.f2756g) / 2.0f) * 0.92f, this.f2768s);
            if (m2189a((float) this.f2774y.x, (float) this.f2774y.y, this.f2772w / 2.0f)) {
                canvas.drawCircle((float) this.f2774y.x, (float) this.f2774y.y, this.f2773x, this.f2753B);
            } else {
                double atan22 = Math.atan2((double) this.f2774y.y, (double) this.f2774y.x);
                canvas.drawCircle((float) (((double) (this.f2772w / 2.0f)) * Math.cos(atan22)), (float) (((double) (this.f2772w / 2.0f)) * Math.sin(atan22)), this.f2773x, this.f2753B);
            }
        }
        canvas.restore();
        Log.e("Position", "indictorPosition: X:" + this.f2774y.x + "Y:" + this.f2774y.y);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(this.f2756g, this.f2757h);
        setMeasuredDimension(this.f2756g, this.f2757h);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        float f;
        float f2;
        float x = motionEvent.getX() - ((float) (this.f2756g / 2));
        float y = motionEvent.getY() - ((float) (this.f2757h / 2));
        int i2 = 0;
        switch (motionEvent.getAction()) {
            case 0:
            case 2:
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            case 1:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;
        }
        if (this.f2752A == f2748b) {
            float atan2 = (float) (((double) ((float) Math.atan2((double) y, (double) x))) / 6.283185307179586d);
            if (atan2 < 0.0f) {
                atan2 += 1.0f;
            }
            int[] iArr = this.f2763n;
            if (atan2 <= 0.0f) {
                i = iArr[0];
            } else if (atan2 >= 1.0f) {
                i = iArr[iArr.length - 1];
            } else {
                float length = atan2 * ((float) (iArr.length - 1));
                int i3 = (int) length;
                float f3 = length - ((float) i3);
                int i4 = iArr[i3];
                int i5 = iArr[i3 + 1];
                i = Color.argb(m2187a(Color.alpha(i4), Color.alpha(i5), f3), m2187a(Color.red(i4), Color.red(i5), f3), m2187a(Color.green(i4), Color.green(i5), f3), m2187a(Color.blue(i4), Color.blue(i5), f3));
            }
        } else {
            if (m2189a(x, y, this.f2772w / 2.0f)) {
                f2 = motionEvent.getX() - (((float) this.f2759j.x) - (this.f2772w / 2.0f));
                f = motionEvent.getY() - (((float) this.f2759j.y) - (this.f2772w / 2.0f));
            } else {
                double atan22 = Math.atan2((double) y, (double) x);
                double d = (double) ((this.f2772w / 2.0f) - 6.0f);
                f2 = (float) ((Math.cos(atan22) * d) + ((double) (this.f2772w / 2.0f)));
                f = (float) ((d * Math.sin(atan22)) + ((double) (this.f2772w / 2.0f)));
            }
            Bitmap bitmap = this.f2771v;
            int i6 = (int) f2;
            int i7 = (int) f;
            if (i6 <= 0) {
                i6 = 0;
            }
            if (i7 > 0) {
                i2 = i7;
            }
            if (i6 >= bitmap.getWidth()) {
                i6 = bitmap.getWidth() - 1;
            }
            if (i2 >= bitmap.getHeight()) {
                i2 = bitmap.getHeight() - 1;
            }
            i = bitmap.getPixel(i6, i2);
        }
        this.f2758i = i;
        this.f2769t = i;
        this.f2774y.set((int) x, (int) y);
        this.f2754C = Math.atan2((double) y, (double) x);
        if (this.f2754C < 0.0d) {
            this.f2754C += 6.283185307179586d;
        }
        if (this.f2775z != null) {
            this.f2775z.mo5023a(i, this.f2774y, this.f2754C);
        }
        f2747a = true;
        invalidate();
        return true;
    }
}
