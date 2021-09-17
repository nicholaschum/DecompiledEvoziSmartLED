package p021wl.smartled.fragment;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.p007v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.List;
import java.util.Random;
import p021wl.smartled.adapter.C0507g;
import p021wl.smartled.beans.C0525f;
import p021wl.smartled.p023b.C0519g;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p024c.C0529b;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.p027f.C0550m;
import p021wl.smartled.service.C0599z;
import p021wl.smartled.service.PlayService;

/* renamed from: wl.smartled.fragment.MusicFragment */
public class MusicFragment extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, SeekBar.OnSeekBarChangeListener, C0599z {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public PlayService f2442a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LinearLayout f2443b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ListView f2444c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C0507g f2445d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public TextView f2446e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f2447f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f2448g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f2449h;

    /* renamed from: i */
    private ImageView f2450i;

    /* renamed from: j */
    private ImageView f2451j;

    /* renamed from: k */
    private ImageView f2452k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ImageView f2453l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public SeekBar f2454m;

    /* renamed from: n */
    private boolean f2455n;

    /* renamed from: o */
    private boolean f2456o;

    /* renamed from: p */
    private Handler f2457p;

    /* renamed from: q */
    private ServiceConnection f2458q = new C0555a(this);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1950a(boolean z) {
        getActivity().runOnUiThread(new C0556b(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1951b(List<C0525f> list) {
        if (list != null && list.size() > 0) {
            m1958f();
            this.f2445d.notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    private void m1956e() {
        Intent intent = new Intent(getActivity(), PlayService.class);
        intent.setPackage(getActivity().getPackageName());
        this.f2456o = getActivity().bindService(intent, this.f2458q, 1);
    }

    /* renamed from: f */
    private void m1958f() {
        this.f2457p.post(new C0557c(this));
    }

    /* renamed from: a */
    public final void mo5033a() {
        m1950a(true);
    }

    /* renamed from: a */
    public final void mo5034a(int i) {
        if (!this.f2455n) {
            SeekBar seekBar = this.f2454m;
            C0525f j = this.f2442a.mo5098j();
            int i2 = 0;
            if (!(j == null || j.mo4920e() == 0)) {
                i2 = (int) (((long) (i * 100)) / j.mo4920e());
            }
            seekBar.setProgress(i2);
            this.f2448g.setText(C0550m.m1924a((long) i));
        }
        m1958f();
    }

    /* renamed from: a */
    public final void mo5035a(List<C0525f> list) {
        m1950a(false);
        m1951b(list);
    }

    /* renamed from: a */
    public final void mo5036a(byte[] bArr) {
        if (this.f2442a != null && this.f2442a.mo5095g()) {
            int i = 0;
            for (byte b : bArr) {
                i += b;
            }
            int abs = ((int) ((((float) Math.abs(i)) * 100.0f) / 450.0f)) + 35;
            if (abs >= 100) {
                abs = 100;
            }
            Log.v("MusicFragment", "onMusicFftCapture: brightness = ".concat(String.valueOf(abs)));
            C0538a.m1861a().mo5003c(getContext(), C0528a.m1795a().mo4941e(), new Random().nextInt(), abs);
        }
    }

    /* renamed from: b */
    public final void mo5037b() {
        m1958f();
    }

    /* renamed from: c */
    public final void mo5038c() {
        m1958f();
        if (this.f2442a != null && this.f2442a.mo5096h()) {
            Log.v("MusicFragment", "onPlayerPause: brightness = 100");
            C0538a.m1861a().mo4987a(getContext(), C0528a.m1795a().mo4941e(), 100, false);
        }
    }

    /* renamed from: d */
    public final void mo5039d() {
        m1958f();
    }

    public void onClick(View view) {
        PlayService playService;
        C0519g gVar;
        if (this.f2442a != null) {
            switch (view.getId()) {
                case C0462R.C0464id.id_iv_play_mode:
                    if (this.f2442a != null) {
                        switch (C0558d.f2525a[this.f2442a.mo5092d().ordinal()]) {
                            case 1:
                                playService = this.f2442a;
                                gVar = C0519g.SINGLE;
                                break;
                            case 2:
                                playService = this.f2442a;
                                gVar = C0519g.SHUFFLE;
                                break;
                            default:
                                playService = this.f2442a;
                                gVar = C0519g.LOOP;
                                break;
                        }
                        playService.mo5087a(gVar);
                        ImageView imageView = this.f2450i;
                        int i = C0558d.f2525a[this.f2442a.mo5092d().ordinal()];
                        imageView.setImageResource(i != 1 ? i != 3 ? C0462R.C0463drawable.ic_playsequence : C0462R.C0463drawable.ic_playone : C0462R.C0463drawable.ic_random);
                        return;
                    }
                    return;
                case C0462R.C0464id.id_iv_play_next_music:
                    this.f2442a.mo5093e();
                    return;
                case C0462R.C0464id.id_iv_play_pause_music:
                    this.f2442a.mo5091c();
                    return;
                case C0462R.C0464id.id_iv_play_prev_music:
                    this.f2442a.mo5094f();
                    return;
                default:
                    return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C0462R.layout.fragment_music, viewGroup, false);
        this.f2446e = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_music_name);
        this.f2447f = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_music_info);
        this.f2448g = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_music_play_time);
        this.f2449h = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_music_total_time);
        this.f2451j = (ImageView) linearLayout.findViewById(C0462R.C0464id.id_iv_play_prev_music);
        this.f2452k = (ImageView) linearLayout.findViewById(C0462R.C0464id.id_iv_play_next_music);
        this.f2453l = (ImageView) linearLayout.findViewById(C0462R.C0464id.id_iv_play_pause_music);
        this.f2450i = (ImageView) linearLayout.findViewById(C0462R.C0464id.id_iv_play_mode);
        this.f2454m = (SeekBar) linearLayout.findViewById(C0462R.C0464id.id_sb_play_progress);
        this.f2444c = (ListView) linearLayout.findViewById(C0462R.C0464id.id_lv_music_list);
        this.f2443b = (LinearLayout) linearLayout.findViewById(C0462R.C0464id.id_ll_music_list_loading);
        TextView textView = this.f2446e;
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setSingleLine(true);
            textView.setSelected(true);
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);
            textView.setMarqueeRepeatLimit(-1);
        }
        Intent intent = new Intent(getActivity(), PlayService.class);
        intent.setPackage(getActivity().getPackageName());
        if ("ELK".equals("replugin") || Build.VERSION.SDK_INT < 26) {
            getActivity().startService(intent);
        } else {
            getActivity().startForegroundService(intent);
        }
        this.f2445d = new C0507g(C0529b.m1814a().mo4943b(), getContext());
        this.f2444c.setAdapter(this.f2445d);
        this.f2457p = new Handler();
        this.f2452k.setOnClickListener(this);
        this.f2451j.setOnClickListener(this);
        this.f2453l.setOnClickListener(this);
        this.f2444c.setOnItemClickListener(this);
        this.f2454m.setOnSeekBarChangeListener(this);
        this.f2450i.setOnClickListener(this);
        m1956e();
        return linearLayout;
    }

    public void onDestroyView() {
        if (this.f2442a != null) {
            if (this.f2442a.mo5095g()) {
                this.f2442a.mo5091c();
            }
            this.f2442a.mo5088a((C0599z) null);
        }
        if (this.f2456o) {
            getActivity().unbindService(this.f2458q);
            this.f2456o = false;
        }
        this.f2442a = null;
        this.f2445d = null;
        m1950a(false);
        this.f2457p.removeCallbacksAndMessages((Object) null);
        super.onDestroyView();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            if (this.f2442a != null) {
                if (this.f2442a.mo5095g()) {
                    this.f2442a.mo5091c();
                }
                this.f2442a.mo5088a((C0599z) null);
            }
            if (this.f2456o) {
                getActivity().unbindService(this.f2458q);
                this.f2456o = false;
            }
            this.f2442a = null;
            m1950a(false);
            return;
        }
        m1956e();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i != this.f2442a.mo5097i() || !this.f2442a.mo5095g()) {
            this.f2442a.mo5086a(i);
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && this.f2442a != null && this.f2442a.mo5098j() != null) {
            this.f2448g.setText(C0550m.m1924a(C0550m.m1923a(i, this.f2442a.mo5098j())));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f2455n = true;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (!(seekBar == null || this.f2442a == null || this.f2442a.mo5098j() == null)) {
            this.f2442a.mo5089b((int) C0550m.m1923a(seekBar.getProgress(), this.f2442a.mo5098j()));
        }
        this.f2455n = false;
    }
}
