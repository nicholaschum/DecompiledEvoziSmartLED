package p021wl.smartled.views.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.p007v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.C0512b;

/* renamed from: wl.smartled.views.floatingactionbutton.FloatingActionButton */
public class FloatingActionButton extends ImageButton {

    /* renamed from: a */
    private Drawable f2825a;

    /* renamed from: b */
    int f2826b;

    /* renamed from: c */
    int f2827c;

    /* renamed from: d */
    int f2828d;

    /* renamed from: e */
    String f2829e;

    /* renamed from: f */
    protected int f2830f;

    /* renamed from: g */
    protected int f2831g;

    /* renamed from: h */
    boolean f2832h;

    /* renamed from: i */
    private float f2833i;

    /* renamed from: j */
    private float f2834j;

    /* renamed from: k */
    private float f2835k;

    /* renamed from: l */
    private int f2836l;

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5219a(context, attributeSet);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5219a(context, attributeSet);
    }

    /* renamed from: a */
    private Drawable m2217a(int i, float f) {
        int alpha = Color.alpha(i);
        int f2 = m2223f(i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(f2);
        Drawable[] drawableArr = {shapeDrawable, m2219c(f2, f)};
        LayerDrawable layerDrawable = (alpha == 255 || !this.f2832h) ? new LayerDrawable(drawableArr) : new C0608c(alpha, drawableArr);
        int i2 = (int) (f / 2.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    /* renamed from: b */
    private static int m2218b(int i, float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = Math.min(fArr[2] * f, 1.0f);
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    /* renamed from: c */
    private Drawable m2219c(int i, float f) {
        if (!this.f2832h) {
            return new ColorDrawable(0);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int b = m2218b(i, 0.9f);
        int e = m2222e(b);
        int b2 = m2218b(i, 1.1f);
        int e2 = m2222e(b2);
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        shapeDrawable.setShaderFactory(new C0607b(this, b2, e2, i, e, b));
        return shapeDrawable;
    }

    /* renamed from: c */
    private void m2220c() {
        this.f2836l = (int) (this.f2833i + (this.f2834j * 2.0f));
    }

    /* renamed from: d */
    private void m2221d() {
        this.f2833i = mo5224d(this.f2831g == 0 ? C0462R.dimen.fab_size_normal : C0462R.dimen.fab_size_mini);
    }

    /* renamed from: e */
    private static int m2222e(int i) {
        return Color.argb(Color.alpha(i) / 2, Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: f */
    private static int m2223f(int i) {
        return Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo5218a() {
        return this.f2825a != null ? this.f2825a : this.f2830f != 0 ? getResources().getDrawable(this.f2830f) : new ColorDrawable(0);
    }

    /* renamed from: a */
    public final void mo5220a(int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("Use @FAB_SIZE constants only!");
        } else if (this.f2831g != i) {
            this.f2831g = i;
            m2221d();
            m2220c();
            mo5221b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5219a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0512b.f2281x, 0, 0);
        this.f2826b = obtainStyledAttributes.getColor(1, mo5223c(17170451));
        this.f2827c = obtainStyledAttributes.getColor(2, mo5223c(17170450));
        this.f2828d = obtainStyledAttributes.getColor(0, mo5223c(17170432));
        this.f2831g = obtainStyledAttributes.getInt(4, 0);
        this.f2830f = obtainStyledAttributes.getResourceId(3, 0);
        this.f2829e = obtainStyledAttributes.getString(6);
        this.f2832h = obtainStyledAttributes.getBoolean(5, true);
        obtainStyledAttributes.recycle();
        m2221d();
        this.f2834j = mo5224d(C0462R.dimen.fab_shadow_radius);
        this.f2835k = mo5224d(C0462R.dimen.fab_shadow_offset);
        m2220c();
        mo5221b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5221b() {
        float d = mo5224d(C0462R.dimen.fab_stroke_width);
        float f = d / 2.0f;
        Drawable[] drawableArr = new Drawable[4];
        drawableArr[0] = getResources().getDrawable(this.f2831g == 0 ? C0462R.C0463drawable.fab_bg_normal : C0462R.C0463drawable.fab_bg_mini);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, m2217a(this.f2828d, d));
        stateListDrawable.addState(new int[]{16842919}, m2217a(this.f2827c, d));
        stateListDrawable.addState(new int[0], m2217a(this.f2826b, d));
        drawableArr[1] = stateListDrawable;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(d);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setAlpha(5);
        drawableArr[2] = shapeDrawable;
        drawableArr[3] = mo5218a();
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        int d2 = ((int) (this.f2833i - mo5224d(this.f2831g == 0 ? C0462R.dimen.fab_icon_size_normal : C0462R.dimen.fab_icon_size_mini))) / 2;
        int i = (int) this.f2834j;
        int i2 = (int) (this.f2834j - this.f2835k);
        int i3 = (int) (this.f2834j + this.f2835k);
        layerDrawable.setLayerInset(1, i, i2, i, i3);
        int i4 = (int) (((float) i) - f);
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(2, i4, (int) (((float) i2) - f), i4, (int) (((float) i3) - f));
        int i5 = i + d2;
        layerDrawable2.setLayerInset(3, i5, i2 + d2, i5, i3 + d2);
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(layerDrawable);
        } else {
            setBackgroundDrawable(layerDrawable);
        }
    }

    /* renamed from: b */
    public final void mo5222b(int i) {
        if (this.f2830f != i) {
            this.f2830f = i;
            this.f2825a = null;
            mo5221b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo5223c(int i) {
        return getResources().getColor(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final float mo5224d(int i) {
        return getResources().getDimension(i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f2836l, this.f2836l);
    }

    public void setVisibility(int i) {
        TextView textView = (TextView) getTag(C0462R.C0464id.fab_label);
        if (textView != null) {
            textView.setVisibility(i);
        }
        super.setVisibility(i);
    }
}
