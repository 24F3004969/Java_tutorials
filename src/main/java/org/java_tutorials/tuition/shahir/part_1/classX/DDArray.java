package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Scanner;

public class DDArray {
    public static void main(String[] args) {
        int[][] a = new int[3][3];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {//i is  for row
            System.out.println("Enter the values for row " + (i + 1));
            for (int j = 0; j < 3; j++) {//j is for column
                System.out.println("Enter the values for row " + (i + 1) + " and column " + (j + 1));
                a[i][j] = in.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
        int p = 0, q = 0, m = 0, n = 2;
        int s1 = 0, s2 = 0;
        while ((p < 3 && q < 3)) {
            s1 = s1 + a[p][q];
            s2 = s2 + a[m][n];
            p++;
            q++;
            m++;
            n--;
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
