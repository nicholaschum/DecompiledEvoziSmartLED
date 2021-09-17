package android.support.p010v7.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p007v4.content.ContextCompat;
import android.support.p007v4.widget.ResourceCursorAdapter;
import android.support.p010v7.p011a.C0193g;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.cv */
final class C0399cv extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: a */
    private final SearchView f1786a;

    /* renamed from: b */
    private final SearchableInfo f1787b;

    /* renamed from: c */
    private final Context f1788c;

    /* renamed from: d */
    private final WeakHashMap<String, Drawable.ConstantState> f1789d;

    /* renamed from: e */
    private final int f1790e;

    /* renamed from: f */
    private boolean f1791f;

    /* renamed from: g */
    private int f1792g;

    /* renamed from: h */
    private ColorStateList f1793h;

    /* renamed from: i */
    private int f1794i;

    /* renamed from: j */
    private int f1795j;

    /* renamed from: k */
    private int f1796k;

    /* renamed from: l */
    private int f1797l;

    /* renamed from: m */
    private int f1798m;

    /* renamed from: n */
    private int f1799n;

    /* renamed from: a */
    private Drawable m1290a(ComponentName componentName) {
        String str;
        String nameNotFoundException;
        PackageManager packageManager = this.mContext.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            str = "SuggestionsAdapter";
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w(str, nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            str = "SuggestionsAdapter";
            nameNotFoundException = e.toString();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1291a(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x006d }
            if (r1 == 0) goto L_0x0022
            android.graphics.drawable.Drawable r1 = r6.m1299b((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0012 }
            return r1
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r2 = "Resource does not exist: "
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ FileNotFoundException -> 0x006d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x006d }
            throw r1     // Catch:{ FileNotFoundException -> 0x006d }
        L_0x0022:
            android.content.Context r1 = r6.f1788c     // Catch:{ FileNotFoundException -> 0x006d }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x006d }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x006d }
            if (r1 == 0) goto L_0x005d
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0047 }
            r1.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0046
        L_0x0036:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r4 = "Error closing icon stream for "
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ FileNotFoundException -> 0x006d }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x006d }
        L_0x0046:
            return r2
        L_0x0047:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x005c
        L_0x004c:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.String r4 = "Error closing icon stream for "
            java.lang.String r5 = java.lang.String.valueOf(r7)     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r4 = r4.concat(r5)     // Catch:{ FileNotFoundException -> 0x006d }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x006d }
        L_0x005c:
            throw r2     // Catch:{ FileNotFoundException -> 0x006d }
        L_0x005d:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r2 = "Failed to open "
            java.lang.String r3 = java.lang.String.valueOf(r7)     // Catch:{ FileNotFoundException -> 0x006d }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ FileNotFoundException -> 0x006d }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x006d }
            throw r1     // Catch:{ FileNotFoundException -> 0x006d }
        L_0x006d:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Icon not found: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0399cv.m1291a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private Drawable m1292a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1788c.getPackageName() + "/" + parseInt;
            Drawable b = m1300b(str2);
            if (b != null) {
                return b;
            }
            Drawable drawable = ContextCompat.getDrawable(this.f1788c, parseInt);
            m1298a(str2, drawable);
            return drawable;
        } catch (NumberFormatException unused) {
            Drawable b2 = m1300b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a = m1291a(Uri.parse(str));
            m1298a(str, a);
            return a;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(String.valueOf(str)));
            return null;
        }
    }

    /* renamed from: a */
    private static String m1293a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m1294a(Cursor cursor, String str) {
        return m1293a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static void m1295a(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    private static void m1296a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private static void m1297a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m1298a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1789d.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m1299b(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.mContext.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: ".concat(String.valueOf(uri)));
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: ".concat(String.valueOf(uri)));
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: ".concat(String.valueOf(uri)));
                }
                throw new FileNotFoundException("No path: ".concat(String.valueOf(uri)));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: ".concat(String.valueOf(uri)));
            }
        } else {
            throw new FileNotFoundException("No authority: ".concat(String.valueOf(uri)));
        }
    }

    /* renamed from: b */
    private Drawable m1300b(String str) {
        Drawable.ConstantState constantState = this.f1789d.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            java.lang.Object r2 = r18.getTag()
            android.support.v7.widget.cw r2 = (android.support.p010v7.widget.C0400cw) r2
            int r3 = r0.f1799n
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L_0x0017
            int r3 = r0.f1799n
            int r3 = r1.getInt(r3)
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            android.widget.TextView r6 = r2.f1800a
            if (r6 == 0) goto L_0x0027
            int r6 = r0.f1794i
            java.lang.String r6 = m1293a((android.database.Cursor) r1, (int) r6)
            android.widget.TextView r7 = r2.f1800a
            m1297a((android.widget.TextView) r7, (java.lang.CharSequence) r6)
        L_0x0027:
            android.widget.TextView r6 = r2.f1801b
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L_0x00a4
            int r6 = r0.f1796k
            java.lang.String r6 = m1293a((android.database.Cursor) r1, (int) r6)
            if (r6 == 0) goto L_0x0076
            android.content.res.ColorStateList r9 = r0.f1793h
            if (r9 != 0) goto L_0x0057
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r0.mContext
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int r11 = android.support.p010v7.p011a.C0188b.textColorSearchUrl
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r0.mContext
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r0.f1793h = r9
        L_0x0057:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r6)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r0.f1793h
            r16 = 0
            r10 = r15
            r4 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r6 = r6.length()
            r10 = 33
            r9.setSpan(r4, r5, r6, r10)
            goto L_0x007c
        L_0x0076:
            int r4 = r0.f1795j
            java.lang.String r9 = m1293a((android.database.Cursor) r1, (int) r4)
        L_0x007c:
            boolean r4 = android.text.TextUtils.isEmpty(r9)
            if (r4 == 0) goto L_0x0091
            android.widget.TextView r4 = r2.f1800a
            if (r4 == 0) goto L_0x009f
            android.widget.TextView r4 = r2.f1800a
            r4.setSingleLine(r5)
            android.widget.TextView r4 = r2.f1800a
            r4.setMaxLines(r7)
            goto L_0x009f
        L_0x0091:
            android.widget.TextView r4 = r2.f1800a
            if (r4 == 0) goto L_0x009f
            android.widget.TextView r4 = r2.f1800a
            r4.setSingleLine(r8)
            android.widget.TextView r4 = r2.f1800a
            r4.setMaxLines(r8)
        L_0x009f:
            android.widget.TextView r4 = r2.f1801b
            m1297a((android.widget.TextView) r4, (java.lang.CharSequence) r9)
        L_0x00a4:
            android.widget.ImageView r4 = r2.f1802c
            r6 = 0
            if (r4 == 0) goto L_0x010a
            android.widget.ImageView r4 = r2.f1802c
            int r9 = r0.f1797l
            r10 = -1
            if (r9 != r10) goto L_0x00b2
            r9 = r6
            goto L_0x0106
        L_0x00b2:
            int r9 = r0.f1797l
            java.lang.String r9 = r1.getString(r9)
            android.graphics.drawable.Drawable r9 = r0.m1292a((java.lang.String) r9)
            if (r9 == 0) goto L_0x00bf
            goto L_0x0106
        L_0x00bf:
            android.app.SearchableInfo r9 = r0.f1787b
            android.content.ComponentName r9 = r9.getSearchActivity()
            java.lang.String r10 = r9.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r11 = r0.f1789d
            boolean r11 = r11.containsKey(r10)
            if (r11 == 0) goto L_0x00e8
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r9 = r0.f1789d
            java.lang.Object r9 = r9.get(r10)
            android.graphics.drawable.Drawable$ConstantState r9 = (android.graphics.drawable.Drawable.ConstantState) r9
            if (r9 != 0) goto L_0x00dd
            r9 = r6
            goto L_0x00f9
        L_0x00dd:
            android.content.Context r10 = r0.f1788c
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.Drawable r9 = r9.newDrawable(r10)
            goto L_0x00f9
        L_0x00e8:
            android.graphics.drawable.Drawable r9 = r0.m1290a((android.content.ComponentName) r9)
            if (r9 != 0) goto L_0x00f0
            r11 = r6
            goto L_0x00f4
        L_0x00f0:
            android.graphics.drawable.Drawable$ConstantState r11 = r9.getConstantState()
        L_0x00f4:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r0.f1789d
            r12.put(r10, r11)
        L_0x00f9:
            if (r9 == 0) goto L_0x00fc
            goto L_0x0106
        L_0x00fc:
            android.content.Context r9 = r0.mContext
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            android.graphics.drawable.Drawable r9 = r9.getDefaultActivityIcon()
        L_0x0106:
            r10 = 4
            m1296a(r4, r9, r10)
        L_0x010a:
            android.widget.ImageView r4 = r2.f1803d
            r9 = 8
            if (r4 == 0) goto L_0x0125
            android.widget.ImageView r4 = r2.f1803d
            int r10 = r0.f1798m
            r11 = -1
            if (r10 != r11) goto L_0x0118
            goto L_0x0122
        L_0x0118:
            int r6 = r0.f1798m
            java.lang.String r1 = r1.getString(r6)
            android.graphics.drawable.Drawable r6 = r0.m1292a((java.lang.String) r1)
        L_0x0122:
            m1296a(r4, r6, r9)
        L_0x0125:
            int r1 = r0.f1792g
            if (r1 == r7) goto L_0x0138
            int r1 = r0.f1792g
            if (r1 != r8) goto L_0x0132
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0132
            goto L_0x0138
        L_0x0132:
            android.widget.ImageView r1 = r2.f1804e
            r1.setVisibility(r9)
            return
        L_0x0138:
            android.widget.ImageView r1 = r2.f1804e
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r2.f1804e
            android.widget.TextView r3 = r2.f1800a
            java.lang.CharSequence r3 = r3.getText()
            r1.setTag(r3)
            android.widget.ImageView r1 = r2.f1804e
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0399cv.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public final void changeCursor(Cursor cursor) {
        if (this.f1791f) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f1794i = cursor.getColumnIndex("suggest_text_1");
                this.f1795j = cursor.getColumnIndex("suggest_text_2");
                this.f1796k = cursor.getColumnIndex("suggest_text_2_url");
                this.f1797l = cursor.getColumnIndex("suggest_icon_1");
                this.f1798m = cursor.getColumnIndex("suggest_icon_2");
                this.f1799n = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final CharSequence convertToString(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m1294a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f1787b.shouldRewriteQueryFromData() && (a2 = m1294a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f1787b.shouldRewriteQueryFromText() || (a = m1294a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newDropDownView = newDropDownView(this.mContext, this.mCursor, viewGroup);
            if (newDropDownView != null) {
                ((C0400cw) newDropDownView.getTag()).f1800a.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = newView(this.mContext, this.mCursor, viewGroup);
            if (newView != null) {
                ((C0400cw) newView.getTag()).f1800a.setText(e.toString());
            }
            return newView;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new C0400cw(newView));
        ((ImageView) newView.findViewById(C0193g.edit_query)).setImageResource(this.f1790e);
        return newView;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1295a(getCursor());
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1295a(getCursor());
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1786a.mo4157a((CharSequence) tag);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d A[Catch:{ RuntimeException -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L_0x0005
            java.lang.String r11 = ""
            goto L_0x0009
        L_0x0005:
            java.lang.String r11 = r11.toString()
        L_0x0009:
            android.support.v7.widget.SearchView r0 = r10.f1786a
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L_0x0089
            android.support.v7.widget.SearchView r0 = r10.f1786a
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L_0x001c
            goto L_0x0089
        L_0x001c:
            android.app.SearchableInfo r0 = r10.f1787b     // Catch:{ RuntimeException -> 0x0081 }
            if (r0 != 0) goto L_0x0022
        L_0x0020:
            r11 = r1
            goto L_0x007b
        L_0x0022:
            java.lang.String r2 = r0.getSuggestAuthority()     // Catch:{ RuntimeException -> 0x0081 }
            if (r2 != 0) goto L_0x0029
            goto L_0x0020
        L_0x0029:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch:{ RuntimeException -> 0x0081 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r4 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r4)     // Catch:{ RuntimeException -> 0x0081 }
            android.net.Uri$Builder r2 = r3.authority(r2)     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.query(r3)     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.fragment(r3)     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r3 = r0.getSuggestPath()     // Catch:{ RuntimeException -> 0x0081 }
            if (r3 == 0) goto L_0x004d
            r2.appendEncodedPath(r3)     // Catch:{ RuntimeException -> 0x0081 }
        L_0x004d:
            java.lang.String r3 = "search_suggest_query"
            r2.appendPath(r3)     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r7 = r0.getSuggestSelection()     // Catch:{ RuntimeException -> 0x0081 }
            if (r7 == 0) goto L_0x0060
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ RuntimeException -> 0x0081 }
            r3 = 0
            r0[r3] = r11     // Catch:{ RuntimeException -> 0x0081 }
            r8 = r0
            goto L_0x0064
        L_0x0060:
            r2.appendPath(r11)     // Catch:{ RuntimeException -> 0x0081 }
            r8 = r1
        L_0x0064:
            java.lang.String r11 = "limit"
            java.lang.String r0 = "50"
            r2.appendQueryParameter(r11, r0)     // Catch:{ RuntimeException -> 0x0081 }
            android.net.Uri r5 = r2.build()     // Catch:{ RuntimeException -> 0x0081 }
            android.content.Context r11 = r10.mContext     // Catch:{ RuntimeException -> 0x0081 }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ RuntimeException -> 0x0081 }
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ RuntimeException -> 0x0081 }
        L_0x007b:
            if (r11 == 0) goto L_0x0089
            r11.getCount()     // Catch:{ RuntimeException -> 0x0081 }
            return r11
        L_0x0081:
            r11 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r11)
        L_0x0089:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0399cv.runQueryOnBackgroundThread(java.lang.CharSequence):android.database.Cursor");
    }
}
