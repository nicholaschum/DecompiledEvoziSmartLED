package p021wl.smartled.p027f;

import android.content.Context;
import java.util.List;
import p021wl.smartled.beans.C0525f;

/* renamed from: wl.smartled.f.j */
final class C0547j extends Thread {

    /* renamed from: a */
    final /* synthetic */ C0546i f2415a;

    /* renamed from: b */
    private Context f2416b;

    /* renamed from: c */
    private List<C0525f> f2417c;

    private C0547j(C0546i iVar, Context context) {
        this.f2415a = iVar;
        this.f2416b = context;
    }

    /* synthetic */ C0547j(C0546i iVar, Context context, byte b) {
        this(iVar, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r1 = r24
            super.run()
            long unused = p021wl.smartled.p027f.C0546i.f2411d = 0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2417c = r0
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            android.content.Context r0 = r1.f2416b     // Catch:{ IOException -> 0x0020 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0020 }
            java.lang.String r4 = "musics"
            java.lang.String[] r0 = r0.list(r4)     // Catch:{ IOException -> 0x0020 }
            r3 = r0
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0024:
            int r4 = r3.length
        L_0x0025:
            r5 = 0
            if (r2 >= r4) goto L_0x0125
            r8 = r3[r2]
            java.lang.String r0 = ".mp3"
            boolean r0 = r8.endsWith(r0)
            if (r0 == 0) goto L_0x0121
            android.media.MediaPlayer r15 = new android.media.MediaPlayer
            r15.<init>()
            java.lang.String r0 = "musics/"
            java.lang.String r9 = java.lang.String.valueOf(r8)
            java.lang.String r13 = r0.concat(r9)
            r15.reset()
            r0 = 3
            r15.setAudioStreamType(r0)
            android.content.Context r0 = r1.f2416b     // Catch:{ IOException -> 0x0074 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x0074 }
            android.content.res.AssetFileDescriptor r16 = r0.openFd(r13)     // Catch:{ IOException -> 0x0074 }
            long r17 = r16.getLength()     // Catch:{ IOException -> 0x006f }
            java.io.FileDescriptor r10 = r16.getFileDescriptor()     // Catch:{ IOException -> 0x006c }
            long r11 = r16.getStartOffset()     // Catch:{ IOException -> 0x006c }
            r9 = r15
            r7 = r13
            r13 = r17
            r9.setDataSource(r10, r11, r13)     // Catch:{ IOException -> 0x006a }
            r15.prepare()     // Catch:{ IOException -> 0x006a }
            goto L_0x007d
        L_0x006a:
            r0 = move-exception
            goto L_0x007a
        L_0x006c:
            r0 = move-exception
            r7 = r13
            goto L_0x007a
        L_0x006f:
            r0 = move-exception
            r7 = r13
            r17 = r5
            goto L_0x007a
        L_0x0074:
            r0 = move-exception
            r7 = r13
            r17 = r5
            r16 = 0
        L_0x007a:
            r0.printStackTrace()
        L_0x007d:
            r13 = r17
            int r0 = r15.getDuration()
            long r11 = (long) r0
            r15.release()
            if (r16 == 0) goto L_0x00de
            android.media.MediaMetadataRetriever r15 = new android.media.MediaMetadataRetriever
            r15.<init>()
            java.io.FileDescriptor r10 = r16.getFileDescriptor()
            long r17 = r16.getStartOffset()
            r9 = r15
            r20 = r11
            r11 = r17
            r22 = r13
            r9.setDataSource(r10, r11, r13)
            r0 = 7
            java.lang.String r9 = r15.extractMetadata(r0)
            r0 = 1
            java.lang.String r10 = r15.extractMetadata(r0)
            r0 = 2
            java.lang.String r11 = r15.extractMetadata(r0)
            int r0 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00cd
            r0 = 9
            java.lang.String r0 = r15.extractMetadata(r0)
            if (r0 == 0) goto L_0x00c1
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x00c3
        L_0x00c1:
            java.lang.String r0 = "0"
        L_0x00c3:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r5 = r0.longValue()
            r20 = r5
        L_0x00cd:
            r16.close()     // Catch:{ IOException -> 0x00d1 }
            goto L_0x00d6
        L_0x00d1:
            r0 = move-exception
            r5 = r0
            r5.printStackTrace()
        L_0x00d6:
            r15.release()
            r19 = r9
            r5 = r20
            goto L_0x00e8
        L_0x00de:
            r20 = r11
            r22 = r13
            r5 = r20
            r10 = 0
            r11 = 0
            r19 = 0
        L_0x00e8:
            if (r19 != 0) goto L_0x00f2
            java.lang.String r0 = ".mp3"
            java.lang.String r9 = ""
            java.lang.String r19 = r8.replace(r0, r9)
        L_0x00f2:
            r0 = r19
            wl.smartled.beans.f r9 = new wl.smartled.beans.f
            r9.<init>()
            long r12 = p021wl.smartled.p027f.C0546i.m1914e()
            r9.mo4910a((long) r12)
            int r12 = p021wl.smartled.beans.C0526g.f2361a
            r9.mo4909a((int) r12)
            r9.mo4911a((java.lang.String) r0)
            r9.mo4914b((java.lang.String) r11)
            r9.mo4917c((java.lang.String) r10)
            r9.mo4913b((long) r5)
            r9.mo4919d(r7)
            r9.mo4921e(r8)
            r5 = r22
            r9.mo4916c((long) r5)
            java.util.List<wl.smartled.beans.f> r0 = r1.f2417c
            r0.add(r9)
        L_0x0121:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0125:
            java.util.List<wl.smartled.beans.f> r0 = r1.f2417c
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0147
            wl.smartled.f.i r0 = r1.f2415a
            boolean r0 = r0.f2412a
            if (r0 == 0) goto L_0x0147
            wl.smartled.f.i r0 = r1.f2415a
            wl.smartled.f.k r0 = r0.f2414c
            java.util.List<wl.smartled.beans.f> r2 = r1.f2417c
            r0.mo5015a(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2417c = r0
        L_0x0147:
            android.content.Context r0 = r1.f2416b
            android.content.ContentResolver r7 = r0.getContentResolver()
            android.net.Uri r8 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            r9 = 0
            java.lang.String r10 = "_data like '%.flac' or _data like '%.mp3' or _data like '%.wma' or _data like '%.ape' or _data like '%.wav' or _data like '%.m4a' or _data like '%.aac'"
            r11 = 0
            java.lang.String r12 = "title_key"
            android.database.Cursor r0 = r7.query(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L_0x0290
        L_0x015b:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L_0x0272
            wl.smartled.f.i r2 = r1.f2415a
            boolean r2 = r2.f2412a
            if (r2 == 0) goto L_0x0272
            java.lang.String r2 = "is_music"
            int r2 = r0.getColumnIndex(r2)
            r0.getInt(r2)
            java.lang.String r2 = "_data"
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            android.content.Context r3 = r1.f2416b
            android.net.Uri r4 = android.net.Uri.parse(r2)
            android.media.MediaPlayer r3 = android.media.MediaPlayer.create(r3, r4)
            if (r3 == 0) goto L_0x0191
            int r4 = r3.getDuration()
            long r7 = (long) r4
            r3.release()
            goto L_0x0192
        L_0x0191:
            r7 = r5
        L_0x0192:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01a0
            java.lang.String r3 = "duration"
            int r3 = r0.getColumnIndex(r3)
            long r7 = r0.getLong(r3)
        L_0x01a0:
            java.lang.String r3 = "MusicScanUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "run----->type = "
            r4.<init>(r9)
            java.lang.String r9 = "mime_type"
            int r9 = r0.getColumnIndex(r9)
            java.lang.String r9 = r0.getString(r9)
            r4.append(r9)
            java.lang.String r9 = ", name = "
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = ", duration = "
            r4.append(r9)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r3, r4)
            r3 = 60000(0xea60, double:2.9644E-319)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x015b
            java.lang.String r3 = "_id"
            int r3 = r0.getColumnIndex(r3)
            r0.getLong(r3)
            java.lang.String r3 = "title"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "artist"
            int r4 = r0.getColumnIndex(r4)
            java.lang.String r4 = r0.getString(r4)
            android.content.Context r9 = r1.f2416b
            r10 = 2131492967(0x7f0c0067, float:1.86094E38)
            java.lang.String r9 = r9.getString(r10)
            java.lang.String r10 = "<unknown>"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x0203
            r4 = r9
        L_0x0203:
            java.lang.String r9 = "album"
            int r9 = r0.getColumnIndex(r9)
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r10 = "_display_name"
            int r10 = r0.getColumnIndex(r10)
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r11 = "_size"
            int r11 = r0.getColumnIndex(r11)
            long r11 = r0.getLong(r11)
            wl.smartled.beans.f r13 = new wl.smartled.beans.f
            r13.<init>()
            long r14 = p021wl.smartled.p027f.C0546i.m1914e()
            r13.mo4910a((long) r14)
            int r14 = p021wl.smartled.beans.C0526g.f2362b
            r13.mo4909a((int) r14)
            r13.mo4911a((java.lang.String) r3)
            r13.mo4914b((java.lang.String) r4)
            r13.mo4917c((java.lang.String) r9)
            r13.mo4913b((long) r7)
            r13.mo4919d(r2)
            r13.mo4921e(r10)
            r13.mo4916c((long) r11)
            java.util.List<wl.smartled.beans.f> r2 = r1.f2417c
            r2.add(r13)
            java.util.List<wl.smartled.beans.f> r2 = r1.f2417c
            int r2 = r2.size()
            int r2 = r2 % 20
            if (r2 != 0) goto L_0x015b
            wl.smartled.f.i r2 = r1.f2415a
            boolean r2 = r2.f2412a
            if (r2 == 0) goto L_0x015b
            wl.smartled.f.i r2 = r1.f2415a
            wl.smartled.f.k r2 = r2.f2414c
            java.util.List<wl.smartled.beans.f> r3 = r1.f2417c
            r2.mo5015a(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2417c = r2
            goto L_0x015b
        L_0x0272:
            wl.smartled.f.i r2 = r1.f2415a
            wl.smartled.f.k r2 = r2.f2414c
            if (r2 == 0) goto L_0x028d
            wl.smartled.f.i r2 = r1.f2415a
            boolean r2 = r2.f2412a
            if (r2 == 0) goto L_0x028d
            wl.smartled.f.i r2 = r1.f2415a
            wl.smartled.f.k r2 = r2.f2414c
            java.util.List<wl.smartled.beans.f> r3 = r1.f2417c
            r2.mo5015a(r3)
        L_0x028d:
            r0.close()
        L_0x0290:
            r2 = 0
            r1.f2416b = r2
            r1.f2417c = r2
            wl.smartled.f.i r0 = r1.f2415a
            boolean unused = r0.f2412a = false
            wl.smartled.f.i r0 = r1.f2415a
            p021wl.smartled.p027f.C0547j unused = r0.f2413b = null
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021wl.smartled.p027f.C0547j.run():void");
    }
}
