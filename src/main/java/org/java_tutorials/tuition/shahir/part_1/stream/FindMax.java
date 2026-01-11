package org.java_tutorials.tuition.shahir.part_1.stream;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int a, b, c, max, min;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        a = in.nextInt();
        System.out.println("Enter a number");
        b = in.nextInt();
        System.out.println("Enter a number");
        c = in.nextInt();
        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        if (a < b && a < c)
            min = a;
        else if (b < a && b < c)
            min = b;
        else
            min = c;

        System.out.printf("The max value is %d\n ", max);
        System.out.printf("The min value is %d", min);
    }
}
