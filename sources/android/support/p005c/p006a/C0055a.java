package android.support.p005c.p006a;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* renamed from: android.support.c.a.a */
public final class C0055a {

    /* renamed from: a */
    private Object f123a;

    private C0055a(Object obj) {
        this.f123a = obj;
    }

    /* renamed from: a */
    public static C0055a m92a(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions;
        if (Build.VERSION.SDK_INT < 24 || (requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new C0055a(requestDragAndDropPermissions);
    }
}
