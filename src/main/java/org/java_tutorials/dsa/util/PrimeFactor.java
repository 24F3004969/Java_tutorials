package org.java_tutorials.dsa.util;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        int n, i, s, t = 0, c = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                s = i;
                while (s > 0) {
                    t = t + 1;
                    if (s % t == 0) {
                        c++;
                    }
                    s = s - 1;
                }
            }
            if (c == 2)
                System.out.println(i);
        }
    }
}
