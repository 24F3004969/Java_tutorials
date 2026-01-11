package org.java_tutorials.dsa.util;

import java.util.Arrays;

/**
 * @author hilal on 29-01-2023
 * @project Java_tutorials
 */
public class PascalTriangles {
    public static void main(String[] args) {
        draw_pascal_triangle(50);
    }

    public static void draw_pascal_triangle(int size) {
        int start = size, end = size;
        long []val={};
        var v=pascal(new long[]{1}, 0, size);
        System.out.println(Arrays.toString(v));
        int max=(String.valueOf(pascal(new long[]{1}, 0, size)[size / 2])).length();
        for (int i = 0; i <= size; i++) {
            int c = 0;
            int k = 0;
            val=pascal(val,0,0);
            for (int j = 0; j<=end; j++) {
                if (j >= start) {
                    if (c == 0) {
                        System.out.print(adjustSpace(String.valueOf(val[k]), max));
                        c = 1;
                        k++;
                    } else {
                        System.out.print(adjustSpace(" ", max));
                        c = 0;
                    }
                } else System.out.print(adjustSpace(" ", max));
            }
            start = start - 1;
            end = end + 1;
            System.out.println();
        }
    }
    static String adjustSpace(String s, int max) {
        return (s + " ".repeat(max - s.length()));
    }
    public static long[] pascal(long[] a, int index, int max_size) {
        long[] tem = new long[a.length + 1];
        tem[0] = 1;
        for (int i = 1; i < a.length; i++) {
            tem[i] = a[i - 1] + a[i];
        }
        tem[a.length] = 1;
        return (index < max_size) ? pascal(tem, index + 1, max_size) : tem;
    }
}
