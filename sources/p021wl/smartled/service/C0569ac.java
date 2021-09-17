package p021wl.smartled.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.service.ac */
final class C0569ac extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ RecorderService f2637a;

    C0569ac(RecorderService recorderService) {
        this.f2637a = recorderService;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("wl.action.ACTION_REQUEST_PERMISSION_RESULT") && Arrays.equals(intent.getStringArrayExtra("wl.extra.permission"), C0517e.f2296j)) {
            C0549l.m1922a(intent, this.f2637a.f2626e);
        }
    }
}
