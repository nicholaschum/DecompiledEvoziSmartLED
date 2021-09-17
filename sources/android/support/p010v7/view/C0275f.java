package android.support.p010v7.view;

import android.content.Context;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.f */
public final class C0275f extends C0271b implements C0310o {

    /* renamed from: a */
    private Context f940a;

    /* renamed from: b */
    private ActionBarContextView f941b;

    /* renamed from: c */
    private C0272c f942c;

    /* renamed from: d */
    private WeakReference<View> f943d;

    /* renamed from: e */
    private boolean f944e;

    /* renamed from: f */
    private boolean f945f;

    /* renamed from: g */
    private MenuBuilder f946g;

    public C0275f(Context context, ActionBarContextView actionBarContextView, C0272c cVar, boolean z) {
        this.f940a = context;
        this.f941b = actionBarContextView;
        this.f942c = cVar;
        this.f946g = new MenuBuilder(actionBarContextView.getContext()).mo3568a();
        this.f946g.mo3576a((C0310o) this);
        this.f945f = z;
    }

    /* renamed from: a */
    public final MenuInflater mo3285a() {
        return new C0278i(this.f941b.getContext());
    }

    /* renamed from: a */
    public final void mo3286a(int i) {
        mo3292b((CharSequence) this.f940a.getString(i));
    }

    /* renamed from: a */
    public final void mo3185a(MenuBuilder menuBuilder) {
        mo3294d();
        this.f941b.mo3887a();
    }

    /* renamed from: a */
    public final void mo3287a(View view) {
        this.f941b.mo3909a(view);
        this.f943d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public final void mo3288a(CharSequence charSequence) {
        this.f941b.mo3913b(charSequence);
    }

    /* renamed from: a */
    public final void mo3289a(boolean z) {
        super.mo3289a(z);
        this.f941b.mo3911a(z);
    }

    /* renamed from: a */
    public final boolean mo3191a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f942c.mo3236a((C0271b) this, menuItem);
    }

    /* renamed from: b */
    public final Menu mo3290b() {
        return this.f946g;
    }

    /* renamed from: b */
    public final void mo3291b(int i) {
        mo3288a((CharSequence) this.f940a.getString(i));
    }

    /* renamed from: b */
    public final void mo3292b(CharSequence charSequence) {
        this.f941b.mo3910a(charSequence);
    }

    /* renamed from: c */
    public final void mo3293c() {
        if (!this.f944e) {
            this.f944e = true;
            this.f941b.sendAccessibilityEvent(32);
            this.f942c.mo3234a(this);
        }
    }

    /* renamed from: d */
    public final void mo3294d() {
        this.f942c.mo3237b(this, this.f946g);
    }

    /* renamed from: f */
    public final CharSequence mo3296f() {
        return this.f941b.mo3912b();
    }

    /* renamed from: g */
    public final CharSequence mo3297g() {
        return this.f941b.mo3914c();
    }

    /* renamed from: h */
    public final boolean mo3298h() {
        return this.f941b.mo3917f();
    }

    /* renamed from: i */
    public final View mo3299i() {
        if (this.f943d != null) {
            return (View) this.f943d.get();
        }
        return null;
    }
}
