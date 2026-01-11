package org.java_tutorials.tuition.shahir.class9th;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findFulcrum(new int[]{1, 2, 3})));
    }

    public static int[] findFulcrum(int[] a) {
        int i = 0, j = a.length - 1;
        int l_s = a[i], r_s = a[j];
        ArrayList<int[]> list = new ArrayList<>();
        while (j - i > 1) {
            if (r_s > l_s) {
                if ((r_s + a[j - 1]) < r_s) {
                    r_s = r_s + a[j - 1];
                    j--;
                } else if ((l_s + a[i + 1]) > l_s) {
                    l_s = l_s + a[i + 1];
                    i++;
                }
            } else if (l_s > r_s) {
                if ((l_s + a[i + 1]) < l_s) {
                    l_s = l_s + a[i + 1];
                    i++;
                } else if ((r_s + a[j - 1]) > r_s) {
                    r_s = r_s + a[j - 1];
                    j--;
                }
            } else {
                if (a[i + 1] == 0) {
                    list.add(new int[]{i, j});
                    list.add(new int[]{i + 1, j});
                    i++;
                } else if (a[j - 1] == 0) {
                    r_s = r_s + a[j - 1];
                    l_s = l_s + a[i + 1];
                }
                i++;
                j--;
            }
        }
        if (Math.abs(i - j) == 1) {
            return new int[]{i, j};//fulcrum is found
        } else {
            return new int[]{-1, -1};//no fulcrum is found
        }
    }
}
