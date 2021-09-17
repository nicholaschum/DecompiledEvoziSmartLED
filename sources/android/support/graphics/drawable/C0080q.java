package android.support.graphics.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Shader;
import android.support.p007v4.content.res.ComplexColorCompat;
import android.support.p007v4.util.ArrayMap;

/* renamed from: android.support.graphics.drawable.q */
final class C0080q {

    /* renamed from: n */
    private static final Matrix f238n = new Matrix();

    /* renamed from: a */
    Paint f239a;

    /* renamed from: b */
    Paint f240b;

    /* renamed from: c */
    final C0077n f241c;

    /* renamed from: d */
    float f242d;

    /* renamed from: e */
    float f243e;

    /* renamed from: f */
    float f244f;

    /* renamed from: g */
    float f245g;

    /* renamed from: h */
    int f246h;

    /* renamed from: i */
    String f247i;

    /* renamed from: j */
    Boolean f248j;

    /* renamed from: k */
    final ArrayMap<String, Object> f249k;

    /* renamed from: l */
    private final Path f250l;

    /* renamed from: m */
    private final Path f251m;

    /* renamed from: o */
    private final Matrix f252o;

    /* renamed from: p */
    private PathMeasure f253p;

    /* renamed from: q */
    private int f254q;

    public C0080q() {
        this.f252o = new Matrix();
        this.f242d = 0.0f;
        this.f243e = 0.0f;
        this.f244f = 0.0f;
        this.f245g = 0.0f;
        this.f246h = 255;
        this.f247i = null;
        this.f248j = null;
        this.f249k = new ArrayMap<>();
        this.f241c = new C0077n();
        this.f250l = new Path();
        this.f251m = new Path();
    }

    public C0080q(C0080q qVar) {
        this.f252o = new Matrix();
        this.f242d = 0.0f;
        this.f243e = 0.0f;
        this.f244f = 0.0f;
        this.f245g = 0.0f;
        this.f246h = 255;
        this.f247i = null;
        this.f248j = null;
        this.f249k = new ArrayMap<>();
        this.f241c = new C0077n(qVar.f241c, this.f249k);
        this.f250l = new Path(qVar.f250l);
        this.f251m = new Path(qVar.f251m);
        this.f242d = qVar.f242d;
        this.f243e = qVar.f243e;
        this.f244f = qVar.f244f;
        this.f245g = qVar.f245g;
        this.f254q = qVar.f254q;
        this.f246h = qVar.f246h;
        this.f247i = qVar.f247i;
        if (qVar.f247i != null) {
            this.f249k.put(qVar.f247i, this);
        }
        this.f248j = qVar.f248j;
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* renamed from: a */
    private void m158a(C0077n nVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        C0080q qVar;
        float f;
        C0080q qVar2 = this;
        C0077n nVar2 = nVar;
        Canvas canvas2 = canvas;
        ColorFilter colorFilter2 = colorFilter;
        nVar2.f222a.set(matrix);
        nVar2.f222a.preConcat(nVar2.f225d);
        canvas.save();
        ? r11 = 0;
        int i3 = 0;
        while (i3 < nVar2.f223b.size()) {
            C0078o oVar = nVar2.f223b.get(i3);
            if (oVar instanceof C0077n) {
                m158a((C0077n) oVar, nVar2.f222a, canvas, i, i2, colorFilter);
            } else if (oVar instanceof C0079p) {
                C0079p pVar = (C0079p) oVar;
                float f2 = ((float) i) / qVar2.f244f;
                float f3 = ((float) i2) / qVar2.f245g;
                float min = Math.min(f2, f3);
                Matrix matrix2 = nVar2.f222a;
                qVar2.f252o.set(matrix2);
                qVar2.f252o.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float f4 = min;
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    qVar = this;
                    pVar.mo257a(qVar.f250l);
                    Path path = qVar.f250l;
                    qVar.f251m.reset();
                    if (pVar.mo220a()) {
                        qVar.f251m.addPath(path, qVar.f252o);
                        canvas2.clipPath(qVar.f251m);
                    } else {
                        C0076m mVar = (C0076m) pVar;
                        if (!(mVar.f215g == 0.0f && mVar.f216h == 1.0f)) {
                            float f6 = (mVar.f215g + mVar.f217i) % 1.0f;
                            float f7 = (mVar.f216h + mVar.f217i) % 1.0f;
                            if (qVar.f253p == null) {
                                qVar.f253p = new PathMeasure();
                            }
                            qVar.f253p.setPath(qVar.f250l, r11);
                            float length = qVar.f253p.getLength();
                            float f8 = f6 * length;
                            float f9 = f7 * length;
                            path.reset();
                            if (f8 > f9) {
                                qVar.f253p.getSegment(f8, length, path, true);
                                f = 0.0f;
                                qVar.f253p.getSegment(0.0f, f9, path, true);
                            } else {
                                f = 0.0f;
                                qVar.f253p.getSegment(f8, f9, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        qVar.f251m.addPath(path, qVar.f252o);
                        if (mVar.f211c.willDraw()) {
                            ComplexColorCompat complexColorCompat = mVar.f211c;
                            if (qVar.f240b == null) {
                                qVar.f240b = new Paint(1);
                                qVar.f240b.setStyle(Paint.Style.FILL);
                            }
                            Paint paint = qVar.f240b;
                            if (complexColorCompat.isGradient()) {
                                Shader shader = complexColorCompat.getShader();
                                shader.setLocalMatrix(qVar.f252o);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(mVar.f214f * 255.0f));
                            } else {
                                paint.setColor(VectorDrawableCompat.m124a(complexColorCompat.getColor(), mVar.f214f));
                            }
                            paint.setColorFilter(colorFilter2);
                            qVar.f251m.setFillType(mVar.f213e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas2.drawPath(qVar.f251m, paint);
                        }
                        if (mVar.f209a.willDraw()) {
                            ComplexColorCompat complexColorCompat2 = mVar.f209a;
                            if (qVar.f239a == null) {
                                qVar.f239a = new Paint(1);
                                qVar.f239a.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint2 = qVar.f239a;
                            if (mVar.f219k != null) {
                                paint2.setStrokeJoin(mVar.f219k);
                            }
                            if (mVar.f218j != null) {
                                paint2.setStrokeCap(mVar.f218j);
                            }
                            paint2.setStrokeMiter(mVar.f220l);
                            if (complexColorCompat2.isGradient()) {
                                Shader shader2 = complexColorCompat2.getShader();
                                shader2.setLocalMatrix(qVar.f252o);
                                paint2.setShader(shader2);
                                paint2.setAlpha(Math.round(mVar.f212d * 255.0f));
                            } else {
                                paint2.setColor(VectorDrawableCompat.m124a(complexColorCompat2.getColor(), mVar.f212d));
                            }
                            paint2.setColorFilter(colorFilter2);
                            paint2.setStrokeWidth(mVar.f210b * abs * f4);
                            canvas2.drawPath(qVar.f251m, paint2);
                        }
                    }
                } else {
                    qVar = this;
                }
                i3++;
                qVar2 = qVar;
                r11 = 0;
            }
            int i4 = i;
            int i5 = i2;
            qVar = qVar2;
            i3++;
            qVar2 = qVar;
            r11 = 0;
        }
        C0080q qVar3 = qVar2;
        canvas.restore();
    }

    /* renamed from: a */
    public final void mo261a(Canvas canvas, int i, int i2) {
        m158a(this.f241c, f238n, canvas, i, i2, (ColorFilter) null);
    }

    /* renamed from: a */
    public final boolean mo262a() {
        if (this.f248j == null) {
            this.f248j = Boolean.valueOf(this.f241c.mo223b());
        }
        return this.f248j.booleanValue();
    }

    public final float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public final int getRootAlpha() {
        return this.f246h;
    }

    public final void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public final void setRootAlpha(int i) {
        this.f246h = i;
    }
}
