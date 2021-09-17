package android.support.p010v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0197k;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.ar */
final class C0341ar extends C0340aq {

    /* renamed from: a */
    private final SeekBar f1649a;

    /* renamed from: b */
    private Drawable f1650b;

    /* renamed from: c */
    private ColorStateList f1651c = null;

    /* renamed from: d */
    private PorterDuff.Mode f1652d = null;

    /* renamed from: e */
    private boolean f1653e = false;

    /* renamed from: f */
    private boolean f1654f = false;

    C0341ar(SeekBar seekBar) {
        super(seekBar);
        this.f1649a = seekBar;
    }

    /* renamed from: d */
    private void m1144d() {
        if (this.f1650b == null) {
            return;
        }
        if (this.f1653e || this.f1654f) {
            this.f1650b = DrawableCompat.wrap(this.f1650b.mutate());
            if (this.f1653e) {
                DrawableCompat.setTintList(this.f1650b, this.f1651c);
            }
            if (this.f1654f) {
                DrawableCompat.setTintMode(this.f1650b, this.f1652d);
            }
            if (this.f1650b.isStateful()) {
                this.f1650b.setState(this.f1649a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4320a(Canvas canvas) {
        if (this.f1650b != null) {
            int max = this.f1649a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1650b.getIntrinsicWidth();
                int intrinsicHeight = this.f1650b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1650b.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1649a.getWidth() - this.f1649a.getPaddingLeft()) - this.f1649a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1649a.getPaddingLeft(), (float) (this.f1649a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1650b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4319a(AttributeSet attributeSet, int i) {
        super.mo4319a(attributeSet, i);
        C0407dc a = C0407dc.m1308a(this.f1649a.getContext(), attributeSet, C0197k.f339aj, i, 0);
        Drawable b = a.mo4549b(C0197k.f340ak);
        if (b != null) {
            this.f1649a.setThumb(b);
        }
        Drawable a2 = a.mo4545a(C0197k.f341al);
        if (this.f1650b != null) {
            this.f1650b.setCallback((Drawable.Callback) null);
        }
        this.f1650b = a2;
        if (a2 != null) {
            a2.setCallback(this.f1649a);
            DrawableCompat.setLayoutDirection(a2, ViewCompat.getLayoutDirection(this.f1649a));
            if (a2.isStateful()) {
                a2.setState(this.f1649a.getDrawableState());
            }
            m1144d();
        }
        this.f1649a.invalidate();
        if (a.mo4560h(C0197k.f343an)) {
            this.f1652d = C0355be.m1240a(a.mo4543a(C0197k.f343an, -1), this.f1652d);
            this.f1654f = true;
        }
        if (a.mo4560h(C0197k.f342am)) {
            this.f1651c = a.mo4557f(C0197k.f342am);
            this.f1653e = true;
        }
        a.mo4546a();
        m1144d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4321b() {
        if (this.f1650b != null) {
            this.f1650b.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4322c() {
        Drawable drawable = this.f1650b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1649a.getDrawableState())) {
            this.f1649a.invalidateDrawable(drawable);
        }
    }
}
