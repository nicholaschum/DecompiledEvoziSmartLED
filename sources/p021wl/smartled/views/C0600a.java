package p021wl.smartled.views;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;

/* renamed from: wl.smartled.views.a */
public final class C0600a {

    /* renamed from: a */
    private Dialog f2817a;

    /* renamed from: a */
    public final void mo5211a() {
        if (this.f2817a != null && this.f2817a.isShowing()) {
            this.f2817a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo5212a(Context context) {
        this.f2817a = new Dialog(context, C0462R.style.progress_dialog);
        this.f2817a.setContentView(C0462R.layout.circle_dialog);
        this.f2817a.setCancelable(false);
        this.f2817a.getWindow().setBackgroundDrawableResource(17170445);
        ((TextView) this.f2817a.findViewById(C0462R.C0464id.id_tv_loadingmsg)).setText(context.getString(C0462R.string.string_connection_pending1));
        this.f2817a.show();
    }
}
