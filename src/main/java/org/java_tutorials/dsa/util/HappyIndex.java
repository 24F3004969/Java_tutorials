package org.java_tutorials.dsa.util;


public class HappyIndex {
    public static void main(String... a) {
       int []b={5,10,12,4,3,5,15};
        System.out.println(happy_index(b));
    }

    static int happy_index(int[] a) {
        int s1 = 0, s2 = 0;
        for (int i = 0; i < a.length; i++) {
            s1 = s1 + a[i];
        }
        if (s1 % 2 != 0)
            return -1;
        else {
            for (int i = 0; i < a.length; i++) {
                s2=s2+a[i];
                if(s2==s1/2)
                    return i;
            }
            return -1;
        }
    }
}