package p021wl.smartled.activity;

import android.content.DialogInterface;
import p021wl.smartled.beans.C0524e;
import p021wl.smartled.p024c.C0528a;

/* renamed from: wl.smartled.activity.g */
final class C0484g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C0524e f2161a;

    /* renamed from: b */
    final /* synthetic */ MainActivity f2162b;

    C0484g(MainActivity mainActivity, C0524e eVar) {
        this.f2162b = mainActivity;
        this.f2161a = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0528a.m1795a().mo4928a(this.f2161a.mo4899a());
        this.f2162b.f2098Z.sendEmptyMessage(104);
    }
}
