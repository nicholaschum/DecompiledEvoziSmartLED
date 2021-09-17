package android.support.p007v4.p009os;

import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* renamed from: android.support.v4.os.HandlerCompat */
public final class HandlerCompat {
    private HandlerCompat() {
    }

    public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j);
    }
}
