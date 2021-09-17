package android.support.p007v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v4.widget.ContentLoadingProgressBar */
public class ContentLoadingProgressBar extends ProgressBar {
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mStartTime = -1;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() {
            public void run() {
                ContentLoadingProgressBar.this.mPostedHide = false;
                ContentLoadingProgressBar.this.mStartTime = -1;
                ContentLoadingProgressBar.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() {
            public void run() {
                ContentLoadingProgressBar.this.mPostedShow = false;
                if (!ContentLoadingProgressBar.this.mDismissed) {
                    ContentLoadingProgressBar.this.mStartTime = System.currentTimeMillis();
                    ContentLoadingProgressBar.this.setVisibility(0);
                }
            }
        };
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void hide() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 1
            r9.mDismissed = r0     // Catch:{ all -> 0x0039 }
            java.lang.Runnable r1 = r9.mDelayedShow     // Catch:{ all -> 0x0039 }
            r9.removeCallbacks(r1)     // Catch:{ all -> 0x0039 }
            r1 = 0
            r9.mPostedShow = r1     // Catch:{ all -> 0x0039 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0039 }
            long r3 = r9.mStartTime     // Catch:{ all -> 0x0039 }
            r5 = 0
            long r1 = r1 - r3
            r3 = 500(0x1f4, double:2.47E-321)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0032
            long r5 = r9.mStartTime     // Catch:{ all -> 0x0039 }
            r7 = -1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            boolean r5 = r9.mPostedHide     // Catch:{ all -> 0x0039 }
            if (r5 != 0) goto L_0x0030
            java.lang.Runnable r5 = r9.mDelayedHide     // Catch:{ all -> 0x0039 }
            r6 = 0
            long r3 = r3 - r1
            r9.postDelayed(r5, r3)     // Catch:{ all -> 0x0039 }
            r9.mPostedHide = r0     // Catch:{ all -> 0x0039 }
        L_0x0030:
            monitor-exit(r9)
            return
        L_0x0032:
            r0 = 8
            r9.setVisibility(r0)     // Catch:{ all -> 0x0039 }
            monitor-exit(r9)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.widget.ContentLoadingProgressBar.hide():void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    public synchronized void show() {
        this.mStartTime = -1;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        this.mPostedHide = false;
        if (!this.mPostedShow) {
            postDelayed(this.mDelayedShow, 500);
            this.mPostedShow = true;
        }
    }
}
