package android.support.p010v7.view.menu;

import android.content.Context;
import android.support.p007v4.view.ActionProvider;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.y */
final class C0320y extends C0315t implements ActionProvider.VisibilityListener {

    /* renamed from: c */
    ActionProvider.VisibilityListener f1232c;

    /* renamed from: d */
    final /* synthetic */ C0319x f1233d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0320y(C0319x xVar, Context context, android.view.ActionProvider actionProvider) {
        super(xVar, context, actionProvider);
        this.f1233d = xVar;
    }

    public final boolean isVisible() {
        return this.f1227a.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        if (this.f1232c != null) {
            this.f1232c.onActionProviderVisibilityChanged(z);
        }
    }

    public final View onCreateActionView(MenuItem menuItem) {
        return this.f1227a.onCreateActionView(menuItem);
    }

    public final boolean overridesItemVisibility() {
        return this.f1227a.overridesItemVisibility();
    }

    public final void refreshVisibility() {
        this.f1227a.refreshVisibility();
    }

    public final void setVisibilityListener(ActionProvider.VisibilityListener visibilityListener) {
        this.f1232c = visibilityListener;
        this.f1227a.setVisibilityListener(visibilityListener != null ? this : null);
    }
}
