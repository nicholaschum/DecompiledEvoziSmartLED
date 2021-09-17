package android.support.p007v4.util;

/* renamed from: android.support.v4.util.SparseArrayCompat */
public class SparseArrayCompat<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArrayCompat() {
        this(10);
    }

    public SparseArrayCompat(int i) {
        Object[] objArr;
        this.mGarbage = false;
        if (i == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            objArr = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i);
            this.mKeys = new int[idealIntArraySize];
            objArr = new Object[idealIntArraySize];
        }
        this.mValues = objArr;
        this.mSize = 0;
    }

    /* renamed from: gc */
    private void m163gc() {
        int i = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != DELETED) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.mGarbage = false;
        this.mSize = i2;
    }

    public void append(int i, E e) {
        if (this.mSize == 0 || i > this.mKeys[this.mSize - 1]) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                m163gc();
            }
            int i2 = this.mSize;
            if (i2 >= this.mKeys.length) {
                int idealIntArraySize = ContainerHelpers.idealIntArraySize(i2 + 1);
                int[] iArr = new int[idealIntArraySize];
                Object[] objArr = new Object[idealIntArraySize];
                System.arraycopy(this.mKeys, 0, iArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            this.mKeys[i2] = i;
            this.mValues[i2] = e;
            this.mSize = i2 + 1;
            return;
        }
        put(i, e);
    }

    public void clear() {
        int i = this.mSize;
        Object[] objArr = this.mValues;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.mKeys = (int[]) this.mKeys.clone();
            sparseArrayCompat.mValues = (Object[]) this.mValues.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean containsKey(int i) {
        return indexOfKey(i) >= 0;
    }

    public boolean containsValue(E e) {
        return indexOfValue(e) >= 0;
    }

    public void delete(int i) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (binarySearch >= 0 && this.mValues[binarySearch] != DELETED) {
            this.mValues[binarySearch] = DELETED;
            this.mGarbage = true;
        }
    }

    public E get(int i) {
        return get(i, (Object) null);
    }

    public E get(int i, E e) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        return (binarySearch < 0 || this.mValues[binarySearch] == DELETED) ? e : this.mValues[binarySearch];
    }

    public int indexOfKey(int i) {
        if (this.mGarbage) {
            m163gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
    }

    public int indexOfValue(E e) {
        if (this.mGarbage) {
            m163gc();
        }
        for (int i = 0; i < this.mSize; i++) {
            if (this.mValues[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int i) {
        if (this.mGarbage) {
            m163gc();
        }
        return this.mKeys[i];
    }

    public void put(int i, E e) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e;
            return;
        }
        int i2 = ~binarySearch;
        if (i2 >= this.mSize || this.mValues[i2] != DELETED) {
            if (this.mGarbage && this.mSize >= this.mKeys.length) {
                m163gc();
                i2 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, i);
            }
            if (this.mSize >= this.mKeys.length) {
                int idealIntArraySize = ContainerHelpers.idealIntArraySize(this.mSize + 1);
                int[] iArr = new int[idealIntArraySize];
                Object[] objArr = new Object[idealIntArraySize];
                System.arraycopy(this.mKeys, 0, iArr, 0, this.mKeys.length);
                System.arraycopy(this.mValues, 0, objArr, 0, this.mValues.length);
                this.mKeys = iArr;
                this.mValues = objArr;
            }
            if (this.mSize - i2 != 0) {
                int[] iArr2 = this.mKeys;
                int i3 = i2 + 1;
                System.arraycopy(iArr2, i2, iArr2, i3, this.mSize - i2);
                Object[] objArr2 = this.mValues;
                System.arraycopy(objArr2, i2, objArr2, i3, this.mSize - i2);
            }
            this.mKeys[i2] = i;
            this.mValues[i2] = e;
            this.mSize++;
            return;
        }
        this.mKeys[i2] = i;
        this.mValues[i2] = e;
    }

    public void putAll(SparseArrayCompat<? extends E> sparseArrayCompat) {
        int size = sparseArrayCompat.size();
        for (int i = 0; i < size; i++) {
            put(sparseArrayCompat.keyAt(i), sparseArrayCompat.valueAt(i));
        }
    }

    public void remove(int i) {
        delete(i);
    }

    public void removeAt(int i) {
        if (this.mValues[i] != DELETED) {
            this.mValues[i] = DELETED;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int i, int i2) {
        int min = Math.min(this.mSize, i2 + i);
        while (i < min) {
            removeAt(i);
            i++;
        }
    }

    public void setValueAt(int i, E e) {
        if (this.mGarbage) {
            m163gc();
        }
        this.mValues[i] = e;
    }

    public int size() {
        if (this.mGarbage) {
            m163gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i = 0; i < this.mSize; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i));
            sb.append('=');
            Object valueAt = valueAt(i);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i) {
        if (this.mGarbage) {
            m163gc();
        }
        return this.mValues[i];
    }
}
