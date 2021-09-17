package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0447a();

    /* renamed from: a */
    private final C0450d f1915a;

    protected ParcelImpl(Parcel parcel) {
        this.f1915a = new C0449c(parcel).mo4631g();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C0449c(parcel).mo4615a(this.f1915a);
    }
}
