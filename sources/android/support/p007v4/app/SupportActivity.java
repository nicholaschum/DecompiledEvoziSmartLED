package android.support.p007v4.app;

import android.app.Activity;
import android.arch.lifecycle.C0020f;
import android.arch.lifecycle.C0022h;
import android.arch.lifecycle.C0024j;
import android.arch.lifecycle.C0025k;
import android.arch.lifecycle.ReportFragment;
import android.os.Bundle;
import android.support.p007v4.util.SimpleArrayMap;
import android.support.p007v4.view.KeyEventDispatcher;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.app.SupportActivity */
public class SupportActivity extends Activity implements C0024j, KeyEventDispatcher.Component {
    private SimpleArrayMap<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new SimpleArrayMap<>();
    private C0025k mLifecycleRegistry = new C0025k(this);

    /* renamed from: android.support.v4.app.SupportActivity$ExtraData */
    public class ExtraData {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return KeyEventDispatcher.dispatchKeyEvent(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !KeyEventDispatcher.dispatchBeforeHierarchy(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public <T extends ExtraData> T getExtraData(Class<T> cls) {
        return (ExtraData) this.mExtraDataMap.get(cls);
    }

    public C0020f getLifecycle() {
        return this.mLifecycleRegistry;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m43a((Activity) this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo70a(C0022h.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(ExtraData extraData) {
        this.mExtraDataMap.put(extraData.getClass(), extraData);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
