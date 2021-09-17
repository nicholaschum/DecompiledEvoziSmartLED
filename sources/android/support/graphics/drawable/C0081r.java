package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.graphics.drawable.r */
final class C0081r extends Drawable.ConstantState {

    /* renamed from: a */
    int f255a;

    /* renamed from: b */
    C0080q f256b;

    /* renamed from: c */
    ColorStateList f257c;

    /* renamed from: d */
    PorterDuff.Mode f258d;

    /* renamed from: e */
    boolean f259e;

    /* renamed from: f */
    Bitmap f260f;

    /* renamed from: g */
    ColorStateList f261g;

    /* renamed from: h */
    PorterDuff.Mode f262h;

    /* renamed from: i */
    int f263i;

    /* renamed from: j */
    boolean f264j;

    /* renamed from: k */
    boolean f265k;

    /* renamed from: l */
    Paint f266l;

    public C0081r() {
        this.f257c = null;
        this.f258d = VectorDrawableCompat.f175a;
        this.f256b = new C0080q();
    }

    public C0081r(C0081r rVar) {
        this.f257c = null;
        this.f258d = VectorDrawableCompat.f175a;
        if (rVar != null) {
            this.f255a = rVar.f255a;
            this.f256b = new C0080q(rVar.f256b);
            if (rVar.f256b.f240b != null) {
                this.f256b.f240b = new Paint(rVar.f256b.f240b);
            }
            if (rVar.f256b.f239a != null) {
                this.f256b.f239a = new Paint(rVar.f256b.f239a);
            }
            this.f257c = rVar.f257c;
            this.f258d = rVar.f258d;
            this.f259e = rVar.f259e;
        }
    }

    /* renamed from: a */
    public final void mo267a(int i, int i2) {
        this.f260f.eraseColor(0);
        this.f256b.mo261a(new Canvas(this.f260f), i, i2);
    }

    public final int getChangingConfigurations() {
        return this.f255a;
    }

    public final Drawable newDrawable() {
        return new VectorDrawableCompat(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new VectorDrawableCompat(this);
    }
}
