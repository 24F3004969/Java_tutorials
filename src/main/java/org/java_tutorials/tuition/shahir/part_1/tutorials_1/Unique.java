package org.java_tutorials.tuition.shahir.part_1.tutorials_1;/*
5. Write a program to input a positive three digit number and check if all the
digits are different from each other then print the message “unique
number” else print “NOT a unique number”.
For example:
Sample input: 102
Sample output: unique number
 */
import java.util.Scanner;

public class Unique
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int a = in.nextInt();
        int l=a%10;
        int m=(a/10)%10;
        int f=a/100;
        if(f != l && f != m && m != l)
            System.out.println("unique number");
        else
            System.out.println("not unique number");

    }
}
