package p021wl.smartled.activity;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: wl.smartled.activity.v */
final class C0499v extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ QAActivity f2184a;

    C0499v(QAActivity qAActivity) {
        this.f2184a = qAActivity;
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
