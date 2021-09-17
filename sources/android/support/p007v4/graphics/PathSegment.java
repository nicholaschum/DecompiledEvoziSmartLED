package android.support.p007v4.graphics;

import android.graphics.PointF;
import android.support.p007v4.util.Preconditions;

/* renamed from: android.support.v4.graphics.PathSegment */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(PointF pointF, float f, PointF pointF2, float f2) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    public final PointF getEnd() {
        return this.mEnd;
    }

    public final float getEndFraction() {
        return this.mEndFraction;
    }

    public final PointF getStart() {
        return this.mStart;
    }

    public final float getStartFraction() {
        return this.mStartFraction;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.mStart.hashCode() * 31) + (this.mStartFraction != 0.0f ? Float.floatToIntBits(this.mStartFraction) : 0)) * 31) + this.mEnd.hashCode()) * 31;
        if (this.mEndFraction != 0.0f) {
            i = Float.floatToIntBits(this.mEndFraction);
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + '}';
    }
}
