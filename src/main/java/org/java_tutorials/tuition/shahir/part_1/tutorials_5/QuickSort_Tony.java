package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_Tony {
    public static void main(String[] args) {
        int[] x = randomArray(10000000);
        sort(x);
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n);
        }
        System.out.println("Array is filled");
        return a;
    }

    private static void sort(int[] a) {
        var points = new ArrayList<Integer[]>();
        points.add(new Integer[]{0, a.length - 1});
        for (int z = 0; z < points.size(); z++) {
            Integer[] k = points.get(z);
            int start = k[0];
            int end = k[1];
            int pivot = a[(start + end) / 2];
            int i = start - 1;
            int j = end + 1;
            while (true) {
                do {
                    i = i + 1;
                } while (a[i] < pivot);
                do {
                    j = j - 1;
                } while (a[j] > pivot);
                if (i >= j) {
                    break;
                }
                int tem = a[i];
                a[i] = a[j];
                a[j] = tem;
            }
            if (j - start >= 2)
                points.add(new Integer[]{start, j});
            if (end - j >= 2)
                points.add(new Integer[]{j + 1, end});
        }
        System.out.println("Sorted");
        System.out.println(Arrays.toString(a));
    }
}
