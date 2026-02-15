package org.java_tutorials.dsa.sort;

import java.util.Arrays;

public class SortInteger {
    public static void main(String[] args) {
        //IO.println(Arrays.toString(merge_sort(new int[]{0, 1, 2, 11, 5, 7, 35, 34, 54, 88})));
        long startTime = System.currentTimeMillis();
       merge_sort(/*new int[]{-20, 1, 5, -4, -26, 7, 12, 9, 59, 70}*/randomArray(8000000));
       long endTime = System.currentTimeMillis();
       System.out.println(endTime - startTime);
    }

    public static int[] _merge_sort(int[] a) {
        int x = ((a.length % 2 == 0) ? a.length / 2 : (a.length + 1) / 2);
        int c = 2;
        for (int j = 1; j < x; j++) {
            int xd = 0;
            int[] tem = new int[a.length];
            if (a.length / c == 1) {

            } else {
                for (int i = 0; i <= a.length - c; i = i + c) {
                    int p = i, q = i + c / 2, r = q, s = r + c / 2;
                    System.out.println(p + "  " + q + "  " + r + "  " + s);
                    while (p < q && r < s) {
                        if (a[p] > a[r]) {
                            tem[xd] = a[r];
                            r++;
                        } else {
                            tem[xd] = a[p];
                            p++;
                        }
                        xd++;
                        System.out.println(Arrays.toString(tem));
                    }
                    while (p < q) {
                        p++;
                        tem[xd] = a[p];
                        xd++;
                    }
                    while (r < s) {
                        r++;
                        tem[xd] = a[r];
                        xd++;
                    }
                }
                if (a.length % 2 == 1) {
                    tem[xd] = a[a.length - 1];
                }
            }
            c = c * 2;
            System.out.println(Arrays.toString(tem));
            a = tem;
        }
        return a;
    }

    /*
        private static void chain_swap(int[] a, int p, int q) {
            int tem = a[q];
            for (int i = q - 1; i >= p; i--) {
                a[i + 1] = a[i];
            }
            a[p] = tem;
        }*/
    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * i * i + i);
        }
        System.out.println("The array is filled");
        return a;
    }

    public static int[] merge_sort(int[] a) {
        int len = 2;
        while (len <= a.length) {
            int c = len / 2;
            int[] tem = new int[a.length];
            int ind = 0;

            for (int k = 0; k < a.length; k = k + len) {
                ind = merge(a, k, k + c, k + c, k + 2 * c, ind, tem);
            }
            if (a.length / len == 1) {
                a = tem;
                int[] t = new int[a.length];
                merge(a, 0, len , len , a.length, 0, t);
                return t;
            }
            a = tem;
            len = len * 2;
        }
        return a;
    }

    private static int merge(int[] a, int i, int j, int end1, int end2, int ind, int[] tem) {
        while (i < end1 && j < end2 && ind < a.length && i < a.length && j < a.length) {
            if (a[i] >= a[j]) {
                tem[ind++] = a[j++];
            } else {
                tem[ind++] = a[i++];
            }
        }
        while (i < end1 && ind < a.length) {
            tem[ind++] = a[i++];
        }
        while (j < end2 && ind < a.length) {
            tem[ind++] = a[j++];
        }
        return ind;
    }

}
