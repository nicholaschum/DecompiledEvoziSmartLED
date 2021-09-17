package p021wl.smartled.fragment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.support.p007v4.app.Fragment;
import android.support.p007v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.List;
import p021wl.smartled.adapter.ColorSelectorAdapter;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p024c.C0530c;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.views.C0601b;
import p021wl.smartled.views.C0620k;
import p021wl.smartled.views.C0622m;
import p021wl.smartled.views.RainbowPalette;
import p021wl.smartled.views.SwitchButton;

/* renamed from: wl.smartled.fragment.ColorChangeFragment */
public class ColorChangeFragment extends Fragment implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, C0559e, C0601b, C0620k, C0622m {

    /* renamed from: a */
    private ImageButton f2424a;

    /* renamed from: b */
    private RainbowPalette f2425b;

    /* renamed from: c */
    private ColorSelectorAdapter f2426c;

    /* renamed from: d */
    private ColorSelectorAdapter f2427d;

    /* renamed from: e */
    private SeekBar f2428e;

    /* renamed from: f */
    private SwitchButton f2429f;

    /* renamed from: g */
    private View f2430g;

    /* renamed from: h */
    private TextView f2431h;

    /* renamed from: i */
    private TextView f2432i;

    /* renamed from: j */
    private TextView f2433j;

    /* renamed from: k */
    private RGBAdjustDialogFragment f2434k;

    /* renamed from: l */
    private int f2435l;

    /* renamed from: m */
    private int f2436m;

    /* renamed from: a */
    private static double m1936a(double d) {
        if (d > 6.26d) {
            return 100.0d;
        }
        if (d < 0.01d) {
            return 0.0d;
        }
        return ((d - 0.01d) * 100.0d) / 6.25d;
    }

    /* renamed from: a */
    private void m1937a(int i) {
        ImageButton imageButton;
        int i2;
        if (i == RainbowPalette.f2748b) {
            this.f2425b.mo5193a(RainbowPalette.f2748b);
            imageButton = this.f2424a;
            i2 = C0462R.C0463drawable.ic_small_wheel;
        } else if (i == RainbowPalette.f2749c) {
            this.f2425b.mo5193a(RainbowPalette.f2749c);
            imageButton = this.f2424a;
            i2 = C0462R.C0463drawable.temprature_s;
        } else if (i == RainbowPalette.f2750d) {
            this.f2425b.mo5193a(RainbowPalette.f2750d);
            imageButton = this.f2424a;
            i2 = C0462R.C0463drawable.black_s;
        } else {
            if (i == RainbowPalette.f2751e) {
                this.f2425b.mo5193a(RainbowPalette.f2751e);
                imageButton = this.f2424a;
                i2 = C0462R.C0463drawable.ic_colorwheel;
            }
            m1939b();
        }
        imageButton.setBackgroundResource(i2);
        m1939b();
    }

    /* renamed from: a */
    private void m1938a(int i, double d, int i2) {
        int a = (int) m1936a(d);
        if (i2 == RainbowPalette.f2748b || i2 == RainbowPalette.f2749c) {
            C0538a.m1861a().mo4984a(getContext(), C0528a.m1795a().mo4941e(), i);
        } else if (i2 == RainbowPalette.f2750d) {
            C0538a.m1861a().mo4985a(getContext(), C0528a.m1795a().mo4941e(), 100 - a, a);
        } else if (i2 == RainbowPalette.f2751e) {
            C0538a.m1861a().mo4997b(getContext(), C0528a.m1795a().mo4941e(), a);
        }
    }

    /* renamed from: b */
    private void m1939b() {
        int a = this.f2425b.mo5192a();
        if (a == RainbowPalette.f2751e ? C0530c.m1816a().mo4948c() : a == RainbowPalette.f2750d ? C0530c.m1816a().mo4949d() : C0530c.m1816a().mo4946b()) {
            this.f2429f.mo5203b();
        } else {
            this.f2429f.mo5201a();
        }
    }

    /* renamed from: b */
    private void m1940b(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        this.f2431h.setBackgroundColor(Color.rgb(red, 0, 0));
        this.f2432i.setBackgroundColor(Color.rgb(0, green, 0));
        this.f2433j.setBackgroundColor(Color.rgb(0, 0, blue));
        this.f2431h.setText(String.valueOf(red));
        this.f2432i.setText(String.valueOf(green));
        this.f2433j.setText(String.valueOf(blue));
    }

    /* renamed from: a */
    public final void mo5021a() {
        this.f2434k = null;
    }

    /* renamed from: a */
    public final void mo5022a(int i, int i2, int i3) {
        int a = this.f2425b.mo5192a();
        if (a == RainbowPalette.f2748b || a == RainbowPalette.f2749c) {
            int rgb = Color.rgb(i, i2, i3);
            m1940b(rgb);
            this.f2427d.mo4807a(rgb);
            C0538a.m1861a().mo4984a(getContext(), C0528a.m1795a().mo4941e(), rgb);
        }
        this.f2434k = null;
    }

    /* renamed from: a */
    public final void mo5023a(int i, Point point, double d) {
        ColorSelectorAdapter colorSelectorAdapter;
        int i2;
        m1940b(i);
        int a = this.f2425b.mo5192a();
        if (a == RainbowPalette.f2748b || a == RainbowPalette.f2749c) {
            this.f2427d.mo4808a(i, d, point);
        } else {
            if (a == RainbowPalette.f2750d) {
                colorSelectorAdapter = this.f2427d;
                i2 = 4;
            } else if (a == RainbowPalette.f2751e) {
                colorSelectorAdapter = this.f2427d;
                i2 = 5;
            }
            colorSelectorAdapter.mo4809a(i2, i, d, point);
        }
        m1938a(i, (double) ((int) d), this.f2425b.mo5192a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r0 == false) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4755a(android.view.View r13, boolean r14) {
        /*
            r12 = this;
            wl.smartled.views.RainbowPalette r13 = r12.f2425b
            int r13 = r13.mo5192a()
            wl.smartled.c.a r0 = p021wl.smartled.p024c.C0528a.m1795a()
            java.util.List r0 = r0.mo4937c()
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L_0x0041
            java.util.Iterator r4 = r0.iterator()
        L_0x0017:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0041
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "ELK_"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0032
            java.lang.String r6 = "^ELK_.+CT.*"
        L_0x002d:
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r3)
            goto L_0x0035
        L_0x0032:
            java.lang.String r6 = "^ELK-.+CT.*"
            goto L_0x002d
        L_0x0035:
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r5 = r5.find()
            if (r5 == 0) goto L_0x0017
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r0 = r0.iterator()
        L_0x0048:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0072
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "ELK_"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0063
            java.lang.String r6 = "^ELK_.+W.*"
        L_0x005e:
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6, r3)
            goto L_0x0066
        L_0x0063:
            java.lang.String r6 = "^ELK-.+W.*"
            goto L_0x005e
        L_0x0066:
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r5 = r5.find()
            if (r5 == 0) goto L_0x0048
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            int r5 = p021wl.smartled.views.RainbowPalette.f2751e
            if (r13 != r5) goto L_0x0093
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4945b(r14)
            if (r0 == 0) goto L_0x0082
            r11 = 2
            goto L_0x00d5
        L_0x0082:
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4944a(r14)
            if (r4 != 0) goto L_0x00d4
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4947c(r14)
            goto L_0x00d2
        L_0x0093:
            int r3 = p021wl.smartled.views.RainbowPalette.f2750d
            if (r13 != r3) goto L_0x00b4
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4947c(r14)
            if (r4 == 0) goto L_0x00a3
            r1 = 3
            r11 = 3
            goto L_0x00d5
        L_0x00a3:
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4944a(r14)
            if (r0 != 0) goto L_0x00d4
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4945b(r14)
            goto L_0x00d2
        L_0x00b4:
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4944a(r14)
            if (r4 != 0) goto L_0x00c4
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4947c(r14)
        L_0x00c4:
            if (r0 != 0) goto L_0x00cd
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            r13.mo4945b(r14)
        L_0x00cd:
            if (r4 != 0) goto L_0x00d4
            if (r0 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r11 = 0
            goto L_0x00d5
        L_0x00d4:
            r11 = 1
        L_0x00d5:
            wl.smartled.f.a r5 = p021wl.smartled.p027f.C0538a.m1861a()
            android.content.Context r6 = r12.getContext()
            wl.smartled.c.a r13 = p021wl.smartled.p024c.C0528a.m1795a()
            java.util.List r7 = r13.mo4941e()
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            boolean r8 = r13.mo4946b()
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            boolean r9 = r13.mo4948c()
            wl.smartled.c.c r13 = p021wl.smartled.p024c.C0530c.m1816a()
            boolean r10 = r13.mo4949d()
            r5.mo4990a(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.fragment.ColorChangeFragment.mo4755a(android.view.View, boolean):void");
    }

    /* renamed from: a */
    public final boolean mo5024a(View view, int i) {
        int i2;
        int i3;
        int a = this.f2425b.mo5192a();
        ColorSelectorAdapter colorSelectorAdapter = (ColorSelectorAdapter) view;
        if (colorSelectorAdapter.mo4811c() == 2) {
            if (i == 4) {
                if (a != RainbowPalette.f2750d) {
                    i2 = RainbowPalette.f2750d;
                }
            } else if (i != 5) {
                if (a == RainbowPalette.f2750d || a == RainbowPalette.f2751e) {
                    if (this.f2435l == RainbowPalette.f2748b) {
                        i2 = RainbowPalette.f2748b;
                    } else if (this.f2435l == RainbowPalette.f2749c) {
                        i2 = RainbowPalette.f2749c;
                    } else {
                        Log.e("ColorChangeFragment", "onSelect: Unknown mode.");
                    }
                    this.f2436m = i;
                }
                i2 = -1;
                this.f2436m = i;
            } else if (a != RainbowPalette.f2751e) {
                i2 = RainbowPalette.f2751e;
            }
            i2 = -1;
        } else {
            if (a == RainbowPalette.f2750d || a == RainbowPalette.f2751e) {
                if (this.f2435l == RainbowPalette.f2748b) {
                    i3 = RainbowPalette.f2748b;
                } else if (this.f2435l == RainbowPalette.f2749c) {
                    i3 = RainbowPalette.f2749c;
                } else {
                    Log.e("ColorChangeFragment", "onSelect: Unknown mode.");
                }
                this.f2427d.mo5171d(this.f2436m);
            }
            i3 = -1;
            this.f2427d.mo5171d(this.f2436m);
        }
        if (i2 != -1) {
            m1937a(i2);
            a = i2;
        }
        int d = colorSelectorAdapter.mo5170d();
        m1938a(d, ColorSelectorAdapter.m1656b(i), a);
        if (a == RainbowPalette.f2748b || a == RainbowPalette.f2749c) {
            m1940b(d);
            this.f2430g.setVisibility(0);
            return true;
        }
        this.f2430g.setVisibility(4);
        return true;
    }

    public void onClick(View view) {
        int a = this.f2425b.mo5192a();
        int id = view.getId();
        if (id == C0462R.C0464id.id_change_mode) {
            if (a == RainbowPalette.f2748b) {
                this.f2435l = RainbowPalette.f2749c;
                m1937a(RainbowPalette.f2749c);
                this.f2427d.mo5169c(this.f2436m);
                this.f2430g.setVisibility(0);
            } else if (a == RainbowPalette.f2749c) {
                m1937a(RainbowPalette.f2750d);
                this.f2427d.mo5169c(4);
                this.f2430g.setVisibility(4);
            } else if (a == RainbowPalette.f2750d) {
                m1937a(RainbowPalette.f2751e);
                this.f2427d.mo5169c(5);
                this.f2430g.setVisibility(4);
            } else if (a == RainbowPalette.f2751e) {
                this.f2435l = RainbowPalette.f2748b;
                m1937a(RainbowPalette.f2748b);
                this.f2427d.mo5169c(this.f2436m);
                this.f2430g.setVisibility(0);
            }
        } else if (id == C0462R.C0464id.id_ll_rgb_adjust && this.f2434k == null) {
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            this.f2434k = RGBAdjustDialogFragment.m1972a(Integer.valueOf(this.f2431h.getText().toString()).intValue(), Integer.valueOf(this.f2432i.getText().toString()).intValue(), Integer.valueOf(this.f2433j.getText().toString()).intValue());
            this.f2434k.mo5046a(this);
            this.f2434k.show(supportFragmentManager, "RGBAdjustDialogFragment");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C0462R.layout.fragment_color_change, viewGroup, false);
        this.f2426c = (ColorSelectorAdapter) linearLayout.findViewById(C0462R.C0464id.id_color_default_select);
        this.f2427d = (ColorSelectorAdapter) linearLayout.findViewById(C0462R.C0464id.id_color_customized_select);
        this.f2436m = 0;
        this.f2435l = RainbowPalette.f2748b;
        this.f2425b = (RainbowPalette) linearLayout.findViewById(C0462R.C0464id.id_palette);
        this.f2425b.mo5194a((C0620k) this);
        this.f2424a = (ImageButton) linearLayout.findViewById(C0462R.C0464id.id_change_mode);
        this.f2424a.setOnClickListener(this);
        this.f2430g = linearLayout.findViewById(C0462R.C0464id.id_ll_rgb_adjust);
        this.f2430g.setOnClickListener(this);
        this.f2426c.mo5168a((C0601b) this);
        this.f2427d.mo5168a((C0601b) this);
        this.f2431h = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_r);
        this.f2432i = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_g);
        this.f2433j = (TextView) linearLayout.findViewById(C0462R.C0464id.id_tv_b);
        int b = ColorSelectorAdapter.m1657b();
        TextView textView = this.f2431h;
        StringBuilder sb = new StringBuilder();
        sb.append(Color.red(b));
        textView.setText(sb.toString());
        TextView textView2 = this.f2432i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Color.green(b));
        textView2.setText(sb2.toString());
        TextView textView3 = this.f2433j;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Color.blue(b));
        textView3.setText(sb3.toString());
        this.f2429f = (SwitchButton) linearLayout.findViewById(C0462R.C0464id.id_sb_rgbw_onoff);
        this.f2429f.mo5202a(this);
        this.f2428e = (SeekBar) linearLayout.findViewById(C0462R.C0464id.id_sb_brightness_change);
        this.f2428e.setOnSeekBarChangeListener(this);
        return linearLayout;
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        C0538a a = C0538a.m1861a();
        Context context = getContext();
        List<String> e = C0528a.m1795a().mo4941e();
        int progress = seekBar.getProgress();
        int a2 = this.f2425b.mo5192a();
        int i = 1;
        if (!(a2 == RainbowPalette.f2748b || a2 == RainbowPalette.f2749c)) {
            if (a2 == RainbowPalette.f2750d) {
                i = 3;
            } else if (a2 == RainbowPalette.f2751e) {
                i = 2;
            }
        }
        a.mo4998b(context, e, progress, i);
    }
}
