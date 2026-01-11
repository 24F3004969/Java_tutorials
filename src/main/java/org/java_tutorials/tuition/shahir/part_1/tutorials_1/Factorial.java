package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
13. Write a program to input a number and find its factorial
Eg: Input: 5 Output: 120
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int f=1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        System.out.println("factorial  :"+f);
    }
}
