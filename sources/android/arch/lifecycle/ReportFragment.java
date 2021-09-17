package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class ReportFragment extends Fragment {

    /* renamed from: a */
    private C0037w f28a;

    /* renamed from: a */
    public static void m43a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    private void m44a(C0021g gVar) {
        Activity activity = getActivity();
        if (activity instanceof C0028n) {
            ((C0028n) activity).mo72a().mo69a(gVar);
        } else if (activity instanceof C0024j) {
            C0020f lifecycle = ((C0024j) activity).getLifecycle();
            if (lifecycle instanceof C0025k) {
                ((C0025k) lifecycle).mo69a(gVar);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m44a(C0021g.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m44a(C0021g.ON_DESTROY);
        this.f28a = null;
    }

    public void onPause() {
        super.onPause();
        m44a(C0021g.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m44a(C0021g.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m44a(C0021g.ON_START);
    }

    public void onStop() {
        super.onStop();
        m44a(C0021g.ON_STOP);
    }
}
