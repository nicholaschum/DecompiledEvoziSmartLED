package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.p007v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0448b;

public class IconCompatParcelizer {
    public static IconCompat read(C0448b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.mType = bVar.mo4618b(iconCompat.mType, 1);
        iconCompat.mData = bVar.mo4627c(iconCompat.mData);
        iconCompat.mParcelable = bVar.mo4619b(iconCompat.mParcelable, 3);
        iconCompat.mInt1 = bVar.mo4618b(iconCompat.mInt1, 4);
        iconCompat.mInt2 = bVar.mo4618b(iconCompat.mInt2, 5);
        iconCompat.mTintList = (ColorStateList) bVar.mo4619b(iconCompat.mTintList, 6);
        iconCompat.mTintModeStr = bVar.mo4625c(iconCompat.mTintModeStr);
        iconCompat.onPostParceling();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0448b bVar) {
        iconCompat.onPreParceling(false);
        bVar.mo4612a(iconCompat.mType, 1);
        bVar.mo4622b(iconCompat.mData);
        bVar.mo4614a(iconCompat.mParcelable, 3);
        bVar.mo4612a(iconCompat.mInt1, 4);
        bVar.mo4612a(iconCompat.mInt2, 5);
        bVar.mo4614a((Parcelable) iconCompat.mTintList, 6);
        bVar.mo4621b(iconCompat.mTintModeStr);
    }
}
