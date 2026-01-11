package org.java_tutorials.dsa.algorithem;

import java.util.Scanner;

public class PrimePalen {
    boolean prime(int a) {
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                c++;
        }
        return c == 2;
    }

    boolean palendrome(int a) {
        int s = 0, r, x = a;
        while (a > 0) {
            r = a % 10;
            s = s * 10 + r;
            a = a / 10;
        }
        return s == x;
    }

    public static void main(String[] args) {
        PrimePalen p = new PrimePalen();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a;
        a = in.nextInt();
        if (p.prime(a) && p.palendrome(a)) {
            System.out.println("Number is pal prime");
        } else {
            System.out.println("Not a pal prime");
        }
    }


}
