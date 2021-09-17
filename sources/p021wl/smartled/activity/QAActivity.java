package p021wl.smartled.activity;

import android.os.Bundle;
import android.support.p010v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.activity.QAActivity */
public class QAActivity extends AppCompatActivity implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ProgressBar f2148a;

    /* renamed from: b */
    private WebView f2149b;

    /* renamed from: c */
    private ImageView f2150c;

    /* renamed from: d */
    private WebViewClient f2151d = new C0499v(this);

    /* renamed from: e */
    private WebChromeClient f2152e = new C0500w(this);

    public void onClick(View view) {
        if (view.getId() == C0462R.C0464id.id_iv_back) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0462R.layout.activity_qa);
        this.f2150c = (ImageView) findViewById(C0462R.C0464id.id_iv_back);
        this.f2150c.setOnClickListener(this);
        this.f2149b = (WebView) findViewById(C0462R.C0464id.id_wb_qa_website);
        this.f2148a = (ProgressBar) findViewById(C0462R.C0464id.id_pb_url_load);
        this.f2149b.setWebChromeClient(this.f2152e);
        this.f2149b.setWebViewClient(this.f2151d);
        WebSettings settings = this.f2149b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(true);
        this.f2149b.loadUrl("https://support.qq.com/products/123540");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        this.f2149b.destroy();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f2149b.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f2149b.goBack();
        return true;
    }
}
