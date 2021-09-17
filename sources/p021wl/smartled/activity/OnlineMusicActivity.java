package p021wl.smartled.activity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.support.p010v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.qihoo360.replugin.library.C0462R;
import java.util.Random;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.service.AudioRecorderService;
import p021wl.smartled.service.C0577d;
import p021wl.smartled.views.floatingactionbutton.FloatingActionButton;

/* renamed from: wl.smartled.activity.OnlineMusicActivity */
public class OnlineMusicActivity extends AppCompatActivity implements View.OnClickListener, C0577d {

    /* renamed from: a */
    private WebView f2127a;

    /* renamed from: b */
    private String f2128b;

    /* renamed from: c */
    private FloatingActionButton f2129c;

    /* renamed from: d */
    private FloatingActionButton f2130d;

    /* renamed from: e */
    private FloatingActionButton f2131e;

    /* renamed from: f */
    private FloatingActionButton f2132f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AudioRecorderService f2133g;

    /* renamed from: h */
    private boolean f2134h;

    /* renamed from: i */
    private WebViewClient f2135i = new C0495r(this);

    /* renamed from: j */
    private WebChromeClient f2136j = new C0496s(this);

    /* renamed from: k */
    private ServiceConnection f2137k = new C0497t(this);

    /* renamed from: a */
    private void m1647a(boolean z) {
        if (!z) {
            if (this.f2134h) {
                unbindService(this.f2137k);
                this.f2134h = false;
            }
            this.f2133g = null;
        } else if (this.f2133g == null) {
            Intent intent = new Intent(this, AudioRecorderService.class);
            intent.setPackage(getPackageName());
            this.f2134h = bindService(intent, this.f2137k, 1);
        }
    }

    /* renamed from: a */
    public final void mo4766a(double d) {
        int i = (int) (((d - 20.0d) * 100.0d) / 63.0d);
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        C0538a.m1861a().mo5003c(this, C0528a.m1795a().mo4941e(), new Random().nextInt(), i);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C0462R.C0464id.id_fab_navigation_back:
                if (this.f2127a.canGoBack()) {
                    this.f2127a.goBack();
                    return;
                }
                return;
            case C0462R.C0464id.id_fab_navigation_close:
                finish();
                return;
            case C0462R.C0464id.id_fab_navigation_home:
                this.f2127a.loadUrl(this.f2128b);
                return;
            case C0462R.C0464id.id_fab_navigation_next:
                if (this.f2127a.canGoForward()) {
                    this.f2127a.goForward();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0462R.layout.activity_online_web_view);
        this.f2129c = (FloatingActionButton) findViewById(C0462R.C0464id.id_fab_navigation_back);
        this.f2130d = (FloatingActionButton) findViewById(C0462R.C0464id.id_fab_navigation_next);
        this.f2131e = (FloatingActionButton) findViewById(C0462R.C0464id.id_fab_navigation_home);
        this.f2132f = (FloatingActionButton) findViewById(C0462R.C0464id.id_fab_navigation_close);
        this.f2129c.setOnClickListener(this);
        this.f2130d.setOnClickListener(this);
        this.f2131e.setOnClickListener(this);
        this.f2132f.setOnClickListener(this);
        this.f2127a = (WebView) findViewById(C0462R.C0464id.id_wb_music_website);
        this.f2127a.setWebChromeClient(this.f2136j);
        this.f2127a.setWebViewClient(this.f2135i);
        WebSettings settings = this.f2127a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(2);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        this.f2128b = getIntent().getStringExtra("wl.extra.online.music.url");
        this.f2127a.loadUrl(this.f2128b);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.f2133g != null) {
            this.f2133g.mo5071a((C0577d) null);
        }
        m1647a(false);
        this.f2127a.destroy();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f2127a.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f2127a.goBack();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f2127a.onPause();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        m1647a(true);
        this.f2127a.onResume();
        super.onResume();
    }
}
