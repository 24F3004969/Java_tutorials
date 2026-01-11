package org.java_tutorials.tuition.shahir.part_1.tutorials_2;

import java.util.Scanner;

public class Pronic_Number {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Enter a number");
        double k = in.nextDouble();
        long t = System.nanoTime();
        System.out.println(isPronic_(k));
        System.out.println(System.nanoTime() - t);
        t = System.nanoTime();
        System.out.println(isPronic(k));
        System.out.println(System.nanoTime() - t);
    }

    private static boolean isPronic(double n) {
        var a = 2 * Math.sqrt(n + 0.25);
        var b = (a + 1) * 0.5;
        return b - (int) b == 0 & b * (b - 1) == n;
    }

    private static boolean isPronic_(double k) {
        double sqrt = Math.sqrt(k);
        for (double i = 1; i <= sqrt; i++) {
            if (i * (i + 1) == k)
                return true;
        }
        return false;
    }
}
