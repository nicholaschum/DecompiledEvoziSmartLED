package android.support.p007v4.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.p007v4.content.res.FontResourcesParserCompat;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: android.support.v4.graphics.TypefaceCompatApi26Impl */
public class TypefaceCompatApi26Impl extends TypefaceCompatApi21Impl {
    private static final String ABORT_CREATION_METHOD = "abortCreation";
    private static final String ADD_FONT_FROM_ASSET_MANAGER_METHOD = "addFontFromAssetManager";
    private static final String ADD_FONT_FROM_BUFFER_METHOD = "addFontFromBuffer";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String DEFAULT_FAMILY = "sans-serif";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String FREEZE_METHOD = "freeze";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final String TAG = "TypefaceCompatApi26Impl";
    protected final Method mAbortCreation;
    protected final Method mAddFontFromAssetManager;
    protected final Method mAddFontFromBuffer;
    protected final Method mCreateFromFamiliesWithDefault;
    protected final Class mFontFamily;
    protected final Constructor mFontFamilyCtor;
    protected final Method mFreeze;

    public TypefaceCompatApi26Impl() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls = null;
        try {
            Class obtainFontFamily = obtainFontFamily();
            constructor = obtainFontFamilyCtor(obtainFontFamily);
            method5 = obtainAddFontFromAssetManagerMethod(obtainFontFamily);
            method4 = obtainAddFontFromBufferMethod(obtainFontFamily);
            method3 = obtainFreezeMethod(obtainFontFamily);
            method2 = obtainAbortCreationMethod(obtainFontFamily);
            method = obtainCreateFromFamiliesWithDefaultMethod(obtainFontFamily);
            cls = obtainFontFamily;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e(TAG, "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.mFontFamily = cls;
        this.mFontFamilyCtor = constructor;
        this.mAddFontFromAssetManager = method5;
        this.mAddFontFromBuffer = method4;
        this.mFreeze = method3;
        this.mAbortCreation = method2;
        this.mCreateFromFamiliesWithDefault = method;
    }

    private void abortCreation(Object obj) {
        try {
            this.mAbortCreation.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean addFontFromAssetManager(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.mAddFontFromAssetManager.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean addFontFromBuffer(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.mAddFontFromBuffer.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean freeze(Object obj) {
        try {
            return ((Boolean) this.mFreeze.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean isFontFamilyPrivateAPIAvailable() {
        if (this.mAddFontFromAssetManager == null) {
            Log.w(TAG, "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.mAddFontFromAssetManager != null;
    }

    private Object newFamily() {
        try {
            return this.mFontFamilyCtor.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    public Typeface createFromFamiliesWithDefault(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.mFontFamily, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.mCreateFromFamiliesWithDefault.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        if (!isFontFamilyPrivateAPIAvailable()) {
            return super.createFromFontFamilyFilesResourceEntry(context, fontFamilyFilesResourceEntry, resources, i);
        }
        Object newFamily = newFamily();
        for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
            if (!addFontFromAssetManager(context, newFamily, fontFileResourceEntry.getFileName(), fontFileResourceEntry.getTtcIndex(), fontFileResourceEntry.getWeight(), fontFileResourceEntry.isItalic() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(fontFileResourceEntry.getVariationSettings()))) {
                abortCreation(newFamily);
                return null;
            }
        }
        if (!freeze(newFamily)) {
            return null;
        }
        return createFromFamiliesWithDefault(newFamily);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r9 = r13;
        r13 = r12;
        r12 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface createFromFontInfo(android.content.Context r11, android.os.CancellationSignal r12, android.support.p007v4.provider.FontsContractCompat.FontInfo[] r13, int r14) {
        /*
            r10 = this;
            int r0 = r13.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            boolean r0 = r10.isFontFamilyPrivateAPIAvailable()
            if (r0 != 0) goto L_0x0063
            android.support.v4.provider.FontsContractCompat$FontInfo r13 = r10.findBestInfo(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.getUri()     // Catch:{ IOException -> 0x0062 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch:{ IOException -> 0x0062 }
            if (r11 != 0) goto L_0x0025
            if (r11 == 0) goto L_0x0024
            r11.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0024:
            return r1
        L_0x0025:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            r12.<init>(r14)     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            int r14 = r13.getWeight()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            boolean r13 = r13.isItalic()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            android.graphics.Typeface r12 = r12.build()     // Catch:{ Throwable -> 0x004b, all -> 0x0048 }
            if (r11 == 0) goto L_0x0047
            r11.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0047:
            return r12
        L_0x0048:
            r12 = move-exception
            r13 = r1
            goto L_0x0051
        L_0x004b:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x004d }
        L_0x004d:
            r13 = move-exception
            r9 = r13
            r13 = r12
            r12 = r9
        L_0x0051:
            if (r11 == 0) goto L_0x0061
            if (r13 == 0) goto L_0x005e
            r11.close()     // Catch:{ Throwable -> 0x0059 }
            goto L_0x0061
        L_0x0059:
            r11 = move-exception
            r13.addSuppressed(r11)     // Catch:{ IOException -> 0x0062 }
            goto L_0x0061
        L_0x005e:
            r11.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0061:
            throw r12     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            return r1
        L_0x0063:
            java.util.Map r11 = android.support.p007v4.provider.FontsContractCompat.prepareFontData(r11, r13, r12)
            java.lang.Object r12 = r10.newFamily()
            int r0 = r13.length
            r2 = 0
            r8 = 0
        L_0x006e:
            if (r8 >= r0) goto L_0x009a
            r3 = r13[r8]
            android.net.Uri r4 = r3.getUri()
            java.lang.Object r4 = r11.get(r4)
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            if (r4 == 0) goto L_0x0097
            int r5 = r3.getTtcIndex()
            int r6 = r3.getWeight()
            boolean r7 = r3.isItalic()
            r2 = r10
            r3 = r12
            boolean r2 = r2.addFontFromBuffer(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x0096
            r10.abortCreation(r12)
            return r1
        L_0x0096:
            r2 = 1
        L_0x0097:
            int r8 = r8 + 1
            goto L_0x006e
        L_0x009a:
            if (r2 != 0) goto L_0x00a0
            r10.abortCreation(r12)
            return r1
        L_0x00a0:
            boolean r11 = r10.freeze(r12)
            if (r11 != 0) goto L_0x00a7
            return r1
        L_0x00a7:
            android.graphics.Typeface r11 = r10.createFromFamiliesWithDefault(r12)
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.graphics.TypefaceCompatApi26Impl.createFromFontInfo(android.content.Context, android.os.CancellationSignal, android.support.v4.provider.FontsContractCompat$FontInfo[], int):android.graphics.Typeface");
    }

    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        if (!isFontFamilyPrivateAPIAvailable()) {
            return super.createFromResourcesFontFile(context, resources, i, str, i2);
        }
        Object newFamily = newFamily();
        if (!addFontFromAssetManager(context, newFamily, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            abortCreation(newFamily);
            return null;
        } else if (!freeze(newFamily)) {
            return null;
        } else {
            return createFromFamiliesWithDefault(newFamily);
        }
    }

    /* access modifiers changed from: protected */
    public Method obtainAbortCreationMethod(Class cls) {
        return cls.getMethod(ABORT_CREATION_METHOD, new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method obtainAddFontFromAssetManagerMethod(Class cls) {
        return cls.getMethod(ADD_FONT_FROM_ASSET_MANAGER_METHOD, new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    public Method obtainAddFontFromBufferMethod(Class cls) {
        return cls.getMethod(ADD_FONT_FROM_BUFFER_METHOD, new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
    }

    /* access modifiers changed from: protected */
    public Method obtainCreateFromFamiliesWithDefaultMethod(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public Class obtainFontFamily() {
        return Class.forName(FONT_FAMILY_CLASS);
    }

    /* access modifiers changed from: protected */
    public Constructor obtainFontFamilyCtor(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* access modifiers changed from: protected */
    public Method obtainFreezeMethod(Class cls) {
        return cls.getMethod(FREEZE_METHOD, new Class[0]);
    }
}
