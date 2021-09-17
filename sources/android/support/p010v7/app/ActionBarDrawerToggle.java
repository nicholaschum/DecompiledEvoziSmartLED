package android.support.p010v7.app;

import android.support.p007v4.widget.DrawerLayout;
import android.support.p010v7.p014c.p015a.C0266m;
import android.view.View;

/* renamed from: android.support.v7.app.ActionBarDrawerToggle */
public class ActionBarDrawerToggle implements DrawerLayout.DrawerListener {

    /* renamed from: a */
    boolean f540a;

    /* renamed from: b */
    private final C0225b f541b;

    /* renamed from: c */
    private C0266m f542c;

    /* renamed from: d */
    private boolean f543d;

    /* renamed from: e */
    private final int f544e;

    /* renamed from: f */
    private final int f545f;

    /* renamed from: a */
    private void m186a(float f) {
        C0266m mVar;
        boolean z;
        if (f == 1.0f) {
            mVar = this.f542c;
            z = true;
        } else {
            if (f == 0.0f) {
                mVar = this.f542c;
                z = false;
            }
            this.f542c.mo3447a(f);
        }
        mVar.mo3448a(z);
        this.f542c.mo3447a(f);
    }

    /* renamed from: a */
    private void m187a(int i) {
        this.f541b.mo3231a(i);
    }

    public void onDrawerClosed(View view) {
        m186a(0.0f);
        if (this.f540a) {
            m187a(this.f544e);
        }
    }

    public void onDrawerOpened(View view) {
        m186a(1.0f);
        if (this.f540a) {
            m187a(this.f545f);
        }
    }

    public void onDrawerSlide(View view, float f) {
        if (this.f543d) {
            m186a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m186a(0.0f);
        }
    }

    public void onDrawerStateChanged(int i) {
    }
}
