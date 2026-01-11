package org.java_tutorials.dsa.util;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n;
        n = in.nextInt();
        int t = n;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            int f = 1;
            for (int i = 1; i <=r; i++) {
                f = f * i;
            }
            s = s + f;
            n = n / 10;
        }
        if (s == t)
            System.out.println("Special Number");
        else System.out.println("Not a Special Number");
    }
}
