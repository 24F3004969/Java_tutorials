package org.java_tutorials.tuition.shahir.class12;

import static java.lang.IO.*;

public class Fun {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        System.out.println(Geometry.distance(p1, p2));
        Point p3 = Geometry.midPoint(p1, p2);
        System.out.println(p3);
        println(Geometry.centroid(p1, p2, new  Point(1, 2)));
        var p=Geometry.divideLineInRatio(p1,p2,1.5);
        println(Geometry.divideLineInRatio(p1,p2,(float) p.x));
    }
}
