package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.graphics.drawable.DrawableCompat;
import android.support.p007v4.util.ArrayMap;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class AnimatedVectorDrawableCompat extends C0074k implements C0065b {

    /* renamed from: a */
    ArrayList<Object> f169a;

    /* renamed from: b */
    final Drawable.Callback f170b;

    /* renamed from: d */
    private C0067d f171d;

    /* renamed from: e */
    private Context f172e;

    /* renamed from: f */
    private ArgbEvaluator f173f;

    /* renamed from: g */
    private Animator.AnimatorListener f174g;

    AnimatedVectorDrawableCompat() {
        this((Context) null, (byte) 0);
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, (byte) 0);
    }

    private AnimatedVectorDrawableCompat(Context context, byte b) {
        this.f173f = null;
        this.f174g = null;
        this.f169a = null;
        this.f170b = new C0066c(this);
        this.f172e = context;
        this.f171d = new C0067d();
    }

    /* renamed from: a */
    public static AnimatedVectorDrawableCompat m122a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    /* renamed from: a */
    private void m123a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m123a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f173f == null) {
                    this.f173f = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f173f);
            }
        }
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f208c != null) {
            DrawableCompat.applyTheme(this.f208c, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f208c != null) {
            return DrawableCompat.canApplyTheme(this.f208c);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f208c != null) {
            this.f208c.draw(canvas);
            return;
        }
        this.f171d.f199b.draw(canvas);
        if (this.f171d.f200c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f208c != null ? DrawableCompat.getAlpha(this.f208c) : this.f171d.f199b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.f208c != null ? this.f208c.getChangingConfigurations() : super.getChangingConfigurations() | this.f171d.f198a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f208c == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0068e(this.f208c.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f208c != null ? this.f208c.getIntrinsicHeight() : this.f171d.f199b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f208c != null ? this.f208c.getIntrinsicWidth() : this.f171d.f199b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f208c != null ? this.f208c.getOpacity() : this.f171d.f199b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        if (this.f208c != null) {
            DrawableCompat.inflate(this.f208c, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f189e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat a = VectorDrawableCompat.m126a(resources, resourceId, theme);
                        a.mo183a();
                        a.setCallback(this.f170b);
                        if (this.f171d.f199b != null) {
                            this.f171d.f199b.setCallback((Drawable.Callback) null);
                        }
                        this.f171d.f199b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0064a.f190f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f172e != null) {
                            Context context = this.f172e;
                            Animator loadAnimator = Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, resourceId2) : C0070g.m132a(context, context.getResources(), context.getTheme(), resourceId2);
                            loadAnimator.setTarget(this.f171d.f199b.mo182a(string));
                            if (Build.VERSION.SDK_INT < 21) {
                                m123a(loadAnimator);
                            }
                            if (this.f171d.f201d == null) {
                                this.f171d.f201d = new ArrayList<>();
                                this.f171d.f202e = new ArrayMap<>();
                            }
                            this.f171d.f201d.add(loadAnimator);
                            this.f171d.f202e.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        C0067d dVar = this.f171d;
        if (dVar.f200c == null) {
            dVar.f200c = new AnimatorSet();
        }
        dVar.f200c.playTogether(dVar.f201d);
    }

    public boolean isAutoMirrored() {
        return this.f208c != null ? DrawableCompat.isAutoMirrored(this.f208c) : this.f171d.f199b.isAutoMirrored();
    }

    public boolean isRunning() {
        return this.f208c != null ? ((AnimatedVectorDrawable) this.f208c).isRunning() : this.f171d.f200c.isRunning();
    }

    public boolean isStateful() {
        return this.f208c != null ? this.f208c.isStateful() : this.f171d.f199b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f208c != null) {
            this.f208c.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f208c != null) {
            this.f208c.setBounds(rect);
        } else {
            this.f171d.f199b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f208c != null ? this.f208c.setLevel(i) : this.f171d.f199b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f208c != null ? this.f208c.setState(iArr) : this.f171d.f199b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f208c != null) {
            this.f208c.setAlpha(i);
        } else {
            this.f171d.f199b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f208c != null) {
            DrawableCompat.setAutoMirrored(this.f208c, z);
        } else {
            this.f171d.f199b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f208c != null) {
            this.f208c.setColorFilter(colorFilter);
        } else {
            this.f171d.f199b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f208c != null) {
            DrawableCompat.setTint(this.f208c, i);
        } else {
            this.f171d.f199b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f208c != null) {
            DrawableCompat.setTintList(this.f208c, colorStateList);
        } else {
            this.f171d.f199b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f208c != null) {
            DrawableCompat.setTintMode(this.f208c, mode);
        } else {
            this.f171d.f199b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f208c != null) {
            return this.f208c.setVisible(z, z2);
        }
        this.f171d.f199b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.f208c != null) {
            ((AnimatedVectorDrawable) this.f208c).start();
        } else if (!this.f171d.f200c.isStarted()) {
            this.f171d.f200c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f208c != null) {
            ((AnimatedVectorDrawable) this.f208c).stop();
        } else {
            this.f171d.f200c.end();
        }
    }
}
