package android.support.p010v7.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.ActionProvider;
import android.support.p010v7.p011a.C0191e;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0195i;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.ActivityChooserView */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0328ae f1336a;

    /* renamed from: b */
    final FrameLayout f1337b;

    /* renamed from: c */
    final FrameLayout f1338c;

    /* renamed from: d */
    ActionProvider f1339d;

    /* renamed from: e */
    final DataSetObserver f1340e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f1341f;

    /* renamed from: g */
    boolean f1342g;

    /* renamed from: h */
    int f1343h;

    /* renamed from: i */
    private final C0329af f1344i;

    /* renamed from: j */
    private final View f1345j;

    /* renamed from: k */
    private final Drawable f1346k;

    /* renamed from: l */
    private final ImageView f1347l;

    /* renamed from: m */
    private final ImageView f1348m;

    /* renamed from: n */
    private final int f1349n;

    /* renamed from: o */
    private final ViewTreeObserver.OnGlobalLayoutListener f1350o;

    /* renamed from: p */
    private ListPopupWindow f1351p;

    /* renamed from: q */
    private boolean f1352q;

    /* renamed from: r */
    private int f1353r;

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    public class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f1354a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0407dc a = C0407dc.m1307a(context, attributeSet, f1354a);
            setBackgroundDrawable(a.mo4545a(0));
            a.mo4546a();
        }
    }

    public ActivityChooserView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1340e = new C0446z(this);
        this.f1350o = new C0324aa(this);
        this.f1343h = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f281E, i, 0);
        this.f1343h = obtainStyledAttributes.getInt(C0197k.f283G, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0197k.f282F);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0194h.abc_activity_chooser_view, this, true);
        this.f1344i = new C0329af(this);
        this.f1345j = findViewById(C0193g.activity_chooser_view_content);
        this.f1346k = this.f1345j.getBackground();
        this.f1338c = (FrameLayout) findViewById(C0193g.default_activity_button);
        this.f1338c.setOnClickListener(this.f1344i);
        this.f1338c.setOnLongClickListener(this.f1344i);
        this.f1348m = (ImageView) this.f1338c.findViewById(C0193g.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0193g.expand_activities_button);
        frameLayout.setOnClickListener(this.f1344i);
        frameLayout.setAccessibilityDelegate(new C0325ab(this));
        frameLayout.setOnTouchListener(new C0326ac(this, frameLayout));
        this.f1337b = frameLayout;
        this.f1347l = (ImageView) frameLayout.findViewById(C0193g.image);
        this.f1347l.setImageDrawable(drawable);
        this.f1336a = new C0328ae(this);
        this.f1336a.registerDataSetObserver(new C0327ad(this));
        Resources resources = context.getResources();
        this.f1349n = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0191e.abc_config_prefDialogWidth));
    }

    /* renamed from: a */
    public final void mo3990a(int i) {
        this.f1347l.setContentDescription(getContext().getString(i));
    }

    /* renamed from: a */
    public final void mo3991a(Drawable drawable) {
        this.f1347l.setImageDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo3992a(C0439s sVar) {
        this.f1336a.mo4269a(sVar);
        if (mo3998d().mo3741d()) {
            mo3995b();
            mo3993a();
        }
    }

    /* renamed from: a */
    public final boolean mo3993a() {
        if (mo3998d().mo3741d() || !this.f1352q) {
            return false;
        }
        this.f1342g = false;
        mo3994b(this.f1343h);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3994b(int i) {
        C0328ae aeVar;
        if (this.f1336a.mo4275e() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1350o);
            boolean z = this.f1338c.getVisibility() == 0;
            int c = this.f1336a.mo4273c();
            if (i == Integer.MAX_VALUE || c <= i + (z ? 1 : 0)) {
                this.f1336a.mo4270a(false);
                aeVar = this.f1336a;
            } else {
                this.f1336a.mo4270a(true);
                aeVar = this.f1336a;
                i--;
            }
            aeVar.mo4268a(i);
            ListPopupWindow d = mo3998d();
            if (!d.mo3741d()) {
                if (this.f1342g || !z) {
                    this.f1336a.mo4271a(true, z);
                } else {
                    this.f1336a.mo4271a(false, false);
                }
                d.mo4144d(Math.min(this.f1336a.mo4267a(), this.f1349n));
                d.mo3739a();
                if (this.f1339d != null) {
                    this.f1339d.subUiVisibilityChanged(true);
                }
                d.f1433c.setContentDescription(getContext().getString(C0195i.abc_activitychooserview_choose_application));
                d.f1433c.setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    /* renamed from: b */
    public final boolean mo3995b() {
        if (!mo3998d().mo3741d()) {
            return true;
        }
        mo3998d().mo3740c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1350o);
        return true;
    }

    /* renamed from: c */
    public final void mo3996c(int i) {
        this.f1353r = i;
    }

    /* renamed from: c */
    public final boolean mo3997c() {
        return mo3998d().mo3741d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final ListPopupWindow mo3998d() {
        if (this.f1351p == null) {
            this.f1351p = new ListPopupWindow(getContext());
            this.f1351p.mo4139a((ListAdapter) this.f1336a);
            this.f1351p.mo4142b((View) this);
            this.f1351p.mo4146h();
            this.f1351p.mo4138a((AdapterView.OnItemClickListener) this.f1344i);
            this.f1351p.mo4140a((PopupWindow.OnDismissListener) this.f1344i);
        }
        return this.f1351p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3999e() {
        View view;
        Drawable drawable;
        if (this.f1336a.getCount() > 0) {
            this.f1337b.setEnabled(true);
        } else {
            this.f1337b.setEnabled(false);
        }
        int c = this.f1336a.mo4273c();
        int d = this.f1336a.mo4274d();
        if (c == 1 || (c > 1 && d > 0)) {
            this.f1338c.setVisibility(0);
            ResolveInfo b = this.f1336a.mo4272b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1348m.setImageDrawable(b.loadIcon(packageManager));
            if (this.f1353r != 0) {
                CharSequence loadLabel = b.loadLabel(packageManager);
                this.f1338c.setContentDescription(getContext().getString(this.f1353r, new Object[]{loadLabel}));
            }
        } else {
            this.f1338c.setVisibility(8);
        }
        if (this.f1338c.getVisibility() == 0) {
            view = this.f1345j;
            drawable = this.f1346k;
        } else {
            view = this.f1345j;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0439s e = this.f1336a.mo4275e();
        if (e != null) {
            e.registerObserver(this.f1340e);
        }
        this.f1352q = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0439s e = this.f1336a.mo4275e();
        if (e != null) {
            e.unregisterObserver(this.f1340e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1350o);
        }
        if (mo3998d().mo3741d()) {
            mo3995b();
        }
        this.f1352q = false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1345j.layout(0, 0, i3 - i, i4 - i2);
        if (!mo3998d().mo3741d()) {
            mo3995b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View view = this.f1345j;
        if (this.f1338c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
