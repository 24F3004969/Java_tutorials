package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zoya;
        int a, b;
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to subtract ");
        System.out.println("Enter 3 to multiply");
        zoya = in.nextInt();
        System.out.println("Enter two number");
        a = in.nextInt();
        b = in.nextInt();
        switch (zoya) {
            case 1: {
                System.out.println("The sum of two numbers");
                System.out.println(a + b);
                int z = 5;
                int p = a * z;
            }
            break;
            case 2: {
                System.out.println(a - b);
            }
            break;
            case 3: {
                System.out.println(a * b);
            }
            break;
            default: {
                System.out.println("Invalid input");

            }
        }
    }
}
