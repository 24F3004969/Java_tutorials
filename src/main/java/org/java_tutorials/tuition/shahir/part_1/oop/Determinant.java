package org.java_tutorials.tuition.shahir.part_1.oop;

public class Determinant {
    public static void main(String[] args) {
        int del = 0;
        int[][] a = {{4, 3, 1}, {5, 6, 7}, {7, -5, -4}};
        for (int i = 0; i <= 2; i++) {
            int val = a[0][i];
            int[][] ar = new int[2][2];
            int x = 0, y = 0;
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 2; k++) {
                    if (k != i && j != i) {
                        ar[y][x] = a[j][k];
                        if (x == 1) {
                            y = y + 1;
                            x = 0;
                        } else
                            x++;
                    }
                }
            }
            if (i % 2 == 0)
                del = del + val*(ar[0][0] * ar[1][1] - ar[0][1] * ar[1][0]);
            else
                del = del - val*(ar[0][0] * ar[1][1] - ar[0][1] * ar[1][0]);
        }
        System.out.println(del);
    }
}
