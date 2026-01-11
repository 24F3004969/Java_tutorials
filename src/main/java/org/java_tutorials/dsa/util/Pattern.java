package org.java_tutorials.dsa.util;

import java.math.BigInteger;

/**
 * @author hilal on 28-01-2023
 * @project Java_tutorials
 */
public class Pattern {
    public static void main(String[] args) {
        int size = 12;
        int start = size, end = size;
        //System.out.println(combination(BigInteger.valueOf(size), BigInteger.valueOf(size / 2)));
        int max = combination(BigInteger.valueOf(size), BigInteger.valueOf(size / 2)).length();
        for (int i = 0; i <= size; i++) {
            int c = 0;
            int k = 0;
            for (int j = 0; j <= 2 * size; j++) {
                if (j >= start && j <= end) {
                    if (c == 0) {
                        System.out.print(adjustSpace(combination(BigInteger.valueOf(i), BigInteger.valueOf(k)), max));
                        c = 1;
                        k++;
                    } else {
                        System.out.print(adjustSpace(" ", max));
                        c = 0;
                    }
                } else if(j<=end) System.out.print(adjustSpace(" ", max));
                else break;
            }
            start = start - 1;
            end = end + 1;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        }
    }

    static String adjustSpace(String s, int max) {
        return (s + " ".repeat(max - s.length()));
    }

    static String combination(BigInteger a, BigInteger b) {
        BigInteger f1 = BigInteger.ONE, f2 = BigInteger.ONE, k = b;
        for (BigInteger i = a; !i.subtract(a.subtract(b)).equals(BigInteger.ZERO); i = i.subtract(BigInteger.ONE)) {
            f1 = f1.multiply(i);
            f2 = f2.multiply(k);
            k = (k.max(BigInteger.ONE).equals(k) && !k.equals(BigInteger.ONE)) ? k.subtract(BigInteger.ONE) : k;
        }

        return f1.divide(f2).toString();
    }
}
