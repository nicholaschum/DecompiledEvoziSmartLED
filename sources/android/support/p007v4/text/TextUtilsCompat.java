package android.support.p007v4.text;

import android.os.Build;
import android.support.p007v4.view.MotionEventCompat;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: android.support.v4.text.TextUtilsCompat */
public final class TextUtilsCompat {
    private static final String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final Locale ROOT = new Locale("", "");

    private TextUtilsCompat() {
    }

    private static int getLayoutDirectionFromFirstChar(Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case 1:
            case 2:
                return 1;
            default:
                return 0;
        }
    }

    public static int getLayoutDirectionFromLocale(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(ROOT)) {
            return 0;
        }
        String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
        return maximizeAndGetScript == null ? getLayoutDirectionFromFirstChar(locale) : (maximizeAndGetScript.equalsIgnoreCase(ARAB_SCRIPT_SUBTAG) || maximizeAndGetScript.equalsIgnoreCase(HEBR_SCRIPT_SUBTAG)) ? 1 : 0;
    }

    public static String htmlEncode(String str) {
        String str2;
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.htmlEncode(str);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                str2 = "&quot;";
            } else if (charAt == '<') {
                str2 = "&lt;";
            } else if (charAt != '>') {
                switch (charAt) {
                    case MotionEventCompat.AXIS_GENERIC_7 /*38*/:
                        str2 = "&amp;";
                        break;
                    case MotionEventCompat.AXIS_GENERIC_8 /*39*/:
                        str2 = "&#39;";
                        break;
                    default:
                        sb.append(charAt);
                        continue;
                }
            } else {
                str2 = "&gt;";
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
