package p021wl.smartled.fragment;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.p007v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.Locale;
import p021wl.smartled.p022a.C0477c;
import p021wl.smartled.p024c.C0531d;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.views.C0622m;
import p021wl.smartled.views.C0623n;
import p021wl.smartled.views.SwitchButton;
import p021wl.smartled.views.WeekSelectView;

/* renamed from: wl.smartled.fragment.TimingFragment */
public class TimingFragment extends Fragment implements View.OnClickListener, C0477c, C0622m, C0623n {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeekSelectView f2505a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeekSelectView f2506b;

    /* renamed from: c */
    private LinearLayout f2507c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TextView f2508d;

    /* renamed from: e */
    private LinearLayout f2509e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f2510f;

    /* renamed from: g */
    private TimePickerDialog f2511g;

    /* renamed from: h */
    private TimePickerDialog f2512h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public SwitchButton f2513i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public SwitchButton f2514j;

    /* renamed from: k */
    private boolean f2515k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f2516l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f2517m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f2518n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f2519o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Handler f2520p = new C0562h(this);

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1985a() {
        this.f2508d.setText(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(C0531d.m1823a().mo4952b()), Integer.valueOf(C0531d.m1823a().mo4955c())}));
        this.f2510f.setText(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(C0531d.m1823a().mo4961f()), Integer.valueOf(C0531d.m1823a().mo4963g())}));
    }

    /* renamed from: a */
    public final void mo5056a(View view, int i) {
        if (this.f2505a == view) {
            C0531d.m1823a().mo4956c(i);
            this.f2520p.sendEmptyMessage(101);
        } else if (this.f2506b == view) {
            C0531d.m1823a().mo4962f(i);
            this.f2520p.sendEmptyMessage(102);
        }
    }

    /* renamed from: a */
    public final void mo4755a(View view, boolean z) {
        if (view == this.f2513i) {
            C0531d.m1823a().mo4951a(z);
            this.f2520p.sendEmptyMessage(101);
        } else if (view == this.f2514j) {
            C0531d.m1823a().mo4954b(z);
            this.f2520p.sendEmptyMessage(102);
        }
    }

    /* renamed from: a */
    public final void mo4751a(String str, byte[] bArr) {
        this.f2520p.post(new C0565k(this, str, bArr));
    }

    public void onClick(View view) {
        if (view == this.f2507c) {
            if (this.f2511g != null && this.f2511g.isShowing()) {
                this.f2511g.dismiss();
            }
            this.f2511g = new TimePickerDialog(getContext(), 3, new C0563i(this), C0531d.m1823a().mo4952b(), C0531d.m1823a().mo4955c(), true);
            this.f2511g.show();
        } else if (view == this.f2509e) {
            if (this.f2512h != null && this.f2512h.isShowing()) {
                this.f2512h.dismiss();
            }
            this.f2512h = new TimePickerDialog(getContext(), 3, new C0564j(this), C0531d.m1823a().mo4961f(), C0531d.m1823a().mo4963g(), true);
            this.f2512h.show();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C0462R.layout.fragment_timing, viewGroup, false);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            if (this.f2511g != null && this.f2511g.isShowing()) {
                this.f2511g.dismiss();
            }
            if (this.f2512h != null && this.f2512h.isShowing()) {
                this.f2512h.dismiss();
            }
            this.f2520p.removeMessages(200);
            this.f2520p.removeMessages(201);
            this.f2520p.removeMessages(202);
            this.f2520p.removeMessages(203);
            this.f2520p.removeMessages(204);
            this.f2520p.removeMessages(205);
            this.f2520p.removeMessages(206);
            this.f2520p.removeMessages(100);
            this.f2520p.removeMessages(101);
            this.f2520p.removeMessages(102);
            C0538a.m1861a().mo4994a((C0477c) null);
            return;
        }
        m1985a();
        C0538a.m1861a().mo4994a((C0477c) this);
        this.f2516l = 200;
        this.f2520p.sendEmptyMessage(100);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.f2515k) {
            this.f2505a = (WeekSelectView) view.findViewById(C0462R.C0464id.id_ws_alarm_on);
            this.f2505a.mo5208a((C0623n) this);
            this.f2506b = (WeekSelectView) view.findViewById(C0462R.C0464id.id_ws_alarm_off);
            this.f2506b.mo5208a((C0623n) this);
            this.f2507c = (LinearLayout) view.findViewById(C0462R.C0464id.id_ll_time_alarm_on);
            this.f2507c.setOnClickListener(this);
            this.f2509e = (LinearLayout) view.findViewById(C0462R.C0464id.id_ll_time_alarm_off);
            this.f2509e.setOnClickListener(this);
            this.f2513i = (SwitchButton) view.findViewById(C0462R.C0464id.id_sb_alarm_on);
            this.f2513i.mo5202a(this);
            this.f2514j = (SwitchButton) view.findViewById(C0462R.C0464id.id_sb_alarm_off);
            this.f2514j.mo5202a(this);
            this.f2508d = (TextView) view.findViewById(C0462R.C0464id.id_tv_timing_alarm_on_time);
            this.f2510f = (TextView) view.findViewById(C0462R.C0464id.id_tv_timing_alarm_off_time);
            m1985a();
            this.f2515k = true;
            C0538a.m1861a().mo4994a((C0477c) this);
            this.f2519o = false;
            this.f2516l = 200;
            this.f2520p.sendEmptyMessage(100);
        }
    }
}
