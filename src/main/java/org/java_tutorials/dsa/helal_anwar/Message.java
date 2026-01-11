package org.java_tutorials.dsa.helal_anwar;

import java.util.Arrays;

public class Message {
    public static void main(String[] args) {
        String[][] a = new String[2][5];
        String[][] b = new String[5][55];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]="*";
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j]="#";
            }
        }
        Merge(a, b);
    }

    private static void Merge(String[][] a, String[][] b) {
        String[][] s = new String[Math.max(a.length, b.length)][a[0].length + b[0].length];
        String[][][] x = {a, b};
        int r = 0, l = 0;
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                String[][] k = x[r];
                s[i][j] = k.length > i ? k[i][l] : " ";
                if (l+1==k[0].length) {
                    l = 0;
                    r++;
                } else l++;

            }
            r = 0;
        }
        Arrays.stream(s).forEachOrdered(strings -> {
            Arrays.stream(strings, 0, s[0].length).forEachOrdered(System.out::print);
            System.out.println();
        });
    }
}
