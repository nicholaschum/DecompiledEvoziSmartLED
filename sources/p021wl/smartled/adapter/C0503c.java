package p021wl.smartled.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.beans.C0524e;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p027f.C0544g;

/* renamed from: wl.smartled.adapter.c */
public final class C0503c extends BaseExpandableListAdapter implements View.OnClickListener {

    /* renamed from: a */
    private List<C0524e> f2203a = new ArrayList();

    /* renamed from: b */
    private List<C0524e> f2204b;

    /* renamed from: c */
    private LayoutInflater f2205c;

    /* renamed from: d */
    private C0504d f2206d;

    /* renamed from: e */
    private Context f2207e;

    public C0503c(Context context, List<C0524e> list) {
        this.f2204b = list;
        this.f2205c = LayoutInflater.from(context);
        this.f2207e = context;
        m1675a();
    }

    /* renamed from: a */
    private void m1675a() {
        this.f2203a.clear();
        for (int i = 0; i < this.f2204b.size(); i++) {
            C0524e eVar = this.f2204b.get(i);
            if (i == 0) {
                C0524e eVar2 = this.f2204b.get(1);
                C0524e eVar3 = new C0524e(eVar2);
                eVar3.mo4901a(this.f2207e.getString(C0462R.string.string_nearby_devices));
                for (DeviceBean add : eVar2.mo4905c()) {
                    eVar3.mo4905c().add(add);
                }
                for (DeviceBean next : eVar.mo4905c()) {
                    if (C0544g.m1907a(eVar3.mo4905c(), next.getAddress()) == -1) {
                        eVar3.mo4905c().add(next);
                    }
                }
                this.f2203a.add(eVar3);
            } else if (i != 1) {
                this.f2203a.add(eVar);
            }
        }
    }

    /* renamed from: a */
    public final DeviceBean mo4820a(int i, int i2) {
        return this.f2203a.get(i - 1).mo4905c().get(i2);
    }

    /* renamed from: a */
    public final void mo4821a(C0504d dVar) {
        this.f2206d = dVar;
    }

    public final Object getChild(int i, int i2) {
        return this.f2203a.get(i).mo4905c().get(i2);
    }

    public final long getChildId(int i, int i2) {
        return (long) i2;
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C0505e eVar;
        if (view == null) {
            view = this.f2205c.inflate(C0462R.layout.device_manager_row, viewGroup, false);
            eVar = new C0505e((byte) 0);
            view.setTag(eVar);
            TextView unused = eVar.f2209b = (TextView) view.findViewById(C0462R.C0464id.id_tv_device_address);
            TextView unused2 = eVar.f2208a = (TextView) view.findViewById(C0462R.C0464id.id_tv_device_name);
            ImageView unused3 = eVar.f2210c = (ImageView) view.findViewById(C0462R.C0464id.id_iv_device_select);
            ImageView unused4 = eVar.f2211d = (ImageView) view.findViewById(C0462R.C0464id.id_iv_device_connected);
            FrameLayout unused5 = eVar.f2212e = (FrameLayout) view.findViewById(C0462R.C0464id.id_fl_device_light_on);
            ProgressBar unused6 = eVar.f2213f = (ProgressBar) view.findViewById(C0462R.C0464id.id_pb_connection_pending);
        } else {
            eVar = (C0505e) view.getTag();
        }
        DeviceBean deviceBean = (DeviceBean) getChild(i, i2);
        String deviceName = deviceBean.getDeviceName();
        if (deviceName == null || deviceName.isEmpty()) {
            deviceName = this.f2207e.getString(C0462R.string.string_no_name);
        }
        String replaceFirst = deviceName.replaceFirst(deviceBean.getDeviceType() == DeviceBean.f2310h ? "ELK_" : "ELK-", "");
        eVar.f2213f.setVisibility(8);
        if (deviceBean.getState() == DeviceBean.f2306d || deviceBean.getState() == DeviceBean.f2305c) {
            eVar.f2211d.setBackgroundResource(C0462R.C0463drawable.connected);
        } else {
            eVar.f2211d.setBackgroundResource(C0462R.C0463drawable.disconnectbutton);
            if (!(deviceBean.getState() == DeviceBean.f2303a || deviceBean.getState() == DeviceBean.f2308f)) {
                eVar.f2213f.setVisibility(0);
            }
        }
        eVar.f2208a.setText(replaceFirst);
        eVar.f2209b.setText(deviceBean.getAddress());
        eVar.f2212e.setBackgroundResource(deviceBean.isOn() ? C0462R.C0463drawable.ic_light_n1 : C0462R.C0463drawable.ic_light_u1);
        eVar.f2212e.setOnClickListener(this);
        eVar.f2212e.setTag(C0462R.C0464id.tag_device_index, Integer.valueOf(i2));
        view.setTag(C0462R.C0464id.tag_device_index, Integer.valueOf(i2));
        int i3 = i + 1;
        eVar.f2212e.setTag(C0462R.C0464id.tag_group_index, Integer.valueOf(i3));
        view.setTag(C0462R.C0464id.tag_group_index, Integer.valueOf(i3));
        return view;
    }

    public final int getChildrenCount(int i) {
        return this.f2203a.get(i).mo4905c().size();
    }

    public final Object getGroup(int i) {
        return this.f2203a.get(i);
    }

    public final int getGroupCount() {
        return this.f2203a.size();
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C0506f fVar;
        if (view == null) {
            view = this.f2205c.inflate(C0462R.layout.group_manager_row, viewGroup, false);
            fVar = new C0506f((byte) 0);
            view.setTag(fVar);
            TextView unused = fVar.f2214a = (TextView) view.findViewById(C0462R.C0464id.id_tv_group_name);
            ImageView unused2 = fVar.f2215b = (ImageView) view.findViewById(C0462R.C0464id.id_iv_group_rename);
            ImageView unused3 = fVar.f2216c = (ImageView) view.findViewById(C0462R.C0464id.id_iv_refresh);
            ImageView unused4 = fVar.f2218e = (ImageView) view.findViewById(C0462R.C0464id.id_iv_pic_group);
            ImageView unused5 = fVar.f2217d = (ImageView) view.findViewById(C0462R.C0464id.id_iv_device_add);
            FrameLayout unused6 = fVar.f2219f = (FrameLayout) view.findViewById(C0462R.C0464id.id_fl_group_select);
        } else {
            fVar = (C0506f) view.getTag();
        }
        C0524e eVar = (C0524e) getGroup(i);
        fVar.f2214a.setText(eVar.mo4903b());
        fVar.f2219f.setVisibility(eVar.mo4906d() ? 0 : 8);
        int i2 = C0462R.C0463drawable.ic_light_u;
        if (i == 0) {
            int i3 = i + 1;
            view.setTag(C0462R.C0464id.tag_group_index, Integer.valueOf(i3));
            fVar.f2216c.setOnClickListener(this);
            fVar.f2216c.setTag(Integer.valueOf(i3));
            fVar.f2216c.setVisibility(0);
            fVar.f2215b.setVisibility(8);
            fVar.f2217d.setVisibility(8);
            ImageView f = fVar.f2218e;
            if (eVar.mo4907e()) {
                i2 = C0462R.C0463drawable.ic_light_n;
            }
            f.setImageResource(i2);
            fVar.f2218e.setTag(Integer.valueOf(i3));
            fVar.f2218e.setClickable(true);
        } else {
            int i4 = i + 1;
            view.setTag(C0462R.C0464id.tag_group_index, Integer.valueOf(i4));
            fVar.f2215b.setOnClickListener(this);
            fVar.f2215b.setTag(Integer.valueOf(i4));
            fVar.f2215b.setVisibility(0);
            fVar.f2216c.setVisibility(8);
            fVar.f2217d.setOnClickListener(this);
            fVar.f2217d.setTag(Integer.valueOf(i4));
            fVar.f2217d.setVisibility(0);
            ImageView f2 = fVar.f2218e;
            if (eVar.mo4907e()) {
                i2 = C0462R.C0463drawable.ic_light_n;
            }
            f2.setImageResource(i2);
            fVar.f2218e.setClickable(true);
            fVar.f2218e.setTag(Integer.valueOf(i4));
        }
        fVar.f2218e.setOnClickListener(this);
        return view;
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public final void notifyDataSetChanged() {
        m1675a();
        super.notifyDataSetChanged();
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        switch (view.getId()) {
            case C0462R.C0464id.id_fl_device_light_on:
                if (this.f2206d != null) {
                    this.f2206d.mo4758a(((Integer) view.getTag(C0462R.C0464id.tag_group_index)).intValue(), ((Integer) view.getTag(C0462R.C0464id.tag_device_index)).intValue());
                    notifyDataSetChanged();
                    return;
                }
                return;
            case C0462R.C0464id.id_iv_device_add:
                if (this.f2206d != null) {
                    this.f2206d.mo4759b(((Integer) tag).intValue());
                    return;
                }
                return;
            case C0462R.C0464id.id_iv_group_rename:
                if (this.f2206d != null) {
                    this.f2206d.mo4757a(((Integer) tag).intValue());
                    return;
                }
                return;
            case C0462R.C0464id.id_iv_pic_group:
                if (this.f2206d != null) {
                    this.f2206d.mo4760c(((Integer) tag).intValue());
                    notifyDataSetChanged();
                    return;
                }
                return;
            case C0462R.C0464id.id_iv_refresh:
                if (this.f2206d != null) {
                    C0504d dVar = this.f2206d;
                    ((Integer) tag).intValue();
                    dVar.mo4756a();
                    notifyDataSetChanged();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
