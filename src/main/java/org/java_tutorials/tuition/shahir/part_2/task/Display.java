package org.java_tutorials.tuition.shahir.part_2.task;

public class Display {
    void display() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j % 2 == 0)
                    System.out.print(2 + " ");
                else
                    System.out.print(1 + " ");
            }
            System.out.println();
        }
    }

    void display(int n, int m) {
        if (m > n)
            System.out.println(m / n);
        else
            System.out.println(2 * m + 3 * n);
    }

    void display(double a, double b, double c) {
        double p = (a + b) / c;
        double q = a + b + c;
        System.out.println(p * q);
    }

    public static void main(String[] args) {
        Display d = new Display();
        d.display();
        d.display(5, 3);
        d.display(3.5, 3, 5);
    }
}
