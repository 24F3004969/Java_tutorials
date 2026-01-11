package org.java_tutorials.dsa.util;

import java.util.*;

class Fun {

    public static void main(String... args) {
        //int value = Integer.parseInt(args[0]);
        System.out.println(triangle(15));
    }

    static long[] pascal(long[] a) {
        long[] tem = new long[a.length + 1];
        tem[0] = 1;
        for (int i = 1; i < a.length; i++) {
            tem[i] = (a[i - 1] + a[i]) % 2;
        }
        tem[a.length] = 1;
        return tem;
    }

    static String getColor(int i) {
        String[] color = {
                "\033[0;31m", "\033[0;32m",
                "\033[0;33m", "\033[0;34m", "\033[0;35m",
                "\033[0;36m", "\033[0;97m", "\033[0;96m"
        };
        return color[i];
    }

    static String triangle(int size) {
        int start = size, end = size;
        StringBuilder s = new StringBuilder();
        long[] val = {};
        int t = 0;
        for (int i = 0; i <= size; i++) {
            int c = 0;
            int k = 0;
            val = pascal(val);
            for (int j = 0; j <= end; j++) {
                if (j >= start) {
                    if (c == 0) {
                        long num = val[k];
                        s.append(num == 1 ?
                                (getColor(t) + num + "\33[0m") : " ");
                        c = 1;
                        k++;
                    } else {
                        s.append(" ");
                        c = 0;
                    }
                } else s.append(" ");
            }
            if ((i + 1) % 4 == 0) {
                t = t == 7 ? 0 : t + 1;
            }
            start = start - 1;
            end = end + 1;
            s.append('\n');
        }
        return s.toString();
    }
}
