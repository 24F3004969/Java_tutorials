package org.java_tutorials.tuition.shahir.part_1.class8;

import java.util.*;

public class Max10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mx = in.nextInt();
        int n;
        for (int i = 1; i <= 9; i++) {
            n = in.nextInt();
            mx = Math.max(mx, n);
        }
        System.out.println(mx);
    }
}
