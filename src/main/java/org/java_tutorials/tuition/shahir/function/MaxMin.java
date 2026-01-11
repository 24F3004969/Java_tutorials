package org.java_tutorials.tuition.shahir.function;

public class MaxMin {
    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    int min(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        MaxMin mm = new MaxMin();
        int mx = mm.max(3, 5);
        System.out.println(mx);
    }
}
