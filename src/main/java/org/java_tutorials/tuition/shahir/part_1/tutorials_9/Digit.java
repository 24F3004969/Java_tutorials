package org.java_tutorials.tuition.shahir.part_1.tutorials_9;

import java.util.Scanner;

/*
Write a program to input a number and check if all the digits in it are odd
digits then print "All digits are odd" else print the message "Combination
of odd and even digits". If the input number is not of three digits then
print the message "Not a three digit number".
 */
public class Digit
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int a=in.nextInt();
        int l=a%10;
        a=a/10;
        int s=a%10;
        int f=a/10;
        if (a>=100 && a<=999){
        if (l%2==0 && s%2==0 && f%2==0)
            System.out.println("All digits are odd");
        else System.out.println("Combination of odd and even digits");
        }
        else System.out.println("Not a three digit number");

    }
}
