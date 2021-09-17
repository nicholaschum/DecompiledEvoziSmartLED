package com.qihoo360.replugin;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.qihoo360.replugin.g */
public class C0461g {

    /* renamed from: a */
    private static C0461g f2000a;

    /* renamed from: b */
    private ConcurrentHashMap<String, IBinder> f2001b = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static C0461g m1551a() {
        if (f2000a != null) {
            return f2000a;
        }
        synchronized (C0461g.class) {
            if (f2000a == null) {
                f2000a = new C0461g();
            }
        }
        return f2000a;
    }

    /* renamed from: a */
    public IBinder mo4634a(String str) {
        if (!TextUtils.isEmpty(str)) {
            IBinder iBinder = this.f2001b.get(str);
            if (iBinder == null) {
                return null;
            }
            if (iBinder.isBinderAlive() && iBinder.pingBinder()) {
                return iBinder;
            }
            this.f2001b.remove(str);
            return null;
        }
        throw new IllegalArgumentException("service name can not value null");
    }

    /* renamed from: a */
    public void mo4635a(String str, IBinder iBinder) {
        this.f2001b.put(str, iBinder);
    }
}
