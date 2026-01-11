package org.java_tutorials.tuition.shahir.part_1.classX;

import java.util.Arrays;

public class numbers {
    public static void main(String[] args) {
        //var t = randomArray(20);
        //System.out.println(Arrays.toString(t));
        //hashing(t);
        //System.out.println(Arrays.toString(t));
        System.out.println(order(345));
    }

    static String order(int n) {
        int p = n % 10;
        int q = n % 100;
        int diff = p - q / 10;
        int r;
        int c = 0, k = 0;
        n = n / 10;
        while (n > 9) {
            p = n % 10;
            q = n % 100;
            r = p - q / 10;
            c = r < 0 &&
                    diff < 0 ? 1 : 0;
            k = r > 0 &&
                    diff > 0 ? 1 : 0;
            n = n / 10;
        }
        return c == 1 ?
                "descending order" :
                k == 1 ?
                        "ascending order" :
                        "no order";
    }

    static int[] hashing(int[] a) {
        int size = a.length - 1;
        int[] hashed = new int[a.length];
        Arrays.fill(hashed, -1);
        System.out.println("filled negative");
        int index = 0;
        while (index <= size) {
            int val = a[index];
            int d = Math.abs(val % 10);
            //int d = v > size ? 0 : v;
            //if (hashed[d] != -1) {
                //int k = d;
                while (hashed[d] != -1) {
                    d = (d == size-1) ? 0 : d + 1;
                }
               /* if (d > k) {
                    for (int i = d; i > k; i--) {
                        hashed[i] = hashed[i - 1];
                    }
                } else if (d < k) {
                    for (int i = d; i >= 1; i--) {
                        hashed[i] = hashed[i - 1];
                    }
                    hashed[0] = hashed[size];
                    for (int i = size; i > k; i--) {
                        hashed[i] = hashed[i - 1];
                    }
                }*/
            //}
            hashed[d] = val;
            index++;
        }
        return hashed;
    }

    private static int[] randomArray(int n) {
        int[] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = (int) (Math.random() * n + j);
        }
        System.out.println("Array is filled");
        return a;
    }
}
