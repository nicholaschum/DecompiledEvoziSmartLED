package p021wl.smartled.views;

import android.os.Handler;
import java.util.TimerTask;

/* renamed from: wl.smartled.views.i */
final class C0618i extends TimerTask {

    /* renamed from: a */
    Handler f2890a;

    /* renamed from: b */
    final /* synthetic */ PickerScrollView f2891b;

    public C0618i(PickerScrollView pickerScrollView, Handler handler) {
        this.f2891b = pickerScrollView;
        this.f2890a = handler;
    }

    public final void run() {
        this.f2890a.sendMessage(this.f2890a.obtainMessage());
    }
}
