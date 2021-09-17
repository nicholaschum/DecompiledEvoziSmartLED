package p021wl.smartled.fragment;

import android.util.Log;
import com.qihoo360.replugin.library.C0462R;
import p021wl.smartled.beans.C0525f;
import p021wl.smartled.p027f.C0550m;

/* renamed from: wl.smartled.fragment.c */
final class C0557c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ MusicFragment f2524a;

    C0557c(MusicFragment musicFragment) {
        this.f2524a = musicFragment;
    }

    public final void run() {
        if (this.f2524a.f2442a != null) {
            C0525f j = this.f2524a.f2442a.mo5098j();
            Log.d("MusicFragment", "run: ".concat(String.valueOf(j)));
            if (this.f2524a.f2442a.mo5097i() != this.f2524a.f2445d.mo4834a()) {
                this.f2524a.f2446e.setText(j.mo4924g());
                this.f2524a.f2447f.setText(j.mo4918d());
                this.f2524a.f2449h.setText(C0550m.m1924a(j.mo4920e()));
                this.f2524a.f2448g.setText(C0550m.m1924a((j.mo4920e() * ((long) this.f2524a.f2454m.getProgress())) / 100));
                this.f2524a.f2445d.mo4835a(this.f2524a.f2442a.mo5097i());
            }
            this.f2524a.f2453l.setImageResource(this.f2524a.f2442a.mo5095g() ? C0462R.C0463drawable.ic_play : C0462R.C0463drawable.ic_muisc_stop);
        }
    }
}
