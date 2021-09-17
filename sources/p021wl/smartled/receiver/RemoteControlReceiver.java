package p021wl.smartled.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import p021wl.smartled.service.PlayService;

/* renamed from: wl.smartled.receiver.RemoteControlReceiver */
public class RemoteControlReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && keyEvent.getAction() == 1) {
            switch (keyEvent.getKeyCode()) {
                case 79:
                case 85:
                case 126:
                case 127:
                    str = "wl.action.music.ACTION_MEDIA_PLAY_PAUSE";
                    break;
                case 87:
                    str = "wl.action.music.ACTION_MEDIA_NEXT";
                    break;
                case 88:
                    PlayService.m2068a(context, "wl.action.music.ACTION_MEDIA_PREVIOUS");
                    return;
                default:
                    return;
            }
            PlayService.m2068a(context, str);
        }
    }
}
