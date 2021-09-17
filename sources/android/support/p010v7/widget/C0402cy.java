package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p007v4.graphics.ColorUtils;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.cy */
final class C0402cy {

    /* renamed from: a */
    static final int[] f1805a = {-16842910};

    /* renamed from: b */
    static final int[] f1806b = {16842908};

    /* renamed from: c */
    static final int[] f1807c = {16843518};

    /* renamed from: d */
    static final int[] f1808d = {16842919};

    /* renamed from: e */
    static final int[] f1809e = {16842912};

    /* renamed from: f */
    static final int[] f1810f = {16842913};

    /* renamed from: g */
    static final int[] f1811g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f1812h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f1813i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f1814j = new int[1];

    /* renamed from: a */
    public static int m1301a(Context context, int i) {
        f1814j[0] = i;
        C0407dc a = C0407dc.m1307a(context, (AttributeSet) null, f1814j);
        try {
            return a.mo4548b(0, 0);
        } finally {
            a.mo4546a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m1302b(Context context, int i) {
        f1814j[0] = i;
        C0407dc a = C0407dc.m1307a(context, (AttributeSet) null, f1814j);
        try {
            return a.mo4557f(0);
        } finally {
            a.mo4546a();
        }
    }

    /* renamed from: c */
    public static int m1303c(Context context, int i) {
        ColorStateList b = m1302b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f1805a, b.getDefaultColor());
        }
        TypedValue typedValue = f1813i.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f1813i.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int a = m1301a(context, i);
        return ColorUtils.setAlphaComponent(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
