package p021wl.smartled.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.p010v7.app.AppCompatActivity;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.activity.LaunchActivity */
public class LaunchActivity extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ("ELK".equals("replugin") || isTaskRoot()) {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            setContentView((int) C0462R.layout.activity_launch);
            new Handler().postDelayed(new C0480c(this), 1000);
            return;
        }
        finish();
    }
}
