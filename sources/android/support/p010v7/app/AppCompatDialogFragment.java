package android.support.p010v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p007v4.app.DialogFragment;

/* renamed from: android.support.v7.app.AppCompatDialogFragment */
public class AppCompatDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new C0209ak(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C0209ak) {
            C0209ak akVar = (C0209ak) dialog;
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                    dialog.getWindow().addFlags(24);
                    break;
                default:
                    return;
            }
            akVar.mo3259a();
            return;
        }
        super.setupDialog(dialog, i);
    }
}
