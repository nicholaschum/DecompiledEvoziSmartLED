package com.qihoo360.replugin;

import android.content.Context;
import android.os.IBinder;
import library.C0469b;

public class Entry {
    public static final IBinder create(Context context, ClassLoader classLoader, IBinder iBinder) {
        C0458e.m1529a(classLoader);
        C0457d.m1525a(context, classLoader, iBinder);
        return new C0469b() {
            /* renamed from: a */
            public final IBinder mo4632a(String str) {
                return C0461g.m1551a().mo4634a(str);
            }
        };
    }
}
