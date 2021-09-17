package p021wl.smartled.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: wl.smartled.activity.i */
final class C0486i extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ MainActivity f2165a;

    C0486i(MainActivity mainActivity) {
        this.f2165a = mainActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("wl.action.PERMISSIONS".equals(action)) {
            Handler a = this.f2165a.f2098Z;
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putStringArray("wl.extra.permission", intent.getStringArrayExtra("wl.extra.permission"));
            obtain.what = 100;
            obtain.setData(bundle);
            a.sendMessage(obtain);
        } else if ("wl.action.ACTION_REQUEST_ENABLE_BLUETOOTH".equals(action)) {
            this.f2165a.startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 11);
        } else if ("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CHANGE_MODE".equals(action)) {
            this.f2165a.m1617d(intent.getIntExtra("wl.extra.music.service.notification.change.mode", this.f2165a.f2095W));
        }
    }
}
