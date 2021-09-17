package p021wl.smartled.fragment;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Locale;
import p021wl.smartled.p024c.C0531d;

/* renamed from: wl.smartled.fragment.j */
final class C0564j implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: a */
    final /* synthetic */ TimingFragment f2530a;

    C0564j(TimingFragment timingFragment) {
        this.f2530a = timingFragment;
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        C0531d.m1823a().mo4958d(i);
        C0531d.m1823a().mo4959e(i2);
        this.f2530a.f2510f.setText(String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        this.f2530a.f2520p.sendEmptyMessage(102);
    }
}
