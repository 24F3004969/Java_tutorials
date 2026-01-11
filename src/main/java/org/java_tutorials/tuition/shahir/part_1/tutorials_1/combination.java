package org.java_tutorials.tuition.shahir.part_1.tutorials_1;


import java.util.Arrays;

public class combination {
    static int c = 0;

    public static void main(String[] args) {
        Object[] a = {"a", "b", "c", "d", "e", "f", "g", "h"};
        long start = System.currentTimeMillis();
        //helal_algo(a, 0, 5, 2, "");
        _combination(a, 8);
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void helal_algo(Object[] a, int i, int size, int k, String x) {
        if (i < size) {
            if (i == k) {
                for (int u = i; u < a.length; u++) {
                    for (int v = u + 1; v < a.length; v++) {
                        System.out.println(x + a[u] + "" + a[v]);
                        c++;
                    }
                }
            } else {
                x = x + a[i];
                for (int j = i; j < size; ) {
                    helal_algo(a, j + 1, a.length - 1, k, x);
                    k = k + 1;
                    j++;
                    x = (j < size) ? x.substring(0, x.length() - 1) + a[j] : x;
                }
            }
        }
    }

    private static void _combination(Object[] x, int size) {
        var list = new Object[70];
        last_two_index_combination_algo(x, 0, x.length - size + 1, size - 2, "", list, 0);
        System.out.println(Arrays.toString(list));
    }

    private static int last_two_index_combination_algo(Object[] a, int i, int size, int k, String x, Object[] list, int t) {
        if (i < size) {
            if (i == k) {
                for (int u = i; u < a.length; u++) {
                    for (int v = u + 1; v < a.length; v++) {
                        list[t] = (check_for_sign(x + a[u] + a[v]));
                        t++;
                    }
                }
            } else {
                x = x + a[i];
                for (int j = i; j < size; ) {
                    t = last_two_index_combination_algo(a, j + 1, a.length - 1, k, x, list, t);
                    k = k + 1;
                    j++;
                    x = (j < size) ? x.substring(0, x.length() - 1) + a[j] : x;
                }
            }
        }
        return t;
    }

    private static String check_for_sign(String s) {
        return s.replace("+-", "-").replace("++", "+").replace("--", "+").replace("-+", "-");
    }
}
