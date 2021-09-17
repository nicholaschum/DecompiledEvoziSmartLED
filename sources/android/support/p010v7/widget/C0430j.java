package android.support.p010v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p010v7.p011a.C0188b;
import android.util.AttributeSet;

/* renamed from: android.support.v7.widget.j */
final class C0430j extends AppCompatImageView implements C0435o {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f1884a;

    /* renamed from: b */
    private final float[] f1885b = new float[2];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0430j(ActionMenuPresenter actionMenuPresenter, Context context) {
        super(context, (AttributeSet) null, C0188b.actionOverflowButtonStyle);
        this.f1884a = actionMenuPresenter;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        C0417dm.m1368a(this, getContentDescription());
        setOnTouchListener(new C0431k(this, this, actionMenuPresenter));
    }

    /* renamed from: d */
    public final boolean mo3551d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo3552e() {
        return false;
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1884a.mo3958f();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            DrawableCompat.setHotspotBounds(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
