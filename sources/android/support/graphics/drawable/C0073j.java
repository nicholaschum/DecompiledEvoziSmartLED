package android.support.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.graphics.PathParser;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.graphics.drawable.j */
public final class C0073j implements Interpolator {

    /* renamed from: a */
    private float[] f206a;

    /* renamed from: b */
    private float[] f207b;

    public C0073j(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private C0073j(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        Path path;
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f196l);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "pathData", 4);
            Path createPathFromPathData = PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData != null) {
                m144a(createPathFromPathData);
            } else {
                throw new InflateException("The path is null, which is created from ".concat(String.valueOf(namedString)));
            }
        } else if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
            float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlX1", 0, 0.0f);
            float namedFloat2 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlY1", 1, 0.0f);
            boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
            if (hasAttribute == TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
                if (!hasAttribute) {
                    path = new Path();
                    path.moveTo(0.0f, 0.0f);
                    path.quadTo(namedFloat, namedFloat2, 1.0f, 1.0f);
                } else {
                    float namedFloat3 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlX2", 2, 0.0f);
                    float namedFloat4 = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "controlY2", 3, 0.0f);
                    path = new Path();
                    path.moveTo(0.0f, 0.0f);
                    path.cubicTo(namedFloat, namedFloat2, namedFloat3, namedFloat4, 1.0f, 1.0f);
                }
                m144a(path);
            } else {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        obtainAttributes.recycle();
    }

    /* renamed from: a */
    private void m144a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f206a = new float[min];
            this.f207b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f206a[i2] = fArr[0];
                this.f207b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f206a[0])) <= 1.0E-5d && ((double) Math.abs(this.f207b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f206a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f207b[i3] - 1.0f)) <= 1.0E-5d) {
                    int i4 = 0;
                    float f = 0.0f;
                    while (i < min) {
                        int i5 = i4 + 1;
                        float f2 = this.f206a[i4];
                        if (f2 >= f) {
                            this.f206a[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :".concat(String.valueOf(f2)));
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f206a[0]);
            sb.append(",");
            sb.append(this.f207b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f206a[i6]);
            sb.append(",");
            sb.append(this.f207b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length ".concat(String.valueOf(length)));
    }

    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f206a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f206a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.f206a[length] - this.f206a[i];
        if (f2 == 0.0f) {
            return this.f207b[i];
        }
        float f3 = this.f207b[i];
        return f3 + (((f - this.f206a[i]) / f2) * (this.f207b[length] - f3));
    }
}
