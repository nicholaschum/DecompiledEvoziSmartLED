package p021wl.smartled.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import p021wl.smartled.p026e.C0534a;
import p021wl.smartled.p026e.C0537d;
import p021wl.smartled.p027f.C0538a;
import p021wl.smartled.p027f.C0545h;
import p021wl.smartled.p027f.C0549l;
import p021wl.smartled.views.C0600a;

/* renamed from: wl.smartled.activity.e */
final class C0482e extends Handler {

    /* renamed from: a */
    final /* synthetic */ MainActivity f2157a;

    C0482e(MainActivity mainActivity) {
        this.f2157a = mainActivity;
    }

    public final void handleMessage(Message message) {
        Handler a;
        long j;
        boolean z = true;
        if (message.what == 100) {
            String[] stringArray = message.getData().getStringArray("wl.extra.permission");
            if (stringArray != null && stringArray.length > 0) {
                List asList = Arrays.asList(stringArray);
                if (asList.contains("android.permission.ACCESS_COARSE_LOCATION") || asList.contains("android.permission.ACCESS_FINE_LOCATION")) {
                    if (!C0545h.m1908a(this.f2157a)) {
                        C0549l.m1920a(this.f2157a, false, stringArray);
                        C0534a.m1855b(this.f2157a);
                        z = false;
                    }
                    Log.d("MainActivity", "handleMessage ---> location: ".concat(String.valueOf(asList)));
                }
                if (z) {
                    C0534a.m1851a((Activity) this.f2157a).mo4976a(stringArray).mo4975a((C0537d) new C0483f(this, asList, stringArray)).mo4977a();
                }
            }
        } else if (message.what == 102) {
            this.f2157a.f2098Z.removeMessages(102);
            Message obtain = Message.obtain();
            obtain.what = 102;
            if (message.arg1 == 1) {
                C0538a.m1861a().mo5000c(this.f2157a);
                obtain.arg1 = 0;
                obtain.arg2 = 0;
                a = this.f2157a.f2098Z;
                j = 2500;
            } else {
                boolean z2 = message.arg2 != 0;
                if (z2) {
                    this.f2157a.m1614c();
                }
                C0538a.m1861a().mo4991a((Context) this.f2157a, z2);
                obtain.arg1 = 1;
                obtain.arg2 = 0;
                a = this.f2157a.f2098Z;
                j = 4000;
            }
            a.sendMessageDelayed(obtain, j);
        } else if (message.what == 104) {
            this.f2157a.f2098Z.removeMessages(104);
            synchronized (this.f2157a.f2088O) {
                this.f2157a.f2087N.notifyDataSetChanged();
            }
            if (this.f2157a.f2099a != null && this.f2157a.mo4749b() == 0) {
                this.f2157a.f2099a.mo5211a();
                C0600a unused = this.f2157a.f2099a = null;
            }
        }
    }
}
