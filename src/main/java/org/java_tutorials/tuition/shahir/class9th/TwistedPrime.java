package org.java_tutorials.tuition.shahir.class9th;

import java.util.Scanner;

public class TwistedPrime {

    /*
    121 not twisted prime number
        -> Number should be palindrome
        ->Number should be prime
    161=> Twisted prime.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                c = c + 1;
            }
        }
        if (c == 2) {
            int rev = 0;
            for (int i = n; i > 0; i = i / 10) {
                int r = i % 10;
                rev = rev * 10 + r;
            }
            if (rev == n) {
                System.out.println(n + " is a twisted prime number");
            } else {
                System.out.println(n + " is not a twisted prime number");
            }
        } else {
            System.out.println(n + " is not a twisted prime number");
        }
    }
}
