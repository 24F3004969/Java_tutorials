package org.java_tutorials.tuition.shahir.part_1.oop;

import java.util.*;

import static java.lang.Math.*;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class MySet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, y1, y2;

        System.out.println("Enter x1");
        x1 = in.nextInt();
        System.out.println("Enter x2");
        x2 = in.nextInt();
        System.out.println("Enter y1");
        y1 = in.nextInt();
        System.out.println("Enter y2");
        y2 = in.nextInt();
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("x1 \t\t x2 \t\t y1 \t\t y2 \t\t distance");
        System.out.print(x1 + "\t\t" + x2 + "\t\t" + y1 + "\t\t" + y2 + "\t\t" + d);


    }
}
