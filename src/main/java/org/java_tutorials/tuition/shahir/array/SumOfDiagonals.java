package org.java_tutorials.tuition.shahir.array;

public class SumOfDiagonals {
    static void main() {

        int[][] matrix = {
                          {1, 2, 2},
                          {5, 6, 7},
                          {9, 10, 11}
                        };
        int left = 0, right = 0;
        for (int i = 0; i < matrix.length; i++) {
            left += matrix[i][i];
            right += matrix[i][matrix.length - i - 1];
        }
        System.out.println(left);
        System.out.println(right);
    }
}
