package p021wl.smartled.p025d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: wl.smartled.d.b */
public final class C0533b extends SQLiteOpenHelper {
    public C0533b(Context context) {
        super(context, "SmartLed.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ControlDeviceInfo (id  integer PRIMARY KEY Autoincrement ,name text ,address text ,groupName text ,groupId integer ,bright1 integer ,color integer ,pointX integer ,pointY integer ,modeIndex integer ,mode integer ,paletteMode integer ,flashMode integer ,flashSpeed integer ,bright2 integer ,idWord integer)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ControlDeviceInfo");
        onCreate(sQLiteDatabase);
    }
}
