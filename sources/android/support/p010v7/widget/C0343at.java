package android.support.p010v7.widget;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* renamed from: android.support.v7.widget.at */
final class C0343at implements ListAdapter, SpinnerAdapter {

    /* renamed from: a */
    private SpinnerAdapter f1657a;

    /* renamed from: b */
    private ListAdapter f1658b;

    public C0343at(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.f1657a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f1658b = (ListAdapter) spinnerAdapter;
        }
        if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f1658b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        if (this.f1657a == null) {
            return 0;
        }
        return this.f1657a.getCount();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f1657a == null) {
            return null;
        }
        return this.f1657a.getDropDownView(i, view, viewGroup);
    }

    public final Object getItem(int i) {
        if (this.f1657a == null) {
            return null;
        }
        return this.f1657a.getItem(i);
    }

    public final long getItemId(int i) {
        if (this.f1657a == null) {
            return -1;
        }
        return this.f1657a.getItemId(i);
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return this.f1657a != null && this.f1657a.hasStableIds();
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f1658b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f1657a != null) {
            this.f1657a.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f1657a != null) {
            this.f1657a.unregisterDataSetObserver(dataSetObserver);
        }
    }
}
