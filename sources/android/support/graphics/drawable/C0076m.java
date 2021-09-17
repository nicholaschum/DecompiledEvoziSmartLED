package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.support.p007v4.content.res.ComplexColorCompat;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.graphics.PathParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.graphics.drawable.m */
final class C0076m extends C0079p {

    /* renamed from: a */
    ComplexColorCompat f209a;

    /* renamed from: b */
    float f210b = 0.0f;

    /* renamed from: c */
    ComplexColorCompat f211c;

    /* renamed from: d */
    float f212d = 1.0f;

    /* renamed from: e */
    int f213e = 0;

    /* renamed from: f */
    float f214f = 1.0f;

    /* renamed from: g */
    float f215g = 0.0f;

    /* renamed from: h */
    float f216h = 1.0f;

    /* renamed from: i */
    float f217i = 0.0f;

    /* renamed from: j */
    Paint.Cap f218j = Paint.Cap.BUTT;

    /* renamed from: k */
    Paint.Join f219k = Paint.Join.MITER;

    /* renamed from: l */
    float f220l = 4.0f;

    /* renamed from: p */
    private int[] f221p;

    public C0076m() {
    }

    public C0076m(C0076m mVar) {
        super(mVar);
        this.f221p = mVar.f221p;
        this.f209a = mVar.f209a;
        this.f210b = mVar.f210b;
        this.f212d = mVar.f212d;
        this.f211c = mVar.f211c;
        this.f213e = mVar.f213e;
        this.f214f = mVar.f214f;
        this.f215g = mVar.f215g;
        this.f216h = mVar.f216h;
        this.f217i = mVar.f217i;
        this.f218j = mVar.f218j;
        this.f219k = mVar.f219k;
        this.f220l = mVar.f220l;
    }

    /* renamed from: a */
    public final void mo221a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f187c);
        this.f221p = null;
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f236n = string;
            }
            String string2 = obtainAttributes.getString(2);
            if (string2 != null) {
                this.f235m = PathParser.createNodesFromPathData(string2);
            }
            this.f211c = TypedArrayUtils.getNamedComplexColor(obtainAttributes, xmlPullParser, theme, "fillColor", 1, 0);
            this.f214f = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "fillAlpha", 12, this.f214f);
            int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "strokeLineCap", 8, -1);
            Paint.Cap cap = this.f218j;
            switch (namedInt) {
                case 0:
                    cap = Paint.Cap.BUTT;
                    break;
                case 1:
                    cap = Paint.Cap.ROUND;
                    break;
                case 2:
                    cap = Paint.Cap.SQUARE;
                    break;
            }
            this.f218j = cap;
            int namedInt2 = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "strokeLineJoin", 9, -1);
            Paint.Join join = this.f219k;
            switch (namedInt2) {
                case 0:
                    join = Paint.Join.MITER;
                    break;
                case 1:
                    join = Paint.Join.ROUND;
                    break;
                case 2:
                    join = Paint.Join.BEVEL;
                    break;
            }
            this.f219k = join;
            this.f220l = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "strokeMiterLimit", 10, this.f220l);
            this.f209a = TypedArrayUtils.getNamedComplexColor(obtainAttributes, xmlPullParser, theme, "strokeColor", 3, 0);
            this.f212d = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "strokeAlpha", 11, this.f212d);
            this.f210b = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "strokeWidth", 4, this.f210b);
            this.f216h = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "trimPathEnd", 6, this.f216h);
            this.f217i = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "trimPathOffset", 7, this.f217i);
            this.f215g = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "trimPathStart", 5, this.f215g);
            this.f213e = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "fillType", 13, this.f213e);
        }
        obtainAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo222a(int[] iArr) {
        return this.f209a.onStateChanged(iArr) | this.f211c.onStateChanged(iArr);
    }

    /* renamed from: b */
    public final boolean mo223b() {
        return this.f211c.isStateful() || this.f209a.isStateful();
    }

    /* access modifiers changed from: package-private */
    public final float getFillAlpha() {
        return this.f214f;
    }

    /* access modifiers changed from: package-private */
    public final int getFillColor() {
        return this.f211c.getColor();
    }

    /* access modifiers changed from: package-private */
    public final float getStrokeAlpha() {
        return this.f212d;
    }

    /* access modifiers changed from: package-private */
    public final int getStrokeColor() {
        return this.f209a.getColor();
    }

    /* access modifiers changed from: package-private */
    public final float getStrokeWidth() {
        return this.f210b;
    }

    /* access modifiers changed from: package-private */
    public final float getTrimPathEnd() {
        return this.f216h;
    }

    /* access modifiers changed from: package-private */
    public final float getTrimPathOffset() {
        return this.f217i;
    }

    /* access modifiers changed from: package-private */
    public final float getTrimPathStart() {
        return this.f215g;
    }

    /* access modifiers changed from: package-private */
    public final void setFillAlpha(float f) {
        this.f214f = f;
    }

    /* access modifiers changed from: package-private */
    public final void setFillColor(int i) {
        this.f211c.setColor(i);
    }

    /* access modifiers changed from: package-private */
    public final void setStrokeAlpha(float f) {
        this.f212d = f;
    }

    /* access modifiers changed from: package-private */
    public final void setStrokeColor(int i) {
        this.f209a.setColor(i);
    }

    /* access modifiers changed from: package-private */
    public final void setStrokeWidth(float f) {
        this.f210b = f;
    }

    /* access modifiers changed from: package-private */
    public final void setTrimPathEnd(float f) {
        this.f216h = f;
    }

    /* access modifiers changed from: package-private */
    public final void setTrimPathOffset(float f) {
        this.f217i = f;
    }

    /* access modifiers changed from: package-private */
    public final void setTrimPathStart(float f) {
        this.f215g = f;
    }
}
