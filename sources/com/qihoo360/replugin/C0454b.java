package com.qihoo360.replugin;

import java.lang.reflect.Method;

/* renamed from: com.qihoo360.replugin.b */
public class C0454b {

    /* renamed from: a */
    private ClassLoader f1961a;

    /* renamed from: b */
    private String f1962b;

    /* renamed from: c */
    private String f1963c;

    /* renamed from: d */
    private Class<?>[] f1964d;

    /* renamed from: e */
    private Method f1965e = null;

    /* renamed from: f */
    private boolean f1966f = false;

    /* renamed from: g */
    private boolean f1967g = false;

    public C0454b(ClassLoader classLoader, String str, String str2, Class<?>[] clsArr) {
        this.f1961a = classLoader;
        this.f1962b = str;
        this.f1963c = str2;
        this.f1964d = clsArr;
    }

    /* renamed from: a */
    public Object mo4633a(Object obj, Object... objArr) {
        if (!this.f1966f) {
            try {
                this.f1966f = true;
                ClassLoader classLoader = this.f1961a;
                String str = this.f1962b;
                String str2 = this.f1963c;
                Class<?>[] clsArr = this.f1964d;
                Class<?> cls = Class.forName(str, false, classLoader);
                this.f1965e = cls != null ? cls.getDeclaredMethod(str2, clsArr) : null;
                this.f1967g = true;
            } catch (Exception unused) {
            }
        }
        if (this.f1965e != null) {
            try {
                Method method = this.f1965e;
                if (method != null) {
                    boolean isAccessible = method.isAccessible();
                    if (!isAccessible) {
                        method.setAccessible(true);
                    }
                    Object invoke = method.invoke(obj, objArr);
                    if (!isAccessible) {
                        method.setAccessible(false);
                    }
                    return invoke;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
