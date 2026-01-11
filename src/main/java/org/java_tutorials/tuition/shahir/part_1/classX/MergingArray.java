package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        int n1, n2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        n1 = in.nextInt();
        System.out.println("Enter the size of array2");
        n2 = in.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        System.out.println("Enter the elements of first elements");
        for (int i = 0; i < n1; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the elements of first elements");
        for (int i = 0; i < n1; i++) {
            b[i] = in.nextInt();
        }
        int c[] = new int[n1 + n2];
        int k = 0;
        for (int i = 0; i < (n1); i++) {
            c[k] = a[i];
            k++;
        }
        for (int i = 0; i < (n2); i++) {
            c[k] = b[i];
            k++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
