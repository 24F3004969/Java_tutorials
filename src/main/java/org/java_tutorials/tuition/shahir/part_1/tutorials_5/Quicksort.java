package org.java_tutorials.tuition.shahir.part_1.tutorials_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] x = randomArray(10000000);
        System.out.println(Arrays.toString(x));
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
        for (int j = 0; j < points.size(); j++) {
            Integer[] k = points.get(j);
            int start = k[0];
            int end = k[1];
            int pivot = k[1];
            for (int i = start; i < pivot; ) {
                if (a[pivot] < a[i]) {
                    int temp1 = a[pivot];
                    int temp2 = a[pivot - 1];
                    a[pivot] = a[i];
                    a[i] = temp2;
                    a[pivot - 1] = temp1;
                    pivot--;
                } else i++;
            }
            if (pivot - start >= 2) {
                points.add(new Integer[]{start, pivot - 1});
            }
            if (end - pivot >= 2) {
                points.add(new Integer[]{pivot + 1, end});
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
