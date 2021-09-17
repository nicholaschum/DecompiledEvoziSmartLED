package android.support.p010v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.z */
abstract class C0321z implements C0286ac, C0292ai, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f1234a;

    C0321z() {
    }

    /* renamed from: a */
    protected static int m786a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }

    /* renamed from: a */
    protected static C0309n m787a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0309n) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0309n) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m788b(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo3743a(int i);

    /* renamed from: a */
    public final void mo3707a(Context context, MenuBuilder menuBuilder) {
    }

    /* renamed from: a */
    public final void mo3868a(Rect rect) {
        this.f1234a = rect;
    }

    /* renamed from: a */
    public abstract void mo3744a(MenuBuilder menuBuilder);

    /* renamed from: a */
    public abstract void mo3745a(View view);

    /* renamed from: a */
    public abstract void mo3746a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: b */
    public abstract void mo3747b(int i);

    /* renamed from: b */
    public abstract void mo3748b(boolean z);

    /* renamed from: b */
    public final boolean mo3713b(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo3749c(int i);

    /* renamed from: c */
    public abstract void mo3750c(boolean z);

    /* renamed from: c */
    public final boolean mo3714c(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo3778f() {
        return true;
    }

    /* renamed from: g */
    public final Rect mo3869g() {
        return this.f1234a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m787a(listAdapter).f1215a.mo3582a((MenuItem) listAdapter.getItem(i), (C0286ac) this, mo3778f() ? 0 : 4);
    }
}
