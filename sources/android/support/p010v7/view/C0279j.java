package android.support.p010v7.view;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.j */
final class C0279j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    private static final Class<?>[] f959a = {MenuItem.class};

    /* renamed from: b */
    private Object f960b;

    /* renamed from: c */
    private Method f961c;

    public C0279j(Object obj, String str) {
        this.f960b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f961c = cls.getMethod(str, f959a);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f961c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f961c.invoke(this.f960b, new Object[]{menuItem})).booleanValue();
            }
            this.f961c.invoke(this.f960b, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
