package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.p */
final class C0030p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LiveData f58a;

    C0030p(LiveData liveData) {
        this.f58a = liveData;
    }

    public final void run() {
        Object access$100;
        synchronized (this.f58a.mDataLock) {
            access$100 = this.f58a.mPendingData;
            Object unused = this.f58a.mPendingData = LiveData.NOT_SET;
        }
        this.f58a.setValue(access$100);
    }
}
