package android.support.graphics.drawable;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.graphics.PathParser;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.graphics.drawable.l */
final class C0075l extends C0079p {
    public C0075l() {
    }

    public C0075l(C0075l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public final void mo219a(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f188d);
            String string = obtainAttributes.getString(0);
            if (string != null) {
                this.f236n = string;
            }
            String string2 = obtainAttributes.getString(1);
            if (string2 != null) {
                this.f235m = PathParser.createNodesFromPathData(string2);
            }
            obtainAttributes.recycle();
        }
    }

    /* renamed from: a */
    public final boolean mo220a() {
        return true;
    }
}
