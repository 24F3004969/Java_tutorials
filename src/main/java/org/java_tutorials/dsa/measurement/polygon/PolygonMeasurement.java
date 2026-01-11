package org.java_tutorials.dsa.measurement.polygon;
import java.util.TreeMap;

interface PolygonMeasurement {
    double getArea();
    double getPerimeter();
    TreeMap<String,Double> getDiagonals();
    TreeMap<String,Double> getAngles();
    TreeMap<String,Double> getSides();
    String getIncentre();
    String getCircumcentre();
    double getAngleBetweenAdjacentSide(int l1, int l2);
    double getDistanceBetween(int v1,int v2);
    boolean isRegular();
}
