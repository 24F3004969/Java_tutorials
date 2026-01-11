package org.java_tutorials.tuition.shahir.part_1.classX;

import org.java_tutorials.dsa.util.MyArrays;

import java.util.Arrays;

public class SameElements {
    public static void main(String[] args) {
        var a = MyArrays.random_array(10);
        var b = MyArrays.random_array(10);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        printSameElements(a, b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

    public static void printSameElements(int[] a, int[] b) {
        var _a = Arrays.copyOf(a, a.length);
        var _b = Arrays.copyOf(b, b.length);
        Arrays.sort(_a);
        Arrays.sort(_b);
        int start = 0, end = a.length - 1;
        for (int i = 0; i < _a.length - 1; i++) {
            int e = _a[i];
            int x = 1;
            int c = 0;
            while (x > 0) {
                x = Arrays.binarySearch(_b, start, end, e);
                start = x + 1;
                if (x > 0)
                    c++;
            }
            System.out.println(e+" is present "+c+" times");
            c=0;
            start = 0;
            while (_a[i] == _a[i + 1])
                i++;
        }
    }

}
