package p021wl.smartled.activity;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: wl.smartled.activity.s */
final class C0496s extends WebChromeClient {

    /* renamed from: a */
    final /* synthetic */ OnlineMusicActivity f2181a;

    C0496s(OnlineMusicActivity onlineMusicActivity) {
        this.f2181a = onlineMusicActivity;
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

    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }
}
