package android.support.p010v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.widget.C0407dc;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.ListMenuItemView */
public class ListMenuItemView extends LinearLayout implements C0289af, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private MenuItemImpl f1038a;

    /* renamed from: b */
    private ImageView f1039b;

    /* renamed from: c */
    private RadioButton f1040c;

    /* renamed from: d */
    private TextView f1041d;

    /* renamed from: e */
    private CheckBox f1042e;

    /* renamed from: f */
    private TextView f1043f;

    /* renamed from: g */
    private ImageView f1044g;

    /* renamed from: h */
    private ImageView f1045h;

    /* renamed from: i */
    private LinearLayout f1046i;

    /* renamed from: j */
    private Drawable f1047j;

    /* renamed from: k */
    private int f1048k;

    /* renamed from: l */
    private Context f1049l;

    /* renamed from: m */
    private boolean f1050m;

    /* renamed from: n */
    private Drawable f1051n;

    /* renamed from: o */
    private boolean f1052o;

    /* renamed from: p */
    private int f1053p;

    /* renamed from: q */
    private LayoutInflater f1054q;

    /* renamed from: r */
    private boolean f1055r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0407dc a = C0407dc.m1308a(getContext(), attributeSet, C0197k.f439cd, i, 0);
        this.f1047j = a.mo4545a(C0197k.f441cf);
        this.f1048k = a.mo4558g(C0197k.f440ce, -1);
        this.f1050m = a.mo4547a(C0197k.f442cg, false);
        this.f1049l = context;
        this.f1051n = a.mo4545a(C0197k.f443ch);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C0188b.dropDownListViewStyle, 0);
        this.f1052o = obtainStyledAttributes.hasValue(0);
        a.mo4546a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m575a(View view, int i) {
        if (this.f1046i != null) {
            this.f1046i.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: d */
    private LayoutInflater m576d() {
        if (this.f1054q == null) {
            this.f1054q = LayoutInflater.from(getContext());
        }
        return this.f1054q;
    }

    /* renamed from: a */
    public final MenuItemImpl mo3545a() {
        return this.f1038a;
    }

    /* renamed from: a */
    public final void mo3546a(MenuItemImpl menuItemImpl) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        this.f1038a = menuItemImpl;
        int i = 0;
        this.f1053p = 0;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        CharSequence a = menuItemImpl.mo3631a((C0289af) this);
        if (a != null) {
            this.f1041d.setText(a);
            if (this.f1041d.getVisibility() != 0) {
                this.f1041d.setVisibility(0);
            }
        } else if (this.f1041d.getVisibility() != 8) {
            this.f1041d.setVisibility(8);
        }
        boolean isCheckable = menuItemImpl.isCheckable();
        if (!(!isCheckable && this.f1040c == null && this.f1042e == null)) {
            if (this.f1038a.mo3643e()) {
                if (this.f1040c == null) {
                    this.f1040c = (RadioButton) m576d().inflate(C0194h.abc_list_menu_item_radio, this, false);
                    m575a(this.f1040c, -1);
                }
                compoundButton2 = this.f1040c;
                compoundButton = this.f1042e;
            } else {
                if (this.f1042e == null) {
                    this.f1042e = (CheckBox) m576d().inflate(C0194h.abc_list_menu_item_checkbox, this, false);
                    m575a(this.f1042e, -1);
                }
                compoundButton2 = this.f1042e;
                compoundButton = this.f1040c;
            }
            if (isCheckable) {
                compoundButton2.setChecked(this.f1038a.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                if (this.f1042e != null) {
                    this.f1042e.setVisibility(8);
                }
                if (this.f1040c != null) {
                    this.f1040c.setVisibility(8);
                }
            }
        }
        int i2 = (!menuItemImpl.mo3641d() || !this.f1038a.mo3641d()) ? 8 : 0;
        if (i2 == 0) {
            this.f1043f.setText(this.f1038a.mo3638c());
        }
        if (this.f1043f.getVisibility() != i2) {
            this.f1043f.setVisibility(i2);
        }
        Drawable icon = menuItemImpl.getIcon();
        boolean z = this.f1038a.f1088a.mo3622q() || this.f1055r;
        if ((z || this.f1050m) && !(this.f1039b == null && icon == null && !this.f1050m)) {
            if (this.f1039b == null) {
                this.f1039b = (ImageView) m576d().inflate(C0194h.abc_list_menu_item_icon, this, false);
                m575a(this.f1039b, 0);
            }
            if (icon != null || this.f1050m) {
                ImageView imageView = this.f1039b;
                if (!z) {
                    icon = null;
                }
                imageView.setImageDrawable(icon);
                if (this.f1039b.getVisibility() != 0) {
                    this.f1039b.setVisibility(0);
                }
            } else {
                this.f1039b.setVisibility(8);
            }
        }
        setEnabled(menuItemImpl.isEnabled());
        boolean hasSubMenu = menuItemImpl.hasSubMenu();
        if (this.f1044g != null) {
            ImageView imageView2 = this.f1044g;
            if (!hasSubMenu) {
                i = 8;
            }
            imageView2.setVisibility(i);
        }
        setContentDescription(menuItemImpl.getContentDescription());
    }

    /* renamed from: a */
    public final void mo3563a(boolean z) {
        if (this.f1045h != null) {
            this.f1045h.setVisibility((this.f1052o || !z) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        if (this.f1045h != null && this.f1045h.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1045h.getLayoutParams();
            rect.top += this.f1045h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    /* renamed from: b */
    public final boolean mo3549b() {
        return false;
    }

    /* renamed from: c */
    public final void mo3565c() {
        this.f1055r = true;
        this.f1050m = true;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.f1047j);
        this.f1041d = (TextView) findViewById(C0193g.f275S);
        if (this.f1048k != -1) {
            this.f1041d.setTextAppearance(this.f1049l, this.f1048k);
        }
        this.f1043f = (TextView) findViewById(C0193g.shortcut);
        this.f1044g = (ImageView) findViewById(C0193g.submenuarrow);
        if (this.f1044g != null) {
            this.f1044g.setImageDrawable(this.f1051n);
        }
        this.f1045h = (ImageView) findViewById(C0193g.group_divider);
        this.f1046i = (LinearLayout) findViewById(C0193g.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1039b != null && this.f1050m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1039b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }
}
