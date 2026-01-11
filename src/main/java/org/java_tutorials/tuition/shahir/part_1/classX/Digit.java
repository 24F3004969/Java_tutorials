package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x, t;
        x = in.nextInt();
        for (int i = 0; i <= 9; i += 1) {
            t = x;
            while (t > 0) {
                int r = t % 10;
                if (r == i)
                    System.out.print(i);
                t /= 10;
            }
        }

    }
}
