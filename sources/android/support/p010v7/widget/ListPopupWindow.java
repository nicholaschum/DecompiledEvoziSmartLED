package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p007v4.view.PointerIconCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.menu.C0292ai;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ListPopupWindow */
public class ListPopupWindow implements C0292ai {

    /* renamed from: a */
    private static Method f1420a;

    /* renamed from: b */
    private static Method f1421b;

    /* renamed from: h */
    private static Method f1422h;

    /* renamed from: A */
    private Drawable f1423A;

    /* renamed from: B */
    private AdapterView.OnItemClickListener f1424B;

    /* renamed from: C */
    private AdapterView.OnItemSelectedListener f1425C;

    /* renamed from: D */
    private final C0369bs f1426D;

    /* renamed from: E */
    private final C0368br f1427E;

    /* renamed from: F */
    private final C0366bp f1428F;

    /* renamed from: G */
    private Runnable f1429G;

    /* renamed from: H */
    private final Rect f1430H;

    /* renamed from: I */
    private Rect f1431I;

    /* renamed from: J */
    private boolean f1432J;

    /* renamed from: c */
    C0356bf f1433c;

    /* renamed from: d */
    int f1434d;

    /* renamed from: e */
    final C0370bt f1435e;

    /* renamed from: f */
    final Handler f1436f;

    /* renamed from: g */
    PopupWindow f1437g;

    /* renamed from: i */
    private Context f1438i;

    /* renamed from: j */
    private ListAdapter f1439j;

    /* renamed from: k */
    private int f1440k;

    /* renamed from: l */
    private int f1441l;

    /* renamed from: m */
    private int f1442m;

    /* renamed from: n */
    private int f1443n;

    /* renamed from: o */
    private int f1444o;

    /* renamed from: p */
    private boolean f1445p;

    /* renamed from: q */
    private boolean f1446q;

    /* renamed from: r */
    private boolean f1447r;

    /* renamed from: s */
    private boolean f1448s;

    /* renamed from: t */
    private int f1449t;

    /* renamed from: u */
    private boolean f1450u;

    /* renamed from: v */
    private boolean f1451v;

    /* renamed from: w */
    private View f1452w;

    /* renamed from: x */
    private int f1453x;

    /* renamed from: y */
    private DataSetObserver f1454y;

    /* renamed from: z */
    private View f1455z;

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f1420a = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            f1421b = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f1422h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, C0188b.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1440k = -2;
        this.f1441l = -2;
        this.f1444o = PointerIconCompat.TYPE_HAND;
        this.f1446q = true;
        this.f1449t = 0;
        this.f1450u = false;
        this.f1451v = false;
        this.f1434d = Integer.MAX_VALUE;
        this.f1453x = 0;
        this.f1435e = new C0370bt(this);
        this.f1426D = new C0369bs(this);
        this.f1427E = new C0368br(this);
        this.f1428F = new C0366bp(this);
        this.f1430H = new Rect();
        this.f1438i = context;
        this.f1436f = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f404bv, i, i2);
        this.f1442m = obtainStyledAttributes.getDimensionPixelOffset(C0197k.f405bw, 0);
        this.f1443n = obtainStyledAttributes.getDimensionPixelOffset(C0197k.f406bx, 0);
        if (this.f1443n != 0) {
            this.f1445p = true;
        }
        obtainStyledAttributes.recycle();
        this.f1437g = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f1437g.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m943a(View view, int i, boolean z) {
        if (f1421b != null) {
            try {
                return ((Integer) f1421b.invoke(this.f1437g, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1437g.getMaxAvailableHeight(view, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0356bf mo4134a(Context context, boolean z) {
        return new C0356bf(context, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: android.support.v7.widget.bf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: android.support.v7.widget.bf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: android.support.v7.widget.bf} */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012c, code lost:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, 1073741824);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0164, code lost:
        r1 = r13.f1433c.mo4398a(r1, 0, -1, r6 - r0, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016f, code lost:
        if (r1 <= 0) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0171, code lost:
        r0 = r0 + (r5 + (r13.f1433c.getPaddingTop() + r13.f1433c.getPaddingBottom()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0180, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3739a() {
        /*
            r13 = this;
            android.support.v7.widget.bf r0 = r13.f1433c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x00c3
            android.content.Context r0 = r13.f1438i
            android.support.v7.widget.bn r5 = new android.support.v7.widget.bn
            r5.<init>(r13)
            r13.f1429G = r5
            boolean r5 = r13.f1432J
            r5 = r5 ^ r2
            android.support.v7.widget.bf r5 = r13.mo4134a(r0, r5)
            r13.f1433c = r5
            android.graphics.drawable.Drawable r5 = r13.f1423A
            if (r5 == 0) goto L_0x0026
            android.support.v7.widget.bf r5 = r13.f1433c
            android.graphics.drawable.Drawable r6 = r13.f1423A
            r5.setSelector(r6)
        L_0x0026:
            android.support.v7.widget.bf r5 = r13.f1433c
            android.widget.ListAdapter r6 = r13.f1439j
            r5.setAdapter(r6)
            android.support.v7.widget.bf r5 = r13.f1433c
            android.widget.AdapterView$OnItemClickListener r6 = r13.f1424B
            r5.setOnItemClickListener(r6)
            android.support.v7.widget.bf r5 = r13.f1433c
            r5.setFocusable(r2)
            android.support.v7.widget.bf r5 = r13.f1433c
            r5.setFocusableInTouchMode(r2)
            android.support.v7.widget.bf r5 = r13.f1433c
            android.support.v7.widget.bo r6 = new android.support.v7.widget.bo
            r6.<init>(r13)
            r5.setOnItemSelectedListener(r6)
            android.support.v7.widget.bf r5 = r13.f1433c
            android.support.v7.widget.br r6 = r13.f1427E
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r13.f1425C
            if (r5 == 0) goto L_0x005a
            android.support.v7.widget.bf r5 = r13.f1433c
            android.widget.AdapterView$OnItemSelectedListener r6 = r13.f1425C
            r5.setOnItemSelectedListener(r6)
        L_0x005a:
            android.support.v7.widget.bf r5 = r13.f1433c
            android.view.View r6 = r13.f1452w
            if (r6 == 0) goto L_0x00bc
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r3, r8)
            int r8 = r13.f1453x
            switch(r8) {
                case 0: goto L_0x0091;
                case 1: goto L_0x008a;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid hint position "
            r5.<init>(r8)
            int r8 = r13.f1453x
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            goto L_0x0097
        L_0x008a:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L_0x0097
        L_0x0091:
            r7.addView(r6)
            r7.addView(r5, r0)
        L_0x0097:
            int r0 = r13.f1441l
            if (r0 < 0) goto L_0x00a0
            int r0 = r13.f1441l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00a2
        L_0x00a0:
            r0 = 0
            r5 = 0
        L_0x00a2:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r3)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r6.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r5 = r5 + r0
            r0 = r5
            r5 = r7
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            android.widget.PopupWindow r6 = r13.f1437g
            r6.setContentView(r5)
            goto L_0x00de
        L_0x00c3:
            android.widget.PopupWindow r0 = r13.f1437g
            r0.getContentView()
            android.view.View r0 = r13.f1452w
            if (r0 == 0) goto L_0x00dd
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r0 = r0.getMeasuredHeight()
            int r6 = r5.topMargin
            int r0 = r0 + r6
            int r5 = r5.bottomMargin
            int r0 = r0 + r5
            goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            android.widget.PopupWindow r5 = r13.f1437g
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            if (r5 == 0) goto L_0x0100
            android.graphics.Rect r6 = r13.f1430H
            r5.getPadding(r6)
            android.graphics.Rect r5 = r13.f1430H
            int r5 = r5.top
            android.graphics.Rect r6 = r13.f1430H
            int r6 = r6.bottom
            int r5 = r5 + r6
            boolean r6 = r13.f1445p
            if (r6 != 0) goto L_0x0106
            android.graphics.Rect r6 = r13.f1430H
            int r6 = r6.top
            int r6 = -r6
            r13.f1443n = r6
            goto L_0x0106
        L_0x0100:
            android.graphics.Rect r5 = r13.f1430H
            r5.setEmpty()
            r5 = 0
        L_0x0106:
            android.widget.PopupWindow r6 = r13.f1437g
            int r6 = r6.getInputMethodMode()
            r7 = 2
            if (r6 != r7) goto L_0x0111
            r6 = 1
            goto L_0x0112
        L_0x0111:
            r6 = 0
        L_0x0112:
            android.view.View r7 = r13.f1455z
            int r8 = r13.f1443n
            int r6 = r13.m943a(r7, r8, r6)
            boolean r7 = r13.f1450u
            if (r7 != 0) goto L_0x0182
            int r7 = r13.f1440k
            if (r7 != r4) goto L_0x0123
            goto L_0x0182
        L_0x0123:
            int r7 = r13.f1441l
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case -2: goto L_0x0149;
                case -1: goto L_0x0132;
                default: goto L_0x012a;
            }
        L_0x012a:
            int r1 = r13.f1441l
        L_0x012c:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
        L_0x0130:
            r8 = r1
            goto L_0x0164
        L_0x0132:
            android.content.Context r1 = r13.f1438i
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            android.graphics.Rect r7 = r13.f1430H
            int r7 = r7.left
            android.graphics.Rect r9 = r13.f1430H
            int r9 = r9.right
            int r7 = r7 + r9
            int r1 = r1 - r7
            goto L_0x012c
        L_0x0149:
            android.content.Context r7 = r13.f1438i
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            android.graphics.Rect r8 = r13.f1430H
            int r8 = r8.left
            android.graphics.Rect r9 = r13.f1430H
            int r9 = r9.right
            int r8 = r8 + r9
            int r7 = r7 - r8
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            goto L_0x0130
        L_0x0164:
            android.support.v7.widget.bf r7 = r13.f1433c
            r9 = 0
            r10 = -1
            int r11 = r6 - r0
            r12 = -1
            int r1 = r7.mo4398a(r8, r9, r10, r11, r12)
            if (r1 <= 0) goto L_0x0180
            android.support.v7.widget.bf r6 = r13.f1433c
            int r6 = r6.getPaddingTop()
            android.support.v7.widget.bf r7 = r13.f1433c
            int r7 = r7.getPaddingBottom()
            int r6 = r6 + r7
            int r5 = r5 + r6
            int r0 = r0 + r5
        L_0x0180:
            int r1 = r1 + r0
            goto L_0x0184
        L_0x0182:
            int r6 = r6 + r5
            r1 = r6
        L_0x0184:
            boolean r0 = r13.mo4155q()
            android.widget.PopupWindow r5 = r13.f1437g
            int r6 = r13.f1444o
            android.support.p007v4.widget.PopupWindowCompat.setWindowLayoutType(r5, r6)
            android.widget.PopupWindow r5 = r13.f1437g
            boolean r5 = r5.isShowing()
            r6 = -2
            if (r5 == 0) goto L_0x020e
            android.view.View r5 = r13.f1455z
            boolean r5 = android.support.p007v4.view.ViewCompat.isAttachedToWindow(r5)
            if (r5 != 0) goto L_0x01a1
            return
        L_0x01a1:
            int r5 = r13.f1441l
            if (r5 != r4) goto L_0x01a7
            r5 = -1
            goto L_0x01b4
        L_0x01a7:
            int r5 = r13.f1441l
            if (r5 != r6) goto L_0x01b2
            android.view.View r5 = r13.f1455z
            int r5 = r5.getWidth()
            goto L_0x01b4
        L_0x01b2:
            int r5 = r13.f1441l
        L_0x01b4:
            int r7 = r13.f1440k
            if (r7 != r4) goto L_0x01e2
            if (r0 == 0) goto L_0x01bb
            goto L_0x01bc
        L_0x01bb:
            r1 = -1
        L_0x01bc:
            if (r0 == 0) goto L_0x01d0
            android.widget.PopupWindow r0 = r13.f1437g
            int r6 = r13.f1441l
            if (r6 != r4) goto L_0x01c6
            r6 = -1
            goto L_0x01c7
        L_0x01c6:
            r6 = 0
        L_0x01c7:
            r0.setWidth(r6)
            android.widget.PopupWindow r0 = r13.f1437g
            r0.setHeight(r3)
            goto L_0x01e9
        L_0x01d0:
            android.widget.PopupWindow r0 = r13.f1437g
            int r6 = r13.f1441l
            if (r6 != r4) goto L_0x01d8
            r6 = -1
            goto L_0x01d9
        L_0x01d8:
            r6 = 0
        L_0x01d9:
            r0.setWidth(r6)
            android.widget.PopupWindow r0 = r13.f1437g
            r0.setHeight(r4)
            goto L_0x01e9
        L_0x01e2:
            int r0 = r13.f1440k
            if (r0 == r6) goto L_0x01e9
            int r0 = r13.f1440k
            r1 = r0
        L_0x01e9:
            android.widget.PopupWindow r0 = r13.f1437g
            boolean r6 = r13.f1451v
            if (r6 != 0) goto L_0x01f4
            boolean r6 = r13.f1450u
            if (r6 != 0) goto L_0x01f4
            goto L_0x01f5
        L_0x01f4:
            r2 = 0
        L_0x01f5:
            r0.setOutsideTouchable(r2)
            android.widget.PopupWindow r6 = r13.f1437g
            android.view.View r7 = r13.f1455z
            int r8 = r13.f1442m
            int r9 = r13.f1443n
            if (r5 >= 0) goto L_0x0204
            r10 = -1
            goto L_0x0205
        L_0x0204:
            r10 = r5
        L_0x0205:
            if (r1 >= 0) goto L_0x0209
            r11 = -1
            goto L_0x020a
        L_0x0209:
            r11 = r1
        L_0x020a:
            r6.update(r7, r8, r9, r10, r11)
            return
        L_0x020e:
            int r0 = r13.f1441l
            if (r0 != r4) goto L_0x0214
            r0 = -1
            goto L_0x0221
        L_0x0214:
            int r0 = r13.f1441l
            if (r0 != r6) goto L_0x021f
            android.view.View r0 = r13.f1455z
            int r0 = r0.getWidth()
            goto L_0x0221
        L_0x021f:
            int r0 = r13.f1441l
        L_0x0221:
            int r5 = r13.f1440k
            if (r5 != r4) goto L_0x0227
            r1 = -1
            goto L_0x022d
        L_0x0227:
            int r5 = r13.f1440k
            if (r5 == r6) goto L_0x022d
            int r1 = r13.f1440k
        L_0x022d:
            android.widget.PopupWindow r5 = r13.f1437g
            r5.setWidth(r0)
            android.widget.PopupWindow r0 = r13.f1437g
            r0.setHeight(r1)
            java.lang.reflect.Method r0 = f1420a
            if (r0 == 0) goto L_0x0250
            java.lang.reflect.Method r0 = f1420a     // Catch:{ Exception -> 0x0249 }
            android.widget.PopupWindow r1 = r13.f1437g     // Catch:{ Exception -> 0x0249 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0249 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0249 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0249 }
            r0.invoke(r1, r5)     // Catch:{ Exception -> 0x0249 }
            goto L_0x0250
        L_0x0249:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.String r1 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L_0x0250:
            android.widget.PopupWindow r0 = r13.f1437g
            boolean r1 = r13.f1451v
            if (r1 != 0) goto L_0x025c
            boolean r1 = r13.f1450u
            if (r1 != 0) goto L_0x025c
            r1 = 1
            goto L_0x025d
        L_0x025c:
            r1 = 0
        L_0x025d:
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r13.f1437g
            android.support.v7.widget.bs r1 = r13.f1426D
            r0.setTouchInterceptor(r1)
            boolean r0 = r13.f1448s
            if (r0 == 0) goto L_0x0272
            android.widget.PopupWindow r0 = r13.f1437g
            boolean r1 = r13.f1447r
            android.support.p007v4.widget.PopupWindowCompat.setOverlapAnchor(r0, r1)
        L_0x0272:
            java.lang.reflect.Method r0 = f1422h
            if (r0 == 0) goto L_0x028c
            java.lang.reflect.Method r0 = f1422h     // Catch:{ Exception -> 0x0284 }
            android.widget.PopupWindow r1 = r13.f1437g     // Catch:{ Exception -> 0x0284 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0284 }
            android.graphics.Rect r5 = r13.f1431I     // Catch:{ Exception -> 0x0284 }
            r2[r3] = r5     // Catch:{ Exception -> 0x0284 }
            r0.invoke(r1, r2)     // Catch:{ Exception -> 0x0284 }
            goto L_0x028c
        L_0x0284:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
        L_0x028c:
            android.widget.PopupWindow r0 = r13.f1437g
            android.view.View r1 = r13.f1455z
            int r2 = r13.f1442m
            int r3 = r13.f1443n
            int r5 = r13.f1449t
            android.support.p007v4.widget.PopupWindowCompat.showAsDropDown(r0, r1, r2, r3, r5)
            android.support.v7.widget.bf r0 = r13.f1433c
            r0.setSelection(r4)
            boolean r0 = r13.f1432J
            if (r0 == 0) goto L_0x02aa
            android.support.v7.widget.bf r0 = r13.f1433c
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x02ad
        L_0x02aa:
            r13.mo4154p()
        L_0x02ad:
            boolean r0 = r13.f1432J
            if (r0 != 0) goto L_0x02b8
            android.os.Handler r0 = r13.f1436f
            android.support.v7.widget.bp r1 = r13.f1428F
            r0.post(r1)
        L_0x02b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.ListPopupWindow.mo3739a():void");
    }

    /* renamed from: a */
    public final void mo4135a(int i) {
        this.f1442m = i;
    }

    /* renamed from: a */
    public final void mo4136a(Rect rect) {
        this.f1431I = rect;
    }

    /* renamed from: a */
    public final void mo4137a(Drawable drawable) {
        this.f1437g.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo4138a(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1424B = onItemClickListener;
    }

    /* renamed from: a */
    public void mo4139a(ListAdapter listAdapter) {
        if (this.f1454y == null) {
            this.f1454y = new C0367bq(this);
        } else if (this.f1439j != null) {
            this.f1439j.unregisterDataSetObserver(this.f1454y);
        }
        this.f1439j = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1454y);
        }
        if (this.f1433c != null) {
            this.f1433c.setAdapter(this.f1439j);
        }
    }

    /* renamed from: a */
    public final void mo4140a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1437g.setOnDismissListener(onDismissListener);
    }

    /* renamed from: b */
    public final void mo4141b(int i) {
        this.f1443n = i;
        this.f1445p = true;
    }

    /* renamed from: b */
    public final void mo4142b(View view) {
        this.f1455z = view;
    }

    /* renamed from: c */
    public final void mo3740c() {
        this.f1437g.dismiss();
        if (this.f1452w != null) {
            ViewParent parent = this.f1452w.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1452w);
            }
        }
        this.f1437g.setContentView((View) null);
        this.f1433c = null;
        this.f1436f.removeCallbacks(this.f1435e);
    }

    /* renamed from: c */
    public final void mo4143c(int i) {
        this.f1449t = i;
    }

    /* renamed from: d */
    public final void mo4144d(int i) {
        Drawable background = this.f1437g.getBackground();
        if (background != null) {
            background.getPadding(this.f1430H);
            this.f1441l = this.f1430H.left + this.f1430H.right + i;
            return;
        }
        this.f1441l = i;
    }

    /* renamed from: d */
    public final boolean mo3741d() {
        return this.f1437g.isShowing();
    }

    /* renamed from: e */
    public final ListView mo3742e() {
        return this.f1433c;
    }

    /* renamed from: g */
    public final void mo4145g() {
        this.f1453x = 0;
    }

    /* renamed from: h */
    public final void mo4146h() {
        this.f1432J = true;
        this.f1437g.setFocusable(true);
    }

    /* renamed from: i */
    public final boolean mo4147i() {
        return this.f1432J;
    }

    /* renamed from: j */
    public final void mo4148j() {
        this.f1437g.setAnimationStyle(0);
    }

    /* renamed from: k */
    public final View mo4149k() {
        return this.f1455z;
    }

    /* renamed from: l */
    public final int mo4150l() {
        return this.f1442m;
    }

    /* renamed from: m */
    public final int mo4151m() {
        if (!this.f1445p) {
            return 0;
        }
        return this.f1443n;
    }

    /* renamed from: n */
    public final int mo4152n() {
        return this.f1441l;
    }

    /* renamed from: o */
    public final void mo4153o() {
        this.f1437g.setInputMethodMode(2);
    }

    /* renamed from: p */
    public final void mo4154p() {
        C0356bf bfVar = this.f1433c;
        if (bfVar != null) {
            bfVar.mo4399a(true);
            bfVar.requestLayout();
        }
    }

    /* renamed from: q */
    public final boolean mo4155q() {
        return this.f1437g.getInputMethodMode() == 2;
    }

    /* renamed from: r */
    public final void mo4156r() {
        this.f1448s = true;
        this.f1447r = true;
    }
}
