package p021wl.smartled.views.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.C0512b;

/* renamed from: wl.smartled.views.floatingactionbutton.AddFloatingActionButton */
public class AddFloatingActionButton extends FloatingActionButton {

    /* renamed from: a */
    int f2824a;

    public AddFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AddFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo5218a() {
        float d = mo5224d(this.f2831g == 0 ? C0462R.dimen.fab_icon_size_normal : C0462R.dimen.fab_icon_size_mini);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new C0606a(this, d, (d - mo5224d(C0462R.dimen.fab_plus_icon_size)) / 2.0f, d / 2.0f, mo5224d(C0462R.dimen.fab_plus_icon_stroke) / 2.0f));
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f2824a);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return shapeDrawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5219a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0512b.f2264g, 0, 0);
        this.f2824a = obtainStyledAttributes.getColor(0, mo5223c(17170443));
        obtainStyledAttributes.recycle();
        super.mo5219a(context, attributeSet);
    }
}
