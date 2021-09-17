package p021wl.smartled.views;

import android.os.Handler;
import android.os.Message;

/* renamed from: wl.smartled.views.h */
final class C0617h extends Handler {

    /* renamed from: a */
    final /* synthetic */ PickerScrollView f2889a;

    C0617h(PickerScrollView pickerScrollView) {
        this.f2889a = pickerScrollView;
    }

    public final void handleMessage(Message message) {
        if (Math.abs(this.f2889a.f2741l) < 60.0f) {
            float unused = this.f2889a.f2741l = 0.0f;
            if (this.f2889a.f2745p != null) {
                this.f2889a.f2745p.cancel();
                C0618i unused2 = this.f2889a.f2745p = null;
                this.f2889a.m2178b();
            }
        } else {
            float unused3 = this.f2889a.f2741l = this.f2889a.f2741l - ((this.f2889a.f2741l / Math.abs(this.f2889a.f2741l)) * 60.0f);
        }
        this.f2889a.invalidate();
    }
}
