package android.support.p010v7.view.menu;

import android.content.Context;
import android.support.p010v7.widget.C0407dc;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C0288ae, C0311p, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f1036a = {16842964, 16843049};

    /* renamed from: b */
    private MenuBuilder f1037b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0407dc a = C0407dc.m1308a(context, attributeSet, f1036a, i, 0);
        if (a.mo4560h(0)) {
            setBackgroundDrawable(a.mo4545a(0));
        }
        if (a.mo4560h(1)) {
            setDivider(a.mo4545a(1));
        }
        a.mo4546a();
    }

    /* renamed from: a */
    public final void mo3559a(MenuBuilder menuBuilder) {
        this.f1037b = menuBuilder;
    }

    /* renamed from: a */
    public final boolean mo3560a(MenuItemImpl menuItemImpl) {
        return this.f1037b.mo3581a((MenuItem) menuItemImpl, 0);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo3560a((MenuItemImpl) getAdapter().getItem(i));
    }
}
