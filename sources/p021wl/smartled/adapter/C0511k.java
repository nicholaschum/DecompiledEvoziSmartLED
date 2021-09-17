package p021wl.smartled.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.adapter.k */
final class C0511k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ImageView f2230a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f2231b;

    private C0511k(ImageView imageView, TextView textView) {
        this.f2230a = imageView;
        this.f2231b = textView;
    }

    /* renamed from: a */
    static /* synthetic */ C0511k m1723a(View view) {
        return new C0511k((ImageView) view.findViewById(C0462R.C0464id.image), (TextView) view.findViewById(C0462R.C0464id.text));
    }
}
