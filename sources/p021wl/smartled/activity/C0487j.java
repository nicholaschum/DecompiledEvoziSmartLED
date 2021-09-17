package p021wl.smartled.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: wl.smartled.activity.j */
final class C0487j extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ MainActivity f2166a;

    C0487j(MainActivity mainActivity) {
        this.f2166a = mainActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            this.f2166a.finish();
        }
    }
}
