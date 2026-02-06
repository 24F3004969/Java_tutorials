package org.java_tutorials.tuition.shahir.loop;

public class Loop {
    public static void main(String[] args) {
        int i = 1;
        for (int j = 1; j <= 5; j++) {
            for (i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
