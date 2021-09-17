package android.support.p010v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.p007v4.provider.FontsContractCompat;
import android.support.p007v4.widget.NestedScrollView;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* renamed from: android.support.v7.app.AlertController */
final class AlertController {

    /* renamed from: A */
    private int f546A;

    /* renamed from: B */
    private boolean f547B = false;

    /* renamed from: C */
    private CharSequence f548C;

    /* renamed from: D */
    private Drawable f549D;

    /* renamed from: E */
    private CharSequence f550E;

    /* renamed from: F */
    private Drawable f551F;

    /* renamed from: G */
    private CharSequence f552G;

    /* renamed from: H */
    private Drawable f553H;

    /* renamed from: I */
    private int f554I = 0;

    /* renamed from: J */
    private Drawable f555J;

    /* renamed from: K */
    private ImageView f556K;

    /* renamed from: L */
    private TextView f557L;

    /* renamed from: M */
    private TextView f558M;

    /* renamed from: N */
    private View f559N;

    /* renamed from: O */
    private int f560O;

    /* renamed from: P */
    private int f561P;

    /* renamed from: Q */
    private boolean f562Q;

    /* renamed from: R */
    private int f563R = 0;

    /* renamed from: S */
    private final View.OnClickListener f564S = new C0228c(this);

    /* renamed from: a */
    final C0209ak f565a;

    /* renamed from: b */
    ListView f566b;

    /* renamed from: c */
    Button f567c;

    /* renamed from: d */
    Message f568d;

    /* renamed from: e */
    Button f569e;

    /* renamed from: f */
    Message f570f;

    /* renamed from: g */
    Button f571g;

    /* renamed from: h */
    Message f572h;

    /* renamed from: i */
    NestedScrollView f573i;

    /* renamed from: j */
    ListAdapter f574j;

    /* renamed from: k */
    int f575k = -1;

    /* renamed from: l */
    int f576l;

    /* renamed from: m */
    int f577m;

    /* renamed from: n */
    int f578n;

    /* renamed from: o */
    int f579o;

    /* renamed from: p */
    Handler f580p;

    /* renamed from: q */
    private final Context f581q;

    /* renamed from: r */
    private final Window f582r;

    /* renamed from: s */
    private final int f583s;

    /* renamed from: t */
    private CharSequence f584t;

    /* renamed from: u */
    private CharSequence f585u;

    /* renamed from: v */
    private View f586v;

    /* renamed from: w */
    private int f587w;

    /* renamed from: x */
    private int f588x;

    /* renamed from: y */
    private int f589y;

    /* renamed from: z */
    private int f590z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f591a;

        /* renamed from: b */
        private final int f592b;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f448cm);
            this.f592b = obtainStyledAttributes.getDimensionPixelOffset(C0197k.f449cn, -1);
            this.f591a = obtainStyledAttributes.getDimensionPixelOffset(C0197k.f450co, -1);
        }

        /* renamed from: a */
        public final void mo3141a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f591a, getPaddingRight(), z2 ? getPaddingBottom() : this.f592b);
            }
        }
    }

    public AlertController(Context context, C0209ak akVar, Window window) {
        this.f581q = context;
        this.f565a = akVar;
        this.f582r = window;
        this.f580p = new C0238m(akVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0197k.f284H, C0188b.alertDialogStyle, 0);
        this.f560O = obtainStyledAttributes.getResourceId(C0197k.f285I, 0);
        this.f561P = obtainStyledAttributes.getResourceId(C0197k.f287K, 0);
        this.f576l = obtainStyledAttributes.getResourceId(C0197k.f289M, 0);
        this.f577m = obtainStyledAttributes.getResourceId(C0197k.f290N, 0);
        this.f578n = obtainStyledAttributes.getResourceId(C0197k.f292P, 0);
        this.f579o = obtainStyledAttributes.getResourceId(C0197k.f288L, 0);
        this.f562Q = obtainStyledAttributes.getBoolean(C0197k.f291O, true);
        this.f583s = obtainStyledAttributes.getDimensionPixelSize(C0197k.f286J, 0);
        obtainStyledAttributes.recycle();
        akVar.mo3259a();
    }

    /* renamed from: a */
    private static ViewGroup m188a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m189a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private static void m190a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private static boolean m191c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m191c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0305, code lost:
        if (r2 != null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0310, code lost:
        if (r2 != null) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0353, code lost:
        if (r5 != null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a8, code lost:
        if (r5 != null) goto L_0x0355;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3130a() {
        /*
            r14 = this;
            int r0 = r14.f561P
            r1 = 1
            if (r0 == 0) goto L_0x000c
            int r0 = r14.f563R
            if (r0 != r1) goto L_0x000c
            int r0 = r14.f561P
            goto L_0x000e
        L_0x000c:
            int r0 = r14.f560O
        L_0x000e:
            android.support.v7.app.ak r2 = r14.f565a
            r2.setContentView((int) r0)
            android.view.Window r0 = r14.f582r
            int r2 = android.support.p010v7.p011a.C0193g.parentPanel
            android.view.View r0 = r0.findViewById(r2)
            int r2 = android.support.p010v7.p011a.C0193g.topPanel
            android.view.View r2 = r0.findViewById(r2)
            int r3 = android.support.p010v7.p011a.C0193g.contentPanel
            android.view.View r3 = r0.findViewById(r3)
            int r4 = android.support.p010v7.p011a.C0193g.buttonPanel
            android.view.View r4 = r0.findViewById(r4)
            int r5 = android.support.p010v7.p011a.C0193g.customPanel
            android.view.View r0 = r0.findViewById(r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r14.f586v
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x003e
            android.view.View r5 = r14.f586v
            goto L_0x0050
        L_0x003e:
            int r5 = r14.f587w
            if (r5 == 0) goto L_0x004f
            android.content.Context r5 = r14.f581q
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r8 = r14.f587w
            android.view.View r5 = r5.inflate(r8, r0, r7)
            goto L_0x0050
        L_0x004f:
            r5 = r6
        L_0x0050:
            if (r5 == 0) goto L_0x0054
            r8 = 1
            goto L_0x0055
        L_0x0054:
            r8 = 0
        L_0x0055:
            if (r8 == 0) goto L_0x005d
            boolean r9 = m191c((android.view.View) r5)
            if (r9 != 0) goto L_0x0064
        L_0x005d:
            android.view.Window r9 = r14.f582r
            r10 = 131072(0x20000, float:1.83671E-40)
            r9.setFlags(r10, r10)
        L_0x0064:
            r9 = -1
            r10 = 8
            if (r8 == 0) goto L_0x0098
            android.view.Window r8 = r14.f582r
            int r11 = android.support.p010v7.p011a.C0193g.custom
            android.view.View r8 = r8.findViewById(r11)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r11.<init>(r9, r9)
            r8.addView(r5, r11)
            boolean r5 = r14.f547B
            if (r5 == 0) goto L_0x008a
            int r5 = r14.f588x
            int r11 = r14.f589y
            int r12 = r14.f590z
            int r13 = r14.f546A
            r8.setPadding(r5, r11, r12, r13)
        L_0x008a:
            android.widget.ListView r5 = r14.f566b
            if (r5 == 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$LayoutParams r5 = (android.support.p010v7.widget.LinearLayoutCompat.LayoutParams) r5
            r8 = 0
            r5.f1418g = r8
            goto L_0x009b
        L_0x0098:
            r0.setVisibility(r10)
        L_0x009b:
            int r5 = android.support.p010v7.p011a.C0193g.topPanel
            android.view.View r5 = r0.findViewById(r5)
            int r8 = android.support.p010v7.p011a.C0193g.contentPanel
            android.view.View r8 = r0.findViewById(r8)
            int r11 = android.support.p010v7.p011a.C0193g.buttonPanel
            android.view.View r11 = r0.findViewById(r11)
            android.view.ViewGroup r2 = m188a(r5, r2)
            android.view.ViewGroup r3 = m188a(r8, r3)
            android.view.ViewGroup r4 = m188a(r11, r4)
            android.view.Window r5 = r14.f582r
            int r8 = android.support.p010v7.p011a.C0193g.scrollView
            android.view.View r5 = r5.findViewById(r8)
            android.support.v4.widget.NestedScrollView r5 = (android.support.p007v4.widget.NestedScrollView) r5
            r14.f573i = r5
            android.support.v4.widget.NestedScrollView r5 = r14.f573i
            r5.setFocusable(r7)
            android.support.v4.widget.NestedScrollView r5 = r14.f573i
            r5.setNestedScrollingEnabled(r7)
            r5 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r14.f558M = r5
            android.widget.TextView r5 = r14.f558M
            if (r5 == 0) goto L_0x0119
            java.lang.CharSequence r5 = r14.f585u
            if (r5 == 0) goto L_0x00ea
            android.widget.TextView r5 = r14.f558M
            java.lang.CharSequence r8 = r14.f585u
            r5.setText(r8)
            goto L_0x0119
        L_0x00ea:
            android.widget.TextView r5 = r14.f558M
            r5.setVisibility(r10)
            android.support.v4.widget.NestedScrollView r5 = r14.f573i
            android.widget.TextView r8 = r14.f558M
            r5.removeView(r8)
            android.widget.ListView r5 = r14.f566b
            if (r5 == 0) goto L_0x0116
            android.support.v4.widget.NestedScrollView r5 = r14.f573i
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.support.v4.widget.NestedScrollView r8 = r14.f573i
            int r8 = r5.indexOfChild(r8)
            r5.removeViewAt(r8)
            android.widget.ListView r11 = r14.f566b
            android.view.ViewGroup$LayoutParams r12 = new android.view.ViewGroup$LayoutParams
            r12.<init>(r9, r9)
            r5.addView(r11, r8, r12)
            goto L_0x0119
        L_0x0116:
            r3.setVisibility(r10)
        L_0x0119:
            r5 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.Button r5 = (android.widget.Button) r5
            r14.f567c = r5
            android.widget.Button r5 = r14.f567c
            android.view.View$OnClickListener r8 = r14.f564S
            r5.setOnClickListener(r8)
            java.lang.CharSequence r5 = r14.f548C
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x013e
            android.graphics.drawable.Drawable r5 = r14.f549D
            if (r5 != 0) goto L_0x013e
            android.widget.Button r5 = r14.f567c
            r5.setVisibility(r10)
            r5 = 0
            goto L_0x015f
        L_0x013e:
            android.widget.Button r5 = r14.f567c
            java.lang.CharSequence r8 = r14.f548C
            r5.setText(r8)
            android.graphics.drawable.Drawable r5 = r14.f549D
            if (r5 == 0) goto L_0x0159
            android.graphics.drawable.Drawable r5 = r14.f549D
            int r8 = r14.f583s
            int r11 = r14.f583s
            r5.setBounds(r7, r7, r8, r11)
            android.widget.Button r5 = r14.f567c
            android.graphics.drawable.Drawable r8 = r14.f549D
            r5.setCompoundDrawables(r8, r6, r6, r6)
        L_0x0159:
            android.widget.Button r5 = r14.f567c
            r5.setVisibility(r7)
            r5 = 1
        L_0x015f:
            r8 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r14.f569e = r8
            android.widget.Button r8 = r14.f569e
            android.view.View$OnClickListener r11 = r14.f564S
            r8.setOnClickListener(r11)
            java.lang.CharSequence r8 = r14.f550E
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0183
            android.graphics.drawable.Drawable r8 = r14.f551F
            if (r8 != 0) goto L_0x0183
            android.widget.Button r8 = r14.f569e
            r8.setVisibility(r10)
            goto L_0x01a5
        L_0x0183:
            android.widget.Button r8 = r14.f569e
            java.lang.CharSequence r11 = r14.f550E
            r8.setText(r11)
            android.graphics.drawable.Drawable r8 = r14.f551F
            if (r8 == 0) goto L_0x019e
            android.graphics.drawable.Drawable r8 = r14.f551F
            int r11 = r14.f583s
            int r12 = r14.f583s
            r8.setBounds(r7, r7, r11, r12)
            android.widget.Button r8 = r14.f569e
            android.graphics.drawable.Drawable r11 = r14.f551F
            r8.setCompoundDrawables(r11, r6, r6, r6)
        L_0x019e:
            android.widget.Button r8 = r14.f569e
            r8.setVisibility(r7)
            r5 = r5 | 2
        L_0x01a5:
            r8 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.Button r8 = (android.widget.Button) r8
            r14.f571g = r8
            android.widget.Button r8 = r14.f571g
            android.view.View$OnClickListener r11 = r14.f564S
            r8.setOnClickListener(r11)
            java.lang.CharSequence r8 = r14.f552G
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x01c9
            android.graphics.drawable.Drawable r8 = r14.f553H
            if (r8 != 0) goto L_0x01c9
            android.widget.Button r8 = r14.f571g
            r8.setVisibility(r10)
            goto L_0x01eb
        L_0x01c9:
            android.widget.Button r8 = r14.f571g
            java.lang.CharSequence r11 = r14.f552G
            r8.setText(r11)
            android.graphics.drawable.Drawable r8 = r14.f549D
            if (r8 == 0) goto L_0x01e4
            android.graphics.drawable.Drawable r8 = r14.f549D
            int r11 = r14.f583s
            int r12 = r14.f583s
            r8.setBounds(r7, r7, r11, r12)
            android.widget.Button r8 = r14.f567c
            android.graphics.drawable.Drawable r11 = r14.f549D
            r8.setCompoundDrawables(r11, r6, r6, r6)
        L_0x01e4:
            android.widget.Button r8 = r14.f571g
            r8.setVisibility(r7)
            r5 = r5 | 4
        L_0x01eb:
            android.content.Context r8 = r14.f581q
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            int r12 = android.support.p010v7.p011a.C0188b.alertDialogCenterButtons
            r8.resolveAttribute(r12, r11, r1)
            int r8 = r11.data
            if (r8 == 0) goto L_0x0201
            r8 = 1
            goto L_0x0202
        L_0x0201:
            r8 = 0
        L_0x0202:
            r11 = 2
            if (r8 == 0) goto L_0x0218
            if (r5 != r1) goto L_0x020d
            android.widget.Button r8 = r14.f567c
        L_0x0209:
            m190a((android.widget.Button) r8)
            goto L_0x0218
        L_0x020d:
            if (r5 != r11) goto L_0x0212
            android.widget.Button r8 = r14.f569e
            goto L_0x0209
        L_0x0212:
            r8 = 4
            if (r5 != r8) goto L_0x0218
            android.widget.Button r8 = r14.f571g
            goto L_0x0209
        L_0x0218:
            if (r5 == 0) goto L_0x021c
            r5 = 1
            goto L_0x021d
        L_0x021c:
            r5 = 0
        L_0x021d:
            if (r5 != 0) goto L_0x0222
            r4.setVisibility(r10)
        L_0x0222:
            android.view.View r5 = r14.f559N
            if (r5 == 0) goto L_0x023e
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r8 = -2
            r5.<init>(r9, r8)
            android.view.View r8 = r14.f559N
            r2.addView(r8, r7, r5)
            android.view.Window r5 = r14.f582r
            int r8 = android.support.p010v7.p011a.C0193g.title_template
            android.view.View r5 = r5.findViewById(r8)
            r5.setVisibility(r10)
            goto L_0x02b9
        L_0x023e:
            android.view.Window r5 = r14.f582r
            r8 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r5 = r5.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r14.f556K = r5
            java.lang.CharSequence r5 = r14.f584t
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x02a6
            boolean r5 = r14.f562Q
            if (r5 == 0) goto L_0x02a6
            android.view.Window r5 = r14.f582r
            int r8 = android.support.p010v7.p011a.C0193g.alertTitle
            android.view.View r5 = r5.findViewById(r8)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r14.f557L = r5
            android.widget.TextView r5 = r14.f557L
            java.lang.CharSequence r8 = r14.f584t
            r5.setText(r8)
            int r5 = r14.f554I
            if (r5 == 0) goto L_0x0277
            android.widget.ImageView r5 = r14.f556K
            int r8 = r14.f554I
            r5.setImageResource(r8)
            goto L_0x02b9
        L_0x0277:
            android.graphics.drawable.Drawable r5 = r14.f555J
            if (r5 == 0) goto L_0x0283
            android.widget.ImageView r5 = r14.f556K
            android.graphics.drawable.Drawable r8 = r14.f555J
            r5.setImageDrawable(r8)
            goto L_0x02b9
        L_0x0283:
            android.widget.TextView r5 = r14.f557L
            android.widget.ImageView r8 = r14.f556K
            int r8 = r8.getPaddingLeft()
            android.widget.ImageView r9 = r14.f556K
            int r9 = r9.getPaddingTop()
            android.widget.ImageView r12 = r14.f556K
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r14.f556K
            int r13 = r13.getPaddingBottom()
            r5.setPadding(r8, r9, r12, r13)
            android.widget.ImageView r5 = r14.f556K
            r5.setVisibility(r10)
            goto L_0x02b9
        L_0x02a6:
            android.view.Window r5 = r14.f582r
            int r8 = android.support.p010v7.p011a.C0193g.title_template
            android.view.View r5 = r5.findViewById(r8)
            r5.setVisibility(r10)
            android.widget.ImageView r5 = r14.f556K
            r5.setVisibility(r10)
            r2.setVisibility(r10)
        L_0x02b9:
            if (r0 == 0) goto L_0x02c3
            int r0 = r0.getVisibility()
            if (r0 == r10) goto L_0x02c3
            r0 = 1
            goto L_0x02c4
        L_0x02c3:
            r0 = 0
        L_0x02c4:
            if (r2 == 0) goto L_0x02ce
            int r5 = r2.getVisibility()
            if (r5 == r10) goto L_0x02ce
            r5 = 1
            goto L_0x02cf
        L_0x02ce:
            r5 = 0
        L_0x02cf:
            if (r4 == 0) goto L_0x02d9
            int r4 = r4.getVisibility()
            if (r4 == r10) goto L_0x02d9
            r4 = 1
            goto L_0x02da
        L_0x02d9:
            r4 = 0
        L_0x02da:
            if (r4 != 0) goto L_0x02e9
            if (r3 == 0) goto L_0x02e9
            int r8 = android.support.p010v7.p011a.C0193g.textSpacerNoButtons
            android.view.View r8 = r3.findViewById(r8)
            if (r8 == 0) goto L_0x02e9
            r8.setVisibility(r7)
        L_0x02e9:
            if (r5 == 0) goto L_0x0308
            android.support.v4.widget.NestedScrollView r8 = r14.f573i
            if (r8 == 0) goto L_0x02f4
            android.support.v4.widget.NestedScrollView r8 = r14.f573i
            r8.setClipToPadding(r1)
        L_0x02f4:
            java.lang.CharSequence r8 = r14.f585u
            if (r8 != 0) goto L_0x02ff
            android.widget.ListView r8 = r14.f566b
            if (r8 == 0) goto L_0x02fd
            goto L_0x02ff
        L_0x02fd:
            r2 = r6
            goto L_0x0305
        L_0x02ff:
            int r8 = android.support.p010v7.p011a.C0193g.titleDividerNoCustom
            android.view.View r2 = r2.findViewById(r8)
        L_0x0305:
            if (r2 == 0) goto L_0x0315
            goto L_0x0312
        L_0x0308:
            if (r3 == 0) goto L_0x0315
            int r2 = android.support.p010v7.p011a.C0193g.textSpacerNoTitle
            android.view.View r2 = r3.findViewById(r2)
            if (r2 == 0) goto L_0x0315
        L_0x0312:
            r2.setVisibility(r7)
        L_0x0315:
            android.widget.ListView r2 = r14.f566b
            boolean r2 = r2 instanceof android.support.p010v7.app.AlertController.RecycleListView
            if (r2 == 0) goto L_0x0322
            android.widget.ListView r2 = r14.f566b
            android.support.v7.app.AlertController$RecycleListView r2 = (android.support.p010v7.app.AlertController.RecycleListView) r2
            r2.mo3141a(r5, r4)
        L_0x0322:
            if (r0 != 0) goto L_0x03ab
            android.widget.ListView r0 = r14.f566b
            if (r0 == 0) goto L_0x032b
            android.widget.ListView r0 = r14.f566b
            goto L_0x032d
        L_0x032b:
            android.support.v4.widget.NestedScrollView r0 = r14.f573i
        L_0x032d:
            if (r0 == 0) goto L_0x03ab
            if (r4 == 0) goto L_0x0332
            r7 = 2
        L_0x0332:
            r2 = r5 | r7
            android.view.Window r4 = r14.f582r
            int r5 = android.support.p010v7.p011a.C0193g.scrollIndicatorUp
            android.view.View r4 = r4.findViewById(r5)
            android.view.Window r5 = r14.f582r
            int r7 = android.support.p010v7.p011a.C0193g.scrollIndicatorDown
            android.view.View r5 = r5.findViewById(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 23
            if (r7 < r8) goto L_0x0359
            r6 = 3
            android.support.p007v4.view.ViewCompat.setScrollIndicators(r0, r2, r6)
            if (r4 == 0) goto L_0x0353
            r3.removeView(r4)
        L_0x0353:
            if (r5 == 0) goto L_0x03ab
        L_0x0355:
            r3.removeView(r5)
            goto L_0x03ab
        L_0x0359:
            if (r4 == 0) goto L_0x0363
            r0 = r2 & 1
            if (r0 != 0) goto L_0x0363
            r3.removeView(r4)
            r4 = r6
        L_0x0363:
            if (r5 == 0) goto L_0x036d
            r0 = r2 & 2
            if (r0 != 0) goto L_0x036d
            r3.removeView(r5)
            r5 = r6
        L_0x036d:
            if (r4 != 0) goto L_0x0371
            if (r5 == 0) goto L_0x03ab
        L_0x0371:
            java.lang.CharSequence r0 = r14.f585u
            if (r0 == 0) goto L_0x038a
            android.support.v4.widget.NestedScrollView r0 = r14.f573i
            android.support.v7.app.d r2 = new android.support.v7.app.d
            r2.<init>(r14, r4, r5)
            r0.setOnScrollChangeListener(r2)
            android.support.v4.widget.NestedScrollView r0 = r14.f573i
            android.support.v7.app.e r2 = new android.support.v7.app.e
            r2.<init>(r14, r4, r5)
            r0.post(r2)
            goto L_0x03ab
        L_0x038a:
            android.widget.ListView r0 = r14.f566b
            if (r0 == 0) goto L_0x03a3
            android.widget.ListView r0 = r14.f566b
            android.support.v7.app.f r2 = new android.support.v7.app.f
            r2.<init>(r14, r4, r5)
            r0.setOnScrollListener(r2)
            android.widget.ListView r0 = r14.f566b
            android.support.v7.app.g r2 = new android.support.v7.app.g
            r2.<init>(r14, r4, r5)
            r0.post(r2)
            goto L_0x03ab
        L_0x03a3:
            if (r4 == 0) goto L_0x03a8
            r3.removeView(r4)
        L_0x03a8:
            if (r5 == 0) goto L_0x03ab
            goto L_0x0355
        L_0x03ab:
            android.widget.ListView r0 = r14.f566b
            if (r0 == 0) goto L_0x03c2
            android.widget.ListAdapter r2 = r14.f574j
            if (r2 == 0) goto L_0x03c2
            android.widget.ListAdapter r2 = r14.f574j
            r0.setAdapter(r2)
            int r2 = r14.f575k
            if (r2 < 0) goto L_0x03c2
            r0.setItemChecked(r2, r1)
            r0.setSelection(r2)
        L_0x03c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.AlertController.mo3130a():void");
    }

    /* renamed from: a */
    public final void mo3131a(int i) {
        this.f586v = null;
        this.f587w = i;
        this.f547B = false;
    }

    /* renamed from: a */
    public final void mo3132a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f580p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
                this.f552G = charSequence;
                this.f572h = message;
                this.f553H = drawable;
                return;
            case -2:
                this.f550E = charSequence;
                this.f570f = message;
                this.f551F = drawable;
                return;
            case -1:
                this.f548C = charSequence;
                this.f568d = message;
                this.f549D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public final void mo3133a(Drawable drawable) {
        this.f555J = drawable;
        this.f554I = 0;
        if (this.f556K == null) {
            return;
        }
        if (drawable != null) {
            this.f556K.setVisibility(0);
            this.f556K.setImageDrawable(drawable);
            return;
        }
        this.f556K.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo3134a(View view) {
        this.f559N = view;
    }

    /* renamed from: a */
    public final void mo3135a(View view, int i, int i2, int i3, int i4) {
        this.f586v = view;
        this.f587w = 0;
        this.f547B = true;
        this.f588x = i;
        this.f589y = i2;
        this.f590z = i3;
        this.f546A = i4;
    }

    /* renamed from: a */
    public final void mo3136a(CharSequence charSequence) {
        this.f584t = charSequence;
        if (this.f557L != null) {
            this.f557L.setText(charSequence);
        }
    }

    /* renamed from: b */
    public final void mo3137b(int i) {
        this.f555J = null;
        this.f554I = i;
        if (this.f556K == null) {
            return;
        }
        if (i != 0) {
            this.f556K.setVisibility(0);
            this.f556K.setImageResource(this.f554I);
            return;
        }
        this.f556K.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo3138b(View view) {
        this.f586v = view;
        this.f587w = 0;
        this.f547B = false;
    }

    /* renamed from: b */
    public final void mo3139b(CharSequence charSequence) {
        this.f585u = charSequence;
        if (this.f558M != null) {
            this.f558M.setText(charSequence);
        }
    }

    /* renamed from: c */
    public final int mo3140c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f581q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }
}
