package org.java_tutorials.tuition.shahir.part_1.tutorials_1;

import java.util.Scanner;

/*
Question 6
Create a class to accept a number and print first and last digit of the given number.
Input – 6439 Output- First digit: 6 Last digit: 9
 */
public class FirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int last =(n%10);
        while(n>9){
            n=n/10;
        }
        System.out.println("First number "+n);
        System.out.println("Last number  "+ last);
    }
}
