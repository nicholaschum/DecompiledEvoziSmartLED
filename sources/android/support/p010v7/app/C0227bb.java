package android.support.p010v7.app;

import android.content.Context;
import android.support.p010v7.view.C0271b;
import android.support.p010v7.view.C0272c;
import android.support.p010v7.view.C0278i;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.bb */
public final class C0227bb extends C0271b implements C0310o {

    /* renamed from: a */
    final /* synthetic */ C0222ax f760a;

    /* renamed from: b */
    private final Context f761b;

    /* renamed from: c */
    private final MenuBuilder f762c;

    /* renamed from: d */
    private C0272c f763d;

    /* renamed from: e */
    private WeakReference<View> f764e;

    public C0227bb(C0222ax axVar, Context context, C0272c cVar) {
        this.f760a = axVar;
        this.f761b = context;
        this.f763d = cVar;
        this.f762c = new MenuBuilder(context).mo3568a();
        this.f762c.mo3576a((C0310o) this);
    }

    /* renamed from: a */
    public final MenuInflater mo3285a() {
        return new C0278i(this.f761b);
    }

    /* renamed from: a */
    public final void mo3286a(int i) {
        mo3292b((CharSequence) this.f760a.f734a.getResources().getString(i));
    }

    /* renamed from: a */
    public final void mo3185a(MenuBuilder menuBuilder) {
        if (this.f763d != null) {
            mo3294d();
            this.f760a.f738e.mo3887a();
        }
    }

    /* renamed from: a */
    public final void mo3287a(View view) {
        this.f760a.f738e.mo3909a(view);
        this.f764e = new WeakReference<>(view);
    }

    /* renamed from: a */
    public final void mo3288a(CharSequence charSequence) {
        this.f760a.f738e.mo3913b(charSequence);
    }

    /* renamed from: a */
    public final void mo3289a(boolean z) {
        super.mo3289a(z);
        this.f760a.f738e.mo3911a(z);
    }

    /* renamed from: a */
    public final boolean mo3191a(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (this.f763d != null) {
            return this.f763d.mo3236a((C0271b) this, menuItem);
        }
        return false;
    }

    /* renamed from: b */
    public final Menu mo3290b() {
        return this.f762c;
    }

    /* renamed from: b */
    public final void mo3291b(int i) {
        mo3288a((CharSequence) this.f760a.f734a.getResources().getString(i));
    }

    /* renamed from: b */
    public final void mo3292b(CharSequence charSequence) {
        this.f760a.f738e.mo3910a(charSequence);
    }

    /* renamed from: c */
    public final void mo3293c() {
        if (this.f760a.f741h == this) {
            if (!C0222ax.m328a(this.f760a.f745l, this.f760a.f746m, false)) {
                this.f760a.f742i = this;
                this.f760a.f743j = this.f763d;
            } else {
                this.f763d.mo3234a(this);
            }
            this.f763d = null;
            this.f760a.mo3281e(false);
            this.f760a.f738e.mo3915d();
            this.f760a.f737d.mo4373a().sendAccessibilityEvent(32);
            this.f760a.f735b.mo3933b(this.f760a.f748o);
            this.f760a.f741h = null;
        }
    }

    /* renamed from: d */
    public final void mo3294d() {
        if (this.f760a.f741h == this) {
            this.f762c.mo3609h();
            try {
                this.f763d.mo3237b(this, this.f762c);
            } finally {
                this.f762c.mo3611i();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo3295e() {
        this.f762c.mo3609h();
        try {
            return this.f763d.mo3235a((C0271b) this, (Menu) this.f762c);
        } finally {
            this.f762c.mo3611i();
        }
    }

    /* renamed from: f */
    public final CharSequence mo3296f() {
        return this.f760a.f738e.mo3912b();
    }

    /* renamed from: g */
    public final CharSequence mo3297g() {
        return this.f760a.f738e.mo3914c();
    }

    /* renamed from: h */
    public final boolean mo3298h() {
        return this.f760a.f738e.mo3917f();
    }

    /* renamed from: i */
    public final View mo3299i() {
        if (this.f764e != null) {
            return (View) this.f764e.get();
        }
        return null;
    }
}
