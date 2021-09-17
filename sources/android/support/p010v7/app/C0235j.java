package android.support.p010v7.app;

import android.content.Context;
import android.database.Cursor;
import android.support.p010v7.app.AlertController;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* renamed from: android.support.v7.app.j */
final class C0235j extends CursorAdapter {

    /* renamed from: a */
    final /* synthetic */ AlertController.RecycleListView f821a;

    /* renamed from: b */
    final /* synthetic */ AlertController f822b;

    /* renamed from: c */
    final /* synthetic */ C0233h f823c;

    /* renamed from: d */
    private final int f824d;

    /* renamed from: e */
    private final int f825e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0235j(C0233h hVar, Context context, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, false);
        this.f823c = hVar;
        this.f821a = recycleListView;
        this.f822b = alertController;
        Cursor cursor2 = getCursor();
        this.f824d = cursor2.getColumnIndexOrThrow(this.f823c.f789L);
        this.f825e = cursor2.getColumnIndexOrThrow(this.f823c.f790M);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f824d));
        AlertController.RecycleListView recycleListView = this.f821a;
        int position = cursor.getPosition();
        boolean z = true;
        if (cursor.getInt(this.f825e) != 1) {
            z = false;
        }
        recycleListView.setItemChecked(position, z);
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f823c.f794b.inflate(this.f822b.f577m, viewGroup, false);
    }
}
