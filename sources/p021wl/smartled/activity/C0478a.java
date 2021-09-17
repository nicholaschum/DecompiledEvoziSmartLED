package p021wl.smartled.activity;

import android.content.DialogInterface;

/* renamed from: wl.smartled.activity.a */
final class C0478a implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DevicePickActivity f2153a;

    C0478a(DevicePickActivity devicePickActivity) {
        this.f2153a = devicePickActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2153a.setResult(0);
        this.f2153a.finish();
    }
}
