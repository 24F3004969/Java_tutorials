package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondMin {
    public static void main(String[] args) {
        int[] a = {4, 12, -4, 6, 3, 12, 17};
        int[] b = IntStream.range(0, 7).map(i -> -3).toArray();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (a[i] > b[j]) {
                    b[j] = a[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
