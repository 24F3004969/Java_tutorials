package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.*;

public class Students40 {
    public static void main(String[] args) {
        int i;
        int n;
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 1; i <= n; i++) {
            if (i * (i + 1) == n) {
                System.out.println("Pronic number");
            }
        }

    }
}
