package android.support.p010v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p010v7.widget.ActionMenuPresenter;

/* renamed from: android.support.v7.widget.n */
final class C0434n implements Parcelable.Creator<ActionMenuPresenter.SavedState> {
    C0434n() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ActionMenuPresenter.SavedState[i];
    }
}
