package org.java_tutorials.tuition.shahir.part_1.classX;

public class MaxMin {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(a, max(b, c));
    }

    public double max(double a, double b) {
        return a > b ? a : b;
    }

    public int max(int... a) {
        int max = a[0];
        for (int j : a) {
            max = Math.max(j, max);
        }
        return max;
    }

    public static void main(String[] args) {
        MaxMin mx = new MaxMin();
        System.out.println(mx.max(5, 7, 12,45,576,454,4546,98,454));
    }
}
