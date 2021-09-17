package android.support.design.widget;

import android.support.p007v4.view.ViewCompat;
import android.view.View;
import java.util.Comparator;

/* renamed from: android.support.design.widget.h */
final class C0063h implements Comparator<View> {
    C0063h() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        float z = ViewCompat.getZ((View) obj);
        float z2 = ViewCompat.getZ((View) obj2);
        if (z > z2) {
            return -1;
        }
        return z < z2 ? 1 : 0;
    }
}
