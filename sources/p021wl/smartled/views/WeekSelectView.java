package p021wl.smartled.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.p027f.C0543f;

/* renamed from: wl.smartled.views.WeekSelectView */
public class WeekSelectView extends LinearLayout implements View.OnClickListener {

    /* renamed from: c */
    private static final int[][] f2811c = {new int[]{C0462R.C0463drawable.week_mo_cn_u, C0462R.C0463drawable.week_tu_cn_u, C0462R.C0463drawable.week_we_cn_u, C0462R.C0463drawable.week_th_cn_u, C0462R.C0463drawable.week_fr_cn_u, C0462R.C0463drawable.week_sa_cn_u, C0462R.C0463drawable.week_su_cn_u}, new int[]{C0462R.C0463drawable.week_mo_cn_d, C0462R.C0463drawable.week_tu_cn_d, C0462R.C0463drawable.week_we_cn_d, C0462R.C0463drawable.week_th_cn_d, C0462R.C0463drawable.week_fr_cn_d, C0462R.C0463drawable.week_sa_cn_d, C0462R.C0463drawable.week_su_cn_d}};

    /* renamed from: d */
    private static final int[][] f2812d = {new int[]{C0462R.C0463drawable.week_mo_en_u, C0462R.C0463drawable.week_tu_en_u, C0462R.C0463drawable.week_we_en_u, C0462R.C0463drawable.week_th_en_u, C0462R.C0463drawable.week_fr_en_u, C0462R.C0463drawable.week_sa_en_u, C0462R.C0463drawable.week_su_en_u}, new int[]{C0462R.C0463drawable.week_mo_en_d, C0462R.C0463drawable.week_tu_en_d, C0462R.C0463drawable.week_we_en_d, C0462R.C0463drawable.week_th_en_d, C0462R.C0463drawable.week_fr_en_d, C0462R.C0463drawable.week_sa_en_d, C0462R.C0463drawable.week_su_en_d}};

    /* renamed from: a */
    private boolean f2813a;

    /* renamed from: b */
    private FrameLayout[] f2814b;

    /* renamed from: e */
    private int[] f2815e;

    /* renamed from: f */
    private C0623n f2816f;

    public WeekSelectView(Context context) {
        this(context, (AttributeSet) null);
    }

    public WeekSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public WeekSelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2814b = new FrameLayout[7];
        this.f2815e = new int[]{0, 0, 0, 0, 0, 0, 0};
        this.f2813a = C0543f.m1905a();
    }

    /* renamed from: a */
    private void m2208a() {
        for (int i = 0; i < 7; i++) {
            ((ImageView) this.f2814b[i].getChildAt(0)).setImageResource(this.f2813a ? f2811c[this.f2815e[i]][i] : f2812d[this.f2815e[i]][i]);
        }
    }

    /* renamed from: b */
    private boolean m2209b(int i) {
        if (i < 7) {
            if (this.f2815e[i] == 1) {
                this.f2815e[i] = 0;
                return true;
            } else if (this.f2815e[i] == 0) {
                this.f2815e[i] = 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo5207a(int i) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (((i >> i2) & 1) == 0) {
                this.f2815e[i2] = 0;
            } else {
                this.f2815e[i2] = 1;
            }
        }
        m2208a();
    }

    /* renamed from: a */
    public final void mo5208a(C0623n nVar) {
        this.f2816f = nVar;
    }

    public void onClick(View view) {
        boolean z;
        int i;
        switch (view.getId()) {
            case C0462R.C0464id.id_fl_week_fr:
                i = 4;
                break;
            case C0462R.C0464id.id_fl_week_mo:
                z = m2209b(0);
                break;
            case C0462R.C0464id.id_fl_week_sa:
                i = 5;
                break;
            case C0462R.C0464id.id_fl_week_su:
                i = 6;
                break;
            case C0462R.C0464id.id_fl_week_th:
                i = 3;
                break;
            case C0462R.C0464id.id_fl_week_tu:
                z = m2209b(1);
                break;
            case C0462R.C0464id.id_fl_week_we:
                i = 2;
                break;
            default:
                z = false;
                break;
        }
        z = m2209b(i);
        if (z) {
            m2208a();
            if (this.f2816f != null) {
                C0623n nVar = this.f2816f;
                int i2 = 0;
                for (int i3 = 0; i3 < 7; i3++) {
                    if (this.f2815e[i3] == 1) {
                        i2 |= 1 << i3;
                    }
                }
                nVar.mo5056a(this, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2814b[0] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_mo);
        this.f2814b[1] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_tu);
        this.f2814b[2] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_we);
        this.f2814b[3] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_th);
        this.f2814b[4] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_fr);
        this.f2814b[5] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_sa);
        this.f2814b[6] = (FrameLayout) findViewById(C0462R.C0464id.id_fl_week_su);
        this.f2814b[0].setOnClickListener(this);
        this.f2814b[1].setOnClickListener(this);
        this.f2814b[2].setOnClickListener(this);
        this.f2814b[3].setOnClickListener(this);
        this.f2814b[4].setOnClickListener(this);
        this.f2814b[5].setOnClickListener(this);
        this.f2814b[6].setOnClickListener(this);
        m2208a();
    }
}
