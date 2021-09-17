package android.arch.lifecycle;

import android.arch.p000a.p002b.C0005a;
import android.arch.p000a.p002b.C0006b;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.lifecycle.k */
public final class C0025k extends C0020f {

    /* renamed from: a */
    private C0005a<C0023i, C0027m> f45a = new C0005a<>();

    /* renamed from: b */
    private C0022h f46b;

    /* renamed from: c */
    private final WeakReference<C0024j> f47c;

    /* renamed from: d */
    private int f48d = 0;

    /* renamed from: e */
    private boolean f49e = false;

    /* renamed from: f */
    private boolean f50f = false;

    /* renamed from: g */
    private ArrayList<C0022h> f51g = new ArrayList<>();

    public C0025k(C0024j jVar) {
        this.f47c = new WeakReference<>(jVar);
        this.f46b = C0022h.INITIALIZED;
    }

    /* renamed from: a */
    static C0022h m61a(C0022h hVar, C0022h hVar2) {
        return (hVar2 == null || hVar2.compareTo(hVar) >= 0) ? hVar : hVar2;
    }

    /* renamed from: a */
    private void m62a(C0024j jVar) {
        C0006b<K, V>.C0010f c = this.f45a.mo14c();
        while (c.hasNext() && !this.f50f) {
            Map.Entry entry = (Map.Entry) c.next();
            C0027m mVar = (C0027m) entry.getValue();
            while (mVar.f54a.compareTo(this.f46b) < 0 && !this.f50f && this.f45a.mo9c(entry.getKey())) {
                m69c(mVar.f54a);
                mVar.mo71a(jVar, m70d(mVar.f54a));
                m68c();
            }
        }
    }

    /* renamed from: b */
    static C0022h m63b(C0021g gVar) {
        switch (C0026l.f52a[gVar.ordinal()]) {
            case 1:
            case 2:
                return C0022h.CREATED;
            case 3:
            case 4:
                return C0022h.STARTED;
            case 5:
                return C0022h.RESUMED;
            case 6:
                return C0022h.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value ".concat(String.valueOf(gVar)));
        }
    }

    /* renamed from: b */
    private void m64b(C0022h hVar) {
        if (this.f46b != hVar) {
            this.f46b = hVar;
            if (this.f49e || this.f48d != 0) {
                this.f50f = true;
                return;
            }
            this.f49e = true;
            m71d();
            this.f49e = false;
        }
    }

    /* renamed from: b */
    private void m65b(C0024j jVar) {
        C0021g gVar;
        Iterator<Map.Entry<C0023i, C0027m>> b = this.f45a.mo13b();
        while (b.hasNext() && !this.f50f) {
            Map.Entry next = b.next();
            C0027m mVar = (C0027m) next.getValue();
            while (mVar.f54a.compareTo(this.f46b) > 0 && !this.f50f && this.f45a.mo9c(next.getKey())) {
                C0022h hVar = mVar.f54a;
                switch (C0026l.f53b[hVar.ordinal()]) {
                    case 1:
                        throw new IllegalArgumentException();
                    case 2:
                        gVar = C0021g.ON_DESTROY;
                        break;
                    case 3:
                        gVar = C0021g.ON_STOP;
                        break;
                    case 4:
                        gVar = C0021g.ON_PAUSE;
                        break;
                    case 5:
                        throw new IllegalArgumentException();
                    default:
                        throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(hVar)));
                }
                m69c(m63b(gVar));
                mVar.mo71a(jVar, gVar);
                m68c();
            }
        }
    }

    /* renamed from: b */
    private boolean m66b() {
        if (this.f45a.mo11a() == 0) {
            return true;
        }
        C0022h hVar = this.f45a.mo15d().getValue().f54a;
        C0022h hVar2 = this.f45a.mo16e().getValue().f54a;
        return hVar == hVar2 && this.f46b == hVar2;
    }

    /* renamed from: c */
    private C0022h m67c(C0023i iVar) {
        Map.Entry<C0023i, C0027m> d = this.f45a.mo10d(iVar);
        C0022h hVar = null;
        C0022h hVar2 = d != null ? d.getValue().f54a : null;
        if (!this.f51g.isEmpty()) {
            hVar = this.f51g.get(this.f51g.size() - 1);
        }
        return m61a(m61a(this.f46b, hVar2), hVar);
    }

    /* renamed from: c */
    private void m68c() {
        this.f51g.remove(this.f51g.size() - 1);
    }

    /* renamed from: c */
    private void m69c(C0022h hVar) {
        this.f51g.add(hVar);
    }

    /* renamed from: d */
    private static C0021g m70d(C0022h hVar) {
        switch (C0026l.f53b[hVar.ordinal()]) {
            case 1:
            case 5:
                return C0021g.ON_CREATE;
            case 2:
                return C0021g.ON_START;
            case 3:
                return C0021g.ON_RESUME;
            case 4:
                throw new IllegalArgumentException();
            default:
                throw new IllegalArgumentException("Unexpected state value ".concat(String.valueOf(hVar)));
        }
    }

    /* renamed from: d */
    private void m71d() {
        C0024j jVar = (C0024j) this.f47c.get();
        if (jVar == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m66b()) {
            this.f50f = false;
            if (this.f46b.compareTo(this.f45a.mo15d().getValue().f54a) < 0) {
                m65b(jVar);
            }
            Map.Entry<C0023i, C0027m> e = this.f45a.mo16e();
            if (!this.f50f && e != null && this.f46b.compareTo(e.getValue().f54a) > 0) {
                m62a(jVar);
            }
        }
        this.f50f = false;
    }

    /* renamed from: a */
    public final C0022h mo64a() {
        return this.f46b;
    }

    /* renamed from: a */
    public final void mo69a(C0021g gVar) {
        m64b(m63b(gVar));
    }

    /* renamed from: a */
    public final void mo70a(C0022h hVar) {
        m64b(hVar);
    }

    /* renamed from: a */
    public final void mo65a(C0023i iVar) {
        C0024j jVar;
        C0027m mVar = new C0027m(iVar, this.f46b == C0022h.DESTROYED ? C0022h.DESTROYED : C0022h.INITIALIZED);
        if (this.f45a.mo7a(iVar, mVar) == null && (jVar = (C0024j) this.f47c.get()) != null) {
            boolean z = this.f48d != 0 || this.f49e;
            C0022h c = m67c(iVar);
            this.f48d++;
            while (mVar.f54a.compareTo(c) < 0 && this.f45a.mo9c(iVar)) {
                m69c(mVar.f54a);
                mVar.mo71a(jVar, m70d(mVar.f54a));
                m68c();
                c = m67c(iVar);
            }
            if (!z) {
                m71d();
            }
            this.f48d--;
        }
    }

    /* renamed from: b */
    public final void mo66b(C0023i iVar) {
        this.f45a.mo8b(iVar);
    }
}
