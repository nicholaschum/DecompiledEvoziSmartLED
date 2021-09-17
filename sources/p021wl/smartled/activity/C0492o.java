package p021wl.smartled.activity;

import android.content.DialogInterface;
import p021wl.smartled.p024c.C0528a;

/* renamed from: wl.smartled.activity.o */
final class C0492o implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Integer f2175a;

    /* renamed from: b */
    final /* synthetic */ Integer f2176b;

    /* renamed from: c */
    final /* synthetic */ MainActivity f2177c;

    C0492o(MainActivity mainActivity, Integer num, Integer num2) {
        this.f2177c = mainActivity;
        this.f2175a = num;
        this.f2176b = num2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0528a.m1795a().mo4929a(this.f2175a.intValue(), this.f2176b.intValue());
        this.f2177c.f2098Z.sendEmptyMessage(104);
    }
}
