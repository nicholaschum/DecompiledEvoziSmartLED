package p021wl.smartled.p027f;

/* renamed from: wl.smartled.f.d */
public final class C0541d {
    /* renamed from: a */
    public static void m1902a(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = {89, 76, 90, 75, 53, 49, 33, 41, 62, 72, 64, 118, 100, 98, 81, 68, 94, 68, 63, (byte) i3};
        while (i <= i2 && i < bArr.length) {
            for (int i4 = 0; i4 < 20; i4++) {
                bArr[i] = (byte) (bArr2[i4] ^ bArr[i]);
            }
            i++;
        }
    }
}
