package com.qihoo360.replugin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.qihoo360.replugin.c */
class C0456c {
    /* renamed from: a */
    static int m1522a(String str, String str2) {
        Resources fetchResources;
        PackageInfo fetchPackageInfo = RePlugin.fetchPackageInfo(str);
        if (fetchPackageInfo == null || (fetchResources = RePlugin.fetchResources(str)) == null) {
            return 0;
        }
        return fetchResources.getIdentifier(fetchPackageInfo.packageName + ":" + str2, (String) null, (String) null);
    }

    /* renamed from: a */
    public static <T extends View> T m1523a(String str, String str2, ViewGroup viewGroup) {
        Context fetchContext = RePlugin.fetchContext(str);
        int a = m1522a(str, "layout/".concat(String.valueOf(str2)));
        if (a <= 0) {
            return null;
        }
        return LayoutInflater.from(fetchContext).inflate(a, viewGroup);
    }
}
