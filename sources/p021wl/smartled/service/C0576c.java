package p021wl.smartled.service;

import android.media.AudioRecord;

/* renamed from: wl.smartled.service.c */
final class C0576c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AudioRecorderService f2652a;

    C0576c(AudioRecorderService audioRecorderService) {
        this.f2652a = audioRecorderService;
    }

    public final void run() {
        this.f2652a.f2536c.startRecording();
        while (this.f2652a.f2537d) {
            try {
                int read = this.f2652a.f2536c.read(AudioRecorderService.f2535b, 0, AudioRecorderService.f2534a);
                long j = 0;
                for (int i = 0; i < AudioRecorderService.f2535b.length; i++) {
                    j += (long) (AudioRecorderService.f2535b[i] * AudioRecorderService.f2535b[i]);
                }
                double log10 = Math.log10(((double) j) / ((double) read)) * 10.0d;
                if (this.f2652a.f2540g != null) {
                    this.f2652a.f2540g.mo4766a(log10);
                }
                synchronized (this.f2652a.f2538e) {
                    this.f2652a.f2538e.wait(150);
                }
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Throwable th) {
                    this.f2652a.f2536c.stop();
                    this.f2652a.f2536c.release();
                    AudioRecord unused = this.f2652a.f2536c = null;
                    throw th;
                }
            }
        }
        this.f2652a.f2536c.stop();
        this.f2652a.f2536c.release();
        AudioRecord unused2 = this.f2652a.f2536c = null;
    }
}
