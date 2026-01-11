package org.java_tutorials.dsa.util;

public class Pattern97531 {
    public static void main(String[] args) {
        int p = 9, q;
        pattern();
        pattern1();

    }

    static void pattern() {
        for (int i = 9; i >= 1; i = (i % 2 == 0) ? i - 3 : i - 1) {
            for (int j = i; j >= 1; j = j - 2) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern1() {
        int k = 1;
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0)
                    System.out.print("* ");
                else {
                    System.out.print(k + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
