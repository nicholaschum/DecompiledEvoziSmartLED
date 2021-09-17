package p021wl.smartled.p027f;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import java.util.List;

/* renamed from: wl.smartled.f.o */
public final class C0552o {
    /* renamed from: a */
    public static Bitmap m1926a(Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        float f3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Log.i("TAG", "zoomBitmap---width:" + width + "---height:" + height);
        Matrix matrix = new Matrix();
        float f4 = 0.0f;
        if (width > height) {
            f3 = ((float) i2) / ((float) height);
            f4 = (float) ((width - ((i * height) / i2)) / 2);
        } else if (width < height) {
            f3 = ((float) i) / ((float) width);
            f = (float) ((height - ((i2 * width) / i)) / 2);
            f2 = f3;
            matrix.postScale(f3, f2);
            return Bitmap.createBitmap(bitmap, (int) f4, (int) f, (int) (((float) width) - f4), (int) (((float) height) - f), matrix, true);
        } else {
            f3 = ((float) i) / ((float) width);
        }
        f2 = f3;
        f = 0.0f;
        matrix.postScale(f3, f2);
        try {
            return Bitmap.createBitmap(bitmap, (int) f4, (int) f, (int) (((float) width) - f4), (int) (((float) height) - f), matrix, true);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> Object m1927a(List<T> list, String str) {
        int i = 0;
        while (list != null && i < list.size()) {
            T t = list.get(i);
            try {
                if (t.getClass().getDeclaredMethod("getAddress", new Class[0]).invoke(t, new Object[0]).equals(str)) {
                    return t;
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
