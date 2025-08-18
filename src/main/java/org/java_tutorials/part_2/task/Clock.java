package org.java_tutorials.part_2.task;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class  Clock {
    public static void main(String[] args) throws InterruptedException {
        double R = 2, c_r = 0.6, r = 1.5;
        LocalTime localTime = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        var sec = new Point(R, R - c_r);
        var min = new Point(R, R - c_r);
        var hou = new Point(R, R - c_r);
        sec = rotate(localTime.getSecond() * -6, new Point(R, R), new Point(R, R - c_r));
        while (true) {
            long start_time = System.currentTimeMillis();
            localTime = LocalTime.parse(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            min = rotate(localTime.getMinute() * -6, new Point(R, R), new Point(R, R - c_r));
            hou = rotate(localTime.getHour() * -30, new Point(R, R), new Point(R, R - 0.4));
            StringBuilder s = new StringBuilder();
            double X_s = sec.x(), Y_s = sec.y();
            double X_m = min.x(), Y_m = min.y();
            double X_h = hou.x(), Y_h = hou.y();
            for (double y = 0; y < 2 * R; y = y + 0.01) {
                for (double x = 0; x < 2 * R; x = x + 0.01) {
                    boolean I = isOutsideCircle(new Point(x, y), r, new Point(R, R));
                    boolean K = isInsideCircle(new Point(x, y), R, new Point(R, R));
                    boolean S = isInsideCircle(new Point(x, y), c_r, new Point(X_s, Y_s));
                    boolean M = isInsideCircle(new Point(x, y), c_r, new Point(X_m, Y_m));
                    boolean H = isInsideCircle(new Point(x, y), 0.4, new Point(X_h, Y_h));
                    var line_s = new Line(new Point(R, R), new Point(X_s, Y_s)).contains(new Point(x, y));
                    var line_m = new Line(new Point(R, R), new Point(X_m, Y_m)).contains(new Point(x, y));
                    var line_h = new Line(new Point(R, R), new Point(X_h, Y_h)).contains(new Point(x, y));
                    if ((K && I) && false)
                        s.append("\033[0;96m██\33[0m");
                    else if ((line_s && S))
                        s.append("\033[0;32m██\33[0m");
                    else if (line_m && M)
                        s.append("\033[0;33m██\33[0m");
                    else if ((line_h && H))
                        s.append("\033[0;31m██\33[0m");
                    else if (isInsideCircle(new Point(x, y), r, new Point(R, R))
                            && isOutsideCircle(new Point(x, y), r - 0.1, new Point(R, R))) {
                        var tick = Math.round(calculateAngleInDegree(new Point(R, R), new Point(x, y)));
                        if (tick % 30 == 0)
                            s.append("\033[0;31m██\33[0m");

                        else
                            s.append("  ");
                    } else
                        s.append("  ");
                }
                s.append("\n");
            }
            System.out.println(s);
            sec = rotate(-6, new Point(R, R), sec);
            System.out.print("\u001b[H");
            long end_time = System.currentTimeMillis();
            Thread.sleep(1000 - (end_time - start_time));
            System.gc();
        }
    }

    public static boolean isInsideCircle(Point point, double radius, Point center) {
        return calculateCircle(point, radius, center) <= 0;
    }

    public static boolean isOutsideCircle(Point point, double radius, Point center) {
        return calculateCircle(point, radius, center) > 0;
    }
/*
    public static boolean isOnCircle(Point point, double radius, Point center) {
        return calculateCircle(point, radius, center) == 0;
    }*/

    public static double calculateCircle(Point point, double r, Point center) {
        return point.y() * point.y() + point.x() * point.x() + center.x() * center.x() + center.y() * center.y()
                - 2 * center.x() * point.x() - 2 * center.y() * point.y() - r * r;
    }

    public static Point rotate(double angle, Point center, Point point) {
        angle = Math.toRadians(angle);
        double x = point.x();
        double y = point.y();
        double X = center.x();
        double Y = center.y();
        double arg = Math.atan2(y - Y, x - X);
        double d = arg - angle;
        double sqrt = Math.sqrt((X - x) * (X - x) + (Y - y) * (Y - y));
        return new Point(center.x() + (sqrt * Math.cos(d)), center.y() + (sqrt * Math.sin(d)));
    }

    public static double calculateAngleInDegree(Point center, Point point) {
        double x = point.x();
        double y = point.y();
        double X = center.x();
        double Y = center.y();
        double arg = Math.atan2(y - Y, x - X);
        return Math.toDegrees(arg);
    }

}

record Point(double x, double y) {
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

record Line(Point point, double slope) {

    public Line(Point point1, Point point2) {
        this(point1, (point2.y() - point1.y()) / (point2.x() - point1.x()));
    }


    @Override
    public String toString() {
        return "Line [" + slope + "x" + "-y" + (-slope * point.x() + point.y()) + "]";
    }

    public boolean contains(Point point) {
        if ((slope == Double.NEGATIVE_INFINITY || slope == Double.POSITIVE_INFINITY) &&
                (Math.abs(this.point.x() - point.x()) <= 0.01))
            return true;
        return point.y() - this.point.y() == slope * (point.x() - this.point.x()) ||
                Math.abs(point.y() - this.point.y() - slope * (point.x() - this.point.x())) <= 0.01;
    }
}

