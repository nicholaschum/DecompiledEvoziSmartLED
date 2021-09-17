package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p004b.C0052b;
import android.support.p004b.C0053c;
import android.support.p004b.C0054d;
import android.support.p007v4.util.ObjectsCompat;
import android.support.p007v4.util.Pools;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.GravityCompat;
import android.support.p007v4.view.NestedScrollingParent2;
import android.support.p007v4.view.NestedScrollingParentHelper;
import android.support.p007v4.view.OnApplyWindowInsetsListener;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.WindowInsetsCompat;
import android.support.p007v4.widget.DirectedAcyclicGraph;
import android.support.p007v4.widget.ViewGroupUtils;
import android.support.p010v7.p011a.C0197k;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {

    /* renamed from: a */
    static final String f124a;

    /* renamed from: b */
    static final Class<?>[] f125b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    static final ThreadLocal<Map<String, Constructor<Behavior>>> f126c = new ThreadLocal<>();

    /* renamed from: d */
    static final Comparator<View> f127d;

    /* renamed from: f */
    private static final Pools.Pool<Rect> f128f = new Pools.SynchronizedPool(12);

    /* renamed from: e */
    ViewGroup.OnHierarchyChangeListener f129e;

    /* renamed from: g */
    private final List<View> f130g;

    /* renamed from: h */
    private final DirectedAcyclicGraph<View> f131h;

    /* renamed from: i */
    private final List<View> f132i;

    /* renamed from: j */
    private final List<View> f133j;

    /* renamed from: k */
    private final int[] f134k;

    /* renamed from: l */
    private boolean f135l;

    /* renamed from: m */
    private boolean f136m;

    /* renamed from: n */
    private int[] f137n;

    /* renamed from: o */
    private View f138o;

    /* renamed from: p */
    private View f139p;

    /* renamed from: q */
    private C0061f f140q;

    /* renamed from: r */
    private boolean f141r;

    /* renamed from: s */
    private WindowInsetsCompat f142s;

    /* renamed from: t */
    private boolean f143t;

    /* renamed from: u */
    private Drawable f144u;

    /* renamed from: v */
    private OnApplyWindowInsetsListener f145v;

    /* renamed from: w */
    private final NestedScrollingParentHelper f146w;

    public abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public static Parcelable m111a() {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: a */
        public static WindowInsetsCompat m112a(WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0062g();

        /* renamed from: a */
        SparseArray<Parcelable> f147a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f147a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f147a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f147a != null ? this.f147a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f147a.keyAt(i2);
                parcelableArr[i2] = this.f147a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<android.support.design.widget.CoordinatorLayout> r0 = android.support.design.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.getName()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            f124a = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r0 < r2) goto L_0x001f
            android.support.design.widget.h r0 = new android.support.design.widget.h
            r0.<init>()
            f127d = r0
            goto L_0x0021
        L_0x001f:
            f127d = r1
        L_0x0021:
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f125b = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f126c = r0
            android.support.v4.util.Pools$SynchronizedPool r0 = new android.support.v4.util.Pools$SynchronizedPool
            r1 = 12
            r0.<init>(r1)
            f128f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0052b.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f130g = new ArrayList();
        this.f131h = new DirectedAcyclicGraph<>();
        this.f132i = new ArrayList();
        this.f133j = new ArrayList();
        this.f134k = new int[2];
        this.f146w = new NestedScrollingParentHelper(this);
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, C0054d.f108b, 0, C0053c.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, C0054d.f108b, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(C0054d.f109c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f137n = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f137n.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f137n;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.f144u = obtainStyledAttributes.getDrawable(C0054d.f110d);
        obtainStyledAttributes.recycle();
        m106c();
        super.setOnHierarchyChangeListener(new C0059d(this));
    }

    /* renamed from: a */
    private static Rect m93a() {
        Rect acquire = f128f.acquire();
        return acquire == null ? new Rect() : acquire;
    }

    /* renamed from: a */
    static Behavior m94a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f124a)) {
            str = f124a + '.' + str;
        }
        try {
            Map map = f126c.get();
            if (map == null) {
                map = new HashMap();
                f126c.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(f125b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: a */
    private static C0060e m95a(View view) {
        C0060e eVar = (C0060e) view.getLayoutParams();
        if (!eVar.f151b) {
            if (view instanceof C0057b) {
                Behavior a = ((C0057b) view).mo124a();
                if (a == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.mo129a(a);
            } else {
                C0058c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0058c) cls.getAnnotation(C0058c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo129a((Behavior) cVar.mo125a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + cVar.mo125a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            eVar.f151b = true;
        }
        return eVar;
    }

    /* renamed from: a */
    private static void m96a(int i, Rect rect, Rect rect2, C0060e eVar, int i2, int i3) {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(m108e(eVar.f152c), i);
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(m105c(eVar.f153d), i);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & C0197k.f315aL;
        int i6 = absoluteGravity2 & 7;
        int i7 = absoluteGravity2 & C0197k.f315aL;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: a */
    private static void m97a(Rect rect) {
        rect.setEmpty();
        f128f.release(rect);
    }

    /* renamed from: a */
    private void m98a(C0060e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: a */
    private static void m99a(View view, int i) {
        C0060e eVar = (C0060e) view.getLayoutParams();
        if (eVar.f158i != i) {
            ViewCompat.offsetLeftAndRight(view, i - eVar.f158i);
            eVar.f158i = i;
        }
    }

    /* renamed from: a */
    private void m100a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ViewGroupUtils.getDescendantRect(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    private boolean m101a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f132i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        if (f127d != null) {
            Collections.sort(list, f127d);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0060e eVar = (C0060e) list.get(i2).getLayoutParams();
            Behavior behavior = eVar.f150a;
            if (!z || actionMasked == 0) {
                boolean a = eVar.mo130a();
                boolean b = eVar.mo131b();
                z = b && !a;
                if (b && !z) {
                    break;
                }
            } else if (behavior != null && motionEvent2 == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            }
        }
        list.clear();
        return false;
    }

    /* renamed from: b */
    private int m102b(int i) {
        String str;
        StringBuilder sb;
        if (this.f137n == null) {
            str = "CoordinatorLayout";
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < this.f137n.length) {
            return this.f137n[i];
        } else {
            str = "CoordinatorLayout";
            sb = new StringBuilder("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(str, sb.toString());
        return 0;
    }

    /* renamed from: b */
    private void m103b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C0060e) getChildAt(i).getLayoutParams()).f150a != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0).recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0060e) getChildAt(i2).getLayoutParams()).mo133c();
        }
        this.f138o = null;
        this.f135l = false;
    }

    /* renamed from: b */
    private static void m104b(View view, int i) {
        C0060e eVar = (C0060e) view.getLayoutParams();
        if (eVar.f159j != i) {
            ViewCompat.offsetTopAndBottom(view, i - eVar.f159j);
            eVar.f159j = i;
        }
    }

    /* renamed from: c */
    private static int m105c(int i) {
        if ((i & 7) == 0) {
            i |= GravityCompat.START;
        }
        return (i & C0197k.f315aL) == 0 ? i | 48 : i;
    }

    /* renamed from: c */
    private void m106c() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (ViewCompat.getFitsSystemWindows(this)) {
                if (this.f145v == null) {
                    this.f145v = new C0056a(this);
                }
                ViewCompat.setOnApplyWindowInsetsListener(this, this.f145v);
                setSystemUiVisibility(1280);
                return;
            }
            ViewCompat.setOnApplyWindowInsetsListener(this, (OnApplyWindowInsetsListener) null);
        }
    }

    /* renamed from: d */
    private static int m107d(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: e */
    private static int m108e(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final WindowInsetsCompat mo84a(WindowInsetsCompat windowInsetsCompat) {
        if (!ObjectsCompat.equals(this.f142s, windowInsetsCompat)) {
            this.f142s = windowInsetsCompat;
            boolean z = true;
            this.f143t = windowInsetsCompat != null && windowInsetsCompat.getSystemWindowInsetTop() > 0;
            if (this.f143t || getBackground() != null) {
                z = false;
            }
            setWillNotDraw(z);
            if (!windowInsetsCompat.isConsumed()) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (ViewCompat.getFitsSystemWindows(childAt) && ((C0060e) childAt.getLayoutParams()).f150a != null) {
                        windowInsetsCompat = Behavior.m112a(windowInsetsCompat);
                        if (windowInsetsCompat.isConsumed()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
        return windowInsetsCompat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85a(int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        int i8;
        C0060e eVar;
        int i9 = i;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.f130g.size();
        Rect a = m93a();
        Rect a2 = m93a();
        Rect a3 = m93a();
        boolean z4 = false;
        int i10 = 0;
        while (i10 < size) {
            View view = this.f130g.get(i10);
            C0060e eVar2 = (C0060e) view.getLayoutParams();
            if (i9 == 0 && view.getVisibility() == 8) {
                i3 = size;
                i2 = i10;
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    if (eVar2.f161l == this.f130g.get(i11)) {
                        C0060e eVar3 = (C0060e) view.getLayoutParams();
                        if (eVar3.f160k != null) {
                            Rect a4 = m93a();
                            Rect a5 = m93a();
                            Rect a6 = m93a();
                            ViewGroupUtils.getDescendantRect(this, eVar3.f160k, a4);
                            m100a(view, z4, a5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            int i12 = measuredWidth;
                            Rect rect = a6;
                            i8 = size;
                            Rect rect2 = a5;
                            Rect rect3 = a4;
                            C0060e eVar4 = eVar3;
                            i7 = i11;
                            i6 = i10;
                            eVar = eVar2;
                            m96a(layoutDirection, a4, rect, eVar3, i12, measuredHeight);
                            Rect rect4 = rect;
                            if (rect4.left == rect2.left) {
                                int i13 = rect4.top;
                                int i14 = rect2.top;
                            }
                            m98a(eVar4, rect4, i12, measuredHeight);
                            int i15 = rect4.left - rect2.left;
                            int i16 = rect4.top - rect2.top;
                            if (i15 != 0) {
                                ViewCompat.offsetLeftAndRight(view, i15);
                            }
                            if (i16 != 0) {
                                ViewCompat.offsetTopAndBottom(view, i16);
                            }
                            m97a(rect3);
                            m97a(rect2);
                            m97a(rect4);
                            i11 = i7 + 1;
                            eVar2 = eVar;
                            size = i8;
                            i10 = i6;
                            z4 = false;
                        }
                    }
                    i7 = i11;
                    i8 = size;
                    i6 = i10;
                    eVar = eVar2;
                    i11 = i7 + 1;
                    eVar2 = eVar;
                    size = i8;
                    i10 = i6;
                    z4 = false;
                }
                int i17 = size;
                i2 = i10;
                C0060e eVar5 = eVar2;
                m100a(view, true, a2);
                if (eVar5.f156g != 0 && !a2.isEmpty()) {
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(eVar5.f156g, layoutDirection);
                    int i18 = absoluteGravity & C0197k.f315aL;
                    if (i18 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i18 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i19 = absoluteGravity & 7;
                    if (i19 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i19 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (eVar5.f157h != 0 && view.getVisibility() == 0 && ViewCompat.isLaidOut(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0060e eVar6 = (C0060e) view.getLayoutParams();
                    Rect a7 = m93a();
                    Rect a8 = m93a();
                    a8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    a7.set(a8);
                    m97a(a8);
                    if (!a7.isEmpty()) {
                        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(eVar6.f157h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i5 = (a7.top - eVar6.topMargin) - eVar6.f159j) >= a.top) {
                            z = false;
                        } else {
                            m104b(view, a.top - i5);
                            z = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a7.bottom) - eVar6.bottomMargin) + eVar6.f159j) < a.bottom) {
                            m104b(view, height - a.bottom);
                            z = true;
                        }
                        if (!z) {
                            m104b(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i4 = (a7.left - eVar6.leftMargin) - eVar6.f158i) >= a.left) {
                            z2 = false;
                        } else {
                            m99a(view, a.left - i4);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 5) != 5 || (width = ((getWidth() - a7.right) - eVar6.rightMargin) + eVar6.f158i) >= a.right) {
                            z3 = z2;
                        } else {
                            m99a(view, width - a.right);
                            z3 = true;
                        }
                        if (!z3) {
                            m99a(view, 0);
                            m97a(a7);
                        }
                    }
                    m97a(a7);
                }
                if (i9 != 2) {
                    a3.set(((C0060e) view.getLayoutParams()).f162m);
                    if (!a3.equals(a2)) {
                        ((C0060e) view.getLayoutParams()).f162m.set(a2);
                    } else {
                        i3 = i17;
                    }
                }
                i3 = i17;
                for (int i20 = i2 + 1; i20 < i3; i20++) {
                    this.f130g.get(i20).getLayoutParams();
                }
            }
            i10 = i2 + 1;
            size = i3;
            z4 = false;
        }
        m97a(a);
        m97a(a2);
        m97a(a3);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0060e) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f144u;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0060e();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0060e(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0060e ? new C0060e((C0060e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0060e((ViewGroup.MarginLayoutParams) layoutParams) : new C0060e(layoutParams);
    }

    public int getNestedScrollAxes() {
        return this.f146w.getNestedScrollAxes();
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m103b();
        if (this.f141r) {
            if (this.f140q == null) {
                this.f140q = new C0061f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f140q);
        }
        if (this.f142s == null && ViewCompat.getFitsSystemWindows(this)) {
            ViewCompat.requestApplyInsets(this);
        }
        this.f136m = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m103b();
        if (this.f141r && this.f140q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f140q);
        }
        if (this.f139p != null) {
            onStopNestedScroll(this.f139p);
        }
        this.f136m = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f143t && this.f144u != null) {
            int systemWindowInsetTop = this.f142s != null ? this.f142s.getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f144u.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f144u.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m103b();
        }
        m101a(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        m103b();
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect;
        Rect rect2;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int size = this.f130g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f130g.get(i5);
            if (view.getVisibility() != 8) {
                view.getLayoutParams();
                C0060e eVar = (C0060e) view.getLayoutParams();
                if (!(eVar.f160k == null && eVar.f155f != -1)) {
                    if (eVar.f160k != null) {
                        View view2 = eVar.f160k;
                        rect2 = m93a();
                        rect = m93a();
                        try {
                            ViewGroupUtils.getDescendantRect(this, view2, rect2);
                            C0060e eVar2 = (C0060e) view.getLayoutParams();
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            m96a(layoutDirection, rect2, rect, eVar2, measuredWidth, measuredHeight);
                            m98a(eVar2, rect, measuredWidth, measuredHeight);
                            view.layout(rect.left, rect.top, rect.right, rect.bottom);
                        } catch (Throwable th) {
                            m97a(rect2);
                            m97a(rect);
                            throw th;
                        }
                    } else if (eVar.f154e >= 0) {
                        int i6 = eVar.f154e;
                        C0060e eVar3 = (C0060e) view.getLayoutParams();
                        int absoluteGravity = GravityCompat.getAbsoluteGravity(m107d(eVar3.f152c), layoutDirection);
                        int i7 = absoluteGravity & 7;
                        int i8 = absoluteGravity & C0197k.f315aL;
                        int width = getWidth();
                        int height = getHeight();
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (layoutDirection == 1) {
                            i6 = width - i6;
                        }
                        int b = m102b(i6) - measuredWidth2;
                        if (i7 == 1) {
                            b += measuredWidth2 / 2;
                        } else if (i7 == 5) {
                            b += measuredWidth2;
                        }
                        int i9 = i8 != 16 ? i8 != 80 ? 0 : measuredHeight2 + 0 : (measuredHeight2 / 2) + 0;
                        int max = Math.max(getPaddingLeft() + eVar3.leftMargin, Math.min(b, ((width - getPaddingRight()) - measuredWidth2) - eVar3.rightMargin));
                        int max2 = Math.max(getPaddingTop() + eVar3.topMargin, Math.min(i9, ((height - getPaddingBottom()) - measuredHeight2) - eVar3.bottomMargin));
                        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                    } else {
                        C0060e eVar4 = (C0060e) view.getLayoutParams();
                        rect2 = m93a();
                        rect2.set(getPaddingLeft() + eVar4.leftMargin, getPaddingTop() + eVar4.topMargin, (getWidth() - getPaddingRight()) - eVar4.rightMargin, (getHeight() - getPaddingBottom()) - eVar4.bottomMargin);
                        if (this.f142s != null && ViewCompat.getFitsSystemWindows(this) && !ViewCompat.getFitsSystemWindows(view)) {
                            rect2.left += this.f142s.getSystemWindowInsetLeft();
                            rect2.top += this.f142s.getSystemWindowInsetTop();
                            rect2.right -= this.f142s.getSystemWindowInsetRight();
                            rect2.bottom -= this.f142s.getSystemWindowInsetBottom();
                        }
                        rect = m93a();
                        GravityCompat.apply(m105c(eVar4.f152c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect2, rect, layoutDirection);
                        view.layout(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    m97a(rect2);
                    m97a(rect);
                } else {
                    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r5 != false) goto L_0x00b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x00fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r29, int r30) {
        /*
            r28 = this;
            r6 = r28
            java.util.List<android.view.View> r0 = r6.f130g
            r0.clear()
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r0 = r6.f131h
            r0.clear()
            int r0 = r28.getChildCount()
            r7 = 0
            r1 = 0
        L_0x0012:
            r2 = 1
            if (r1 >= r0) goto L_0x0129
            android.view.View r3 = r6.getChildAt(r1)
            android.support.design.widget.e r4 = m95a((android.view.View) r3)
            int r5 = r4.f155f
            r8 = -1
            r9 = 0
            if (r5 != r8) goto L_0x0029
        L_0x0023:
            r4.f161l = r9
            r4.f160k = r9
            goto L_0x00b1
        L_0x0029:
            android.view.View r5 = r4.f160k
            if (r5 == 0) goto L_0x005e
            android.view.View r5 = r4.f160k
            int r5 = r5.getId()
            int r8 = r4.f155f
            if (r5 == r8) goto L_0x0039
        L_0x0037:
            r5 = 0
            goto L_0x005c
        L_0x0039:
            android.view.View r5 = r4.f160k
            android.view.View r8 = r4.f160k
            android.view.ViewParent r8 = r8.getParent()
        L_0x0041:
            if (r8 == r6) goto L_0x0059
            if (r8 == 0) goto L_0x0054
            if (r8 != r3) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            boolean r10 = r8 instanceof android.view.View
            if (r10 == 0) goto L_0x004f
            r5 = r8
            android.view.View r5 = (android.view.View) r5
        L_0x004f:
            android.view.ViewParent r8 = r8.getParent()
            goto L_0x0041
        L_0x0054:
            r4.f161l = r9
            r4.f160k = r9
            goto L_0x0037
        L_0x0059:
            r4.f161l = r5
            r5 = 1
        L_0x005c:
            if (r5 != 0) goto L_0x00b1
        L_0x005e:
            int r5 = r4.f155f
            android.view.View r5 = r6.findViewById(r5)
            r4.f160k = r5
            android.view.View r5 = r4.f160k
            if (r5 == 0) goto L_0x00a9
            android.view.View r5 = r4.f160k
            if (r5 != r6) goto L_0x007d
            boolean r5 = r28.isInEditMode()
            if (r5 == 0) goto L_0x0075
            goto L_0x0023
        L_0x0075:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x007d:
            android.view.View r5 = r4.f160k
            android.view.View r8 = r4.f160k
            android.view.ViewParent r8 = r8.getParent()
        L_0x0085:
            if (r8 == r6) goto L_0x00a6
            if (r8 == 0) goto L_0x00a6
            if (r8 != r3) goto L_0x009a
            boolean r5 = r28.isInEditMode()
            if (r5 == 0) goto L_0x0092
            goto L_0x0023
        L_0x0092:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x009a:
            boolean r10 = r8 instanceof android.view.View
            if (r10 == 0) goto L_0x00a1
            r5 = r8
            android.view.View r5 = (android.view.View) r5
        L_0x00a1:
            android.view.ViewParent r8 = r8.getParent()
            goto L_0x0085
        L_0x00a6:
            r4.f161l = r5
            goto L_0x00b1
        L_0x00a9:
            boolean r5 = r28.isInEditMode()
            if (r5 == 0) goto L_0x0103
            goto L_0x0023
        L_0x00b1:
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r5 = r6.f131h
            r5.addNode(r3)
            r5 = 0
        L_0x00b7:
            if (r5 >= r0) goto L_0x00ff
            if (r5 == r1) goto L_0x00fc
            android.view.View r8 = r6.getChildAt(r5)
            android.view.View r9 = r4.f161l
            if (r8 == r9) goto L_0x00e7
            int r9 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r28)
            android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
            android.support.design.widget.e r10 = (android.support.design.widget.C0060e) r10
            int r10 = r10.f156g
            int r10 = android.support.p007v4.view.GravityCompat.getAbsoluteGravity(r10, r9)
            if (r10 == 0) goto L_0x00e0
            int r11 = r4.f157h
            int r9 = android.support.p007v4.view.GravityCompat.getAbsoluteGravity(r11, r9)
            r9 = r9 & r10
            if (r9 != r10) goto L_0x00e0
            r9 = 1
            goto L_0x00e1
        L_0x00e0:
            r9 = 0
        L_0x00e1:
            if (r9 != 0) goto L_0x00e7
            android.support.design.widget.CoordinatorLayout$Behavior r9 = r4.f150a
            r9 = 0
            goto L_0x00e8
        L_0x00e7:
            r9 = 1
        L_0x00e8:
            if (r9 == 0) goto L_0x00fc
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r9 = r6.f131h
            boolean r9 = r9.contains(r8)
            if (r9 != 0) goto L_0x00f7
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r9 = r6.f131h
            r9.addNode(r8)
        L_0x00f7:
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r9 = r6.f131h
            r9.addEdge(r8, r3)
        L_0x00fc:
            int r5 = r5 + 1
            goto L_0x00b7
        L_0x00ff:
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0103:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r28.getResources()
            int r4 = r4.f155f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0129:
            java.util.List<android.view.View> r0 = r6.f130g
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r1 = r6.f131h
            java.util.ArrayList r1 = r1.getSortedList()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r6.f130g
            java.util.Collections.reverse(r0)
            int r0 = r28.getChildCount()
            r1 = 0
        L_0x013e:
            if (r1 >= r0) goto L_0x0151
            android.view.View r3 = r6.getChildAt(r1)
            android.support.v4.widget.DirectedAcyclicGraph<android.view.View> r4 = r6.f131h
            boolean r3 = r4.hasOutgoingEdges(r3)
            if (r3 == 0) goto L_0x014e
            r0 = 1
            goto L_0x0152
        L_0x014e:
            int r1 = r1 + 1
            goto L_0x013e
        L_0x0151:
            r0 = 0
        L_0x0152:
            boolean r1 = r6.f141r
            if (r0 == r1) goto L_0x0186
            if (r0 == 0) goto L_0x0173
            boolean r0 = r6.f136m
            if (r0 == 0) goto L_0x0170
            android.support.design.widget.f r0 = r6.f140q
            if (r0 != 0) goto L_0x0167
            android.support.design.widget.f r0 = new android.support.design.widget.f
            r0.<init>(r6)
            r6.f140q = r0
        L_0x0167:
            android.view.ViewTreeObserver r0 = r28.getViewTreeObserver()
            android.support.design.widget.f r1 = r6.f140q
            r0.addOnPreDrawListener(r1)
        L_0x0170:
            r6.f141r = r2
            goto L_0x0186
        L_0x0173:
            boolean r0 = r6.f136m
            if (r0 == 0) goto L_0x0184
            android.support.design.widget.f r0 = r6.f140q
            if (r0 == 0) goto L_0x0184
            android.view.ViewTreeObserver r0 = r28.getViewTreeObserver()
            android.support.design.widget.f r1 = r6.f140q
            r0.removeOnPreDrawListener(r1)
        L_0x0184:
            r6.f141r = r7
        L_0x0186:
            int r8 = r28.getPaddingLeft()
            int r0 = r28.getPaddingTop()
            int r9 = r28.getPaddingRight()
            int r1 = r28.getPaddingBottom()
            int r10 = android.support.p007v4.view.ViewCompat.getLayoutDirection(r28)
            if (r10 != r2) goto L_0x019e
            r11 = 1
            goto L_0x019f
        L_0x019e:
            r11 = 0
        L_0x019f:
            int r12 = android.view.View.MeasureSpec.getMode(r29)
            int r13 = android.view.View.MeasureSpec.getSize(r29)
            int r14 = android.view.View.MeasureSpec.getMode(r30)
            int r15 = android.view.View.MeasureSpec.getSize(r30)
            int r16 = r8 + r9
            int r17 = r0 + r1
            int r0 = r28.getSuggestedMinimumWidth()
            int r1 = r28.getSuggestedMinimumHeight()
            android.support.v4.view.WindowInsetsCompat r3 = r6.f142s
            if (r3 == 0) goto L_0x01c8
            boolean r3 = android.support.p007v4.view.ViewCompat.getFitsSystemWindows(r28)
            if (r3 == 0) goto L_0x01c8
            r18 = 1
            goto L_0x01ca
        L_0x01c8:
            r18 = 0
        L_0x01ca:
            java.util.List<android.view.View> r2 = r6.f130g
            int r5 = r2.size()
            r3 = r0
            r2 = 0
            r4 = 0
        L_0x01d3:
            if (r4 >= r5) goto L_0x02cc
            java.util.List<android.view.View> r0 = r6.f130g
            java.lang.Object r0 = r0.get(r4)
            r19 = r0
            android.view.View r19 = (android.view.View) r19
            int r0 = r19.getVisibility()
            r7 = 8
            if (r0 == r7) goto L_0x02ba
            android.view.ViewGroup$LayoutParams r0 = r19.getLayoutParams()
            r7 = r0
            android.support.design.widget.e r7 = (android.support.design.widget.C0060e) r7
            int r0 = r7.f154e
            if (r0 < 0) goto L_0x0232
            if (r12 == 0) goto L_0x0232
            int r0 = r7.f154e
            int r0 = r6.m102b(r0)
            r21 = r1
            int r1 = r7.f152c
            int r1 = m107d(r1)
            int r1 = android.support.p007v4.view.GravityCompat.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r22 = r2
            r2 = 3
            if (r1 != r2) goto L_0x020f
            if (r11 == 0) goto L_0x0214
        L_0x020f:
            r2 = 5
            if (r1 != r2) goto L_0x0220
            if (r11 == 0) goto L_0x0220
        L_0x0214:
            int r1 = r13 - r9
            int r1 = r1 - r0
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            r20 = r1
            r2 = 0
            goto L_0x0239
        L_0x0220:
            if (r1 != r2) goto L_0x0224
            if (r11 == 0) goto L_0x0229
        L_0x0224:
            r2 = 3
            if (r1 != r2) goto L_0x0236
            if (r11 == 0) goto L_0x0236
        L_0x0229:
            int r0 = r0 - r8
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r20 = r0
            goto L_0x0239
        L_0x0232:
            r21 = r1
            r22 = r2
        L_0x0236:
            r2 = 0
            r20 = 0
        L_0x0239:
            if (r18 == 0) goto L_0x026b
            boolean r0 = android.support.p007v4.view.ViewCompat.getFitsSystemWindows(r19)
            if (r0 != 0) goto L_0x026b
            android.support.v4.view.WindowInsetsCompat r0 = r6.f142s
            int r0 = r0.getSystemWindowInsetLeft()
            android.support.v4.view.WindowInsetsCompat r1 = r6.f142s
            int r1 = r1.getSystemWindowInsetRight()
            int r0 = r0 + r1
            android.support.v4.view.WindowInsetsCompat r1 = r6.f142s
            int r1 = r1.getSystemWindowInsetTop()
            android.support.v4.view.WindowInsetsCompat r2 = r6.f142s
            int r2 = r2.getSystemWindowInsetBottom()
            int r1 = r1 + r2
            int r0 = r13 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r12)
            int r1 = r15 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            r2 = r0
            r23 = r1
            goto L_0x026f
        L_0x026b:
            r2 = r29
            r23 = r30
        L_0x026f:
            r24 = 0
            r0 = r28
            r25 = r21
            r1 = r19
            r26 = r22
            r21 = 0
            r27 = r3
            r3 = r20
            r20 = r4
            r4 = r23
            r22 = r5
            r5 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            int r0 = r19.getMeasuredWidth()
            int r0 = r16 + r0
            int r1 = r7.leftMargin
            int r0 = r0 + r1
            int r1 = r7.rightMargin
            int r0 = r0 + r1
            r1 = r27
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r19.getMeasuredHeight()
            int r1 = r17 + r1
            int r2 = r7.topMargin
            int r1 = r1 + r2
            int r2 = r7.bottomMargin
            int r1 = r1 + r2
            r2 = r25
            int r1 = java.lang.Math.max(r2, r1)
            int r2 = r19.getMeasuredState()
            r7 = r26
            int r2 = android.view.View.combineMeasuredStates(r7, r2)
            r3 = r0
            goto L_0x02c5
        L_0x02ba:
            r7 = r2
            r20 = r4
            r22 = r5
            r21 = 0
            r2 = r1
            r1 = r3
            r1 = r2
            r2 = r7
        L_0x02c5:
            int r4 = r20 + 1
            r5 = r22
            r7 = 0
            goto L_0x01d3
        L_0x02cc:
            r7 = r2
            r2 = r1
            r1 = r3
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r7
            r3 = r29
            int r0 = android.view.View.resolveSizeAndState(r1, r3, r0)
            int r1 = r7 << 16
            r3 = r30
            int r1 = android.view.View.resolveSizeAndState(r2, r3, r1)
            r6.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0060e eVar = (C0060e) childAt.getLayoutParams();
                if (eVar.mo132b(i3) && eVar.f150a != null) {
                    int[] iArr2 = this.f134k;
                    this.f134k[1] = 0;
                    iArr2[0] = 0;
                    i4 = i > 0 ? Math.max(i4, this.f134k[0]) : Math.min(i4, this.f134k[0]);
                    i5 = i2 > 0 ? Math.max(i5, this.f134k[1]) : Math.min(i5, this.f134k[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo85a(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0060e eVar = (C0060e) childAt.getLayoutParams();
                if (eVar.mo132b(i5) && eVar.f150a != null) {
                    z = true;
                }
            }
        }
        if (z) {
            mo85a(1);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f146w.onNestedScrollAccepted(view, view2, i, i2);
        this.f139p = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f147a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = m95a(childAt).f150a;
            if (!(id == -1 || behavior == null)) {
                sparseArray.get(id);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable a;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C0060e) childAt.getLayoutParams()).f150a;
            if (!(id == -1 || behavior == null || (a = Behavior.m111a()) == null)) {
                sparseArray.append(id, a);
            }
        }
        savedState.f147a = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ((C0060e) childAt.getLayoutParams()).mo128a(i2);
            }
        }
        return false;
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onStopNestedScroll(View view, int i) {
        this.f146w.onStopNestedScroll(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C0060e eVar = (C0060e) getChildAt(i2).getLayoutParams();
            if (eVar.mo132b(i)) {
                eVar.mo128a(i);
                eVar.mo134d();
            }
        }
        this.f139p = null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f138o == null) {
            m101a(motionEvent);
        } else {
            Behavior behavior = ((C0060e) this.f138o.getLayoutParams()).f150a;
        }
        boolean z = false;
        if (this.f138o == null) {
            z = false | super.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            m103b();
        }
        return z;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        view.getLayoutParams();
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f135l) {
            m103b();
            this.f135l = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m106c();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f129e = onHierarchyChangeListener;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f144u != null && this.f144u.isVisible() != z) {
            this.f144u.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f144u;
    }
}
