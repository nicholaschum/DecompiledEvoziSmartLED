package android.support.p010v7.app;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: android.support.v7.app.n */
final class C0239n extends ArrayAdapter<CharSequence> {
    public C0239n(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, 16908308, charSequenceArr);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final boolean hasStableIds() {
        return true;
    }
}
