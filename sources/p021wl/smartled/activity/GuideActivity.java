package p021wl.smartled.activity;

import android.os.Bundle;
import android.support.p007v4.view.ViewPager;
import android.support.p010v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.adapter.GuidePageAdapter;

/* renamed from: wl.smartled.activity.GuideActivity */
public class GuideActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener {

    /* renamed from: g */
    private static int f2066g = 9;

    /* renamed from: a */
    private ViewPager f2067a;

    /* renamed from: b */
    private List<View> f2068b;

    /* renamed from: c */
    private ViewGroup f2069c;

    /* renamed from: d */
    private ImageView f2070d;

    /* renamed from: e */
    private ImageView[] f2071e;

    /* renamed from: f */
    private ImageView f2072f;

    /* renamed from: a */
    private void m1604a() {
        ImageView imageView;
        int i;
        this.f2069c = (ViewGroup) findViewById(C0462R.C0464id.guide_ll_point);
        this.f2071e = new ImageView[this.f2068b.size()];
        int size = this.f2068b.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2070d = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(20, 20);
            layoutParams.setMarginStart(10);
            layoutParams.setMarginEnd(10);
            this.f2070d.setLayoutParams(layoutParams);
            this.f2071e[i2] = this.f2070d;
            if (i2 == 0) {
                imageView = this.f2070d;
                i = C0462R.C0463drawable.guide_dot_white;
            } else {
                imageView = this.f2070d;
                i = C0462R.C0463drawable.guide_dot_black;
            }
            imageView.setBackgroundResource(i);
            this.f2069c.addView(this.f2071e[i2]);
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0462R.C0464id.id_iv_back) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        supportRequestWindowFeature(1);
        setContentView((int) C0462R.layout.activity_guide);
        this.f2067a = (ViewPager) findViewById(C0462R.C0464id.guide_vp);
        this.f2068b = new ArrayList();
        new LinearLayout.LayoutParams(-1, -1);
        int i = f2066g;
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f2068b.add(imageView);
        }
        this.f2067a.setAdapter(new GuidePageAdapter(this.f2068b, this));
        this.f2067a.setOffscreenPageLimit(1);
        this.f2067a.setOnPageChangeListener(this);
        m1604a();
        this.f2072f = (ImageView) findViewById(C0462R.C0464id.id_iv_back);
        this.f2072f.setOnClickListener(this);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        int i2 = f2066g;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2071e[i].setBackgroundResource(C0462R.C0463drawable.guide_dot_white);
            if (i != i3) {
                this.f2071e[i3].setBackgroundResource(C0462R.C0463drawable.guide_dot_black);
            }
        }
    }
}
