package android.support.p010v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.widget.AppCompatTextView;
import android.support.p010v7.widget.C0361bk;
import android.support.p010v7.widget.C0417dm;
import android.support.p010v7.widget.C0435o;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends AppCompatTextView implements C0289af, C0435o, View.OnClickListener {

    /* renamed from: a */
    MenuItemImpl f1025a;

    /* renamed from: b */
    C0311p f1026b;

    /* renamed from: c */
    C0297b f1027c;

    /* renamed from: d */
    private CharSequence f1028d;

    /* renamed from: e */
    private Drawable f1029e;

    /* renamed from: f */
    private C0361bk f1030f;

    /* renamed from: g */
    private boolean f1031g;

    /* renamed from: h */
    private boolean f1032h;

    /* renamed from: i */
    private int f1033i;

    /* renamed from: j */
    private int f1034j;

    /* renamed from: k */
    private int f1035k;

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1031g = m563f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f534v, i, 0);
        this.f1033i = obtainStyledAttributes.getDimensionPixelSize(C0197k.f535w, 0);
        obtainStyledAttributes.recycle();
        this.f1035k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1034j = -1;
        setSaveEnabled(false);
    }

    /* renamed from: f */
    private boolean m563f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    /* renamed from: g */
    private void m564g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1028d);
        if (this.f1029e != null && (!this.f1025a.mo3660i() || (!this.f1031g && !this.f1032h))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f1028d : null);
        CharSequence contentDescription = this.f1025a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z3 ? null : this.f1025a.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1025a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence = this.f1025a.getTitle();
            }
            C0417dm.m1368a(this, charSequence);
            return;
        }
        C0417dm.m1368a(this, tooltipText);
    }

    /* renamed from: a */
    public final MenuItemImpl mo3545a() {
        return this.f1025a;
    }

    /* renamed from: a */
    public final void mo3546a(MenuItemImpl menuItemImpl) {
        this.f1025a = menuItemImpl;
        Drawable icon = menuItemImpl.getIcon();
        this.f1029e = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            if (intrinsicWidth > this.f1035k) {
                float f = ((float) this.f1035k) / ((float) intrinsicWidth);
                intrinsicWidth = this.f1035k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f1035k) {
                float f2 = ((float) this.f1035k) / ((float) intrinsicHeight);
                intrinsicHeight = this.f1035k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, (Drawable) null, (Drawable) null, (Drawable) null);
        m564g();
        this.f1028d = menuItemImpl.mo3631a((C0289af) this);
        m564g();
        setId(menuItemImpl.getItemId());
        if (!menuItemImpl.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f1030f == null) {
            this.f1030f = new C0283a(this);
        }
    }

    /* renamed from: a */
    public final void mo3547a(C0297b bVar) {
        this.f1027c = bVar;
    }

    /* renamed from: a */
    public final void mo3548a(C0311p pVar) {
        this.f1026b = pVar;
    }

    /* renamed from: b */
    public final boolean mo3549b() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo3550c() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: d */
    public final boolean mo3551d() {
        return mo3550c() && this.f1025a.getIcon() == null;
    }

    /* renamed from: e */
    public final boolean mo3552e() {
        return mo3550c();
    }

    public void onClick(View view) {
        if (this.f1026b != null) {
            this.f1026b.mo3560a(this.f1025a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1031g = m563f();
        m564g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean c = mo3550c();
        if (c && this.f1034j >= 0) {
            super.setPadding(this.f1034j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1033i) : this.f1033i;
        if (mode != 1073741824 && this.f1033i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!c && this.f1029e != null) {
            super.setPadding((getMeasuredWidth() - this.f1029e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1025a.hasSubMenu() || this.f1030f == null || !this.f1030f.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1034j = i;
        super.setPadding(i, i2, i3, i4);
    }
}
