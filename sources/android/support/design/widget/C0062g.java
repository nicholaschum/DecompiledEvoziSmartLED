package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;

/* renamed from: android.support.design.widget.g */
final class C0062g implements Parcelable.ClassLoaderCreator<CoordinatorLayout.SavedState> {
    C0062g() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CoordinatorLayout.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CoordinatorLayout.SavedState[i];
    }
}
