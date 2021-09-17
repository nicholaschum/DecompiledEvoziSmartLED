package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p007v4.graphics.ColorUtils;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.util.ArrayMap;
import android.support.p007v4.util.LongSparseArray;
import android.support.p007v4.util.SparseArrayCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0192f;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.ai */
public final class C0332ai {

    /* renamed from: a */
    private static final PorterDuff.Mode f1627a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0332ai f1628b;

    /* renamed from: c */
    private static final C0335al f1629c = new C0335al();

    /* renamed from: d */
    private static final int[] f1630d = {C0192f.abc_textfield_search_default_mtrl_alpha, C0192f.abc_textfield_default_mtrl_alpha, C0192f.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f1631e = {C0192f.abc_ic_commit_search_api_mtrl_alpha, C0192f.abc_seekbar_tick_mark_material, C0192f.abc_ic_menu_share_mtrl_alpha, C0192f.abc_ic_menu_copy_mtrl_am_alpha, C0192f.abc_ic_menu_cut_mtrl_alpha, C0192f.abc_ic_menu_selectall_mtrl_alpha, C0192f.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: f */
    private static final int[] f1632f = {C0192f.abc_textfield_activated_mtrl_alpha, C0192f.abc_textfield_search_activated_mtrl_alpha, C0192f.abc_cab_background_top_mtrl_alpha, C0192f.abc_text_cursor_material, C0192f.abc_text_select_handle_left_mtrl_dark, C0192f.abc_text_select_handle_middle_mtrl_dark, C0192f.abc_text_select_handle_right_mtrl_dark, C0192f.abc_text_select_handle_left_mtrl_light, C0192f.abc_text_select_handle_middle_mtrl_light, C0192f.abc_text_select_handle_right_mtrl_light};

    /* renamed from: g */
    private static final int[] f1633g = {C0192f.abc_popup_background_mtrl_mult, C0192f.abc_cab_background_internal_bg, C0192f.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f1634h = {C0192f.abc_tab_indicator_material, C0192f.abc_textfield_search_material};

    /* renamed from: i */
    private static final int[] f1635i = {C0192f.abc_btn_check_material, C0192f.abc_btn_radio_material};

    /* renamed from: j */
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f1636j;

    /* renamed from: k */
    private ArrayMap<String, C0336am> f1637k;

    /* renamed from: l */
    private SparseArrayCompat<String> f1638l;

    /* renamed from: m */
    private final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> f1639m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f1640n;

    /* renamed from: o */
    private boolean f1641o;

    /* renamed from: a */
    private static long m1104a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m1105a(int i) {
        if (i == C0192f.abc_switch_thumb_material) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    private static synchronized PorterDuffColorFilter m1106a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0332ai.class) {
            a = f1629c.mo4308a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f1629c.mo4309a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private Drawable m1107a(Context context, int i, boolean z, Drawable drawable) {
        LayerDrawable layerDrawable;
        Drawable findDrawableByLayerId;
        int i2;
        ColorStateList b = mo4306b(context, i);
        if (b != null) {
            if (C0355be.m1243c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable wrap = DrawableCompat.wrap(drawable);
            DrawableCompat.setTintList(wrap, b);
            PorterDuff.Mode a = m1105a(i);
            if (a == null) {
                return wrap;
            }
            DrawableCompat.setTintMode(wrap, a);
            return wrap;
        }
        if (i == C0192f.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            m1110a(layerDrawable.findDrawableByLayerId(16908288), C0402cy.m1301a(context, C0188b.colorControlNormal), f1627a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0188b.colorControlNormal;
        } else if (i == C0192f.abc_ratingbar_material || i == C0192f.abc_ratingbar_indicator_material || i == C0192f.abc_ratingbar_small_material) {
            layerDrawable = (LayerDrawable) drawable;
            m1110a(layerDrawable.findDrawableByLayerId(16908288), C0402cy.m1303c(context, C0188b.colorControlNormal), f1627a);
            findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908303);
            i2 = C0188b.colorControlActivated;
        } else if (m1113a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
        m1110a(findDrawableByLayerId, C0402cy.m1301a(context, i2), f1627a);
        m1110a(layerDrawable.findDrawableByLayerId(16908301), C0402cy.m1301a(context, C0188b.colorControlActivated), f1627a);
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1108a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.LongSparseArray<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1639m     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            android.support.v4.util.LongSparseArray r0 = (android.support.p007v4.util.LongSparseArray) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.delete(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0332ai.m1108a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C0332ai m1109a() {
        C0332ai aiVar;
        synchronized (C0332ai.class) {
            if (f1628b == null) {
                C0332ai aiVar2 = new C0332ai();
                f1628b = aiVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    aiVar2.m1112a("vector", (C0336am) new C0337an());
                    aiVar2.m1112a("animated-vector", (C0336am) new C0334ak());
                    aiVar2.m1112a("animated-selector", (C0336am) new C0333aj());
                }
            }
            aiVar = f1628b;
        }
        return aiVar;
    }

    /* renamed from: a */
    private static void m1110a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0355be.m1243c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1627a;
        }
        drawable.setColorFilter(m1106a(i, mode));
    }

    /* renamed from: a */
    static void m1111a(Drawable drawable, C0405da daVar, int[] iArr) {
        if (!C0355be.m1243c(drawable) || drawable.mutate() == drawable) {
            if (daVar.f1823d || daVar.f1822c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = daVar.f1823d ? daVar.f1820a : null;
                PorterDuff.Mode mode = daVar.f1822c ? daVar.f1821b : f1627a;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = m1106a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private void m1112a(String str, C0336am amVar) {
        if (this.f1637k == null) {
            this.f1637k = new ArrayMap<>();
        }
        this.f1637k.put(str, amVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m1113a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f1627a
            int[] r1 = f1630d
            boolean r1 = m1115a((int[]) r1, (int) r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0015
            int r2 = android.support.p010v7.p011a.C0188b.colorControlNormal
        L_0x0012:
            r7 = 1
            r1 = -1
            goto L_0x0044
        L_0x0015:
            int[] r1 = f1632f
            boolean r1 = m1115a((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x0020
            int r2 = android.support.p010v7.p011a.C0188b.colorControlActivated
            goto L_0x0012
        L_0x0020:
            int[] r1 = f1633g
            boolean r1 = m1115a((int[]) r1, (int) r7)
            if (r1 == 0) goto L_0x002b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0012
        L_0x002b:
            int r1 = android.support.p010v7.p011a.C0192f.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L_0x003c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0044
        L_0x003c:
            int r1 = android.support.p010v7.p011a.C0192f.abc_dialog_material_background
            if (r7 != r1) goto L_0x0041
            goto L_0x0012
        L_0x0041:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x0061
            boolean r7 = android.support.p010v7.widget.C0355be.m1243c(r8)
            if (r7 == 0) goto L_0x0050
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0050:
            int r6 = android.support.p010v7.widget.C0402cy.m1301a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m1106a((int) r6, (android.graphics.PorterDuff.Mode) r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0060
            r8.setAlpha(r1)
        L_0x0060:
            return r5
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0332ai.m1113a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private synchronized boolean m1114a(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            LongSparseArray longSparseArray = this.f1639m.get(context);
            if (longSparseArray == null) {
                longSparseArray = new LongSparseArray();
                this.f1639m.put(context, longSparseArray);
            }
            longSparseArray.put(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    private static boolean m1115a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private Drawable m1116c(Context context, int i) {
        int next;
        if (this.f1637k == null || this.f1637k.isEmpty()) {
            return null;
        }
        if (this.f1638l != null) {
            String str = this.f1638l.get(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1637k.get(str) == null)) {
                return null;
            }
        } else {
            this.f1638l = new SparseArrayCompat<>();
        }
        if (this.f1640n == null) {
            this.f1640n = new TypedValue();
        }
        TypedValue typedValue = this.f1640n;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = m1104a(typedValue);
        Drawable a2 = m1108a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f1638l.append(i, name);
                    C0336am amVar = this.f1637k.get(name);
                    if (amVar != null) {
                        a2 = amVar.mo4307a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a2 != null) {
                        a2.setChangingConfigurations(typedValue.changingConfigurations);
                        m1114a(context, a, a2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e);
            }
        }
        if (a2 == null) {
            this.f1638l.append(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* renamed from: d */
    private static ColorStateList m1117d(Context context, int i) {
        int a = C0402cy.m1301a(context, C0188b.colorControlHighlight);
        int c = C0402cy.m1303c(context, C0188b.colorButtonNormal);
        return new ColorStateList(new int[][]{C0402cy.f1805a, C0402cy.f1808d, C0402cy.f1806b, C0402cy.f1812h}, new int[]{c, ColorUtils.compositeColors(a, i), ColorUtils.compositeColors(a, i), i});
    }

    /* renamed from: a */
    public final synchronized Drawable mo4302a(Context context, int i) {
        return mo4303a(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo4303a(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f1641o     // Catch:{ all -> 0x0094 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0036
            r8.f1641o = r2     // Catch:{ all -> 0x0094 }
            int r0 = android.support.p010v7.p011a.C0192f.abc_vector_test     // Catch:{ all -> 0x0094 }
            android.graphics.drawable.Drawable r0 = r8.mo4302a((android.content.Context) r9, (int) r0)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x002c
            boolean r3 = r0 instanceof android.support.graphics.drawable.VectorDrawableCompat     // Catch:{ all -> 0x0094 }
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0094 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x002c
            goto L_0x0036
        L_0x002c:
            r8.f1641o = r1     // Catch:{ all -> 0x0094 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0094 }
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch:{ all -> 0x0094 }
            throw r9     // Catch:{ all -> 0x0094 }
        L_0x0036:
            android.graphics.drawable.Drawable r0 = r8.m1116c(r9, r10)     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0081
            android.util.TypedValue r0 = r8.f1640n     // Catch:{ all -> 0x0094 }
            if (r0 != 0) goto L_0x0047
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x0094 }
            r0.<init>()     // Catch:{ all -> 0x0094 }
            r8.f1640n = r0     // Catch:{ all -> 0x0094 }
        L_0x0047:
            android.util.TypedValue r0 = r8.f1640n     // Catch:{ all -> 0x0094 }
            android.content.res.Resources r3 = r9.getResources()     // Catch:{ all -> 0x0094 }
            r3.getValue(r10, r0, r2)     // Catch:{ all -> 0x0094 }
            long r3 = m1104a((android.util.TypedValue) r0)     // Catch:{ all -> 0x0094 }
            android.graphics.drawable.Drawable r5 = r8.m1108a((android.content.Context) r9, (long) r3)     // Catch:{ all -> 0x0094 }
            if (r5 != 0) goto L_0x0080
            int r6 = android.support.p010v7.p011a.C0192f.abc_cab_background_top_material     // Catch:{ all -> 0x0094 }
            if (r10 != r6) goto L_0x0076
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x0094 }
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]     // Catch:{ all -> 0x0094 }
            int r7 = android.support.p010v7.p011a.C0192f.abc_cab_background_internal_bg     // Catch:{ all -> 0x0094 }
            android.graphics.drawable.Drawable r7 = r8.mo4302a((android.content.Context) r9, (int) r7)     // Catch:{ all -> 0x0094 }
            r6[r1] = r7     // Catch:{ all -> 0x0094 }
            int r1 = android.support.p010v7.p011a.C0192f.abc_cab_background_top_mtrl_alpha     // Catch:{ all -> 0x0094 }
            android.graphics.drawable.Drawable r1 = r8.mo4302a((android.content.Context) r9, (int) r1)     // Catch:{ all -> 0x0094 }
            r6[r2] = r1     // Catch:{ all -> 0x0094 }
            r5.<init>(r6)     // Catch:{ all -> 0x0094 }
        L_0x0076:
            if (r5 == 0) goto L_0x0080
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x0094 }
            r5.setChangingConfigurations(r0)     // Catch:{ all -> 0x0094 }
            r8.m1114a((android.content.Context) r9, (long) r3, (android.graphics.drawable.Drawable) r5)     // Catch:{ all -> 0x0094 }
        L_0x0080:
            r0 = r5
        L_0x0081:
            if (r0 != 0) goto L_0x0087
            android.graphics.drawable.Drawable r0 = android.support.p007v4.content.ContextCompat.getDrawable(r9, r10)     // Catch:{ all -> 0x0094 }
        L_0x0087:
            if (r0 == 0) goto L_0x008d
            android.graphics.drawable.Drawable r0 = r8.m1107a(r9, r10, r11, r0)     // Catch:{ all -> 0x0094 }
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            android.support.p010v7.widget.C0355be.m1242b(r0)     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r8)
            return r0
        L_0x0094:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0332ai.mo4303a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Drawable mo4304a(Context context, C0422dr drVar, int i) {
        Drawable c = m1116c(context, i);
        if (c == null) {
            c = drVar.mo4578a(i);
        }
        if (c == null) {
            return null;
        }
        return m1107a(context, i, false, c);
    }

    /* renamed from: a */
    public final synchronized void mo4305a(Context context) {
        LongSparseArray longSparseArray = this.f1639m.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.content.res.ColorStateList} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList mo4306b(android.content.Context r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r7.f1636j     // Catch:{ all -> 0x011d }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r7.f1636j     // Catch:{ all -> 0x011d }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x011d }
            android.support.v4.util.SparseArrayCompat r0 = (android.support.p007v4.util.SparseArrayCompat) r0     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x011d }
            r1 = r0
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1     // Catch:{ all -> 0x011d }
        L_0x0017:
            if (r1 != 0) goto L_0x011b
            int r0 = android.support.p010v7.p011a.C0192f.abc_edit_text_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x0026
            int r0 = android.support.p010v7.p011a.C0190d.abc_tint_edittext     // Catch:{ all -> 0x011d }
        L_0x001f:
            android.content.res.ColorStateList r0 = android.support.p010v7.p012b.p013a.C0252a.m418a(r8, r0)     // Catch:{ all -> 0x011d }
        L_0x0023:
            r1 = r0
            goto L_0x00f7
        L_0x0026:
            int r0 = android.support.p010v7.p011a.C0192f.abc_switch_track_mtrl_alpha     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x002d
            int r0 = android.support.p010v7.p011a.C0190d.abc_tint_switch_track     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x002d:
            int r0 = android.support.p010v7.p011a.C0192f.abc_switch_thumb_material     // Catch:{ all -> 0x011d }
            r2 = 0
            if (r9 != r0) goto L_0x0095
            r0 = 3
            int[][] r1 = new int[r0][]     // Catch:{ all -> 0x011d }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x011d }
            int r3 = android.support.p010v7.p011a.C0188b.colorSwitchThumbNormal     // Catch:{ all -> 0x011d }
            android.content.res.ColorStateList r3 = android.support.p010v7.widget.C0402cy.m1302b(r8, r3)     // Catch:{ all -> 0x011d }
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x006a
            boolean r6 = r3.isStateful()     // Catch:{ all -> 0x011d }
            if (r6 == 0) goto L_0x006a
            int[] r6 = android.support.p010v7.widget.C0402cy.f1805a     // Catch:{ all -> 0x011d }
            r1[r2] = r6     // Catch:{ all -> 0x011d }
            r6 = r1[r2]     // Catch:{ all -> 0x011d }
            int r6 = r3.getColorForState(r6, r2)     // Catch:{ all -> 0x011d }
            r0[r2] = r6     // Catch:{ all -> 0x011d }
            int[] r2 = android.support.p010v7.widget.C0402cy.f1809e     // Catch:{ all -> 0x011d }
            r1[r5] = r2     // Catch:{ all -> 0x011d }
            int r2 = android.support.p010v7.p011a.C0188b.colorControlActivated     // Catch:{ all -> 0x011d }
            int r2 = android.support.p010v7.widget.C0402cy.m1301a(r8, r2)     // Catch:{ all -> 0x011d }
            r0[r5] = r2     // Catch:{ all -> 0x011d }
            int[] r2 = android.support.p010v7.widget.C0402cy.f1812h     // Catch:{ all -> 0x011d }
            r1[r4] = r2     // Catch:{ all -> 0x011d }
            int r2 = r3.getDefaultColor()     // Catch:{ all -> 0x011d }
            r0[r4] = r2     // Catch:{ all -> 0x011d }
            goto L_0x008e
        L_0x006a:
            int[] r3 = android.support.p010v7.widget.C0402cy.f1805a     // Catch:{ all -> 0x011d }
            r1[r2] = r3     // Catch:{ all -> 0x011d }
            int r3 = android.support.p010v7.p011a.C0188b.colorSwitchThumbNormal     // Catch:{ all -> 0x011d }
            int r3 = android.support.p010v7.widget.C0402cy.m1303c(r8, r3)     // Catch:{ all -> 0x011d }
            r0[r2] = r3     // Catch:{ all -> 0x011d }
            int[] r2 = android.support.p010v7.widget.C0402cy.f1809e     // Catch:{ all -> 0x011d }
            r1[r5] = r2     // Catch:{ all -> 0x011d }
            int r2 = android.support.p010v7.p011a.C0188b.colorControlActivated     // Catch:{ all -> 0x011d }
            int r2 = android.support.p010v7.widget.C0402cy.m1301a(r8, r2)     // Catch:{ all -> 0x011d }
            r0[r5] = r2     // Catch:{ all -> 0x011d }
            int[] r2 = android.support.p010v7.widget.C0402cy.f1812h     // Catch:{ all -> 0x011d }
            r1[r4] = r2     // Catch:{ all -> 0x011d }
            int r2 = android.support.p010v7.p011a.C0188b.colorSwitchThumbNormal     // Catch:{ all -> 0x011d }
            int r2 = android.support.p010v7.widget.C0402cy.m1301a(r8, r2)     // Catch:{ all -> 0x011d }
            r0[r4] = r2     // Catch:{ all -> 0x011d }
        L_0x008e:
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList     // Catch:{ all -> 0x011d }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x011d }
            r1 = r2
            goto L_0x00f7
        L_0x0095:
            int r0 = android.support.p010v7.p011a.C0192f.abc_btn_default_mtrl_shape     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00a5
            int r0 = android.support.p010v7.p011a.C0188b.colorButtonNormal     // Catch:{ all -> 0x011d }
            int r0 = android.support.p010v7.widget.C0402cy.m1301a(r8, r0)     // Catch:{ all -> 0x011d }
        L_0x009f:
            android.content.res.ColorStateList r0 = m1117d(r8, r0)     // Catch:{ all -> 0x011d }
            goto L_0x0023
        L_0x00a5:
            int r0 = android.support.p010v7.p011a.C0192f.abc_btn_borderless_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00af
            android.content.res.ColorStateList r0 = m1117d(r8, r2)     // Catch:{ all -> 0x011d }
            goto L_0x0023
        L_0x00af:
            int r0 = android.support.p010v7.p011a.C0192f.abc_btn_colored_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00ba
            int r0 = android.support.p010v7.p011a.C0188b.colorAccent     // Catch:{ all -> 0x011d }
            int r0 = android.support.p010v7.widget.C0402cy.m1301a(r8, r0)     // Catch:{ all -> 0x011d }
            goto L_0x009f
        L_0x00ba:
            int r0 = android.support.p010v7.p011a.C0192f.abc_spinner_mtrl_am_alpha     // Catch:{ all -> 0x011d }
            if (r9 == r0) goto L_0x00f3
            int r0 = android.support.p010v7.p011a.C0192f.abc_spinner_textfield_background_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00c3
            goto L_0x00f3
        L_0x00c3:
            int[] r0 = f1631e     // Catch:{ all -> 0x011d }
            boolean r0 = m1115a((int[]) r0, (int) r9)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00d3
            int r0 = android.support.p010v7.p011a.C0188b.colorControlNormal     // Catch:{ all -> 0x011d }
            android.content.res.ColorStateList r0 = android.support.p010v7.widget.C0402cy.m1302b(r8, r0)     // Catch:{ all -> 0x011d }
            goto L_0x0023
        L_0x00d3:
            int[] r0 = f1634h     // Catch:{ all -> 0x011d }
            boolean r0 = m1115a((int[]) r0, (int) r9)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00df
            int r0 = android.support.p010v7.p011a.C0190d.abc_tint_default     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00df:
            int[] r0 = f1635i     // Catch:{ all -> 0x011d }
            boolean r0 = m1115a((int[]) r0, (int) r9)     // Catch:{ all -> 0x011d }
            if (r0 == 0) goto L_0x00eb
            int r0 = android.support.p010v7.p011a.C0190d.abc_tint_btn_checkable     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00eb:
            int r0 = android.support.p010v7.p011a.C0192f.abc_seekbar_thumb_material     // Catch:{ all -> 0x011d }
            if (r9 != r0) goto L_0x00f7
            int r0 = android.support.p010v7.p011a.C0190d.abc_tint_seek_thumb     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00f3:
            int r0 = android.support.p010v7.p011a.C0190d.abc_tint_spinner     // Catch:{ all -> 0x011d }
            goto L_0x001f
        L_0x00f7:
            if (r1 == 0) goto L_0x011b
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r7.f1636j     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0104
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x011d }
            r0.<init>()     // Catch:{ all -> 0x011d }
            r7.f1636j = r0     // Catch:{ all -> 0x011d }
        L_0x0104:
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList>> r0 = r7.f1636j     // Catch:{ all -> 0x011d }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x011d }
            android.support.v4.util.SparseArrayCompat r0 = (android.support.p007v4.util.SparseArrayCompat) r0     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0118
            android.support.v4.util.SparseArrayCompat r0 = new android.support.v4.util.SparseArrayCompat     // Catch:{ all -> 0x011d }
            r0.<init>()     // Catch:{ all -> 0x011d }
            java.util.WeakHashMap<android.content.Context, android.support.v4.util.SparseArrayCompat<android.content.res.ColorStateList>> r2 = r7.f1636j     // Catch:{ all -> 0x011d }
            r2.put(r8, r0)     // Catch:{ all -> 0x011d }
        L_0x0118:
            r0.append(r9, r1)     // Catch:{ all -> 0x011d }
        L_0x011b:
            monitor-exit(r7)
            return r1
        L_0x011d:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0332ai.mo4306b(android.content.Context, int):android.content.res.ColorStateList");
    }
}
