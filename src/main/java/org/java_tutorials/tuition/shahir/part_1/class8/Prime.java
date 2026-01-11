package org.java_tutorials.tuition.shahir.part_1.class8;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        double n, c = 0;
        n = in.nextDouble();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
            if (c>2)
                break;
        }
        if (c == 2)
            System.out.println("Prime number");
        else
            System.out.println("Composite number");
    }
}
