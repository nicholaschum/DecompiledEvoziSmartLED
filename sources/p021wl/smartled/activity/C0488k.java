package p021wl.smartled.activity;

import android.content.DialogInterface;
import android.widget.EditText;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.p024c.C0528a;
import p021wl.smartled.p027f.C0551n;

/* renamed from: wl.smartled.activity.k */
final class C0488k implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f2167a;

    /* renamed from: b */
    final /* synthetic */ boolean f2168b;

    /* renamed from: c */
    final /* synthetic */ int f2169c;

    /* renamed from: d */
    final /* synthetic */ MainActivity f2170d;

    C0488k(MainActivity mainActivity, EditText editText, boolean z, int i) {
        this.f2170d = mainActivity;
        this.f2167a = editText;
        this.f2168b = z;
        this.f2169c = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f2167a.getText().toString();
        if (obj == null || obj.isEmpty()) {
            C0551n.m1925a(this.f2170d, C0462R.string.string_empty_data);
            return;
        }
        if (this.f2168b) {
            C0528a.m1795a().mo4927a(obj);
        } else {
            C0528a.m1795a().mo4930a(this.f2169c, obj);
        }
        this.f2170d.f2098Z.sendEmptyMessage(104);
    }
}
