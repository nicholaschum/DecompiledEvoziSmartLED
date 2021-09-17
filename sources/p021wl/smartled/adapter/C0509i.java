package p021wl.smartled.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.qihoo360.replugin.library.C0462R;
import java.util.Collections;
import java.util.List;
import p021wl.smartled.p023b.C0513a;
import p021wl.smartled.views.C0616g;

/* renamed from: wl.smartled.adapter.i */
public final class C0509i extends BaseAdapter implements C0616g {

    /* renamed from: a */
    private List<Integer> f2227a;

    /* renamed from: b */
    private int f2228b = -1;

    /* renamed from: c */
    private C0510j f2229c;

    public C0509i(List<Integer> list) {
        this.f2227a = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Integer getItem(int i) {
        return this.f2227a.get(i);
    }

    /* renamed from: a */
    public final void mo4840a(int i) {
        this.f2228b = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo4841a(int i, int i2) {
        int intValue = this.f2227a.get(i).intValue();
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                Collections.swap(this.f2227a, i, i3);
                i = i3;
            }
        } else if (i > i2) {
            while (i > i2) {
                Collections.swap(this.f2227a, i, i - 1);
                i--;
            }
        }
        this.f2227a.set(i2, Integer.valueOf(intValue));
        if (this.f2229c != null) {
            this.f2229c.mo4848a();
        }
    }

    /* renamed from: a */
    public final void mo4842a(C0510j jVar) {
        this.f2229c = jVar;
    }

    /* renamed from: b */
    public final void mo4843b(int i) {
        if (this.f2227a != null && i < this.f2227a.size()) {
            this.f2227a.remove(i);
            notifyDataSetChanged();
        }
    }

    public final int getCount() {
        return this.f2227a.size();
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0511k kVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0462R.layout.online_music_item, viewGroup, false);
            kVar = C0511k.m1723a(view);
            view.setTag(kVar);
        } else {
            kVar = (C0511k) view.getTag();
        }
        Integer num = C0513a.f2286c.get(getItem(i));
        if (num != null) {
            kVar.f2231b.setText(viewGroup.getContext().getString(num.intValue()));
        }
        Integer num2 = C0513a.f2285b.get(getItem(i));
        if (num2 != null) {
            kVar.f2230a.setImageResource(num2.intValue());
        }
        if (i == this.f2228b) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        return view;
    }
}
