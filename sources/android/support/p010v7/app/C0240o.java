package android.support.p010v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p010v7.p011a.C0188b;
import android.util.TypedValue;
import android.view.KeyEvent;

/* renamed from: android.support.v7.app.o */
public final class C0240o extends C0209ak implements DialogInterface {

    /* renamed from: a */
    final AlertController f832a = new AlertController(getContext(), this, getWindow());

    protected C0240o(Context context, int i) {
        super(context, m374a(context, i));
    }

    /* renamed from: a */
    static int m374a(Context context, int i) {
        if (((i >>> 24) & 255) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0188b.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f832a.mo3130a();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f832a;
        if (alertController.f573i != null && alertController.f573i.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.f832a;
        if (alertController.f573i != null && alertController.f573i.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f832a.mo3136a(charSequence);
    }
}
