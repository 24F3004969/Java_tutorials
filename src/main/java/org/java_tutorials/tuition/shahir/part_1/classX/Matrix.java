package org.java_tutorials.tuition.shahir.part_1.classX;

import org.java_tutorials.dsa.util.Num;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer[][] a = new Integer[2][2];
        Double[][] b = new Double[2][2];
        Double[][] c = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = in.nextDouble();
            }
        }
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < 2; i++) {
                double s = 0;
                for (int j = 0; j < 2; j++) {
                    s = s + a[k][j] * b[j][i];
                }
                c[k][i] = s;
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(c));
        System.out.println(Arrays.deepToString(multiply_matrix(a,b)));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static <T extends java.lang.Number> Num<?>[][] multiply_matrix(T[][] a, T[][] b) {
        int m1 = a.length, n1 = a[0].length;
        int m2 = b.length, n2 = b[0].length;
        if (n1 != m2) {
            System.err.println("This matrix cannot be multiplied");
            return null;
        } else {
            Num<?>[][] c = new Num<?>[m1][n2];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    Num<?> p = new Num<>(0);
                    for (int k = 0; k < m2; k++) {
                        p = p.plus(new Num<>(a[i][k]).
                                multiply(new Num<Number>(b[k][j])));
                    }
                    c[i][j] = p;
                }
            }
            return c;

        }
    }

}
