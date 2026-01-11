package org.java_tutorials.tuition.shahir.part_1.arrays;

import java.util.Scanner;

public class ArraySameLines {
    public static void main(String[] args) {
        int a[] = new int[10];
        System.out.println("Enter 10 elements:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the position in which u want to put this element");
            int x = in.nextInt();
            System.out.println("Enter the value");
            a[x] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
