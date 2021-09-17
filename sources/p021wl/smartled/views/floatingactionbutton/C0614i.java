package p021wl.smartled.views.floatingactionbutton;

import android.os.Parcel;
import android.os.Parcelable;
import p021wl.smartled.views.floatingactionbutton.FloatingActionsMenu;

/* renamed from: wl.smartled.views.floatingactionbutton.i */
final class C0614i implements Parcelable.Creator<FloatingActionsMenu.SavedState> {
    C0614i() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FloatingActionsMenu.SavedState(parcel, (byte) 0);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FloatingActionsMenu.SavedState[i];
    }
}
