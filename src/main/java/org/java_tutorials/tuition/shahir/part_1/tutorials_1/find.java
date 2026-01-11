package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class find {
    public static void main(String[] args) {
        // find_multiple(5412,6454,17);
        /*
         * var t=random_array(100000000); long x=System.currentTimeMillis();
         * System.out.println(find_max_in_array_n_O(t));
         * System.out.println(System.currentTimeMillis()-x); long
         * y=System.currentTimeMillis(); System.out.println(find_max_in_array_n_O_(t));
         * System.out.println(System.currentTimeMillis()-y);
         */
        // improved_surd_form(Long.MAX_VALUE);
        long x = System.currentTimeMillis();
        surd_form(new BigInteger("5588960799022174035625"));
        System.out.println(System.currentTimeMillis() - x);
        long y = System.currentTimeMillis();
        _surd_form(new BigInteger("5588960799022174035625"));
        System.out.println(System.currentTimeMillis() - y);
    }

    static void find_multiple(int i, int j, int a) {
        var k = (((i - i % a) / a) + 1) * a;
        while (k <= j) {
            System.out.println(k);
            k = k + a;
        }
    }

    static int[] random_array(int n) {
        var x = new int[n];
        int k = (int) (Math.random() * n + 1);
        for (int i = 0; i < n; i++) {
            x[i] = (int) (Math.random() * k);
        }
        return x;
    }

    static void surd_form(long a) {
        long i = 2;
        long sq = 1;
        long k = 4;
        long p = 1;
        while (k <= a) {
            if (a % i == 0) {
                if (a % k == 0) {
                    a /= k;
                    sq *= i;
                } else {
                    a /= i;
                    p *= i;
                }
            } else {
                /*
                 * if (BigInteger.valueOf(a).isProbablePrime(1)) break;
                 */
                if (a % 2 == 1) {
                    i = i % 2 == 0 ? i + 1 : i + 2;
                } else
                    i++;
                k = i * i;
            }
        }
        System.out.println(sq + "" + "√" + (a * p));
    }

    static void surd_form(BigInteger a) {
        var i = BigInteger.TWO;
        var sq = BigInteger.ONE;
        var p = BigInteger.ONE;
        var mtr = BigInteger.ZERO;
        var k = BigInteger.valueOf(4);
        var num = a.sqrt();
        while (i.min(num).equals(i)) {
            if (a.mod(i).equals(mtr)) {
                k = i.multiply(i);
                if (a.mod(k).equals(mtr)) {
                    a = a.divide(k);
                    sq = sq.multiply(i);
                } else {
                    a = a.divide(i);
                    p = p.multiply(i);
                }
                num = a.sqrt();
            } else {
                if (a.isProbablePrime(1))
                    break;
                /*
                 * if (a.mod(BigInteger.TWO).equals(BigInteger.ONE)) { i =
                 * i.mod(BigInteger.TWO).equals(mtr) ? i.add(BigInteger.ONE) :
                 * i.add(BigInteger.TWO); } else i = i.add(BigInteger.ONE);
                 */
                i = i.nextProbablePrime();
            }
        }
        System.out.println(sq + "√" + (a.multiply(p)));
    }

    static void _surd_form(BigInteger a) {
        var i = BigInteger.TWO;
        var sq = BigInteger.ONE;
        var p = BigInteger.ONE;
        int count = 0;
        do {
            if (a.mod(i).equals(BigInteger.ZERO)) {
                a = a.divide(i);
                count++;
            } else {
                sq = sq.multiply(i.pow(count / 2));
                if (count % 2 != 0) {
                    p = p.multiply(i);
                }
                count = 0;
                i = i.nextProbablePrime();
            }
        } while (!a.isProbablePrime(1) || count > 0);
        System.out.println(sq + "√" + (a.multiply(p)));
    }

    static int find_max_in_array_n_O(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    static int find_max_in_array_n_O_(int[] a) {
        int e = a.length - 1;
        int max = a[0];
        int end = (e + 1) / 2;
        for (int i = 0; i < end; i++) {
            max = Math.max(Math.max(max, a[e]), a[i + 1]);
            e--;
        }
        return max;
    }

    static String fibonacci_series(int a, int b, int n, String s) {
        return n >= 0 ? fibonacci_series(b, a + b, n - 1, s + " " + (a + b)) : s;
    }

    static boolean isKaprekarNumber(int n) {
        int sq = n * n, c = 0;
        for (int i = n; i > 0; i /= 10) c += 1;
        return sq % c + sq / c == n;
    }

    static boolean isCyclicNumber(long a) {
        long n = a, sum = 0, c = 0;
        while (n > 0) {
            sum = sum + n % 10;
            n = n / 10;
            c += 1;
        }
        for (int i = 2; i <= c; i++) {
            long k = a * i;
            long s = 0;
            while (k > 0) {
                s = s + k % 10;
                k = k / 10;
            }
            if (sum != s)
                return false;
        }
        return true;
    }

    static boolean isHappyNumber(int n) {
        do {
            int sum = 0;
            while (n > 0) {
                sum += pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        while (n != 1);
        return true;
    }
}
