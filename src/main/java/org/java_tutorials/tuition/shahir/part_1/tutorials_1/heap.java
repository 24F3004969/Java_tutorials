package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class heap {
    static HashSet<String> s = new HashSet<>();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        permutation_heaps_algo();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(s.size());
        System.out.println(s);

    }

    private static void permutation_heaps_algo() {
        int[] a = {1, 2, 3, 4};
        int[] index = new int[a.length];
        System.out.println(Arrays.toString(a));
        for (int i = 1; i < a.length; ) {
            if (index[i] < i) {
                int swap = (i % 2 == 0) ? 0 : index[i];
                int tmp = a[swap];
                a[swap] = a[i];
                a[i] = tmp;
                System.out.println(Arrays.toString(a));
                index[i] = index[i] + 1;
                i = 1;
            } else {
                index[i] = 0;
                i++;
            }
        }
    }

    public static String getNumber(int[] a) {
        return Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining());
    }
}
