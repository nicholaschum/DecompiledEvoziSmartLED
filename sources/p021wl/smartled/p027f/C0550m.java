package p021wl.smartled.p027f;

import java.text.SimpleDateFormat;
import p021wl.smartled.beans.C0525f;

/* renamed from: wl.smartled.f.m */
public final class C0550m {
    /* renamed from: a */
    public static long m1923a(int i, C0525f fVar) {
        if (fVar != null) {
            return (((long) i) * fVar.mo4920e()) / 100;
        }
        return 0;
    }

    /* renamed from: a */
    public static String m1924a(long j) {
        return new SimpleDateFormat("mm:ss").format(Long.valueOf(j));
    }
}
