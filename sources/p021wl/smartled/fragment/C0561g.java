package p021wl.smartled.fragment;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

/* renamed from: wl.smartled.fragment.g */
final class C0561g extends Handler {

    /* renamed from: a */
    final /* synthetic */ StreamingFragment f2527a;

    C0561g(StreamingFragment streamingFragment) {
        this.f2527a = streamingFragment;
    }

    public final void handleMessage(Message message) {
        if (message.what == 103) {
            this.f2527a.f2489f.removeMessages(103);
            int i = message.arg1;
            int i2 = message.arg2;
            this.f2527a.f2484a.mo5163a(i);
            TextView d = this.f2527a.f2486c;
            d.setText("Brightness=" + String.valueOf(i) + "\nDB=" + String.valueOf(i2));
            this.f2527a.f2488e.mo5205a(i);
        }
    }
}
