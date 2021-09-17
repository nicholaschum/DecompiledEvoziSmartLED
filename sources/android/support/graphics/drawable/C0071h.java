package android.support.graphics.drawable;

import android.animation.TypeEvaluator;
import android.support.p007v4.graphics.PathParser;

/* renamed from: android.support.graphics.drawable.h */
final class C0071h implements TypeEvaluator<PathParser.PathDataNode[]> {

    /* renamed from: a */
    private PathParser.PathDataNode[] f204a;

    C0071h() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        PathParser.PathDataNode[] pathDataNodeArr = (PathParser.PathDataNode[]) obj;
        PathParser.PathDataNode[] pathDataNodeArr2 = (PathParser.PathDataNode[]) obj2;
        if (PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
            if (this.f204a == null || !PathParser.canMorph(this.f204a, pathDataNodeArr)) {
                this.f204a = PathParser.deepCopyNodes(pathDataNodeArr);
            }
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                this.f204a[i].interpolatePathDataNode(pathDataNodeArr[i], pathDataNodeArr2[i], f);
            }
            return this.f204a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
