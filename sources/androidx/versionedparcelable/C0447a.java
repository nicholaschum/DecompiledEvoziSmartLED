package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.versionedparcelable.a */
final class C0447a implements Parcelable.Creator<ParcelImpl> {
    C0447a() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelImpl[i];
    }
}
