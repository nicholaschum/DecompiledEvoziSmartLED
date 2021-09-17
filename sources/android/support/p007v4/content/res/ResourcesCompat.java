package android.support.p007v4.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.p007v4.util.Preconditions;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.res.ResourcesCompat */
public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    /* renamed from: android.support.v4.content.res.ResourcesCompat$FontCallback */
    public abstract class FontCallback {
        public final void callbackFailAsync(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(i);
                }
            });
        }

        public final void callbackSuccessAsync(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() {
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(Typeface typeface);
    }

    private ResourcesCompat() {
    }

    public static int getColor(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColor(i, theme) : resources.getColor(i);
    }

    public static ColorStateList getColorStateList(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? resources.getColorStateList(i, theme) : resources.getColorStateList(i);
    }

    public static Drawable getDrawable(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawableForDensity(i, i2, theme) : Build.VERSION.SDK_INT >= 15 ? resources.getDrawableForDensity(i, i2) : resources.getDrawable(i);
    }

    public static Typeface getFont(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, new TypedValue(), 0, (FontCallback) null, (Handler) null, false);
    }

    public static Typeface getFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, i, typedValue, i2, fontCallback, (Handler) null, true);
    }

    public static void getFont(Context context, int i, FontCallback fontCallback, Handler handler) {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
            return;
        }
        loadFont(context, i, new TypedValue(), 0, fontCallback, handler, false);
    }

    private static Typeface loadFont(Context context, int i, TypedValue typedValue, int i2, FontCallback fontCallback, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface loadFont = loadFont(context, resources, typedValue, i, i2, fontCallback, handler, z);
        if (loadFont != null || fontCallback != null) {
            return loadFont;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface loadFont(android.content.Context r14, android.content.res.Resources r15, android.util.TypedValue r16, int r17, int r18, android.support.p007v4.content.res.ResourcesCompat.FontCallback r19, android.os.Handler r20, boolean r21) {
        /*
            r0 = r15
            r1 = r16
            r4 = r17
            r5 = r18
            r9 = r19
            r10 = r20
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto L_0x0092
            java.lang.CharSequence r1 = r1.string
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r11.startsWith(r1)
            r12 = 0
            r13 = -3
            if (r1 != 0) goto L_0x0025
            if (r9 == 0) goto L_0x0024
            r9.callbackFailAsync(r13, r10)
        L_0x0024:
            return r12
        L_0x0025:
            android.graphics.Typeface r1 = android.support.p007v4.graphics.TypefaceCompat.findFromCache(r15, r4, r5)
            if (r1 == 0) goto L_0x0031
            if (r9 == 0) goto L_0x0030
            r9.callbackSuccessAsync(r1, r10)
        L_0x0030:
            return r1
        L_0x0031:
            java.lang.String r1 = r11.toLowerCase()     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            if (r1 == 0) goto L_0x0065
            android.content.res.XmlResourceParser r1 = r15.getXml(r4)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry r2 = android.support.p007v4.content.res.FontResourcesParserCompat.parse(r1, r15)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            if (r2 != 0) goto L_0x0054
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to find font-family tag"
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0053
            r9.callbackFailAsync(r13, r10)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
        L_0x0053:
            return r12
        L_0x0054:
            r1 = r14
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            android.graphics.Typeface r0 = android.support.p007v4.graphics.TypefaceCompat.createFromResourcesFamilyXml(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            return r0
        L_0x0065:
            r1 = r14
            android.graphics.Typeface r0 = android.support.p007v4.graphics.TypefaceCompat.createFromResourcesFontFile(r14, r15, r4, r11, r5)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            if (r9 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0072
            r9.callbackSuccessAsync(r0, r10)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
            goto L_0x0075
        L_0x0072:
            r9.callbackFailAsync(r13, r10)     // Catch:{ XmlPullParserException -> 0x007c, IOException -> 0x0076 }
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0081
        L_0x007c:
            r0 = move-exception
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0081:
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r2 = r2.concat(r3)
            android.util.Log.e(r1, r2, r0)
            if (r9 == 0) goto L_0x0091
            r9.callbackFailAsync(r13, r10)
        L_0x0091:
            return r12
        L_0x0092:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource \""
            r3.<init>(r5)
            java.lang.String r0 = r15.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r17)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.content.res.ResourcesCompat.loadFont(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, android.support.v4.content.res.ResourcesCompat$FontCallback, android.os.Handler, boolean):android.graphics.Typeface");
    }
}
