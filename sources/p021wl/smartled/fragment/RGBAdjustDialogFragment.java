package p021wl.smartled.fragment;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p007v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.fragment.RGBAdjustDialogFragment */
public class RGBAdjustDialogFragment extends DialogFragment implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    private SeekBar f2460a;

    /* renamed from: b */
    private SeekBar f2461b;

    /* renamed from: c */
    private SeekBar f2462c;

    /* renamed from: d */
    private TextView f2463d;

    /* renamed from: e */
    private TextView f2464e;

    /* renamed from: f */
    private TextView f2465f;

    /* renamed from: g */
    private TextView f2466g;

    /* renamed from: h */
    private TextView f2467h;

    /* renamed from: i */
    private TextView f2468i;

    /* renamed from: j */
    private View f2469j;

    /* renamed from: k */
    private View f2470k;

    /* renamed from: l */
    private View f2471l;

    /* renamed from: m */
    private View f2472m;

    /* renamed from: n */
    private View f2473n;

    /* renamed from: o */
    private View f2474o;

    /* renamed from: p */
    private View f2475p;

    /* renamed from: q */
    private Button f2476q;

    /* renamed from: r */
    private Button f2477r;

    /* renamed from: s */
    private boolean f2478s;

    /* renamed from: t */
    private C0559e f2479t;

    /* renamed from: u */
    private int f2480u;

    /* renamed from: v */
    private int f2481v;

    /* renamed from: w */
    private int f2482w;

    /* renamed from: x */
    private int f2483x;

    /* renamed from: a */
    public static RGBAdjustDialogFragment m1972a(int i, int i2, int i3) {
        RGBAdjustDialogFragment rGBAdjustDialogFragment = new RGBAdjustDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        bundle.putInt("g", i2);
        bundle.putInt("b", i3);
        rGBAdjustDialogFragment.setArguments(bundle);
        return rGBAdjustDialogFragment;
    }

    /* renamed from: a */
    public final void mo5046a(C0559e eVar) {
        this.f2479t = eVar;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C0462R.C0464id.id_cb_cancel:
                this.f2478s = true;
                dismiss();
                if (this.f2479t != null) {
                    this.f2479t.mo5021a();
                    return;
                }
                return;
            case C0462R.C0464id.id_cb_ok:
                this.f2478s = true;
                dismiss();
                if (this.f2479t != null) {
                    this.f2479t.mo5022a(this.f2481v, this.f2482w, this.f2483x);
                    return;
                }
                return;
            case C0462R.C0464id.id_fl_b_minus:
                int i = this.f2483x - 1;
                this.f2483x = i;
                if (i < 0) {
                    this.f2483x = 0;
                    return;
                } else {
                    this.f2462c.setProgress(this.f2483x);
                    return;
                }
            case C0462R.C0464id.id_fl_b_plus:
                int i2 = this.f2483x + 1;
                this.f2483x = i2;
                if (i2 > this.f2462c.getMax()) {
                    this.f2483x = this.f2462c.getMax();
                    return;
                } else {
                    this.f2462c.setProgress(this.f2483x);
                    return;
                }
            case C0462R.C0464id.id_fl_g_minus:
                int i3 = this.f2482w - 1;
                this.f2482w = i3;
                if (i3 < 0) {
                    this.f2482w = 0;
                    return;
                } else {
                    this.f2461b.setProgress(this.f2482w);
                    return;
                }
            case C0462R.C0464id.id_fl_g_plus:
                int i4 = this.f2482w + 1;
                this.f2482w = i4;
                if (i4 > this.f2461b.getMax()) {
                    this.f2482w = this.f2461b.getMax();
                    return;
                } else {
                    this.f2461b.setProgress(this.f2482w);
                    return;
                }
            case C0462R.C0464id.id_fl_r_minus:
                int i5 = this.f2481v - 1;
                this.f2481v = i5;
                if (i5 < 0) {
                    this.f2481v = 0;
                    return;
                } else {
                    this.f2460a.setProgress(this.f2481v);
                    return;
                }
            case C0462R.C0464id.id_fl_r_plus:
                int i6 = this.f2481v + 1;
                this.f2481v = i6;
                if (i6 > this.f2460a.getMax()) {
                    this.f2481v = this.f2460a.getMax();
                    return;
                } else {
                    this.f2460a.setProgress(this.f2481v);
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f2481v = arguments.getInt("r");
            this.f2482w = arguments.getInt("g");
            this.f2483x = arguments.getInt("b");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getActivity().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f2480u = displayMetrics.widthPixels;
        setStyle(0, C0462R.style.rgb_ajust_dialog_fragment);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0462R.layout.fragment_rgb_adjust, viewGroup, false);
        this.f2476q = (Button) inflate.findViewById(C0462R.C0464id.id_cb_ok);
        this.f2477r = (Button) inflate.findViewById(C0462R.C0464id.id_cb_cancel);
        this.f2476q.setOnClickListener(this);
        this.f2477r.setOnClickListener(this);
        this.f2460a = (SeekBar) inflate.findViewById(C0462R.C0464id.id_sb_r_change);
        this.f2461b = (SeekBar) inflate.findViewById(C0462R.C0464id.id_sb_g_change);
        this.f2462c = (SeekBar) inflate.findViewById(C0462R.C0464id.id_sb_b_change);
        this.f2460a.setOnSeekBarChangeListener(this);
        this.f2461b.setOnSeekBarChangeListener(this);
        this.f2462c.setOnSeekBarChangeListener(this);
        this.f2463d = (TextView) inflate.findViewById(C0462R.C0464id.id_tv_r_percent);
        this.f2464e = (TextView) inflate.findViewById(C0462R.C0464id.id_tv_g_percent);
        this.f2465f = (TextView) inflate.findViewById(C0462R.C0464id.id_tv_b_percent);
        this.f2466g = (TextView) inflate.findViewById(C0462R.C0464id.id_tv_r_text);
        this.f2467h = (TextView) inflate.findViewById(C0462R.C0464id.id_tv_g_text);
        this.f2468i = (TextView) inflate.findViewById(C0462R.C0464id.id_tv_b_text);
        this.f2470k = inflate.findViewById(C0462R.C0464id.id_fl_r_minus);
        this.f2471l = inflate.findViewById(C0462R.C0464id.id_fl_g_minus);
        this.f2472m = inflate.findViewById(C0462R.C0464id.id_fl_b_minus);
        this.f2473n = inflate.findViewById(C0462R.C0464id.id_fl_r_plus);
        this.f2474o = inflate.findViewById(C0462R.C0464id.id_fl_g_plus);
        this.f2475p = inflate.findViewById(C0462R.C0464id.id_fl_b_plus);
        this.f2470k.setOnClickListener(this);
        this.f2471l.setOnClickListener(this);
        this.f2472m.setOnClickListener(this);
        this.f2473n.setOnClickListener(this);
        this.f2474o.setOnClickListener(this);
        this.f2475p.setOnClickListener(this);
        this.f2469j = inflate.findViewById(C0462R.C0464id.id_v_color_indicator);
        this.f2460a.setProgress(this.f2481v);
        this.f2461b.setProgress(this.f2482w);
        this.f2462c.setProgress(this.f2483x);
        return inflate;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f2478s) {
            this.f2478s = false;
        } else if (this.f2479t != null) {
            this.f2479t.mo5021a();
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int argb;
        TextView textView;
        if (seekBar == this.f2460a) {
            this.f2481v = i;
            this.f2463d.setText(String.valueOf(i));
            argb = Color.argb(255, this.f2481v, 0, 0);
            this.f2463d.setTextColor(argb);
            textView = this.f2466g;
        } else if (seekBar == this.f2461b) {
            this.f2482w = i;
            this.f2464e.setText(String.valueOf(i));
            argb = Color.argb(255, 0, this.f2482w, 0);
            this.f2464e.setTextColor(argb);
            textView = this.f2467h;
        } else {
            if (seekBar == this.f2462c) {
                this.f2483x = i;
                this.f2465f.setText(String.valueOf(i));
                argb = Color.argb(255, 0, 0, this.f2483x);
                this.f2465f.setTextColor(argb);
                textView = this.f2468i;
            }
            this.f2469j.setBackgroundColor(Color.argb(255, this.f2481v, this.f2482w, this.f2483x));
        }
        textView.setTextColor(argb);
        this.f2469j.setBackgroundColor(Color.argb(255, this.f2481v, this.f2482w, this.f2483x));
    }

    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout((int) (((float) this.f2480u) * 0.96f), -2);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
