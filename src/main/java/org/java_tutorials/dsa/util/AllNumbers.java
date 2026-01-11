package org.java_tutorials.dsa.util;

public final class AllNumbers {
    public static boolean palindrome(int n) {
        int rev = 0;
        int on = n;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return on == rev;
    }

    public static boolean automorphic(int n) {
        int sq = n * n;
        int k = 10;
        while (sq > 0) {
            k = k * 10;
            sq = sq / 10;
        }
        sq = n * n;
        return sq % k == n;
    }

    public static boolean special(int n) {
        int t = n;
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            int f = 1;
            for (int i = 1; i <= r; i++)
                f = f * i;
            n = n / 10;
            s = s + f;

        }
        return s == n;
    }

    public static int removeDigit(int n, int digit) {
        double nu = 0.0;
        double c = 0.1;
        while (n > 0) {
            int r = n % 10;
            if (r != digit) {
                nu = nu * 0.1 + r;
                c *= 10;
            }
            n /= 10;
        }
        return (int) (nu * c);
    }

    public static boolean kaprekar(long n) {
        long sq, x = 1, c = 1;
        sq = n * n;
        while (sq > 0) {
            sq = sq / 10;
            if (c % 2 == 0)
                x = x * 10;
            c++;
        }
        sq = n * n;
        return (sq % x + sq / x == n) || ((sq % (x * 10) + sq / (x * 10) == n));
    }

}
