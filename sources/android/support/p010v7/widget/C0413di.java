package android.support.p010v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v7.widget.Toolbar;

/* renamed from: android.support.v7.widget.di */
final class C0413di implements Parcelable.ClassLoaderCreator<Toolbar.SavedState> {
    C0413di() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }
}
