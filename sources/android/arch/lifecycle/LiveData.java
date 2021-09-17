package android.arch.lifecycle;

import android.arch.p000a.p001a.C0000a;
import android.arch.p000a.p002b.C0006b;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    /* access modifiers changed from: private */
    public static final Object NOT_SET = new Object();
    static final int START_VERSION = -1;
    /* access modifiers changed from: private */
    public int mActiveCount = 0;
    private volatile Object mData = NOT_SET;
    /* access modifiers changed from: private */
    public final Object mDataLock = new Object();
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C0006b<C0035u<T>, LiveData<T>.C0032r> mObservers = new C0006b<>();
    /* access modifiers changed from: private */
    public volatile Object mPendingData = NOT_SET;
    private final Runnable mPostValueRunnable = new C0030p(this);
    private int mVersion = -1;

    class LifecycleBoundObserver extends LiveData<T>.C0032r implements GenericLifecycleObserver {

        /* renamed from: a */
        final C0024j f24a;

        LifecycleBoundObserver(C0024j jVar, C0035u<T> uVar) {
            super(LiveData.this, uVar);
            this.f24a = jVar;
        }

        /* renamed from: a */
        public final void mo32a(C0024j jVar, C0021g gVar) {
            if (this.f24a.getLifecycle().mo64a() == C0022h.DESTROYED) {
                LiveData.this.removeObserver(this.c);
            } else {
                a(mo45a());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo45a() {
            return this.f24a.getLifecycle().mo64a().mo67a(C0022h.STARTED);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo46a(C0024j jVar) {
            return this.f24a == jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo47b() {
            this.f24a.getLifecycle().mo66b(this);
        }
    }

    private static void assertMainThread(String str) {
        if (!C0000a.m0a().mo3b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.C0032r rVar) {
        if (rVar.f61d) {
            if (!rVar.mo76a()) {
                rVar.mo75a(false);
            } else if (rVar.f62e < this.mVersion) {
                rVar.f62e = this.mVersion;
                rVar.f60c.onChanged(this.mData);
            }
        }
    }

    /* access modifiers changed from: private */
    public void dispatchingValue(C0032r rVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (rVar == null) {
                C0006b<K, V>.C0010f c = this.mObservers.mo14c();
                while (c.hasNext()) {
                    considerNotify((C0032r) ((Map.Entry) c.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(rVar);
                rVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.mo11a() > 0;
    }

    public void observe(C0024j jVar, C0035u<T> uVar) {
        if (jVar.getLifecycle().mo64a() != C0022h.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(jVar, uVar);
            C0032r a = this.mObservers.mo7a(uVar, lifecycleBoundObserver);
            if (a != null && !a.mo77a(jVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (a == null) {
                jVar.getLifecycle().mo65a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(C0035u<T> uVar) {
        C0031q qVar = new C0031q(this, uVar);
        C0032r a = this.mObservers.mo7a(uVar, qVar);
        if (a != null && (a instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (a == null) {
            qVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onActive() {
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
    }

    /* access modifiers changed from: protected */
    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            C0000a.m0a().mo2b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C0035u<T> uVar) {
        assertMainThread("removeObserver");
        C0032r b = this.mObservers.mo8b(uVar);
        if (b != null) {
            b.mo78b();
            b.mo75a(false);
        }
    }

    public void removeObservers(C0024j jVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<C0035u<T>, LiveData<T>.C0032r>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C0032r) next.getValue()).mo77a(jVar)) {
                removeObserver((C0035u) next.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.C0032r) null);
    }
}
