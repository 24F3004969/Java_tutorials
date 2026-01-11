package org.java_tutorials.tuition.shahir.part_1.arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        pascal(10);
    }

    public static void pascal(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(arr[j] + " ");
            }
            int[] pas = new int[i+1];
            pas[0] = 1;
            System.out.println();
            for (int j = 1; j < i; j++) {
                pas[j] = arr[j - 1] + arr[j];
            }
            arr=pas;
        }
    }
}
