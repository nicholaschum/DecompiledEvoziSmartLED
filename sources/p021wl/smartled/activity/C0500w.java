package p021wl.smartled.activity;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: wl.smartled.activity.w */
final class C0500w extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ QAActivity f2185a;

    C0500w(QAActivity qAActivity) {
        this.f2185a = qAActivity;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsAlert(webView, str, str2, jsResult);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return super.onJsConfirm(webView, str, str2, jsResult);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public final void onProgressChanged(WebView webView, int i) {
        if (i == 100) {
            this.f2185a.f2148a.setVisibility(8);
        } else {
            this.f2185a.f2148a.setVisibility(0);
            this.f2185a.f2148a.setProgress(i);
        }
        super.onProgressChanged(webView, i);
    }

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }
}
