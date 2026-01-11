package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class LCMOfList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        //finding lcm
        int m = a[0];
        int lcm = 1;
        for (int i = 1; i < size; i++) {
            int n = a[i];
            int max = Math.max(n, m);
            lcm = 1;
            for (int j = 2; j < max; ) {
                if (m % j == 0 && n % j == 0) {
                    m = m / j;
                    n = n / j;
                    lcm = lcm * j;
                } else j++;
            }
            lcm = lcm * m * n;
            m = lcm;
        }
        System.out.println(lcm);
    }
}
