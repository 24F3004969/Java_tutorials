package org.java_tutorials.tuition.shahir.part_1.tutorials_6;

import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("Enter a number :");
        double x = scanner.nextDouble();
        String num = String.valueOf(x);
        System.out.println(num);
        if (num.contains(".")) {
            int j = num.length() - num.indexOf('.') - 1;
            if (num.charAt(num.length() - 1) == '0') {
                if (num.charAt(num.length() - 2) == '.') {
                    System.out.println((long) x);
                } else {
                    System.out.println((x * Math.pow(10, j)));
                    long z = (long) (x * Math.pow(10, j));
                    System.out.println(z);
                }
            } else {
                System.out.println((x * Math.pow(10, j)));
                long z = (long) (x * Math.pow(10, j));
                System.out.println(z);
            }
        }
    }
}
