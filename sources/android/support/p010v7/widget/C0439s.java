package android.support.p010v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.s */
class C0439s extends DataSetObservable {

    /* renamed from: a */
    static final String f1891a = "s";

    /* renamed from: e */
    private static final Object f1892e = new Object();

    /* renamed from: f */
    private static final Map<String, C0439s> f1893f = new HashMap();

    /* renamed from: b */
    final Context f1894b;

    /* renamed from: c */
    final String f1895c;

    /* renamed from: d */
    boolean f1896d = true;

    /* renamed from: g */
    private final Object f1897g = new Object();

    /* renamed from: h */
    private final List<C0440t> f1898h = new ArrayList();

    /* renamed from: i */
    private final List<C0443w> f1899i = new ArrayList();

    /* renamed from: j */
    private Intent f1900j;

    /* renamed from: k */
    private C0441u f1901k = new C0442v();

    /* renamed from: l */
    private int f1902l = 50;

    /* renamed from: m */
    private boolean f1903m = false;

    /* renamed from: n */
    private boolean f1904n = true;

    /* renamed from: o */
    private boolean f1905o = false;

    /* renamed from: p */
    private C0444x f1906p;

    private C0439s(Context context, String str) {
        this.f1894b = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(".xml")) {
            this.f1895c = str;
            return;
        }
        this.f1895c = str + ".xml";
    }

    /* renamed from: a */
    public static C0439s m1407a(Context context, String str) {
        C0439s sVar;
        synchronized (f1892e) {
            sVar = f1893f.get(str);
            if (sVar == null) {
                sVar = new C0439s(context, str);
                f1893f.put(str, sVar);
            }
        }
        return sVar;
    }

    /* renamed from: a */
    private boolean m1408a(C0443w wVar) {
        boolean add = this.f1899i.add(wVar);
        if (add) {
            this.f1904n = true;
            m1414i();
            m1409d();
            m1411f();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: d */
    private void m1409d() {
        if (!this.f1903m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f1904n) {
            this.f1904n = false;
            if (!TextUtils.isEmpty(this.f1895c)) {
                new C0445y(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f1899i), this.f1895c});
            }
        }
    }

    /* renamed from: e */
    private void m1410e() {
        boolean g = m1412g() | m1413h();
        m1414i();
        if (g) {
            m1411f();
            notifyChanged();
        }
    }

    /* renamed from: f */
    private boolean m1411f() {
        if (this.f1901k == null || this.f1900j == null || this.f1898h.isEmpty() || this.f1899i.isEmpty()) {
            return false;
        }
        this.f1901k.mo4598a(this.f1898h, Collections.unmodifiableList(this.f1899i));
        return true;
    }

    /* renamed from: g */
    private boolean m1412g() {
        if (!this.f1905o || this.f1900j == null) {
            return false;
        }
        this.f1905o = false;
        this.f1898h.clear();
        List<ResolveInfo> queryIntentActivities = this.f1894b.getPackageManager().queryIntentActivities(this.f1900j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f1898h.add(new C0440t(queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: h */
    private boolean m1413h() {
        if (!this.f1896d || !this.f1904n || TextUtils.isEmpty(this.f1895c)) {
            return false;
        }
        this.f1896d = false;
        this.f1903m = true;
        m1415j();
        return true;
    }

    /* renamed from: i */
    private void m1414i() {
        int size = this.f1899i.size() - this.f1902l;
        if (size > 0) {
            this.f1904n = true;
            for (int i = 0; i < size; i++) {
                this.f1899i.remove(0);
            }
        }
    }

    /* renamed from: j */
    private void m1415j() {
        try {
            FileInputStream openFileInput = this.f1894b.openFileInput(this.f1895c);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List<C0443w> list = this.f1899i;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (!(next == 3 || next == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new C0443w(newPullParser.getAttributeValue((String) null, "activity"), Long.parseLong(newPullParser.getAttributeValue((String) null, "time")), Float.parseFloat(newPullParser.getAttributeValue((String) null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                }
            } catch (XmlPullParserException e) {
                String str = f1891a;
                Log.e(str, "Error reading historical recrod file: " + this.f1895c, e);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (IOException e2) {
                String str2 = f1891a;
                Log.e(str2, "Error reading historical recrod file: " + this.f1895c, e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
        }
    }

    /* renamed from: a */
    public final int mo4587a() {
        int size;
        synchronized (this.f1897g) {
            m1410e();
            size = this.f1898h.size();
        }
        return size;
    }

    /* renamed from: a */
    public final int mo4588a(ResolveInfo resolveInfo) {
        synchronized (this.f1897g) {
            m1410e();
            List<C0440t> list = this.f1898h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).f1907a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final ResolveInfo mo4589a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f1897g) {
            m1410e();
            resolveInfo = this.f1898h.get(i).f1907a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public final Intent mo4590b(int i) {
        synchronized (this.f1897g) {
            if (this.f1900j == null) {
                return null;
            }
            m1410e();
            C0440t tVar = this.f1898h.get(i);
            ComponentName componentName = new ComponentName(tVar.f1907a.activityInfo.packageName, tVar.f1907a.activityInfo.name);
            Intent intent = new Intent(this.f1900j);
            intent.setComponent(componentName);
            if (this.f1906p != null) {
                new Intent(intent);
                if (this.f1906p.mo4602a()) {
                    return null;
                }
            }
            m1408a(new C0443w(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public final ResolveInfo mo4591b() {
        synchronized (this.f1897g) {
            m1410e();
            if (this.f1898h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = this.f1898h.get(0).f1907a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public final int mo4592c() {
        int size;
        synchronized (this.f1897g) {
            m1410e();
            size = this.f1899i.size();
        }
        return size;
    }

    /* renamed from: c */
    public final void mo4593c(int i) {
        synchronized (this.f1897g) {
            m1410e();
            C0440t tVar = this.f1898h.get(i);
            C0440t tVar2 = this.f1898h.get(0);
            m1408a(new C0443w(new ComponentName(tVar.f1907a.activityInfo.packageName, tVar.f1907a.activityInfo.name), System.currentTimeMillis(), tVar2 != null ? (tVar2.f1908b - tVar.f1908b) + 5.0f : 1.0f));
        }
    }
}
