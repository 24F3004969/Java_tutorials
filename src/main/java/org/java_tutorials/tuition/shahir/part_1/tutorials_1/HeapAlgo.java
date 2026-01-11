package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Arrays;

class HeapAlgo {


    // Driver main.java.org.jmath.tutorials_3
    public static void main(String[] args) {
        HeapAlgo obj = new HeapAlgo();
        int[] a = {1,3,4};
        long start = System.currentTimeMillis();
        obj.heapPermutation(a, 2);
        System.out.println(System.currentTimeMillis() - start);
    }

    void printArr(int[] a, int n) {
        /*for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();*/
    }

    // Generating permutation using Heap Algorithm
    void heapPermutation(int[] a, int size) {
        if (size == 1)
            System.out.println(Arrays.toString(a));
        else {
            for (int i = 0; i < size; i++) {
                heapPermutation(a, size - 1);
                int temp;
                if (size % 2 != 0) {
                    temp = a[0];
                    a[0] = a[size - 1];
                } else {
                    temp = a[i];
                    a[i] = a[size - 1];
                }
                a[size - 1] = temp;
            }
        }
    }
}
