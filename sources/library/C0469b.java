package library;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: library.b */
public abstract class C0469b extends Binder implements C0468a {
    public C0469b() {
        attachInterface(this, "com.qihoo360.loader2.IPlugin");
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("com.qihoo360.loader2.IPlugin");
            IBinder a = mo4632a(parcel.readString());
            parcel2.writeNoException();
            parcel2.writeStrongBinder(a);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("com.qihoo360.loader2.IPlugin");
            return true;
        }
    }
}
