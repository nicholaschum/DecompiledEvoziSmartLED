package p021wl.smartled.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.List;
import p021wl.smartled.beans.C0525f;
import p021wl.smartled.p027f.C0550m;

/* renamed from: wl.smartled.adapter.g */
public final class C0507g extends BaseAdapter {

    /* renamed from: a */
    private List<C0525f> f2220a;

    /* renamed from: b */
    private LayoutInflater f2221b;

    /* renamed from: c */
    private int f2222c = -1;

    public C0507g(List<C0525f> list, Context context) {
        this.f2220a = list;
        this.f2221b = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public final int mo4834a() {
        return this.f2222c;
    }

    /* renamed from: a */
    public final void mo4835a(int i) {
        if (i >= 0 && i != this.f2222c) {
            this.f2222c = i;
            notifyDataSetChanged();
        }
    }

    public final int getCount() {
        return this.f2220a.size();
    }

    public final Object getItem(int i) {
        return this.f2220a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0508h hVar;
        int i2 = 0;
        if (view == null) {
            view = this.f2221b.inflate(C0462R.layout.music_list_row, (ViewGroup) null, false);
            hVar = new C0508h((byte) 0);
            TextView unused = hVar.f2223a = (TextView) view.findViewById(C0462R.C0464id.id_tv_music_row_name);
            TextView unused2 = hVar.f2224b = (TextView) view.findViewById(C0462R.C0464id.id_tv_music_row_info);
            TextView unused3 = hVar.f2225c = (TextView) view.findViewById(C0462R.C0464id.id_tv_music_row_time);
            ImageView unused4 = hVar.f2226d = (ImageView) view.findViewById(C0462R.C0464id.id_select_music);
            view.setTag(hVar);
        } else {
            hVar = (C0508h) view.getTag();
        }
        hVar.f2223a.setText(((C0525f) getItem(i)).mo4915c());
        hVar.f2224b.setText(((C0525f) getItem(i)).mo4918d());
        hVar.f2225c.setText(C0550m.m1924a(((C0525f) getItem(i)).mo4920e()));
        ImageView d = hVar.f2226d;
        if (i != this.f2222c) {
            i2 = 4;
        }
        d.setVisibility(i2);
        return view;
    }
}
