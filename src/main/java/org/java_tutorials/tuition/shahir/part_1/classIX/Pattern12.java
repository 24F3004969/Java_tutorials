package org.java_tutorials.tuition.shahir.part_1.classIX;

public class Pattern12 {
    public static void main(String[] args) {
        for (int n = 0; n <= 5; n++) {
            int c = 1, p = 1;
            for (int i = 1; i <= 5 - n; i++) {
                System.out.print(" ");
            }
            System.out.print(p + " ");
            for (int i = 0; i < n; i++) {
                p = p * (n - i);
                System.out.print((p / c) + " ");
                c = c * (i + 2);
            }
            System.out.println();
        }
    }
}
