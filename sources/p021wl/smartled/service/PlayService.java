package p021wl.smartled.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.support.p007v4.content.LocalBroadcastManager;
import android.support.p007v4.provider.FontsContractCompat;
import android.util.Log;
import android.widget.RemoteViews;
import com.qihoo360.replugin.library.C0462R;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import p021wl.smartled.activity.MainActivity;
import p021wl.smartled.beans.C0522c;
import p021wl.smartled.beans.C0525f;
import p021wl.smartled.beans.C0526g;
import p021wl.smartled.p023b.C0517e;
import p021wl.smartled.p023b.C0519g;
import p021wl.smartled.p024c.C0529b;
import p021wl.smartled.p027f.C0546i;
import p021wl.smartled.p027f.C0548k;
import p021wl.smartled.p027f.C0549l;
import p021wl.smartled.receiver.NoisyAudioStreamReceiver;

/* renamed from: wl.smartled.service.PlayService */
public class PlayService extends Service implements AudioManager.OnAudioFocusChangeListener, MediaPlayer.OnCompletionListener, Visualizer.OnDataCaptureListener, C0548k {

    /* renamed from: q */
    private static String[] f2591q = {"huawei"};
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static boolean f2592t = false;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Handler f2593A = new C0590q(this);

    /* renamed from: B */
    private BroadcastReceiver f2594B = new C0592s(this);

    /* renamed from: C */
    private MediaPlayer.OnPreparedListener f2595C = new C0594u(this);

    /* renamed from: D */
    private Runnable f2596D = new C0595v(this);

    /* renamed from: E */
    private Runnable f2597E = new C0596w(this);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public List<C0525f> f2598a = C0529b.m1814a().mo4943b();

    /* renamed from: b */
    private IntentFilter f2599b = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");

    /* renamed from: c */
    private NoisyAudioStreamReceiver f2600c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f2601d = new Handler();

    /* renamed from: e */
    private AudioManager f2602e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C0599z f2603f;

    /* renamed from: g */
    private boolean f2604g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f2605h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C0525f f2606i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f2607j = -1;

    /* renamed from: k */
    private boolean f2608k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f2609l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f2610m;

    /* renamed from: n */
    private C0519g f2611n = C0519g.LOOP;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public MediaPlayer f2612o = new MediaPlayer();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public Visualizer f2613p;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public MediaPlayer f2614r = new MediaPlayer();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Visualizer f2615s;

    /* renamed from: u */
    private C0546i f2616u;

    /* renamed from: v */
    private byte[] f2617v = new byte[11];
    /* access modifiers changed from: private */

    /* renamed from: w */
    public RemoteViews f2618w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public Notification f2619x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public NotificationManager f2620y;

    /* renamed from: z */
    private C0598y f2621z;

    /* renamed from: a */
    public static void m2068a(Context context, String str) {
        Intent intent = new Intent(context, PlayService.class);
        intent.setAction(str);
        context.startService(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2069a(String str, RemoteViews remoteViews) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CHANGE_MODE");
        intent.putExtra("wl.extra.music.service.notification.change.mode", 2);
        Notification.Builder builder = new Notification.Builder(this);
        builder.setContentIntent(PendingIntent.getActivity(this, 0, intent, 134217728)).setContentTitle(getString(C0462R.string.app_name)).setSmallIcon(C0462R.mipmap.ic_launcher2).setWhen(System.currentTimeMillis()).setNumber(0).setAutoCancel(false).setOngoing(true);
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setChannelId(str);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setVisibility(1);
            builder.setCustomContentView(remoteViews);
        }
        this.f2619x = builder.build();
    }

    /* renamed from: l */
    static /* synthetic */ void m2082l(PlayService playService) {
        if (C0522c.m1758a(playService) != 2) {
            Intent intent = new Intent();
            intent.setAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CHANGE_MODE");
            intent.putExtra("wl.extra.music.service.notification.change.mode", 2);
            LocalBroadcastManager.getInstance(playService).sendBroadcast(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m2087o() {
        if (this.f2618w == null) {
            this.f2618w = new RemoteViews(getPackageName(), C0462R.layout.music_notification);
            this.f2618w.setOnClickPendingIntent(C0462R.C0464id.id_iv_play_prev_music, PendingIntent.getBroadcast(this, (int) System.currentTimeMillis(), new Intent("wl.action.music.MUSIC_SERVICE_NOTIFICATION_PREVIOUS"), 134217728));
            this.f2618w.setOnClickPendingIntent(C0462R.C0464id.id_iv_play_next_music, PendingIntent.getBroadcast(this, (int) System.currentTimeMillis(), new Intent("wl.action.music.MUSIC_SERVICE_NOTIFICATION_NEXT"), 134217728));
            this.f2618w.setOnClickPendingIntent(C0462R.C0464id.id_iv_play_pause_music, PendingIntent.getBroadcast(this, (int) System.currentTimeMillis(), new Intent("wl.action.music.MUSIC_SERVICE_NOTIFICATION_PLAY_PAUSE"), 134217728));
            this.f2618w.setOnClickPendingIntent(C0462R.C0464id.id_iv_close_notification, PendingIntent.getBroadcast(this, (int) System.currentTimeMillis(), new Intent("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CLOSE"), 134217728));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m2089p() {
        this.f2612o.start();
        this.f2608k = false;
        this.f2601d.post(this.f2596D);
        this.f2602e.requestAudioFocus(this, 3, 1);
        if (this.f2600c == null) {
            this.f2600c = new NoisyAudioStreamReceiver();
            registerReceiver(this.f2600c, this.f2599b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m2091q() {
        if (mo5095g()) {
            if (this.f2615s != null) {
                this.f2615s.setEnabled(false);
            }
            if (this.f2613p != null) {
                this.f2613p.setEnabled(false);
            }
            if (f2592t) {
                this.f2614r.pause();
            }
            this.f2612o.pause();
            this.f2608k = true;
            this.f2601d.removeCallbacks(this.f2596D);
            this.f2602e.abandonAudioFocus(this);
            if (this.f2600c != null) {
                unregisterReceiver(this.f2600c);
                this.f2600c = null;
            }
            if (this.f2603f != null) {
                this.f2603f.mo5038c();
            }
            this.f2593A.sendEmptyMessageDelayed(500, 200);
        }
    }

    /* renamed from: r */
    private void m2092r() {
        if (mo5096h()) {
            m2089p();
            if (this.f2615s != null) {
                this.f2615s.setEnabled(true);
            }
            if (this.f2613p != null) {
                this.f2613p.setEnabled(true);
            }
            if (this.f2603f != null) {
                this.f2603f.mo5039d();
            }
            this.f2593A.sendEmptyMessageDelayed(500, 200);
        }
    }

    /* renamed from: s */
    private boolean m2095s() {
        return this.f2612o != null && this.f2609l;
    }

    /* renamed from: t */
    private void m2097t() {
        this.f2601d.removeCallbacks(this.f2597E);
    }

    /* renamed from: a */
    public final void mo5085a() {
        if (this.f2598a.size() == 0 && this.f2616u == null) {
            this.f2616u = new C0546i(this, this);
            this.f2616u.mo5011a();
            if (this.f2603f != null) {
                this.f2603f.mo5033a();
            }
        }
    }

    /* renamed from: a */
    public final void mo5086a(int i) {
        if (!m2095s() && !this.f2598a.isEmpty()) {
            if (i < 0) {
                i = this.f2598a.size() - 1;
            } else if (i >= this.f2598a.size()) {
                i = 0;
            }
            this.f2607j = i;
            C0525f fVar = this.f2598a.get(this.f2607j);
            if (!m2095s() && !this.f2598a.isEmpty()) {
                this.f2606i = fVar;
                try {
                    if (f2592t) {
                        this.f2614r.reset();
                        this.f2614r.setAudioStreamType(3);
                        if (fVar.mo4908a() == C0526g.f2361a) {
                            AssetFileDescriptor openFd = getAssets().openFd(fVar.mo4923f());
                            if (openFd != null) {
                                this.f2614r.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                                openFd.close();
                            }
                        } else {
                            this.f2614r.setDataSource(fVar.mo4923f());
                        }
                        this.f2614r.setLooping(true);
                        this.f2614r.setVolume(0.0f, 0.0f);
                        this.f2614r.prepare();
                        this.f2614r.start();
                    }
                    this.f2612o.reset();
                    this.f2612o.setAudioStreamType(3);
                    if (fVar.mo4908a() == C0526g.f2361a) {
                        AssetFileDescriptor openFd2 = getAssets().openFd(fVar.mo4923f());
                        if (openFd2 != null) {
                            this.f2612o.setDataSource(openFd2.getFileDescriptor(), openFd2.getStartOffset(), openFd2.getLength());
                            openFd2.close();
                        }
                    } else {
                        this.f2612o.setDataSource(fVar.mo4923f());
                    }
                    this.f2612o.prepareAsync();
                    this.f2609l = true;
                    this.f2612o.setOnPreparedListener(this.f2595C);
                    if (this.f2603f != null) {
                        this.f2603f.mo5037b();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f2593A.sendEmptyMessageDelayed(500, 200);
            }
            if (this.f2615s != null) {
                this.f2615s.setEnabled(true);
            }
            if (this.f2613p != null) {
                this.f2613p.setEnabled(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo5015a(List<C0525f> list) {
        this.f2593A.post(new C0593t(this, list));
    }

    /* renamed from: a */
    public final void mo5087a(C0519g gVar) {
        this.f2611n = gVar;
    }

    /* renamed from: a */
    public final void mo5088a(C0599z zVar) {
        this.f2603f = zVar;
    }

    /* renamed from: b */
    public final void mo5089b(int i) {
        if (mo5095g() || mo5096h()) {
            this.f2612o.seekTo(i);
            if (f2592t) {
                this.f2614r.seekTo(i);
            }
            if (this.f2603f != null) {
                this.f2603f.mo5034a(i);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo5090b() {
        return this.f2616u != null && this.f2616u.mo5013c();
    }

    /* renamed from: c */
    public final void mo5091c() {
        if (!m2095s() && !this.f2598a.isEmpty()) {
            if (mo5095g()) {
                m2091q();
            } else if (mo5096h()) {
                m2092r();
            } else {
                mo5086a(this.f2607j);
            }
        }
    }

    /* renamed from: d */
    public final C0519g mo5092d() {
        return this.f2611n;
    }

    /* renamed from: e */
    public final void mo5093e() {
        int i;
        if (!this.f2616u.mo5013c() && !this.f2598a.isEmpty()) {
            switch (C0597x.f2677a[this.f2611n.ordinal()]) {
                case 1:
                    this.f2607j = new Random().nextInt(this.f2598a.size());
                    break;
                case 2:
                    break;
                default:
                    i = this.f2607j + 1;
                    break;
            }
            i = this.f2607j;
            mo5086a(i);
        }
    }

    /* renamed from: f */
    public final void mo5094f() {
        int i;
        if (!this.f2616u.mo5013c() && !this.f2598a.isEmpty()) {
            switch (C0597x.f2677a[this.f2611n.ordinal()]) {
                case 1:
                    this.f2607j = new Random().nextInt(this.f2598a.size());
                    break;
                case 2:
                    break;
                default:
                    i = this.f2607j - 1;
                    break;
            }
            i = this.f2607j;
            mo5086a(i);
        }
    }

    /* renamed from: g */
    public final boolean mo5095g() {
        return this.f2612o != null && this.f2612o.isPlaying();
    }

    /* renamed from: h */
    public final boolean mo5096h() {
        return this.f2612o != null && this.f2608k;
    }

    /* renamed from: i */
    public final int mo5097i() {
        return this.f2607j;
    }

    /* renamed from: j */
    public final C0525f mo5098j() {
        return this.f2606i;
    }

    /* renamed from: k */
    public final void mo5099k() {
        int i = 0;
        long b = this.f2598a.get(this.f2607j >= 0 ? this.f2607j : 0).mo4912b();
        int i2 = 0;
        while (true) {
            if (i2 >= this.f2598a.size()) {
                break;
            } else if (this.f2598a.get(i2).mo4912b() == b) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        this.f2607j = i;
    }

    /* renamed from: l */
    public final void mo5100l() {
        m2091q();
        m2097t();
        if (f2592t) {
            this.f2614r.reset();
            this.f2614r.release();
            this.f2614r = null;
        }
        this.f2612o.reset();
        this.f2612o.release();
        this.f2612o = null;
    }

    /* renamed from: m */
    public final List<C0525f> mo5101m() {
        return this.f2598a;
    }

    public void onAudioFocusChange(int i) {
        switch (i) {
            case FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR:
            case -2:
            case -1:
                m2091q();
                return;
            default:
                return;
        }
    }

    public IBinder onBind(Intent intent) {
        C0549l.m1921a((Context) this, C0517e.f2294h);
        return new C0567aa(this);
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mo5093e();
    }

    public void onCreate() {
        super.onCreate();
        Log.i("PlayService", "onCreate: " + getClass().getSimpleName());
        String[] strArr = f2591q;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (Build.MANUFACTURER.toLowerCase().contains(strArr[i])) {
                f2592t = true;
                break;
            }
            i++;
        }
        this.f2602e = (AudioManager) getSystemService("audio");
        this.f2612o.setOnCompletionListener(this);
        this.f2614r.setOnCompletionListener(this);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.f2594B, new IntentFilter("wl.action.ACTION_REQUEST_PERMISSION_RESULT"));
    }

    public void onDestroy() {
        mo5100l();
        if (this.f2616u != null) {
            this.f2616u.mo5012b();
            this.f2616u = null;
        }
        if (this.f2615s != null) {
            this.f2615s.setEnabled(false);
        }
        if (this.f2613p != null) {
            this.f2613p.setEnabled(false);
        }
        if (this.f2605h) {
            stopForeground(true);
        }
        this.f2593A.removeCallbacksAndMessages((Object) null);
        if (this.f2594B != null) {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f2594B);
        }
        if (this.f2621z != null) {
            unregisterReceiver(this.f2621z);
        }
        if (this.f2600c != null) {
            unregisterReceiver(this.f2600c);
        }
        super.onDestroy();
        Log.i("PlayService", "onDestroy: " + getClass().getSimpleName());
    }

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        this.f2617v[0] = (byte) Math.abs(bArr[1]);
        int i2 = 1;
        for (int i3 = 2; i3 < 18; i3 += 2) {
            this.f2617v[i2] = (byte) ((int) Math.hypot((double) bArr[i3], (double) bArr[i3 + 1]));
            i2++;
        }
        if (this.f2603f != null) {
            this.f2603f.mo5036a(this.f2617v);
        }
    }

    public void onRebind(Intent intent) {
        C0549l.m1921a((Context) this, C0517e.f2294h);
        super.onRebind(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!(intent == null || intent.getAction() == null)) {
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -322758349) {
                if (hashCode != 968257327) {
                    if (hashCode == 1938074695 && action.equals("wl.action.music.ACTION_MEDIA_PLAY_PAUSE")) {
                        c = 0;
                    }
                } else if (action.equals("wl.action.music.ACTION_MEDIA_NEXT")) {
                    c = 1;
                }
            } else if (action.equals("wl.action.music.ACTION_MEDIA_PREVIOUS")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    mo5091c();
                    break;
                case 1:
                    mo5093e();
                    break;
                case 2:
                    mo5094f();
                    break;
            }
        }
        if (!"ELK".equals("replugin") && !this.f2605h) {
            this.f2620y = (NotificationManager) getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("PlayService", getString(C0462R.string.app_name), 2);
                notificationChannel.enableLights(false);
                notificationChannel.setBypassDnd(true);
                notificationChannel.setShowBadge(false);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.enableVibration(false);
                notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                if (this.f2620y != null) {
                    this.f2620y.createNotificationChannel(notificationChannel);
                }
            }
            m2087o();
            m2069a("PlayService", this.f2618w);
            startForeground(100, this.f2619x);
            this.f2605h = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_PREVIOUS");
            intentFilter.addAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_NEXT");
            intentFilter.addAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_PLAY_PAUSE");
            intentFilter.addAction("wl.action.music.MUSIC_SERVICE_NOTIFICATION_CLOSE");
            this.f2621z = new C0598y(this, (byte) 0);
            registerReceiver(this.f2621z, intentFilter);
        }
        this.f2604g = true;
        return super.onStartCommand(intent, 1, i2);
    }

    public boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        return true;
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }
}
