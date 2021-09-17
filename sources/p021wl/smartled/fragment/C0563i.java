package p021wl.smartled.fragment;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Locale;
import p021wl.smartled.p024c.C0531d;

/* renamed from: wl.smartled.fragment.i */
final class C0563i implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    final /* synthetic */ TimingFragment f2529a;

    C0563i(TimingFragment timingFragment) {
        this.f2529a = timingFragment;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        C0531d.m1823a().mo4950a(i);
        C0531d.m1823a().mo4953b(i2);
        this.f2529a.f2508d.setText(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        this.f2529a.f2520p.sendEmptyMessage(101);
    }
}
