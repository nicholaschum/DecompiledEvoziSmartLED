package p021wl.smartled.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.beans.DeviceBean;

/* renamed from: wl.smartled.adapter.a */
public final class C0501a extends ArrayAdapter implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private List<DeviceBean> f2196a;

    /* renamed from: b */
    private List<Boolean> f2197b = new ArrayList();

    /* renamed from: c */
    private LayoutInflater f2198c;

    public C0501a(Context context, List<DeviceBean> list) {
        super(context, C0462R.layout.newgroup_pick_item);
        this.f2196a = list;
        this.f2198c = LayoutInflater.from(context);
        for (int i = 0; i < list.size(); i++) {
            this.f2197b.add(Boolean.FALSE);
        }
    }

    /* renamed from: a */
    public final List<Boolean> mo4813a() {
        return this.f2197b;
    }

    /* renamed from: b */
    public final int mo4814b() {
        int i = 0;
        for (Boolean booleanValue : this.f2197b) {
            if (booleanValue.booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public final int getCount() {
        return this.f2196a.size();
    }

    public final Object getItem(int i) {
        return this.f2196a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C0502b bVar;
        if (view == null) {
            view = this.f2198c.inflate(C0462R.layout.newgroup_pick_item, viewGroup, false);
            bVar = new C0502b((byte) 0);
            TextView unused = bVar.f2199a = (TextView) view.findViewById(C0462R.C0464id.id_tv_pick_index);
            TextView unused2 = bVar.f2200b = (TextView) view.findViewById(C0462R.C0464id.id_tv_pick_name);
            TextView unused3 = bVar.f2201c = (TextView) view.findViewById(C0462R.C0464id.id_tv_pick_address);
            CheckBox unused4 = bVar.f2202d = (CheckBox) view.findViewById(C0462R.C0464id.id_cb_pick);
            view.setTag(bVar);
        } else {
            bVar = (C0502b) view.getTag();
        }
        TextView a = bVar.f2199a;
        a.setText(String.valueOf(i + 1) + ".");
        bVar.f2200b.setText(this.f2196a.get(i).getDeviceName());
        bVar.f2201c.setText(this.f2196a.get(i).getAddress());
        bVar.f2202d.setOnCheckedChangeListener(this);
        bVar.f2202d.setTag(Integer.valueOf(i));
        return view;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f2197b.set(((Integer) compoundButton.getTag()).intValue(), Boolean.valueOf(z));
    }
}
