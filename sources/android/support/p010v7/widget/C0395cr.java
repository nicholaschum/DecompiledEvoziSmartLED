package android.support.p010v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v7.widget.SearchView;

/* renamed from: android.support.v7.widget.cr */
final class C0395cr implements Parcelable.ClassLoaderCreator<SearchView.SavedState> {
    C0395cr() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SearchView.SavedState[i];
    }
}
