package p021wl.smartled.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.qihoo360.replugin.library.C0462R;
import java.util.HashMap;

/* renamed from: wl.smartled.views.ColorSelector */
public abstract class ColorSelector extends TableLayout implements View.OnClickListener {

    /* renamed from: a */
    private HashMap<Integer, Integer> f2686a = new HashMap<>();

    /* renamed from: b */
    private HashMap<Integer, RelativeLayout> f2687b = new HashMap<>();

    /* renamed from: c */
    private int f2688c;

    /* renamed from: d */
    private C0601b f2689d;

    /* renamed from: e */
    private Context f2690e;

    /* renamed from: f */
    private boolean f2691f = true;

    public ColorSelector(Context context) {
        super(context);
        m2141a(context);
        this.f2690e = context;
    }

    public ColorSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2141a(context);
        this.f2690e = context;
    }

    /* renamed from: a */
    private ImageView mo4807a(int i) {
        return (ImageView) this.f2687b.get(Integer.valueOf(i)).findViewById(C0462R.C0464id.id_select_color);
    }

    /* renamed from: a */
    private void m2141a(Context context) {
        TableRow tableRow = new TableRow(context);
        tableRow.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        for (int i = 0; i < 6; i++) {
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(C0462R.layout.color_row, tableRow, false);
            relativeLayout.setTag(Integer.valueOf(i));
            relativeLayout.setOnClickListener(this);
            tableRow.addView(relativeLayout);
            this.f2687b.put(Integer.valueOf(i), relativeLayout);
        }
        addView(tableRow);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo4806a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5166a(int i, int i2) {
        if (i >= 0 && i < 6 && this.f2686a.size() != 0) {
            this.f2686a.put(Integer.valueOf(i), Integer.valueOf(i2));
            for (int i3 = 0; i3 < 6; i3++) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f2687b.get(Integer.valueOf(i3)).getBackground();
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(this.f2686a.get(Integer.valueOf(i3)).intValue());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo5167a(int i, String str, int i2) {
        TextView textView = (TextView) this.f2687b.get(Integer.valueOf(i)).findViewById(C0462R.C0464id.id_hint_text);
        textView.setText(str);
        textView.setTextColor(getResources().getColor(i2));
        textView.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo5168a(C0601b bVar) {
        this.f2689d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo4810a(int[] iArr);

    /* renamed from: c */
    public final void mo5169c(int i) {
        mo4806a();
        int i2 = this.f2688c;
        ImageView a = mo4807a(i2);
        this.f2688c = i;
        a.setVisibility(4);
        if (i != i2) {
            a = mo4807a(i);
        }
        a.setVisibility(0);
    }

    /* renamed from: d */
    public final int mo5170d() {
        return this.f2686a.get(Integer.valueOf(this.f2688c)).intValue();
    }

    /* renamed from: d */
    public final void mo5171d(int i) {
        this.f2688c = i;
    }

    /* renamed from: e */
    public final int mo5172e() {
        return this.f2688c;
    }

    /* renamed from: f */
    public final void mo5173f() {
        mo4807a(this.f2688c).setVisibility(4);
    }

    /* renamed from: g */
    public final void mo5174g() {
        mo4807a(this.f2688c).setVisibility(0);
    }

    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        mo4806a();
        int i = this.f2688c;
        ImageView a = mo4807a(i);
        this.f2688c = intValue;
        if (this.f2689d != null) {
            this.f2689d.mo5024a(this, intValue);
            a.setVisibility(4);
            if (intValue != i) {
                a = mo4807a(intValue);
            }
            a.setVisibility(0);
            return;
        }
        this.f2688c = i;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f2691f) {
            int width = getWidth() / 9;
            int i5 = width / 2;
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt instanceof TableRow) {
                    TableRow tableRow = (TableRow) childAt;
                    int childCount2 = tableRow.getChildCount();
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        ViewGroup viewGroup = (ViewGroup) tableRow.getChildAt(i7);
                        if (viewGroup instanceof RelativeLayout) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                            marginLayoutParams.rightMargin = i5;
                            marginLayoutParams.width = width;
                            marginLayoutParams.height = width;
                            viewGroup.setLayoutParams(marginLayoutParams);
                        }
                    }
                    this.f2691f = false;
                }
            }
        }
        if (this.f2686a.size() == 0) {
            int[] iArr = new int[6];
            mo4810a(iArr);
            for (int i8 = 0; i8 < 6; i8++) {
                this.f2686a.put(Integer.valueOf(i8), Integer.valueOf(iArr[i8]));
            }
        }
        for (int i9 = 0; i9 < 6; i9++) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.f2687b.get(Integer.valueOf(i9)).getBackground();
            if (gradientDrawable != null) {
                gradientDrawable.setColor(this.f2686a.get(Integer.valueOf(i9)).intValue());
            }
        }
    }
}
