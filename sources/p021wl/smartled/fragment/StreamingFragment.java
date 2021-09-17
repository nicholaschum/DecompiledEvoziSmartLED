package p021wl.smartled.fragment;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p007v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.Random;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.service.AudioRecorderService;
import p021wl.smartled.service.C0577d;
import p021wl.smartled.views.CircleProgressView;
import p021wl.smartled.views.VoiceLineView;

/* renamed from: wl.smartled.fragment.StreamingFragment */
public class StreamingFragment extends Fragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, C0577d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CircleProgressView f2484a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AudioRecorderService f2485b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public TextView f2486c;

    /* renamed from: d */
    private ImageView f2487d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public VoiceLineView f2488e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f2489f;

    /* renamed from: g */
    private boolean f2490g;

    /* renamed from: h */
    private boolean f2491h = true;

    /* renamed from: i */
    private boolean f2492i = true;

    /* renamed from: j */
    private int f2493j = 3;

    /* renamed from: k */
    private ImageView f2494k;

    /* renamed from: l */
    private RadioButton f2495l;

    /* renamed from: m */
    private RadioButton f2496m;

    /* renamed from: n */
    private RadioButton f2497n;

    /* renamed from: o */
    private RadioButton f2498o;

    /* renamed from: p */
    private RadioButton f2499p;

    /* renamed from: q */
    private RadioButton f2500q;

    /* renamed from: r */
    private View f2501r;

    /* renamed from: s */
    private TextView f2502s;

    /* renamed from: t */
    private SeekBar f2503t;

    /* renamed from: u */
    private ServiceConnection f2504u = new C0560f(this);

    /* renamed from: a */
    private void m1976a(boolean z) {
        if (!z) {
            if (this.f2490g) {
                getActivity().unbindService(this.f2504u);
                this.f2490g = false;
            }
            this.f2485b = null;
        } else if (this.f2485b == null) {
            Intent intent = new Intent(getActivity(), AudioRecorderService.class);
            intent.setPackage(getActivity().getPackageName());
            this.f2490g = getActivity().bindService(intent, this.f2504u, 1);
            Log.d("StreamingFragment", "startRecorder = " + this.f2490g);
        }
    }

    /* renamed from: a */
    public final void mo4766a(double d) {
        int i = (int) (((d - 20.0d) * 100.0d) / 63.0d);
        if (this.f2489f != null) {
            if (i < 0) {
                i = 0;
            } else if (i > 100) {
                i = 100;
            }
            Message obtain = Message.obtain();
            obtain.arg1 = i;
            obtain.arg2 = (int) d;
            obtain.what = 103;
            this.f2489f.sendMessage(obtain);
            if (this.f2491h && this.f2492i) {
                C0538a.m1861a().mo5003c(getContext(), C0528a.m1795a().mo4941e(), new Random().nextInt(), i);
            }
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            switch (compoundButton.getId()) {
                case C0462R.C0464id.id_rb_classic:
                    this.f2493j = 0;
                    C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, true);
                    return;
                case C0462R.C0464id.id_rb_disco:
                    this.f2493j = 3;
                    C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, true);
                    return;
                case C0462R.C0464id.id_rb_dynamic:
                    this.f2493j = 2;
                    C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, true);
                    return;
                case C0462R.C0464id.id_rb_external_mic:
                    this.f2492i = false;
                    if (!this.f2491h) {
                        this.f2491h = true;
                        this.f2494k.setImageResource(C0462R.C0463drawable.ic_hop_n);
                    }
                    this.f2501r.setVisibility(0);
                    C0538a.m1861a().mo4989a(getContext(), C0528a.m1795a().mo4941e(), true, true);
                    C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, true);
                    return;
                case C0462R.C0464id.id_rb_phone_mic:
                    this.f2492i = true;
                    if (!this.f2491h) {
                        this.f2491h = true;
                        this.f2494k.setImageResource(C0462R.C0463drawable.ic_hop_n);
                    }
                    this.f2501r.setVisibility(8);
                    C0538a.m1861a().mo4989a(getContext(), C0528a.m1795a().mo4941e(), false, true);
                    return;
                case C0462R.C0464id.id_rb_soft:
                    this.f2493j = 1;
                    C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, true);
                    return;
                default:
                    return;
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0462R.C0464id.id_iv_send_amplitude) {
            this.f2491h = !this.f2491h;
            this.f2494k.setImageResource(this.f2491h ? C0462R.C0463drawable.ic_hop_n : C0462R.C0463drawable.ic_hop_u);
            if (!this.f2492i) {
                C0538a.m1861a().mo4989a(getContext(), C0528a.m1795a().mo4941e(), this.f2491h, true);
                if (this.f2491h) {
                    C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, true);
                }
            }
        } else if (id == C0462R.C0464id.id_iv_start_recording) {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C0462R.layout.fragment_streaming, viewGroup, false);
        this.f2486c = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_recording_db);
        this.f2494k = (ImageView) linearLayout.findViewById(C0462R.C0464id.id_iv_send_amplitude);
        this.f2494k.setOnClickListener(this);
        this.f2495l = (RadioButton) linearLayout.findViewById(C0462R.C0464id.id_rb_phone_mic);
        this.f2496m = (RadioButton) linearLayout.findViewById(C0462R.C0464id.id_rb_external_mic);
        this.f2497n = (RadioButton) linearLayout.findViewById(C0462R.C0464id.id_rb_classic);
        this.f2498o = (RadioButton) linearLayout.findViewById(C0462R.C0464id.id_rb_soft);
        this.f2499p = (RadioButton) linearLayout.findViewById(C0462R.C0464id.id_rb_dynamic);
        this.f2500q = (RadioButton) linearLayout.findViewById(C0462R.C0464id.id_rb_disco);
        this.f2495l.setOnCheckedChangeListener(this);
        this.f2496m.setOnCheckedChangeListener(this);
        this.f2497n.setOnCheckedChangeListener(this);
        this.f2498o.setOnCheckedChangeListener(this);
        this.f2499p.setOnCheckedChangeListener(this);
        this.f2500q.setOnCheckedChangeListener(this);
        this.f2501r = linearLayout.findViewById(C0462R.C0464id.id_ll_external_mic_options);
        this.f2502s = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_sensitive);
        this.f2503t = (SeekBar) linearLayout.findViewById(C0462R.C0464id.id_sb_sensitive);
        this.f2503t.setOnSeekBarChangeListener(this);
        this.f2488e = (VoiceLineView) linearLayout.findViewById(C0462R.C0464id.id_vlv_voice);
        this.f2484a = (CircleProgressView) linearLayout.findViewById(C0462R.C0464id.id_cpv_amplitude);
        this.f2487d = (ImageView) linearLayout.findViewById(C0462R.C0464id.id_iv_start_recording);
        this.f2487d.setOnClickListener(this);
        m1976a(true);
        this.f2489f = new C0561g(this);
        return linearLayout;
    }

    public void onDestroyView() {
        if (this.f2485b != null) {
            this.f2485b.mo5071a((C0577d) null);
        }
        this.f2489f.removeMessages(103);
        this.f2489f = null;
        m1976a(false);
        super.onDestroyView();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            if (this.f2485b != null) {
                this.f2485b.mo5071a((C0577d) null);
            }
            this.f2489f.removeMessages(103);
            m1976a(false);
            return;
        }
        m1976a(true);
        if (!this.f2492i && this.f2491h) {
            C0538a.m1861a().mo4989a(getContext(), C0528a.m1795a().mo4941e(), true, false);
            C0538a.m1861a().mo4999b(getContext(), C0528a.m1795a().mo4941e(), this.f2493j, false);
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        this.f2502s.setText(String.valueOf(i));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C0538a.m1861a().mo5007e(getContext(), C0528a.m1795a().mo4941e(), seekBar.getProgress());
    }
}
