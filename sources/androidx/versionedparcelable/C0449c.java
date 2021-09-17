package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;

/* renamed from: androidx.versionedparcelable.c */
final class C0449c extends C0448b {

    /* renamed from: a */
    private final SparseIntArray f1916a;

    /* renamed from: b */
    private final Parcel f1917b;

    /* renamed from: c */
    private final int f1918c;

    /* renamed from: d */
    private final int f1919d;

    /* renamed from: e */
    private final String f1920e;

    /* renamed from: f */
    private int f1921f;

    /* renamed from: g */
    private int f1922g;

    C0449c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "");
    }

    private C0449c(Parcel parcel, int i, int i2, String str) {
        this.f1916a = new SparseIntArray();
        this.f1921f = -1;
        this.f1922g = 0;
        this.f1917b = parcel;
        this.f1918c = i;
        this.f1919d = i2;
        this.f1922g = this.f1918c;
        this.f1920e = str;
    }

    /* renamed from: a */
    public final void mo4610a() {
        if (this.f1921f >= 0) {
            int i = this.f1916a.get(this.f1921f);
            int dataPosition = this.f1917b.dataPosition();
            this.f1917b.setDataPosition(i);
            this.f1917b.writeInt(dataPosition - i);
            this.f1917b.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public final void mo4611a(int i) {
        this.f1917b.writeInt(i);
    }

    /* renamed from: a */
    public final void mo4613a(Parcelable parcelable) {
        this.f1917b.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public final void mo4616a(String str) {
        this.f1917b.writeString(str);
    }

    /* renamed from: a */
    public final void mo4617a(byte[] bArr) {
        if (bArr != null) {
            this.f1917b.writeInt(bArr.length);
            this.f1917b.writeByteArray(bArr);
            return;
        }
        this.f1917b.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0448b mo4620b() {
        Parcel parcel = this.f1917b;
        int dataPosition = this.f1917b.dataPosition();
        int i = this.f1922g == this.f1918c ? this.f1919d : this.f1922g;
        return new C0449c(parcel, dataPosition, i, this.f1920e + "  ");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4623b(int r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4.f1922g
            int r1 = r4.f1919d
            r2 = -1
            if (r0 >= r1) goto L_0x0028
            android.os.Parcel r0 = r4.f1917b
            int r1 = r4.f1922g
            r0.setDataPosition(r1)
            android.os.Parcel r0 = r4.f1917b
            int r0 = r0.readInt()
            android.os.Parcel r1 = r4.f1917b
            int r1 = r1.readInt()
            int r3 = r4.f1922g
            int r3 = r3 + r0
            r4.f1922g = r3
            if (r1 != r5) goto L_0x0000
            android.os.Parcel r5 = r4.f1917b
            int r5 = r5.dataPosition()
            goto L_0x0029
        L_0x0028:
            r5 = -1
        L_0x0029:
            if (r5 != r2) goto L_0x002d
            r5 = 0
            return r5
        L_0x002d:
            android.os.Parcel r0 = r4.f1917b
            r0.setDataPosition(r5)
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.versionedparcelable.C0449c.mo4623b(int):boolean");
    }

    /* renamed from: c */
    public final int mo4624c() {
        return this.f1917b.readInt();
    }

    /* renamed from: c */
    public final void mo4626c(int i) {
        mo4610a();
        this.f1921f = i;
        this.f1916a.put(i, this.f1917b.dataPosition());
        mo4611a(0);
        mo4611a(i);
    }

    /* renamed from: d */
    public final String mo4628d() {
        return this.f1917b.readString();
    }

    /* renamed from: e */
    public final byte[] mo4629e() {
        int readInt = this.f1917b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1917b.readByteArray(bArr);
        return bArr;
    }

    /* renamed from: f */
    public final <T extends Parcelable> T mo4630f() {
        return this.f1917b.readParcelable(getClass().getClassLoader());
    }
}
