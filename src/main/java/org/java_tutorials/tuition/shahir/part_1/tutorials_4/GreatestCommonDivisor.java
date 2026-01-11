package org.java_tutorials.tuition.shahir.part_1.tutorials_4;

import java.util.Scanner;

// Pg no 189 q 11
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int gdc = 1;
        for (int i = 1; i <= Math.max(a, b); i++) {
            if (a % i == 0 && b % i == 0)
                gdc = Math.max(i, gdc);
        }
        System.out.println("The Greatest Common Divisor of two numbers are " + gdc);
    }
}
