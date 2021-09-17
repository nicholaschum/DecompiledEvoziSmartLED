package p021wl.smartled.activity;

import android.content.DialogInterface;
import java.util.List;
import p021wl.smartled.beans.DeviceBean;
import p021wl.smartled.p024c.C0528a;

/* renamed from: wl.smartled.activity.b */
final class C0479b implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ DevicePickActivity f2154a;

    C0479b(DevicePickActivity devicePickActivity) {
        this.f2154a = devicePickActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C0528a.m1795a().mo4932a((List<DeviceBean>) DevicePickActivity.m1598a(this.f2154a.f2058a, this.f2154a.f2060c.mo4813a()), this.f2154a.f2064g);
        C0528a.m1795a().mo4932a((List<DeviceBean>) DevicePickActivity.m1598a(this.f2154a.f2059b, this.f2154a.f2061d.mo4813a()), this.f2154a.f2064g);
        this.f2154a.setResult(1);
        this.f2154a.finish();
    }
}
