package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Enter the numbers in the array");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        //sort the array
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for (int b = 0; b < 10; b++)
            System.out.println(a[b]);
    }
}
