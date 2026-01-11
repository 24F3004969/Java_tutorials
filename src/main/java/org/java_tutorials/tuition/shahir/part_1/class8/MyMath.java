package org.java_tutorials.tuition.shahir.part_1.class8;

import java.util.*;

public class MyMath {
    int sum(int a, int b) {
        int s = a + b;
        return s;
    }
    double sum(double a,double b){
        return a+b;
    }
    float sum(int a,float b){
        return a+b;
    }

    public static void main(String[] args) {
        MyMath m = new MyMath();
        int x= m.sum(5321, 21221);
        Scanner in = new Scanner(System.in);
        int a, b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(a+"  "+b);
        int c = m.sum(12,13);
        double d=m.sum(5.0,4.5);
        System.out.println(c);
    }
}
