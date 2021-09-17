package android.support.p010v7.view;

import android.content.Context;
import android.support.p007v4.internal.view.SupportMenu;
import android.support.p010v7.view.menu.C0290ag;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* renamed from: android.support.v7.view.g */
public final class C0276g extends ActionMode {

    /* renamed from: a */
    final Context f947a;

    /* renamed from: b */
    final C0271b f948b;

    public C0276g(Context context, C0271b bVar) {
        this.f947a = context;
        this.f948b = bVar;
    }

    public final void finish() {
        this.f948b.mo3293c();
    }

    public final View getCustomView() {
        return this.f948b.mo3299i();
    }

    public final Menu getMenu() {
        return C0290ag.m689a(this.f947a, (SupportMenu) this.f948b.mo3290b());
    }

    public final MenuInflater getMenuInflater() {
        return this.f948b.mo3285a();
    }

    public final CharSequence getSubtitle() {
        return this.f948b.mo3297g();
    }

    public final Object getTag() {
        return this.f948b.mo3466j();
    }

    public final CharSequence getTitle() {
        return this.f948b.mo3296f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f948b.mo3467k();
    }

    public final void invalidate() {
        this.f948b.mo3294d();
    }

    public final boolean isTitleOptional() {
        return this.f948b.mo3298h();
    }

    public final void setCustomView(View view) {
        this.f948b.mo3287a(view);
    }

    public final void setSubtitle(int i) {
        this.f948b.mo3291b(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f948b.mo3288a(charSequence);
    }

    public final void setTag(Object obj) {
        this.f948b.mo3465a(obj);
    }

    public final void setTitle(int i) {
        this.f948b.mo3286a(i);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f948b.mo3292b(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f948b.mo3289a(z);
    }
}
