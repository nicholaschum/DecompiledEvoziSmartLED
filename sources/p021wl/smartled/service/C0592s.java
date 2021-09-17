package p021wl.smartled.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.service.s */
final class C0592s extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ PlayService f2671a;

    C0592s(PlayService playService) {
        this.f2671a = playService;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("wl.action.ACTION_REQUEST_PERMISSION_RESULT") && Arrays.equals(intent.getStringArrayExtra("wl.extra.permission"), C0517e.f2294h)) {
            C0549l.m1922a(intent, this.f2671a.f2593A);
        }
    }
}
