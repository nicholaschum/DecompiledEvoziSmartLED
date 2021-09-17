package p021wl.smartled.p027f;

/* renamed from: wl.smartled.f.c */
public final class C0540c {
    /* renamed from: a */
    public static void m1901a(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16 && bArr2.length >= 12) {
            boolean z = true;
            int i = 0;
            for (int i2 = 0; i2 < 16; i2 += 2) {
                if (z) {
                    int i3 = i + 1;
                    bArr2[i] = bArr[i2];
                    bArr2[i3] = (byte) (bArr[i2 + 1] & 240);
                    i = i3;
                } else {
                    int i4 = i + 1;
                    bArr2[i] = (byte) (bArr2[i] | ((byte) ((bArr[i2] >> 4) & 15)));
                    bArr2[i4] = (byte) ((bArr[i2] & 15) << 4);
                    i = i4 + 1;
                    bArr2[i4] = (byte) (bArr2[i4] | ((byte) ((bArr[i2 + 1] & 240) >> 4)));
                }
                z = !z;
            }
        }
    }
}
