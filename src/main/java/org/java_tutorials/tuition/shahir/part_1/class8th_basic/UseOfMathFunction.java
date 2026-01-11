package org.java_tutorials.tuition.shahir.part_1.class8th_basic;

import java.lang.Math;
import java.util.*;

public class UseOfMathFunction {
    public static void main(String[] args) {
        int b, p;
        double h;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base");
        b = in.nextInt();
        System.out.println("Enter the height");
        p = in.nextInt();
        h = Math.sqrt(b * b + p * p);
        System.out.println(h);
    }
}
