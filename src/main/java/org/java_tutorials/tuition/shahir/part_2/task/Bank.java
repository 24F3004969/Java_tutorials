package org.java_tutorials.tuition.shahir.part_2.task;

import java.util.Scanner;

public class Bank {
    double p, n, r, a;

    void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of p:");
        p = in.nextDouble();
        System.out.println("Enter the value of n:");
        n = in.nextDouble();
    }

    void calculate() {
        if (n <= 0.5)
            r = 9;
        else if (n > 0.5 && n <= 1)
            r = 10;
        else if (n > 1 && n <= 3)
            r = 11;
        else
            r = 12;
        a = p * Math.pow(1 + r / 100, n);

    }

    void display() {
        System.out.println("Principle\t\t\tTime\t\t\tRate\t\t\tAmount");
        System.out.println(p + "\t\t\t" + n + "\t\t\t" + r + "\t\t\t" + a);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.accept();
        bank.calculate();
        bank.display();
    }
}
