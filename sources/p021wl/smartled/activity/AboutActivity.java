package p021wl.smartled.activity;

import android.os.Bundle;
import android.support.p010v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.activity.AboutActivity */
public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    /* renamed from: a */
    private ImageView f2055a;

    /* renamed from: b */
    private Animation f2056b;

    /* renamed from: c */
    private ImageView f2057c;

    public void onClick(View view) {
        if (view.getId() == C0462R.C0464id.id_iv_about_main) {
            view.startAnimation(this.f2056b);
        } else if (view.getId() == C0462R.C0464id.id_iv_back) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0462R.layout.activity_about);
        this.f2055a = (ImageView) findViewById(C0462R.C0464id.id_iv_about_main);
        this.f2055a.setOnClickListener(this);
        this.f2057c = (ImageView) findViewById(C0462R.C0464id.id_iv_back);
        this.f2057c.setOnClickListener(this);
        this.f2056b = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.f2056b.setDuration(1000);
        this.f2056b.setInterpolator(new BounceInterpolator());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f2056b.cancel();
        super.onDestroy();
    }
}
