package android.support.p010v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p010v7.view.menu.C0309n;
import android.support.p010v7.view.menu.ListMenuItemView;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.view.menu.MenuItemImpl;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.widget.bw */
public final class C0373bw extends C0356bf {

    /* renamed from: b */
    final int f1733b;

    /* renamed from: c */
    final int f1734c;

    /* renamed from: d */
    private C0371bu f1735d;

    /* renamed from: e */
    private MenuItem f1736e;

    public C0373bw(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.f1733b = 22;
            this.f1734c = 21;
            return;
        }
        this.f1733b = 21;
        this.f1734c = 22;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo4398a(int i, int i2, int i3, int i4, int i5) {
        return super.mo4398a(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public final void mo4433a(C0371bu buVar) {
        this.f1735d = buVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo4400a(MotionEvent motionEvent, int i) {
        return super.mo4400a(motionEvent, i);
    }

    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        int pointToPosition;
        int i2;
        if (this.f1735d != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
            }
            C0309n nVar = (C0309n) adapter;
            MenuItemImpl menuItemImpl = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < nVar.getCount()) {
                menuItemImpl = nVar.getItem(i2);
            }
            MenuItem menuItem = this.f1736e;
            if (menuItem != menuItemImpl) {
                MenuBuilder a = nVar.mo3796a();
                if (menuItem != null) {
                    this.f1735d.mo3784a(a, menuItem);
                }
                this.f1736e = menuItemImpl;
                if (menuItemImpl != null) {
                    this.f1735d.mo3785b(a, menuItemImpl);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f1733b) {
            if (listMenuItemView.isEnabled() && listMenuItemView.mo3545a().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f1734c) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((C0309n) getAdapter()).mo3796a().mo3578a(false);
            return true;
        }
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
