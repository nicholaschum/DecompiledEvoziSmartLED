package com.qihoo360.replugin.loader.p018b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.qihoo360.replugin.C0454b;
import com.qihoo360.replugin.C0457d;
import com.qihoo360.replugin.C0458e;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager */
public class PluginLocalBroadcastManager {

    /* renamed from: f */
    private static final Object f2003f = new Object();

    /* renamed from: g */
    private static PluginLocalBroadcastManager f2004g;

    /* renamed from: h */
    private static Object f2005h;

    /* renamed from: a */
    private final Context f2006a;

    /* renamed from: b */
    private final HashMap<BroadcastReceiver, ArrayList<IntentFilter>> f2007b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<ReceiverRecord>> f2008c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<BroadcastRecord> f2009d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f2010e;

    /* renamed from: com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord */
    class BroadcastRecord {

        /* renamed from: a */
        final Intent f2012a;

        /* renamed from: b */
        final ArrayList<ReceiverRecord> f2013b;

        BroadcastRecord(Intent intent, ArrayList<ReceiverRecord> arrayList) {
            this.f2012a = intent;
            this.f2013b = arrayList;
        }
    }

    /* renamed from: com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ProxyLocalBroadcastManagerVar */
    public class ProxyLocalBroadcastManagerVar {

        /* renamed from: a */
        static C0454b f2014a;

        /* renamed from: b */
        static C0454b f2015b;

        /* renamed from: c */
        static C0454b f2016c;

        /* renamed from: d */
        static C0454b f2017d;

        /* renamed from: e */
        static C0454b f2018e;

        public static void initLocked(ClassLoader classLoader) {
            f2014a = new C0454b(classLoader, "android.support.v4.content.LocalBroadcastManager", "getInstance", new Class[]{Context.class});
            f2015b = new C0454b(classLoader, "android.support.v4.content.LocalBroadcastManager", "registerReceiver", new Class[]{BroadcastReceiver.class, IntentFilter.class});
            f2016c = new C0454b(classLoader, "android.support.v4.content.LocalBroadcastManager", "unregisterReceiver", new Class[]{BroadcastReceiver.class});
            f2017d = new C0454b(classLoader, "android.support.v4.content.LocalBroadcastManager", "sendBroadcast", new Class[]{Intent.class});
            f2018e = new C0454b(classLoader, "android.support.v4.content.LocalBroadcastManager", "sendBroadcastSync", new Class[]{Intent.class});
        }
    }

    /* renamed from: com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord */
    class ReceiverRecord {

        /* renamed from: a */
        final IntentFilter f2019a;

        /* renamed from: b */
        final BroadcastReceiver f2020b;

        /* renamed from: c */
        boolean f2021c;

        ReceiverRecord(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f2019a = intentFilter;
            this.f2020b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f2020b);
            sb.append(" filter=");
            sb.append(this.f2019a);
            sb.append("}");
            return sb.toString();
        }
    }

    private PluginLocalBroadcastManager(Context context) {
        this.f2006a = context;
        this.f2010e = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                } else {
                    PluginLocalBroadcastManager.this.m1554a();
                }
            }
        };
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r5 >= r4.f2013b.size()) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4.f2013b.get(r5).f2020b.onReceive(r9.f2006a, r4.f2012a);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1554a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r9.f2007b
            monitor-enter(r0)
            java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord> r1 = r9.f2009d     // Catch:{ all -> 0x0040 }
            int r1 = r1.size()     // Catch:{ all -> 0x0040 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            return
        L_0x000d:
            com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord[] r2 = new com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.BroadcastRecord[r1]     // Catch:{ all -> 0x0040 }
            java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord> r3 = r9.f2009d     // Catch:{ all -> 0x0040 }
            r3.toArray(r2)     // Catch:{ all -> 0x0040 }
            java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord> r3 = r9.f2009d     // Catch:{ all -> 0x0040 }
            r3.clear()     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            r0 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            r5 = 0
        L_0x0021:
            java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord> r6 = r4.f2013b
            int r6 = r6.size()
            if (r5 >= r6) goto L_0x003d
            java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord> r6 = r4.f2013b
            java.lang.Object r6 = r6.get(r5)
            com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord r6 = (com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.ReceiverRecord) r6
            android.content.BroadcastReceiver r6 = r6.f2020b
            android.content.Context r7 = r9.f2006a
            android.content.Intent r8 = r4.f2012a
            r6.onReceive(r7, r8)
            int r5 = r5 + 1
            goto L_0x0021
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0040 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.m1554a():void");
    }

    public static Object getInstance(Context context) {
        PluginLocalBroadcastManager pluginLocalBroadcastManager;
        synchronized (f2003f) {
            if (C0458e.f1989a) {
                try {
                    f2005h = ProxyLocalBroadcastManagerVar.f2014a.mo4633a((Object) null, context);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (f2004g == null) {
                Context a = C0457d.m1524a();
                if (a == null) {
                    a = context.getApplicationContext();
                }
                f2004g = new PluginLocalBroadcastManager(a);
            }
            pluginLocalBroadcastManager = f2004g;
        }
        return pluginLocalBroadcastManager;
    }

    public static void registerReceiver(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        ((PluginLocalBroadcastManager) obj).registerReceiver(broadcastReceiver, intentFilter);
    }

    public static boolean sendBroadcast(Object obj, Intent intent) {
        return ((PluginLocalBroadcastManager) obj).sendBroadcast(intent);
    }

    public static void sendBroadcastSync(Object obj, Intent intent) {
        ((PluginLocalBroadcastManager) obj).sendBroadcastSync(intent);
    }

    public static void unregisterReceiver(Object obj, BroadcastReceiver broadcastReceiver) {
        ((PluginLocalBroadcastManager) obj).unregisterReceiver(broadcastReceiver);
    }

    public void registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (C0458e.f1989a) {
            try {
                ProxyLocalBroadcastManagerVar.f2015b.mo4633a(f2005h, broadcastReceiver, intentFilter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            synchronized (this.f2007b) {
                ReceiverRecord receiverRecord = new ReceiverRecord(intentFilter, broadcastReceiver);
                ArrayList arrayList = this.f2007b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f2007b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(intentFilter);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = this.f2008c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f2008c.put(action, arrayList2);
                    }
                    arrayList2.add(receiverRecord);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0166, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0168, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendBroadcast(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            boolean r2 = com.qihoo360.replugin.C0458e.f1989a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0022
            com.qihoo360.replugin.b r2 = com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.ProxyLocalBroadcastManagerVar.f2017d     // Catch:{ Exception -> 0x001d }
            java.lang.Object r5 = f2005h     // Catch:{ Exception -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x001d }
            r4[r3] = r0     // Catch:{ Exception -> 0x001d }
            java.lang.Object r0 = r2.mo4633a(r5, r4)     // Catch:{ Exception -> 0x001d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x001d }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x001d }
            return r0
        L_0x001d:
            r0 = move-exception
            r0.printStackTrace()
            return r3
        L_0x0022:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r2 = r1.f2007b
            monitor-enter(r2)
            java.lang.String r12 = r22.getAction()     // Catch:{ all -> 0x016a }
            android.content.Context r5 = r1.f2006a     // Catch:{ all -> 0x016a }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x016a }
            java.lang.String r13 = r0.resolveTypeIfNeeded(r5)     // Catch:{ all -> 0x016a }
            android.net.Uri r14 = r22.getData()     // Catch:{ all -> 0x016a }
            java.lang.String r15 = r22.getScheme()     // Catch:{ all -> 0x016a }
            java.util.Set r16 = r22.getCategories()     // Catch:{ all -> 0x016a }
            int r5 = r22.getFlags()     // Catch:{ all -> 0x016a }
            r5 = r5 & 8
            if (r5 == 0) goto L_0x004a
            r17 = 1
            goto L_0x004c
        L_0x004a:
            r17 = 0
        L_0x004c:
            if (r17 == 0) goto L_0x0071
            java.lang.String r5 = "PluginLocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016a }
            java.lang.String r7 = "Resolving type "
            r6.<init>(r7)     // Catch:{ all -> 0x016a }
            r6.append(r13)     // Catch:{ all -> 0x016a }
            java.lang.String r7 = " scheme "
            r6.append(r7)     // Catch:{ all -> 0x016a }
            r6.append(r15)     // Catch:{ all -> 0x016a }
            java.lang.String r7 = " of intent "
            r6.append(r7)     // Catch:{ all -> 0x016a }
            r6.append(r0)     // Catch:{ all -> 0x016a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016a }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x016a }
        L_0x0071:
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord>> r5 = r1.f2008c     // Catch:{ all -> 0x016a }
            java.lang.String r6 = r22.getAction()     // Catch:{ all -> 0x016a }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x016a }
            r11 = r5
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ all -> 0x016a }
            if (r11 == 0) goto L_0x0167
            if (r17 == 0) goto L_0x0091
            java.lang.String r5 = "PluginLocalBroadcastManager"
            java.lang.String r6 = "Action list: "
            java.lang.String r7 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x016a }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ all -> 0x016a }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x016a }
        L_0x0091:
            r5 = 0
            r9 = r5
            r10 = 0
        L_0x0094:
            int r5 = r11.size()     // Catch:{ all -> 0x016a }
            if (r10 >= r5) goto L_0x0137
            java.lang.Object r5 = r11.get(r10)     // Catch:{ all -> 0x016a }
            r8 = r5
            com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord r8 = (com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.ReceiverRecord) r8     // Catch:{ all -> 0x016a }
            if (r17 == 0) goto L_0x00b8
            java.lang.String r5 = "PluginLocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x016a }
            java.lang.String r7 = "Matching against filter "
            r6.<init>(r7)     // Catch:{ all -> 0x016a }
            android.content.IntentFilter r7 = r8.f2019a     // Catch:{ all -> 0x016a }
            r6.append(r7)     // Catch:{ all -> 0x016a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x016a }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x016a }
        L_0x00b8:
            boolean r5 = r8.f2021c     // Catch:{ all -> 0x016a }
            if (r5 == 0) goto L_0x00cc
            if (r17 == 0) goto L_0x00c5
            java.lang.String r5 = "PluginLocalBroadcastManager"
            java.lang.String r6 = "  Filter's target already added"
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x016a }
        L_0x00c5:
            r4 = r9
            r19 = r10
            r20 = r11
            goto L_0x012e
        L_0x00cc:
            android.content.IntentFilter r5 = r8.f2019a     // Catch:{ all -> 0x016a }
            java.lang.String r18 = "PluginLocalBroadcastManager"
            r6 = r12
            r7 = r13
            r3 = r8
            r8 = r15
            r4 = r9
            r9 = r14
            r19 = r10
            r10 = r16
            r20 = r11
            r11 = r18
            int r5 = r5.match(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x016a }
            if (r5 < 0) goto L_0x010c
            if (r17 == 0) goto L_0x00fd
            java.lang.String r6 = "PluginLocalBroadcastManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x016a }
            java.lang.String r8 = "  Filter matched!  match=0x"
            r7.<init>(r8)     // Catch:{ all -> 0x016a }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x016a }
            r7.append(r5)     // Catch:{ all -> 0x016a }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x016a }
            android.util.Log.v(r6, r5)     // Catch:{ all -> 0x016a }
        L_0x00fd:
            if (r4 != 0) goto L_0x0105
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x016a }
            r9.<init>()     // Catch:{ all -> 0x016a }
            r4 = r9
        L_0x0105:
            r4.add(r3)     // Catch:{ all -> 0x016a }
            r5 = 1
            r3.f2021c = r5     // Catch:{ all -> 0x016a }
            goto L_0x012e
        L_0x010c:
            if (r17 == 0) goto L_0x012e
            switch(r5) {
                case -4: goto L_0x011d;
                case -3: goto L_0x011a;
                case -2: goto L_0x0117;
                case -1: goto L_0x0114;
                default: goto L_0x0111;
            }     // Catch:{ all -> 0x016a }
        L_0x0111:
            java.lang.String r3 = "unknown reason"
            goto L_0x011f
        L_0x0114:
            java.lang.String r3 = "type"
            goto L_0x011f
        L_0x0117:
            java.lang.String r3 = "data"
            goto L_0x011f
        L_0x011a:
            java.lang.String r3 = "action"
            goto L_0x011f
        L_0x011d:
            java.lang.String r3 = "category"
        L_0x011f:
            java.lang.String r5 = "PluginLocalBroadcastManager"
            java.lang.String r6 = "  Filter did not match: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x016a }
            java.lang.String r3 = r6.concat(r3)     // Catch:{ all -> 0x016a }
            android.util.Log.v(r5, r3)     // Catch:{ all -> 0x016a }
        L_0x012e:
            r9 = r4
            int r10 = r19 + 1
            r11 = r20
            r3 = 0
            r4 = 1
            goto L_0x0094
        L_0x0137:
            r4 = r9
            if (r4 == 0) goto L_0x0167
            r3 = 0
        L_0x013b:
            int r5 = r4.size()     // Catch:{ all -> 0x016a }
            if (r3 >= r5) goto L_0x014d
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x016a }
            com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$ReceiverRecord r5 = (com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.ReceiverRecord) r5     // Catch:{ all -> 0x016a }
            r6 = 0
            r5.f2021c = r6     // Catch:{ all -> 0x016a }
            int r3 = r3 + 1
            goto L_0x013b
        L_0x014d:
            java.util.ArrayList<com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord> r3 = r1.f2009d     // Catch:{ all -> 0x016a }
            com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord r5 = new com.qihoo360.replugin.loader.b.PluginLocalBroadcastManager$BroadcastRecord     // Catch:{ all -> 0x016a }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x016a }
            r3.add(r5)     // Catch:{ all -> 0x016a }
            android.os.Handler r0 = r1.f2010e     // Catch:{ all -> 0x016a }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x016a }
            if (r0 != 0) goto L_0x0165
            android.os.Handler r0 = r1.f2010e     // Catch:{ all -> 0x016a }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x016a }
        L_0x0165:
            monitor-exit(r2)     // Catch:{ all -> 0x016a }
            return r3
        L_0x0167:
            monitor-exit(r2)     // Catch:{ all -> 0x016a }
            r2 = 0
            return r2
        L_0x016a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x016a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qihoo360.replugin.loader.p018b.PluginLocalBroadcastManager.sendBroadcast(android.content.Intent):boolean");
    }

    public void sendBroadcastSync(Intent intent) {
        if (C0458e.f1989a) {
            try {
                ProxyLocalBroadcastManagerVar.f2018e.mo4633a(f2005h, intent);
            } catch (Exception unused) {
            }
        } else if (sendBroadcast(intent)) {
            m1554a();
        }
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        if (C0458e.f1989a) {
            try {
                ProxyLocalBroadcastManagerVar.f2016c.mo4633a(f2005h, broadcastReceiver);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            synchronized (this.f2007b) {
                ArrayList remove = this.f2007b.remove(broadcastReceiver);
                if (remove != null) {
                    for (int i = 0; i < remove.size(); i++) {
                        IntentFilter intentFilter = (IntentFilter) remove.get(i);
                        for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                            String action = intentFilter.getAction(i2);
                            ArrayList arrayList = this.f2008c.get(action);
                            if (arrayList != null) {
                                int i3 = 0;
                                while (i3 < arrayList.size()) {
                                    if (((ReceiverRecord) arrayList.get(i3)).f2020b == broadcastReceiver) {
                                        arrayList.remove(i3);
                                        i3--;
                                    }
                                    i3++;
                                }
                                if (arrayList.size() <= 0) {
                                    this.f2008c.remove(action);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
