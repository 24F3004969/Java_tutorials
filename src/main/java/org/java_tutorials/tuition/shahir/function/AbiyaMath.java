package org.java_tutorials.tuition.shahir.function;

public class AbiyaMath {
    static int max(int... a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static int min(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        int x = AbiyaMath.max(2, 3, 5, 9,7,9,6,9,0);
        System.out.println(x);
    }
}
