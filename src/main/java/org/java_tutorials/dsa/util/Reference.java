package org.java_tutorials.dsa.util;

import java.util.Arrays;

public class Reference {
    void a(int n) {
        n = 15;
        //System.out.println(n);
    }

    void b(int[] ar) {
        ar[3] = -5;
        //System.out.println(Arrays.toString(ar));
    }

    void c(String st) {
        st = "Helal";
    }

    public static void main(String[] args) {
        Reference r = new Reference();
        int x = 14;
        System.out.println(x);
        int[] z = {9, 5, 7, 12};
        System.out.println(Arrays.toString(z));
        r.a(x);
        System.out.println(x);
        r.b(z);
        System.out.println(Arrays.toString(z));
        String st = "Yusuf";
        System.out.println(st);
        r.c(st);
        System.out.println(st);
    }
}
