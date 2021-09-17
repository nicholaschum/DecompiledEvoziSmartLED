package p021wl.smartled.activity;

/* renamed from: wl.smartled.activity.c */
final class C0480c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LaunchActivity f2155a;

    C0480c(LaunchActivity launchActivity) {
        this.f2155a = launchActivity;
    }

    public final void run() {
        this.f2155a.runOnUiThread(new C0481d(this));
    }
}
