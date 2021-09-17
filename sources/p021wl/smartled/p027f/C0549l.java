package p021wl.smartled.p027f;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.p007v4.content.LocalBroadcastManager;
import android.util.Log;

/* renamed from: wl.smartled.f.l */
public final class C0549l {
    /* renamed from: a */
    public static void m1919a(Context context) {
        LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent("wl.action.ACTION_CHECK_PERMISSION"));
        Log.d("PermissionsBroadcastUti", "sendCheckPermissionBroadcast");
    }

    /* renamed from: a */
    public static void m1920a(Context context, boolean z, String[] strArr) {
        Intent intent = new Intent("wl.action.ACTION_REQUEST_PERMISSION_RESULT");
        intent.putExtra("wl.extra.permission", strArr);
        intent.putExtra("wl.extra.permission.result", z ? 1 : 0);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    /* renamed from: a */
    public static void m1921a(Context context, String[] strArr) {
        Intent intent = new Intent("wl.action.PERMISSIONS");
        intent.putExtra("wl.extra.permission", strArr);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        Log.d("PermissionsBroadcastUti", "sendRequestPermissionBroadcast");
    }

    /* renamed from: a */
    public static void m1922a(Intent intent, Handler handler) {
        Message obtain = Message.obtain();
        obtain.what = 101;
        obtain.arg1 = intent.getIntExtra("wl.extra.permission.result", 0);
        handler.sendMessage(obtain);
        Log.d("PermissionsBroadcastUti", "sendPermissionsMessageResult--> what = " + obtain.what + ", arg = " + obtain.arg1);
    }
}
