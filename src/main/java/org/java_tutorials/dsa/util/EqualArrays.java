package org.java_tutorials.dsa.util;

import java.util.*;

public class EqualArrays {
    public static void main(String[] args) {
        var arr = getRandomArrayEqual(20000000);
        var p = arr[0];
        var q = arr[1];
        //System.out.println(Arrays.toString(p));
        //System.out.println(Arrays.toString(q));
        long start = System.currentTimeMillis();
        System.out.println(isArrayEquivalent(p, q));
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isArrayEquivalent(int[] a, int[] b) {
        Arrays.parallelSort(a);
        Arrays.parallelSort(b);
        return Arrays.equals(a, b);
    }

    public static int[][] getRandomArrayEqual(int size) {
        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0; i < size; i++) {
            var x = (int) (Math.random() * size);
            a[size - 1 - i] = x;
            b[i] = x;
        }
        return new int[][]{a, b};
    }

    public static int[][] getRandomArrayUnEqual(int size) {
        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0; i < size; i++) {
            var x = (int) (Math.random() * size);
            a[size - 1 - i] = x;
            b[i] = x;
        }
        return new int[][]{a, b};
    }

    public static boolean sum_sort_algorithm(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        else {
            int s1 = 0, s2 = 0, start = 0;
            for (int i = 0; i < a.length; i++) {
                s1 += a[i];
                s2 += b[i];
                if ((s1 == s2)) {
                    Arrays.parallelSort(a, start, i+1);
                    Arrays.parallelSort(b, start, i+1);
                    for (int j = start; j <= i; j++) {
                        if (a[j] != b[j])
                            return false;
                    }
                    start = i + 1;
                }
            }
        }
        return true;
    }
}
