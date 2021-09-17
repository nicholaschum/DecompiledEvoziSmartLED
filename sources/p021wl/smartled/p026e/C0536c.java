package p021wl.smartled.p026e;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: wl.smartled.e.c */
final class C0536c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Activity f2398a;

    /* renamed from: b */
    final /* synthetic */ int f2399b = 10;

    C0536c(Activity activity) {
        this.f2398a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        this.f2398a.startActivityForResult(intent, this.f2399b);
    }
}
