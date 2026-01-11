package org.java_tutorials.tuition.shahir.class9th;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //153 = 1^3 + 5^3+ 3^3
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int rev = 0;
        int i = n;
        while (i > 0) {
            int d = i % 10;
            rev = rev * 10 + d;
            i = i / 10;
        }
        if (rev == n)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome number");
    }
}
