package android.support.p010v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* renamed from: android.support.v7.widget.au */
final class C0344au extends ListPopupWindow {

    /* renamed from: a */
    ListAdapter f1659a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f1660b;

    /* renamed from: h */
    private CharSequence f1661h;

    /* renamed from: i */
    private final Rect f1662i = new Rect();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0344au(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1660b = appCompatSpinner;
        mo4142b((View) appCompatSpinner);
        mo4146h();
        mo4145g();
        mo4138a((AdapterView.OnItemClickListener) new C0345av(this, appCompatSpinner));
    }

    /* renamed from: a */
    public final void mo3739a() {
        ViewTreeObserver viewTreeObserver;
        boolean d = mo3741d();
        mo4339f();
        mo4153o();
        super.mo3739a();
        this.f1433c.setChoiceMode(1);
        int selectedItemPosition = this.f1660b.getSelectedItemPosition();
        C0356bf bfVar = this.f1433c;
        if (mo3741d() && bfVar != null) {
            bfVar.mo4399a(false);
            bfVar.setSelection(selectedItemPosition);
            if (bfVar.getChoiceMode() != 0) {
                bfVar.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!d && (viewTreeObserver = this.f1660b.getViewTreeObserver()) != null) {
            C0346aw awVar = new C0346aw(this);
            viewTreeObserver.addOnGlobalLayoutListener(awVar);
            mo4140a((PopupWindow.OnDismissListener) new C0347ax(this, awVar));
        }
    }

    /* renamed from: a */
    public final void mo4139a(ListAdapter listAdapter) {
        super.mo4139a(listAdapter);
        this.f1659a = listAdapter;
    }

    /* renamed from: a */
    public final void mo4336a(CharSequence charSequence) {
        this.f1661h = charSequence;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4337a(View view) {
        return ViewCompat.isAttachedToWindow(view) && view.getGlobalVisibleRect(this.f1662i);
    }

    /* renamed from: b */
    public final CharSequence mo4338b() {
        return this.f1661h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo4339f() {
        int i;
        Drawable background = this.f1437g.getBackground();
        int i2 = 0;
        if (background != null) {
            background.getPadding(this.f1660b.f1381c);
            i2 = C0423ds.m1382a(this.f1660b) ? this.f1660b.f1381c.right : -this.f1660b.f1381c.left;
        } else {
            Rect rect = this.f1660b.f1381c;
            this.f1660b.f1381c.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.f1660b.getPaddingLeft();
        int paddingRight = this.f1660b.getPaddingRight();
        int width = this.f1660b.getWidth();
        if (this.f1660b.f1380b == -2) {
            int a = this.f1660b.mo4068a((SpinnerAdapter) this.f1659a, this.f1437g.getBackground());
            int i3 = (this.f1660b.getContext().getResources().getDisplayMetrics().widthPixels - this.f1660b.f1381c.left) - this.f1660b.f1381c.right;
            if (a > i3) {
                a = i3;
            }
            i = Math.max(a, (width - paddingLeft) - paddingRight);
        } else {
            i = this.f1660b.f1380b == -1 ? (width - paddingLeft) - paddingRight : this.f1660b.f1380b;
        }
        mo4144d(i);
        mo4135a(C0423ds.m1382a(this.f1660b) ? i2 + ((width - paddingRight) - mo4152n()) : i2 + paddingLeft);
    }
}
