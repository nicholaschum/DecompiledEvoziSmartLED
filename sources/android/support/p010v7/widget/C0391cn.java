package android.support.p010v7.widget;

import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.cn */
final class C0391cn {

    /* renamed from: a */
    private Method f1775a;

    /* renamed from: b */
    private Method f1776b;

    /* renamed from: c */
    private Method f1777c;

    C0391cn() {
        try {
            this.f1775a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f1775a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            this.f1776b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f1776b.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
        try {
            this.f1777c = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
            this.f1777c.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4518a(AutoCompleteTextView autoCompleteTextView) {
        if (this.f1775a != null) {
            try {
                this.f1775a.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4519b(AutoCompleteTextView autoCompleteTextView) {
        if (this.f1776b != null) {
            try {
                this.f1776b.invoke(autoCompleteTextView, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4520c(AutoCompleteTextView autoCompleteTextView) {
        if (this.f1777c != null) {
            try {
                this.f1777c.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
            } catch (Exception unused) {
            }
        }
    }
}
