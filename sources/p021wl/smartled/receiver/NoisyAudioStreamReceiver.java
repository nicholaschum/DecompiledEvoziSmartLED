package p021wl.smartled.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p021wl.smartled.service.PlayService;

/* renamed from: wl.smartled.receiver.NoisyAudioStreamReceiver */
public class NoisyAudioStreamReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        PlayService.m2068a(context, "wl.action.music.ACTION_MEDIA_PLAY_PAUSE");
    }
}
