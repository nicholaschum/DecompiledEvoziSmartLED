package p021wl.smartled.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: wl.smartled.service.y */
final class C0598y extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ PlayService f2678a;

    private C0598y(PlayService playService) {
        this.f2678a = playService;
    }

    /* synthetic */ C0598y(PlayService playService, byte b) {
        this(playService);
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("wl.action.music.MUSIC_SERVICE_NOTIFICATION_PREVIOUS".equals(action)) {
                this.f2678a.mo5094f();
            } else if ("wl.action.music.MUSIC_SERVICE_NOTIFICATION_NEXT".equals(action)) {
                this.f2678a.mo5093e();
            } else if ("wl.action.music.MUSIC_SERVICE_NOTIFICATION_PLAY_PAUSE".equals(action)) {
                this.f2678a.mo5091c();
            } else if ("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CLOSE".equals(action)) {
                if (this.f2678a.mo5095g()) {
                    this.f2678a.m2091q();
                }
                this.f2678a.stopForeground(true);
                boolean unused = this.f2678a.f2605h = false;
                this.f2678a.f2593A.removeMessages(500);
                return;
            } else {
                return;
            }
            PlayService.m2082l(this.f2678a);
        }
    }
}
