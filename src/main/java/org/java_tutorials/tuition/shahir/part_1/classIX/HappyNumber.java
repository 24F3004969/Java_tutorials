package org.java_tutorials.tuition.shahir.part_1.classIX;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,s=0;
        System.out.println("Enter a number");
        n = in.nextInt();
        while (n != 1) {
            while (n > 0) {
                r = n % 10;
                s = s + r * r;
                n = n / 10;
            }
            n = s;
            s=0;
        }
        System.out.println("Number is happy");
    }
}
