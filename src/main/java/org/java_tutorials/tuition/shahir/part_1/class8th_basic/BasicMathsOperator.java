package org.java_tutorials.tuition.shahir.part_1.class8th_basic;

import java.lang.Math;
import java.util.*;
public class BasicMathsOperator {
    public static void main(String[] args) {
        int a = 5;
        Scanner in=new Scanner(System.in);
        double b = Math.pow(a,10);
        System.out.println(b);
        System.out.println("Enter the base :");
        int base=in.nextInt();
        System.out.println("Enter the power :");
        int power=in.nextInt();
        double ans=Math.pow(base,power);
        System.out.println(ans);
        double z=Math.pow(25,0.5);
        System.out.println(z);
        double x=Math.sqrt(25);
        double y=Math.cbrt(125);
        double hyp=Math.hypot(6,8);
        System.out.println(hyp);
        int r=7;
        double Area=Math.PI*r*r;
        System.out.println(Area);
    }
}
