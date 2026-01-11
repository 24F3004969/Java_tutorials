package org.java_tutorials.tuition.shahir.part_1.classIX;

public class Print {
    void print() {
        int k = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    void print(int n) {
        int s = 0;
        int t = n;
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
        if (s * s * s == t)
            System.out.println("Dudeney Number");
        else
            System.out.println("Not Dudeney Number");
    }

    void print(int a, char ch) {
        if (ch == 's' || ch == 'S')
            System.out.println(a * a);
        else if (ch == 'c' || ch == 'C')
            System.out.println(a * a * a);
    }

    public static void main(String[] args) {
        Print p = new Print();
        p.print();
        p.print(512);
        p.print(2, 's');
    }
}
