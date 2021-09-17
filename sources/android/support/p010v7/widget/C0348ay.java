package android.support.p010v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.content.res.ResourcesCompat;
import android.support.p007v4.widget.AutoSizeableTextView;
import android.support.p007v4.widget.TextViewCompat;
import android.support.p010v7.p011a.C0197k;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.ay */
final class C0348ay {

    /* renamed from: a */
    private final TextView f1668a;

    /* renamed from: b */
    private C0405da f1669b;

    /* renamed from: c */
    private C0405da f1670c;

    /* renamed from: d */
    private C0405da f1671d;

    /* renamed from: e */
    private C0405da f1672e;

    /* renamed from: f */
    private C0405da f1673f;

    /* renamed from: g */
    private C0405da f1674g;

    /* renamed from: h */
    private final C0351ba f1675h;

    /* renamed from: i */
    private int f1676i = 0;

    /* renamed from: j */
    private Typeface f1677j;

    /* renamed from: k */
    private boolean f1678k;

    C0348ay(TextView textView) {
        this.f1668a = textView;
        this.f1675h = new C0351ba(this.f1668a);
    }

    /* renamed from: a */
    private static C0405da m1158a(Context context, C0332ai aiVar, int i) {
        ColorStateList b = aiVar.mo4306b(context, i);
        if (b == null) {
            return null;
        }
        C0405da daVar = new C0405da();
        daVar.f1823d = true;
        daVar.f1820a = b;
        return daVar;
    }

    /* renamed from: a */
    private void m1159a(Context context, C0407dc dcVar) {
        String d;
        Typeface typeface;
        this.f1676i = dcVar.mo4543a(C0197k.f496dh, this.f1676i);
        boolean z = true;
        if (dcVar.mo4560h(C0197k.f500dl) || dcVar.mo4560h(C0197k.f501dm)) {
            this.f1677j = null;
            int i = dcVar.mo4560h(C0197k.f501dm) ? C0197k.f501dm : C0197k.f500dl;
            if (!context.isRestricted()) {
                try {
                    this.f1677j = dcVar.mo4544a(i, this.f1676i, (ResourcesCompat.FontCallback) new C0349az(this, new WeakReference(this.f1668a)));
                    if (this.f1677j != null) {
                        z = false;
                    }
                    this.f1678k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1677j == null && (d = dcVar.mo4553d(i)) != null) {
                this.f1677j = Typeface.create(d, this.f1676i);
            }
        } else if (dcVar.mo4560h(C0197k.f495dg)) {
            this.f1678k = false;
            switch (dcVar.mo4543a(C0197k.f495dg, 1)) {
                case 1:
                    typeface = Typeface.SANS_SERIF;
                    break;
                case 2:
                    typeface = Typeface.SERIF;
                    break;
                case 3:
                    this.f1677j = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
            this.f1677j = typeface;
        }
    }

    /* renamed from: a */
    private void m1160a(Drawable drawable, C0405da daVar) {
        if (drawable != null && daVar != null) {
            C0332ai.m1111a(drawable, daVar, this.f1668a.getDrawableState());
        }
    }

    /* renamed from: a */
    private void m1161a(boolean z) {
        this.f1668a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4343a() {
        if (!(this.f1669b == null && this.f1670c == null && this.f1671d == null && this.f1672e == null)) {
            Drawable[] compoundDrawables = this.f1668a.getCompoundDrawables();
            m1160a(compoundDrawables[0], this.f1669b);
            m1160a(compoundDrawables[1], this.f1670c);
            m1160a(compoundDrawables[2], this.f1671d);
            m1160a(compoundDrawables[3], this.f1672e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1673f != null || this.f1674g != null) {
            Drawable[] compoundDrawablesRelative = this.f1668a.getCompoundDrawablesRelative();
            m1160a(compoundDrawablesRelative[0], this.f1673f);
            m1160a(compoundDrawablesRelative[2], this.f1674g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4344a(int i) {
        this.f1675h.mo4361a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4345a(int i, float f) {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !this.f1675h.mo4371g()) {
            this.f1675h.mo4362a(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4346a(int i, int i2, int i3, int i4) {
        this.f1675h.mo4363a(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4347a(Context context, int i) {
        ColorStateList f;
        C0407dc a = C0407dc.m1306a(context, i, C0197k.f493de);
        if (a.mo4560h(C0197k.f502dn)) {
            m1161a(a.mo4547a(C0197k.f502dn, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo4560h(C0197k.f497di) && (f = a.mo4557f(C0197k.f497di)) != null) {
            this.f1668a.setTextColor(f);
        }
        if (a.mo4560h(C0197k.f494df) && a.mo4555e(C0197k.f494df, -1) == 0) {
            this.f1668a.setTextSize(0, 0.0f);
        }
        m1159a(context, a);
        a.mo4546a();
        if (this.f1677j != null) {
            this.f1668a.setTypeface(this.f1677j, this.f1676i);
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public final void mo4348a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        Context context = this.f1668a.getContext();
        C0332ai a = C0332ai.m1109a();
        C0407dc a2 = C0407dc.m1308a(context, attributeSet2, C0197k.f344ao, i2, 0);
        int g = a2.mo4558g(C0197k.f345ap, -1);
        if (a2.mo4560h(C0197k.f348as)) {
            this.f1669b = m1158a(context, a, a2.mo4558g(C0197k.f348as, 0));
        }
        if (a2.mo4560h(C0197k.f346aq)) {
            this.f1670c = m1158a(context, a, a2.mo4558g(C0197k.f346aq, 0));
        }
        if (a2.mo4560h(C0197k.f349at)) {
            this.f1671d = m1158a(context, a, a2.mo4558g(C0197k.f349at, 0));
        }
        if (a2.mo4560h(C0197k.f347ar)) {
            this.f1672e = m1158a(context, a, a2.mo4558g(C0197k.f347ar, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (a2.mo4560h(C0197k.f350au)) {
                this.f1673f = m1158a(context, a, a2.mo4558g(C0197k.f350au, 0));
            }
            if (a2.mo4560h(C0197k.f351av)) {
                this.f1674g = m1158a(context, a, a2.mo4558g(C0197k.f351av, 0));
            }
        }
        a2.mo4546a();
        boolean z3 = this.f1668a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z4 = true;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            C0407dc a3 = C0407dc.m1306a(context, g, C0197k.f493de);
            if (z3 || !a3.mo4560h(C0197k.f502dn)) {
                z2 = false;
                z = false;
            } else {
                z = a3.mo4547a(C0197k.f502dn, false);
                z2 = true;
            }
            m1159a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList f = a3.mo4560h(C0197k.f497di) ? a3.mo4557f(C0197k.f497di) : null;
                colorStateList = a3.mo4560h(C0197k.f498dj) ? a3.mo4557f(C0197k.f498dj) : null;
                if (a3.mo4560h(C0197k.f499dk)) {
                    colorStateList3 = a3.mo4557f(C0197k.f499dk);
                }
                ColorStateList colorStateList4 = f;
                colorStateList2 = colorStateList3;
                colorStateList3 = colorStateList4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            a3.mo4546a();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        C0407dc a4 = C0407dc.m1308a(context, attributeSet2, C0197k.f493de, i2, 0);
        if (z3 || !a4.mo4560h(C0197k.f502dn)) {
            z4 = z2;
        } else {
            z = a4.mo4547a(C0197k.f502dn, false);
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.mo4560h(C0197k.f497di)) {
                colorStateList3 = a4.mo4557f(C0197k.f497di);
            }
            if (a4.mo4560h(C0197k.f498dj)) {
                colorStateList = a4.mo4557f(C0197k.f498dj);
            }
            if (a4.mo4560h(C0197k.f499dk)) {
                colorStateList2 = a4.mo4557f(C0197k.f499dk);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.mo4560h(C0197k.f494df) && a4.mo4555e(C0197k.f494df, -1) == 0) {
            this.f1668a.setTextSize(0, 0.0f);
        }
        m1159a(context, a4);
        a4.mo4546a();
        if (colorStateList3 != null) {
            this.f1668a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f1668a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f1668a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z4) {
            m1161a(z);
        }
        if (this.f1677j != null) {
            this.f1668a.setTypeface(this.f1677j, this.f1676i);
        }
        this.f1675h.mo4364a(attributeSet2, i2);
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && this.f1675h.mo4360a() != 0) {
            int[] e = this.f1675h.mo4369e();
            if (e.length > 0) {
                if (((float) this.f1668a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1668a.setAutoSizeTextTypeUniformWithConfiguration(this.f1675h.mo4367c(), this.f1675h.mo4368d(), this.f1675h.mo4366b(), 0);
                } else {
                    this.f1668a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        C0407dc a5 = C0407dc.m1307a(context, attributeSet2, C0197k.f352aw);
        int e2 = a5.mo4555e(C0197k.f306aC, -1);
        int e3 = a5.mo4555e(C0197k.f307aD, -1);
        int e4 = a5.mo4555e(C0197k.f308aE, -1);
        a5.mo4546a();
        if (e2 != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(this.f1668a, e2);
        }
        if (e3 != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(this.f1668a, e3);
        }
        if (e4 != -1) {
            TextViewCompat.setLineHeight(this.f1668a, e4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4349a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1678k) {
            this.f1677j = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1676i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4350a(int[] iArr, int i) {
        this.f1675h.mo4365a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4351b() {
        if (!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            this.f1675h.mo4370f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4352c() {
        this.f1675h.mo4370f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo4353d() {
        return this.f1675h.mo4371g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo4354e() {
        return this.f1675h.mo4360a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo4355f() {
        return this.f1675h.mo4366b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo4356g() {
        return this.f1675h.mo4367c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo4357h() {
        return this.f1675h.mo4368d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int[] mo4358i() {
        return this.f1675h.mo4369e();
    }
}
