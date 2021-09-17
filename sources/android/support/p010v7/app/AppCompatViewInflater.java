package android.support.p010v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.p007v4.util.ArrayMap;
import android.support.p007v4.view.ViewCompat;
import android.support.p010v7.p011a.C0197k;
import android.support.p010v7.view.C0274e;
import android.support.p010v7.widget.AppCompatAutoCompleteTextView;
import android.support.p010v7.widget.AppCompatButton;
import android.support.p010v7.widget.AppCompatCheckBox;
import android.support.p010v7.widget.AppCompatCheckedTextView;
import android.support.p010v7.widget.AppCompatEditText;
import android.support.p010v7.widget.AppCompatImageButton;
import android.support.p010v7.widget.AppCompatImageView;
import android.support.p010v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.p010v7.widget.AppCompatRadioButton;
import android.support.p010v7.widget.AppCompatRatingBar;
import android.support.p010v7.widget.AppCompatSeekBar;
import android.support.p010v7.widget.AppCompatSpinner;
import android.support.p010v7.widget.AppCompatTextView;
import android.support.p010v7.widget.C0403cz;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f661a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f662b = {16843375};

    /* renamed from: c */
    private static final String[] f663c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f664d = new ArrayMap();

    /* renamed from: e */
    private final Object[] f665e = new Object[2];

    /* renamed from: a */
    private View m273a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            this.f665e[0] = context;
            this.f665e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f663c) {
                    View a2 = m274a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                this.f665e[0] = null;
                this.f665e[1] = null;
                return null;
            }
            View a3 = m274a(context, str, (String) null);
            this.f665e[0] = null;
            this.f665e[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            this.f665e[0] = null;
            this.f665e[1] = null;
        }
    }

    /* renamed from: a */
    private View m274a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends U> constructor = f664d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f661a);
                f664d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f665e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final View mo3226a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C0197k.f480dR, 0, 0);
        int resourceId = z2 ? obtainStyledAttributes.getResourceId(C0197k.f481dS, 0) : 0;
        if (resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0197k.f482dT, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0 && (!(context2 instanceof C0274e) || ((C0274e) context2).mo3470a() != resourceId)) {
            context2 = new C0274e(context2, resourceId);
        }
        if (z3) {
            context2 = C0403cz.m1304a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = new AppCompatTextView(context2, attributeSet);
                break;
            case 1:
                view2 = new AppCompatImageView(context2, attributeSet);
                break;
            case 2:
                view2 = new AppCompatButton(context2, attributeSet);
                break;
            case 3:
                view2 = new AppCompatEditText(context2, attributeSet);
                break;
            case 4:
                view2 = new AppCompatSpinner(context2, attributeSet);
                break;
            case 5:
                view2 = new AppCompatImageButton(context2, attributeSet);
                break;
            case 6:
                view2 = new AppCompatCheckBox(context2, attributeSet);
                break;
            case 7:
                view2 = new AppCompatRadioButton(context2, attributeSet);
                break;
            case 8:
                view2 = new AppCompatCheckedTextView(context2, attributeSet);
                break;
            case 9:
                view2 = new AppCompatAutoCompleteTextView(context2, attributeSet);
                break;
            case 10:
                view2 = new AppCompatMultiAutoCompleteTextView(context2, attributeSet);
                break;
            case 11:
                view2 = new AppCompatRatingBar(context2, attributeSet);
                break;
            case 12:
                view2 = new AppCompatSeekBar(context2, attributeSet);
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m273a(context2, str, attributeSet);
        }
        if (view2 != null) {
            Context context3 = view2.getContext();
            if ((context3 instanceof ContextWrapper) && (Build.VERSION.SDK_INT < 15 || ViewCompat.hasOnClickListeners(view2))) {
                TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, f662b);
                String string = obtainStyledAttributes2.getString(0);
                if (string != null) {
                    view2.setOnClickListener(new C0211am(view2, string));
                }
                obtainStyledAttributes2.recycle();
            }
        }
        return view2;
    }
}
