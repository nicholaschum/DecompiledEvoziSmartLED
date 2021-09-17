package p021wl.smartled.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p010v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.qihoo360.replugin.library.C0462R;
import java.lang.reflect.Array;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p027f.C0538a;

/* renamed from: wl.smartled.activity.PinSequenceActivity */
public class PinSequenceActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    /* renamed from: a */
    private static final int[][] f2138a = {new int[]{C0462R.C0464id.id_iv_pin_r00, C0462R.C0464id.id_iv_pin_r01, C0462R.C0464id.id_iv_pin_r02}, new int[]{C0462R.C0464id.id_iv_pin_r10, C0462R.C0464id.id_iv_pin_r11, C0462R.C0464id.id_iv_pin_r12}, new int[]{C0462R.C0464id.id_iv_pin_r20, C0462R.C0464id.id_iv_pin_r21, C0462R.C0464id.id_iv_pin_r22}};

    /* renamed from: b */
    private static final int[][] f2139b = {new int[]{C0462R.C0463drawable.ic_pin_r_down, C0462R.C0463drawable.ic_pin_r_up, C0462R.C0463drawable.ic_pin_r_invalid}, new int[]{C0462R.C0463drawable.ic_pin_g_down, C0462R.C0463drawable.ic_pin_g_up, C0462R.C0463drawable.ic_pin_g_invalid}, new int[]{C0462R.C0463drawable.ic_pin_b_down, C0462R.C0463drawable.ic_pin_b_up, C0462R.C0463drawable.ic_pin_b_invalid}};

    /* renamed from: c */
    private static final int[] f2140c = {C0462R.C0463drawable.ic_pin_sequence_pr, C0462R.C0463drawable.ic_pin_sequence_pg, C0462R.C0463drawable.ic_pin_sequence_pb, C0462R.C0463drawable.ic_pin_sequence_pn};

    /* renamed from: d */
    private static final int[] f2141d = {-1, -1, -1};

    /* renamed from: e */
    private static final int[][] f2142e = {new int[]{1, 2, 2}, new int[]{1, 2, 2}, new int[]{1, 2, 2}};

    /* renamed from: f */
    private final ImageView[][] f2143f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 3}));

    /* renamed from: g */
    private final ImageView[] f2144g = new ImageView[3];

    /* renamed from: h */
    private ImageView f2145h;

    /* renamed from: i */
    private ImageView f2146i;

    /* renamed from: j */
    private Handler f2147j = new C0498u(this);

    /* renamed from: a */
    private void m1649a() {
        for (int i = 0; i < f2138a.length; i++) {
            for (int i2 = 0; i2 < f2138a[i].length; i2++) {
                this.f2143f[i][i2].setImageResource(f2139b[i][f2142e[i][i2]]);
            }
        }
    }

    /* renamed from: b */
    private void m1650b() {
        ImageView imageView;
        int i;
        for (int i2 = 0; i2 < f2141d.length; i2++) {
            if (f2141d[i2] == -1) {
                imageView = this.f2144g[i2];
                i = f2140c[3];
            } else {
                imageView = this.f2144g[i2];
                i = f2140c[f2141d[i2]];
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: c */
    private void m1651c() {
        ImageView imageView;
        int i;
        if (m1652d()) {
            imageView = this.f2146i;
            i = C0462R.C0463drawable.ic_pin_sequence_send_up;
        } else {
            imageView = this.f2146i;
            i = C0462R.C0463drawable.ic_pin_sequence_send_invalid;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: d */
    private static boolean m1652d() {
        for (int i : f2141d) {
            if (i == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r8 = r8.getId()
            r0 = 2131230823(0x7f080067, float:1.807771E38)
            if (r8 != r0) goto L_0x0014
            android.os.Handler r8 = r7.f2147j
            r0 = 100
            r8.removeMessages(r0)
            r7.finish()
            return
        L_0x0014:
            r0 = 0
            r1 = 0
        L_0x0016:
            int[][] r2 = f2138a
            int r2 = r2.length
            if (r1 >= r2) goto L_0x00c8
            r2 = 0
        L_0x001c:
            int[][] r3 = f2138a
            r3 = r3[r1]
            int r3 = r3.length
            if (r2 >= r3) goto L_0x00c4
            int[][] r3 = f2138a
            r3 = r3[r1]
            r3 = r3[r2]
            if (r3 != r8) goto L_0x00c0
            int[][] r8 = f2142e
            r8 = r8[r1]
            r8 = r8[r2]
            r3 = -1
            r4 = 1
            if (r8 != 0) goto L_0x0041
            int[] r8 = f2141d
            r8[r2] = r3
            int[][] r8 = f2142e
            r8 = r8[r1]
            r8[r2] = r4
        L_0x003f:
            r8 = 1
            goto L_0x0067
        L_0x0041:
            if (r8 != r4) goto L_0x0066
            int[] r8 = f2141d
            r8[r2] = r1
            int[][] r8 = f2142e
            r8 = r8[r1]
            r8[r2] = r0
            r8 = 0
        L_0x004e:
            int[][] r5 = f2138a
            int r5 = r5.length
            if (r8 >= r5) goto L_0x003f
            if (r8 == r1) goto L_0x0063
            int[][] r5 = f2142e
            r5 = r5[r8]
            r5 = r5[r2]
            if (r5 != 0) goto L_0x0063
            int[][] r5 = f2142e
            r5 = r5[r8]
            r5[r2] = r4
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x004e
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 == 0) goto L_0x00bf
            int r2 = r2 + r4
            r8 = r2
        L_0x006b:
            int[] r1 = f2141d
            int r1 = r1.length
            if (r8 >= r1) goto L_0x0077
            int[] r1 = f2141d
            r1[r8] = r3
            int r8 = r8 + 1
            goto L_0x006b
        L_0x0077:
            r8 = 0
        L_0x0078:
            int[][] r1 = f2138a
            int r1 = r1.length
            if (r8 >= r1) goto L_0x00b6
            r1 = r2
        L_0x007e:
            int[][] r5 = f2138a
            r5 = r5[r8]
            int r5 = r5.length
            if (r1 >= r5) goto L_0x00b3
            int[] r5 = f2141d
            int r6 = r1 + -1
            r5 = r5[r6]
            if (r5 == r3) goto L_0x00a9
            r5 = 0
        L_0x008e:
            int[] r6 = f2141d
            int r6 = r6.length
            if (r5 >= r6) goto L_0x009e
            int[] r6 = f2141d
            r6 = r6[r5]
            if (r6 != r8) goto L_0x009b
            r5 = 1
            goto L_0x009f
        L_0x009b:
            int r5 = r5 + 1
            goto L_0x008e
        L_0x009e:
            r5 = 0
        L_0x009f:
            if (r5 == 0) goto L_0x00a2
            goto L_0x00a9
        L_0x00a2:
            int[][] r5 = f2142e
            r5 = r5[r8]
            r5[r1] = r4
            goto L_0x00b0
        L_0x00a9:
            int[][] r5 = f2142e
            r5 = r5[r8]
            r6 = 2
            r5[r1] = r6
        L_0x00b0:
            int r1 = r1 + 1
            goto L_0x007e
        L_0x00b3:
            int r8 = r8 + 1
            goto L_0x0078
        L_0x00b6:
            r7.m1649a()
            r7.m1651c()
            r7.m1650b()
        L_0x00bf:
            return
        L_0x00c0:
            int r2 = r2 + 1
            goto L_0x001c
        L_0x00c4:
            int r1 = r1 + 1
            goto L_0x0016
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.activity.PinSequenceActivity.onClick(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0462R.layout.activity_pin_sequence);
        this.f2145h = (ImageView) findViewById(C0462R.C0464id.id_iv_back);
        this.f2145h.setOnClickListener(this);
        this.f2146i = (ImageView) findViewById(C0462R.C0464id.id_iv_pin_sequence_send);
        this.f2146i.setOnTouchListener(this);
        this.f2144g[0] = (ImageView) findViewById(C0462R.C0464id.id_iv_pin_sequence_display_r);
        this.f2144g[1] = (ImageView) findViewById(C0462R.C0464id.id_iv_pin_sequence_display_g);
        this.f2144g[2] = (ImageView) findViewById(C0462R.C0464id.id_iv_pin_sequence_display_b);
        for (int i = 0; i < f2138a.length; i++) {
            for (int i2 = 0; i2 < f2138a[i].length; i2++) {
                ImageView imageView = (ImageView) findViewById(f2138a[i][i2]);
                this.f2143f[i][i2] = imageView;
                imageView.setOnClickListener(this);
            }
        }
        m1649a();
        m1651c();
        m1650b();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2147j.removeMessages(100);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (view.getId() != C0462R.C0464id.id_iv_pin_sequence_send) {
            return false;
        }
        if (m1652d()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f2146i.setImageResource(C0462R.C0463drawable.ic_pin_sequence_send_down);
                C0538a.m1861a().mo4986a((Context) this, C0528a.m1795a().mo4941e(), f2141d[0] + 1, f2141d[1] + 1, f2141d[2] + 1);
            } else if (action == 1 || action == 3) {
                m1651c();
                if (!this.f2147j.hasMessages(100)) {
                    this.f2147j.sendEmptyMessageDelayed(100, 600);
                }
            }
        }
        return true;
    }
}
