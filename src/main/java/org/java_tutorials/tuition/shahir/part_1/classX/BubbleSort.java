package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter a array");
        Scanner in = new Scanner(System.in);
        int[] a = randomArray(10);
        int temp;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(a));
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n + j);
        }
        System.out.println("Array is filled");
        return a;
    }
}
