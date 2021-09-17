package p021wl.smartled.beans;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wl.smartled.beans.e */
public final class C0524e {

    /* renamed from: a */
    private String f2347a;

    /* renamed from: b */
    private List<DeviceBean> f2348b;

    /* renamed from: c */
    private int f2349c;

    /* renamed from: d */
    private boolean f2350d;

    /* renamed from: e */
    private boolean f2351e;

    public C0524e(String str, int i) {
        this.f2349c = i;
        this.f2347a = str;
        this.f2348b = new ArrayList();
        this.f2350d = false;
    }

    public C0524e(C0524e eVar) {
        this.f2349c = eVar.f2349c;
        this.f2347a = eVar.f2347a;
        this.f2348b = new ArrayList();
        this.f2350d = eVar.f2350d;
        this.f2351e = eVar.f2351e;
    }

    /* renamed from: a */
    public final int mo4899a() {
        return this.f2349c;
    }

    /* renamed from: a */
    public final void mo4900a(int i) {
        this.f2349c = i;
    }

    /* renamed from: a */
    public final void mo4901a(String str) {
        this.f2347a = str;
    }

    /* renamed from: a */
    public final void mo4902a(boolean z) {
        this.f2350d = z;
    }

    /* renamed from: b */
    public final String mo4903b() {
        return this.f2347a;
    }

    /* renamed from: b */
    public final void mo4904b(boolean z) {
        this.f2351e = z;
    }

    /* renamed from: c */
    public final List<DeviceBean> mo4905c() {
        return this.f2348b;
    }

    /* renamed from: d */
    public final boolean mo4906d() {
        return this.f2350d;
    }

    /* renamed from: e */
    public final boolean mo4907e() {
        return this.f2351e;
    }
}
