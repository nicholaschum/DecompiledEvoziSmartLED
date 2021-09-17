package p021wl.smartled.activity;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: wl.smartled.activity.r */
final class C0495r extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ OnlineMusicActivity f2180a;

    C0495r(OnlineMusicActivity onlineMusicActivity) {
        this.f2180a = onlineMusicActivity;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
