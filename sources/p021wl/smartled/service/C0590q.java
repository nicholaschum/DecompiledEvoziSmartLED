package p021wl.smartled.service;

import android.graphics.BitmapFactory;
import android.media.audiofx.Visualizer;
import android.os.Handler;
import android.os.Message;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.service.q */
final class C0590q extends Handler {

    /* renamed from: a */
    final /* synthetic */ PlayService f2669a;

    C0590q(PlayService playService) {
        this.f2669a = playService;
    }

    public final void handleMessage(Message message) {
        if (message.what == 101) {
            if (message.arg1 == 1) {
                this.f2669a.mo5085a();
                if (PlayService.f2592t && this.f2669a.f2615s == null && this.f2669a.f2614r != null) {
                    Visualizer unused = this.f2669a.f2615s = new Visualizer(this.f2669a.f2614r.getAudioSessionId());
                    this.f2669a.f2615s.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    this.f2669a.f2615s.setDataCaptureListener(new C0591r(this), Visualizer.getMaxCaptureRate() / 4, false, true);
                }
                if (this.f2669a.f2613p == null && this.f2669a.f2612o != null) {
                    Visualizer unused2 = this.f2669a.f2613p = new Visualizer(this.f2669a.f2612o.getAudioSessionId());
                    this.f2669a.f2613p.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
                    this.f2669a.f2613p.setDataCaptureListener(this.f2669a, Visualizer.getMaxCaptureRate() / 2, false, true);
                }
            }
        } else if (message.what == 500) {
            this.f2669a.f2593A.removeMessages(500);
            if (!"ELK".equals("replugin")) {
                this.f2669a.m2087o();
                if (this.f2669a.f2618w != null) {
                    int i = message.arg1;
                    if (this.f2669a.f2606i != null) {
                        this.f2669a.f2618w.setTextViewText(C0462R.C0464id.id_tv_music_name, this.f2669a.f2606i.mo4924g());
                        this.f2669a.f2618w.setTextViewText(C0462R.C0464id.id_tv_music_info, this.f2669a.f2606i.mo4918d());
                    }
                    this.f2669a.f2618w.setImageViewBitmap(C0462R.C0464id.id_iv_play_pause_music, BitmapFactory.decodeResource(this.f2669a.getResources(), this.f2669a.mo5095g() ? C0462R.C0463drawable.ic_ntf_music_play : C0462R.C0463drawable.ic_ntf_music_stop));
                }
                this.f2669a.m2069a("PlayService", this.f2669a.f2618w);
                if (!this.f2669a.f2605h) {
                    this.f2669a.startForeground(100, this.f2669a.f2619x);
                } else if (this.f2669a.f2620y != null) {
                    this.f2669a.f2620y.notify(100, this.f2669a.f2619x);
                }
            }
        }
    }
}
