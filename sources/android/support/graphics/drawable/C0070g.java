package android.support.graphics.drawable;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.p007v4.content.res.TypedArrayUtils;
import android.support.p007v4.graphics.PathParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.graphics.drawable.g */
public final class C0070g {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m132a(android.content.Context r10, android.content.res.Resources r11, android.content.res.Resources.Theme r12, int r13) {
        /*
            r0 = 0
            android.content.res.XmlResourceParser r9 = r11.getAnimation(r13)     // Catch:{ XmlPullParserException -> 0x0042, IOException -> 0x0026 }
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r9)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001e, all -> 0x001b }
            r6 = 0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r9
            android.animation.Animator r10 = m133a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0021, IOException -> 0x001e, all -> 0x001b }
            if (r9 == 0) goto L_0x001a
            r9.close()
        L_0x001a:
            return r10
        L_0x001b:
            r10 = move-exception
            r0 = r9
            goto L_0x005e
        L_0x001e:
            r10 = move-exception
            r0 = r9
            goto L_0x0027
        L_0x0021:
            r10 = move-exception
            r0 = r9
            goto L_0x0043
        L_0x0024:
            r10 = move-exception
            goto L_0x005e
        L_0x0026:
            r10 = move-exception
        L_0x0027:
            android.content.res.Resources$NotFoundException r11 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Can't load animation resource ID #0x"
            r12.<init>(r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r13 = java.lang.Integer.toHexString(r13)     // Catch:{ all -> 0x0024 }
            r12.append(r13)     // Catch:{ all -> 0x0024 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0024 }
            r11.<init>(r12)     // Catch:{ all -> 0x0024 }
            r11.initCause(r10)     // Catch:{ all -> 0x0024 }
            throw r11     // Catch:{ all -> 0x0024 }
        L_0x0042:
            r10 = move-exception
        L_0x0043:
            android.content.res.Resources$NotFoundException r11 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = "Can't load animation resource ID #0x"
            r12.<init>(r1)     // Catch:{ all -> 0x0024 }
            java.lang.String r13 = java.lang.Integer.toHexString(r13)     // Catch:{ all -> 0x0024 }
            r12.append(r13)     // Catch:{ all -> 0x0024 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0024 }
            r11.<init>(r12)     // Catch:{ all -> 0x0024 }
            r11.initCause(r10)     // Catch:{ all -> 0x0024 }
            throw r11     // Catch:{ all -> 0x0024 }
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0.close()
        L_0x0063:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0070g.m132a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int):android.animation.Animator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.Animator m133a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00e1
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00e1
            r3 = 2
            if (r1 != r3) goto L_0x00dd
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0042
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = m135a(r0, r1, r2, r3, r4, r5)
        L_0x003e:
            r3 = r18
            goto L_0x00b5
        L_0x0042:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005c
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m137a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003e
        L_0x005c:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0094
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = android.support.graphics.drawable.C0064a.f192h
            r7 = r22
            android.content.res.TypedArray r6 = android.support.p007v4.content.res.TypedArrayUtils.obtainAttributes(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = android.support.p007v4.content.res.TypedArrayUtils.getNamedInt(r6, r10, r0, r14, r14)
            r5 = r15
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17 = r6
            r6 = r16
            r7 = r25
            m133a(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b5
        L_0x0094:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c5
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = m142a((android.content.Context) r3, (android.content.res.Resources) r8, (android.content.res.Resources.Theme) r9, (org.xmlpull.v1.XmlPullParser) r10, (android.util.AttributeSet) r1)
            if (r1 == 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00b4
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b4
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b4:
            r14 = 1
        L_0x00b5:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00c0
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00c0:
            r13.add(r0)
            goto L_0x000e
        L_0x00c5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown animator name: "
            r1.<init>(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r3 = r18
            goto L_0x000e
        L_0x00e1:
            if (r11 == 0) goto L_0x010a
            if (r13 == 0) goto L_0x010a
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00ef:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00ef
        L_0x0101:
            if (r24 != 0) goto L_0x0107
            r11.playTogether(r1)
            goto L_0x010a
        L_0x0107:
            r11.playSequentially(r1)
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0070g.m133a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: a */
    private static Keyframe m134a(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: a */
    private static ObjectAnimator m135a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m137a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder m136a(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m141a(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m141a(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a2
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            android.support.v4.graphics.PathParser$PathDataNode[] r13 = android.support.p007v4.graphics.PathParser.createNodesFromPathData(r12)
            android.support.v4.graphics.PathParser$PathDataNode[] r14 = android.support.p007v4.graphics.PathParser.createNodesFromPathData(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x009f
        L_0x0054:
            if (r13 == 0) goto L_0x0090
            android.support.graphics.drawable.h r0 = new android.support.graphics.drawable.h
            r0.<init>()
            if (r14 == 0) goto L_0x0086
            boolean r3 = android.support.p007v4.graphics.PathParser.canMorph(r13, r14)
            if (r3 == 0) goto L_0x006a
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            goto L_0x008a
        L_0x006a:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " Can't morph from "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x0086:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
        L_0x008a:
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0162
        L_0x0090:
            if (r14 == 0) goto L_0x009f
            android.support.graphics.drawable.h r11 = new android.support.graphics.drawable.h
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
        L_0x009f:
            r11 = r8
            goto L_0x0162
        L_0x00a2:
            if (r12 != r7) goto L_0x00a9
            android.support.graphics.drawable.i r12 = android.support.graphics.drawable.C0072i.m143a()
            goto L_0x00aa
        L_0x00a9:
            r12 = r8
        L_0x00aa:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f3
            if (r3 == 0) goto L_0x00de
            if (r0 != r7) goto L_0x00b7
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00bb
        L_0x00b7:
            float r13 = r11.getFloat(r13, r10)
        L_0x00bb:
            if (r5 == 0) goto L_0x00d4
            if (r4 != r7) goto L_0x00c4
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00c8
        L_0x00c4:
            float r11 = r11.getFloat(r14, r10)
        L_0x00c8:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x015a
        L_0x00d4:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x015a
        L_0x00de:
            if (r4 != r7) goto L_0x00e5
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00e9
        L_0x00e5:
            float r11 = r11.getFloat(r14, r10)
        L_0x00e9:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x015a
        L_0x00f3:
            if (r3 == 0) goto L_0x0139
            if (r0 != r7) goto L_0x00fd
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x010c
        L_0x00fd:
            boolean r0 = m141a(r0)
            if (r0 == 0) goto L_0x0108
            int r13 = r11.getColor(r13, r2)
            goto L_0x010c
        L_0x0108:
            int r13 = r11.getInt(r13, r2)
        L_0x010c:
            if (r5 == 0) goto L_0x0130
            if (r4 != r7) goto L_0x0116
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0125
        L_0x0116:
            boolean r0 = m141a(r4)
            if (r0 == 0) goto L_0x0121
            int r11 = r11.getColor(r14, r2)
            goto L_0x0125
        L_0x0121:
            int r11 = r11.getInt(r14, r2)
        L_0x0125:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x015a
        L_0x0130:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x015a
        L_0x0139:
            if (r5 == 0) goto L_0x015a
            if (r4 != r7) goto L_0x0143
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0152
        L_0x0143:
            boolean r13 = m141a(r4)
            if (r13 == 0) goto L_0x014e
            int r11 = r11.getColor(r14, r2)
            goto L_0x0152
        L_0x014e:
            int r11 = r11.getInt(r14, r2)
        L_0x0152:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x015a:
            r11 = r8
            if (r11 == 0) goto L_0x0162
            if (r12 == 0) goto L_0x0162
            r11.setEvaluator(r12)
        L_0x0162:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.C0070g.m136a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: a */
    private static ValueAnimator m137a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f191g);
        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, C0064a.f195k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m138a(valueAnimator, obtainAttributes, obtainAttributes2, f, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(C0069f.m131a(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: a */
    private static void m138a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2 = valueAnimator;
        TypedArray typedArray3 = typedArray;
        TypedArray typedArray4 = typedArray2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long namedInt = (long) TypedArrayUtils.getNamedInt(typedArray3, xmlPullParser2, "duration", 1, 300);
        long namedInt2 = (long) TypedArrayUtils.getNamedInt(typedArray3, xmlPullParser2, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray3, xmlPullParser2, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlPullParser2, "valueFrom") && TypedArrayUtils.hasAttribute(xmlPullParser2, "valueTo")) {
            if (namedInt3 == 4) {
                TypedValue peekValue = typedArray3.peekValue(5);
                boolean z = peekValue != null;
                int i = z ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray3.peekValue(6);
                boolean z2 = peekValue2 != null;
                namedInt3 = ((!z || !m141a(i)) && (!z2 || !m141a(z2 ? peekValue2.type : 0))) ? 0 : 3;
            }
            PropertyValuesHolder a = m136a(typedArray3, namedInt3, 5, 6, "");
            if (a != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{a});
            }
        }
        valueAnimator2.setDuration(namedInt);
        valueAnimator2.setStartDelay(namedInt2);
        valueAnimator2.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray3, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray3, xmlPullParser2, "repeatMode", 4, 1));
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String namedString = TypedArrayUtils.getNamedString(typedArray4, xmlPullParser2, "pathData", 1);
            if (namedString != null) {
                String namedString2 = TypedArrayUtils.getNamedString(typedArray4, xmlPullParser2, "propertyXName", 2);
                String namedString3 = TypedArrayUtils.getNamedString(typedArray4, xmlPullParser2, "propertyYName", 3);
                if (namedString2 == null && namedString3 == null) {
                    throw new InflateException(typedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                m139a(PathParser.createPathFromPathData(namedString), objectAnimator, 0.5f * f, namedString2, namedString3);
                return;
            }
            objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray4, xmlPullParser2, "propertyName", 0));
        }
    }

    /* renamed from: a */
    private static void m139a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4 - ((Float) arrayList.get(i2)).floatValue(), fArr3, (float[]) null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }

    /* renamed from: a */
    private static void m140a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    private static boolean m141a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    private static PropertyValuesHolder[] m142a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        PropertyValuesHolder propertyValuesHolder;
        int size;
        Keyframe keyframe;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 3) {
                int i = 1;
                if (eventType != 1) {
                    if (eventType == 2) {
                        if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources2, theme2, attributeSet, C0064a.f193i);
                            String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser2, "propertyName", 3);
                            int i2 = 4;
                            int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser2, "valueType", 2, 4);
                            int i3 = namedInt;
                            ArrayList arrayList2 = null;
                            while (true) {
                                int next = xmlPullParser.next();
                                if (next == 3 || next == i) {
                                    Context context2 = context;
                                } else {
                                    if (xmlPullParser.getName().equals("keyframe")) {
                                        if (i3 == i2) {
                                            TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources2, theme2, Xml.asAttributeSet(xmlPullParser), C0064a.f194j);
                                            TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes2, xmlPullParser2, "value", 0);
                                            i3 = (!(peekNamedValue != null) || !m141a(peekNamedValue.type)) ? 0 : 3;
                                            obtainAttributes2.recycle();
                                        }
                                        TypedArray obtainAttributes3 = TypedArrayUtils.obtainAttributes(resources2, theme2, Xml.asAttributeSet(xmlPullParser), C0064a.f194j);
                                        float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser2, "fraction", 3, -1.0f);
                                        TypedValue peekNamedValue2 = TypedArrayUtils.peekNamedValue(obtainAttributes3, xmlPullParser2, "value", 0);
                                        boolean z = peekNamedValue2 != null;
                                        int i4 = i3 == i2 ? (!z || !m141a(peekNamedValue2.type)) ? 0 : 3 : i3;
                                        if (z) {
                                            if (i4 != 3) {
                                                switch (i4) {
                                                    case 0:
                                                        keyframe = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser2, "value", 0, 0.0f));
                                                        break;
                                                    case 1:
                                                        break;
                                                    default:
                                                        keyframe = null;
                                                        break;
                                                }
                                            }
                                            keyframe = Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(obtainAttributes3, xmlPullParser2, "value", 0, 0));
                                        } else {
                                            keyframe = i4 == 0 ? Keyframe.ofFloat(namedFloat) : Keyframe.ofInt(namedFloat);
                                        }
                                        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes3, xmlPullParser2, "interpolator", 1, 0);
                                        if (namedResourceId > 0) {
                                            keyframe.setInterpolator(C0069f.m131a(context, namedResourceId));
                                        } else {
                                            Context context3 = context;
                                        }
                                        obtainAttributes3.recycle();
                                        if (keyframe != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(keyframe);
                                        }
                                        xmlPullParser.next();
                                    } else {
                                        Context context4 = context;
                                    }
                                    i = 1;
                                    i2 = 4;
                                }
                            }
                            Context context22 = context;
                            if (arrayList2 == null || (size = arrayList2.size()) <= 0) {
                                propertyValuesHolder = null;
                            } else {
                                Keyframe keyframe2 = (Keyframe) arrayList2.get(0);
                                Keyframe keyframe3 = (Keyframe) arrayList2.get(size - 1);
                                float fraction = keyframe3.getFraction();
                                if (fraction < 1.0f) {
                                    if (fraction < 0.0f) {
                                        keyframe3.setFraction(1.0f);
                                    } else {
                                        arrayList2.add(arrayList2.size(), m134a(keyframe3, 1.0f));
                                        size++;
                                    }
                                }
                                float fraction2 = keyframe2.getFraction();
                                if (fraction2 != 0.0f) {
                                    if (fraction2 < 0.0f) {
                                        keyframe2.setFraction(0.0f);
                                    } else {
                                        arrayList2.add(0, m134a(keyframe2, 0.0f));
                                        size++;
                                    }
                                }
                                Keyframe[] keyframeArr = new Keyframe[size];
                                arrayList2.toArray(keyframeArr);
                                for (int i5 = 0; i5 < size; i5++) {
                                    Keyframe keyframe4 = keyframeArr[i5];
                                    if (keyframe4.getFraction() < 0.0f) {
                                        if (i5 == 0) {
                                            keyframe4.setFraction(0.0f);
                                        } else {
                                            int i6 = size - 1;
                                            if (i5 == i6) {
                                                keyframe4.setFraction(1.0f);
                                            } else {
                                                int i7 = i5 + 1;
                                                int i8 = i5;
                                                while (true) {
                                                    if (i7 < i6) {
                                                        if (keyframeArr[i7].getFraction() < 0.0f) {
                                                            i8 = i7;
                                                            i7++;
                                                        }
                                                    }
                                                }
                                                m140a(keyframeArr, keyframeArr[i8 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i8);
                                            }
                                        }
                                    }
                                }
                                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(namedString, keyframeArr);
                                if (i3 == 3) {
                                    propertyValuesHolder.setEvaluator(C0072i.m143a());
                                }
                            }
                            if (propertyValuesHolder == null) {
                                propertyValuesHolder = m136a(obtainAttributes, namedInt, 0, 1, namedString);
                            }
                            if (propertyValuesHolder != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(propertyValuesHolder);
                            }
                            obtainAttributes.recycle();
                        } else {
                            Context context5 = context;
                            AttributeSet attributeSet2 = attributeSet;
                        }
                    }
                    xmlPullParser.next();
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size2 = arrayList.size();
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size2];
        for (int i9 = 0; i9 < size2; i9++) {
            propertyValuesHolderArr[i9] = (PropertyValuesHolder) arrayList.get(i9);
        }
        return propertyValuesHolderArr;
    }
}
