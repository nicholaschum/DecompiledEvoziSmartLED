package android.arch.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.arch.lifecycle.o */
public final class C0029o {

    /* renamed from: a */
    private static Map<Class, Integer> f56a = new HashMap();

    /* renamed from: b */
    private static Map<Class, List<Constructor<? extends C0019e>>> f57b = new HashMap();

    /* renamed from: a */
    static GenericLifecycleObserver m79a(Object obj) {
        if (obj instanceof FullLifecycleObserver) {
            return new FullLifecycleObserverAdapter((FullLifecycleObserver) obj);
        }
        if (obj instanceof GenericLifecycleObserver) {
            return (GenericLifecycleObserver) obj;
        }
        Class<?> cls = obj.getClass();
        if (m82b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = f57b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m80a((Constructor) list.get(0), obj));
        }
        C0019e[] eVarArr = new C0019e[list.size()];
        for (int i = 0; i < list.size(); i++) {
            eVarArr[i] = m80a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    /* renamed from: a */
    private static C0019e m80a(Constructor<? extends C0019e> constructor, Object obj) {
        try {
            return (C0019e) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends C0019e> m81a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String str = canonicalName.replace(".", "_") + "_LifecycleAdapter";
            if (!name.isEmpty()) {
                str = name + "." + str;
            }
            Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static int m82b(Class<?> cls) {
        if (f56a.containsKey(cls)) {
            return f56a.get(cls).intValue();
        }
        int c = m83c(cls);
        f56a.put(cls, Integer.valueOf(c));
        return c;
    }

    /* renamed from: c */
    private static int m83c(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends C0019e> a = m81a(cls);
        if (a != null) {
            f57b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0013a.f30a.mo54a(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m84d(superclass)) {
                if (m82b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f57b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m84d(cls2)) {
                    if (m82b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f57b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f57b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: d */
    private static boolean m84d(Class<?> cls) {
        return cls != null && C0023i.class.isAssignableFrom(cls);
    }
}
