package android.support.p007v4.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: android.support.v4.content.res.ComplexColorCompat */
public final class ComplexColorCompat {
    private static final String LOG_TAG = "ComplexColorCompat";
    private int mColor;
    private final ColorStateList mColorStateList;
    private final Shader mShader;

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i) {
        this.mShader = shader;
        this.mColorStateList = colorStateList;
        this.mColor = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r1.equals("gradient") != false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p007v4.content.res.ComplexColorCompat createFromXml(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r7)
        L_0x0008:
            int r1 = r7.next()
            r2 = 1
            r3 = 2
            if (r1 == r3) goto L_0x0012
            if (r1 != r2) goto L_0x0008
        L_0x0012:
            if (r1 != r3) goto L_0x006f
            java.lang.String r1 = r7.getName()
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 89650992(0x557f730, float:1.01546526E-35)
            if (r4 == r5) goto L_0x0032
            r2 = 1191572447(0x4705f3df, float:34291.87)
            if (r4 == r2) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x003b
            r2 = 0
            goto L_0x003c
        L_0x0032:
            java.lang.String r4 = "gradient"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            r2 = -1
        L_0x003c:
            switch(r2) {
                case 0: goto L_0x0066;
                case 1: goto L_0x005d;
                default: goto L_0x003f;
            }
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getPositionDescription()
            r8.append(r7)
            java.lang.String r7 = ": unsupported complex color tag "
            r8.append(r7)
            r8.append(r1)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L_0x005d:
            android.graphics.Shader r6 = android.support.p007v4.content.res.GradientColorInflaterCompat.createFromXmlInner(r6, r7, r0, r8)
            android.support.v4.content.res.ComplexColorCompat r6 = from((android.graphics.Shader) r6)
            return r6
        L_0x0066:
            android.content.res.ColorStateList r6 = android.support.p007v4.content.res.ColorStateListInflaterCompat.createFromXmlInner(r6, r7, r0, r8)
            android.support.v4.content.res.ComplexColorCompat r6 = from((android.content.res.ColorStateList) r6)
            return r6
        L_0x006f:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.content.res.ComplexColorCompat.createFromXml(android.content.res.Resources, int, android.content.res.Resources$Theme):android.support.v4.content.res.ComplexColorCompat");
    }

    static ComplexColorCompat from(int i) {
        return new ComplexColorCompat((Shader) null, (ColorStateList) null, i);
    }

    static ComplexColorCompat from(ColorStateList colorStateList) {
        return new ComplexColorCompat((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    static ComplexColorCompat from(Shader shader) {
        return new ComplexColorCompat(shader, (ColorStateList) null, 0);
    }

    public static ComplexColorCompat inflate(Resources resources, int i, Resources.Theme theme) {
        try {
            return createFromXml(resources, i, theme);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    public final int getColor() {
        return this.mColor;
    }

    public final Shader getShader() {
        return this.mShader;
    }

    public final boolean isGradient() {
        return this.mShader != null;
    }

    public final boolean isStateful() {
        return this.mShader == null && this.mColorStateList != null && this.mColorStateList.isStateful();
    }

    public final boolean onStateChanged(int[] iArr) {
        int colorForState;
        if (!isStateful() || (colorForState = this.mColorStateList.getColorForState(iArr, this.mColorStateList.getDefaultColor())) == this.mColor) {
            return false;
        }
        this.mColor = colorForState;
        return true;
    }

    public final void setColor(int i) {
        this.mColor = i;
    }

    public final boolean willDraw() {
        return isGradient() || this.mColor != 0;
    }
}
