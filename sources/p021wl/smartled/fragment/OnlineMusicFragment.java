package p021wl.smartled.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.p007v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.activity.OnlineMusicActivity;
import p021wl.smartled.adapter.C0509i;
import p021wl.smartled.adapter.C0510j;
import p021wl.smartled.p023b.C0513a;
import p021wl.smartled.views.DragGridView;

/* renamed from: wl.smartled.fragment.OnlineMusicFragment */
public class OnlineMusicFragment extends Fragment implements AdapterView.OnItemClickListener, C0510j {

    /* renamed from: a */
    private List<Integer> f2459a;

    /* renamed from: a */
    public final void mo4848a() {
        Context context = getContext();
        List<Integer> list = this.f2459a;
        if (list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (Integer valueOf : list) {
                sb.append(String.valueOf(valueOf));
                sb.append(",");
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("SmartLedApp", 0).edit();
            edit.putString("LauncherSequenceKey", sb.toString());
            edit.apply();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C0462R.layout.fragment_online_music, viewGroup, false);
        DragGridView dragGridView = (DragGridView) linearLayout.findViewById(C0462R.C0464id.dragGridView);
        dragGridView.setOnItemClickListener(this);
        Context context = getContext();
        ArrayList arrayList = new ArrayList();
        String string = context.getSharedPreferences("SmartLedApp", 0).getString("LauncherSequenceKey", "");
        if (string.isEmpty()) {
            while (i < 4) {
                arrayList.add(Integer.valueOf(i));
                i++;
            }
        } else {
            String[] split = string.split(",");
            int length = split.length;
            while (i < length) {
                arrayList.add(Integer.valueOf(split[i]));
                i++;
            }
        }
        this.f2459a = arrayList;
        C0509i iVar = new C0509i(this.f2459a);
        iVar.mo4842a((C0510j) this);
        dragGridView.setAdapter((ListAdapter) iVar);
        return linearLayout;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.setPackage(getContext().getPackageName());
        intent.setClass(getContext(), OnlineMusicActivity.class);
        intent.putExtra("wl.extra.online.music.url", C0513a.f2284a.get(this.f2459a.get(i)));
        startActivity(intent);
    }
}
