package p021wl.smartled.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.qihoo360.replugin.library.C0462R;
import java.util.List;
import p021wl.smartled.p027f.C0543f;

/* renamed from: wl.smartled.adapter.GuidePageAdapter */
public class GuidePageAdapter extends PagerAdapter {

    /* renamed from: c */
    private static final int[] f2191c = {C0462R.C0463drawable.ic_help_cn1_s8, C0462R.C0463drawable.ic_help_cn2_s8, C0462R.C0463drawable.ic_help_cn3_s8, C0462R.C0463drawable.ic_help_cn4_s8, C0462R.C0463drawable.ic_help_cn5_s8, C0462R.C0463drawable.ic_help_cn6_s8, C0462R.C0463drawable.ic_help_cn7_s8, C0462R.C0463drawable.ic_help_cn8_s8, C0462R.C0463drawable.ic_help_cn9_s8};

    /* renamed from: d */
    private static final int[] f2192d = {C0462R.C0463drawable.ic_help_en1_s8, C0462R.C0463drawable.ic_help_en2_s8, C0462R.C0463drawable.ic_help_en3_s8, C0462R.C0463drawable.ic_help_en4_s8, C0462R.C0463drawable.ic_help_en5_s8, C0462R.C0463drawable.ic_help_en6_s8, C0462R.C0463drawable.ic_help_en7_s8, C0462R.C0463drawable.ic_help_en8_s8, C0462R.C0463drawable.ic_help_en9_s8};

    /* renamed from: e */
    private static final int[] f2193e = {C0462R.C0463drawable.ic_help_jp1_s8, C0462R.C0463drawable.ic_help_jp2_s8, C0462R.C0463drawable.ic_help_jp3_s8, C0462R.C0463drawable.ic_help_jp4_s8, C0462R.C0463drawable.ic_help_jp5_s8, C0462R.C0463drawable.ic_help_jp6_s8, C0462R.C0463drawable.ic_help_jp7_s8, C0462R.C0463drawable.ic_help_jp8_s8, C0462R.C0463drawable.ic_help_jp9_s8};

    /* renamed from: a */
    private List<View> f2194a;

    /* renamed from: b */
    private Context f2195b;

    public GuidePageAdapter(List<View> list, Context context) {
        this.f2194a = list;
        this.f2195b = context;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Bitmap bitmap;
        View view = (View) obj;
        if (view != null) {
            ImageView imageView = (ImageView) view;
            if (imageView != null) {
                Drawable background = imageView.getBackground();
                if (background != null && (background instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) background).getBitmap()) != null && !bitmap.isRecycled()) {
                    imageView.setBackground((Drawable) null);
                    bitmap.recycle();
                }
                System.gc();
            }
            viewGroup.removeView(view);
        }
    }

    public int getCount() {
        if (this.f2194a != null) {
            return this.f2194a.size();
        }
        return 0;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ImageView imageView = (ImageView) this.f2194a.get(i);
        int count = getCount();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        Resources resources = this.f2195b.getResources();
        int i2 = i % count;
        int b = C0543f.m1906b();
        int i3 = f2192d[i2];
        if (b == C0543f.f2409b) {
            i3 = f2191c[i2];
        } else if (b == C0543f.f2410c) {
            i3 = f2193e[i2];
        }
        imageView.setImageBitmap(BitmapFactory.decodeResource(resources, i3));
        imageView.setLayoutParams(layoutParams);
        viewGroup.addView(imageView, 0);
        return imageView;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
