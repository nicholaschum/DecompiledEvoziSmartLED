package android.support.p010v7.widget;

import android.content.Intent;
import android.view.MenuItem;

/* renamed from: android.support.v7.widget.cu */
final class C0398cu implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ ShareActionProvider f1785a;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Intent b = C0439s.m1407a(this.f1785a.f1511a, this.f1785a.f1512b).mo4590b(menuItem.getItemId());
        if (b == null) {
            return true;
        }
        String action = b.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
            ShareActionProvider.m1008a(b);
        }
        this.f1785a.f1511a.startActivity(b);
        return true;
    }
}
