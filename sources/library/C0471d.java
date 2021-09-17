package library;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.widget.ExploreByTouchHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: library.d */
public class C0471d implements Parcelable, Cloneable, Iterable<String> {
    public static final Parcelable.Creator<C0471d> CREATOR = new C0472e();

    /* renamed from: a */
    String f2050a;

    /* renamed from: b */
    int f2051b;

    /* renamed from: c */
    private final ArrayList<String> f2052c;

    C0471d() {
        this.f2051b = ExploreByTouchHelper.INVALID_ID;
        this.f2052c = new ArrayList<>();
    }

    private C0471d(Parcel parcel) {
        this.f2051b = ExploreByTouchHelper.INVALID_ID;
        this.f2050a = parcel.readString();
        this.f2051b = parcel.readInt();
        this.f2052c = (ArrayList) parcel.readSerializable();
    }

    /* synthetic */ C0471d(Parcel parcel, byte b) {
        this(parcel);
    }

    private C0471d(C0471d dVar) {
        this.f2051b = ExploreByTouchHelper.INVALID_ID;
        this.f2050a = dVar.f2050a;
        this.f2051b = dVar.f2051b;
        this.f2052c = new ArrayList<>(dVar.f2052c);
    }

    /* access modifiers changed from: protected */
    public Object clone() {
        return new C0471d(this);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0471d dVar = (C0471d) obj;
            if (this.f2051b != dVar.f2051b || !this.f2052c.equals(dVar.f2052c)) {
                return false;
            }
            if (this.f2050a != null) {
                return this.f2050a.equals(dVar.f2050a);
            }
            if (dVar.f2050a == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2052c.hashCode() * 31) + (this.f2050a != null ? this.f2050a.hashCode() : 0)) * 31) + this.f2051b;
    }

    public Iterator<String> iterator() {
        return this.f2052c.iterator();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("PRunningL{ ");
        if (this.f2051b == Integer.MIN_VALUE) {
            str = "<UNKNOWN_PID>";
        } else {
            sb.append('<');
            sb.append(this.f2050a);
            sb.append(':');
            sb.append(this.f2051b);
            str = "> ";
        }
        sb.append(str);
        sb.append(this.f2052c);
        sb.append(" }");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2050a);
        parcel.writeInt(this.f2051b);
        parcel.writeSerializable(this.f2052c);
    }
}
