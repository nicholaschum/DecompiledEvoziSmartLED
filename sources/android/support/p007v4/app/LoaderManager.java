package android.support.p007v4.app;

import android.arch.lifecycle.C0015ab;
import android.arch.lifecycle.C0024j;
import android.os.Bundle;
import android.support.p007v4.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.LoaderManager */
public abstract class LoaderManager {

    /* renamed from: android.support.v4.app.LoaderManager$LoaderCallbacks */
    public interface LoaderCallbacks<D> {
        Loader<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(Loader<D> loader, D d);

        void onLoaderReset(Loader<D> loader);
    }

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public static <T extends C0024j & C0015ab> LoaderManager getInstance(T t) {
        return new LoaderManagerImpl(t, ((C0015ab) t).getViewModelStore());
    }

    public abstract void destroyLoader(int i);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> Loader<D> getLoader(int i);

    public boolean hasRunningLoaders() {
        return false;
    }

    public abstract <D> Loader<D> initLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);

    public abstract void markForRedelivery();

    public abstract <D> Loader<D> restartLoader(int i, Bundle bundle, LoaderCallbacks<D> loaderCallbacks);
}
