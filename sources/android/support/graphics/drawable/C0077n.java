package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.util.ArrayMap;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.graphics.drawable.n */
final class C0077n extends C0078o {

    /* renamed from: a */
    final Matrix f222a = new Matrix();

    /* renamed from: b */
    final ArrayList<C0078o> f223b = new ArrayList<>();

    /* renamed from: c */
    float f224c = 0.0f;

    /* renamed from: d */
    final Matrix f225d = new Matrix();

    /* renamed from: e */
    int f226e;

    /* renamed from: f */
    private float f227f = 0.0f;

    /* renamed from: g */
    private float f228g = 0.0f;

    /* renamed from: h */
    private float f229h = 1.0f;

    /* renamed from: i */
    private float f230i = 1.0f;

    /* renamed from: j */
    private float f231j = 0.0f;

    /* renamed from: k */
    private float f232k = 0.0f;

    /* renamed from: l */
    private int[] f233l;

    /* renamed from: m */
    private String f234m = null;

    public C0077n() {
        super((byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0077n(C0077n nVar, ArrayMap<String, Object> arrayMap) {
        super((byte) 0);
        C0079p pVar;
        this.f224c = nVar.f224c;
        this.f227f = nVar.f227f;
        this.f228g = nVar.f228g;
        this.f229h = nVar.f229h;
        this.f230i = nVar.f230i;
        this.f231j = nVar.f231j;
        this.f232k = nVar.f232k;
        this.f233l = nVar.f233l;
        this.f234m = nVar.f234m;
        this.f226e = nVar.f226e;
        if (this.f234m != null) {
            arrayMap.put(this.f234m, this);
        }
        this.f225d.set(nVar.f225d);
        ArrayList<C0078o> arrayList = nVar.f223b;
        for (int i = 0; i < arrayList.size(); i++) {
            C0078o oVar = arrayList.get(i);
            if (oVar instanceof C0077n) {
                this.f223b.add(new C0077n((C0077n) oVar, arrayMap));
            } else {
                if (oVar instanceof C0076m) {
                    pVar = new C0076m((C0076m) oVar);
                } else if (oVar instanceof C0075l) {
                    pVar = new C0075l((C0075l) oVar);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f223b.add(pVar);
                if (pVar.f236n != null) {
                    arrayMap.put(pVar.f236n, pVar);
                }
            }
        }
    }

    /* renamed from: a */
    private void m150a() {
        this.f225d.reset();
        this.f225d.postTranslate(-this.f227f, -this.f228g);
        this.f225d.postScale(this.f229h, this.f230i);
        this.f225d.postRotate(this.f224c, 0.0f, 0.0f);
        this.f225d.postTranslate(this.f231j + this.f227f, this.f232k + this.f228g);
    }

    /* renamed from: a */
    public final void mo240a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f186b);
        this.f233l = null;
        this.f224c = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "rotation", 5, this.f224c);
        this.f227f = obtainAttributes.getFloat(1, this.f227f);
        this.f228g = obtainAttributes.getFloat(2, this.f228g);
        this.f229h = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "scaleX", 3, this.f229h);
        this.f230i = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "scaleY", 4, this.f230i);
        this.f231j = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "translateX", 6, this.f231j);
        this.f232k = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "translateY", 7, this.f232k);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.f234m = string;
        }
        m150a();
        obtainAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean mo222a(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f223b.size(); i++) {
            z |= this.f223b.get(i).mo222a(iArr);
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo223b() {
        for (int i = 0; i < this.f223b.size(); i++) {
            if (this.f223b.get(i).mo223b()) {
                return true;
            }
        }
        return false;
    }

    public final String getGroupName() {
        return this.f234m;
    }

    public final Matrix getLocalMatrix() {
        return this.f225d;
    }

    public final float getPivotX() {
        return this.f227f;
    }

    public final float getPivotY() {
        return this.f228g;
    }

    public final float getRotation() {
        return this.f224c;
    }

    public final float getScaleX() {
        return this.f229h;
    }

    public final float getScaleY() {
        return this.f230i;
    }

    public final float getTranslateX() {
        return this.f231j;
    }

    public final float getTranslateY() {
        return this.f232k;
    }

    public final void setPivotX(float f) {
        if (f != this.f227f) {
            this.f227f = f;
            m150a();
        }
    }

    public final void setPivotY(float f) {
        if (f != this.f228g) {
            this.f228g = f;
            m150a();
        }
    }

    public final void setRotation(float f) {
        if (f != this.f224c) {
            this.f224c = f;
            m150a();
        }
    }

    public final void setScaleX(float f) {
        if (f != this.f229h) {
            this.f229h = f;
            m150a();
        }
    }

    public final void setScaleY(float f) {
        if (f != this.f230i) {
            this.f230i = f;
            m150a();
        }
    }

    public final void setTranslateX(float f) {
        if (f != this.f231j) {
            this.f231j = f;
            m150a();
        }
    }

    public final void setTranslateY(float f) {
        if (f != this.f232k) {
            this.f232k = f;
            m150a();
        }
    }
}
