package android.support.p010v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.view.menu.C0287ad;
import android.support.p010v7.view.menu.C0310o;
import android.support.p010v7.view.menu.MenuBuilder;
import android.support.p010v7.widget.C0354bd;
import android.support.p010v7.widget.C0412dh;
import android.support.p010v7.widget.C0414dj;
import android.support.p010v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.ao */
final class C0213ao extends ActionBar {

    /* renamed from: a */
    C0354bd f695a;

    /* renamed from: b */
    boolean f696b;

    /* renamed from: c */
    Window.Callback f697c;

    /* renamed from: d */
    private boolean f698d;

    /* renamed from: e */
    private boolean f699e;

    /* renamed from: f */
    private ArrayList<Object> f700f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f701g = new C0214ap(this);

    /* renamed from: h */
    private final C0412dh f702h = new C0215aq(this);

    C0213ao(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f695a = new C0414dj(toolbar, false);
        this.f697c = new C0218at(this, callback);
        this.f695a.mo4378a(this.f697c);
        toolbar.mo4214a(this.f702h);
        this.f695a.mo4379a(charSequence);
    }

    /* renamed from: j */
    private Menu m299j() {
        if (!this.f698d) {
            this.f695a.mo4375a((C0287ad) new C0216ar(this), (C0310o) new C0217as(this));
            this.f698d = true;
        }
        return this.f695a.mo4397p();
    }

    /* renamed from: a */
    public final int mo3112a() {
        return this.f695a.mo4395n();
    }

    /* renamed from: a */
    public final void mo3114a(float f) {
        ViewCompat.setElevation(this.f695a.mo4373a(), f);
    }

    /* renamed from: a */
    public final void mo3115a(int i) {
        this.f695a.mo4382b(i);
    }

    /* renamed from: a */
    public final void mo3116a(Configuration configuration) {
        super.mo3116a(configuration);
    }

    /* renamed from: a */
    public final void mo3117a(CharSequence charSequence) {
        this.f695a.mo4379a(charSequence);
    }

    /* renamed from: a */
    public final void mo3118a(boolean z) {
    }

    /* renamed from: a */
    public final boolean mo3119a(int i, KeyEvent keyEvent) {
        Menu j = m299j();
        if (j == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        j.setQwertyMode(z);
        return j.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final boolean mo3120a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo3125d();
        }
        return true;
    }

    /* renamed from: b */
    public final Context mo3121b() {
        return this.f695a.mo4381b();
    }

    /* renamed from: b */
    public final void mo3122b(boolean z) {
    }

    /* renamed from: c */
    public final void mo3124c(boolean z) {
        if (z != this.f699e) {
            this.f699e = z;
            int size = this.f700f.size();
            for (int i = 0; i < size; i++) {
                this.f700f.get(i);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo3125d() {
        return this.f695a.mo4391j();
    }

    /* renamed from: e */
    public final boolean mo3126e() {
        return this.f695a.mo4392k();
    }

    /* renamed from: f */
    public final boolean mo3127f() {
        this.f695a.mo4373a().removeCallbacks(this.f701g);
        ViewCompat.postOnAnimation(this.f695a.mo4373a(), this.f701g);
        return true;
    }

    /* renamed from: g */
    public final boolean mo3128g() {
        if (!this.f695a.mo4384c()) {
            return false;
        }
        this.f695a.mo4385d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo3129h() {
        this.f695a.mo4373a().removeCallbacks(this.f701g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo3273i() {
        Menu j = m299j();
        MenuBuilder menuBuilder = j instanceof MenuBuilder ? (MenuBuilder) j : null;
        if (menuBuilder != null) {
            menuBuilder.mo3609h();
        }
        try {
            j.clear();
            if (!this.f697c.onCreatePanelMenu(0, j) || !this.f697c.onPreparePanel(0, (View) null, j)) {
                j.clear();
            }
        } finally {
            if (menuBuilder != null) {
                menuBuilder.mo3611i();
            }
        }
    }
}
