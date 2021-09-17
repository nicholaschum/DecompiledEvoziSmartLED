package p021wl.smartled.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import java.util.LinkedList;
import p021wl.smartled.C0512b;

/* renamed from: wl.smartled.views.DragGridView */
public class DragGridView extends GridView {

    /* renamed from: a */
    public static final String f2692a = "DragGridView";

    /* renamed from: A */
    private boolean f2693A;

    /* renamed from: B */
    private int f2694B;

    /* renamed from: C */
    private int f2695C;

    /* renamed from: D */
    private float f2696D;

    /* renamed from: E */
    private int f2697E;

    /* renamed from: F */
    private boolean f2698F;

    /* renamed from: G */
    private int f2699G;

    /* renamed from: H */
    private boolean f2700H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f2701I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Handler f2702J;

    /* renamed from: K */
    private Runnable f2703K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Runnable f2704L;

    /* renamed from: b */
    private long f2705b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f2706c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f2707d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f2708e;

    /* renamed from: f */
    private int f2709f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f2710g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f2711h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public View f2712i;

    /* renamed from: j */
    private ImageView f2713j;

    /* renamed from: k */
    private FrameLayout f2714k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Vibrator f2715l;

    /* renamed from: m */
    private WindowManager f2716m;

    /* renamed from: n */
    private WindowManager.LayoutParams f2717n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Bitmap f2718o;

    /* renamed from: p */
    private int f2719p;

    /* renamed from: q */
    private int f2720q;

    /* renamed from: r */
    private int f2721r;

    /* renamed from: s */
    private int f2722s;

    /* renamed from: t */
    private int f2723t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f2724u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f2725v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f2726w;

    /* renamed from: x */
    private C0616g f2727x;

    /* renamed from: y */
    private int f2728y;

    /* renamed from: z */
    private int f2729z;

    public DragGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    public DragGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DragGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2705b = 1000;
        this.f2706c = false;
        this.f2712i = null;
        this.f2726w = true;
        this.f2696D = 1.2f;
        this.f2697E = 200;
        this.f2698F = false;
        this.f2699G = 7;
        this.f2700H = false;
        this.f2701I = false;
        this.f2702J = new Handler();
        this.f2703K = new C0602c(this);
        this.f2704L = new C0603d(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0512b.f2279v);
        this.f2696D = obtainStyledAttributes.getFloat(1, 1.2f);
        this.f2697E = obtainStyledAttributes.getInteger(3, 200);
        this.f2699G = obtainStyledAttributes.getInteger(2, 7);
        this.f2698F = obtainStyledAttributes.getBoolean(0, false);
        this.f2701I = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        if (!isInEditMode()) {
            this.f2715l = (Vibrator) context.getSystemService("vibrator");
            this.f2716m = (WindowManager) context.getSystemService("window");
            this.f2723t = m2153a(context);
        }
        if (!this.f2693A) {
            this.f2728y = -1;
        }
    }

    /* renamed from: a */
    private static int m2153a(Context context) {
        Rect rect = new Rect();
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        if (i == 0) {
            try {
                Class<?> cls = Class.forName("com.android.internal.R$dimen");
                return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    /* renamed from: a */
    private static AnimatorSet m2155a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", new float[]{f2, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        return animatorSet;
    }

    /* renamed from: a */
    static /* synthetic */ void m2156a(DragGridView dragGridView, int i, int i2) {
        boolean z = i2 > i;
        LinkedList linkedList = new LinkedList();
        if (z) {
            while (i < i2) {
                View childAt = dragGridView.getChildAt(i - dragGridView.getFirstVisiblePosition());
                if (childAt != null) {
                    i++;
                    linkedList.add(i % dragGridView.f2728y == 0 ? m2155a(childAt, (float) ((-childAt.getWidth()) * (dragGridView.f2728y - 1)), (float) childAt.getHeight()) : m2155a(childAt, (float) childAt.getWidth(), 0.0f));
                } else {
                    return;
                }
            }
        } else {
            while (i > i2) {
                View childAt2 = dragGridView.getChildAt(i - dragGridView.getFirstVisiblePosition());
                if (childAt2 != null) {
                    linkedList.add((dragGridView.f2728y + i) % dragGridView.f2728y == 0 ? m2155a(childAt2, (float) (childAt2.getWidth() * (dragGridView.f2728y - 1)), (float) (-childAt2.getHeight())) : m2155a(childAt2, (float) (-childAt2.getWidth()), 0.0f));
                    i--;
                } else {
                    return;
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(linkedList);
        animatorSet.setDuration(300);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C0605f(dragGridView));
        animatorSet.start();
    }

    /* renamed from: a */
    static /* synthetic */ void m2157a(DragGridView dragGridView, Bitmap bitmap, int i, int i2) {
        dragGridView.f2717n = new WindowManager.LayoutParams();
        dragGridView.f2717n.format = -3;
        dragGridView.f2717n.gravity = 51;
        dragGridView.f2717n.x = (int) ((((float) i) - (((float) dragGridView.f2720q) * dragGridView.f2696D)) + ((float) dragGridView.f2722s));
        dragGridView.f2717n.y = (int) (((((float) i2) - (((float) dragGridView.f2719p) * dragGridView.f2696D)) + ((float) dragGridView.f2721r)) - ((float) dragGridView.f2723t));
        dragGridView.f2717n.alpha = 1.0f;
        dragGridView.f2717n.width = -2;
        dragGridView.f2717n.height = -2;
        dragGridView.f2717n.flags = 24;
        dragGridView.f2713j = new ImageView(dragGridView.getContext());
        dragGridView.f2713j.setImageBitmap(bitmap);
        dragGridView.f2714k = new FrameLayout(dragGridView.getContext());
        dragGridView.f2714k.addView(dragGridView.f2713j);
        dragGridView.f2716m.addView(dragGridView.f2714k, dragGridView.f2717n);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 1
            switch(r0) {
                case 0: goto L_0x004e;
                case 1: goto L_0x003e;
                case 2: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0115
        L_0x000a:
            float r0 = r9.getX()
            int r0 = (int) r0
            float r2 = r9.getY()
            int r2 = (int) r2
            android.view.View r3 = r8.f2712i
            r4 = 0
            if (r3 != 0) goto L_0x001a
            goto L_0x0037
        L_0x001a:
            int r5 = r3.getLeft()
            int r6 = r3.getTop()
            if (r0 < r5) goto L_0x0037
            int r7 = r3.getWidth()
            int r5 = r5 + r7
            if (r0 <= r5) goto L_0x002c
            goto L_0x0037
        L_0x002c:
            if (r2 < r6) goto L_0x0037
            int r0 = r3.getHeight()
            int r6 = r6 + r0
            if (r2 <= r6) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r4 = 1
        L_0x0037:
            if (r4 != 0) goto L_0x0115
            android.os.Handler r0 = r8.f2702J
            java.lang.Runnable r1 = r8.f2703K
            goto L_0x0049
        L_0x003e:
            android.os.Handler r0 = r8.f2702J
            java.lang.Runnable r1 = r8.f2703K
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r8.f2702J
            java.lang.Runnable r1 = r8.f2704L
        L_0x0049:
            r0.removeCallbacks(r1)
            goto L_0x0115
        L_0x004e:
            float r0 = r9.getX()
            int r0 = (int) r0
            r8.f2707d = r0
            float r0 = r9.getY()
            int r0 = (int) r0
            r8.f2708e = r0
            int r0 = r8.f2707d
            int r2 = r8.f2708e
            int r0 = r8.pointToPosition(r0, r2)
            r8.f2711h = r0
            int r0 = r8.f2711h
            int r2 = r8.f2699G
            if (r0 >= r2) goto L_0x0071
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x0071:
            android.widget.ListAdapter r0 = r8.getAdapter()
            if (r0 == 0) goto L_0x008d
            int r0 = r8.f2711h
            android.widget.ListAdapter r2 = r8.getAdapter()
            int r2 = r2.getCount()
            int r2 = r2 - r1
            if (r0 != r2) goto L_0x008d
            boolean r0 = r8.f2698F
            if (r0 != 0) goto L_0x008d
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x008d:
            int r0 = r8.f2711h
            r2 = -1
            if (r0 != r2) goto L_0x0097
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x0097:
            android.os.Handler r0 = r8.f2702J
            java.lang.Runnable r2 = r8.f2703K
            long r3 = r8.f2705b
            r0.postDelayed(r2, r3)
            int r0 = r8.f2711h
            int r2 = r8.getFirstVisiblePosition()
            int r0 = r0 - r2
            android.view.View r0 = r8.getChildAt(r0)
            r8.f2712i = r0
            int r0 = r8.f2708e
            android.view.View r2 = r8.f2712i
            int r2 = r2.getTop()
            int r0 = r0 - r2
            r8.f2719p = r0
            int r0 = r8.f2707d
            android.view.View r2 = r8.f2712i
            int r2 = r2.getLeft()
            int r0 = r0 - r2
            r8.f2720q = r0
            float r0 = r9.getRawY()
            int r2 = r8.f2708e
            float r2 = (float) r2
            float r0 = r0 - r2
            int r0 = (int) r0
            r8.f2721r = r0
            float r0 = r9.getRawX()
            int r2 = r8.f2707d
            float r2 = (float) r2
            float r0 = r0 - r2
            int r0 = (int) r0
            r8.f2722s = r0
            int r0 = r8.getHeight()
            int r0 = r0 / 5
            r8.f2724u = r0
            int r0 = r8.getHeight()
            int r0 = r0 * 4
            int r0 = r0 / 5
            r8.f2725v = r0
            android.view.View r0 = r8.f2712i
            r0.setDrawingCacheEnabled(r1)
            android.view.View r0 = r8.f2712i
            android.graphics.Bitmap r0 = r0.getDrawingCache()
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r3 = r8.f2696D
            float r2 = r2 * r3
            int r2 = (int) r2
            int r3 = r0.getHeight()
            float r3 = (float) r3
            float r4 = r8.f2696D
            float r3 = r3 * r4
            int r3 = (int) r3
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r3, r1)
            r8.f2718o = r0
            android.view.View r0 = r8.f2712i
            r0.destroyDrawingCache()
        L_0x0115:
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.views.DragGridView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2695C = i4 - i2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f2728y == -1) {
            if (this.f2729z > 0) {
                int max = Math.max((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0);
                i3 = max / this.f2729z;
                if (i3 > 0) {
                    while (i3 != 1 && (this.f2729z * i3) + ((i3 - 1) * this.f2694B) > max) {
                        i3--;
                    }
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 2;
            }
            this.f2728y = i3;
        }
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2706c || this.f2713j == null) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 1:
                motionEvent.getX();
                int y = (int) motionEvent.getY();
                View childAt = getChildAt(this.f2711h - getFirstVisiblePosition());
                if (childAt != null) {
                    childAt.setVisibility(0);
                }
                this.f2727x.mo4840a(-1);
                if (this.f2713j != null) {
                    this.f2716m.removeView(this.f2714k);
                    this.f2714k = null;
                    this.f2713j = null;
                }
                if (y > this.f2695C) {
                    this.f2700H = false;
                    this.f2727x.mo4843b(this.f2711h);
                }
                this.f2706c = false;
                break;
            case 2:
                this.f2709f = (int) motionEvent.getX();
                this.f2710g = (int) motionEvent.getY();
                int i = this.f2709f;
                int i2 = this.f2710g;
                this.f2717n.x = (i - this.f2720q) + this.f2722s;
                this.f2717n.y = ((i2 - this.f2719p) + this.f2721r) - this.f2723t;
                this.f2716m.updateViewLayout(this.f2714k, this.f2717n);
                int pointToPosition = pointToPosition(i, i2);
                if (pointToPosition >= this.f2699G && ((getAdapter() == null || pointToPosition != getAdapter().getCount() - 1 || this.f2698F) && pointToPosition != this.f2711h && pointToPosition != -1 && this.f2726w)) {
                    this.f2727x.mo4841a(this.f2711h, pointToPosition);
                    this.f2727x.mo4840a(pointToPosition);
                    ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                    viewTreeObserver.addOnPreDrawListener(new C0604e(this, viewTreeObserver, pointToPosition));
                }
                this.f2702J.post(this.f2704L);
                if (i2 <= this.f2695C) {
                    if (this.f2700H) {
                        this.f2713j.clearAnimation();
                        this.f2700H = false;
                        break;
                    }
                } else {
                    if (this.f2701I) {
                        this.f2715l.vibrate(50);
                    }
                    if (!this.f2700H) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f);
                        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 0.25f);
                        AnimationSet animationSet = new AnimationSet(false);
                        animationSet.addAnimation(scaleAnimation);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.setDuration((long) this.f2697E);
                        animationSet.setFillAfter(true);
                        this.f2713j.clearAnimation();
                        this.f2713j.startAnimation(animationSet);
                        this.f2700H = true;
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        if (isInEditMode()) {
            return;
        }
        if (listAdapter instanceof C0616g) {
            this.f2727x = (C0616g) listAdapter;
            return;
        }
        throw new IllegalStateException("the adapter must be implements DragGridAdapter");
    }

    public void setColumnWidth(int i) {
        super.setColumnWidth(i);
        this.f2729z = i;
    }

    public void setHorizontalSpacing(int i) {
        super.setHorizontalSpacing(i);
        this.f2694B = i;
    }

    public void setNumColumns(int i) {
        super.setNumColumns(i);
        this.f2693A = true;
        this.f2728y = i;
    }
}
