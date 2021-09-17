package android.arch.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.arch.lifecycle.c */
final class C0017c {

    /* renamed from: a */
    final int f36a;

    /* renamed from: b */
    final Method f37b;

    C0017c(int i, Method method) {
        this.f36a = i;
        this.f37b = method;
        this.f37b.setAccessible(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61a(C0024j jVar, C0021g gVar, Object obj) {
        try {
            switch (this.f36a) {
                case 0:
                    this.f37b.invoke(obj, new Object[0]);
                    return;
                case 1:
                    this.f37b.invoke(obj, new Object[]{jVar});
                    return;
                case 2:
                    this.f37b.invoke(obj, new Object[]{jVar, gVar});
                    return;
                default:
                    return;
            }
        } catch (InvocationTargetException e) {
            throw new RuntimeException("Failed to call observer method", e.getCause());
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0017c cVar = (C0017c) obj;
            return this.f36a == cVar.f36a && this.f37b.getName().equals(cVar.f37b.getName());
        }
    }

    public final int hashCode() {
        return (this.f36a * 31) + this.f37b.getName().hashCode();
    }
}
