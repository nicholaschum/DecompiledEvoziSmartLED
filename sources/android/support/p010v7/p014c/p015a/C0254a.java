package android.support.p010v7.p014c.p015a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.p012b.p013a.C0252a;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.c.a.a */
public class C0254a extends C0267n {

    /* renamed from: a */
    private static final String f849a = "a";

    /* renamed from: b */
    private C0256c f850b;

    /* renamed from: c */
    private C0260g f851c;

    /* renamed from: d */
    private int f852d;

    /* renamed from: e */
    private int f853e;

    /* renamed from: f */
    private boolean f854f;

    public C0254a() {
        this((C0256c) null, (Resources) null);
    }

    C0254a(C0256c cVar, Resources resources) {
        super((byte) 0);
        this.f852d = -1;
        this.f853e = -1;
        mo3336a(new C0256c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: a */
    public static C0254a m422a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C0254a aVar = new C0254a();
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0197k.f293Q);
            aVar.setVisible(obtainAttributes.getBoolean(C0197k.f295S, true), true);
            C0256c cVar = aVar.f850b;
            if (Build.VERSION.SDK_INT >= 21) {
                cVar.f893f |= obtainAttributes.getChangingConfigurations();
            }
            cVar.f898k = obtainAttributes.getBoolean(C0197k.f296T, cVar.f898k);
            cVar.f901n = obtainAttributes.getBoolean(C0197k.f297U, cVar.f901n);
            cVar.f881C = obtainAttributes.getInt(C0197k.f298V, cVar.f881C);
            cVar.f882D = obtainAttributes.getInt(C0197k.f299W, cVar.f882D);
            aVar.setDither(obtainAttributes.getBoolean(C0197k.f294R, cVar.f913z));
            aVar.mo3385a(resources);
            obtainAttributes.recycle();
            aVar.m423b(context, resources, xmlPullParser, attributeSet, theme);
            aVar.onStateChange(aVar.getState());
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: b */
    private void m423b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int next;
        AttributeSet attributeSet2 = attributeSet;
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 != 1 && ((depth = xmlPullParser.getDepth()) >= depth2 || next2 != 3)) {
                if (next2 != 2 || depth > depth2) {
                    Context context2 = context;
                    Resources resources2 = resources;
                    Resources.Theme theme2 = theme;
                } else if (xmlPullParser.getName().equals("item")) {
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet2, C0197k.f300X);
                    int resourceId = obtainAttributes.getResourceId(C0197k.f301Y, 0);
                    Drawable drawable = null;
                    int resourceId2 = obtainAttributes.getResourceId(C0197k.f302Z, -1);
                    if (resourceId2 > 0) {
                        drawable = C0252a.m419b(context, resourceId2);
                    } else {
                        Context context3 = context;
                    }
                    obtainAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i = 0;
                    for (int i2 = 0; i2 < attributeCount; i2++) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i2);
                        if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                            int i3 = i + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i2, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i] = attributeNameResource;
                            i = i3;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr, i);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next == 2) {
                            drawable = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.m127a(resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        } else {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                    }
                    if (drawable != null) {
                        C0256c cVar = this.f850b;
                        int a = cVar.mo3398a(drawable);
                        cVar.f930L[a] = trimStateSet;
                        cVar.f857b.put(a, Integer.valueOf(resourceId));
                    } else {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                } else {
                    Context context4 = context;
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (xmlPullParser.getName().equals("transition")) {
                        m424c(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private int m424c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0197k.f330aa);
        int resourceId = obtainAttributes.getResourceId(C0197k.f333ad, -1);
        int resourceId2 = obtainAttributes.getResourceId(C0197k.f332ac, -1);
        int resourceId3 = obtainAttributes.getResourceId(C0197k.f331ab, -1);
        Drawable b = resourceId3 > 0 ? C0252a.m419b(context, resourceId3) : null;
        boolean z = obtainAttributes.getBoolean(C0197k.f334ae, false);
        obtainAttributes.recycle();
        if (b == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                b = xmlPullParser.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.m122a(context, resources, xmlPullParser, attributeSet, theme) : Build.VERSION.SDK_INT >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (b == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f850b.mo3374a(resourceId, resourceId2, b, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C0256c mo3338b() {
        return new C0256c(this.f850b, this, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3336a(C0264k kVar) {
        super.mo3336a(kVar);
        if (kVar instanceof C0256c) {
            this.f850b = (C0256c) kVar;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f851c != null) {
            this.f851c.mo3371b();
            this.f851c = null;
            mo3387a(this.f852d);
            this.f852d = -1;
            this.f853e = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f854f && super.mutate() == this) {
            this.f850b.mo3376a();
            this.f854f = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (mo3387a(r0) == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r11) {
        /*
            r10 = this;
            android.support.v7.c.a.c r0 = r10.f850b
            int r0 = r0.mo3375a((int[]) r11)
            int r1 = r10.mo3388c()
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x009b
            android.support.v7.c.a.g r1 = r10.f851c
            if (r1 == 0) goto L_0x0033
            int r4 = r10.f852d
            if (r0 != r4) goto L_0x0019
        L_0x0016:
            r1 = 1
            goto L_0x0092
        L_0x0019:
            int r4 = r10.f853e
            if (r0 != r4) goto L_0x002d
            boolean r4 = r1.mo3381c()
            if (r4 == 0) goto L_0x002d
            r1.mo3382d()
            int r1 = r10.f853e
            r10.f852d = r1
            r10.f853e = r0
            goto L_0x0016
        L_0x002d:
            int r4 = r10.f852d
            r1.mo3371b()
            goto L_0x0037
        L_0x0033:
            int r4 = r10.mo3388c()
        L_0x0037:
            r1 = 0
            r10.f851c = r1
            r1 = -1
            r10.f853e = r1
            r10.f852d = r1
            android.support.v7.c.a.c r1 = r10.f850b
            int r5 = r1.mo3372a((int) r4)
            int r6 = r1.mo3372a((int) r0)
            if (r6 == 0) goto L_0x0091
            if (r5 != 0) goto L_0x004e
            goto L_0x0091
        L_0x004e:
            int r7 = r1.mo3373a(r5, r6)
            if (r7 >= 0) goto L_0x0055
            goto L_0x0091
        L_0x0055:
            boolean r8 = r1.mo3378c(r5, r6)
            r10.mo3387a((int) r7)
            android.graphics.drawable.Drawable r7 = r10.getCurrent()
            boolean r9 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r9 == 0) goto L_0x0070
            boolean r1 = r1.mo3377b(r5, r6)
            android.support.v7.c.a.e r5 = new android.support.v7.c.a.e
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            r5.<init>(r7, r1, r8)
            goto L_0x0087
        L_0x0070:
            boolean r1 = r7 instanceof android.support.graphics.drawable.AnimatedVectorDrawableCompat
            if (r1 == 0) goto L_0x007c
            android.support.v7.c.a.d r5 = new android.support.v7.c.a.d
            android.support.graphics.drawable.AnimatedVectorDrawableCompat r7 = (android.support.graphics.drawable.AnimatedVectorDrawableCompat) r7
            r5.<init>(r7)
            goto L_0x0087
        L_0x007c:
            boolean r1 = r7 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x0091
            android.support.v7.c.a.b r5 = new android.support.v7.c.a.b
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            r5.<init>(r7)
        L_0x0087:
            r5.mo3370a()
            r10.f851c = r5
            r10.f853e = r4
            r10.f852d = r0
            goto L_0x0016
        L_0x0091:
            r1 = 0
        L_0x0092:
            if (r1 != 0) goto L_0x009c
            boolean r0 = r10.mo3387a((int) r0)
            if (r0 == 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            android.graphics.drawable.Drawable r0 = r10.getCurrent()
            if (r0 == 0) goto L_0x00a7
            boolean r11 = r0.setState(r11)
            r2 = r2 | r11
        L_0x00a7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.p014c.p015a.C0254a.onStateChange(int[]):boolean");
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f851c != null && (visible || z2)) {
            if (z) {
                this.f851c.mo3370a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }
}
