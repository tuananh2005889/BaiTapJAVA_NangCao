package bayhai;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    public List<Point> points;

    public Polyline() {
        points = new ArrayList<Point>();
    }
    public Polyline(List<Point> points) {
        this.points = points;
    }
    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        points.add(newPoint);
    }
    public void appendPoint(Point point) {
        points.add(point);
    }
    public String toString() {

        StringBuilder sb = new StringBuilder("{");
        for(Point aPoint : points) {
            sb.append(aPoint.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
