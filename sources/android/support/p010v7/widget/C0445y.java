package android.support.p010v7.widget;

import android.os.AsyncTask;

/* renamed from: android.support.v7.widget.y */
final class C0445y extends AsyncTask<Object, Void, Void> {

    /* renamed from: a */
    final /* synthetic */ C0439s f1913a;

    C0445y(C0439s sVar) {
        this.f1913a = sVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006d, code lost:
        if (r4 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0091, code lost:
        if (r4 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        if (r4 == null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cf, code lost:
        if (r4 == null) goto L_0x00d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void doInBackground(java.lang.Object... r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r12[r0]
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            r12 = r12[r2]
            java.lang.String r12 = (java.lang.String) r12
            r3 = 0
            android.support.v7.widget.s r4 = r11.f1913a     // Catch:{ FileNotFoundException -> 0x00dd }
            android.content.Context r4 = r4.f1894b     // Catch:{ FileNotFoundException -> 0x00dd }
            java.io.FileOutputStream r4 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x00dd }
            org.xmlpull.v1.XmlSerializer r12 = android.util.Xml.newSerializer()
            r12.setOutput(r4, r3)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r5 = "UTF-8"
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            r12.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r5 = "historical-records"
            r12.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            r6 = 0
        L_0x002b:
            if (r6 >= r5) goto L_0x0061
            java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            android.support.v7.widget.w r7 = (android.support.p010v7.widget.C0443w) r7     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r8 = "historical-record"
            r12.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r8 = "activity"
            android.content.ComponentName r9 = r7.f1910a     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r8 = "time"
            long r9 = r7.f1911b     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r8 = "weight"
            float r7 = r7.f1912c     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            r12.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            java.lang.String r7 = "historical-record"
            r12.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0061:
            java.lang.String r0 = "historical-records"
            r12.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            r12.endDocument()     // Catch:{ IllegalArgumentException -> 0x00b3, IllegalStateException -> 0x0094, IOException -> 0x0075 }
            android.support.v7.widget.s r12 = r11.f1913a
            r12.f1896d = r2
            if (r4 == 0) goto L_0x00d2
        L_0x006f:
            r4.close()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00d2
        L_0x0073:
            r12 = move-exception
            goto L_0x00d3
        L_0x0075:
            r12 = move-exception
            java.lang.String r0 = android.support.p010v7.widget.C0439s.f1891a     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "Error writing historical record file: "
            r1.<init>(r5)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.s r5 = r11.f1913a     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = r5.f1895c     // Catch:{ all -> 0x0073 }
            r1.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
            android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.s r12 = r11.f1913a
            r12.f1896d = r2
            if (r4 == 0) goto L_0x00d2
            goto L_0x006f
        L_0x0094:
            r12 = move-exception
            java.lang.String r0 = android.support.p010v7.widget.C0439s.f1891a     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "Error writing historical record file: "
            r1.<init>(r5)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.s r5 = r11.f1913a     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = r5.f1895c     // Catch:{ all -> 0x0073 }
            r1.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
            android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.s r12 = r11.f1913a
            r12.f1896d = r2
            if (r4 == 0) goto L_0x00d2
            goto L_0x006f
        L_0x00b3:
            r12 = move-exception
            java.lang.String r0 = android.support.p010v7.widget.C0439s.f1891a     // Catch:{ all -> 0x0073 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = "Error writing historical record file: "
            r1.<init>(r5)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.s r5 = r11.f1913a     // Catch:{ all -> 0x0073 }
            java.lang.String r5 = r5.f1895c     // Catch:{ all -> 0x0073 }
            r1.append(r5)     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0073 }
            android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0073 }
            android.support.v7.widget.s r12 = r11.f1913a
            r12.f1896d = r2
            if (r4 == 0) goto L_0x00d2
            goto L_0x006f
        L_0x00d2:
            return r3
        L_0x00d3:
            android.support.v7.widget.s r0 = r11.f1913a
            r0.f1896d = r2
            if (r4 == 0) goto L_0x00dc
            r4.close()     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            throw r12
        L_0x00dd:
            r0 = move-exception
            java.lang.String r1 = android.support.p010v7.widget.C0439s.f1891a
            java.lang.String r2 = "Error writing historical record file: "
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r12 = r2.concat(r12)
            android.util.Log.e(r1, r12, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.C0445y.doInBackground(java.lang.Object[]):java.lang.Void");
    }
}
