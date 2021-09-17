package android.support.p010v7.app;

import android.app.Dialog;
import android.os.Bundle;
import android.support.p007v4.view.KeyEventDispatcher;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.ak */
public class C0209ak extends Dialog implements C0242q {

    /* renamed from: a */
    private C0243r f680a;

    /* renamed from: b */
    private final KeyEventDispatcher.Component f681b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0209ak(android.content.Context r4, int r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0013
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r1 = android.support.p010v7.p011a.C0188b.dialogTheme
            r2 = 1
            r0.resolveAttribute(r1, r5, r2)
            int r5 = r5.resourceId
        L_0x0013:
            r3.<init>(r4, r5)
            android.support.v7.app.al r4 = new android.support.v7.app.al
            r4.<init>(r3)
            r3.f681b = r4
            android.support.v7.app.r r4 = r3.m294b()
            r5 = 0
            r4.mo3183a((android.os.Bundle) r5)
            android.support.v7.app.r r4 = r3.m294b()
            r4.mo3212k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.app.C0209ak.<init>(android.content.Context, int):void");
    }

    /* renamed from: b */
    private C0243r m294b() {
        if (this.f680a == null) {
            this.f680a = C0243r.m391a((Dialog) this, (C0242q) this);
        }
        return this.f680a;
    }

    /* renamed from: a */
    public final boolean mo3259a() {
        return m294b().mo3199c(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3260a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m294b().mo3197b(view, layoutParams);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return KeyEventDispatcher.dispatchKeyEvent(this.f681b, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return m294b().mo3180a(i);
    }

    public void invalidateOptionsMenu() {
        m294b().mo3206g();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        m294b().mo3211j();
        super.onCreate(bundle);
        m294b().mo3183a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m294b().mo3202e();
    }

    public void onSupportActionModeFinished(C0271b bVar) {
    }

    public void onSupportActionModeStarted(C0271b bVar) {
    }

    public C0271b onWindowStartingSupportActionMode(C0272c cVar) {
        return null;
    }

    public void setContentView(int i) {
        m294b().mo3194b(i);
    }

    public void setContentView(View view) {
        m294b().mo3187a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m294b().mo3188a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m294b().mo3189a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m294b().mo3189a(charSequence);
    }
}
