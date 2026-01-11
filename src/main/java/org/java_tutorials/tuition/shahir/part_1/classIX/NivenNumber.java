package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        int n, r, s = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();
        int t = n;
        while (n > 0) {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        if (t % s == 0)
            System.out.println("Niven number");
        else System.out.println("Not Niven number");
    }
}
