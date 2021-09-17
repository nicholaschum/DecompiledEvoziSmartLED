package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.support.p004b.C0054d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.design.widget.e */
public final class C0060e extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    CoordinatorLayout.Behavior f150a;

    /* renamed from: b */
    boolean f151b = false;

    /* renamed from: c */
    public int f152c = 0;

    /* renamed from: d */
    public int f153d = 0;

    /* renamed from: e */
    public int f154e = -1;

    /* renamed from: f */
    int f155f = -1;

    /* renamed from: g */
    public int f156g = 0;

    /* renamed from: h */
    public int f157h = 0;

    /* renamed from: i */
    int f158i;

    /* renamed from: j */
    int f159j;

    /* renamed from: k */
    View f160k;

    /* renamed from: l */
    View f161l;

    /* renamed from: m */
    final Rect f162m = new Rect();

    /* renamed from: n */
    Object f163n;

    /* renamed from: o */
    private boolean f164o;

    /* renamed from: p */
    private boolean f165p;

    /* renamed from: q */
    private boolean f166q;

    /* renamed from: r */
    private boolean f167r;

    public C0060e() {
        super(-2, -2);
    }

    C0060e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0054d.f111e);
        this.f152c = obtainStyledAttributes.getInteger(C0054d.f112f, 0);
        this.f155f = obtainStyledAttributes.getResourceId(C0054d.f113g, -1);
        this.f153d = obtainStyledAttributes.getInteger(C0054d.f114h, 0);
        this.f154e = obtainStyledAttributes.getInteger(C0054d.f118l, -1);
        this.f156g = obtainStyledAttributes.getInt(C0054d.f117k, 0);
        this.f157h = obtainStyledAttributes.getInt(C0054d.f116j, 0);
        this.f151b = obtainStyledAttributes.hasValue(C0054d.f115i);
        if (this.f151b) {
            this.f150a = CoordinatorLayout.m94a(context, attributeSet, obtainStyledAttributes.getString(C0054d.f115i));
        }
        obtainStyledAttributes.recycle();
    }

    public C0060e(C0060e eVar) {
        super(eVar);
    }

    public C0060e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C0060e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo128a(int i) {
        switch (i) {
            case 0:
                this.f165p = false;
                return;
            case 1:
                this.f166q = false;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo129a(CoordinatorLayout.Behavior behavior) {
        if (this.f150a != behavior) {
            this.f150a = behavior;
            this.f163n = null;
            this.f151b = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo130a() {
        if (this.f150a == null) {
            this.f164o = false;
        }
        return this.f164o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo131b() {
        if (this.f164o) {
            return true;
        }
        boolean z = this.f164o | false;
        this.f164o = z;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo132b(int i) {
        switch (i) {
            case 0:
                return this.f165p;
            case 1:
                return this.f166q;
            default:
                return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo133c() {
        this.f164o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo134d() {
        this.f167r = false;
    }
}
