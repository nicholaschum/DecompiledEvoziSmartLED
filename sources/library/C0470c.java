package library;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: library.c */
public final class C0470c {
    /* renamed from: a */
    public static <T> void m1585a(JSONObject jSONObject, String str, T t) {
        try {
            jSONObject.put(str, t);
        } catch (JSONException unused) {
        }
    }
}
