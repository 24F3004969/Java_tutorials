package org.java_tutorials.function;

public class Display {
    void display() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0)
                    System.out.print(2);
                else
                    System.out.print(1);
            }
            System.out.println();
        }
    }

    void display(int n, int m) {
        if (m > n)
            System.out.println(m / n);
        else
            System.out.println(3 * m + 2 * n);
    }

    double display(double a, double b, double c) {
        double p = (a + b) / c;
        double q = a + b + c;
        double z = p * q;
        return z;
    }
}
