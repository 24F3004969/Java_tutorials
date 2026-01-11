package org.java_tutorials.tuition.shahir.part_1.tutorials_14;

public class FindPrime {
    public static void main(String[] args) {
        int k = 0;
        System.out.println(isPrime(7));
        System.out.println(find_the_multiple_after(5, 40));
        System.out.println(find_the_multiple_before(11, 123));
        //System.out.println(isPrime(  519855239357313120603311363837D));
    }

    public static boolean isPrime(double n) {
        int count = 0;
        n = Math.abs(n);
        if (Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0)
            return false;
        int i = 23;
        while (i <= (int) Math.sqrt(n)) {
            if (n % i == 0) {
                count++;
            }
            if (count > 1)
                return false;
            i += 2;
        }
        return true;
    }

    public static boolean isPrime(long n) {
        int count = 0;
        n = Math.abs(n);
        if ((n == 1) || (n % 2 == 0 && n != 2) ||
                (n % 3 == 0 && n != 3) ||
                (n % 5 == 0 && n != 5) ||
                (n % 7 == 0 && n != 7) ||
                (n % 11 == 0 && n != 11) ||
                (n % 13 == 0 && n != 13) ||
                (n % 17 == 0 && n != 17) ||
                (n % 19 == 0 && n != 19))
            return false;
        if (Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0)
            return false;
        int i = 23;
        while (i <= (int) Math.sqrt(n)) {
            if (n % i == 0)
                count++;
            if (count > 1)
                return false;
            i = i + 2;
        }
        return true;
    }

    private void _findFactors(int n) {
        if (!isPrime(n)) {
            int bound = (int) Math.sqrt(n);
            for (int i = 1; i <= bound; i++) {
                if (n % i == 0) {
                    var b = n / i;
                    System.out.println(i);
                    if (b != i)
                        System.out.println(b);
                }
            }
        }
    }

    void multiple(int i, int j, int a) {
        var x = System.currentTimeMillis();
        while (i <= j) {
            if (i % a == 0)
                System.out.println(i);
            i++;
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - x);
    }

    void _multiple(int i, int j, int a) {
        var x = System.currentTimeMillis();
        while (i <= j) {
            System.out.println(i);
            i = i + a;
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - x);
    }

    static int find_the_multiple_after(int of, int after) {
        return (after - after % of) + of;
    }

    static int find_the_multiple_before(int of, int before) {
        return before - before % of;
    }

}

