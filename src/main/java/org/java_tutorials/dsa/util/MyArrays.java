package org.java_tutorials.dsa.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class MyArrays {
    public static int[] random_array(int n) {
        var x = new int[n];
        int k;
        for (int i = 0; i < n; i++) {
            k = (int) (Math.random() * (n - 3) * 3 + 1);
            x[i] = (int) (Math.random() * k);
        }
        return x;
    }

    void remove_repetition_with_order(int a[]) {

    }

    static void remove_repetition(int[] a) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (var w : a) {
            set.add(w);
        }
        System.out.println(set);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        int[] b = new int[a.length];
        int i = 1, k = 0;
        while (i < a.length) {
            if (a[i - 1] != a[i]) {
                b[k] = a[i - 1];
                k++;
            }
            i++;
        }
        b[k] = a[i - 1];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        remove_repetition(new int[]{6, 4,6, -76,6, -89,4,-76,12});
    }
}
