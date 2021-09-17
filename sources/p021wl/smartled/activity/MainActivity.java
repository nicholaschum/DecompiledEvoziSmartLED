package p021wl.smartled.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.support.p007v4.app.Fragment;
import android.support.p007v4.app.FragmentTransaction;
import android.support.p007v4.content.ContextCompat;
import android.support.p007v4.content.LocalBroadcastManager;
import android.support.p007v4.widget.DrawerLayout;
import android.support.p010v7.app.AppCompatActivity;
import android.support.p010v7.app.C0240o;
import android.support.p010v7.app.C0241p;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p021wl.smartled.adapter.C0503c;
import p021wl.smartled.adapter.C0504d;
import p021wl.smartled.beans.C0522c;
import p021wl.smartled.beans.C0524e;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p022a.C0475a;
import p021wl.smartled.p022a.C0476b;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p026e.C0534a;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.p027f.C0544g;
import p021wl.smartled.p027f.C0549l;
import p021wl.smartled.p027f.C0553p;
import p021wl.smartled.service.BluetoothLEService;
import p021wl.smartled.service.PlayService;
import p021wl.smartled.views.C0600a;
import p021wl.smartled.views.C0622m;
import p021wl.smartled.views.SwitchButton;

/* renamed from: wl.smartled.activity.MainActivity */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupClickListener, C0475a, C0476b, C0504d, C0622m {

    /* renamed from: V */
    private static final int[] f2073V = {C0462R.C0464id.id_ll_color_change, C0462R.C0464id.id_ll_music, C0462R.C0464id.id_ll_l_music, C0462R.C0464id.id_ll_mode, C0462R.C0464id.id_ll_streaming, C0462R.C0464id.id_ll_timing};

    /* renamed from: A */
    private LinearLayout f2074A;

    /* renamed from: B */
    private LinearLayout f2075B;

    /* renamed from: C */
    private LinearLayout f2076C;

    /* renamed from: D */
    private LinearLayout f2077D;

    /* renamed from: E */
    private SwitchButton f2078E;

    /* renamed from: F */
    private Fragment f2079F;

    /* renamed from: G */
    private Fragment f2080G;

    /* renamed from: H */
    private Fragment f2081H;

    /* renamed from: I */
    private Fragment f2082I;

    /* renamed from: J */
    private Fragment f2083J;

    /* renamed from: K */
    private Fragment f2084K;

    /* renamed from: L */
    private DrawerLayout f2085L;

    /* renamed from: M */
    private ExpandableListView f2086M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C0503c f2087N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public List<C0524e> f2088O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public List<DeviceBean> f2089P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public List<DeviceBean> f2090Q;

    /* renamed from: R */
    private Set<String> f2091R = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public int[] f2092S = new int[2];
    /* access modifiers changed from: private */

    /* renamed from: T */
    public int[] f2093T = new int[2];

    /* renamed from: U */
    private long f2094U;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f2095W = 6;

    /* renamed from: X */
    private C0494q f2096X;

    /* renamed from: Y */
    private ScheduledExecutorService f2097Y = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public Handler f2098Z = new C0482e(this);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0600a f2099a;

    /* renamed from: aa */
    private BroadcastReceiver f2100aa = new C0486i(this);

    /* renamed from: ab */
    private BroadcastReceiver f2101ab = new C0487j(this);

    /* renamed from: b */
    private TextView f2102b;

    /* renamed from: c */
    private TextView f2103c;

    /* renamed from: d */
    private TextView f2104d;

    /* renamed from: e */
    private TextView f2105e;

    /* renamed from: f */
    private TextView f2106f;

    /* renamed from: g */
    private TextView f2107g;

    /* renamed from: h */
    private ImageView f2108h;

    /* renamed from: i */
    private ImageView f2109i;

    /* renamed from: j */
    private ImageView f2110j;

    /* renamed from: k */
    private ImageView f2111k;

    /* renamed from: l */
    private ImageView f2112l;

    /* renamed from: m */
    private ImageView f2113m;

    /* renamed from: n */
    private ImageView f2114n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ImageView f2115o;

    /* renamed from: p */
    private ImageView f2116p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ImageView f2117q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public ImageView f2118r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public ImageView f2119s;

    /* renamed from: t */
    private LinearLayout f2120t;

    /* renamed from: u */
    private LinearLayout f2121u;

    /* renamed from: v */
    private LinearLayout f2122v;

    /* renamed from: w */
    private LinearLayout f2123w;

    /* renamed from: x */
    private LinearLayout f2124x;

    /* renamed from: y */
    private LinearLayout f2125y;

    /* renamed from: z */
    private LinearLayout f2126z;

    /* renamed from: a */
    private void m1607a(FragmentTransaction fragmentTransaction) {
        if (this.f2079F != null) {
            fragmentTransaction.hide(this.f2079F);
        }
        if (this.f2081H != null) {
            fragmentTransaction.hide(this.f2081H);
        }
        if (this.f2082I != null) {
            fragmentTransaction.hide(this.f2082I);
        }
        if (this.f2083J != null) {
            fragmentTransaction.hide(this.f2083J);
        }
        if (this.f2084K != null) {
            fragmentTransaction.hide(this.f2084K);
        }
        if (this.f2080G != null) {
            fragmentTransaction.hide(this.f2080G);
        }
    }

    /* renamed from: a */
    private void m1608a(Class<?> cls, Intent intent) {
        intent.setPackage(getPackageName());
        intent.setClass(this, cls);
        startActivity(intent);
    }

    /* renamed from: a */
    private void m1609a(String str) {
        synchronized (this.f2088O) {
            int a = C0544g.m1907a(this.f2089P, str);
            if (a != -1) {
                this.f2089P.get(a).setTryConnectTimes(0);
            }
        }
    }

    /* renamed from: a */
    private void m1610a(String str, String str2, boolean z, int i) {
        EditText editText = new EditText(this);
        editText.setText(str2);
        editText.setSelection(0, str2.length());
        C0241p pVar = new C0241p(this);
        pVar.mo3322a((CharSequence) str).mo3316a(17301566).mo3325b((View) editText).mo3327b(getString(17039360), (DialogInterface.OnClickListener) null).mo3323a((CharSequence) getString(17039370), (DialogInterface.OnClickListener) new C0488k(this, editText, z, i));
        C0240o c = pVar.mo3328c();
        c.getWindow().clearFlags(131080);
        c.getWindow().setSoftInputMode(4);
        c.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m1614c() {
        this.f2091R.clear();
        m1618d();
        if (m1621e()) {
            this.f2098Z.sendEmptyMessage(104);
        }
    }

    /* renamed from: c */
    private void m1615c(boolean z) {
        Intent intent = new Intent(this, PlayService.class);
        intent.setPackage(getPackageName());
        if (!z) {
            stopService(intent);
        }
        intent.setClass(this, BluetoothLEService.class);
        if (z) {
            startService(intent);
        } else {
            stopService(intent);
        }
        if (z) {
            C0538a.m1861a().mo4992a((C0475a) this);
            C0538a.m1861a().mo4980a((Context) this);
            return;
        }
        C0538a.m1861a().mo4992a((C0475a) null);
        C0538a.m1861a().mo4995b((Context) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m1617d(int i) {
        LinearLayout linearLayout;
        if (i != this.f2095W) {
            switch (i) {
                case 0:
                    linearLayout = this.f2120t;
                    break;
                case 1:
                    linearLayout = this.f2123w;
                    break;
                case 2:
                    linearLayout = this.f2121u;
                    break;
                case 3:
                    linearLayout = this.f2122v;
                    break;
                case 4:
                    linearLayout = this.f2124x;
                    break;
                case 5:
                    onClick(this.f2125y);
                    return;
                default:
                    return;
            }
            onClick(linearLayout);
        }
    }

    /* renamed from: d */
    private boolean m1618d() {
        boolean z;
        synchronized (this.f2088O) {
            int i = 0;
            z = false;
            while (i < this.f2089P.size()) {
                if (this.f2089P.get(i).getState() != DeviceBean.f2304b) {
                    this.f2089P.remove(i);
                    i--;
                    z = true;
                }
                i++;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r0.add((int) com.qihoo360.replugin.library.C0462R.C0464id.id_fl_container, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        r0.show(r3);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1620e(int r3) {
        /*
            r2 = this;
            android.support.v4.app.FragmentManager r0 = r2.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r2.m1607a((android.support.p007v4.app.FragmentTransaction) r0)
            r1 = 2131230807(0x7f080057, float:1.8077677E38)
            switch(r3) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0057;
                case 2: goto L_0x0046;
                case 3: goto L_0x0035;
                case 4: goto L_0x0024;
                case 5: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x007e
        L_0x0013:
            android.support.v4.app.Fragment r3 = r2.f2084K
            if (r3 != 0) goto L_0x0021
            wl.smartled.fragment.TimingFragment r3 = new wl.smartled.fragment.TimingFragment
            r3.<init>()
            r2.f2084K = r3
            android.support.v4.app.Fragment r3 = r2.f2084K
            goto L_0x0075
        L_0x0021:
            android.support.v4.app.Fragment r3 = r2.f2084K
            goto L_0x007b
        L_0x0024:
            android.support.v4.app.Fragment r3 = r2.f2083J
            if (r3 != 0) goto L_0x0032
            wl.smartled.fragment.StreamingFragment r3 = new wl.smartled.fragment.StreamingFragment
            r3.<init>()
            r2.f2083J = r3
            android.support.v4.app.Fragment r3 = r2.f2083J
            goto L_0x0075
        L_0x0032:
            android.support.v4.app.Fragment r3 = r2.f2083J
            goto L_0x007b
        L_0x0035:
            android.support.v4.app.Fragment r3 = r2.f2080G
            if (r3 != 0) goto L_0x0043
            wl.smartled.fragment.OnlineMusicFragment r3 = new wl.smartled.fragment.OnlineMusicFragment
            r3.<init>()
            r2.f2080G = r3
            android.support.v4.app.Fragment r3 = r2.f2080G
            goto L_0x0075
        L_0x0043:
            android.support.v4.app.Fragment r3 = r2.f2080G
            goto L_0x007b
        L_0x0046:
            android.support.v4.app.Fragment r3 = r2.f2081H
            if (r3 != 0) goto L_0x0054
            wl.smartled.fragment.MusicFragment r3 = new wl.smartled.fragment.MusicFragment
            r3.<init>()
            r2.f2081H = r3
            android.support.v4.app.Fragment r3 = r2.f2081H
            goto L_0x0075
        L_0x0054:
            android.support.v4.app.Fragment r3 = r2.f2081H
            goto L_0x007b
        L_0x0057:
            android.support.v4.app.Fragment r3 = r2.f2082I
            if (r3 != 0) goto L_0x0065
            wl.smartled.fragment.ModeFragment r3 = new wl.smartled.fragment.ModeFragment
            r3.<init>()
            r2.f2082I = r3
            android.support.v4.app.Fragment r3 = r2.f2082I
            goto L_0x0075
        L_0x0065:
            android.support.v4.app.Fragment r3 = r2.f2082I
            goto L_0x007b
        L_0x0068:
            android.support.v4.app.Fragment r3 = r2.f2079F
            if (r3 != 0) goto L_0x0079
            wl.smartled.fragment.ColorChangeFragment r3 = new wl.smartled.fragment.ColorChangeFragment
            r3.<init>()
            r2.f2079F = r3
            android.support.v4.app.Fragment r3 = r2.f2079F
        L_0x0075:
            r0.add((int) r1, (android.support.p007v4.app.Fragment) r3)
            goto L_0x007e
        L_0x0079:
            android.support.v4.app.Fragment r3 = r2.f2079F
        L_0x007b:
            r0.show(r3)
        L_0x007e:
            r0.commitAllowingStateLoss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.activity.MainActivity.m1620e(int):void");
    }

    /* renamed from: e */
    private boolean m1621e() {
        boolean z;
        synchronized (this.f2088O) {
            int i = 0;
            z = false;
            while (i < this.f2090Q.size()) {
                DeviceBean deviceBean = this.f2090Q.get(i);
                if (deviceBean.getState() == DeviceBean.f2308f || deviceBean.getState() == DeviceBean.f2303a) {
                    C0528a.m1795a().mo4929a(1, i);
                    i--;
                    z = true;
                }
                i++;
            }
        }
        return z;
    }

    /* renamed from: f */
    private void m1623f() {
        this.f2109i.setImageResource(C0462R.C0463drawable.ic_adjust_u);
        this.f2111k.setImageResource(C0462R.C0463drawable.ic_music_u);
        this.f2110j.setImageResource(C0462R.C0463drawable.ic_l_music_u);
        this.f2112l.setImageResource(C0462R.C0463drawable.ic_mod_u);
        this.f2113m.setImageResource(C0462R.C0463drawable.ic_recording_u);
        this.f2114n.setImageResource(C0462R.C0463drawable.ic_timing_u);
        int color = ContextCompat.getColor(this, C0462R.color.colorTextNormal);
        this.f2102b.setTextColor(color);
        this.f2104d.setTextColor(color);
        this.f2103c.setTextColor(color);
        this.f2105e.setTextColor(color);
        this.f2106f.setTextColor(color);
        this.f2107g.setTextColor(color);
    }

    /* renamed from: a */
    public final void mo4755a(View view, boolean z) {
        if (z) {
            C0553p.m1931b().mo5017c();
        } else {
            C0553p.m1931b().mo5018d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4744a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.List<wl.smartled.beans.e> r0 = r8.f2088O
            monitor-enter(r0)
            java.util.List<wl.smartled.beans.DeviceBean> r1 = r8.f2090Q     // Catch:{ all -> 0x00e0 }
            int r1 = p021wl.smartled.p027f.C0544g.m1907a(r1, r10)     // Catch:{ all -> 0x00e0 }
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L_0x0047
            java.util.List<wl.smartled.beans.DeviceBean> r4 = r8.f2090Q     // Catch:{ all -> 0x00e0 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x00e0 }
            wl.smartled.beans.DeviceBean r1 = (p021wl.smartled.beans.DeviceBean) r1     // Catch:{ all -> 0x00e0 }
            int r4 = r1.getState()     // Catch:{ all -> 0x00e0 }
            int r5 = p021wl.smartled.beans.DeviceBean.f2308f     // Catch:{ all -> 0x00e0 }
            if (r4 == r5) goto L_0x0047
            int r4 = r1.getState()     // Catch:{ all -> 0x00e0 }
            int r5 = p021wl.smartled.beans.DeviceBean.f2303a     // Catch:{ all -> 0x00e0 }
            if (r4 == r5) goto L_0x0047
            java.lang.String r9 = "MainActivity"
            java.lang.String r10 = "onScanResult: connected device found!!!"
            android.util.Log.w(r9, r10)     // Catch:{ all -> 0x00e0 }
            int r9 = r1.getState()     // Catch:{ all -> 0x00e0 }
            int r10 = p021wl.smartled.beans.DeviceBean.f2305c     // Catch:{ all -> 0x00e0 }
            if (r9 != r10) goto L_0x0045
            boolean r9 = r1.isConfirmConnected()     // Catch:{ all -> 0x00e0 }
            if (r9 == 0) goto L_0x0045
            int r9 = r1.getDeviceType()     // Catch:{ all -> 0x00e0 }
            int r10 = p021wl.smartled.beans.DeviceBean.f2310h     // Catch:{ all -> 0x00e0 }
            if (r9 != r10) goto L_0x0045
            r1.setTime(r3)     // Catch:{ all -> 0x00e0 }
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0047:
            java.util.List<wl.smartled.beans.DeviceBean> r1 = r8.f2089P     // Catch:{ all -> 0x00e0 }
            int r1 = p021wl.smartled.p027f.C0544g.m1907a(r1, r10)     // Catch:{ all -> 0x00e0 }
            r4 = 1
            if (r1 != r2) goto L_0x005e
            wl.smartled.beans.DeviceBean r1 = new wl.smartled.beans.DeviceBean     // Catch:{ all -> 0x00e0 }
            int r2 = p021wl.smartled.beans.DeviceBean.f2303a     // Catch:{ all -> 0x00e0 }
            r1.<init>(r10, r9, r2)     // Catch:{ all -> 0x00e0 }
            java.util.List<wl.smartled.beans.DeviceBean> r9 = r8.f2089P     // Catch:{ all -> 0x00e0 }
            r9.add(r1)     // Catch:{ all -> 0x00e0 }
            r9 = 1
            goto L_0x0068
        L_0x005e:
            java.util.List<wl.smartled.beans.DeviceBean> r9 = r8.f2089P     // Catch:{ all -> 0x00e0 }
            java.lang.Object r9 = r9.get(r1)     // Catch:{ all -> 0x00e0 }
            r1 = r9
            wl.smartled.beans.DeviceBean r1 = (p021wl.smartled.beans.DeviceBean) r1     // Catch:{ all -> 0x00e0 }
            r9 = 0
        L_0x0068:
            java.util.Set<java.lang.String> r2 = r8.f2091R     // Catch:{ all -> 0x00e0 }
            boolean r2 = r2.contains(r10)     // Catch:{ all -> 0x00e0 }
            if (r2 != 0) goto L_0x00d5
            int r2 = r1.getState()     // Catch:{ all -> 0x00e0 }
            int r5 = p021wl.smartled.beans.DeviceBean.f2303a     // Catch:{ all -> 0x00e0 }
            if (r2 == r5) goto L_0x0080
            int r2 = r1.getState()     // Catch:{ all -> 0x00e0 }
            int r5 = p021wl.smartled.beans.DeviceBean.f2308f     // Catch:{ all -> 0x00e0 }
            if (r2 != r5) goto L_0x00d5
        L_0x0080:
            int r2 = r1.getTryConnectTimes()     // Catch:{ all -> 0x00e0 }
            r5 = 4
            if (r2 >= r5) goto L_0x00d5
            int r2 = r1.getDeviceType()     // Catch:{ all -> 0x00e0 }
            int r5 = p021wl.smartled.beans.DeviceBean.f2309g     // Catch:{ all -> 0x00e0 }
            if (r2 != r5) goto L_0x009d
            android.os.Handler r2 = r8.f2098Z     // Catch:{ all -> 0x00e0 }
            wl.smartled.activity.m r5 = new wl.smartled.activity.m     // Catch:{ all -> 0x00e0 }
            r5.<init>(r8, r10)     // Catch:{ all -> 0x00e0 }
            r6 = 1000(0x3e8, double:4.94E-321)
            r2.postDelayed(r5, r6)     // Catch:{ all -> 0x00e0 }
        L_0x009b:
            r10 = 1
            goto L_0x00b3
        L_0x009d:
            int r10 = r1.getDeviceType()     // Catch:{ all -> 0x00e0 }
            int r2 = p021wl.smartled.beans.DeviceBean.f2310h     // Catch:{ all -> 0x00e0 }
            if (r10 != r2) goto L_0x00b2
            wl.smartled.c.a r10 = p021wl.smartled.p024c.C0528a.m1795a()     // Catch:{ all -> 0x00e0 }
            int r10 = r10.mo4942f()     // Catch:{ all -> 0x00e0 }
            r2 = 8
            if (r10 >= r2) goto L_0x00b2
            goto L_0x009b
        L_0x00b2:
            r10 = 0
        L_0x00b3:
            if (r10 == 0) goto L_0x00d5
            int r9 = r1.getTryConnectTimes()     // Catch:{ all -> 0x00e0 }
            int r9 = r9 + r4
            r1.setTryConnectTimes(r9)     // Catch:{ all -> 0x00e0 }
            r1.setTime(r3)     // Catch:{ all -> 0x00e0 }
            int r9 = p021wl.smartled.beans.DeviceBean.f2304b     // Catch:{ all -> 0x00e0 }
            r1.setState(r9)     // Catch:{ all -> 0x00e0 }
            wl.smartled.c.a r9 = p021wl.smartled.p024c.C0528a.m1795a()     // Catch:{ all -> 0x00e0 }
            java.lang.String r10 = r1.getAddress()     // Catch:{ all -> 0x00e0 }
            int r1 = r1.getState()     // Catch:{ all -> 0x00e0 }
            r9.mo4931a(r10, r1, r3)     // Catch:{ all -> 0x00e0 }
            r9 = 1
        L_0x00d5:
            if (r9 == 0) goto L_0x00de
            android.os.Handler r9 = r8.f2098Z     // Catch:{ all -> 0x00e0 }
            r10 = 104(0x68, float:1.46E-43)
            r9.sendEmptyMessage(r10)     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00e0:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e0 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.activity.MainActivity.mo4744a(java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo4745a(String str, String str2, int i) {
        synchronized (this.f2088O) {
            Log.d("MainActivity", "onConnectionStateChange, state = " + i + ", scanList = " + this.f2089P.size() + ", connectList = " + this.f2090Q.size());
            boolean z = true;
            if (i == DeviceBean.f2305c) {
                if (!C0528a.m1795a().mo4939c(str2)) {
                    DeviceBean deviceBean = new DeviceBean(str2, str, i);
                    if (deviceBean.getDeviceType() != DeviceBean.f2310h || !this.f2091R.contains(str2)) {
                        C0528a.m1795a().mo4933a(deviceBean, 1, true, true);
                        int size = this.f2090Q.size();
                        for (int i2 = 20; i2 < size; i2++) {
                            C0528a.m1795a().mo4929a(1, 20);
                        }
                    }
                }
                z = false;
            } else {
                int a = C0544g.m1907a(this.f2089P, str2);
                if (a != -1) {
                    this.f2089P.get(a).setTime(0);
                }
                C0538a.m1861a().mo4981a((Context) this, str2);
            }
            if (z) {
                C0528a.m1795a().mo4931a(str2, i, false);
            }
            this.f2098Z.sendEmptyMessage(104);
        }
    }

    /* renamed from: a */
    public final void mo4746a(String str, byte[] bArr) {
        Log.d("MainActivity", "onDataRead, address = ".concat(String.valueOf(str)));
        m1609a(str);
        synchronized (this.f2088O) {
            int a = C0544g.m1907a(this.f2090Q, str);
            if (a != -1) {
                DeviceBean deviceBean = this.f2090Q.get(a);
                if (!deviceBean.isConfirmConnected() && (deviceBean.getState() == DeviceBean.f2306d || (deviceBean.getState() == DeviceBean.f2305c && deviceBean.getDeviceType() == DeviceBean.f2310h))) {
                    deviceBean.setState(DeviceBean.f2305c);
                    deviceBean.setTime(0);
                    deviceBean.setConfirmConnected(true);
                    deviceBean.setTryConnectTimes(0);
                    C0528a.m1795a().mo4931a(str, DeviceBean.f2305c, true);
                    this.f2098Z.sendEmptyMessage(104);
                    C0538a.m1861a().mo5008f(this, deviceBean.getAddress());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4747a(List<String> list) {
        synchronized (this.f2088O) {
            for (DeviceBean next : this.f2089P) {
                if (next.getDeviceType() == DeviceBean.f2310h && next.getState() == DeviceBean.f2304b) {
                    if (list.size() >= 8) {
                        break;
                    }
                    list.add(next.getAddress());
                }
            }
            for (DeviceBean next2 : this.f2090Q) {
                if (next2.getDeviceType() == DeviceBean.f2310h && next2.getState() == DeviceBean.f2305c) {
                    String address = next2.getAddress();
                    int i = 0;
                    while (true) {
                        if (i >= list.size()) {
                            i = -1;
                            break;
                        }
                        String str = list.get(i);
                        if (str != null && str.equals(address)) {
                            break;
                        }
                        i++;
                    }
                    if (i == -1) {
                        if (list.size() >= 8) {
                            break;
                        }
                        list.add(next2.getAddress());
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4748a(boolean z) {
        this.f2098Z.removeMessages(102);
        if (z) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.arg1 = 0;
            obtain.arg2 = 1;
            this.f2098Z.sendMessageDelayed(obtain, 100);
            C0549l.m1919a(this);
        }
    }

    /* renamed from: a */
    public final boolean mo4756a() {
        synchronized (this.f2088O) {
            this.f2089P.clear();
            this.f2098Z.sendEmptyMessage(104);
        }
        this.f2098Z.removeMessages(102);
        C0538a.m1861a().mo5000c(this);
        Message obtain = Message.obtain();
        obtain.what = 102;
        obtain.arg1 = 0;
        obtain.arg2 = 1;
        this.f2098Z.sendMessageDelayed(obtain, 500);
        C0549l.m1919a(this);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4757a(int i) {
        m1610a(getString(C0462R.string.string_rename), this.f2088O.get(i).mo4903b(), false, i);
        return false;
    }

    /* renamed from: a */
    public final boolean mo4758a(int i, int i2) {
        DeviceBean a = this.f2087N.mo4820a(i, i2);
        a.setOn(!a.isOn());
        C0538a.m1861a().mo4983a((Context) this, a.getAddress(), a.isOn());
        return true;
    }

    /* renamed from: b */
    public final int mo4749b() {
        int i;
        synchronized (this.f2088O) {
            i = 0;
            for (DeviceBean next : this.f2089P) {
                if (next.getState() == DeviceBean.f2304b || next.getState() == DeviceBean.f2307e || next.getState() == DeviceBean.f2306d || (next.getState() == DeviceBean.f2305c && !next.isConfirmConnected())) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public final void mo4750b(boolean z) {
        runOnUiThread(new C0485h(this, z));
    }

    /* renamed from: b */
    public final boolean mo4759b(int i) {
        Intent intent = new Intent();
        intent.putExtra("wl.extra.group.index", i);
        intent.setPackage(getPackageName());
        intent.setClass(this, DevicePickActivity.class);
        startActivityForResult(intent, 100);
        return false;
    }

    /* renamed from: c */
    public final boolean mo4760c(int i) {
        this.f2088O.get(i).mo4904b(!this.f2088O.get(i).mo4907e());
        C0538a.m1861a().mo4988a((Context) this, C0528a.m1795a().mo4934b(i), this.f2088O.get(i).mo4907e());
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (100 == i && i2 != 0) {
            this.f2098Z.sendEmptyMessage(104);
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        Integer num = (Integer) view.getTag(C0462R.C0464id.tag_group_index);
        Integer num2 = (Integer) view.getTag(C0462R.C0464id.tag_device_index);
        if (this.f2088O.size() <= 0) {
            return true;
        }
        DeviceBean a = this.f2087N.mo4820a(num.intValue(), num2.intValue());
        String address = a.getAddress();
        if (a.getState() == DeviceBean.f2305c || a.getState() == DeviceBean.f2306d) {
            this.f2091R.add(address);
            if (a.getDeviceType() == DeviceBean.f2310h) {
                C0528a.m1795a().mo4931a(address, DeviceBean.f2308f, false);
            } else {
                C0528a.m1795a().mo4931a(address, DeviceBean.f2307e, false);
                C0538a.m1861a().mo5006e(this, address);
            }
        } else if (a.getState() == DeviceBean.f2303a || a.getState() == DeviceBean.f2308f) {
            this.f2091R.remove(address);
            m1609a(address);
        }
        C0528a.m1795a().mo4936b(address);
        this.f2098Z.sendEmptyMessage(104);
        return true;
    }

    public void onClick(View view) {
        int id = view.getId();
        long currentTimeMillis = System.currentTimeMillis() - this.f2094U;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 200) {
            this.f2094U = System.currentTimeMillis();
            Arrays.sort(f2073V);
            if (Arrays.binarySearch(f2073V, id) >= 0) {
                int color = ContextCompat.getColor(this, C0462R.color.colorTextPressed);
                switch (id) {
                    case C0462R.C0464id.id_ll_color_change:
                        if (this.f2095W != 0) {
                            m1623f();
                            this.f2109i.setImageResource(C0462R.C0463drawable.ic_adjust_n);
                            this.f2116p.setImageResource(C0462R.C0463drawable.ic_adjust_n);
                            this.f2102b.setTextColor(color);
                            m1620e(0);
                            this.f2095W = 0;
                            C0522c.m1759a(this, 0);
                            return;
                        }
                        return;
                    case C0462R.C0464id.id_ll_l_music:
                        if (this.f2095W != 3) {
                            m1623f();
                            this.f2110j.setImageResource(C0462R.C0463drawable.ic_l_music_n);
                            this.f2116p.setImageResource(C0462R.C0463drawable.ic_l_music_n);
                            this.f2103c.setTextColor(color);
                            m1620e(3);
                            this.f2095W = 3;
                            C0522c.m1759a(this, 3);
                            return;
                        }
                        return;
                    case C0462R.C0464id.id_ll_mode:
                        if (this.f2095W != 1) {
                            m1623f();
                            this.f2112l.setImageResource(C0462R.C0463drawable.ic_mod_n);
                            this.f2116p.setImageResource(C0462R.C0463drawable.ic_mod_n);
                            this.f2105e.setTextColor(color);
                            m1620e(1);
                            this.f2095W = 1;
                            C0522c.m1759a(this, 1);
                            return;
                        }
                        return;
                    case C0462R.C0464id.id_ll_music:
                        if (this.f2095W != 2) {
                            m1623f();
                            this.f2111k.setImageResource(C0462R.C0463drawable.ic_music_n);
                            this.f2116p.setImageResource(C0462R.C0463drawable.ic_music_n);
                            this.f2104d.setTextColor(color);
                            m1620e(2);
                            this.f2095W = 2;
                            C0522c.m1759a(this, 2);
                            return;
                        }
                        return;
                    case C0462R.C0464id.id_ll_streaming:
                        if (this.f2095W != 4) {
                            m1623f();
                            this.f2113m.setImageResource(C0462R.C0463drawable.ic_recording_n);
                            this.f2116p.setImageResource(C0462R.C0463drawable.ic_recording_n);
                            this.f2106f.setTextColor(color);
                            m1620e(4);
                            this.f2095W = 4;
                            C0522c.m1759a(this, 4);
                            return;
                        }
                        return;
                    case C0462R.C0464id.id_ll_timing:
                        if (this.f2095W != 5) {
                            m1623f();
                            this.f2114n.setImageResource(C0462R.C0463drawable.ic_timing_n);
                            this.f2116p.setImageResource(C0462R.C0463drawable.ic_timing_n);
                            this.f2107g.setTextColor(color);
                            m1620e(5);
                            this.f2095W = 5;
                            C0522c.m1759a(this, 5);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                switch (id) {
                    case C0462R.C0464id.id_iv_group_add:
                        m1610a(getString(C0462R.string.string_group_name), "", true, this.f2088O.size());
                        return;
                    case C0462R.C0464id.id_iv_light_manage:
                        this.f2085L.openDrawer((View) this.f2126z);
                        return;
                    case C0462R.C0464id.id_iv_setting:
                        this.f2085L.openDrawer((View) this.f2074A);
                        return;
                    case C0462R.C0464id.id_ll_about:
                        m1608a((Class<?>) AboutActivity.class, new Intent());
                        return;
                    case C0462R.C0464id.id_ll_guide:
                        m1608a((Class<?>) GuideActivity.class, new Intent());
                        return;
                    case C0462R.C0464id.id_ll_pin_sequence:
                        m1608a((Class<?>) PinSequenceActivity.class, new Intent());
                        return;
                    case C0462R.C0464id.id_ll_yyy:
                        return;
                    default:
                        return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0462R.layout.activity_main);
        this.f2102b = (TextView) findViewById(C0462R.C0464id.id_tv_color_change);
        this.f2104d = (TextView) findViewById(C0462R.C0464id.id_tv_music);
        this.f2103c = (TextView) findViewById(C0462R.C0464id.id_tv_l_music);
        this.f2105e = (TextView) findViewById(C0462R.C0464id.id_tv_mode);
        this.f2106f = (TextView) findViewById(C0462R.C0464id.id_tv_streaming);
        this.f2107g = (TextView) findViewById(C0462R.C0464id.id_tv_timing);
        this.f2075B = (LinearLayout) findViewById(C0462R.C0464id.id_ll_guide);
        this.f2078E = (SwitchButton) findViewById(C0462R.C0464id.id_sb_yyy);
        this.f2108h = (ImageView) findViewById(C0462R.C0464id.id_iv_group_add);
        this.f2109i = (ImageView) findViewById(C0462R.C0464id.id_iv_color_change);
        this.f2111k = (ImageView) findViewById(C0462R.C0464id.id_iv_music);
        this.f2110j = (ImageView) findViewById(C0462R.C0464id.id_iv_l_music);
        this.f2112l = (ImageView) findViewById(C0462R.C0464id.id_iv_mode);
        this.f2113m = (ImageView) findViewById(C0462R.C0464id.id_iv_streaming);
        this.f2114n = (ImageView) findViewById(C0462R.C0464id.id_iv_timing);
        this.f2115o = (ImageView) findViewById(C0462R.C0464id.id_iv_light_manage);
        this.f2116p = (ImageView) findViewById(C0462R.C0464id.id_iv_current_mode);
        this.f2117q = (ImageView) findViewById(C0462R.C0464id.id_iv_setting);
        this.f2118r = (ImageView) findViewById(C0462R.C0464id.id_iv_light_manage_n);
        this.f2119s = (ImageView) findViewById(C0462R.C0464id.id_iv_setting_n);
        this.f2120t = (LinearLayout) findViewById(C0462R.C0464id.id_ll_color_change);
        this.f2121u = (LinearLayout) findViewById(C0462R.C0464id.id_ll_music);
        this.f2123w = (LinearLayout) findViewById(C0462R.C0464id.id_ll_mode);
        this.f2124x = (LinearLayout) findViewById(C0462R.C0464id.id_ll_streaming);
        this.f2125y = (LinearLayout) findViewById(C0462R.C0464id.id_ll_timing);
        this.f2122v = (LinearLayout) findViewById(C0462R.C0464id.id_ll_l_music);
        this.f2122v.setVisibility(8);
        this.f2126z = (LinearLayout) findViewById(C0462R.C0464id.id_ll_left_menu);
        this.f2074A = (LinearLayout) findViewById(C0462R.C0464id.id_ll_right_menu);
        this.f2077D = (LinearLayout) findViewById(C0462R.C0464id.id_ll_pin_sequence);
        this.f2076C = (LinearLayout) findViewById(C0462R.C0464id.id_ll_about);
        this.f2086M = (ExpandableListView) findViewById(C0462R.C0464id.id_elv_group_list);
        this.f2085L = (DrawerLayout) findViewById(C0462R.C0464id.id_dl_main);
        this.f2108h.setOnClickListener(this);
        this.f2120t.setOnClickListener(this);
        this.f2122v.setOnClickListener(this);
        this.f2123w.setOnClickListener(this);
        this.f2121u.setOnClickListener(this);
        this.f2124x.setOnClickListener(this);
        this.f2125y.setOnClickListener(this);
        this.f2075B.setOnClickListener(this);
        this.f2076C.setOnClickListener(this);
        this.f2077D.setOnClickListener(this);
        this.f2078E.mo5202a(this);
        this.f2115o.setOnClickListener(this);
        this.f2117q.setOnClickListener(this);
        this.f2096X = new C0494q(this, (byte) 0);
        this.f2085L.addDrawerListener(this.f2096X);
        C0538a.m1861a().mo4993a((C0476b) this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("wl.action.ACTION_REQUEST_ENABLE_BLUETOOTH");
        intentFilter.addAction("wl.action.PERMISSIONS");
        intentFilter.addAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CHANGE_MODE");
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f2100aa, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.f2101ab, intentFilter2);
        this.f2097Y.scheduleAtFixedRate(new C0489l(this), 500, 500, TimeUnit.MILLISECONDS);
        this.f2088O = C0528a.m1795a().mo4940d();
        this.f2089P = this.f2088O.get(0).mo4905c();
        this.f2090Q = this.f2088O.get(1).mo4905c();
        this.f2087N = new C0503c(this, this.f2088O);
        this.f2087N.mo4821a(this);
        this.f2086M.setAdapter(this.f2087N);
        this.f2086M.setOnChildClickListener(this);
        this.f2086M.setOnGroupClickListener(this);
        this.f2086M.setOnItemLongClickListener(this);
        this.f2086M.expandGroup(0);
        m1615c(true);
        m1614c();
        m1617d(C0522c.m1758a(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f2098Z.removeMessages(102);
        this.f2098Z.removeMessages(104);
        this.f2098Z.removeMessages(100);
        this.f2097Y.shutdown();
        this.f2085L.removeDrawerListener(this.f2096X);
        m1615c(false);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f2100aa);
        unregisterReceiver(this.f2101ab);
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        Integer num = (Integer) view.getTag(C0462R.C0464id.tag_group_index);
        if (this.f2088O.get(num.intValue()).mo4906d()) {
            return false;
        }
        C0528a.m1795a().mo4938c(num.intValue());
        this.f2098Z.sendEmptyMessage(104);
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onItemLongClick(android.widget.AdapterView<?> r5, android.view.View r6, int r7, long r8) {
        /*
            r4 = this;
            android.widget.Adapter r5 = r5.getAdapter()
            java.lang.Object r5 = r5.getItem(r7)
            boolean r7 = r5 instanceof p021wl.smartled.beans.DeviceBean
            r8 = 17039360(0x1040000, float:2.424457E-38)
            r9 = 17039379(0x1040013, float:2.4244624E-38)
            r0 = 17301564(0x108003c, float:2.4979423E-38)
            r1 = 2131231007(0x7f08011f, float:1.8078083E38)
            r2 = 1
            if (r7 == 0) goto L_0x0075
            java.lang.Object r5 = r6.getTag(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            r7 = 2131231006(0x7f08011e, float:1.807808E38)
            java.lang.Object r6 = r6.getTag(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r5.intValue()
            if (r7 <= r2) goto L_0x00ba
            android.support.v7.app.p r7 = new android.support.v7.app.p
            r7.<init>(r4)
            android.support.v7.app.p r7 = r7.mo3316a((int) r0)
            wl.smartled.adapter.c r0 = r4.f2087N
            int r1 = r5.intValue()
            int r3 = r6.intValue()
            wl.smartled.beans.DeviceBean r0 = r0.mo4820a(r1, r3)
            java.lang.String r0 = r0.getDeviceName()
            android.support.v7.app.p r7 = r7.mo3322a((java.lang.CharSequence) r0)
            r0 = 2131492916(0x7f0c0034, float:1.8609297E38)
            java.lang.String r0 = r4.getString(r0)
            android.support.v7.app.p r7 = r7.mo3326b((java.lang.CharSequence) r0)
            java.lang.String r9 = r4.getString(r9)
            wl.smartled.activity.o r0 = new wl.smartled.activity.o
            r0.<init>(r4, r5, r6)
            android.support.v7.app.p r5 = r7.mo3323a((java.lang.CharSequence) r9, (android.content.DialogInterface.OnClickListener) r0)
            java.lang.String r6 = r4.getString(r8)
            wl.smartled.activity.n r7 = new wl.smartled.activity.n
            r7.<init>(r4)
        L_0x006d:
            android.support.v7.app.p r5 = r5.mo3327b(r6, r7)
            r5.mo3329d()
            return r2
        L_0x0075:
            boolean r7 = r5 instanceof p021wl.smartled.beans.C0524e
            if (r7 == 0) goto L_0x00ba
            java.lang.Object r6 = r6.getTag(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            wl.smartled.beans.e r5 = (p021wl.smartled.beans.C0524e) r5
            int r6 = r6.intValue()
            if (r6 <= r2) goto L_0x00ba
            android.support.v7.app.p r6 = new android.support.v7.app.p
            r6.<init>(r4)
            android.support.v7.app.p r6 = r6.mo3316a((int) r0)
            java.lang.String r7 = r5.mo4903b()
            android.support.v7.app.p r6 = r6.mo3322a((java.lang.CharSequence) r7)
            r7 = 2131492917(0x7f0c0035, float:1.86093E38)
            java.lang.String r7 = r4.getString(r7)
            android.support.v7.app.p r6 = r6.mo3326b((java.lang.CharSequence) r7)
            java.lang.String r7 = r4.getString(r9)
            wl.smartled.activity.g r9 = new wl.smartled.activity.g
            r9.<init>(r4, r5)
            android.support.v7.app.p r5 = r6.mo3323a((java.lang.CharSequence) r7, (android.content.DialogInterface.OnClickListener) r9)
            java.lang.String r6 = r4.getString(r8)
            wl.smartled.activity.p r7 = new wl.smartled.activity.p
            r7.<init>(r4)
            goto L_0x006d
        L_0x00ba:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.activity.MainActivity.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || "ELK".equals("replugin")) {
            return super.onKeyDown(i, keyEvent);
        }
        moveTaskToBack(true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CHANGE_MODE".equals(intent.getAction())) {
            m1617d(intent.getIntExtra("wl.extra.music.service.notification.change.mode", this.f2095W));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C0534a.m1854a((Context) this, i, strArr);
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        m1617d(C0522c.m1758a(this));
        C0549l.m1919a(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
    }
}
