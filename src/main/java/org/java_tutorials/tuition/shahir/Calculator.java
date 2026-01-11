package org.java_tutorials.tuition.shahir;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = in.nextDouble();
        System.out.print("Enter Second Number: ");
        b = in.nextDouble();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
