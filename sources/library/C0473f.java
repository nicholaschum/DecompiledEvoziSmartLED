package library;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Field;

/* renamed from: library.f */
public final class C0473f {
    /* renamed from: a */
    public static Parcel m1586a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* renamed from: a */
    public static Object m1587a(Parcelable parcelable, ClassLoader classLoader, String str) {
        try {
            Field field = classLoader.loadClass(str).getField("CREATOR");
            field.setAccessible(true);
            return ((Parcelable.Creator) field.get((Object) null)).createFromParcel(m1586a(parcelable));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }
}
