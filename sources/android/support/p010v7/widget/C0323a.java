package android.support.p010v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.a */
final class C0323a extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1603a;

    public C0323a(ActionBarContainer actionBarContainer) {
        this.f1603a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.f1603a.f1250d) {
            if (this.f1603a.f1247a != null) {
                this.f1603a.f1247a.draw(canvas);
            }
            if (this.f1603a.f1248b != null && this.f1603a.f1251e) {
                this.f1603a.f1248b.draw(canvas);
            }
        } else if (this.f1603a.f1249c != null) {
            this.f1603a.f1249c.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        if (this.f1603a.f1250d) {
            if (this.f1603a.f1249c != null) {
                this.f1603a.f1249c.getOutline(outline);
            }
        } else if (this.f1603a.f1247a != null) {
            this.f1603a.f1247a.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
