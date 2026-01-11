package org.java_tutorials.tuition.shahir.part_1.classX;


import java.util.*;

public class Binary {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println("Enter 10 numbers");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
        System.out.println("Enter the number to search");
        int n = in.nextInt();
        int c = 0;
        int lb = 0, up = 9, mid;
        while (lb <= up)
        {
            mid = (lb + up) / 2;
            if (a[mid] == n) {
                c = 1;
                break;
            }
            else if (n > a[mid])
                lb = mid + 1;
            else if (n < a[mid])
                up = mid - 1;
        }
        if (c == 1)
            System.out.println("Number is present");
        else
            System.out.println("Number is not present");
    }
}
