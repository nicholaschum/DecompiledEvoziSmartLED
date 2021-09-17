package p021wl.smartled.service;

import android.os.Handler;
import android.os.Message;

/* renamed from: wl.smartled.service.ab */
final class C0568ab extends Handler {

    /* renamed from: a */
    final /* synthetic */ RecorderService f2636a;

    C0568ab(RecorderService recorderService) {
        this.f2636a = recorderService;
    }

    public final void handleMessage(Message message) {
        if (message.what != 101) {
            return;
        }
        if (message.arg1 == 1) {
            this.f2636a.mo5112a();
        } else {
            this.f2636a.stopSelf();
        }
    }
}
