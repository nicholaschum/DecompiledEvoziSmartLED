package android.support.p007v4.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.util.Log;
import java.io.FileNotFoundException;

/* renamed from: android.support.v4.print.PrintHelper */
public final class PrintHelper {
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_COLOR = 2;
    @SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_MONOCHROME = 1;
    static final boolean IS_MIN_MARGINS_HANDLING_CORRECT;
    private static final String LOG_TAG = "PrintHelper";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION = (Build.VERSION.SDK_INT < 20 || Build.VERSION.SDK_INT > 23);
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode = 2;
    final Context mContext;
    BitmapFactory.Options mDecodeOptions = null;
    final Object mLock = new Object();
    int mOrientation = 1;
    int mScaleMode = 2;

    /* renamed from: android.support.v4.print.PrintHelper$OnPrintFinishCallback */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintBitmapAdapter */
    class PrintBitmapAdapter extends PrintDocumentAdapter {
        private PrintAttributes mAttributes;
        private final Bitmap mBitmap;
        private final OnPrintFinishCallback mCallback;
        private final int mFittingMode;
        private final String mJobName;

        PrintBitmapAdapter(String str, int i, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
            this.mJobName = str;
            this.mFittingMode = i;
            this.mBitmap = bitmap;
            this.mCallback = onPrintFinishCallback;
        }

        public void onFinish() {
            if (this.mCallback != null) {
                this.mCallback.onFinish();
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            this.mAttributes = printAttributes2;
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    /* renamed from: android.support.v4.print.PrintHelper$PrintUriAdapter */
    class PrintUriAdapter extends PrintDocumentAdapter {
        PrintAttributes mAttributes;
        Bitmap mBitmap = null;
        final OnPrintFinishCallback mCallback;
        final int mFittingMode;
        final Uri mImageFile;
        final String mJobName;
        AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;

        PrintUriAdapter(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback, int i) {
            this.mJobName = str;
            this.mImageFile = uri;
            this.mCallback = onPrintFinishCallback;
            this.mFittingMode = i;
        }

        /* access modifiers changed from: package-private */
        public void cancelLoad() {
            synchronized (PrintHelper.this.mLock) {
                if (PrintHelper.this.mDecodeOptions != null) {
                    if (Build.VERSION.SDK_INT < 24) {
                        PrintHelper.this.mDecodeOptions.requestCancelDecode();
                    }
                    PrintHelper.this.mDecodeOptions = null;
                }
            }
        }

        public void onFinish() {
            super.onFinish();
            cancelLoad();
            if (this.mLoadBitmap != null) {
                this.mLoadBitmap.cancel(true);
            }
            if (this.mCallback != null) {
                this.mCallback.onFinish();
            }
            if (this.mBitmap != null) {
                this.mBitmap.recycle();
                this.mBitmap = null;
            }
        }

        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.mAttributes = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.mBitmap != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.mJobName).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                final CancellationSignal cancellationSignal2 = cancellationSignal;
                final PrintAttributes printAttributes3 = printAttributes2;
                final PrintAttributes printAttributes4 = printAttributes;
                final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback2 = layoutResultCallback;
                this.mLoadBitmap = new AsyncTask<Uri, Boolean, Bitmap>() {
                    /* access modifiers changed from: protected */
                    public Bitmap doInBackground(Uri... uriArr) {
                        try {
                            return PrintHelper.this.loadConstrainedBitmap(PrintUriAdapter.this.mImageFile);
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }

                    /* access modifiers changed from: protected */
                    public void onCancelled(Bitmap bitmap) {
                        layoutResultCallback2.onLayoutCancelled();
                        PrintUriAdapter.this.mLoadBitmap = null;
                    }

                    /* access modifiers changed from: protected */
                    public void onPostExecute(Bitmap bitmap) {
                        PrintAttributes.MediaSize mediaSize;
                        super.onPostExecute(bitmap);
                        if (bitmap != null && (!PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION || PrintHelper.this.mOrientation == 0)) {
                            synchronized (this) {
                                mediaSize = PrintUriAdapter.this.mAttributes.getMediaSize();
                            }
                            if (!(mediaSize == null || mediaSize.isPortrait() == PrintHelper.isPortrait(bitmap))) {
                                Matrix matrix = new Matrix();
                                matrix.postRotate(90.0f);
                                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                            }
                        }
                        PrintUriAdapter.this.mBitmap = bitmap;
                        if (bitmap != null) {
                            layoutResultCallback2.onLayoutFinished(new PrintDocumentInfo.Builder(PrintUriAdapter.this.mJobName).setContentType(1).setPageCount(1).build(), true ^ printAttributes3.equals(printAttributes4));
                        } else {
                            layoutResultCallback2.onLayoutFailed((CharSequence) null);
                        }
                        PrintUriAdapter.this.mLoadBitmap = null;
                    }

                    /* access modifiers changed from: protected */
                    public void onPreExecute() {
                        cancellationSignal2.setOnCancelListener(new CancellationSignal.OnCancelListener() {
                            public void onCancel() {
                                PrintUriAdapter.this.cancelLoad();
                                C01291.this.cancel(false);
                            }
                        });
                    }
                }.execute(new Uri[0]);
            }
        }

        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            PrintHelper.this.writeBitmap(this.mAttributes, this.mFittingMode, this.mBitmap, parcelFileDescriptor, cancellationSignal, writeResultCallback);
        }
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT != 23) {
            z = true;
        }
        IS_MIN_MARGINS_HANDLING_CORRECT = z;
    }

    public PrintHelper(Context context) {
        this.mContext = context;
    }

    static Bitmap convertBitmapForColorMode(Bitmap bitmap, int i) {
        if (i != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    private static PrintAttributes.Builder copyAttributes(PrintAttributes printAttributes) {
        PrintAttributes.Builder minMargins = new PrintAttributes.Builder().setMediaSize(printAttributes.getMediaSize()).setResolution(printAttributes.getResolution()).setMinMargins(printAttributes.getMinMargins());
        if (printAttributes.getColorMode() != 0) {
            minMargins.setColorMode(printAttributes.getColorMode());
        }
        if (Build.VERSION.SDK_INT >= 23 && printAttributes.getDuplexMode() != 0) {
            minMargins.setDuplexMode(printAttributes.getDuplexMode());
        }
        return minMargins;
    }

    static Matrix getMatrix(int i, int i2, RectF rectF, int i3) {
        Matrix matrix = new Matrix();
        float f = (float) i;
        float width = rectF.width() / f;
        float max = i3 == 2 ? Math.max(width, rectF.height() / ((float) i2)) : Math.min(width, rectF.height() / ((float) i2));
        matrix.postScale(max, max);
        matrix.postTranslate((rectF.width() - (f * max)) / 2.0f, (rectF.height() - (((float) i2) * max)) / 2.0f);
        return matrix;
    }

    static boolean isPortrait(Bitmap bitmap) {
        return bitmap.getWidth() <= bitmap.getHeight();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC, Splitter:B:18:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap loadBitmap(android.net.Uri r3, android.graphics.BitmapFactory.Options r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0037
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L_0x0037
            r0 = 0
            android.content.Context r1 = r2.mContext     // Catch:{ all -> 0x0027 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ all -> 0x0027 }
            java.io.InputStream r3 = r1.openInputStream(r3)     // Catch:{ all -> 0x0027 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r0, r4)     // Catch:{ all -> 0x0024 }
            if (r3 == 0) goto L_0x0023
            r3.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r3 = move-exception
            java.lang.String r0 = "PrintHelper"
            java.lang.String r1 = "close fail "
            android.util.Log.w(r0, r1, r3)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            r0 = r3
            goto L_0x0028
        L_0x0027:
            r4 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r3 = move-exception
            java.lang.String r0 = "PrintHelper"
            java.lang.String r1 = "close fail "
            android.util.Log.w(r0, r1, r3)
        L_0x0036:
            throw r4
        L_0x0037:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bad argument to loadBitmap"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.print.PrintHelper.loadBitmap(android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static boolean systemSupportsPrint() {
        return Build.VERSION.SDK_INT >= 19;
    }

    public final int getColorMode() {
        return this.mColorMode;
    }

    public final int getOrientation() {
        if (Build.VERSION.SDK_INT < 19 || this.mOrientation != 0) {
            return this.mOrientation;
        }
        return 1;
    }

    public final int getScaleMode() {
        return this.mScaleMode;
    }

    /* access modifiers changed from: package-private */
    public final Bitmap loadConstrainedBitmap(Uri uri) {
        BitmapFactory.Options options;
        if (uri == null || this.mContext == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inJustDecodeBounds = true;
        loadBitmap(uri, options2);
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        if (i > 0 && i2 > 0) {
            int max = Math.max(i, i2);
            int i3 = 1;
            while (max > MAX_PRINT_SIZE) {
                max >>>= 1;
                i3 <<= 1;
            }
            if (i3 > 0 && Math.min(i, i2) / i3 > 0) {
                synchronized (this.mLock) {
                    this.mDecodeOptions = new BitmapFactory.Options();
                    this.mDecodeOptions.inMutable = true;
                    this.mDecodeOptions.inSampleSize = i3;
                    options = this.mDecodeOptions;
                }
                try {
                    Bitmap loadBitmap = loadBitmap(uri, options);
                    synchronized (this.mLock) {
                        this.mDecodeOptions = null;
                    }
                    return loadBitmap;
                } catch (Throwable th) {
                    synchronized (this.mLock) {
                        this.mDecodeOptions = null;
                        throw th;
                    }
                }
            }
        }
        return null;
    }

    public final void printBitmap(String str, Bitmap bitmap) {
        printBitmap(str, bitmap, (OnPrintFinishCallback) null);
    }

    public final void printBitmap(String str, Bitmap bitmap, OnPrintFinishCallback onPrintFinishCallback) {
        if (Build.VERSION.SDK_INT >= 19 && bitmap != null) {
            ((PrintManager) this.mContext.getSystemService("print")).print(str, new PrintBitmapAdapter(str, this.mScaleMode, bitmap, onPrintFinishCallback), new PrintAttributes.Builder().setMediaSize(isPortrait(bitmap) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE).setColorMode(this.mColorMode).build());
        }
    }

    public final void printBitmap(String str, Uri uri) {
        printBitmap(str, uri, (OnPrintFinishCallback) null);
    }

    public final void printBitmap(String str, Uri uri, OnPrintFinishCallback onPrintFinishCallback) {
        PrintAttributes.MediaSize mediaSize;
        if (Build.VERSION.SDK_INT >= 19) {
            PrintUriAdapter printUriAdapter = new PrintUriAdapter(str, uri, onPrintFinishCallback, this.mScaleMode);
            PrintManager printManager = (PrintManager) this.mContext.getSystemService("print");
            PrintAttributes.Builder builder = new PrintAttributes.Builder();
            builder.setColorMode(this.mColorMode);
            if (this.mOrientation == 1 || this.mOrientation == 0) {
                mediaSize = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
            } else {
                if (this.mOrientation == 2) {
                    mediaSize = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
                }
                printManager.print(str, printUriAdapter, builder.build());
            }
            builder.setMediaSize(mediaSize);
            printManager.print(str, printUriAdapter, builder.build());
        }
    }

    public final void setColorMode(int i) {
        this.mColorMode = i;
    }

    public final void setOrientation(int i) {
        this.mOrientation = i;
    }

    public final void setScaleMode(int i) {
        this.mScaleMode = i;
    }

    /* access modifiers changed from: package-private */
    public final void writeBitmap(PrintAttributes printAttributes, int i, Bitmap bitmap, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        final PrintAttributes build = IS_MIN_MARGINS_HANDLING_CORRECT ? printAttributes : copyAttributes(printAttributes).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build();
        final CancellationSignal cancellationSignal2 = cancellationSignal;
        final Bitmap bitmap2 = bitmap;
        final PrintAttributes printAttributes2 = printAttributes;
        final int i2 = i;
        final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        final PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = writeResultCallback;
        new AsyncTask<Void, Void, Throwable>() {
            /* access modifiers changed from: protected */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dd, code lost:
                r1.recycle();
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00a2 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c4 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00d9 */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6 A[Catch:{ all -> 0x00cc, Throwable -> 0x00e1 }] */
            /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8 A[Catch:{ all -> 0x00cc, Throwable -> 0x00e1 }] */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd A[Catch:{ all -> 0x00cc, Throwable -> 0x00e1 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Throwable doInBackground(java.lang.Void... r8) {
                /*
                    r7 = this;
                    android.os.CancellationSignal r8 = r4     // Catch:{ Throwable -> 0x00e1 }
                    boolean r8 = r8.isCanceled()     // Catch:{ Throwable -> 0x00e1 }
                    r0 = 0
                    if (r8 == 0) goto L_0x000a
                    return r0
                L_0x000a:
                    android.print.pdf.PrintedPdfDocument r8 = new android.print.pdf.PrintedPdfDocument     // Catch:{ Throwable -> 0x00e1 }
                    android.support.v4.print.PrintHelper r1 = android.support.p007v4.print.PrintHelper.this     // Catch:{ Throwable -> 0x00e1 }
                    android.content.Context r1 = r1.mContext     // Catch:{ Throwable -> 0x00e1 }
                    android.print.PrintAttributes r2 = r5     // Catch:{ Throwable -> 0x00e1 }
                    r8.<init>(r1, r2)     // Catch:{ Throwable -> 0x00e1 }
                    android.graphics.Bitmap r1 = r6     // Catch:{ Throwable -> 0x00e1 }
                    android.print.PrintAttributes r2 = r5     // Catch:{ Throwable -> 0x00e1 }
                    int r2 = r2.getColorMode()     // Catch:{ Throwable -> 0x00e1 }
                    android.graphics.Bitmap r1 = android.support.p007v4.print.PrintHelper.convertBitmapForColorMode(r1, r2)     // Catch:{ Throwable -> 0x00e1 }
                    android.os.CancellationSignal r2 = r4     // Catch:{ Throwable -> 0x00e1 }
                    boolean r2 = r2.isCanceled()     // Catch:{ Throwable -> 0x00e1 }
                    if (r2 == 0) goto L_0x002a
                    return r0
                L_0x002a:
                    r2 = 1
                    android.graphics.pdf.PdfDocument$Page r3 = r8.startPage(r2)     // Catch:{ all -> 0x00cc }
                    boolean r4 = android.support.p007v4.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT     // Catch:{ all -> 0x00cc }
                    if (r4 == 0) goto L_0x0041
                    android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x00cc }
                    android.graphics.pdf.PdfDocument$PageInfo r4 = r3.getInfo()     // Catch:{ all -> 0x00cc }
                    android.graphics.Rect r4 = r4.getContentRect()     // Catch:{ all -> 0x00cc }
                    r2.<init>(r4)     // Catch:{ all -> 0x00cc }
                    goto L_0x0064
                L_0x0041:
                    android.print.pdf.PrintedPdfDocument r4 = new android.print.pdf.PrintedPdfDocument     // Catch:{ all -> 0x00cc }
                    android.support.v4.print.PrintHelper r5 = android.support.p007v4.print.PrintHelper.this     // Catch:{ all -> 0x00cc }
                    android.content.Context r5 = r5.mContext     // Catch:{ all -> 0x00cc }
                    android.print.PrintAttributes r6 = r7     // Catch:{ all -> 0x00cc }
                    r4.<init>(r5, r6)     // Catch:{ all -> 0x00cc }
                    android.graphics.pdf.PdfDocument$Page r2 = r4.startPage(r2)     // Catch:{ all -> 0x00cc }
                    android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ all -> 0x00cc }
                    android.graphics.pdf.PdfDocument$PageInfo r6 = r2.getInfo()     // Catch:{ all -> 0x00cc }
                    android.graphics.Rect r6 = r6.getContentRect()     // Catch:{ all -> 0x00cc }
                    r5.<init>(r6)     // Catch:{ all -> 0x00cc }
                    r4.finishPage(r2)     // Catch:{ all -> 0x00cc }
                    r4.close()     // Catch:{ all -> 0x00cc }
                    r2 = r5
                L_0x0064:
                    int r4 = r1.getWidth()     // Catch:{ all -> 0x00cc }
                    int r5 = r1.getHeight()     // Catch:{ all -> 0x00cc }
                    int r6 = r8     // Catch:{ all -> 0x00cc }
                    android.graphics.Matrix r4 = android.support.p007v4.print.PrintHelper.getMatrix(r4, r5, r2, r6)     // Catch:{ all -> 0x00cc }
                    boolean r5 = android.support.p007v4.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT     // Catch:{ all -> 0x00cc }
                    if (r5 != 0) goto L_0x0084
                    float r5 = r2.left     // Catch:{ all -> 0x00cc }
                    float r6 = r2.top     // Catch:{ all -> 0x00cc }
                    r4.postTranslate(r5, r6)     // Catch:{ all -> 0x00cc }
                    android.graphics.Canvas r5 = r3.getCanvas()     // Catch:{ all -> 0x00cc }
                    r5.clipRect(r2)     // Catch:{ all -> 0x00cc }
                L_0x0084:
                    android.graphics.Canvas r2 = r3.getCanvas()     // Catch:{ all -> 0x00cc }
                    r2.drawBitmap(r1, r4, r0)     // Catch:{ all -> 0x00cc }
                    r8.finishPage(r3)     // Catch:{ all -> 0x00cc }
                    android.os.CancellationSignal r2 = r4     // Catch:{ all -> 0x00cc }
                    boolean r2 = r2.isCanceled()     // Catch:{ all -> 0x00cc }
                    if (r2 == 0) goto L_0x00aa
                    r8.close()     // Catch:{ Throwable -> 0x00e1 }
                    android.os.ParcelFileDescriptor r8 = r9     // Catch:{ Throwable -> 0x00e1 }
                    if (r8 == 0) goto L_0x00a2
                    android.os.ParcelFileDescriptor r8 = r9     // Catch:{ IOException -> 0x00a2 }
                    r8.close()     // Catch:{ IOException -> 0x00a2 }
                L_0x00a2:
                    android.graphics.Bitmap r8 = r6     // Catch:{ Throwable -> 0x00e1 }
                    if (r1 == r8) goto L_0x00a9
                    r1.recycle()     // Catch:{ Throwable -> 0x00e1 }
                L_0x00a9:
                    return r0
                L_0x00aa:
                    java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00cc }
                    android.os.ParcelFileDescriptor r3 = r9     // Catch:{ all -> 0x00cc }
                    java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x00cc }
                    r2.<init>(r3)     // Catch:{ all -> 0x00cc }
                    r8.writeTo(r2)     // Catch:{ all -> 0x00cc }
                    r8.close()     // Catch:{ Throwable -> 0x00e1 }
                    android.os.ParcelFileDescriptor r8 = r9     // Catch:{ Throwable -> 0x00e1 }
                    if (r8 == 0) goto L_0x00c4
                    android.os.ParcelFileDescriptor r8 = r9     // Catch:{ IOException -> 0x00c4 }
                    r8.close()     // Catch:{ IOException -> 0x00c4 }
                L_0x00c4:
                    android.graphics.Bitmap r8 = r6     // Catch:{ Throwable -> 0x00e1 }
                    if (r1 == r8) goto L_0x00cb
                    r1.recycle()     // Catch:{ Throwable -> 0x00e1 }
                L_0x00cb:
                    return r0
                L_0x00cc:
                    r0 = move-exception
                    r8.close()     // Catch:{ Throwable -> 0x00e1 }
                    android.os.ParcelFileDescriptor r8 = r9     // Catch:{ Throwable -> 0x00e1 }
                    if (r8 == 0) goto L_0x00d9
                    android.os.ParcelFileDescriptor r8 = r9     // Catch:{ IOException -> 0x00d9 }
                    r8.close()     // Catch:{ IOException -> 0x00d9 }
                L_0x00d9:
                    android.graphics.Bitmap r8 = r6     // Catch:{ Throwable -> 0x00e1 }
                    if (r1 == r8) goto L_0x00e0
                    r1.recycle()     // Catch:{ Throwable -> 0x00e1 }
                L_0x00e0:
                    throw r0     // Catch:{ Throwable -> 0x00e1 }
                L_0x00e1:
                    r8 = move-exception
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.print.PrintHelper.C01281.doInBackground(java.lang.Void[]):java.lang.Throwable");
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Throwable th) {
                if (cancellationSignal2.isCanceled()) {
                    writeResultCallback2.onWriteCancelled();
                } else if (th == null) {
                    writeResultCallback2.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                } else {
                    Log.e(PrintHelper.LOG_TAG, "Error writing printed content", th);
                    writeResultCallback2.onWriteFailed((CharSequence) null);
                }
            }
        }.execute(new Void[0]);
    }
}
