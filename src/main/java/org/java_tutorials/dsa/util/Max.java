package org.java_tutorials.dsa.util;

import java.util.Scanner;

/**
 * @author hilal on 25-03-2023
 * @project Java_tutorials
 */
public class Max {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        int max = a[0];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        System.out.println("The max element is = " + max + " present at " + (index + 1) + " index");
    }
}
