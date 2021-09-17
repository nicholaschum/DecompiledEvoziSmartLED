package android.support.p010v7.app;

import android.support.p010v7.view.C0322n;
import android.view.Menu;
import android.view.View;
import android.view.Window;

/* renamed from: android.support.v7.app.at */
final class C0218at extends C0322n {

    /* renamed from: a */
    final /* synthetic */ C0213ao f708a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0218at(C0213ao aoVar, Window.Callback callback) {
        super(callback);
        this.f708a = aoVar;
    }

    public final View onCreatePanelView(int i) {
        return i == 0 ? new View(this.f708a.f695a.mo4381b()) : super.onCreatePanelView(i);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (onPreparePanel && !this.f708a.f696b) {
            this.f708a.f695a.mo4393l();
            this.f708a.f696b = true;
        }
        return onPreparePanel;
    }
}
