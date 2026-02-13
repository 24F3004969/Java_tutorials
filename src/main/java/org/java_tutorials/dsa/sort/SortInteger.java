package org.java_tutorials.dsa.sort;

import java.util.Arrays;

public class SortInteger {
    static void main() {
        IO.println(Arrays.toString(merge_sort(new int[]{-20, 1, 5, -114, -16, 7, 12, 9, 59, 70, 4})));
    }

    public static int[] merge_sort(int[] a) {
        int counter = 1;
        while (counter <= a.length / 2) {
            compare(a, counter);
            System.out.println(Arrays.toString(a));
            counter = counter * 2;
        }
        return a;
    }

    private static void compare(int[] a, int counter) {
        for (int i = 0; i < a.length - counter; i = i + counter * 2) {
            int p = i, q = i + counter, end2 = q + counter, end1 = p + counter;
            IO.println(p + " " + (end1 - 1) + " " + q + " " + (end2 - 1));
            while (p < end1 && q < end2) {
                if (a[p] > a[q]) {
                    chain_swap(a, p, q);
                    q++;
                } else {
                    p++;
                }
            }
        }
    }

    private static void chain_swap(int[] a, int p, int q) {
        int tem = a[q];
        for (int i = q - 1; i >= p; i--) {
            a[i + 1] = a[i];
        }
        a[p] = tem;
    }
}
