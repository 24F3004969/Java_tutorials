package org.java_tutorials.tuition.shahir.class12;

public class Geometry {

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public static Point midPoint(Point p1, Point p2) {
        Point point = new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
        return point;
    }

    public static Point centroid(Point p1, Point p2, Point p3) {
        Point point = new Point((p1.x + p2.x + p3.x) / 3, (p1.y + p2.y + p3.y) / 3);
        return point;
    }

    public static Point divideLineInRatio(Point p1, Point p2, double ratio) {
        return new Point((ratio * p2.x + p1.x) / (ratio + 1), (ratio * p2.y + p1.y) / (ratio + 1));

    }

    public static double divideLineInRatio(Point p1, Point p2, float sectionX) {
        return (sectionX-p1.x) / (p2.x - sectionX);
    }
}
