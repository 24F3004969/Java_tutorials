package org.java_tutorials.tuition.shahir.part_1.arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int n=sc.nextInt();
        int lb = 0, ub = 9,mid;
        int c=0;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (a[mid] == n)
            {
                c=1;
                break;
            }
            else if (a[mid] > n)
                ub = mid - 1;
            else if (a[mid] < n)
                lb = mid + 1;
        }
        if (c==1)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
}
