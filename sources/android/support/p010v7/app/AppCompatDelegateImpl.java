package android.support.p010v7.app;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.NavUtils;
import android.support.p007v4.view.LayoutInflaterCompat;
import android.support.p007v4.view.PointerIconCompat;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.view.ViewPropertyAnimatorCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0190d;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0196j;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.support.p010v7.view.C0274e;
import android.support.p010v7.view.C0278i;
import android.support.p010v7.view.menu.C0286ac;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.C0288ae;
import android.support.p010v7.view.menu.C0307l;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.widget.ActionBarContextView;
import android.support.p010v7.widget.C0332ai;
import android.support.p010v7.widget.C0352bb;
import android.support.p010v7.widget.C0353bc;
import android.support.p010v7.widget.C0359bi;
import android.support.p010v7.widget.C0407dc;
import android.support.p010v7.widget.C0422dr;
import android.support.p010v7.widget.C0423ds;
import android.support.p010v7.widget.ContentFrameLayout;
import android.support.p010v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.app.AppCompatDelegateImpl */
final class AppCompatDelegateImpl extends C0243r implements C0310o, LayoutInflater.Factory2 {

    /* renamed from: u */
    private static final boolean f593u = (Build.VERSION.SDK_INT < 21);

    /* renamed from: v */
    private static final int[] f594v = {16842836};

    /* renamed from: w */
    private static boolean f595w = true;

    /* renamed from: A */
    private C0208aj f596A;

    /* renamed from: B */
    private boolean f597B = true;

    /* renamed from: C */
    private boolean f598C;

    /* renamed from: D */
    private ViewGroup f599D;

    /* renamed from: E */
    private TextView f600E;

    /* renamed from: F */
    private View f601F;

    /* renamed from: G */
    private boolean f602G;

    /* renamed from: H */
    private boolean f603H;

    /* renamed from: I */
    private boolean f604I;

    /* renamed from: J */
    private PanelFeatureState[] f605J;

    /* renamed from: K */
    private PanelFeatureState f606K;

    /* renamed from: L */
    private boolean f607L;

    /* renamed from: M */
    private int f608M = -100;

    /* renamed from: N */
    private boolean f609N;

    /* renamed from: O */
    private C0204af f610O;

    /* renamed from: P */
    private final Runnable f611P = new C0245t(this);

    /* renamed from: Q */
    private boolean f612Q;

    /* renamed from: R */
    private Rect f613R;

    /* renamed from: S */
    private Rect f614S;

    /* renamed from: T */
    private AppCompatViewInflater f615T;

    /* renamed from: a */
    final Context f616a;

    /* renamed from: b */
    final Window f617b;

    /* renamed from: c */
    final Window.Callback f618c;

    /* renamed from: d */
    final Window.Callback f619d;

    /* renamed from: e */
    final C0242q f620e;

    /* renamed from: f */
    ActionBar f621f;

    /* renamed from: g */
    MenuInflater f622g;

    /* renamed from: h */
    C0271b f623h;

    /* renamed from: i */
    ActionBarContextView f624i;

    /* renamed from: j */
    PopupWindow f625j;

    /* renamed from: k */
    Runnable f626k;

    /* renamed from: l */
    ViewPropertyAnimatorCompat f627l = null;

    /* renamed from: m */
    boolean f628m;

    /* renamed from: n */
    boolean f629n;

    /* renamed from: o */
    boolean f630o;

    /* renamed from: p */
    boolean f631p;

    /* renamed from: q */
    boolean f632q;

    /* renamed from: r */
    boolean f633r;

    /* renamed from: s */
    boolean f634s;

    /* renamed from: t */
    int f635t;

    /* renamed from: x */
    private CharSequence f636x;

    /* renamed from: y */
    private C0353bc f637y;

    /* renamed from: z */
    private C0200ab f638z;

    /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState */
    public final class PanelFeatureState {

        /* renamed from: a */
        int f639a;

        /* renamed from: b */
        int f640b;

        /* renamed from: c */
        int f641c;

        /* renamed from: d */
        int f642d;

        /* renamed from: e */
        int f643e;

        /* renamed from: f */
        int f644f;

        /* renamed from: g */
        ViewGroup f645g;

        /* renamed from: h */
        View f646h;

        /* renamed from: i */
        View f647i;

        /* renamed from: j */
        MenuBuilder f648j;

        /* renamed from: k */
        C0307l f649k;

        /* renamed from: l */
        Context f650l;

        /* renamed from: m */
        boolean f651m;

        /* renamed from: n */
        boolean f652n;

        /* renamed from: o */
        boolean f653o;

        /* renamed from: p */
        public boolean f654p;

        /* renamed from: q */
        boolean f655q = false;

        /* renamed from: r */
        boolean f656r;

        /* renamed from: s */
        Bundle f657s;

        /* renamed from: android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState$SavedState */
        class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0207ai();

            /* renamed from: a */
            int f658a;

            /* renamed from: b */
            boolean f659b;

            /* renamed from: c */
            Bundle f660c;

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m272a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f658a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f659b = z;
                if (savedState.f659b) {
                    savedState.f660c = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f658a);
                parcel.writeInt(this.f659b ? 1 : 0);
                if (this.f659b) {
                    parcel.writeBundle(this.f660c);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f639a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C0288ae mo3220a(C0287ad adVar) {
            if (this.f648j == null) {
                return null;
            }
            if (this.f649k == null) {
                this.f649k = new C0307l(this.f650l, C0194h.abc_list_menu_item_layout);
                this.f649k.mo3709a(adVar);
                this.f648j.mo3574a((C0286ac) this.f649k);
            }
            return this.f649k.mo3787a(this.f645g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3221a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0188b.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0188b.panelMenuListTheme, typedValue, true);
            newTheme.applyStyle(typedValue.resourceId != 0 ? typedValue.resourceId : C0196j.Theme_AppCompat_CompactMenu, true);
            C0274e eVar = new C0274e(context, 0);
            eVar.getTheme().setTo(newTheme);
            this.f650l = eVar;
            TypedArray obtainStyledAttributes = eVar.obtainStyledAttributes(C0197k.f309aF);
            this.f640b = obtainStyledAttributes.getResourceId(C0197k.f312aI, 0);
            this.f644f = obtainStyledAttributes.getResourceId(C0197k.f311aH, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo3222a(MenuBuilder menuBuilder) {
            if (menuBuilder != this.f648j) {
                if (this.f648j != null) {
                    this.f648j.mo3595b((C0286ac) this.f649k);
                }
                this.f648j = menuBuilder;
                if (menuBuilder != null && this.f649k != null) {
                    menuBuilder.mo3574a((C0286ac) this.f649k);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo3223a() {
            if (this.f646h == null) {
                return false;
            }
            return this.f647i != null || this.f649k.mo3788a().getCount() > 0;
        }
    }

    static {
        if (f593u && !f595w) {
            Thread.setDefaultUncaughtExceptionHandler(new C0244s(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    AppCompatDelegateImpl(Context context, Window window, C0242q qVar) {
        this.f616a = context;
        this.f617b = window;
        this.f620e = qVar;
        this.f618c = this.f617b.getCallback();
        if (!(this.f618c instanceof C0203ae)) {
            this.f619d = new C0203ae(this, this.f618c);
            this.f617b.setCallback(this.f619d);
            C0407dc a = C0407dc.m1307a(context, (AttributeSet) null, f594v);
            Drawable b = a.mo4549b(0);
            if (b != null) {
                this.f617b.setBackgroundDrawable(b);
            }
            a.mo4546a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: A */
    private boolean m204A() {
        if (!this.f609N || !(this.f616a instanceof Activity)) {
            return false;
        }
        try {
            return (this.f616a.getPackageManager().getActivityInfo(new ComponentName(this.f616a, this.f616a.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* renamed from: a */
    private View m205a(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        AppCompatViewInflater appCompatViewInflater;
        boolean z2 = false;
        if (this.f615T == null) {
            String string = this.f616a.obtainStyledAttributes(C0197k.f309aF).getString(C0197k.f313aJ);
            if (string == null || AppCompatViewInflater.class.getName().equals(string)) {
                appCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.f615T = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    appCompatViewInflater = new AppCompatViewInflater();
                }
            }
            this.f615T = appCompatViewInflater;
        }
        if (f593u) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m209a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f615T.mo3226a(view, str, context, attributeSet, z, f593u, C0422dr.m1379a());
    }

    /* renamed from: a */
    private void m206a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.f653o && !this.f633r) {
            if (panelFeatureState.f639a == 0) {
                if ((this.f616a.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback callback = this.f617b.getCallback();
            if (callback == null || callback.onMenuOpened(panelFeatureState.f639a, panelFeatureState.f648j)) {
                WindowManager windowManager = (WindowManager) this.f616a.getSystemService("window");
                if (windowManager != null && m212b(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.f645g == null || panelFeatureState.f655q) {
                        if (panelFeatureState.f645g == null) {
                            m207a(panelFeatureState);
                            if (panelFeatureState.f645g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f655q && panelFeatureState.f645g.getChildCount() > 0) {
                            panelFeatureState.f645g.removeAllViews();
                        }
                        if (m213c(panelFeatureState) && panelFeatureState.mo3223a()) {
                            ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f646h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            panelFeatureState.f645g.setBackgroundResource(panelFeatureState.f640b);
                            ViewParent parent = panelFeatureState.f646h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f646h);
                            }
                            panelFeatureState.f645g.addView(panelFeatureState.f646h, layoutParams2);
                            if (!panelFeatureState.f646h.hasFocus()) {
                                panelFeatureState.f646h.requestFocus();
                            }
                        } else {
                            return;
                        }
                    } else if (!(panelFeatureState.f647i == null || (layoutParams = panelFeatureState.f647i.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        panelFeatureState.f652n = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f642d, panelFeatureState.f643e, PointerIconCompat.TYPE_HAND, 8519680, -3);
                        layoutParams3.gravity = panelFeatureState.f641c;
                        layoutParams3.windowAnimations = panelFeatureState.f644f;
                        windowManager.addView(panelFeatureState.f645g, layoutParams3);
                        panelFeatureState.f653o = true;
                        return;
                    }
                    i = -2;
                    panelFeatureState.f652n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f642d, panelFeatureState.f643e, PointerIconCompat.TYPE_HAND, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f641c;
                    layoutParams32.windowAnimations = panelFeatureState.f644f;
                    windowManager.addView(panelFeatureState.f645g, layoutParams32);
                    panelFeatureState.f653o = true;
                    return;
                }
                return;
            }
            mo3184a(panelFeatureState, true);
        }
    }

    /* renamed from: a */
    private boolean m207a(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo3221a(m219s());
        panelFeatureState.f645g = new C0206ah(this, panelFeatureState.f650l);
        panelFeatureState.f641c = 81;
        return true;
    }

    /* renamed from: a */
    private boolean m208a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f651m || m212b(panelFeatureState, keyEvent)) && panelFeatureState.f648j != null) {
            return panelFeatureState.f648j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m209a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f617b.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.isAttachedToWindow((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.p010v7.view.C0271b m210b(android.support.p010v7.view.C0272c r8) {
        /*
            r7 = this;
            r7.mo3215o()
            android.support.v7.view.b r0 = r7.f623h
            if (r0 == 0) goto L_0x000c
            android.support.v7.view.b r0 = r7.f623h
            r0.mo3293c()
        L_0x000c:
            android.support.v7.app.q r0 = r7.f620e
            r1 = 0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r7.f633r
            if (r0 != 0) goto L_0x001c
            android.support.v7.app.q r0 = r7.f620e     // Catch:{ AbstractMethodError -> 0x001c }
            android.support.v7.view.b r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x001c }
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            if (r0 == 0) goto L_0x0023
            r7.f623h = r0
            goto L_0x0160
        L_0x0023:
            android.support.v7.widget.ActionBarContextView r0 = r7.f624i
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d0
            boolean r0 = r7.f631p
            if (r0 == 0) goto L_0x00b1
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f616a
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = android.support.p010v7.p011a.C0188b.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0062
            android.content.Context r5 = r7.f616a
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            android.support.v7.view.e r4 = new android.support.v7.view.e
            android.content.Context r6 = r7.f616a
            r4.<init>(r6, r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x0064
        L_0x0062:
            android.content.Context r4 = r7.f616a
        L_0x0064:
            android.support.v7.widget.ActionBarContextView r5 = new android.support.v7.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f624i = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = android.support.p010v7.p011a.C0188b.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f625j = r5
            android.widget.PopupWindow r5 = r7.f625j
            r6 = 2
            android.support.p007v4.widget.PopupWindowCompat.setWindowLayoutType(r5, r6)
            android.widget.PopupWindow r5 = r7.f625j
            android.support.v7.widget.ActionBarContextView r6 = r7.f624i
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f625j
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = android.support.p010v7.p011a.C0188b.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            android.support.v7.widget.ActionBarContextView r4 = r7.f624i
            r4.mo3886a((int) r0)
            android.widget.PopupWindow r0 = r7.f625j
            r4 = -2
            r0.setHeight(r4)
            android.support.v7.app.x r0 = new android.support.v7.app.x
            r0.<init>(r7)
            r7.f626k = r0
            goto L_0x00d0
        L_0x00b1:
            android.view.ViewGroup r0 = r7.f599D
            int r4 = android.support.p010v7.p011a.C0193g.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            android.support.v7.widget.ViewStubCompat r0 = (android.support.p010v7.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d0
            android.content.Context r4 = r7.m219s()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.mo4253a(r4)
            android.view.View r0 = r0.mo4252a()
            android.support.v7.widget.ActionBarContextView r0 = (android.support.p010v7.widget.ActionBarContextView) r0
            r7.f624i = r0
        L_0x00d0:
            android.support.v7.widget.ActionBarContextView r0 = r7.f624i
            if (r0 == 0) goto L_0x0160
            r7.mo3215o()
            android.support.v7.widget.ActionBarContextView r0 = r7.f624i
            r0.mo3916e()
            android.support.v7.view.f r0 = new android.support.v7.view.f
            android.support.v7.widget.ActionBarContextView r4 = r7.f624i
            android.content.Context r4 = r4.getContext()
            android.support.v7.widget.ActionBarContextView r5 = r7.f624i
            android.widget.PopupWindow r6 = r7.f625j
            if (r6 != 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r3 = 0
        L_0x00ec:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo3290b()
            boolean r8 = r8.mo3235a((android.support.p010v7.view.C0271b) r0, (android.view.Menu) r3)
            if (r8 == 0) goto L_0x015e
            r0.mo3294d()
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            r8.mo3908a((android.support.p010v7.view.C0271b) r0)
            r7.f623h = r0
            boolean r8 = r7.mo3213m()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0128
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            r1 = 0
            r8.setAlpha(r1)
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            android.support.v4.view.ViewPropertyAnimatorCompat r8 = android.support.p007v4.view.ViewCompat.animate(r8)
            android.support.v4.view.ViewPropertyAnimatorCompat r8 = r8.alpha(r0)
            r7.f627l = r8
            android.support.v4.view.ViewPropertyAnimatorCompat r8 = r7.f627l
            android.support.v7.app.z r0 = new android.support.v7.app.z
            r0.<init>(r7)
            r8.setListener(r0)
            goto L_0x014e
        L_0x0128:
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            r8.setAlpha(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            r8.setVisibility(r2)
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014e
            android.support.v7.widget.ActionBarContextView r8 = r7.f624i
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            android.support.p007v4.view.ViewCompat.requestApplyInsets(r8)
        L_0x014e:
            android.widget.PopupWindow r8 = r7.f625j
            if (r8 == 0) goto L_0x0160
            android.view.Window r8 = r7.f617b
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f626k
            r8.post(r0)
            goto L_0x0160
        L_0x015e:
            r7.f623h = r1
        L_0x0160:
            android.support.v7.view.b r8 = r7.f623h
            if (r8 == 0) goto L_0x016f
            android.support.v7.app.q r8 = r7.f620e
            if (r8 == 0) goto L_0x016f
            android.support.v7.app.q r8 = r7.f620e
            android.support.v7.view.b r0 = r7.f623h
            r8.onSupportActionModeStarted(r0)
        L_0x016f:
            android.support.v7.view.b r8 = r7.f623h
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.AppCompatDelegateImpl.m210b(android.support.v7.view.c):android.support.v7.view.b");
    }

    /* renamed from: b */
    private boolean m211b(PanelFeatureState panelFeatureState) {
        Context context = this.f616a;
        if ((panelFeatureState.f639a == 0 || panelFeatureState.f639a == 108) && this.f637y != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0188b.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0188b.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0188b.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C0274e eVar = new C0274e(context, 0);
                eVar.getTheme().setTo(theme2);
                context = eVar;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.mo3576a((C0310o) this);
        panelFeatureState.mo3222a(menuBuilder);
        return true;
    }

    /* renamed from: b */
    private boolean m212b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.f633r) {
            return false;
        }
        if (panelFeatureState.f651m) {
            return true;
        }
        if (!(this.f606K == null || this.f606K == panelFeatureState)) {
            mo3184a(this.f606K, false);
        }
        Window.Callback callback = this.f617b.getCallback();
        if (callback != null) {
            panelFeatureState.f647i = callback.onCreatePanelView(panelFeatureState.f639a);
        }
        boolean z = panelFeatureState.f639a == 0 || panelFeatureState.f639a == 108;
        if (z && this.f637y != null) {
            this.f637y.mo3945h();
        }
        if (panelFeatureState.f647i == null && (!z || !(this.f621f instanceof C0213ao))) {
            if (panelFeatureState.f648j == null || panelFeatureState.f656r) {
                if (panelFeatureState.f648j == null) {
                    m211b(panelFeatureState);
                    if (panelFeatureState.f648j == null) {
                        return false;
                    }
                }
                if (z && this.f637y != null) {
                    if (this.f638z == null) {
                        this.f638z = new C0200ab(this);
                    }
                    this.f637y.mo3927a(panelFeatureState.f648j, this.f638z);
                }
                panelFeatureState.f648j.mo3609h();
                if (!callback.onCreatePanelMenu(panelFeatureState.f639a, panelFeatureState.f648j)) {
                    panelFeatureState.mo3222a((MenuBuilder) null);
                    if (z && this.f637y != null) {
                        this.f637y.mo3927a((Menu) null, this.f638z);
                    }
                    return false;
                }
                panelFeatureState.f656r = false;
            }
            panelFeatureState.f648j.mo3609h();
            if (panelFeatureState.f657s != null) {
                panelFeatureState.f648j.mo3594b(panelFeatureState.f657s);
                panelFeatureState.f657s = null;
            }
            if (!callback.onPreparePanel(0, panelFeatureState.f647i, panelFeatureState.f648j)) {
                if (z && this.f637y != null) {
                    this.f637y.mo3927a((Menu) null, this.f638z);
                }
                panelFeatureState.f648j.mo3611i();
                return false;
            }
            panelFeatureState.f654p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f648j.setQwertyMode(panelFeatureState.f654p);
            panelFeatureState.f648j.mo3611i();
        }
        panelFeatureState.f651m = true;
        panelFeatureState.f652n = false;
        this.f606K = panelFeatureState;
        return true;
    }

    /* renamed from: c */
    private boolean m213c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.f647i != null) {
            panelFeatureState.f646h = panelFeatureState.f647i;
            return true;
        } else if (panelFeatureState.f648j == null) {
            return false;
        } else {
            if (this.f596A == null) {
                this.f596A = new C0208aj(this);
            }
            panelFeatureState.f646h = (View) panelFeatureState.mo3220a((C0287ad) this.f596A);
            return panelFeatureState.f646h != null;
        }
    }

    /* renamed from: i */
    private void m214i(int i) {
        this.f635t = (1 << i) | this.f635t;
        if (!this.f634s) {
            ViewCompat.postOnAnimation(this.f617b.getDecorView(), this.f611P);
            this.f634s = true;
        }
    }

    /* renamed from: j */
    private static int m215j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: k */
    private int m216k(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) this.f616a.getSystemService(UiModeManager.class)).getNightMode() == 0) {
            return -1;
        }
        m226z();
        return this.f610O.mo3248a();
    }

    /* renamed from: l */
    private boolean m217l(int i) {
        Resources resources = this.f616a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m204A()) {
            ((Activity) this.f616a).recreate();
            return true;
        }
        Configuration configuration2 = new Configuration(configuration);
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        resources.updateConfiguration(configuration2, displayMetrics);
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        C0212an.m297a(resources);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m218r() {
        /*
            r3 = this;
            r3.m220t()
            boolean r0 = r3.f628m
            if (r0 == 0) goto L_0x003b
            android.support.v7.app.ActionBar r0 = r3.f621f
            if (r0 == 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            android.view.Window$Callback r0 = r3.f618c
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0020
            android.support.v7.app.ax r0 = new android.support.v7.app.ax
            android.view.Window$Callback r1 = r3.f618c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f629n
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f621f = r0
            goto L_0x0030
        L_0x0020:
            android.view.Window$Callback r0 = r3.f618c
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x0030
            android.support.v7.app.ax r0 = new android.support.v7.app.ax
            android.view.Window$Callback r1 = r3.f618c
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x0030:
            android.support.v7.app.ActionBar r0 = r3.f621f
            if (r0 == 0) goto L_0x003b
            android.support.v7.app.ActionBar r0 = r3.f621f
            boolean r1 = r3.f612Q
            r0.mo3118a((boolean) r1)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.AppCompatDelegateImpl.m218r():void");
    }

    /* renamed from: s */
    private Context m219s() {
        ActionBar a = mo3177a();
        Context b = a != null ? a.mo3121b() : null;
        return b == null ? this.f616a : b;
    }

    /* renamed from: t */
    private void m220t() {
        if (!this.f598C) {
            this.f599D = m221u();
            CharSequence w = m223w();
            if (!TextUtils.isEmpty(w)) {
                if (this.f637y != null) {
                    this.f637y.mo3929a(w);
                } else if (this.f621f != null) {
                    this.f621f.mo3117a(w);
                } else if (this.f600E != null) {
                    this.f600E.setText(w);
                }
            }
            m222v();
            this.f598C = true;
            PanelFeatureState f = mo3204f(0);
            if (this.f633r) {
                return;
            }
            if (f == null || f.f648j == null) {
                m214i(108);
            }
        }
    }

    /* renamed from: u */
    private ViewGroup m221u() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f616a.obtainStyledAttributes(C0197k.f309aF);
        if (obtainStyledAttributes.hasValue(C0197k.f314aK)) {
            if (obtainStyledAttributes.getBoolean(C0197k.f323aT, false)) {
                mo3199c(1);
            } else if (obtainStyledAttributes.getBoolean(C0197k.f314aK, false)) {
                mo3199c(108);
            }
            if (obtainStyledAttributes.getBoolean(C0197k.f315aL, false)) {
                mo3199c(109);
            }
            if (obtainStyledAttributes.getBoolean(C0197k.f316aM, false)) {
                mo3199c(10);
            }
            this.f631p = obtainStyledAttributes.getBoolean(C0197k.f310aG, false);
            obtainStyledAttributes.recycle();
            this.f617b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f616a);
            if (this.f632q) {
                viewGroup = (ViewGroup) from.inflate(this.f630o ? C0194h.abc_screen_simple_overlay_action_mode : C0194h.abc_screen_simple, (ViewGroup) null);
                if (Build.VERSION.SDK_INT >= 21) {
                    ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new C0246u(this));
                } else {
                    ((C0359bi) viewGroup).mo4121a(new C0247v(this));
                }
            } else if (this.f631p) {
                viewGroup = (ViewGroup) from.inflate(C0194h.abc_dialog_title_material, (ViewGroup) null);
                this.f629n = false;
                this.f628m = false;
            } else if (this.f628m) {
                TypedValue typedValue = new TypedValue();
                this.f616a.getTheme().resolveAttribute(C0188b.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0274e(this.f616a, typedValue.resourceId) : this.f616a).inflate(C0194h.abc_screen_toolbar, (ViewGroup) null);
                this.f637y = (C0353bc) viewGroup.findViewById(C0193g.decor_content_parent);
                this.f637y.mo3928a(this.f617b.getCallback());
                if (this.f629n) {
                    this.f637y.mo3925a(109);
                }
                if (this.f602G) {
                    this.f637y.mo3925a(2);
                }
                if (this.f603H) {
                    this.f637y.mo3925a(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (this.f637y == null) {
                    this.f600E = (TextView) viewGroup.findViewById(C0193g.f275S);
                }
                C0423ds.m1383b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0193g.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f617b.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f617b.setContentView(viewGroup);
                contentFrameLayout.mo4110a((C0352bb) new C0248w(this));
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f628m + ", windowActionBarOverlay: " + this.f629n + ", android:windowIsFloating: " + this.f631p + ", windowActionModeOverlay: " + this.f630o + ", windowNoTitle: " + this.f632q + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: v */
    private void m222v() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f599D.findViewById(16908290);
        View decorView = this.f617b.getDecorView();
        contentFrameLayout.mo4108a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f616a.obtainStyledAttributes(C0197k.f309aF);
        obtainStyledAttributes.getValue(C0197k.f321aR, contentFrameLayout.mo4107a());
        obtainStyledAttributes.getValue(C0197k.f322aS, contentFrameLayout.mo4111b());
        if (obtainStyledAttributes.hasValue(C0197k.f319aP)) {
            obtainStyledAttributes.getValue(C0197k.f319aP, contentFrameLayout.mo4112c());
        }
        if (obtainStyledAttributes.hasValue(C0197k.f320aQ)) {
            obtainStyledAttributes.getValue(C0197k.f320aQ, contentFrameLayout.mo4113d());
        }
        if (obtainStyledAttributes.hasValue(C0197k.f317aN)) {
            obtainStyledAttributes.getValue(C0197k.f317aN, contentFrameLayout.mo4114e());
        }
        if (obtainStyledAttributes.hasValue(C0197k.f318aO)) {
            obtainStyledAttributes.getValue(C0197k.f318aO, contentFrameLayout.mo4115f());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: w */
    private CharSequence m223w() {
        return this.f618c instanceof Activity ? ((Activity) this.f618c).getTitle() : this.f636x;
    }

    /* renamed from: x */
    private void m224x() {
        if (this.f598C) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: y */
    private int m225y() {
        return this.f608M != -100 ? this.f608M : m392l();
    }

    /* renamed from: z */
    private void m226z() {
        if (this.f610O == null) {
            this.f610O = new C0204af(this, C0220av.m325a(this.f616a));
        }
    }

    /* renamed from: a */
    public final ActionBar mo3177a() {
        m218r();
        return this.f621f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PanelFeatureState mo3178a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f605J;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f648j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C0271b mo3179a(C0272c cVar) {
        if (cVar != null) {
            if (this.f623h != null) {
                this.f623h.mo3293c();
            }
            C0201ac acVar = new C0201ac(this, cVar);
            ActionBar a = mo3177a();
            if (a != null) {
                this.f623h = a.mo3113a((C0272c) acVar);
                if (!(this.f623h == null || this.f620e == null)) {
                    this.f620e.onSupportActionModeStarted(this.f623h);
                }
            }
            if (this.f623h == null) {
                this.f623h = m210b((C0272c) acVar);
            }
            return this.f623h;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: a */
    public final <T extends View> T mo3180a(int i) {
        m220t();
        return this.f617b.findViewById(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3181a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f605J.length) {
                panelFeatureState = this.f605J[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f648j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f653o) && !this.f633r) {
            this.f618c.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    public final void mo3182a(Configuration configuration) {
        ActionBar a;
        if (this.f628m && this.f598C && (a = mo3177a()) != null) {
            a.mo3116a(configuration);
        }
        C0332ai.m1109a().mo4305a(this.f616a);
        mo3212k();
    }

    /* renamed from: a */
    public final void mo3183a(Bundle bundle) {
        if (this.f618c instanceof Activity) {
            String str = null;
            try {
                str = NavUtils.getParentActivityName((Activity) this.f618c);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar actionBar = this.f621f;
                if (actionBar == null) {
                    this.f612Q = true;
                } else {
                    actionBar.mo3118a(true);
                }
            }
        }
        if (bundle != null && this.f608M == -100) {
            this.f608M = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3184a(PanelFeatureState panelFeatureState, boolean z) {
        if (!z || panelFeatureState.f639a != 0 || this.f637y == null || !this.f637y.mo3936d()) {
            WindowManager windowManager = (WindowManager) this.f616a.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f653o || panelFeatureState.f645g == null)) {
                windowManager.removeView(panelFeatureState.f645g);
                if (z) {
                    mo3181a(panelFeatureState.f639a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f651m = false;
            panelFeatureState.f652n = false;
            panelFeatureState.f653o = false;
            panelFeatureState.f646h = null;
            panelFeatureState.f655q = true;
            if (this.f606K == panelFeatureState) {
                this.f606K = null;
                return;
            }
            return;
        }
        mo3196b(panelFeatureState.f648j);
    }

    /* renamed from: a */
    public final void mo3185a(MenuBuilder menuBuilder) {
        if (this.f637y == null || !this.f637y.mo3934c() || (ViewConfiguration.get(this.f616a).hasPermanentMenuKey() && !this.f637y.mo3938e())) {
            PanelFeatureState f = mo3204f(0);
            f.f655q = true;
            mo3184a(f, false);
            m206a(f, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.f617b.getCallback();
        if (this.f637y.mo3936d()) {
            this.f637y.mo3941g();
            if (!this.f633r) {
                callback.onPanelClosed(108, mo3204f(0).f648j);
            }
        } else if (callback != null && !this.f633r) {
            if (this.f634s && (1 & this.f635t) != 0) {
                this.f617b.getDecorView().removeCallbacks(this.f611P);
                this.f611P.run();
            }
            PanelFeatureState f2 = mo3204f(0);
            if (f2.f648j != null && !f2.f656r && callback.onPreparePanel(0, f2.f647i, f2.f648j)) {
                callback.onMenuOpened(108, f2.f648j);
                this.f637y.mo3939f();
            }
        }
    }

    /* renamed from: a */
    public final void mo3186a(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f618c instanceof Activity) {
            ActionBar a = mo3177a();
            if (!(a instanceof C0222ax)) {
                this.f622g = null;
                if (a != null) {
                    a.mo3129h();
                }
                if (toolbar != null) {
                    C0213ao aoVar = new C0213ao(toolbar, ((Activity) this.f618c).getTitle(), this.f619d);
                    this.f621f = aoVar;
                    window = this.f617b;
                    callback = aoVar.f697c;
                } else {
                    this.f621f = null;
                    window = this.f617b;
                    callback = this.f619d;
                }
                window.setCallback(callback);
                mo3206g();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: a */
    public final void mo3187a(View view) {
        m220t();
        ViewGroup viewGroup = (ViewGroup) this.f599D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f618c.onContentChanged();
    }

    /* renamed from: a */
    public final void mo3188a(View view, ViewGroup.LayoutParams layoutParams) {
        m220t();
        ViewGroup viewGroup = (ViewGroup) this.f599D.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f618c.onContentChanged();
    }

    /* renamed from: a */
    public final void mo3189a(CharSequence charSequence) {
        this.f636x = charSequence;
        if (this.f637y != null) {
            this.f637y.mo3929a(charSequence);
        } else if (this.f621f != null) {
            this.f621f.mo3117a(charSequence);
        } else if (this.f600E != null) {
            this.f600E.setText(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3190a(int i, KeyEvent keyEvent) {
        ActionBar a = mo3177a();
        if (a != null && a.mo3119a(i, keyEvent)) {
            return true;
        }
        if (this.f606K == null || !m208a(this.f606K, keyEvent.getKeyCode(), keyEvent)) {
            if (this.f606K == null) {
                PanelFeatureState f = mo3204f(0);
                m212b(f, keyEvent);
                boolean a2 = m208a(f, keyEvent.getKeyCode(), keyEvent);
                f.f651m = false;
                if (a2) {
                    return true;
                }
            }
            return false;
        }
        if (this.f606K != null) {
            this.f606K.f652n = true;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo3191a(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState a;
        Window.Callback callback = this.f617b.getCallback();
        if (callback == null || this.f633r || (a = mo3178a((Menu) menuBuilder.mo3619p())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(a.f639a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0118 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3192a(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f618c
            boolean r0 = r0 instanceof android.support.p007v4.view.KeyEventDispatcher.Component
            r1 = 1
            if (r0 != 0) goto L_0x000d
            android.view.Window$Callback r0 = r6.f618c
            boolean r0 = r0 instanceof android.support.p010v7.app.C0209ak
            if (r0 == 0) goto L_0x001c
        L_0x000d:
            android.view.Window r0 = r6.f617b
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001c
            boolean r0 = android.support.p007v4.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r7)
            if (r0 == 0) goto L_0x001c
            return r1
        L_0x001c:
            int r0 = r7.getKeyCode()
            r2 = 82
            if (r0 != r2) goto L_0x002d
            android.view.Window$Callback r0 = r6.f618c
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r1
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0062
            if (r0 == r5) goto L_0x0055
            if (r0 == r2) goto L_0x0043
            goto L_0x0061
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x0054
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo3204f(r4)
            boolean r2 = r0.f653o
            if (r2 != 0) goto L_0x0054
            r6.m212b((android.support.p010v7.app.AppCompatDelegateImpl.PanelFeatureState) r0, (android.view.KeyEvent) r7)
        L_0x0054:
            return r1
        L_0x0055:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            r6.f607L = r1
        L_0x0061:
            return r4
        L_0x0062:
            if (r0 == r5) goto L_0x00e9
            if (r0 == r2) goto L_0x0068
            goto L_0x0119
        L_0x0068:
            android.support.v7.view.b r0 = r6.f623h
            if (r0 != 0) goto L_0x00e8
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo3204f(r4)
            android.support.v7.widget.bc r2 = r6.f637y
            if (r2 == 0) goto L_0x00a8
            android.support.v7.widget.bc r2 = r6.f637y
            boolean r2 = r2.mo3934c()
            if (r2 == 0) goto L_0x00a8
            android.content.Context r2 = r6.f616a
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto L_0x00a8
            android.support.v7.widget.bc r2 = r6.f637y
            boolean r2 = r2.mo3936d()
            if (r2 != 0) goto L_0x00a1
            boolean r2 = r6.f633r
            if (r2 != 0) goto L_0x00c8
            boolean r7 = r6.m212b((android.support.p010v7.app.AppCompatDelegateImpl.PanelFeatureState) r0, (android.view.KeyEvent) r7)
            if (r7 == 0) goto L_0x00c8
            android.support.v7.widget.bc r7 = r6.f637y
            boolean r7 = r7.mo3939f()
            goto L_0x00cf
        L_0x00a1:
            android.support.v7.widget.bc r7 = r6.f637y
            boolean r7 = r7.mo3941g()
            goto L_0x00cf
        L_0x00a8:
            boolean r2 = r0.f653o
            if (r2 != 0) goto L_0x00ca
            boolean r2 = r0.f652n
            if (r2 == 0) goto L_0x00b1
            goto L_0x00ca
        L_0x00b1:
            boolean r2 = r0.f651m
            if (r2 == 0) goto L_0x00c8
            boolean r2 = r0.f656r
            if (r2 == 0) goto L_0x00c0
            r0.f651m = r4
            boolean r2 = r6.m212b((android.support.p010v7.app.AppCompatDelegateImpl.PanelFeatureState) r0, (android.view.KeyEvent) r7)
            goto L_0x00c1
        L_0x00c0:
            r2 = 1
        L_0x00c1:
            if (r2 == 0) goto L_0x00c8
            r6.m206a((android.support.p010v7.app.AppCompatDelegateImpl.PanelFeatureState) r0, (android.view.KeyEvent) r7)
            r7 = 1
            goto L_0x00cf
        L_0x00c8:
            r7 = 0
            goto L_0x00cf
        L_0x00ca:
            boolean r7 = r0.f653o
            r6.mo3184a((android.support.p010v7.app.AppCompatDelegateImpl.PanelFeatureState) r0, (boolean) r1)
        L_0x00cf:
            if (r7 == 0) goto L_0x00e8
            android.content.Context r7 = r6.f616a
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e1
            r7.playSoundEffect(r4)
            goto L_0x00e8
        L_0x00e1:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
        L_0x00e8:
            return r1
        L_0x00e9:
            boolean r7 = r6.f607L
            r6.f607L = r4
            android.support.v7.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.mo3204f(r4)
            if (r0 == 0) goto L_0x00fd
            boolean r2 = r0.f653o
            if (r2 == 0) goto L_0x00fd
            if (r7 != 0) goto L_0x00fc
            r6.mo3184a((android.support.p010v7.app.AppCompatDelegateImpl.PanelFeatureState) r0, (boolean) r1)
        L_0x00fc:
            return r1
        L_0x00fd:
            android.support.v7.view.b r7 = r6.f623h
            if (r7 == 0) goto L_0x0108
            android.support.v7.view.b r7 = r6.f623h
            r7.mo3293c()
        L_0x0106:
            r7 = 1
            goto L_0x0116
        L_0x0108:
            android.support.v7.app.ActionBar r7 = r6.mo3177a()
            if (r7 == 0) goto L_0x0115
            boolean r7 = r7.mo3128g()
            if (r7 == 0) goto L_0x0115
            goto L_0x0106
        L_0x0115:
            r7 = 0
        L_0x0116:
            if (r7 == 0) goto L_0x0119
            return r1
        L_0x0119:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.AppCompatDelegateImpl.mo3192a(android.view.KeyEvent):boolean");
    }

    /* renamed from: b */
    public final MenuInflater mo3193b() {
        if (this.f622g == null) {
            m218r();
            this.f622g = new C0278i(this.f621f != null ? this.f621f.mo3121b() : this.f616a);
        }
        return this.f622g;
    }

    /* renamed from: b */
    public final void mo3194b(int i) {
        m220t();
        ViewGroup viewGroup = (ViewGroup) this.f599D.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f616a).inflate(i, viewGroup);
        this.f618c.onContentChanged();
    }

    /* renamed from: b */
    public final void mo3195b(Bundle bundle) {
        if (this.f608M != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f608M);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3196b(MenuBuilder menuBuilder) {
        if (!this.f604I) {
            this.f604I = true;
            this.f637y.mo3946i();
            Window.Callback callback = this.f617b.getCallback();
            if (callback != null && !this.f633r) {
                callback.onPanelClosed(108, menuBuilder);
            }
            this.f604I = false;
        }
    }

    /* renamed from: b */
    public final void mo3197b(View view, ViewGroup.LayoutParams layoutParams) {
        m220t();
        ((ViewGroup) this.f599D.findViewById(16908290)).addView(view, layoutParams);
        this.f618c.onContentChanged();
    }

    /* renamed from: c */
    public final void mo3198c() {
        m220t();
    }

    /* renamed from: c */
    public final boolean mo3199c(int i) {
        int j = m215j(i);
        if (this.f632q && j == 108) {
            return false;
        }
        if (this.f628m && j == 1) {
            this.f628m = false;
        }
        switch (j) {
            case 1:
                m224x();
                this.f632q = true;
                return true;
            case 2:
                m224x();
                this.f602G = true;
                return true;
            case 5:
                m224x();
                this.f603H = true;
                return true;
            case 10:
                m224x();
                this.f630o = true;
                return true;
            case 108:
                m224x();
                this.f628m = true;
                return true;
            case 109:
                m224x();
                this.f629n = true;
                return true;
            default:
                return this.f617b.requestFeature(j);
        }
    }

    /* renamed from: d */
    public final void mo3200d() {
        mo3212k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3201d(int i) {
        if (i == 108) {
            ActionBar a = mo3177a();
            if (a != null) {
                a.mo3124c(false);
            }
        } else if (i == 0) {
            PanelFeatureState f = mo3204f(i);
            if (f.f653o) {
                mo3184a(f, false);
            }
        }
    }

    /* renamed from: e */
    public final void mo3202e() {
        ActionBar a = mo3177a();
        if (a != null) {
            a.mo3122b(false);
        }
        if (this.f610O != null) {
            this.f610O.mo3251d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3203e(int i) {
        ActionBar a;
        if (i == 108 && (a = mo3177a()) != null) {
            a.mo3124c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final PanelFeatureState mo3204f(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f605J;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f605J = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* renamed from: f */
    public final void mo3205f() {
        ActionBar a = mo3177a();
        if (a != null) {
            a.mo3122b(true);
        }
    }

    /* renamed from: g */
    public final void mo3206g() {
        ActionBar a = mo3177a();
        if (a == null || !a.mo3127f()) {
            m214i(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo3207g(int i) {
        PanelFeatureState f;
        PanelFeatureState f2 = mo3204f(i);
        if (f2.f648j != null) {
            Bundle bundle = new Bundle();
            f2.f648j.mo3573a(bundle);
            if (bundle.size() > 0) {
                f2.f657s = bundle;
            }
            f2.f648j.mo3609h();
            f2.f648j.clear();
        }
        f2.f656r = true;
        f2.f655q = true;
        if ((i == 108 || i == 0) && this.f637y != null && (f = mo3204f(0)) != null) {
            f.f651m = false;
            m212b(f, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo3208h(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = 0;
        if (this.f624i == null || !(this.f624i.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f624i.getLayoutParams();
            z = true;
            if (this.f624i.isShown()) {
                if (this.f613R == null) {
                    this.f613R = new Rect();
                    this.f614S = new Rect();
                }
                Rect rect = this.f613R;
                Rect rect2 = this.f614S;
                rect.set(0, i, 0, 0);
                C0423ds.m1381a(this.f599D, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f601F == null) {
                        this.f601F = new View(this.f616a);
                        this.f601F.setBackgroundColor(this.f616a.getResources().getColor(C0190d.abc_input_method_navigation_guard));
                        this.f599D.addView(this.f601F, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.f601F.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f601F.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f601F == null) {
                    z = false;
                }
                if (!this.f630o && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z2) {
                this.f624i.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f601F != null) {
            View view = this.f601F;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: h */
    public final void mo3209h() {
        if (this.f634s) {
            this.f617b.getDecorView().removeCallbacks(this.f611P);
        }
        this.f633r = true;
        if (this.f621f != null) {
            this.f621f.mo3129h();
        }
        if (this.f610O != null) {
            this.f610O.mo3251d();
        }
    }

    /* renamed from: i */
    public final C0225b mo3210i() {
        return new C0199aa(this);
    }

    /* renamed from: j */
    public final void mo3211j() {
        LayoutInflater from = LayoutInflater.from(this.f616a);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: k */
    public final boolean mo3212k() {
        int y = m225y();
        int k = m216k(y);
        boolean l = k != -1 ? m217l(k) : false;
        if (y == 0) {
            m226z();
            this.f610O.mo3250c();
        }
        this.f609N = true;
        return l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo3213m() {
        return this.f598C && this.f599D != null && ViewCompat.isLaidOut(this.f599D);
    }

    /* renamed from: n */
    public final boolean mo3214n() {
        return this.f597B;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo3215o() {
        if (this.f627l != null) {
            this.f627l.cancel();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m205a(view, str, context, attributeSet);
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo3218p() {
        mo3184a(mo3204f(0), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo3219q() {
        if (this.f637y != null) {
            this.f637y.mo3946i();
        }
        if (this.f625j != null) {
            this.f617b.getDecorView().removeCallbacks(this.f626k);
            if (this.f625j.isShowing()) {
                try {
                    this.f625j.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f625j = null;
        }
        mo3215o();
        PanelFeatureState f = mo3204f(0);
        if (f != null && f.f648j != null) {
            f.f648j.close();
        }
    }
}
