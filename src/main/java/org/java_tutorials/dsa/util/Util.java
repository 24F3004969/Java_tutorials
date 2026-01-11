package org.java_tutorials.dsa.util;

import java.util.Arrays;

public final class Util {
    public static void print(Object object) {
        System.out.print(object);
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void println(Object[] objects) {
        System.out.println(Arrays.toString(objects));
    }

    public static void println(Object[][] objects) {
        System.out.println(Arrays.deepToString(objects));
    }


    public static int[] getRow(int[][] a, int index) {
        return a[index];
    }

    public static int[] getColumn(int[][] a, int index) {
        return Arrays.stream(a).mapToInt(ints -> ints[index]).toArray();
    }

    public static Element<Integer> findMax(int[] a) {
        return _find_max(a, 0, a.length, 0, 0);
    }

    public static Element<Integer> findMaxFrom(int[] a, int from) {
        return _find_max(a, from, a.length, a[from], from);
    }

    public static Element<Integer> findMaxInBetween(int[] a, int from, int to) {
        to = to < a.length ? to + 1 : to;
        return _find_max(a, from, to, a[from], from);
    }

    public static Element<Integer> findMin(int[] a) {
        return _find_min(a, 0, a.length, a[0], 0);
    }

    public static Element<Integer> findMinFrom(int[] a, int from) {
        return _find_min(a, from, a.length, a[from], from);
    }

    public static Element<Integer> findMinInBetween(int[] a, int from, int to) {
        to = to < a.length ? to + 1 : to;
        return _find_min(a, from, to, a[from], to);
    }

    private static Element<Integer> _find_max(int[] a, int index, int endIndex, int max, int max_index) {
        return index < endIndex ? _find_max(a, index + 1, endIndex, Math.max(a[index], max),
                a[max_index] < a[index] ? index : max_index) : new Element<Integer>(max, max_index);
    }

    private static Element<Integer> _find_min(int[] a, int index, int endIndex, int min, int min_index) {
        return index < endIndex ? _find_min(a, index + 1, endIndex, Math.min(a[index], min),
                a[min_index] > a[index] ? index : min_index) : new Element<Integer>(min, min_index);
    }


    public static long[] getRow(long[][] a, int index) {
        return a[index];
    }

    public static long[] getColumn(long[][] a, int index) {
        return Arrays.stream(a).mapToLong(ints -> ints[index]).toArray();
    }

    public static Element<Long> findMax(long[] a) {
        return _find_max(a, 0, a.length, 0, 0);
    }

    public static Element<Long> findMaxFrom(long[] a, int from) {
        return _find_max(a, from, a.length, a[from], from);
    }

    public static Element<Long> findMaxInBetween(long[] a, int from, int to) {
        to = to < a.length ? to + 1 : to;
        return _find_max(a, from, to, a[from], from);
    }

    public static Element<Long> findMin(long[] a) {
        return _find_min(a, 0, a.length, a[0], 0);
    }

    public static Element<Long> findMinFrom(long[] a, int from) {
        return _find_min(a, from, a.length, a[from], from);
    }

    public static Element<Long> findMinInBetween(long[] a, int from, int to) {
        to = to < a.length ? to + 1 : to;
        return _find_min(a, from, to, a[from], to);
    }

    private static Element<Long> _find_max(long[] a, int index, int endIndex, long max, int max_index) {
        return index < endIndex ? _find_max(a, index + 1, endIndex, Math.max(a[index], max),
                a[max_index] < a[index] ? index : max_index) : new Element<Long>(max, max_index);
    }

    private static Element<Long> _find_min(long[] a, int index, int endIndex, long min, int min_index) {
        return index < endIndex ? _find_min(a, index + 1, endIndex, Math.min(a[index], min),
                a[min_index] > a[index] ? index : min_index) : new Element<Long>(min, min_index);
    }

    public static <T extends Number> T findMax(T[] o) {
        T m = o[0];
        for (T t : o) if (m.doubleValue() < t.doubleValue()) m = t;
        return m;
    }

    public static boolean hasRepeatChar(String str) {
        char[] arr_str = str.toCharArray();
        Arrays.sort(arr_str);
        for (int z = 0; z < arr_str.length - 1; z++) {
            if (arr_str[z] == arr_str[z + 1])
                return true;
        }
        return false;
    }
}

