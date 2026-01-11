package org.java_tutorials.tuition.shahir.class9th;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i > 0; i = i / 10) {
            int r = i % 10;
            int f = 1;
            for (int j = 1; j <= r; j++) {
                f = f * j;
            }
            sum = sum + f;
        }
        if (sum == n)
            System.out.println("Number is a special number");
        else
            System.out.println("Number is not a special number");
    }
}
