package p021wl.smartled.fragment;

import android.os.Bundle;
import android.support.p007v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.beans.C0527h;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.views.C0619j;
import p021wl.smartled.views.PickerScrollView;

/* renamed from: wl.smartled.fragment.ModeFragment */
public class ModeFragment extends Fragment implements SeekBar.OnSeekBarChangeListener, C0619j {

    /* renamed from: a */
    private PickerScrollView f2437a;

    /* renamed from: b */
    private SeekBar f2438b;

    /* renamed from: c */
    private SeekBar f2439c;

    /* renamed from: d */
    private TextView f2440d;

    /* renamed from: e */
    private TextView f2441e;

    /* renamed from: a */
    public final void mo5029a(C0527h hVar) {
        if (hVar != null) {
            C0538a.m1861a().mo5002c(getContext(), C0528a.m1795a().mo4941e(), Integer.valueOf(hVar.mo4926b()).intValue());
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C0462R.layout.fragment_mode, viewGroup, false);
        this.f2437a = (PickerScrollView) linearLayout.findViewById(C0462R.C0464id.id_pickerScrollView);
        this.f2437a.mo5188a((C0619j) this);
        this.f2437a.mo5186a();
        this.f2438b = (SeekBar) linearLayout.findViewById(C0462R.C0464id.id_sb_mode_change_speed);
        this.f2439c = (SeekBar) linearLayout.findViewById(C0462R.C0464id.id_sb_brightness_change);
        this.f2440d = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_brightness);
        this.f2441e = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_speed);
        this.f2440d.setText(getString(C0462R.string.string_mode_bright, Integer.valueOf(this.f2439c.getProgress())));
        this.f2441e.setText(getString(C0462R.string.string_mode_speed, Integer.valueOf(this.f2438b.getProgress())));
        this.f2438b.setOnSeekBarChangeListener(this);
        this.f2439c.setOnSeekBarChangeListener(this);
        return linearLayout;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() == C0462R.C0464id.id_sb_mode_change_speed) {
            this.f2441e.setText(getString(C0462R.string.string_mode_speed, Integer.valueOf(i)));
        } else if (seekBar.getId() == C0462R.C0464id.id_sb_brightness_change) {
            this.f2440d.setText(getString(C0462R.string.string_mode_bright, Integer.valueOf(i)));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        int progress = seekBar.getProgress();
        if (seekBar.getId() == C0462R.C0464id.id_sb_mode_change_speed) {
            C0538a.m1861a().mo5005d(getContext(), C0528a.m1795a().mo4941e(), progress);
        } else if (seekBar.getId() == C0462R.C0464id.id_sb_brightness_change) {
            C0538a.m1861a().mo4987a(getContext(), C0528a.m1795a().mo4941e(), progress, true);
        }
    }
}
