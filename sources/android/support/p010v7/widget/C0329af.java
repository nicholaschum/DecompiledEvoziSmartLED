package android.support.p010v7.widget;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.af */
final class C0329af implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ActivityChooserView f1614a;

    C0329af(ActivityChooserView activityChooserView) {
        this.f1614a = activityChooserView;
    }

    public final void onClick(View view) {
        if (view == this.f1614a.f1338c) {
            this.f1614a.mo3995b();
            Intent b = this.f1614a.f1336a.mo4275e().mo4590b(this.f1614a.f1336a.mo4275e().mo4588a(this.f1614a.f1336a.mo4272b()));
            if (b != null) {
                b.addFlags(524288);
                this.f1614a.getContext().startActivity(b);
            }
        } else if (view == this.f1614a.f1337b) {
            this.f1614a.f1342g = false;
            this.f1614a.mo3994b(this.f1614a.f1343h);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void onDismiss() {
        if (this.f1614a.f1341f != null) {
            this.f1614a.f1341f.onDismiss();
        }
        if (this.f1614a.f1339d != null) {
            this.f1614a.f1339d.subUiVisibilityChanged(false);
        }
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        switch (((C0328ae) adapterView.getAdapter()).getItemViewType(i)) {
            case 0:
                this.f1614a.mo3995b();
                if (!this.f1614a.f1342g) {
                    if (!this.f1614a.f1336a.mo4276f()) {
                        i++;
                    }
                    Intent b = this.f1614a.f1336a.mo4275e().mo4590b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        this.f1614a.getContext().startActivity(b);
                        return;
                    }
                    return;
                } else if (i > 0) {
                    this.f1614a.f1336a.mo4275e().mo4593c(i);
                    return;
                } else {
                    return;
                }
            case 1:
                this.f1614a.mo3994b(Integer.MAX_VALUE);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean onLongClick(View view) {
        if (view == this.f1614a.f1338c) {
            if (this.f1614a.f1336a.getCount() > 0) {
                this.f1614a.f1342g = true;
                this.f1614a.mo3994b(this.f1614a.f1343h);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }
}
