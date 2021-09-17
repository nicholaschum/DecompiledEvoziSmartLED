package android.support.p007v4.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p003a.C0050j;
import android.support.p007v4.provider.FontRequest;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.content.res.FontResourcesParserCompat */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry */
    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FetchStrategy */
    public @interface FetchStrategy {
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry */
    public final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        public final FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$FontFileResourceEntry */
    public final class FontFileResourceEntry {
        private final String mFileName;
        private boolean mItalic;
        private int mResourceId;
        private int mTtcIndex;
        private String mVariationSettings;
        private int mWeight;

        public FontFileResourceEntry(String str, int i, boolean z, String str2, int i2, int i3) {
            this.mFileName = str;
            this.mWeight = i;
            this.mItalic = z;
            this.mVariationSettings = str2;
            this.mTtcIndex = i2;
            this.mResourceId = i3;
        }

        public final String getFileName() {
            return this.mFileName;
        }

        public final int getResourceId() {
            return this.mResourceId;
        }

        public final int getTtcIndex() {
            return this.mTtcIndex;
        }

        public final String getVariationSettings() {
            return this.mVariationSettings;
        }

        public final int getWeight() {
            return this.mWeight;
        }

        public final boolean isItalic() {
            return this.mItalic;
        }
    }

    /* renamed from: android.support.v4.content.res.FontResourcesParserCompat$ProviderResourceEntry */
    public final class ProviderResourceEntry implements FamilyResourceEntry {
        private final FontRequest mRequest;
        private final int mStrategy;
        private final int mTimeoutMs;

        public ProviderResourceEntry(FontRequest fontRequest, int i, int i2) {
            this.mRequest = fontRequest;
            this.mStrategy = i;
            this.mTimeoutMs = i2;
        }

        public final int getFetchStrategy() {
            return this.mStrategy;
        }

        public final FontRequest getRequest() {
            return this.mRequest;
        }

        public final int getTimeout() {
            return this.mTimeoutMs;
        }
    }

    private FontResourcesParserCompat() {
    }

    private static int getType(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static android.support.p007v4.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000a
            r2 = 1
            if (r0 != r2) goto L_0x0000
        L_0x000a:
            if (r0 != r1) goto L_0x0011
            android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry r3 = readFamilies(r3, r4)
            return r3
        L_0x0011:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.content.res.FontResourcesParserCompat.parse(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):android.support.v4.content.res.FontResourcesParserCompat$FamilyResourceEntry");
    }

    public static List<List<byte[]>> readCerts(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (getType(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static FamilyResourceEntry readFamilies(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    private static FamilyResourceEntry readFamily(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0050j.f85e);
        String string = obtainAttributes.getString(C0050j.f86f);
        String string2 = obtainAttributes.getString(C0050j.f90j);
        String string3 = obtainAttributes.getString(C0050j.f91k);
        int resourceId = obtainAttributes.getResourceId(C0050j.f87g, 0);
        int integer = obtainAttributes.getInteger(C0050j.f88h, 1);
        int integer2 = obtainAttributes.getInteger(C0050j.f89i, DEFAULT_TIMEOUT_MILLIS);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(readFont(xmlPullParser, resources));
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new ProviderResourceEntry(new FontRequest(string, string2, string3, readCerts(resources, resourceId)), integer, integer2);
    }

    private static FontFileResourceEntry readFont(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0050j.f92l);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0050j.f101u) ? C0050j.f101u : C0050j.f94n, NORMAL_WEIGHT);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0050j.f99s) ? C0050j.f99s : C0050j.f95o, 0);
        int i2 = obtainAttributes.hasValue(C0050j.f102v) ? C0050j.f102v : C0050j.f96p;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C0050j.f100t) ? C0050j.f100t : C0050j.f97q);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C0050j.f98r) ? C0050j.f98r : C0050j.f93m;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i, z, string, i3, resourceId);
    }

    private static void skip(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
            }
        }
    }

    private static List<byte[]> toByteArrayList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
