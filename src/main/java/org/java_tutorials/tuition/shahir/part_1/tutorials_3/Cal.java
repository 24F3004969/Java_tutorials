package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

public class Cal {
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public void average(int a, int b, int c) {
        int sum = sum(a, b, c);
        int av = sum / 3;
        System.out.println("The average is = " + av);
    }

    public static void main(String[] args) {
        Cal c = new Cal();
        int s = c.sum(9, 6, 12);
        System.out.println(s);
        c.average(9, 6, 12);
    }
}
