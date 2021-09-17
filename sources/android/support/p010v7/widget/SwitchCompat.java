package android.support.p010v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.widget.TextViewCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.p016d.C0269a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.SwitchCompat */
public class SwitchCompat extends CompoundButton {

    /* renamed from: N */
    private static final int[] f1515N = {16842912};

    /* renamed from: c */
    private static final Property<SwitchCompat, Float> f1516c = new C0401cx(Float.class, "thumbPos");

    /* renamed from: A */
    private int f1517A;

    /* renamed from: B */
    private int f1518B;

    /* renamed from: C */
    private int f1519C;

    /* renamed from: D */
    private int f1520D;

    /* renamed from: E */
    private int f1521E;

    /* renamed from: F */
    private int f1522F;

    /* renamed from: G */
    private int f1523G;

    /* renamed from: H */
    private final TextPaint f1524H;

    /* renamed from: I */
    private ColorStateList f1525I;

    /* renamed from: J */
    private Layout f1526J;

    /* renamed from: K */
    private Layout f1527K;

    /* renamed from: L */
    private TransformationMethod f1528L;

    /* renamed from: M */
    private final Rect f1529M;

    /* renamed from: a */
    float f1530a;

    /* renamed from: b */
    ObjectAnimator f1531b;

    /* renamed from: d */
    private Drawable f1532d;

    /* renamed from: e */
    private ColorStateList f1533e;

    /* renamed from: f */
    private PorterDuff.Mode f1534f;

    /* renamed from: g */
    private boolean f1535g;

    /* renamed from: h */
    private boolean f1536h;

    /* renamed from: i */
    private Drawable f1537i;

    /* renamed from: j */
    private ColorStateList f1538j;

    /* renamed from: k */
    private PorterDuff.Mode f1539k;

    /* renamed from: l */
    private boolean f1540l;

    /* renamed from: m */
    private boolean f1541m;

    /* renamed from: n */
    private int f1542n;

    /* renamed from: o */
    private int f1543o;

    /* renamed from: p */
    private int f1544p;

    /* renamed from: q */
    private boolean f1545q;

    /* renamed from: r */
    private CharSequence f1546r;

    /* renamed from: s */
    private CharSequence f1547s;

    /* renamed from: t */
    private boolean f1548t;

    /* renamed from: u */
    private int f1549u;

    /* renamed from: v */
    private int f1550v;

    /* renamed from: w */
    private float f1551w;

    /* renamed from: x */
    private float f1552x;

    /* renamed from: y */
    private VelocityTracker f1553y;

    /* renamed from: z */
    private int f1554z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        C0269a aVar = null;
        this.f1533e = null;
        this.f1534f = null;
        this.f1535g = false;
        this.f1536h = false;
        this.f1538j = null;
        this.f1539k = null;
        this.f1540l = false;
        this.f1541m = false;
        this.f1553y = VelocityTracker.obtain();
        this.f1529M = new Rect();
        boolean z = true;
        this.f1524H = new TextPaint(1);
        this.f1524H.density = getResources().getDisplayMetrics().density;
        C0407dc a = C0407dc.m1308a(context, attributeSet, C0197k.f425cP, i, 0);
        this.f1532d = a.mo4545a(C0197k.f428cS);
        if (this.f1532d != null) {
            this.f1532d.setCallback(this);
        }
        this.f1537i = a.mo4545a(C0197k.f490db);
        if (this.f1537i != null) {
            this.f1537i.setCallback(this);
        }
        this.f1546r = a.mo4551c(C0197k.f426cQ);
        this.f1547s = a.mo4551c(C0197k.f427cR);
        this.f1548t = a.mo4547a(C0197k.f429cT, true);
        this.f1542n = a.mo4555e(C0197k.f434cY, 0);
        this.f1543o = a.mo4555e(C0197k.f431cV, 0);
        this.f1544p = a.mo4555e(C0197k.f432cW, 0);
        this.f1545q = a.mo4547a(C0197k.f430cU, false);
        ColorStateList f = a.mo4557f(C0197k.f435cZ);
        if (f != null) {
            this.f1533e = f;
            this.f1535g = true;
        }
        PorterDuff.Mode a2 = C0355be.m1240a(a.mo4543a(C0197k.f489da, -1), (PorterDuff.Mode) null);
        if (this.f1534f != a2) {
            this.f1534f = a2;
            this.f1536h = true;
        }
        if ((this.f1535g || this.f1536h) && this.f1532d != null && (this.f1535g || this.f1536h)) {
            this.f1532d = this.f1532d.mutate();
            if (this.f1535g) {
                DrawableCompat.setTintList(this.f1532d, this.f1533e);
            }
            if (this.f1536h) {
                DrawableCompat.setTintMode(this.f1532d, this.f1534f);
            }
            if (this.f1532d.isStateful()) {
                this.f1532d.setState(getDrawableState());
            }
        }
        ColorStateList f2 = a.mo4557f(C0197k.f491dc);
        if (f2 != null) {
            this.f1538j = f2;
            this.f1540l = true;
        }
        PorterDuff.Mode a3 = C0355be.m1240a(a.mo4543a(C0197k.f492dd, -1), (PorterDuff.Mode) null);
        if (this.f1539k != a3) {
            this.f1539k = a3;
            this.f1541m = true;
        }
        if ((this.f1540l || this.f1541m) && this.f1537i != null && (this.f1540l || this.f1541m)) {
            this.f1537i = this.f1537i.mutate();
            if (this.f1540l) {
                DrawableCompat.setTintList(this.f1537i, this.f1538j);
            }
            if (this.f1541m) {
                DrawableCompat.setTintMode(this.f1537i, this.f1539k);
            }
            if (this.f1537i.isStateful()) {
                this.f1537i.setState(getDrawableState());
            }
        }
        int g = a.mo4558g(C0197k.f433cX, 0);
        if (g != 0) {
            C0407dc a4 = C0407dc.m1306a(context, g, C0197k.f493de);
            ColorStateList f3 = a4.mo4557f(C0197k.f497di);
            this.f1525I = f3 == null ? getTextColors() : f3;
            int e = a4.mo4555e(C0197k.f494df, 0);
            if (e != 0) {
                float f4 = (float) e;
                if (f4 != this.f1524H.getTextSize()) {
                    this.f1524H.setTextSize(f4);
                    requestLayout();
                }
            }
            int a5 = a4.mo4543a(C0197k.f495dg, -1);
            int a6 = a4.mo4543a(C0197k.f496dh, -1);
            switch (a5) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    typeface = Typeface.MONOSPACE;
                    break;
                default:
                    typeface = null;
                    break;
            }
            float f5 = 0.0f;
            if (a6 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(a6) : Typeface.create(typeface, a6);
                m1010a(defaultFromStyle);
                int i2 = a6 & (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0));
                this.f1524H.setFakeBoldText((i2 & 1) == 0 ? false : z);
                this.f1524H.setTextSkewX((i2 & 2) != 0 ? -0.25f : f5);
            } else {
                this.f1524H.setFakeBoldText(false);
                this.f1524H.setTextSkewX(0.0f);
                m1010a(typeface);
            }
            this.f1528L = a4.mo4547a(C0197k.f502dn, false) ? new C0269a(getContext()) : aVar;
            a4.mo4546a();
        }
        a.mo4546a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1550v = viewConfiguration.getScaledTouchSlop();
        this.f1554z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private Layout m1009a(CharSequence charSequence) {
        if (this.f1528L != null) {
            charSequence = this.f1528L.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f1524H, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, this.f1524H)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private void m1010a(Typeface typeface) {
        if ((this.f1524H.getTypeface() != null && !this.f1524H.getTypeface().equals(typeface)) || (this.f1524H.getTypeface() == null && typeface != null)) {
            this.f1524H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: a */
    private boolean m1011a() {
        return this.f1530a > 0.5f;
    }

    /* renamed from: b */
    private int m1012b() {
        return (int) (((C0423ds.m1382a(this) ? 1.0f - this.f1530a : this.f1530a) * ((float) m1013c())) + 0.5f);
    }

    /* renamed from: c */
    private int m1013c() {
        if (this.f1537i == null) {
            return 0;
        }
        Rect rect = this.f1529M;
        this.f1537i.getPadding(rect);
        Rect a = this.f1532d != null ? C0355be.m1241a(this.f1532d) : C0355be.f1695a;
        return ((((this.f1517A - this.f1519C) - rect.left) - rect.right) - a.left) - a.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4189a(float f) {
        this.f1530a = f;
        invalidate();
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1529M;
        int i3 = this.f1520D;
        int i4 = this.f1521E;
        int i5 = this.f1522F;
        int i6 = this.f1523G;
        int b = m1012b() + i3;
        Rect a = this.f1532d != null ? C0355be.m1241a(this.f1532d) : C0355be.f1695a;
        if (this.f1537i != null) {
            this.f1537i.getPadding(rect);
            b += rect.left;
            if (a != null) {
                if (a.left > rect.left) {
                    i3 += a.left - rect.left;
                }
                i = a.top > rect.top ? (a.top - rect.top) + i4 : i4;
                if (a.right > rect.right) {
                    i5 -= a.right - rect.right;
                }
                if (a.bottom > rect.bottom) {
                    i2 = i6 - (a.bottom - rect.bottom);
                    this.f1537i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1537i.setBounds(i3, i, i5, i2);
        }
        if (this.f1532d != null) {
            this.f1532d.getPadding(rect);
            int i7 = b - rect.left;
            int i8 = b + this.f1519C + rect.right;
            this.f1532d.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f1532d != null) {
            DrawableCompat.setHotspot(this.f1532d, f, f2);
        }
        if (this.f1537i != null) {
            DrawableCompat.setHotspot(this.f1537i, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1532d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1537i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0423ds.m1382a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1517A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1544p : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0423ds.m1382a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1517A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1544p : compoundPaddingRight;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f1532d != null) {
            this.f1532d.jumpToCurrentState();
        }
        if (this.f1537i != null) {
            this.f1537i.jumpToCurrentState();
        }
        if (this.f1531b != null && this.f1531b.isStarted()) {
            this.f1531b.end();
            this.f1531b = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1515N);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1529M;
        Drawable drawable = this.f1537i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1521E;
        int i3 = this.f1523G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1532d;
        if (drawable != null) {
            if (!this.f1545q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = C0355be.m1241a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = m1011a() ? this.f1526J : this.f1527K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f1525I != null) {
                this.f1524H.setColor(this.f1525I.getColorForState(drawableState, 0));
            }
            this.f1524H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1546r : this.f1547s;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f1532d != null) {
            Rect rect = this.f1529M;
            if (this.f1537i != null) {
                this.f1537i.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C0355be.m1241a(this.f1532d);
            int max = Math.max(0, a.left - rect.left);
            i5 = Math.max(0, a.right - rect.right);
            i10 = max;
        } else {
            i5 = 0;
        }
        if (C0423ds.m1382a(this)) {
            i7 = getPaddingLeft() + i10;
            i6 = ((this.f1517A + i7) - i10) - i5;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i5;
            i7 = (i6 - this.f1517A) + i10 + i5;
        }
        int gravity = getGravity() & C0197k.f315aL;
        if (gravity == 16) {
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f1518B / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1518B;
            this.f1520D = i7;
            this.f1521E = i9;
            this.f1523G = i8;
            this.f1522F = i6;
        }
        i8 = this.f1518B + i9;
        this.f1520D = i7;
        this.f1521E = i9;
        this.f1523G = i8;
        this.f1522F = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1548t) {
            if (this.f1526J == null) {
                this.f1526J = m1009a(this.f1546r);
            }
            if (this.f1527K == null) {
                this.f1527K = m1009a(this.f1547s);
            }
        }
        Rect rect = this.f1529M;
        int i5 = 0;
        if (this.f1532d != null) {
            this.f1532d.getPadding(rect);
            i4 = (this.f1532d.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1532d.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1519C = Math.max(this.f1548t ? Math.max(this.f1526J.getWidth(), this.f1527K.getWidth()) + (this.f1542n * 2) : 0, i4);
        if (this.f1537i != null) {
            this.f1537i.getPadding(rect);
            i5 = this.f1537i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f1532d != null) {
            Rect a = C0355be.m1241a(this.f1532d);
            i6 = Math.max(i6, a.left);
            i7 = Math.max(i7, a.right);
        }
        int max = Math.max(this.f1543o, (this.f1519C * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1517A = max;
        this.f1518B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1546r : this.f1547s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.f1553y.addMovement(motionEvent);
        boolean z2 = false;
        switch (motionEvent.getActionMasked()) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled()) {
                    if (this.f1532d != null) {
                        int b = m1012b();
                        this.f1532d.getPadding(this.f1529M);
                        int i = this.f1521E - this.f1550v;
                        int i2 = (this.f1520D + b) - this.f1550v;
                        int i3 = this.f1519C + i2 + this.f1529M.left + this.f1529M.right + this.f1550v;
                        int i4 = this.f1523G + this.f1550v;
                        if (x > ((float) i2) && x < ((float) i3) && y > ((float) i) && y < ((float) i4)) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        this.f1549u = 1;
                        this.f1551w = x;
                        this.f1552x = y;
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                if (this.f1549u != 2) {
                    this.f1549u = 0;
                    this.f1553y.clear();
                    break;
                } else {
                    this.f1549u = 0;
                    boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                    boolean isChecked = isChecked();
                    if (z3) {
                        this.f1553y.computeCurrentVelocity(1000);
                        float xVelocity = this.f1553y.getXVelocity();
                        z = Math.abs(xVelocity) > ((float) this.f1554z) ? !C0423ds.m1382a(this) ? xVelocity > 0.0f : xVelocity < 0.0f : m1011a();
                    } else {
                        z = isChecked;
                    }
                    if (z != isChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(z);
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.onTouchEvent(obtain);
                    obtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                break;
            case 2:
                switch (this.f1549u) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f1551w) > ((float) this.f1550v) || Math.abs(y2 - this.f1552x) > ((float) this.f1550v)) {
                            this.f1549u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1551w = x2;
                            this.f1552x = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int c = m1013c();
                        float f = x3 - this.f1551w;
                        float f2 = c != 0 ? f / ((float) c) : f > 0.0f ? 1.0f : -1.0f;
                        if (C0423ds.m1382a(this)) {
                            f2 = -f2;
                        }
                        float f3 = f2 + this.f1530a;
                        if (f3 < 0.0f) {
                            f3 = 0.0f;
                        } else if (f3 > 1.0f) {
                            f3 = 1.0f;
                        }
                        if (f3 != this.f1530a) {
                            this.f1551w = x3;
                            mo4189a(f3);
                        }
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 0.0f;
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this)) {
            if (this.f1531b != null) {
                this.f1531b.cancel();
            }
            if (isChecked) {
                f = 1.0f;
            }
            mo4189a(f);
            return;
        }
        if (isChecked) {
            f = 1.0f;
        }
        this.f1531b = ObjectAnimator.ofFloat(this, f1516c, new float[]{f});
        this.f1531b.setDuration(250);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f1531b.setAutoCancel(true);
        }
        this.f1531b.start();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1532d || drawable == this.f1537i;
    }
}
