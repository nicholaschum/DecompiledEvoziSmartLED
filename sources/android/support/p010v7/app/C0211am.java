package android.support.p010v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.am */
final class C0211am implements View.OnClickListener {

    /* renamed from: a */
    private final View f683a;

    /* renamed from: b */
    private final String f684b;

    /* renamed from: c */
    private Method f685c;

    /* renamed from: d */
    private Context f686d;

    public C0211am(View view, String str) {
        this.f683a = view;
        this.f684b = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f685c == null) {
            for (Context context = this.f683a.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f684b, new Class[]{View.class})) != null) {
                        this.f685c = method;
                        this.f686d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
            int id = this.f683a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f683a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f684b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f683a.getClass() + str);
        }
        try {
            this.f685c.invoke(this.f686d, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
