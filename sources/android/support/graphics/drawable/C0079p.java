package android.support.graphics.drawable;

import android.graphics.Path;
import android.support.p007v4.graphics.PathParser;

/* renamed from: android.support.graphics.drawable.p */
abstract class C0079p extends C0078o {

    /* renamed from: m */
    protected PathParser.PathDataNode[] f235m = null;

    /* renamed from: n */
    String f236n;

    /* renamed from: o */
    int f237o;

    public C0079p() {
        super((byte) 0);
    }

    public C0079p(C0079p pVar) {
        super((byte) 0);
        this.f236n = pVar.f236n;
        this.f237o = pVar.f237o;
        this.f235m = PathParser.deepCopyNodes(pVar.f235m);
    }

    /* renamed from: a */
    public final void mo257a(Path path) {
        path.reset();
        if (this.f235m != null) {
            PathParser.PathDataNode.nodesToPath(this.f235m, path);
        }
    }

    /* renamed from: a */
    public boolean mo220a() {
        return false;
    }

    public PathParser.PathDataNode[] getPathData() {
        return this.f235m;
    }

    public String getPathName() {
        return this.f236n;
    }

    public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
        if (!PathParser.canMorph(this.f235m, pathDataNodeArr)) {
            this.f235m = PathParser.deepCopyNodes(pathDataNodeArr);
        } else {
            PathParser.updateNodes(this.f235m, pathDataNodeArr);
        }
    }
}
