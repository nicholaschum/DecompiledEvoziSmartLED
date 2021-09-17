package android.arch.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.arch.lifecycle.a */
final class C0013a {

    /* renamed from: a */
    static C0013a f30a = new C0013a();

    /* renamed from: b */
    private final Map<Class, C0016b> f31b = new HashMap();

    /* renamed from: c */
    private final Map<Class, Boolean> f32c = new HashMap();

    C0013a() {
    }

    /* renamed from: a */
    private C0016b m46a(Class cls, Method[] methodArr) {
        int i;
        C0016b b;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo55b(superclass)) == null)) {
            hashMap.putAll(b.f35b);
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Map.Entry next : mo55b(b2).f35b.entrySet()) {
                m47a(hashMap, (C0017c) next.getKey(), (C0021g) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m48c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0036v vVar = (C0036v) method.getAnnotation(C0036v.class);
            if (vVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0024j.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0021g a = vVar.mo80a();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0021g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C0021g.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m47a(hashMap, new C0017c(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0016b bVar = new C0016b(hashMap);
        this.f31b.put(cls, bVar);
        this.f32c.put(cls, Boolean.valueOf(z));
        return bVar;
    }

    /* renamed from: a */
    private static void m47a(Map<C0017c, C0021g> map, C0017c cVar, C0021g gVar, Class cls) {
        C0021g gVar2 = map.get(cVar);
        if (gVar2 != null && gVar != gVar2) {
            Method method = cVar.f37b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + gVar2 + ", new value " + gVar);
        } else if (gVar2 == null) {
            map.put(cVar, gVar);
        }
    }

    /* renamed from: c */
    private static Method[] m48c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo54a(Class cls) {
        if (this.f32c.containsKey(cls)) {
            return this.f32c.get(cls).booleanValue();
        }
        Method[] c = m48c(cls);
        for (Method annotation : c) {
            if (((C0036v) annotation.getAnnotation(C0036v.class)) != null) {
                m46a(cls, c);
                return true;
            }
        }
        this.f32c.put(cls, Boolean.FALSE);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0016b mo55b(Class cls) {
        C0016b bVar = this.f31b.get(cls);
        return bVar != null ? bVar : m46a(cls, (Method[]) null);
    }
}
