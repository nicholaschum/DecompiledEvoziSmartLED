package android.support.p010v7.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p010v7.p014c.p015a.C0265l;

/* renamed from: android.support.v7.widget.bg */
final class C0357bg extends C0265l {

    /* renamed from: a */
    private boolean f1711a = true;

    C0357bg(Drawable drawable) {
        super(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4411a(boolean z) {
        this.f1711a = z;
    }

    public final void draw(Canvas canvas) {
        if (this.f1711a) {
            super.draw(canvas);
        }
    }

    public final void setHotspot(float f, float f2) {
        if (this.f1711a) {
            super.setHotspot(f, f2);
        }
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f1711a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public final boolean setState(int[] iArr) {
        if (this.f1711a) {
            return super.setState(iArr);
        }
        return false;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f1711a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
