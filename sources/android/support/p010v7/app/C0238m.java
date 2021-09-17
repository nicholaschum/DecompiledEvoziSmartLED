package android.support.p010v7.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.support.p007v4.provider.FontsContractCompat;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.m */
final class C0238m extends Handler {

    /* renamed from: a */
    private WeakReference<DialogInterface> f831a;

    public C0238m(DialogInterface dialogInterface) {
        this.f831a = new WeakReference<>(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            switch (i) {
                case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
                case -2:
                case -1:
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f831a.get(), message.what);
                    return;
                default:
                    return;
            }
        } else {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
