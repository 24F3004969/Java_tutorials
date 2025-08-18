package org.java_tutorials.icse.class9th;

import java.util.Scanner;

/*
78954
 */
public class Digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        if (num > 10000 && num <= 99999) {
            System.out.println((num%1000)/100);
        }
    }
}
