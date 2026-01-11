package org.java_tutorials.tuition.shahir.part_1.tutorials_14;

public class Hatif {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0;
        System.out.print(1 + ",");
        for (int i = 2; i <= 15; i++) {
            if (prime(i)) {
                c = (int) Math.pow(2, a);
                System.out.print(c + ",");
                a++;
            } else if (perfect_sq(i)) {
                d = (int) Math.pow(3, b);
                System.out.print(d + ",");
                b++;
            } else {
                int e = d + c;
                System.out.print(e + ",");
                c = d;
                d = e;

            }
        }
    }

    static boolean prime(int a) {
        int c = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                c++;
        }
        return c == 2;
    }

    static boolean perfect_sq(int a) {
        return Math.pow((int) Math.sqrt(a), 2) == a;
    }
}
