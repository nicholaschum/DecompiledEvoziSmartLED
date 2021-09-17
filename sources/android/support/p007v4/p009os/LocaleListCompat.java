package android.support.p007v4.p009os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: android.support.v4.os.LocaleListCompat */
public final class LocaleListCompat {
    static final LocaleListInterface IMPL = (Build.VERSION.SDK_INT >= 24 ? new LocaleListCompatApi24Impl() : new LocaleListCompatBaseImpl());
    private static final LocaleListCompat sEmptyLocaleList = new LocaleListCompat();

    /* renamed from: android.support.v4.os.LocaleListCompat$LocaleListCompatApi24Impl */
    class LocaleListCompatApi24Impl implements LocaleListInterface {
        private LocaleList mLocaleList = new LocaleList(new Locale[0]);

        LocaleListCompatApi24Impl() {
        }

        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        public Locale getFirstMatch(String[] strArr) {
            if (this.mLocaleList != null) {
                return this.mLocaleList.getFirstMatch(strArr);
            }
            return null;
        }

        public Object getLocaleList() {
            return this.mLocaleList;
        }

        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        public void setLocaleList(Locale... localeArr) {
            this.mLocaleList = new LocaleList(localeArr);
        }

        public int size() {
            return this.mLocaleList.size();
        }

        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        public String toString() {
            return this.mLocaleList.toString();
        }
    }

    /* renamed from: android.support.v4.os.LocaleListCompat$LocaleListCompatBaseImpl */
    class LocaleListCompatBaseImpl implements LocaleListInterface {
        private LocaleListHelper mLocaleList = new LocaleListHelper(new Locale[0]);

        LocaleListCompatBaseImpl() {
        }

        public boolean equals(Object obj) {
            return this.mLocaleList.equals(((LocaleListCompat) obj).unwrap());
        }

        public Locale get(int i) {
            return this.mLocaleList.get(i);
        }

        public Locale getFirstMatch(String[] strArr) {
            if (this.mLocaleList != null) {
                return this.mLocaleList.getFirstMatch(strArr);
            }
            return null;
        }

        public Object getLocaleList() {
            return this.mLocaleList;
        }

        public int hashCode() {
            return this.mLocaleList.hashCode();
        }

        public int indexOf(Locale locale) {
            return this.mLocaleList.indexOf(locale);
        }

        public boolean isEmpty() {
            return this.mLocaleList.isEmpty();
        }

        public void setLocaleList(Locale... localeArr) {
            this.mLocaleList = new LocaleListHelper(localeArr);
        }

        public int size() {
            return this.mLocaleList.size();
        }

        public String toLanguageTags() {
            return this.mLocaleList.toLanguageTags();
        }

        public String toString() {
            return this.mLocaleList.toString();
        }
    }

    private LocaleListCompat() {
    }

    public static LocaleListCompat create(Locale... localeArr) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    public static LocaleListCompat forLanguageTags(String str) {
        if (str == null || str.isEmpty()) {
            return getEmptyLocaleList();
        }
        String[] split = str.split(",", -1);
        Locale[] localeArr = new Locale[split.length];
        for (int i = 0; i < localeArr.length; i++) {
            localeArr[i] = Build.VERSION.SDK_INT >= 21 ? Locale.forLanguageTag(split[i]) : LocaleHelper.forLanguageTag(split[i]);
        }
        LocaleListCompat localeListCompat = new LocaleListCompat();
        localeListCompat.setLocaleListArray(localeArr);
        return localeListCompat;
    }

    public static LocaleListCompat getAdjustedDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getAdjustedDefault());
        }
        return create(Locale.getDefault());
    }

    public static LocaleListCompat getDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(LocaleList.getDefault());
        }
        return create(Locale.getDefault());
    }

    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    private void setLocaleList(LocaleList localeList) {
        int size = localeList.size();
        if (size > 0) {
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            IMPL.setLocaleList(localeArr);
        }
    }

    private void setLocaleListArray(Locale... localeArr) {
        IMPL.setLocaleList(localeArr);
    }

    public static LocaleListCompat wrap(Object obj) {
        LocaleListCompat localeListCompat = new LocaleListCompat();
        if (obj instanceof LocaleList) {
            localeListCompat.setLocaleList((LocaleList) obj);
        }
        return localeListCompat;
    }

    public final boolean equals(Object obj) {
        return IMPL.equals(obj);
    }

    public final Locale get(int i) {
        return IMPL.get(i);
    }

    public final Locale getFirstMatch(String[] strArr) {
        return IMPL.getFirstMatch(strArr);
    }

    public final int hashCode() {
        return IMPL.hashCode();
    }

    public final int indexOf(Locale locale) {
        return IMPL.indexOf(locale);
    }

    public final boolean isEmpty() {
        return IMPL.isEmpty();
    }

    public final int size() {
        return IMPL.size();
    }

    public final String toLanguageTags() {
        return IMPL.toLanguageTags();
    }

    public final String toString() {
        return IMPL.toString();
    }

    public final Object unwrap() {
        return IMPL.getLocaleList();
    }
}
