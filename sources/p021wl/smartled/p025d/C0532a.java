package p021wl.smartled.p025d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import p021wl.smartled.beans.C0521b;

/* renamed from: wl.smartled.d.a */
public class C0532a {

    /* renamed from: a */
    private static C0532a f2389a;

    /* renamed from: b */
    private static C0533b f2390b;

    private C0532a(Context context) {
        f2390b = new C0533b(context);
    }

    /* renamed from: a */
    public static C0532a m1842a(Context context) {
        if (f2389a == null) {
            synchronized (C0532a.class) {
                if (f2389a == null) {
                    f2389a = new C0532a(context);
                }
            }
        }
        return f2389a;
    }

    /* renamed from: a */
    public static void m1843a() {
        f2390b.close();
        f2390b = null;
        f2389a = null;
    }

    /* renamed from: a */
    public final synchronized int mo4968a(C0521b bVar) {
        int insert;
        SQLiteDatabase writableDatabase = f2390b.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", bVar.mo4874c());
        contentValues.put("address", bVar.mo4871b());
        contentValues.put("groupName", bVar.mo4879e());
        contentValues.put("groupId", Integer.valueOf(bVar.mo4877d()));
        contentValues.put("bright1", Integer.valueOf(bVar.mo4881f()));
        contentValues.put("color", Integer.valueOf(bVar.mo4883g()));
        contentValues.put("pointX", Integer.valueOf(bVar.mo4885h()));
        contentValues.put("pointY", Integer.valueOf(bVar.mo4887i()));
        contentValues.put("modeIndex", Integer.valueOf(bVar.mo4889j()));
        contentValues.put("mode", Integer.valueOf(bVar.mo4891k()));
        contentValues.put("paletteMode", Integer.valueOf(bVar.mo4893l()));
        contentValues.put("flashMode", Integer.valueOf(bVar.mo4895m()));
        contentValues.put("flashSpeed", Integer.valueOf(bVar.mo4896n()));
        contentValues.put("bright2", Integer.valueOf(bVar.mo4897o()));
        contentValues.put("idWord", Integer.valueOf(bVar.mo4898p()));
        insert = (int) writableDatabase.insert("ControlDeviceInfo", (String) null, contentValues);
        writableDatabase.close();
        return insert;
    }

    /* renamed from: a */
    public final synchronized void mo4969a(int i) {
        SQLiteDatabase writableDatabase = f2390b.getWritableDatabase();
        writableDatabase.delete("ControlDeviceInfo", "id=?", new String[]{String.valueOf(i)});
        writableDatabase.close();
    }

    /* renamed from: b */
    public final synchronized void mo4970b() {
        SQLiteDatabase writableDatabase = f2390b.getWritableDatabase();
        writableDatabase.execSQL("delete from ControlDeviceInfo");
        writableDatabase.execSQL("update sqlite_sequence SET seq = 0 where name ='ControlDeviceInfo'");
        writableDatabase.close();
    }

    /* renamed from: b */
    public final synchronized void mo4971b(C0521b bVar) {
        SQLiteDatabase writableDatabase = f2390b.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", bVar.mo4874c());
        contentValues.put("address", bVar.mo4871b());
        contentValues.put("groupName", bVar.mo4879e());
        contentValues.put("groupId", Integer.valueOf(bVar.mo4877d()));
        contentValues.put("bright1", Integer.valueOf(bVar.mo4881f()));
        contentValues.put("color", Integer.valueOf(bVar.mo4883g()));
        contentValues.put("pointX", Integer.valueOf(bVar.mo4885h()));
        contentValues.put("pointY", Integer.valueOf(bVar.mo4887i()));
        contentValues.put("modeIndex", Integer.valueOf(bVar.mo4889j()));
        contentValues.put("mode", Integer.valueOf(bVar.mo4891k()));
        contentValues.put("paletteMode", Integer.valueOf(bVar.mo4893l()));
        contentValues.put("flashMode", Integer.valueOf(bVar.mo4895m()));
        contentValues.put("flashSpeed", Integer.valueOf(bVar.mo4896n()));
        contentValues.put("bright2", Integer.valueOf(bVar.mo4897o()));
        contentValues.put("idWord", Integer.valueOf(bVar.mo4898p()));
        writableDatabase.update("ControlDeviceInfo", contentValues, "id=?", new String[]{String.valueOf(bVar.mo4868a())});
        writableDatabase.close();
    }

    /* renamed from: c */
    public final synchronized List<C0521b> mo4972c() {
        ArrayList arrayList;
        SQLiteDatabase readableDatabase = f2390b.getReadableDatabase();
        arrayList = null;
        Cursor query = readableDatabase.query("ControlDeviceInfo", new String[]{"id", "name", "address", "groupName", "groupId", "bright1", "color", "pointX", "pointY", "modeIndex", "mode", "paletteMode", "flashMode", "flashSpeed", "bright2", "idWord"}, (String) null, (String[]) null, (String) null, (String) null, "idWord", (String) null);
        while (query.moveToNext()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            C0521b bVar = new C0521b();
            bVar.mo4869a(query.getInt(query.getColumnIndex("id")));
            bVar.mo4876c(query.getString(query.getColumnIndex("groupName")));
            bVar.mo4872b(query.getInt(query.getColumnIndex("groupId")));
            bVar.mo4873b(query.getString(query.getColumnIndex("name")));
            bVar.mo4870a(query.getString(query.getColumnIndex("address")));
            bVar.mo4875c(query.getInt(query.getColumnIndex("bright1")));
            bVar.mo4878d(query.getInt(query.getColumnIndex("color")));
            bVar.mo4880e(query.getInt(query.getColumnIndex("pointX")));
            bVar.mo4882f(query.getInt(query.getColumnIndex("pointY")));
            bVar.mo4884g(query.getInt(query.getColumnIndex("modeIndex")));
            bVar.mo4886h(query.getInt(query.getColumnIndex("mode")));
            bVar.mo4888i(query.getInt(query.getColumnIndex("paletteMode")));
            bVar.mo4890j(query.getInt(query.getColumnIndex("flashMode")));
            bVar.mo4892k(query.getInt(query.getColumnIndex("flashSpeed")));
            bVar.mo4892k(query.getInt(query.getColumnIndex("bright2")));
            bVar.mo4894l(query.getInt(query.getColumnIndex("idWord")));
            arrayList.add(bVar);
        }
        query.close();
        readableDatabase.close();
        return arrayList;
    }
}
