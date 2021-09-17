package p021wl.smartled.service;

import android.os.Handler;
import android.os.Message;

/* renamed from: wl.smartled.service.a */
final class C0566a extends Handler {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderService f2634a;

    C0566a(AudioRecorderService audioRecorderService) {
        this.f2634a = audioRecorderService;
    }

    public final void handleMessage(Message message) {
        if (message.what != 101) {
            return;
        }
        if (message.arg1 == 1) {
            AudioRecorderService.m2004a(this.f2634a);
        } else {
            this.f2634a.stopSelf();
        }
    }
}
