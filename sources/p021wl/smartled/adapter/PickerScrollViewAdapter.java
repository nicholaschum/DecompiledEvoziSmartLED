package p021wl.smartled.adapter;

import android.content.Context;
import android.util.AttributeSet;
import com.qihoo360.replugin.library.C0462R;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.beans.C0527h;
import p021wl.smartled.views.PickerScrollView;

/* renamed from: wl.smartled.adapter.PickerScrollViewAdapter */
public class PickerScrollViewAdapter extends PickerScrollView {
    public PickerScrollViewAdapter(Context context) {
        super(context);
        m1664b();
    }

    public PickerScrollViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1664b();
    }

    /* renamed from: b */
    private void m1664b() {
        ArrayList arrayList = new ArrayList();
        String[] stringArray = getResources().getStringArray(C0462R.array.modes);
        for (int i = 0; i < stringArray.length; i++) {
            arrayList.add(new C0527h(stringArray[i], String.valueOf(i)));
        }
        mo5187a((List<C0527h>) arrayList);
    }
}
