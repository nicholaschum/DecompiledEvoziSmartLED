package p021wl.smartled.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p027f.C0549l;

/* renamed from: wl.smartled.service.b */
final class C0575b extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderService f2651a;

    C0575b(AudioRecorderService audioRecorderService) {
        this.f2651a = audioRecorderService;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("wl.action.ACTION_REQUEST_PERMISSION_RESULT") && Arrays.equals(intent.getStringArrayExtra("wl.extra.permission"), C0517e.f2296j)) {
            C0549l.m1922a(intent, this.f2651a.f2541h);
        }
    }
}
