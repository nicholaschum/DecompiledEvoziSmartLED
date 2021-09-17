package android.support.p010v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.AbsSavedState;
import android.support.p007v4.view.ViewCompat;
import android.support.p007v4.widget.CursorAdapter;
import android.support.p010v7.p011a.C0188b;
import android.support.p010v7.p011a.C0191e;
import android.support.p010v7.p011a.C0193g;
import android.support.p010v7.p011a.C0194h;
import android.support.p010v7.p011a.C0195i;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.C0273d;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends LinearLayoutCompat implements C0273d {

    /* renamed from: i */
    static final C0391cn f1456i = new C0391cn();

    /* renamed from: A */
    private C0393cp f1457A;

    /* renamed from: B */
    private C0392co f1458B;

    /* renamed from: C */
    private C0394cq f1459C;

    /* renamed from: D */
    private View.OnClickListener f1460D;

    /* renamed from: E */
    private boolean f1461E;

    /* renamed from: F */
    private boolean f1462F;

    /* renamed from: G */
    private boolean f1463G;

    /* renamed from: H */
    private CharSequence f1464H;

    /* renamed from: I */
    private boolean f1465I;

    /* renamed from: J */
    private int f1466J;

    /* renamed from: K */
    private boolean f1467K;

    /* renamed from: L */
    private CharSequence f1468L;

    /* renamed from: M */
    private CharSequence f1469M;

    /* renamed from: N */
    private boolean f1470N;

    /* renamed from: O */
    private int f1471O;

    /* renamed from: P */
    private Bundle f1472P;

    /* renamed from: Q */
    private final Runnable f1473Q;

    /* renamed from: R */
    private Runnable f1474R;

    /* renamed from: S */
    private final WeakHashMap<String, Drawable.ConstantState> f1475S;

    /* renamed from: T */
    private final View.OnClickListener f1476T;

    /* renamed from: U */
    private final TextView.OnEditorActionListener f1477U;

    /* renamed from: V */
    private final AdapterView.OnItemClickListener f1478V;

    /* renamed from: W */
    private final AdapterView.OnItemSelectedListener f1479W;

    /* renamed from: a */
    final SearchAutoComplete f1480a;

    /* renamed from: aa */
    private TextWatcher f1481aa;

    /* renamed from: b */
    final ImageView f1482b;

    /* renamed from: c */
    final ImageView f1483c;

    /* renamed from: d */
    final ImageView f1484d;

    /* renamed from: e */
    final ImageView f1485e;

    /* renamed from: f */
    View.OnFocusChangeListener f1486f;

    /* renamed from: g */
    CursorAdapter f1487g;

    /* renamed from: h */
    SearchableInfo f1488h;

    /* renamed from: j */
    View.OnKeyListener f1489j;

    /* renamed from: k */
    private final View f1490k;

    /* renamed from: l */
    private final View f1491l;

    /* renamed from: m */
    private final View f1492m;

    /* renamed from: n */
    private final View f1493n;

    /* renamed from: o */
    private C0397ct f1494o;

    /* renamed from: p */
    private Rect f1495p;

    /* renamed from: q */
    private Rect f1496q;

    /* renamed from: r */
    private int[] f1497r;

    /* renamed from: s */
    private int[] f1498s;

    /* renamed from: t */
    private final ImageView f1499t;

    /* renamed from: u */
    private final Drawable f1500u;

    /* renamed from: v */
    private final int f1501v;

    /* renamed from: w */
    private final int f1502w;

    /* renamed from: x */
    private final Intent f1503x;

    /* renamed from: y */
    private final Intent f1504y;

    /* renamed from: z */
    private final CharSequence f1505z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0395cr();

        /* renamed from: a */
        boolean f1506a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1506a = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1506a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1506a));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        final Runnable f1507a;

        /* renamed from: b */
        private int f1508b;

        /* renamed from: c */
        private SearchView f1509c;

        /* renamed from: d */
        private boolean f1510d;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0188b.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1507a = new C0396cs(this);
            this.f1508b = getThreshold();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4178a() {
            if (this.f1510d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1510d = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4179a(SearchView searchView) {
            this.f1509c = searchView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo4180a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1510d = false;
                removeCallbacks(this.f1507a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1510d = false;
                removeCallbacks(this.f1507a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1510d = true;
            }
        }

        public boolean enoughToFilter() {
            return this.f1508b <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1510d) {
                removeCallbacks(this.f1507a);
                post(this.f1507a);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (float) ((i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : 256), displayMetrics));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1509c.mo4169h();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1509c.clearFocus();
                        mo4180a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1509c.hasFocus() && getVisibility() == 0) {
                this.f1510d = true;
                if (SearchView.m975a(getContext())) {
                    SearchView.f1456i.mo4520c(this);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1508b = i;
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0188b.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1495p = new Rect();
        this.f1496q = new Rect();
        this.f1497r = new int[2];
        this.f1498s = new int[2];
        this.f1473Q = new C0381cd(this);
        this.f1474R = new C0383cf(this);
        this.f1475S = new WeakHashMap<>();
        this.f1476T = new C0386ci(this);
        this.f1489j = new C0387cj(this);
        this.f1477U = new C0388ck(this);
        this.f1478V = new C0389cl(this);
        this.f1479W = new C0390cm(this);
        this.f1481aa = new C0382ce(this);
        C0407dc a = C0407dc.m1308a(context, attributeSet, C0197k.f451cp, i, 0);
        LayoutInflater.from(context).inflate(a.mo4558g(C0197k.f461cz, C0194h.abc_search_view), this, true);
        this.f1480a = (SearchAutoComplete) findViewById(C0193g.search_src_text);
        this.f1480a.mo4179a(this);
        this.f1490k = findViewById(C0193g.search_edit_frame);
        this.f1491l = findViewById(C0193g.search_plate);
        this.f1492m = findViewById(C0193g.submit_area);
        this.f1482b = (ImageView) findViewById(C0193g.search_button);
        this.f1483c = (ImageView) findViewById(C0193g.search_go_btn);
        this.f1484d = (ImageView) findViewById(C0193g.search_close_btn);
        this.f1485e = (ImageView) findViewById(C0193g.search_voice_btn);
        this.f1499t = (ImageView) findViewById(C0193g.search_mag_icon);
        ViewCompat.setBackground(this.f1491l, a.mo4545a(C0197k.f410cA));
        ViewCompat.setBackground(this.f1492m, a.mo4545a(C0197k.f414cE));
        this.f1482b.setImageDrawable(a.mo4545a(C0197k.f413cD));
        this.f1483c.setImageDrawable(a.mo4545a(C0197k.f459cx));
        this.f1484d.setImageDrawable(a.mo4545a(C0197k.f456cu));
        this.f1485e.setImageDrawable(a.mo4545a(C0197k.f416cG));
        this.f1499t.setImageDrawable(a.mo4545a(C0197k.f413cD));
        this.f1500u = a.mo4545a(C0197k.f412cC);
        C0417dm.m1368a(this.f1482b, getResources().getString(C0195i.abc_searchview_description_search));
        this.f1501v = a.mo4558g(C0197k.f415cF, C0194h.abc_search_dropdown_item_icons_2line);
        this.f1502w = a.mo4558g(C0197k.f457cv, 0);
        this.f1482b.setOnClickListener(this.f1476T);
        this.f1484d.setOnClickListener(this.f1476T);
        this.f1483c.setOnClickListener(this.f1476T);
        this.f1485e.setOnClickListener(this.f1476T);
        this.f1480a.setOnClickListener(this.f1476T);
        this.f1480a.addTextChangedListener(this.f1481aa);
        this.f1480a.setOnEditorActionListener(this.f1477U);
        this.f1480a.setOnItemClickListener(this.f1478V);
        this.f1480a.setOnItemSelectedListener(this.f1479W);
        this.f1480a.setOnKeyListener(this.f1489j);
        this.f1480a.setOnFocusChangeListener(new C0384cg(this));
        boolean a2 = a.mo4547a(C0197k.f460cy, true);
        if (this.f1461E != a2) {
            this.f1461E = a2;
            m974a(a2);
            m988w();
        }
        int e = a.mo4555e(C0197k.f453cr, -1);
        if (e != -1) {
            this.f1466J = e;
            requestLayout();
        }
        this.f1505z = a.mo4551c(C0197k.f458cw);
        this.f1464H = a.mo4551c(C0197k.f411cB);
        int a3 = a.mo4543a(C0197k.f455ct, -1);
        if (a3 != -1) {
            this.f1480a.setImeOptions(a3);
        }
        int a4 = a.mo4543a(C0197k.f454cs, -1);
        if (a4 != -1) {
            this.f1480a.setInputType(a4);
        }
        setFocusable(a.mo4547a(C0197k.f452cq, true));
        a.mo4546a();
        this.f1503x = new Intent("android.speech.action.WEB_SEARCH");
        this.f1503x.addFlags(268435456);
        this.f1503x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f1504y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1504y.addFlags(268435456);
        this.f1493n = findViewById(this.f1480a.getDropDownAnchor());
        if (this.f1493n != null) {
            this.f1493n.addOnLayoutChangeListener(new C0385ch(this));
        }
        m974a(this.f1461E);
        m988w();
    }

    /* renamed from: a */
    private Intent m971a(Cursor cursor) {
        int i;
        String a;
        try {
            String a2 = C0399cv.m1294a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.f1488h.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String a3 = C0399cv.m1294a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.f1488h.getSuggestIntentData();
            }
            if (!(a3 == null || (a = C0399cv.m1294a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            return m972a(a2, a3 == null ? null : Uri.parse(a3), C0399cv.m1294a(cursor, "suggest_intent_extra_data"), C0399cv.m1294a(cursor, "suggest_intent_query"));
        } catch (RuntimeException e) {
            try {
                i = cursor.getPosition();
            } catch (RuntimeException unused) {
                i = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m972a(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1469M);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f1472P != null) {
            intent.putExtra("app_data", this.f1472P);
        }
        intent.setComponent(this.f1488h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m973a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: ".concat(String.valueOf(intent)), e);
            }
        }
    }

    /* renamed from: a */
    private void m974a(boolean z) {
        this.f1462F = z;
        int i = 8;
        boolean z2 = false;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f1480a.getText());
        this.f1482b.setVisibility(i2);
        m976b(z3);
        this.f1490k.setVisibility(z ? 8 : 0);
        if (this.f1499t.getDrawable() != null && !this.f1461E) {
            i = 0;
        }
        this.f1499t.setVisibility(i);
        m986u();
        if (!z3) {
            z2 = true;
        }
        m978c(z2);
        m985t();
    }

    /* renamed from: a */
    static boolean m975a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private void m976b(boolean z) {
        this.f1483c.setVisibility((!this.f1463G || !m984s() || !hasFocus() || (!z && this.f1467K)) ? 8 : 0);
    }

    /* renamed from: c */
    private CharSequence m977c(CharSequence charSequence) {
        if (!this.f1461E || this.f1500u == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1480a.getTextSize()) * 1.25d);
        this.f1500u.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1500u), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m978c(boolean z) {
        int i;
        if (!this.f1467K || this.f1462F || !z) {
            i = 8;
        } else {
            i = 0;
            this.f1483c.setVisibility(8);
        }
        this.f1485e.setVisibility(i);
    }

    /* renamed from: d */
    private void m979d(CharSequence charSequence) {
        this.f1480a.setText(charSequence);
        this.f1480a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: d */
    private boolean m980d(int i) {
        Cursor cursor = this.f1487g.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        m973a(m971a(cursor));
        return true;
    }

    /* renamed from: p */
    private CharSequence m981p() {
        return this.f1464H != null ? this.f1464H : (this.f1488h == null || this.f1488h.getHintId() == 0) ? this.f1505z : getContext().getText(this.f1488h.getHintId());
    }

    /* renamed from: q */
    private int m982q() {
        return getContext().getResources().getDimensionPixelSize(C0191e.abc_search_view_preferred_width);
    }

    /* renamed from: r */
    private int m983r() {
        return getContext().getResources().getDimensionPixelSize(C0191e.abc_search_view_preferred_height);
    }

    /* renamed from: s */
    private boolean m984s() {
        return (this.f1463G || this.f1467K) && !this.f1462F;
    }

    /* renamed from: t */
    private void m985t() {
        this.f1492m.setVisibility((!m984s() || !(this.f1483c.getVisibility() == 0 || this.f1485e.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: u */
    private void m986u() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1480a.getText());
        int i = 0;
        if (!z2 && (!this.f1461E || this.f1470N)) {
            z = false;
        }
        ImageView imageView = this.f1484d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1484d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: v */
    private void m987v() {
        post(this.f1473Q);
    }

    /* renamed from: w */
    private void m988w() {
        CharSequence p = m981p();
        SearchAutoComplete searchAutoComplete = this.f1480a;
        if (p == null) {
            p = "";
        }
        searchAutoComplete.setHint(m977c(p));
    }

    /* renamed from: a */
    public final void mo3468a() {
        if (!this.f1470N) {
            this.f1470N = true;
            this.f1471O = this.f1480a.getImeOptions();
            this.f1480a.setImeOptions(this.f1471O | 33554432);
            this.f1480a.setText("");
            mo4167f();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4157a(CharSequence charSequence) {
        m979d(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4158a(String str) {
        getContext().startActivity(m972a("android.intent.action.SEARCH", (Uri) null, (String) null, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4159a(int i) {
        if (this.f1459C != null && this.f1459C.mo4524b()) {
            return false;
        }
        m980d(i);
        this.f1480a.mo4180a(false);
        this.f1480a.dismissDropDown();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo4160a(int i, KeyEvent keyEvent) {
        if (this.f1488h != null && this.f1487g != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo4159a(this.f1480a.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f1480a.setSelection(i == 21 ? 0 : this.f1480a.length());
                this.f1480a.setListSelection(0);
                this.f1480a.clearListSelection();
                f1456i.mo4520c(this.f1480a);
                return true;
            } else if (i != 19 || this.f1480a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo3469b() {
        this.f1480a.setText("");
        this.f1480a.setSelection(this.f1480a.length());
        this.f1469M = "";
        clearFocus();
        m974a(true);
        this.f1480a.setImeOptions(this.f1471O);
        this.f1470N = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4161b(CharSequence charSequence) {
        Editable text = this.f1480a.getText();
        this.f1469M = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m976b(z2);
        if (z2) {
            z = false;
        }
        m978c(z);
        m986u();
        m985t();
        if (this.f1457A != null && !TextUtils.equals(charSequence, this.f1468L)) {
            charSequence.toString();
        }
        this.f1468L = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo4162c() {
        int[] iArr = this.f1480a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f1491l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1492m.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo4163c(int i) {
        CharSequence convertToString;
        if (this.f1459C != null && this.f1459C.mo4523a()) {
            return false;
        }
        Editable text = this.f1480a.getText();
        Cursor cursor = this.f1487g.getCursor();
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i) || (convertToString = this.f1487g.convertToString(cursor)) == null) {
            m979d((CharSequence) text);
            return true;
        }
        m979d(convertToString);
        return true;
    }

    public void clearFocus() {
        this.f1465I = true;
        super.clearFocus();
        this.f1480a.clearFocus();
        this.f1480a.mo4180a(false);
        this.f1465I = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo4165d() {
        Editable text = this.f1480a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1457A != null) {
                C0393cp cpVar = this.f1457A;
                text.toString();
                if (cpVar.mo4522a()) {
                    return;
                }
            }
            if (this.f1488h != null) {
                mo4158a(text.toString());
            }
            this.f1480a.mo4180a(false);
            this.f1480a.dismissDropDown();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo4166e() {
        if (!TextUtils.isEmpty(this.f1480a.getText())) {
            this.f1480a.setText("");
            this.f1480a.requestFocus();
            this.f1480a.mo4180a(true);
        } else if (!this.f1461E) {
        } else {
            if (this.f1458B == null || !this.f1458B.mo4521a()) {
                clearFocus();
                m974a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo4167f() {
        m974a(false);
        this.f1480a.requestFocus();
        this.f1480a.mo4180a(true);
        if (this.f1460D != null) {
            this.f1460D.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo4168g() {
        if (this.f1488h != null) {
            SearchableInfo searchableInfo = this.f1488h;
            try {
                String str = null;
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    Intent intent = new Intent(this.f1503x);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    if (searchActivity != null) {
                        str = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", str);
                    getContext().startActivity(intent);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    Intent intent2 = this.f1504y;
                    ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                    Intent intent3 = new Intent("android.intent.action.SEARCH");
                    intent3.setComponent(searchActivity2);
                    PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent3, 1073741824);
                    Bundle bundle = new Bundle();
                    if (this.f1472P != null) {
                        bundle.putParcelable("app_data", this.f1472P);
                    }
                    Intent intent4 = new Intent(intent2);
                    String str2 = "free_form";
                    int i = 1;
                    Resources resources = getResources();
                    if (searchableInfo.getVoiceLanguageModeId() != 0) {
                        str2 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                    }
                    String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                    String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                    if (searchableInfo.getVoiceMaxResults() != 0) {
                        i = searchableInfo.getVoiceMaxResults();
                    }
                    intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str2);
                    intent4.putExtra("android.speech.extra.PROMPT", string);
                    intent4.putExtra("android.speech.extra.LANGUAGE", string2);
                    intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                    if (searchActivity2 != null) {
                        str = searchActivity2.flattenToShortString();
                    }
                    intent4.putExtra("calling_package", str);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                    intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    getContext().startActivity(intent4);
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo4169h() {
        m974a(this.f1462F);
        m987v();
        if (this.f1480a.hasFocus()) {
            mo4171j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo4170i() {
        if (this.f1493n.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1491l.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C0423ds.m1382a(this);
            int dimensionPixelSize = this.f1461E ? resources.getDimensionPixelSize(C0191e.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0191e.abc_dropdownitem_text_padding_left) : 0;
            this.f1480a.getDropDownBackground().getPadding(rect);
            this.f1480a.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1480a.setDropDownWidth((((this.f1493n.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo4171j() {
        f1456i.mo4518a(this.f1480a);
        f1456i.mo4519b(this.f1480a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1473Q);
        post(this.f1474R);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1480a;
            Rect rect = this.f1495p;
            searchAutoComplete.getLocationInWindow(this.f1497r);
            getLocationInWindow(this.f1498s);
            int i5 = this.f1497r[1] - this.f1498s[1];
            int i6 = this.f1497r[0] - this.f1498s[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.f1496q.set(this.f1495p.left, 0, this.f1495p.right, i4 - i2);
            if (this.f1494o == null) {
                this.f1494o = new C0397ct(this.f1496q, this.f1495p, this.f1480a);
                setTouchDelegate(this.f1494o);
                return;
            }
            this.f1494o.mo4529a(this.f1496q, this.f1495p);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r3.f1466J <= 0) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.f1462F
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x003c
        L_0x001b:
            int r0 = r3.f1466J
            if (r0 <= 0) goto L_0x003c
            goto L_0x0030
        L_0x0020:
            int r4 = r3.f1466J
            if (r4 <= 0) goto L_0x0027
            int r4 = r3.f1466J
            goto L_0x003c
        L_0x0027:
            int r4 = r3.m982q()
            goto L_0x003c
        L_0x002c:
            int r0 = r3.f1466J
            if (r0 <= 0) goto L_0x0037
        L_0x0030:
            int r0 = r3.f1466J
        L_0x0032:
            int r4 = java.lang.Math.min(r0, r4)
            goto L_0x003c
        L_0x0037:
            int r0 = r3.m982q()
            goto L_0x0032
        L_0x003c:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004e
            if (r0 == 0) goto L_0x0049
            goto L_0x0056
        L_0x0049:
            int r5 = r3.m983r()
            goto L_0x0056
        L_0x004e:
            int r0 = r3.m983r()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0056:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v7.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m974a(savedState.f1506a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1506a = this.f1462F;
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m987v();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1465I || !isFocusable()) {
            return false;
        }
        if (this.f1462F) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1480a.requestFocus(i, rect);
        if (requestFocus) {
            m974a(false);
        }
        return requestFocus;
    }
}
