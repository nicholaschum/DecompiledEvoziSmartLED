package android.support.p010v7.widget;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0195i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ae */
final class C0328ae extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1608a;

    /* renamed from: b */
    private C0439s f1609b;

    /* renamed from: c */
    private int f1610c = 4;

    /* renamed from: d */
    private boolean f1611d;

    /* renamed from: e */
    private boolean f1612e;

    /* renamed from: f */
    private boolean f1613f;

    C0328ae(ActivityChooserView activityChooserView) {
        this.f1608a = activityChooserView;
    }

    /* renamed from: a */
    public final int mo4267a() {
        int i = this.f1610c;
        this.f1610c = Integer.MAX_VALUE;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = getCount();
        View view = null;
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            view = getView(i3, view, (ViewGroup) null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        this.f1610c = i;
        return i2;
    }

    /* renamed from: a */
    public final void mo4268a(int i) {
        if (this.f1610c != i) {
            this.f1610c = i;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo4269a(C0439s sVar) {
        C0439s sVar2 = this.f1608a.f1336a.f1609b;
        if (sVar2 != null && this.f1608a.isShown()) {
            sVar2.unregisterObserver(this.f1608a.f1340e);
        }
        this.f1609b = sVar;
        if (sVar != null && this.f1608a.isShown()) {
            sVar.registerObserver(this.f1608a.f1340e);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo4270a(boolean z) {
        if (this.f1613f != z) {
            this.f1613f = z;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo4271a(boolean z, boolean z2) {
        if (this.f1611d != z || this.f1612e != z2) {
            this.f1611d = z;
            this.f1612e = z2;
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final ResolveInfo mo4272b() {
        return this.f1609b.mo4591b();
    }

    /* renamed from: c */
    public final int mo4273c() {
        return this.f1609b.mo4587a();
    }

    /* renamed from: d */
    public final int mo4274d() {
        return this.f1609b.mo4592c();
    }

    /* renamed from: e */
    public final C0439s mo4275e() {
        return this.f1609b;
    }

    /* renamed from: f */
    public final boolean mo4276f() {
        return this.f1611d;
    }

    public final int getCount() {
        int a = this.f1609b.mo4587a();
        if (!this.f1611d && this.f1609b.mo4591b() != null) {
            a--;
        }
        int min = Math.min(a, this.f1610c);
        return this.f1613f ? min + 1 : min;
    }

    public final Object getItem(int i) {
        switch (getItemViewType(i)) {
            case 0:
                if (!this.f1611d && this.f1609b.mo4591b() != null) {
                    i++;
                }
                return this.f1609b.mo4589a(i);
            case 1:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getItemViewType(int i) {
        return (!this.f1613f || i != getCount() - 1) ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                if (view == null || view.getId() != C0193g.list_item) {
                    view = LayoutInflater.from(this.f1608a.getContext()).inflate(C0194h.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = this.f1608a.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(C0193g.f276v)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(C0193g.f275S)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1611d || i != 0 || !this.f1612e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            case 1:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                View inflate = LayoutInflater.from(this.f1608a.getContext()).inflate(C0194h.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(C0193g.f275S)).setText(this.f1608a.getContext().getString(C0195i.abc_activity_chooser_view_see_all));
                return inflate;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int getViewTypeCount() {
        return 3;
    }
}
