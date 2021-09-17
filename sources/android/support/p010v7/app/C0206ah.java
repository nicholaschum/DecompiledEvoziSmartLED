package android.support.p010v7.app;

import android.content.Context;
import android.support.p010v7.p012b.p013a.C0252a;
import android.support.p010v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* renamed from: android.support.v7.app.ah */
final class C0206ah extends ContentFrameLayout {

    /* renamed from: a */
    final /* synthetic */ AppCompatDelegateImpl f678a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0206ah(AppCompatDelegateImpl appCompatDelegateImpl, Context context) {
        super(context);
        this.f678a = appCompatDelegateImpl;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f678a.mo3192a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                this.f678a.mo3218p();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C0252a.m419b(getContext(), i));
    }
}
