package p021wl.smartled.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/* renamed from: wl.smartled.views.ClickButton */
public class ClickButton extends Button {
    public ClickButton(Context context) {
        super(context);
    }

    public ClickButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    f = 0.7f;
                    break;
                case 1:
                    break;
            }
        }
        f = 1.0f;
        setAlpha(f);
        return super.onTouchEvent(motionEvent);
    }
}
