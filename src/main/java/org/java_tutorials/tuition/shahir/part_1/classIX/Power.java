package org.java_tutorials.tuition.shahir.part_1.classIX;

public class Power {
    public static void main(String[] args) {
        int b=6,p=500;
        double q=1;
        System.out.println(Math.pow(6,p));
        for (int i = 1; i <=p ; i++) {
            q=q*b;
        }
        System.out.println(q);
    }
}
