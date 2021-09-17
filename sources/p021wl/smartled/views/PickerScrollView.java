package p021wl.smartled.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.support.p007v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import p021wl.smartled.beans.C0527h;

@SuppressLint({"HandlerLeak", "ClickableViewAccessibility"})
/* renamed from: wl.smartled.views.PickerScrollView */
public class PickerScrollView extends View {

    /* renamed from: a */
    Handler f2730a = new C0617h(this);

    /* renamed from: b */
    private List<C0527h> f2731b;

    /* renamed from: c */
    private int f2732c;

    /* renamed from: d */
    private Paint f2733d;

    /* renamed from: e */
    private float f2734e = 16.0f;

    /* renamed from: f */
    private float f2735f = 8.0f;

    /* renamed from: g */
    private float f2736g = 255.0f;

    /* renamed from: h */
    private float f2737h = 100.0f;

    /* renamed from: i */
    private int f2738i;

    /* renamed from: j */
    private int f2739j;

    /* renamed from: k */
    private float f2740k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f2741l = 0.0f;

    /* renamed from: m */
    private boolean f2742m = false;

    /* renamed from: n */
    private C0619j f2743n;

    /* renamed from: o */
    private Timer f2744o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C0618i f2745p;

    /* renamed from: q */
    private Context f2746q;

    public PickerScrollView(Context context) {
        super(context);
        m2175a(context);
    }

    public PickerScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2175a(context);
    }

    /* renamed from: a */
    private static float m2172a(float f, float f2) {
        float pow = (float) (1.0d - Math.pow((double) (f2 / f), 2.0d));
        if (pow < 0.0f) {
            return 0.0f;
        }
        return pow;
    }

    /* renamed from: a */
    private void m2175a(Context context) {
        this.f2744o = new Timer();
        this.f2746q = context;
        this.f2731b = new ArrayList();
        this.f2733d = new Paint(1);
        this.f2733d.setStyle(Paint.Style.FILL);
        this.f2733d.setTextAlign(Paint.Align.CENTER);
        this.f2733d.setColor(ContextCompat.getColor(context, C0462R.color.colorTextNormal));
    }

    /* renamed from: a */
    private void m2176a(Canvas canvas, int i, int i2) {
        float f = (float) i2;
        float f2 = (this.f2735f * 2.8f * ((float) i)) + (this.f2741l * f);
        float a = m2172a(((float) this.f2738i) / 4.0f, f2);
        this.f2733d.setTextSize(((this.f2734e - this.f2735f) * a) + this.f2735f);
        this.f2733d.setAlpha((int) (((this.f2736g - this.f2737h) * a) + this.f2737h));
        Paint.FontMetricsInt fontMetricsInt = this.f2733d.getFontMetricsInt();
        canvas.drawText(this.f2731b.get(this.f2732c + (i2 * i)).mo4925a(), (float) (((double) this.f2739j) / 2.0d), (float) (((double) ((float) ((((double) this.f2738i) / 2.0d) + ((double) (f * f2))))) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d))), this.f2733d);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2178b() {
        if (this.f2743n != null) {
            this.f2743n.mo5029a(this.f2731b.get(this.f2732c));
        }
    }

    /* renamed from: c */
    private void m2180c() {
        this.f2731b.remove(0);
        this.f2731b.add(this.f2731b.get(0));
    }

    /* renamed from: d */
    private void m2181d() {
        this.f2731b.remove(this.f2731b.size() - 1);
        this.f2731b.add(0, this.f2731b.get(this.f2731b.size() - 1));
    }

    /* renamed from: a */
    public final void mo5186a() {
        int i = 0;
        this.f2732c = 0;
        int size = (this.f2731b.size() / 2) - this.f2732c;
        if (size < 0) {
            while (i < (-size)) {
                m2180c();
                this.f2732c--;
                i++;
            }
        } else if (size > 0) {
            while (i < size) {
                m2181d();
                this.f2732c++;
                i++;
            }
        }
        invalidate();
        m2178b();
    }

    /* renamed from: a */
    public final void mo5187a(List<C0527h> list) {
        this.f2731b = list;
        this.f2732c = list.size() / 2;
        invalidate();
    }

    /* renamed from: a */
    public final void mo5188a(C0619j jVar) {
        this.f2743n = jVar;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2742m && this.f2731b != null && this.f2731b.size() > 0) {
            float a = m2172a(((float) this.f2738i) / 4.0f, this.f2741l);
            this.f2733d.setTextSize(((this.f2734e - this.f2735f) * a) + this.f2735f);
            this.f2733d.setAlpha((int) (((this.f2736g - this.f2737h) * a) + this.f2737h));
            float f = (float) ((((double) this.f2738i) / 2.0d) + ((double) this.f2741l));
            Paint.FontMetricsInt fontMetricsInt = this.f2733d.getFontMetricsInt();
            String a2 = this.f2731b.get(this.f2732c).mo4925a();
            this.f2733d.setColor(ContextCompat.getColor(this.f2746q, 17170457));
            canvas.drawText(a2, (float) (((double) this.f2739j) / 2.0d), (float) (((double) f) - ((((double) fontMetricsInt.bottom) / 2.0d) + (((double) fontMetricsInt.top) / 2.0d))), this.f2733d);
            this.f2733d.setColor(ContextCompat.getColor(this.f2746q, C0462R.color.colorTextNormal));
            for (int i = 1; this.f2732c - i >= 0; i++) {
                m2176a(canvas, i, -1);
            }
            for (int i2 = 1; this.f2732c + i2 < this.f2731b.size(); i2++) {
                m2176a(canvas, i2, 1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2738i = getMeasuredHeight();
        this.f2739j = getMeasuredWidth();
        this.f2734e = ((float) this.f2738i) / 11.2f;
        this.f2735f = this.f2734e / 2.2f;
        this.f2742m = true;
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        if (this.f2731b == null || this.f2731b.size() <= 0) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (this.f2745p != null) {
                    this.f2745p.cancel();
                    this.f2745p = null;
                }
                this.f2740k = motionEvent.getY();
                return true;
            case 1:
                if (((double) Math.abs(this.f2741l)) < 1.0E-4d) {
                    this.f2741l = 0.0f;
                    return true;
                }
                if (this.f2745p != null) {
                    this.f2745p.cancel();
                    this.f2745p = null;
                }
                this.f2745p = new C0618i(this, this.f2730a);
                this.f2744o.schedule(this.f2745p, 0, 30);
                return true;
            case 2:
                this.f2741l += motionEvent.getY() - this.f2740k;
                if (this.f2741l > (this.f2735f * 2.8f) / 2.0f) {
                    m2181d();
                    f = this.f2741l - (this.f2735f * 2.8f);
                } else {
                    if (this.f2741l < (this.f2735f * -2.8f) / 2.0f) {
                        m2180c();
                        f = this.f2741l + (this.f2735f * 2.8f);
                    }
                    this.f2740k = motionEvent.getY();
                    invalidate();
                    return true;
                }
                this.f2741l = f;
                this.f2740k = motionEvent.getY();
                invalidate();
                return true;
            default:
                return true;
        }
    }
}
