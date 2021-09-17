package android.support.p010v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.p */
public final class C0241p {

    /* renamed from: a */
    private final C0233h f833a;

    /* renamed from: b */
    private final int f834b;

    public C0241p(Context context) {
        this(context, C0240o.m374a(context, 0));
    }

    private C0241p(Context context, int i) {
        this.f833a = new C0233h(new ContextThemeWrapper(context, C0240o.m374a(context, i)));
        this.f834b = i;
    }

    /* renamed from: a */
    public final Context mo3315a() {
        return this.f833a.f793a;
    }

    /* renamed from: a */
    public final C0241p mo3316a(int i) {
        this.f833a.f795c = i;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3317a(DialogInterface.OnClickListener onClickListener) {
        this.f833a.f801i = this.f833a.f793a.getText(17039370);
        this.f833a.f803k = onClickListener;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3318a(DialogInterface.OnKeyListener onKeyListener) {
        this.f833a.f813u = onKeyListener;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3319a(Drawable drawable) {
        this.f833a.f796d = drawable;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3320a(View view) {
        this.f833a.f799g = view;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3321a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        this.f833a.f815w = listAdapter;
        this.f833a.f816x = onClickListener;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3322a(CharSequence charSequence) {
        this.f833a.f798f = charSequence;
        return this;
    }

    /* renamed from: a */
    public final C0241p mo3323a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f833a.f801i = charSequence;
        this.f833a.f803k = onClickListener;
        return this;
    }

    /* renamed from: b */
    public final C0241p mo3324b() {
        this.f833a.f804l = this.f833a.f793a.getText(17039360);
        this.f833a.f806n = null;
        return this;
    }

    /* renamed from: b */
    public final C0241p mo3325b(View view) {
        this.f833a.f818z = view;
        this.f833a.f817y = 0;
        this.f833a.f782E = false;
        return this;
    }

    /* renamed from: b */
    public final C0241p mo3326b(CharSequence charSequence) {
        this.f833a.f800h = charSequence;
        return this;
    }

    /* renamed from: b */
    public final C0241p mo3327b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f833a.f804l = charSequence;
        this.f833a.f806n = onClickListener;
        return this;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.widget.ListAdapter] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r4v25, types: [android.support.v7.app.j] */
    /* JADX WARNING: type inference failed for: r4v26, types: [android.support.v7.app.i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p010v7.app.C0240o mo3328c() {
        /*
            r18 = this;
            r0 = r18
            android.support.v7.app.o r1 = new android.support.v7.app.o
            android.support.v7.app.h r2 = r0.f833a
            android.content.Context r2 = r2.f793a
            int r3 = r0.f834b
            r1.<init>(r2, r3)
            android.support.v7.app.h r2 = r0.f833a
            android.support.v7.app.AlertController r10 = r1.f832a
            android.view.View r3 = r2.f799g
            if (r3 == 0) goto L_0x001b
            android.view.View r3 = r2.f799g
            r10.mo3134a((android.view.View) r3)
            goto L_0x0043
        L_0x001b:
            java.lang.CharSequence r3 = r2.f798f
            if (r3 == 0) goto L_0x0024
            java.lang.CharSequence r3 = r2.f798f
            r10.mo3136a((java.lang.CharSequence) r3)
        L_0x0024:
            android.graphics.drawable.Drawable r3 = r2.f796d
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r3 = r2.f796d
            r10.mo3133a((android.graphics.drawable.Drawable) r3)
        L_0x002d:
            int r3 = r2.f795c
            if (r3 == 0) goto L_0x0036
            int r3 = r2.f795c
            r10.mo3137b((int) r3)
        L_0x0036:
            int r3 = r2.f797e
            if (r3 == 0) goto L_0x0043
            int r3 = r2.f797e
            int r3 = r10.mo3140c((int) r3)
            r10.mo3137b((int) r3)
        L_0x0043:
            java.lang.CharSequence r3 = r2.f800h
            if (r3 == 0) goto L_0x004c
            java.lang.CharSequence r3 = r2.f800h
            r10.mo3139b((java.lang.CharSequence) r3)
        L_0x004c:
            java.lang.CharSequence r3 = r2.f801i
            if (r3 != 0) goto L_0x0054
            android.graphics.drawable.Drawable r3 = r2.f802j
            if (r3 == 0) goto L_0x0060
        L_0x0054:
            r4 = -1
            java.lang.CharSequence r5 = r2.f801i
            android.content.DialogInterface$OnClickListener r6 = r2.f803k
            r7 = 0
            android.graphics.drawable.Drawable r8 = r2.f802j
            r3 = r10
            r3.mo3132a((int) r4, (java.lang.CharSequence) r5, (android.content.DialogInterface.OnClickListener) r6, (android.os.Message) r7, (android.graphics.drawable.Drawable) r8)
        L_0x0060:
            java.lang.CharSequence r3 = r2.f804l
            if (r3 != 0) goto L_0x0068
            android.graphics.drawable.Drawable r3 = r2.f805m
            if (r3 == 0) goto L_0x0074
        L_0x0068:
            r4 = -2
            java.lang.CharSequence r5 = r2.f804l
            android.content.DialogInterface$OnClickListener r6 = r2.f806n
            r7 = 0
            android.graphics.drawable.Drawable r8 = r2.f805m
            r3 = r10
            r3.mo3132a((int) r4, (java.lang.CharSequence) r5, (android.content.DialogInterface.OnClickListener) r6, (android.os.Message) r7, (android.graphics.drawable.Drawable) r8)
        L_0x0074:
            java.lang.CharSequence r3 = r2.f807o
            if (r3 != 0) goto L_0x007c
            android.graphics.drawable.Drawable r3 = r2.f808p
            if (r3 == 0) goto L_0x0088
        L_0x007c:
            r4 = -3
            java.lang.CharSequence r5 = r2.f807o
            android.content.DialogInterface$OnClickListener r6 = r2.f809q
            r7 = 0
            android.graphics.drawable.Drawable r8 = r2.f808p
            r3 = r10
            r3.mo3132a((int) r4, (java.lang.CharSequence) r5, (android.content.DialogInterface.OnClickListener) r6, (android.os.Message) r7, (android.graphics.drawable.Drawable) r8)
        L_0x0088:
            java.lang.CharSequence[] r3 = r2.f814v
            r11 = 1
            if (r3 != 0) goto L_0x0095
            android.database.Cursor r3 = r2.f788K
            if (r3 != 0) goto L_0x0095
            android.widget.ListAdapter r3 = r2.f815w
            if (r3 == 0) goto L_0x0139
        L_0x0095:
            android.view.LayoutInflater r3 = r2.f794b
            int r4 = r10.f576l
            r5 = 0
            android.view.View r3 = r3.inflate(r4, r5)
            android.support.v7.app.AlertController$RecycleListView r3 = (android.support.p010v7.app.AlertController.RecycleListView) r3
            boolean r4 = r2.f784G
            if (r4 == 0) goto L_0x00c5
            android.database.Cursor r4 = r2.f788K
            if (r4 != 0) goto L_0x00b7
            android.support.v7.app.i r12 = new android.support.v7.app.i
            android.content.Context r6 = r2.f793a
            int r7 = r10.f577m
            java.lang.CharSequence[] r8 = r2.f814v
            r4 = r12
            r5 = r2
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0101
        L_0x00b7:
            android.support.v7.app.j r12 = new android.support.v7.app.j
            android.content.Context r6 = r2.f793a
            android.database.Cursor r7 = r2.f788K
            r4 = r12
            r5 = r2
            r8 = r3
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0101
        L_0x00c5:
            boolean r4 = r2.f785H
            if (r4 == 0) goto L_0x00cd
            int r4 = r10.f578n
        L_0x00cb:
            r14 = r4
            goto L_0x00d0
        L_0x00cd:
            int r4 = r10.f579o
            goto L_0x00cb
        L_0x00d0:
            android.database.Cursor r4 = r2.f788K
            if (r4 == 0) goto L_0x00f1
            android.widget.SimpleCursorAdapter r4 = new android.widget.SimpleCursorAdapter
            android.content.Context r13 = r2.f793a
            android.database.Cursor r15 = r2.f788K
            java.lang.String[] r5 = new java.lang.String[r11]
            java.lang.String r6 = r2.f789L
            r7 = 0
            r5[r7] = r6
            int[] r6 = new int[r11]
            r8 = 16908308(0x1020014, float:2.3877285E-38)
            r6[r7] = r8
            r12 = r4
            r16 = r5
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x0101
        L_0x00f1:
            android.widget.ListAdapter r4 = r2.f815w
            if (r4 == 0) goto L_0x00f8
            android.widget.ListAdapter r12 = r2.f815w
            goto L_0x0101
        L_0x00f8:
            android.support.v7.app.n r12 = new android.support.v7.app.n
            android.content.Context r4 = r2.f793a
            java.lang.CharSequence[] r5 = r2.f814v
            r12.<init>(r4, r14, r5)
        L_0x0101:
            r10.f574j = r12
            int r4 = r2.f786I
            r10.f575k = r4
            android.content.DialogInterface$OnClickListener r4 = r2.f816x
            if (r4 == 0) goto L_0x0114
            android.support.v7.app.k r4 = new android.support.v7.app.k
            r4.<init>(r2, r10)
        L_0x0110:
            r3.setOnItemClickListener(r4)
            goto L_0x011e
        L_0x0114:
            android.content.DialogInterface$OnMultiChoiceClickListener r4 = r2.f787J
            if (r4 == 0) goto L_0x011e
            android.support.v7.app.l r4 = new android.support.v7.app.l
            r4.<init>(r2, r3, r10)
            goto L_0x0110
        L_0x011e:
            android.widget.AdapterView$OnItemSelectedListener r4 = r2.f791N
            if (r4 == 0) goto L_0x0127
            android.widget.AdapterView$OnItemSelectedListener r4 = r2.f791N
            r3.setOnItemSelectedListener(r4)
        L_0x0127:
            boolean r4 = r2.f785H
            if (r4 == 0) goto L_0x012f
            r3.setChoiceMode(r11)
            goto L_0x0137
        L_0x012f:
            boolean r4 = r2.f784G
            if (r4 == 0) goto L_0x0137
            r4 = 2
            r3.setChoiceMode(r4)
        L_0x0137:
            r10.f566b = r3
        L_0x0139:
            android.view.View r3 = r2.f818z
            if (r3 == 0) goto L_0x0156
            boolean r3 = r2.f782E
            if (r3 == 0) goto L_0x0150
            android.view.View r4 = r2.f818z
            int r5 = r2.f778A
            int r6 = r2.f779B
            int r7 = r2.f780C
            int r8 = r2.f781D
            r3 = r10
            r3.mo3135a((android.view.View) r4, (int) r5, (int) r6, (int) r7, (int) r8)
            goto L_0x015f
        L_0x0150:
            android.view.View r2 = r2.f818z
            r10.mo3138b((android.view.View) r2)
            goto L_0x015f
        L_0x0156:
            int r3 = r2.f817y
            if (r3 == 0) goto L_0x015f
            int r2 = r2.f817y
            r10.mo3131a((int) r2)
        L_0x015f:
            android.support.v7.app.h r2 = r0.f833a
            boolean r2 = r2.f810r
            r1.setCancelable(r2)
            android.support.v7.app.h r2 = r0.f833a
            boolean r2 = r2.f810r
            if (r2 == 0) goto L_0x016f
            r1.setCanceledOnTouchOutside(r11)
        L_0x016f:
            android.support.v7.app.h r2 = r0.f833a
            android.content.DialogInterface$OnCancelListener r2 = r2.f811s
            r1.setOnCancelListener(r2)
            android.support.v7.app.h r2 = r0.f833a
            android.content.DialogInterface$OnDismissListener r2 = r2.f812t
            r1.setOnDismissListener(r2)
            android.support.v7.app.h r2 = r0.f833a
            android.content.DialogInterface$OnKeyListener r2 = r2.f813u
            if (r2 == 0) goto L_0x018a
            android.support.v7.app.h r2 = r0.f833a
            android.content.DialogInterface$OnKeyListener r2 = r2.f813u
            r1.setOnKeyListener(r2)
        L_0x018a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.C0241p.mo3328c():android.support.v7.app.o");
    }

    /* renamed from: d */
    public final C0240o mo3329d() {
        C0240o c = mo3328c();
        c.show();
        return c;
    }
}
