package android.support.p010v7.app;

import android.content.res.Resources;
import java.lang.Thread;

/* renamed from: android.support.v7.app.s */
final class C0244s implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ Thread.UncaughtExceptionHandler f836a;

    C0244s(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f836a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String message;
        boolean z = false;
        if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
            z = true;
        }
        if (z) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f836a.uncaughtException(thread, notFoundException);
            return;
        }
        this.f836a.uncaughtException(thread, th);
    }
}
