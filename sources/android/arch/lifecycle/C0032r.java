package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.r */
abstract class C0032r {

    /* renamed from: c */
    final C0035u<T> f60c;

    /* renamed from: d */
    boolean f61d;

    /* renamed from: e */
    int f62e = -1;

    /* renamed from: f */
    final /* synthetic */ LiveData f63f;

    C0032r(LiveData liveData, C0035u<T> uVar) {
        this.f63f = liveData;
        this.f60c = uVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo75a(boolean z) {
        if (z != this.f61d) {
            this.f61d = z;
            int i = 1;
            boolean z2 = this.f63f.mActiveCount == 0;
            LiveData liveData = this.f63f;
            int access$300 = liveData.mActiveCount;
            if (!this.f61d) {
                i = -1;
            }
            int unused = liveData.mActiveCount = access$300 + i;
            if (z2 && this.f61d) {
                this.f63f.onActive();
            }
            if (this.f63f.mActiveCount == 0 && !this.f61d) {
                this.f63f.onInactive();
            }
            if (this.f61d) {
                this.f63f.dispatchingValue(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo76a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo77a(C0024j jVar) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo78b() {
    }
}
