package p021wl.smartled.p026e;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: wl.smartled.e.b */
final class C0535b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Activity f2397a;

    C0535b(Activity activity) {
        this.f2397a = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(335544320);
        Log.d("ContentValues", "getPackageName(): " + this.f2397a.getPackageName());
        intent.setData(Uri.fromParts("package", this.f2397a.getPackageName(), (String) null));
        this.f2397a.startActivity(intent);
    }
}
