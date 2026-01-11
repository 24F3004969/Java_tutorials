package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class ArraysQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i] + " same at index " + i + " " + j);
                }
            }
        }
    }
}
