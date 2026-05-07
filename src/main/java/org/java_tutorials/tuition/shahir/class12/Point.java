package org.java_tutorials.tuition.shahir.class12;

public class Point {
    double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "("+ x + "," + y + ')';
    }
}
