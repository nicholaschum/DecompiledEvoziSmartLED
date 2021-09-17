package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* renamed from: androidx.versionedparcelable.b */
public abstract class C0448b {
    /* renamed from: a */
    private static <T extends C0450d> T m1427a(String str, C0448b bVar) {
        try {
            return (C0450d) Class.forName(str, true, C0448b.class.getClassLoader()).getDeclaredMethod("read", new Class[]{C0448b.class}).invoke((Object) null, new Object[]{bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: a */
    private static Class m1428a(Class<? extends C0450d> cls) {
        return Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4610a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4611a(int i);

    /* renamed from: a */
    public final void mo4612a(int i, int i2) {
        mo4626c(i2);
        mo4611a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4613a(Parcelable parcelable);

    /* renamed from: a */
    public final void mo4614a(Parcelable parcelable, int i) {
        mo4626c(i);
        mo4613a(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo4615a(C0450d dVar) {
        if (dVar == null) {
            mo4616a((String) null);
            return;
        }
        try {
            mo4616a(m1428a((Class<? extends C0450d>) dVar.getClass()).getName());
            C0448b b = mo4620b();
            try {
                m1428a((Class<? extends C0450d>) dVar.getClass()).getDeclaredMethod("write", new Class[]{dVar.getClass(), C0448b.class}).invoke((Object) null, new Object[]{dVar, b});
                b.mo4610a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4616a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4617a(byte[] bArr);

    /* renamed from: b */
    public final int mo4618b(int i, int i2) {
        return !mo4623b(i2) ? i : mo4624c();
    }

    /* renamed from: b */
    public final <T extends Parcelable> T mo4619b(T t, int i) {
        return !mo4623b(i) ? t : mo4630f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0448b mo4620b();

    /* renamed from: b */
    public final void mo4621b(String str) {
        mo4626c(7);
        mo4616a(str);
    }

    /* renamed from: b */
    public final void mo4622b(byte[] bArr) {
        mo4626c(2);
        mo4617a(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo4623b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo4624c();

    /* renamed from: c */
    public final String mo4625c(String str) {
        return !mo4623b(7) ? str : mo4628d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo4626c(int i);

    /* renamed from: c */
    public final byte[] mo4627c(byte[] bArr) {
        return !mo4623b(2) ? bArr : mo4629e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo4628d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract byte[] mo4629e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract <T extends Parcelable> T mo4630f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final <T extends C0450d> T mo4631g() {
        String d = mo4628d();
        if (d == null) {
            return null;
        }
        return m1427a(d, mo4620b());
    }
}
