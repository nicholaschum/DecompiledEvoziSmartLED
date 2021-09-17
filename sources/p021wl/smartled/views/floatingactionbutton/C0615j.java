package p021wl.smartled.views.floatingactionbutton;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* renamed from: wl.smartled.views.floatingactionbutton.j */
public final class C0615j extends TouchDelegate {

    /* renamed from: a */
    private static final Rect f2885a = new Rect();

    /* renamed from: b */
    private final ArrayList<TouchDelegate> f2886b = new ArrayList<>();

    /* renamed from: c */
    private TouchDelegate f2887c;

    /* renamed from: d */
    private boolean f2888d;

    public C0615j(View view) {
        super(f2885a, view);
    }

    /* renamed from: a */
    public final void mo5250a() {
        this.f2886b.clear();
        this.f2887c = null;
    }

    /* renamed from: a */
    public final void mo5251a(TouchDelegate touchDelegate) {
        this.f2886b.add(touchDelegate);
    }

    /* renamed from: a */
    public final void mo5252a(boolean z) {
        this.f2888d = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2888d) {
            return false;
        }
        TouchDelegate touchDelegate = null;
        switch (motionEvent.getAction()) {
            case 0:
                for (int i = 0; i < this.f2886b.size(); i++) {
                    TouchDelegate touchDelegate2 = this.f2886b.get(i);
                    if (touchDelegate2.onTouchEvent(motionEvent)) {
                        this.f2887c = touchDelegate2;
                        return true;
                    }
                }
                break;
            case 1:
            case 3:
                TouchDelegate touchDelegate3 = this.f2887c;
                this.f2887c = null;
                touchDelegate = touchDelegate3;
                break;
            case 2:
                touchDelegate = this.f2887c;
                break;
        }
        return touchDelegate != null && touchDelegate.onTouchEvent(motionEvent);
    }
}
