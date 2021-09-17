package android.support.p007v4.p009os;

import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: android.support.v4.os.LocaleListHelper */
final class LocaleListHelper {
    private static final Locale EN_LATN = LocaleHelper.forLanguageTag("en-Latn");
    private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
    private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
    private static final int NUM_PSEUDO_LOCALES = 2;
    private static final String STRING_AR_XB = "ar-XB";
    private static final String STRING_EN_XA = "en-XA";
    private static LocaleListHelper sDefaultAdjustedLocaleList = null;
    private static LocaleListHelper sDefaultLocaleList = null;
    private static final Locale[] sEmptyList = new Locale[0];
    private static final LocaleListHelper sEmptyLocaleList = new LocaleListHelper(new Locale[0]);
    private static Locale sLastDefaultLocale = null;
    private static LocaleListHelper sLastExplicitlySetLocaleList = null;
    private static final Object sLock = new Object();
    private final Locale[] mList;
    private final String mStringRepresentation;

    LocaleListHelper(Locale locale, LocaleListHelper localeListHelper) {
        if (locale != null) {
            int length = localeListHelper == null ? 0 : localeListHelper.mList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (locale.equals(localeListHelper.mList[i])) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = (i == -1 ? 1 : 0) + length;
            Locale[] localeArr = new Locale[i2];
            localeArr[0] = (Locale) locale.clone();
            if (i == -1) {
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i3 + 1;
                    localeArr[i4] = (Locale) localeListHelper.mList[i3].clone();
                    i3 = i4;
                }
            } else {
                int i5 = 0;
                while (i5 < i) {
                    int i6 = i5 + 1;
                    localeArr[i6] = (Locale) localeListHelper.mList[i5].clone();
                    i5 = i6;
                }
                for (int i7 = i + 1; i7 < length; i7++) {
                    localeArr[i7] = (Locale) localeListHelper.mList[i7].clone();
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i8 = 0; i8 < i2; i8++) {
                sb.append(LocaleHelper.toLanguageTag(localeArr[i8]));
                if (i8 < i2 - 1) {
                    sb.append(',');
                }
            }
            this.mList = localeArr;
            this.mStringRepresentation = sb.toString();
            return;
        }
        throw new NullPointerException("topLocale is null");
    }

    LocaleListHelper(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            sb = "";
        } else {
            Locale[] localeArr2 = new Locale[localeArr.length];
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            while (i < localeArr.length) {
                Locale locale = localeArr[i];
                if (locale == null) {
                    throw new NullPointerException("list[" + i + "] is null");
                } else if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    localeArr2[i] = locale2;
                    sb2.append(LocaleHelper.toLanguageTag(locale2));
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                    i++;
                } else {
                    throw new IllegalArgumentException("list[" + i + "] is a repetition");
                }
            }
            this.mList = localeArr2;
            sb = sb2.toString();
        }
        this.mStringRepresentation = sb;
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z) {
        int computeFirstMatchIndex = computeFirstMatchIndex(collection, z);
        if (computeFirstMatchIndex == -1) {
            return null;
        }
        return this.mList[computeFirstMatchIndex];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r5 < Integer.MAX_VALUE) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r4, boolean r5) {
        /*
            r3 = this;
            java.util.Locale[] r0 = r3.mList
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Locale[] r0 = r3.mList
            int r0 = r0.length
            if (r0 != 0) goto L_0x000f
            r4 = -1
            return r4
        L_0x000f:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == 0) goto L_0x0020
            java.util.Locale r5 = EN_LATN
            int r5 = r3.findFirstMatchIndex(r5)
            if (r5 != 0) goto L_0x001d
            return r1
        L_0x001d:
            if (r5 >= r0) goto L_0x0020
            goto L_0x0023
        L_0x0020:
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x0023:
            java.util.Iterator r4 = r4.iterator()
        L_0x0027:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r4.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r2 = android.support.p007v4.p009os.LocaleHelper.forLanguageTag(r2)
            int r2 = r3.findFirstMatchIndex(r2)
            if (r2 != 0) goto L_0x003e
            return r1
        L_0x003e:
            if (r2 >= r5) goto L_0x0027
            r5 = r2
            goto L_0x0027
        L_0x0042:
            if (r5 != r0) goto L_0x0045
            return r1
        L_0x0045:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.p009os.LocaleListHelper.computeFirstMatchIndex(java.util.Collection, boolean):int");
    }

    private int findFirstMatchIndex(Locale locale) {
        for (int i = 0; i < this.mList.length; i++) {
            if (matchScore(locale, this.mList[i]) > 0) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    static LocaleListHelper forLanguageTags(String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        Locale[] localeArr = new Locale[split.length];
        for (int i = 0; i < localeArr.length; i++) {
            localeArr[i] = LocaleHelper.forLanguageTag(split[i]);
        }
        return new LocaleListHelper(localeArr);
    }

    static LocaleListHelper getAdjustedDefault() {
        LocaleListHelper localeListHelper;
        getDefault();
        synchronized (sLock) {
            localeListHelper = sDefaultAdjustedLocaleList;
        }
        return localeListHelper;
    }

    static LocaleListHelper getDefault() {
        Locale locale = Locale.getDefault();
        synchronized (sLock) {
            if (!locale.equals(sLastDefaultLocale)) {
                sLastDefaultLocale = locale;
                if (sDefaultLocaleList == null || !locale.equals(sDefaultLocaleList.get(0))) {
                    LocaleListHelper localeListHelper = new LocaleListHelper(locale, sLastExplicitlySetLocaleList);
                    sDefaultLocaleList = localeListHelper;
                    sDefaultAdjustedLocaleList = localeListHelper;
                } else {
                    LocaleListHelper localeListHelper2 = sDefaultLocaleList;
                    return localeListHelper2;
                }
            }
            LocaleListHelper localeListHelper3 = sDefaultLocaleList;
            return localeListHelper3;
        }
    }

    static LocaleListHelper getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    private static String getLikelyScript(Locale locale) {
        if (Build.VERSION.SDK_INT < 21) {
            return "";
        }
        String script = locale.getScript();
        return !script.isEmpty() ? script : "";
    }

    private static boolean isPseudoLocale(String str) {
        return STRING_EN_XA.equals(str) || STRING_AR_XB.equals(str);
    }

    private static boolean isPseudoLocale(Locale locale) {
        return LOCALE_EN_XA.equals(locale) || LOCALE_AR_XB.equals(locale);
    }

    static boolean isPseudoLocalesOnly(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        if (strArr.length > 3) {
            return false;
        }
        for (String str : strArr) {
            if (!str.isEmpty() && !isPseudoLocale(str)) {
                return false;
            }
        }
        return true;
    }

    private static int matchScore(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (locale.getLanguage().equals(locale2.getLanguage()) && !isPseudoLocale(locale) && !isPseudoLocale(locale2)) {
            String likelyScript = getLikelyScript(locale);
            if (likelyScript.isEmpty()) {
                String country = locale.getCountry();
                return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
            } else if (likelyScript.equals(getLikelyScript(locale2))) {
                return 1;
            }
        }
        return 0;
    }

    static void setDefault(LocaleListHelper localeListHelper) {
        setDefault(localeListHelper, 0);
    }

    static void setDefault(LocaleListHelper localeListHelper, int i) {
        if (localeListHelper == null) {
            throw new NullPointerException("locales is null");
        } else if (!localeListHelper.isEmpty()) {
            synchronized (sLock) {
                Locale locale = localeListHelper.get(i);
                sLastDefaultLocale = locale;
                Locale.setDefault(locale);
                sLastExplicitlySetLocaleList = localeListHelper;
                sDefaultLocaleList = localeListHelper;
                sDefaultAdjustedLocaleList = i == 0 ? sDefaultLocaleList : new LocaleListHelper(sLastDefaultLocale, sDefaultLocaleList);
            }
        } else {
            throw new IllegalArgumentException("locales is empty");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListHelper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListHelper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < this.mList.length; i++) {
            if (!this.mList[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Locale get(int i) {
        if (i < 0 || i >= this.mList.length) {
            return null;
        }
        return this.mList[i];
    }

    /* access modifiers changed from: package-private */
    public final Locale getFirstMatch(String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }

    /* access modifiers changed from: package-private */
    public final int getFirstMatchIndex(String[] strArr) {
        return computeFirstMatchIndex(Arrays.asList(strArr), false);
    }

    /* access modifiers changed from: package-private */
    public final int getFirstMatchIndexWithEnglishSupported(Collection<String> collection) {
        return computeFirstMatchIndex(collection, true);
    }

    /* access modifiers changed from: package-private */
    public final int getFirstMatchIndexWithEnglishSupported(String[] strArr) {
        return getFirstMatchIndexWithEnglishSupported((Collection<String>) Arrays.asList(strArr));
    }

    /* access modifiers changed from: package-private */
    public final Locale getFirstMatchWithEnglishSupported(String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), true);
    }

    public final int hashCode() {
        int i = 1;
        for (Locale hashCode : this.mList) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final int indexOf(Locale locale) {
        for (int i = 0; i < this.mList.length; i++) {
            if (this.mList[i].equals(locale)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final boolean isEmpty() {
        return this.mList.length == 0;
    }

    /* access modifiers changed from: package-private */
    public final int size() {
        return this.mList.length;
    }

    /* access modifiers changed from: package-private */
    public final String toLanguageTags() {
        return this.mStringRepresentation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.mList.length; i++) {
            sb.append(this.mList[i]);
            if (i < this.mList.length - 1) {
                sb.append(',');
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
