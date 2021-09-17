package android.support.p010v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.view.i */
public final class C0278i extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f953a;

    /* renamed from: b */
    static final Class<?>[] f954b;

    /* renamed from: c */
    final Object[] f955c;

    /* renamed from: d */
    final Object[] f956d = this.f955c;

    /* renamed from: e */
    Context f957e;

    /* renamed from: f */
    private Object f958f;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            f953a = r0
            f954b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.view.C0278i.<clinit>():void");
    }

    public C0278i(Context context) {
        super(context);
        this.f957e = context;
        this.f955c = new Object[]{context};
    }

    /* renamed from: a */
    private void m543a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0280k kVar = new C0280k(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        break;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    str = name2;
                                    z2 = true;
                                    break;
                                } else {
                                    m543a(xmlPullParser, attributeSet, kVar.mo3502c());
                                    break;
                                }
                            } else {
                                kVar.mo3501b(attributeSet);
                                break;
                            }
                        } else {
                            kVar.mo3499a(attributeSet);
                            break;
                        }
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!kVar.mo3503d()) {
                                if (kVar.f968a != null && kVar.f968a.hasSubMenu()) {
                                    kVar.mo3502c();
                                    break;
                                } else {
                                    kVar.mo3500b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            kVar.mo3498a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo3495a() {
        if (this.f958f == null) {
            Context context = this.f957e;
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            this.f958f = context;
        }
        return this.f958f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof android.support.p007v4.internal.view.SupportMenu
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.f957e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            r2.m543a(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            if (r3 == 0) goto L_0x001f
            r3.close()
        L_0x001f:
            return
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x003d
        L_0x0023:
            r4 = move-exception
            r0 = r3
            goto L_0x002c
        L_0x0026:
            r4 = move-exception
            r0 = r3
            goto L_0x0035
        L_0x0029:
            r4 = move-exception
            goto L_0x003d
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0034:
            r4 = move-exception
        L_0x0035:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.view.C0278i.inflate(int, android.view.Menu):void");
    }
}
