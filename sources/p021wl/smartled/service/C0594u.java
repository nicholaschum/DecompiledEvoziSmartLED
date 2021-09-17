package p021wl.smartled.service;

import android.media.MediaPlayer;

/* renamed from: wl.smartled.service.u */
final class C0594u implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    final /* synthetic */ PlayService f2674a;

    C0594u(PlayService playService) {
        this.f2674a = playService;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        boolean unused = this.f2674a.f2609l = false;
        this.f2674a.m2089p();
    }
}
