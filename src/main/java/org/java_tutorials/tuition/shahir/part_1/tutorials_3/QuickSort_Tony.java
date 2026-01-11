package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort_Tony {
    public static void main(String[] args) {
        int[] x =/*new int[]{5, -54, 5, 5454, 5, 1, 9, 87, 26, 69, 98, 1, 3};*/randomArray1(10000000);
        System.out.println(Arrays.toString(x));
        long start = System.currentTimeMillis();
        //sort(new int[]{5, -54, 5, 5454, 5, 1, -136, 87, 26, 69, 98, 1, 3});
        _sort(/*new int[]{5, -54, 5, 5454, 5, 1, -136, 87, 26, 69, 98, 1, 3}*/x);
        System.out.println(System.currentTimeMillis() - start);
        //System.out.println(Arrays.toString(x));

        //System.out.println(Arrays.toString(x));
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n + j);
        }
        System.out.println("Array is filled");
        return a;
    }

    private static int[] randomArray1(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * (n * n - Math.random() * n));
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
            if (j - start >= 1)
                points.add(new Integer[]{start, j});
            if (end - j >= 1)
                points.add(new Integer[]{j + 1, end});
        }
    }

    private static void _sort(int[] a) {
        int[][] points = new int[a.length * 2][2];
        points[0] = new int[]{0, a.length - 1};
        int filled_sized = 1;
        int[] k;
        int start, end, pivot, i, j;
        for (int z = 0; z <= filled_sized; z++) {
            k = points[z];
            start = k[0];
            end = k[1];
            pivot = a[(start + end) / 2];
            i = start - 1;
            j = end + 1;
            while (true) {
                while (a[++i] < pivot) ;
                while (a[--j] > pivot) ;
                if (i >= j) {
                    break;
                }
                int tem = a[i];
                a[i] = a[j];
                a[j] = tem;
            }
            if (j - start >= 1)
                points[++filled_sized] = new int[]{start, j};

            if (end - j >= 1)
                points[++filled_sized] = new int[]{j + 1, end};

        }
    }
}
