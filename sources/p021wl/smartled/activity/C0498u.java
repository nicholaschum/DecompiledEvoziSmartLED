package p021wl.smartled.activity;

import android.os.Handler;
import android.os.Message;

/* renamed from: wl.smartled.activity.u */
final class C0498u extends Handler {

    /* renamed from: a */
    final /* synthetic */ PinSequenceActivity f2183a;

    C0498u(PinSequenceActivity pinSequenceActivity) {
        this.f2183a = pinSequenceActivity;
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 100) {
            this.f2183a.finish();
        }
    }
}
