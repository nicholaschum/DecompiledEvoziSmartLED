package p021wl.smartled.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.C0512b;

/* renamed from: wl.smartled.views.SwitchButton */
public class SwitchButton extends RelativeLayout {

    /* renamed from: a */
    private int f2781a;

    /* renamed from: b */
    private int f2782b;

    /* renamed from: c */
    private C0622m f2783c;

    /* renamed from: d */
    private TypedArray f2784d;

    /* renamed from: e */
    private RelativeLayout f2785e;

    /* renamed from: f */
    private View f2786f;

    public SwitchButton(Context context) {
        super(context);
    }

    public SwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(C0462R.layout.layout_switch, this);
        this.f2784d = context.obtainStyledAttributes(attributeSet, C0512b.f2248Q);
        this.f2785e = (RelativeLayout) findViewById(C0462R.C0464id.relative_layout_bg);
        this.f2786f = findViewById(C0462R.C0464id.view_scroll);
        this.f2781a = this.f2784d.getInt(0, 1);
        if (this.f2781a == 0) {
            this.f2785e.setBackgroundResource(C0462R.C0463drawable.bg_switch_bottom);
            this.f2786f.setBackgroundResource(C0462R.C0463drawable.bg_switch_top);
            m2201a(this.f2786f, 9);
            this.f2782b = 0;
        } else if (this.f2781a == 1) {
            this.f2785e.setBackgroundResource(C0462R.C0463drawable.bg_switch_bottom_open);
            this.f2786f.setBackgroundResource(C0462R.C0463drawable.bg_switch_top_open);
            m2201a(this.f2786f, 11);
            this.f2782b = 1;
        }
    }

    /* renamed from: a */
    private static void m2201a(View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (i == 9) {
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams.removeRule(11);
            }
        } else if (i == 11 && Build.VERSION.SDK_INT >= 17) {
            layoutParams.removeRule(9);
        }
        layoutParams.addRule(i);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo5201a() {
        if (this.f2782b != 0) {
            this.f2785e.setBackgroundResource(C0462R.C0463drawable.bg_switch_bottom);
            this.f2786f.setBackgroundResource(C0462R.C0463drawable.bg_switch_top);
            m2201a(this.f2786f, 9);
            this.f2782b = 0;
        }
    }

    /* renamed from: a */
    public final void mo5202a(C0622m mVar) {
        this.f2783c = mVar;
    }

    /* renamed from: b */
    public final void mo5203b() {
        if (this.f2782b != 1) {
            this.f2785e.setBackgroundResource(C0462R.C0463drawable.bg_switch_bottom_open);
            this.f2786f.setBackgroundResource(C0462R.C0463drawable.bg_switch_top_open);
            m2201a(this.f2786f, 11);
            this.f2782b = 1;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            boolean z = true;
            if (this.f2782b == 1) {
                mo5201a();
            } else if (this.f2782b == 0) {
                mo5203b();
            }
            if (this.f2783c != null) {
                C0622m mVar = this.f2783c;
                if (this.f2782b != 1) {
                    z = false;
                }
                mVar.mo4755a(this, z);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
