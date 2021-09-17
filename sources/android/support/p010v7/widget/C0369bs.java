package android.support.p010v7.widget;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.bs */
final class C0369bs implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ ListPopupWindow f1729a;

    C0369bs(ListPopupWindow listPopupWindow) {
        this.f1729a = listPopupWindow;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && this.f1729a.f1437g != null && this.f1729a.f1437g.isShowing() && x >= 0 && x < this.f1729a.f1437g.getWidth() && y >= 0 && y < this.f1729a.f1437g.getHeight()) {
            this.f1729a.f1436f.postDelayed(this.f1729a.f1435e, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            this.f1729a.f1436f.removeCallbacks(this.f1729a.f1435e);
            return false;
        }
    }
}
