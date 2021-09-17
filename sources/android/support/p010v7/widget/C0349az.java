package android.support.p010v7.widget;

import android.graphics.Typeface;
import android.support.p007v4.content.res.ResourcesCompat;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.az */
final class C0349az extends ResourcesCompat.FontCallback {

    /* renamed from: a */
    final /* synthetic */ WeakReference f1679a;

    /* renamed from: b */
    final /* synthetic */ C0348ay f1680b;

    C0349az(C0348ay ayVar, WeakReference weakReference) {
        this.f1680b = ayVar;
        this.f1679a = weakReference;
    }

    public final void onFontRetrievalFailed(int i) {
    }

    public final void onFontRetrieved(Typeface typeface) {
        this.f1680b.mo4349a((WeakReference<TextView>) this.f1679a, typeface);
    }
}
