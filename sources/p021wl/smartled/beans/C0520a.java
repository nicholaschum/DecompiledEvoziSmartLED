package p021wl.smartled.beans;

import android.util.SparseArray;
import p021wl.smartled.p027f.C0541d;
import p021wl.smartled.p027f.C0542e;

/* renamed from: wl.smartled.beans.a */
public final class C0520a {

    /* renamed from: a */
    public String f2320a;

    /* renamed from: b */
    public String f2321b;

    /* renamed from: c */
    public String f2322c;

    /* renamed from: d */
    public String f2323d;

    /* renamed from: e */
    public int f2324e;

    /* renamed from: f */
    public SparseArray<byte[]> f2325f;

    public C0520a(String str, String str2, byte[] bArr) {
        mo4867a(str, str2, bArr);
    }

    /* renamed from: a */
    private void m1725a(byte[] bArr, int i) {
        int i2;
        int i3;
        if (i < bArr.length) {
            int i4 = i + 1;
            byte b = bArr[i];
            if (b > 0 && bArr[i4] == -1 && b >= 18) {
                int i5 = i4 + 1;
                if (i4 + b <= bArr.length) {
                    int i6 = i5 + 1;
                    if (bArr[i5] == -24) {
                        int i7 = i6 + 1;
                        if (bArr[i6] == -66) {
                            int i8 = i7 + 1;
                            byte b2 = bArr[i7];
                            C0541d.m1902a(bArr, i8, i8 + 13, b2);
                            int i9 = i8 + 1;
                            if (bArr[i8] == -96) {
                                this.f2324e = b2;
                                if (bArr[i9] == 0 && bArr[i9 + 1] == 0) {
                                    this.f2322c = null;
                                    i2 = i9 + 2;
                                } else {
                                    int i10 = i9 + 1;
                                    i2 = i10 + 1;
                                    this.f2322c = C0542e.m1903a(new byte[]{bArr[i9], bArr[i10]});
                                }
                                if (this.f2325f == null) {
                                    this.f2325f = new SparseArray<>();
                                }
                                if (bArr[i2] == 126) {
                                    int i11 = i2 + 1;
                                    int i12 = i11 + 1;
                                    byte b3 = (bArr[i11] << 8) | (bArr[i2] << 16);
                                    int i13 = i12 + 1;
                                    byte b4 = b3 | bArr[i12];
                                    int i14 = i13 + 1;
                                    int i15 = i14 + 1;
                                    int i16 = i15 + 1;
                                    int i17 = i16 + 1;
                                    int i18 = i17 + 1;
                                    i3 = i18 + 1;
                                    this.f2325f.put(b4, new byte[]{bArr[i13], bArr[i14], bArr[i15], bArr[i16], bArr[i17], bArr[i18]});
                                } else {
                                    i3 = i2 + 9;
                                }
                                if (bArr[i3] == 0 && bArr[i3 + 1] == 0) {
                                    this.f2323d = null;
                                    return;
                                }
                                this.f2323d = C0542e.m1903a(new byte[]{bArr[i3], bArr[i3 + 1]});
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4867a(String str, String str2, byte[] bArr) {
        this.f2322c = null;
        this.f2323d = null;
        this.f2324e = -1;
        if (bArr != null && bArr.length >= 19) {
            byte b = bArr[0];
            if (bArr[1] == 9) {
                m1725a(bArr, b + 1);
            } else {
                m1725a(bArr, 0);
            }
        }
        this.f2320a = str2;
        this.f2321b = str;
    }
}
