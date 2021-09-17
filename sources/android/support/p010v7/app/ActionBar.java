package android.support.p010v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.ActionBar */
public abstract class ActionBar {

    /* renamed from: android.support.v7.app.ActionBar$LayoutParams */
    public class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f539a;

        public LayoutParams() {
            super(-2, -2);
            this.f539a = 0;
            this.f539a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f539a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0197k.f532t);
            this.f539a = obtainStyledAttributes.getInt(C0197k.f533u, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f539a = 0;
            this.f539a = layoutParams.f539a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f539a = 0;
        }
    }

    /* renamed from: a */
    public abstract int mo3112a();

    /* renamed from: a */
    public C0271b mo3113a(C0272c cVar) {
        return null;
    }

    /* renamed from: a */
    public void mo3114a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo3115a(int i) {
    }

    /* renamed from: a */
    public void mo3116a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo3117a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public void mo3118a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo3119a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3120a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo3121b() {
        return null;
    }

    /* renamed from: b */
    public void mo3122b(boolean z) {
    }

    /* renamed from: c */
    public void mo3123c() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: c */
    public void mo3124c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo3125d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo3126e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo3127f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo3128g() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3129h() {
    }
}
