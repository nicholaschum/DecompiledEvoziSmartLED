package android.support.p010v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.support.p010v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.r */
public abstract class C0243r {

    /* renamed from: a */
    private static int f835a = -1;

    C0243r() {
    }

    /* renamed from: a */
    public static C0243r m390a(Activity activity, C0242q qVar) {
        return new AppCompatDelegateImpl(activity, activity.getWindow(), qVar);
    }

    /* renamed from: a */
    public static C0243r m391a(Dialog dialog, C0242q qVar) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), qVar);
    }

    /* renamed from: l */
    public static int m392l() {
        return f835a;
    }

    /* renamed from: a */
    public abstract ActionBar mo3177a();

    /* renamed from: a */
    public abstract C0271b mo3179a(C0272c cVar);

    /* renamed from: a */
    public abstract <T extends View> T mo3180a(int i);

    /* renamed from: a */
    public abstract void mo3182a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo3183a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo3186a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo3187a(View view);

    /* renamed from: a */
    public abstract void mo3188a(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo3189a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo3193b();

    /* renamed from: b */
    public abstract void mo3194b(int i);

    /* renamed from: b */
    public abstract void mo3195b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo3197b(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo3198c();

    /* renamed from: c */
    public abstract boolean mo3199c(int i);

    /* renamed from: d */
    public abstract void mo3200d();

    /* renamed from: e */
    public abstract void mo3202e();

    /* renamed from: f */
    public abstract void mo3205f();

    /* renamed from: g */
    public abstract void mo3206g();

    /* renamed from: h */
    public abstract void mo3209h();

    /* renamed from: i */
    public abstract C0225b mo3210i();

    /* renamed from: j */
    public abstract void mo3211j();

    /* renamed from: k */
    public abstract boolean mo3212k();
}
