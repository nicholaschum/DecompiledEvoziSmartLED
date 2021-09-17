package android.support.p010v7.p014c.p015a;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.c.a.m */
public final class C0266m extends Drawable {

    /* renamed from: b */
    private static final float f915b = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f916a;

    /* renamed from: c */
    private float f917c;

    /* renamed from: d */
    private float f918d;

    /* renamed from: e */
    private float f919e;

    /* renamed from: f */
    private float f920f;

    /* renamed from: g */
    private boolean f921g;

    /* renamed from: h */
    private final Path f922h;

    /* renamed from: i */
    private final int f923i;

    /* renamed from: j */
    private boolean f924j;

    /* renamed from: k */
    private float f925k;

    /* renamed from: l */
    private float f926l;

    /* renamed from: m */
    private int f927m;

    /* renamed from: a */
    public final void mo3447a(float f) {
        if (this.f925k != f) {
            this.f925k = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo3448a(boolean z) {
        if (this.f924j != z) {
            this.f924j = z;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (android.support.p007v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19) == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (android.support.p007v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19) == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.graphics.Rect r2 = r19.getBounds()
            int r3 = r0.f927m
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x001a
            switch(r3) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r3 = android.support.p007v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19)
            if (r3 != r6) goto L_0x0021
        L_0x0018:
            r5 = 1
            goto L_0x0021
        L_0x001a:
            int r3 = android.support.p007v4.graphics.drawable.DrawableCompat.getLayoutDirection(r19)
            if (r3 != 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            float r3 = r0.f917c
            float r4 = r0.f917c
            float r3 = r3 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.f918d
            float r8 = r0.f925k
            float r3 = r3 - r7
            float r3 = r3 * r8
            float r7 = r7 + r3
            float r3 = r0.f918d
            float r8 = r0.f919e
            float r9 = r0.f925k
            float r8 = r8 - r3
            float r8 = r8 * r9
            float r3 = r3 + r8
            float r8 = r0.f926l
            float r9 = r0.f925k
            r10 = 0
            float r8 = r8 - r10
            float r8 = r8 * r9
            float r8 = r8 + r10
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = f915b
            float r11 = r0.f925k
            float r9 = r9 - r10
            float r9 = r9 * r11
            float r9 = r9 + r10
            if (r5 == 0) goto L_0x005d
            r11 = 0
            goto L_0x005f
        L_0x005d:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x005f:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r5 == 0) goto L_0x0066
            r13 = 1127481344(0x43340000, float:180.0)
            goto L_0x0067
        L_0x0066:
            r13 = 0
        L_0x0067:
            float r14 = r0.f925k
            float r13 = r13 - r11
            float r13 = r13 * r14
            float r11 = r11 + r13
            double r13 = (double) r7
            double r6 = (double) r9
            double r16 = java.lang.Math.cos(r6)
            double r16 = r16 * r13
            r18 = r11
            long r10 = java.lang.Math.round(r16)
            float r9 = (float) r10
            double r6 = java.lang.Math.sin(r6)
            double r13 = r13 * r6
            long r6 = java.lang.Math.round(r13)
            float r6 = (float) r6
            android.graphics.Path r7 = r0.f922h
            r7.rewind()
            float r7 = r0.f920f
            android.graphics.Paint r10 = r0.f916a
            float r10 = r10.getStrokeWidth()
            float r7 = r7 + r10
            float r10 = r0.f926l
            float r10 = -r10
            float r11 = r0.f925k
            float r10 = r10 - r7
            float r10 = r10 * r11
            float r7 = r7 + r10
            float r10 = -r3
            float r10 = r10 / r4
            android.graphics.Path r11 = r0.f922h
            float r13 = r10 + r8
            r14 = 0
            r11.moveTo(r13, r14)
            android.graphics.Path r11 = r0.f922h
            float r8 = r8 * r4
            float r3 = r3 - r8
            r11.rLineTo(r3, r14)
            android.graphics.Path r3 = r0.f922h
            r3.moveTo(r10, r7)
            android.graphics.Path r3 = r0.f922h
            r3.rLineTo(r9, r6)
            android.graphics.Path r3 = r0.f922h
            float r7 = -r7
            r3.moveTo(r10, r7)
            android.graphics.Path r3 = r0.f922h
            float r6 = -r6
            r3.rLineTo(r9, r6)
            android.graphics.Path r3 = r0.f922h
            r3.close()
            r20.save()
            android.graphics.Paint r3 = r0.f916a
            float r3 = r3.getStrokeWidth()
            int r6 = r2.height()
            float r6 = (float) r6
            r7 = 1077936128(0x40400000, float:3.0)
            float r7 = r7 * r3
            float r6 = r6 - r7
            float r7 = r0.f920f
            float r7 = r7 * r4
            float r6 = r6 - r7
            int r4 = (int) r6
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r6 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r6
            float r6 = r0.f920f
            float r3 = r3 + r6
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.f921g
            if (r2 == 0) goto L_0x010d
            boolean r2 = r0.f924j
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0105
            r6 = -1
            r15 = -1
            goto L_0x0106
        L_0x0105:
            r15 = 1
        L_0x0106:
            float r2 = (float) r15
            float r11 = r18 * r2
            r1.rotate(r11)
            goto L_0x0112
        L_0x010d:
            if (r5 == 0) goto L_0x0112
            r1.rotate(r12)
        L_0x0112:
            android.graphics.Path r2 = r0.f922h
            android.graphics.Paint r3 = r0.f916a
            r1.drawPath(r2, r3)
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.p014c.p015a.C0266m.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        return this.f923i;
    }

    public final int getIntrinsicWidth() {
        return this.f923i;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f916a.getAlpha()) {
            this.f916a.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f916a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
